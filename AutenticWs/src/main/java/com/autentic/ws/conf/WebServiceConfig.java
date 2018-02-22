package com.autentic.ws.conf;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import com.autentic.core.conf.AutenticCoreConf;
import com.autentic.persistence.conf.PersistenceConf;

@EnableWs
@Configuration
@ComponentScan("com.autentic.ws.endpoint")
@Import({ AutenticCoreConf.class, PersistenceConf.class}) 

public class WebServiceConfig extends WsConfigurerAdapter{
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/AutenticWS/*");
	}
	
	@Bean(name = "Autentic")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema authSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("AutenticPort");
		wsdl11Definition.setLocationUri("/AutenticWS");
		wsdl11Definition.setTargetNamespace("http://ws.autentic.com/AutenticWS");
		wsdl11Definition.setSchema(authSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema authSchema() {
		return new SimpleXsdSchema(new ClassPathResource("Autentic.xsd"));
	}

}
