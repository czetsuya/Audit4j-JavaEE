package com.broodcamp.audit4j;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.audit4j.core.AuditManager;
import org.audit4j.core.annotation.Audit;

@Audit
@Interceptor
public class AuditInterceptor {

	/**
	 * Before method invocation.
	 * 
	 * @param joinPoint
	 *            the join point
	 * @return the object
	 * @throws Throwable
	 *             the throwable
	 */
	@AroundInvoke
	public Object before(InvocationContext joinPoint) throws Throwable {
		AuditManager.getInstance().audit(joinPoint.getTarget().getClass(), joinPoint.getMethod(),
				joinPoint.getParameters());
		return joinPoint.proceed();
	}
}
