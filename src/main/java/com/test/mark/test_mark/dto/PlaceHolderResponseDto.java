package com.test.mark.test_mark.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaceHolderResponseDto implements Serializable {

        private Integer userId;
        private Integer id;
}
