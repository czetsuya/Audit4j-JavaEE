package com.broodcamp.audit4j;

import org.audit4j.core.MetaData;

public class AuditMetaData implements MetaData {

	@Override
	public String getOrigin() {
		return "localhost";
	}

	@Override
	public String getActor() {
		return "edward";
	}
}
