package com.alibaba.easyexcel.test.demo.excel;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
public class RuleData {
    private String rule;
    /**
     * 忽略这个字段
     */
    @ExcelIgnore
    private String ignore;
}
