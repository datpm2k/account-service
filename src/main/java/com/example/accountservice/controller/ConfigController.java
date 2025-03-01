package com.example.accountservice.controller;

import com.example.accountservice.config.AppProperties;
import com.example.accountservice.helper.IResponseFactory;
import com.example.accountservice.model.BaseResponse;
import com.example.accountservice.model.ConfigInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/configs")
public class ConfigController {

    private final IResponseFactory iResponseFactory;
    private final AppProperties appProperties;
    private final Environment environment;

    @GetMapping
    public ResponseEntity<BaseResponse<ConfigInfo>> getConfig() {
        return iResponseFactory.success(
                new ConfigInfo(
                        Arrays.toString(environment.getActiveProfiles()),
                        appProperties.getSecret()
                )
        );
    }
}
