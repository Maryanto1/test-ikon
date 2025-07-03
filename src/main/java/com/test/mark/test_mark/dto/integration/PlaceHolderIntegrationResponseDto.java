package com.test.mark.test_mark.dto.integration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaceHolderIntegrationResponseDto implements Serializable {

    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}
