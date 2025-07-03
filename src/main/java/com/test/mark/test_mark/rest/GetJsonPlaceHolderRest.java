package com.test.mark.test_mark.rest;

import com.test.mark.test_mark.dto.integration.PlaceHolderIntegrationResponseDto;
import com.test.mark.test_mark.services.GetJsonPlaceHolderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v.1.0")
public class GetJsonPlaceHolderRest {

    @Autowired
    GetJsonPlaceHolderService getJsonPlaceHolderService;

    @GetMapping("/get-json-place-holder")
    public List<PlaceHolderIntegrationResponseDto> getJsonPlaceHolder(@RequestParam(name = "size") Integer size) {
        return getJsonPlaceHolderService.getJsonPlaceHolder(size);
    }

}
