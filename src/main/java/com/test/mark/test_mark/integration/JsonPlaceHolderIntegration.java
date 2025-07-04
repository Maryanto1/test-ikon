package com.test.mark.test_mark.integration;

import com.test.mark.test_mark.dto.integration.PlaceHolderIntegrationResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "jplaceholder", url = "https://jsonplaceholder.typicode.com")
public interface JsonPlaceHolderIntegration {

    @GetMapping("/posts")
    List<PlaceHolderIntegrationResponseDto> getPlaceHolder();
}
