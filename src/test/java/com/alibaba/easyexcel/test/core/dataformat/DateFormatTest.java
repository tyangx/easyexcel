package com.alibaba.easyexcel.test.core.dataformat;

import java.io.File;
import java.util.List;
import java.util.Locale;

import com.alibaba.easyexcel.test.util.TestFileUtil;
import com.alibaba.excel.EasyExcel;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @author Jiaju Zhuang
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateFormatTest {

    private static File file07;
    private static File file03;

    @BeforeClass
    public static void init() {
        file07 = TestFileUtil.readFile("dataformat" + File.separator + "dataformat.xlsx");
        file03 = TestFileUtil.readFile("dataformat" + File.separator + "dataformat.xls");
    }

    @Test
    public void t01Read07() {
        readCn(file07);
        readUs(file07);
    }

    @Test
    public void t02Read03() {
        readCn(file03);
        readUs(file03);
    }

    private void readCn(File file) {
        List<DateFormatData> list =
            EasyExcel.read(file, DateFormatData.class, null).locale(Locale.CHINA).sheet().doReadSync();
        for (DateFormatData data : list) {
            Assert.assertEquals(data.getDateStringCn(), data.getDate());
            Assert.assertEquals(data.getNumberStringCn(), data.getNumber());
        }
    }

    private void readUs(File file) {
        List<DateFormatData> list =
            EasyExcel.read(file, DateFormatData.class, null).locale(Locale.US).sheet().doReadSync();
        for (DateFormatData data : list) {
            Assert.assertEquals(data.getDateStringUs(), data.getDate());
            Assert.assertEquals(data.getNumberStringUs(), data.getNumber());
        }
    }
}
