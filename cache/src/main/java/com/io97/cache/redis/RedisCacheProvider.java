package com.io97.cache.redis;

import com.io97.cache.CacheKey;
import com.io97.cache.CacheProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheProvider implements CacheProvider {

    @Autowired
    private RedisCacheRepository redisCacheRepository;

    @Autowired
    private RedisCacheNodesRepository redisCacheNodesRepository;

    @Override
    public void put(CacheKey key, Object obj) {
        redisCacheRepository.put(key.getCacheKey(), obj);
    }

    @Override
    public Object get(CacheKey key) {
        return redisCacheRepository.get(key.getCacheKey());
    }

    @Override
    public boolean remove(CacheKey key) {
        return redisCacheRepository.remove(key.getCacheKey());
    }

    @Override
    public boolean removeMatch(CacheKey key) {
        redisCacheNodesRepository.removeMatch(key.getCacheKey() + "*");
        return true;
    }
}
