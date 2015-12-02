package org.mybatis.generator.config;

import java.util.List;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

public class SelectSql {

	/**
	 * method name
	 */
	private String name;

	/**
	 * sql
	 */
	private String sql;

	/**
	 * return type(map|object)
	 */
	private String returnType;

	public SelectSql(String name, String sql, String returnType) {
		this.name = name;
		this.sql = sql;
		this.returnType = returnType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	@Override
	public String toString() {
		return "SelectSql{" +
				"returnType='" + returnType + '\'' +
				", sql='" + sql + '\'' +
				", name='" + name + '\'' +
				'}';
	}

	public void validate(List<String> errors, String tableName) {
		if (!stringHasValue(sql)) {
			errors.add(getString("ValidationError.22", //$NON-NLS-1$
					tableName));
		}
	}
}
