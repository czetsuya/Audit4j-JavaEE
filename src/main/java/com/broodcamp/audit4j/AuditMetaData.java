package com.broodcamp.audit4j;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.audit4j.core.MetaData;

public class AuditMetaData implements MetaData {

	@Context
	private HttpServletRequest httpRequest;

	@Override
	public String getOrigin() {
		try {
			return getClientIp(httpRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "unidentified";
	}

	@Override
	public String getActor() {
		return "edward";
	}

	private static String getClientIp(HttpServletRequest request) {

		String remoteAddr = "";

		if (request != null) {
			remoteAddr = request.getHeader("X-FORWARDED-FOR");
			if (remoteAddr == null || "".equals(remoteAddr)) {
				remoteAddr = request.getRemoteAddr();
			}
		}

		return remoteAddr;
	}
}
