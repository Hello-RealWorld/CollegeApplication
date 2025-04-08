package com.kaixuan.collegeapplicationfillingportal.pojo.entity;

//学院与专业的关联关系；当学院下没有院系时，学院直接与专业关联
public class CollegeMajor extends Major{
    private String collegeCode;
    private String majorCode;
}
