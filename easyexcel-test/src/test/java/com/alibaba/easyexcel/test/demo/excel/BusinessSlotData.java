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
public class BusinessSlotData {
    @ExcelProperty("广告位ID")
    private String slotId;
    @ExcelProperty("业务映射规则")
    private String rule;
    /**
     * 忽略这个字段
     */
    @ExcelIgnore
    private String ignore;
}
