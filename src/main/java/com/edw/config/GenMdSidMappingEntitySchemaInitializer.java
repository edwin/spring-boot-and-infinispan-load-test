package com.edw.config;

import com.edw.bean.GenMdSidMappingEntity;
import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.ProtoSchema;

/**
 * <pre>
 *  com.edw.config.GenMdSidMappingEntitySchemaInitializer
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 22 Feb 2025 16:28
 */
@ProtoSchema(
        includeClasses = {
                GenMdSidMappingEntity.class
        },
        schemaFileName = "GenMdSidMappingEntity.proto",
        schemaFilePath = "proto/",
        schemaPackageName = "proto")
public interface GenMdSidMappingEntitySchemaInitializer extends SerializationContextInitializer {
}
