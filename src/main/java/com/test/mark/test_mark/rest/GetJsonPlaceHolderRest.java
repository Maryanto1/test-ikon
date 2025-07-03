package com.test.mark.test_mark.rest;

import com.test.mark.test_mark.dto.PlaceHolderResponseDto;
import com.test.mark.test_mark.dto.base.PaginateResponse;
import com.test.mark.test_mark.services.GetJsonPlaceHolderService;
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
    public PaginateResponse<PlaceHolderResponseDto> getJsonPlaceHolder(
            @RequestParam(name = "page") Integer page,
            @RequestParam(name = "size") Integer size) {
        return getJsonPlaceHolderService.getJsonPlaceHolder(page, size);
    }

}
