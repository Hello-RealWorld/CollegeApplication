package com.kaixuan.collegeapplicationfillingportal.pojo.entity;

//学科门类：理工农医、文史哲法、艺经管教、军事学、交叉学科
enum CategoryOfDiscipline {
    PHILOSOPHY("1", "哲学类", "01"),
    ECONOMICS("2", "经济学类", "02"),
    LAW("3", "法学类", "03"),
    EDUCATION("4", "教育学类", "04"),
    LITERATURE("5", "文学类", "05"),
    HISTORY("6", "历史学类", "06"),
    NATURE_SCIENCE("7", "理学类", "07"),
    ENGINEERING("8", "工学类", "08"),
    AGRICULTURE("9", "农学类", "09"),
    MEDICINE("10", "医学类", "10"),
    MILITARY("11", "军事学类", "11"),
    MANAGEMENT_SCIENCE("12", "管理学类", "12"),
    ART("13", "艺术学类", "13"),
    INTERDISCIPLINARY("14", "交叉学科", "14");


    //学科门类名称
    private final String name;
    //学科门类编码
    private final String code;
    //学科门类描述
    private final String description;

    private CategoryOfDiscipline( String name, String code, String description) {

        this.name = name;
        this.code = code;
        this.description = description;
    }




}
