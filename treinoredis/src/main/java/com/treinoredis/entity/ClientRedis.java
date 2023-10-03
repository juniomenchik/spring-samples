package com.treinoredis.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash("clientRedis")
public class ClientRedis implements Serializable {
    @Id
    @Indexed
    private Long id;
    private String name;
    private String email;
    private String cpf;
}
