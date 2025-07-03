package com.test.mark.test_mark.util;

import com.test.mark.test_mark.constant.MessageConstant;
import com.test.mark.test_mark.dto.base.BaseResponseDto;

public class ResponseUtil {

    public static void success(BaseResponseDto responseDto) {
        responseDto.setResponseCode(MessageConstant.DEFAULT_SUCCESS_ERROR_CODE);
        responseDto.setResponseMessage(MessageConstant.DEFAULT_SUCCESS_MESSAGE);
    }

}
