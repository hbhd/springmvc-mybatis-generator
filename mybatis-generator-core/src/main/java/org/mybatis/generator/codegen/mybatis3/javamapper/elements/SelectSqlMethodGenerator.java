package org.mybatis.generator.codegen.mybatis3.javamapper.elements;

import java.util.Set;
import java.util.TreeSet;

import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.config.SelectSql;

public class SelectSqlMethodGenerator extends AbstractJavaMapperMethodGenerator {
	private SelectSql selectSql;

	public SelectSqlMethodGenerator(SelectSql selectSql) {
		this.selectSql = selectSql;
	}

	@Override
	public void addInterfaceElements(Interface interfaze) {
		Set<FullyQualifiedJavaType> importedTypes = new TreeSet<FullyQualifiedJavaType>();
		importedTypes.add(FullyQualifiedJavaType.getNewListInstance());
		Method method = new Method();
		method.setVisibility(JavaVisibility.PUBLIC);
		FullyQualifiedJavaType returnType = FullyQualifiedJavaType.getNewListInstance();
		FullyQualifiedJavaType mapType=FullyQualifiedJavaType.getNewMapInstance();
		importedTypes.add(mapType);
		mapType.addTypeArgument(FullyQualifiedJavaType.getStringInstance());
		mapType.addTypeArgument(FullyQualifiedJavaType.getObjectInstance());
		returnType.addTypeArgument(mapType);
		method.setReturnType(returnType);
		method.setName(selectSql.getName());
//		method.addParameter(new Parameter(parameterType, "record")); //$NON-NLS-1$

		context.getCommentGenerator().addGeneralMethodComment(method,
				introspectedTable);

		addInterfaceElements(interfaze, method);
		interfaze.addMethod(method);
		interfaze.addImportedTypes(importedTypes);
	}

	public void addInterfaceElements(Interface interfaze, Method method){
		return;
	}
}
