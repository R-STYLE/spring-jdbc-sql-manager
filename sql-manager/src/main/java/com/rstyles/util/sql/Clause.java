package com.rstyles.util.sql;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlMixed;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Clause {

	private String ifCondition;
	private List<String> contexts = new ArrayList<>();

	@XmlAttribute(name = "if")
	public String getIfCondition() {
		return ifCondition;
	}

	public void setIfCondition(String ifCondition) {
		this.ifCondition = ifCondition;
	}

	@XmlMixed
	public List<String> getContexts() {
		return contexts;
	}

	public void setContexts(List<String> contexts) {
		this.contexts = contexts;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
