package com.autentic.persistence.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DatabaseConfiguration.class})
@ComponentScan(basePackages = {"com.autentic.persistence.dao","com.autentic.persistence.facade.impl", "org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy"})

public class PersistenceConf {

}



