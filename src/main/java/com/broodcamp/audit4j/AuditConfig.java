package com.broodcamp.audit4j;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.audit4j.core.AuditManager;
import org.audit4j.core.dto.EventBuilder;

@Startup
@Singleton
public class AuditConfig {

//	@PostConstruct
//	public void init() {
//		System.out.println("audit init");
//		// ContextConfigurations contextConfigurations = new
//		// ContextConfigurations();
//		// contextConfigurations.init();
//		AuditManager.getInstance().audit(new EventBuilder().addAction("addInventoryItem")
//				.addField("itemName", "var").addField("itemValue", "value").build());
//	}

	// @PreDestroy
	// public void destroy() {
	// System.out.println("audit destroy");
	// AuditManager.shutdown();
	// }

	// If you want to load configurations from file
	// (resources/audit4j.conf.yaml),
	// comment below method
	// @Bean
	// public DatabaseAuditHandler databaseHandler() {
	// DatabaseAuditHandler dbHandler = new DatabaseAuditHandler();
	// dbHandler.setEmbedded("true");
	// return dbHandler;
	// }

	// If you want to load configurations from file
	// (resources/audit4j.conf.yaml),
	// comment below method
	// @Bean
	// public SpringAudit4jConfig springAudit4jConfig() {
	// SpringAudit4jConfig springAudit4jConfig = new SpringAudit4jConfig();
	// springAudit4jConfig.setLayout(new SimpleLayout());
	// List<Handler> handlers = new ArrayList<Handler>();
	// handlers.add(new ConsoleAuditHandler());
	//
	// handlers.add(databaseHandler());
	// springAudit4jConfig.setHandlers(handlers);
	// springAudit4jConfig.setMetaData(new AuditMetaData());
	// return springAudit4jConfig;
	// }

}
