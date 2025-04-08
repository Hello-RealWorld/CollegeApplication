package com.kaixuan.collegeapplicationfillingportal.pojo.entity;


//区分University、College、Department、Major,分别对应大学、学院、院系、专业四个层级，尤其对于综合性大学
public class University {
    private String UniversityCode;
    private String UniversityName;
    //学校级别：985、211、一流高校
    private String UniversityLevel;
    //是否包含校区
    private boolean haveCampusOrNot;
}
