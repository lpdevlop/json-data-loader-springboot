package com.jsondataloaderspringboot.jsondataloaderspringboot.initdataloader;

import com.jsondataloaderspringboot.jsondataloaderspringboot.dto.TestDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
public class PlaceHolderModels  {


    private List<TestDTO> testDTOs;


}
