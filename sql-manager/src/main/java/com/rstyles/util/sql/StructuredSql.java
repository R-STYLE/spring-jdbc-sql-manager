package com.rstyles.util.sql;

import java.util.Map;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sql")
public class StructuredSql extends Sql {

	private IStatement statement;

	@XmlElementRefs({
			@XmlElementRef(name = "insert", type = Insert.class),
			@XmlElementRef(name = "select", type = Select.class),
			@XmlElementRef(name = "update", type = Update.class),
			@XmlElementRef(name = "delete", type = Delete.class)
	})
	public IStatement getStatement() {
		return statement;
	}

	public void setStatement(IStatement statement) {
		this.statement = statement;
	}

	@Override
	public String convert(SqlGenerator generator, Map<String, Object> params) {
		return this.statement.convert(generator, params);
	}

}
