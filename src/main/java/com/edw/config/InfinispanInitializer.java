package com.edw.config;

import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.impl.query.RemoteQuery;
import org.infinispan.commons.configuration.XMLStringConfiguration;
import org.infinispan.query.remote.client.ProtobufMetadataManagerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * <pre>
 *  com.edw.config.InfinispanInitializer
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 22 Feb 2025 16:21
 */
@Component
public class InfinispanInitializer implements CommandLineRunner {

    private RemoteCacheManager cacheManager;

    @Autowired
    public InfinispanInitializer (RemoteCacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @Override
    public void run(String...args) throws Exception {
        Path proto = Paths.get(RemoteQuery.class.getClassLoader()
                .getResource("proto/Employee.proto").toURI());
        String protoBufCacheName = ProtobufMetadataManagerConstants.PROTOBUF_METADATA_CACHE_NAME;
        cacheManager.getCache(protoBufCacheName).put("Employee.proto", Files.readString(proto));
        cacheManager.administration().getOrCreateCache("employee",
                new XMLStringConfiguration("<?xml version=\"1.0\"?>\n" +
                        "<replicated-cache name=\"GEN_MD_SID_MAPPING\" mode=\"SYNC\" remote-timeout=\"600000\" statistics=\"true\">\n" +
                            "<encoding media-type=\"application/x-protostream\"/>\n" +
                            "<locking concurrency-level=\"25000\" isolation=\"READ_COMMITTED\" acquire-timeout=\"3000000\" striping=\"false\"/>\n" +
                            "<transaction mode=\"NONE\" auto-commit=\"true\" stop-timeout=\"30000\" locking=\"OPTIMISTIC\" reaper-interval=\"30000\" complete-timeout=\"30000\" notifications=\"true\"/>\n" +
                            "<query default-max-results=\"2147483647\"/>\n" +
                            "<indexing enabled=\"true\" storage=\"filesystem\" path=\"GEN_MD_SID_MAPPING\">\n" +
                                "<indexed-entities>\n" +
                                    "<indexed-entity>proto.GenMdSidMappingEntity</indexed-entity>\n" +
                                "</indexed-entities>\n" +
                            "</indexing>\n" +
                            "<state-transfer timeout=\"600000\" chunk-size=\"500\" await-initial-transfer=\"true\"/>\n" +
                            "<partition-handling when-split=\"ALLOW_READS\" merge-policy=\"NONE\"/>\n" +
                        "</replicated-cache>"));
    }
}
