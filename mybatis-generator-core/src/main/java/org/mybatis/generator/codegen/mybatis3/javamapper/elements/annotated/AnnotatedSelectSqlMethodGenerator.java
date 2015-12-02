package org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.SelectSqlMethodGenerator;
import org.mybatis.generator.config.SelectSql;

import static org.mybatis.generator.api.dom.OutputUtilities.javaIndent;

public class AnnotatedSelectSqlMethodGenerator extends SelectSqlMethodGenerator {

	private SelectSql selectSql;

	public AnnotatedSelectSqlMethodGenerator(SelectSql selectSql) {
		super(selectSql);
		this.selectSql = selectSql;
	}

	@Override
	public void addInterfaceElements(Interface interfaze, Method method) {

		interfaze.addImportedType(new FullyQualifiedJavaType("org.apache.ibatis.annotations.Select")); //$NON-NLS-1$

		StringBuilder sb = new StringBuilder();
		method.addAnnotation("@Select({"); //$NON-NLS-1$
		javaIndent(sb, 1);
		sb.append("\"").append(selectSql.getSql()).append("\",");
		method.addAnnotation(sb.toString());
		method.addAnnotation("})"); //$NON-NLS-1$

	}

//	private void addResultMapAnnotation(Interface interfaze, Method method) {
//		interfaze.addImportedType(new FullyQualifiedJavaType("org.apache.ibatis.annotations.ResultMap")); //$NON-NLS-1$
//
//		String annotation = String.format("@ResultMap()");
//		method.addAnnotation(annotation);
//	}
}
