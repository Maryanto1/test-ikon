package com.test.mark.test_mark.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaceHolderResponseDto  implements Serializable {

    private List<DataResponse> dataResponses;

    @Data
    public class DataResponse {
        public Integer userId;
        public Integer id;
    }
}
