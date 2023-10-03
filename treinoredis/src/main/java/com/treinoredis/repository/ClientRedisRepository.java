package com.treinoredis.repository;

import com.treinoredis.entity.ClientRedis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRedisRepository extends CrudRepository<ClientRedis, Long> {
}
