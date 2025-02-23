package com.edw.helper;

import com.edw.bean.GenMdSidMappingEntity;
import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.Search;
import org.infinispan.query.dsl.Query;
import org.infinispan.query.dsl.QueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void save(GenMdSidMappingEntity genMdSidMappingEntity) {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_SID_MAPPING");
        cache.put(genMdSidMappingEntity.getMappingId(), genMdSidMappingEntity);
    }

    public List<GenMdSidMappingEntity> get(String tradingId) {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_SID_MAPPING");
        QueryFactory queryFactory = Search.getQueryFactory(cache);
        Query<GenMdSidMappingEntity> query = queryFactory.create("from proto.GenMdSidMappingEntity where tradingId = :param1");
        query.setParameter("param1", tradingId);
        return query.execute().list();
    }
}
