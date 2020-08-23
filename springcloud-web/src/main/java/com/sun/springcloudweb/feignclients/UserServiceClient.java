package com.sun.springcloudweb.feignclients;

import com.sun.springclouduserapi.api.IUserService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("user-service")
public interface UserServiceClient extends IUserService {
}
