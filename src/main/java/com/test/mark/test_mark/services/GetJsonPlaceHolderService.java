package com.test.mark.test_mark.services;

import com.test.mark.test_mark.constant.MessageConstant;
import com.test.mark.test_mark.dto.PlaceHolderResponseDto;
import com.test.mark.test_mark.dto.base.PaginateResponse;
import com.test.mark.test_mark.exception.ProcessException;
import com.test.mark.test_mark.integration.JsonPlaceHolderIntegration;
import com.test.mark.test_mark.util.ResponseUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class GetJsonPlaceHolderService {

    private final JsonPlaceHolderIntegration jsonPlaceHolderIntegration;
    private final PaginatePlaceHolderService paginatePlaceHolderService;

    public PaginateResponse<PlaceHolderResponseDto> getJsonPlaceHolder(Integer page, Integer size) {

        if (page == null && size == null) {
            throw new ProcessException(MessageConstant.EMPTY_PARAM, MessageConstant.INVALID_PARAM);
        }

        if (size > MessageConstant.DEFAULT_MAX_GET_DATA) {
            throw new ProcessException(MessageConstant.EXCEED_GET_DATA, MessageConstant.EXCEED_GET_DATA_MESSAGE);
        }

        var response = jsonPlaceHolderIntegration.getPlaceHolder();
        var responsePaginated = paginatePlaceHolderService.getPaginate(page, size, response);
        ResponseUtil.success(responsePaginated);

        return responsePaginated;
    }


}
