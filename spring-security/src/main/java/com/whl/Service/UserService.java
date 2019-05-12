package com.whl.Service;

import com.whl.entity.SysUser;
import org.springframework.cache.annotation.Cacheable;

public interface UserService {
    @Cacheable(cacheNames = "authority", key = "#username")
    SysUser getUserByName(String username);
}
