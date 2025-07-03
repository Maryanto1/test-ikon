package com.test.mark.test_mark.dto.base;

import lombok.Data;

import java.util.List;

@Data
public class PaginateResponse<T> extends BaseResponseDto{
    private List<T> content;
    private int page;
    private int size;
    private long totalElements;
    private int totalPages;
}
