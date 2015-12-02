package org.mybatis.generator.codegen.mybatis3.javamapper.elements;

import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.config.SelectSql;

public class SelectSqlMethodGenerator extends AbstractJavaMapperMethodGenerator {
	private SelectSql selectSql;

	public SelectSqlMethodGenerator(SelectSql selectSql) {
		this.selectSql = selectSql;
	}

	@Override
	public void addInterfaceElements(Interface interfaze) {
		Method method = new Method();
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(FullyQualifiedJavaType.getIntInstance());
		method.setName(selectSql.getName());
//		method.addParameter(new Parameter(parameterType, "record")); //$NON-NLS-1$

		context.getCommentGenerator().addGeneralMethodComment(method,
				introspectedTable);

		addInterfaceElements(interfaze, method);
		interfaze.addMethod(method);
	}

	public void addInterfaceElements(Interface interfaze, Method method){
		return;
	}
}
