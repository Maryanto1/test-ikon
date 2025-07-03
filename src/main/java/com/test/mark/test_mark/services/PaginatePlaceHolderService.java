package com.test.mark.test_mark.services;

import com.test.mark.test_mark.dto.PlaceHolderResponseDto;
import com.test.mark.test_mark.dto.base.PaginateResponse;
import com.test.mark.test_mark.dto.integration.PlaceHolderIntegrationResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaginatePlaceHolderService {

    public PaginateResponse<PlaceHolderResponseDto> getPaginate(Integer page, Integer size, List<PlaceHolderIntegrationResponseDto> data) {

        int totalElements = data.size();
        int fromIndex = Math.min(page * size, totalElements);
        int toIndex = Math.min(fromIndex + size, totalElements);
        List<PlaceHolderIntegrationResponseDto> pagedPosts = data.subList(fromIndex, toIndex);
        var mapPagedPost = mapData(pagedPosts);

        PaginateResponse<PlaceHolderResponseDto> response = new PaginateResponse<>();
        response.setContent(mapPagedPost);
        response.setPage(page);
        response.setSize(size);
        response.setTotalElements(totalElements);
        response.setTotalPages((int) Math.ceil((double) totalElements / size));

        return response;
    }

    private List<PlaceHolderResponseDto> mapData(List<PlaceHolderIntegrationResponseDto> data) {
        List<PlaceHolderResponseDto> result = new ArrayList<>();
        for (PlaceHolderIntegrationResponseDto dataItem : data) {
            PlaceHolderResponseDto placeHolderResponseDto = new PlaceHolderResponseDto();
            placeHolderResponseDto.setId(dataItem.getId());
            placeHolderResponseDto.setUserId(dataItem.getUserId());
            result.add(placeHolderResponseDto);
        }

        return result;
    }

}
