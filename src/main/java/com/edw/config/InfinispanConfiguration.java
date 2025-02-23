package com.edw.config;

import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.ClientIntelligence;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;
import org.infinispan.commons.marshall.ProtoStreamMarshaller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 *  com.edw.config.InfinispanConfiguration
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 22 Feb 2025 16:20
 */
@Configuration
public class InfinispanConfiguration {

    @Bean
    public RemoteCacheManager remoteCacheManager() {
        return new RemoteCacheManager(
                new ConfigurationBuilder()
                        .addServers("localhost:11222")
                        .security().authentication().username("admin").password("password")
                        .clientIntelligence(ClientIntelligence.BASIC)
                        .marshaller(new ProtoStreamMarshaller())
                        .addContextInitializer(new GenMdSidMappingEntitySchemaInitializerImpl())
                        .build());
    }

}
