package com.kaixuan.collegeapplicationfillingportal.pojo.po;

import com.kaixuan.collegeapplicationfillingportal.pojo.entity.Major;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MajorPO extends Major {
    //专业id
    private String majorId;

    

}
