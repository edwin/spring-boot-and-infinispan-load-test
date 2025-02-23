package com.edw.helper;

import com.edw.bean.GenMdSidMappingEntity;
import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <pre>
 *  com.edw.helper.CacheHelper
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 22 Feb 2025 16:20
 */
@Service
public class CacheHelper {

    private RemoteCacheManager remoteCacheManager;

    @Autowired
    public CacheHelper(RemoteCacheManager remoteCacheManager) {
        this.remoteCacheManager = remoteCacheManager;
    }

    public void save(GenMdSidMappingEntity genMdSidMappingEntity) throws Exception {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_SID_MAPPING");
        cache.put(genMdSidMappingEntity.getMappingId(), genMdSidMappingEntity);
    }

    public GenMdSidMappingEntity get(Long id) throws Exception {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_SID_MAPPING");
        return (GenMdSidMappingEntity) cache.get(id);
    }
}
