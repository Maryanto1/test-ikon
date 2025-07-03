package com.test.mark.test_mark.services;

import com.test.mark.test_mark.dto.PlaceHolderResponseDto;
import com.test.mark.test_mark.dto.integration.PlaceHolderIntegrationResponseDto;
import com.test.mark.test_mark.exception.ForbiddenRequestException;
import com.test.mark.test_mark.integration.JsonPlaceHolderIntegration;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class GetJsonPlaceHolderService {

    @Autowired
    JsonPlaceHolderIntegration jsonPlaceHolderIntegration;

    public List<PlaceHolderIntegrationResponseDto> getJsonPlaceHolder(Integer size) {

        if (size > 30) {
            //todo
        }

        var response = jsonPlaceHolderIntegration.getPlaceHolder();
        return response;
    }

}
