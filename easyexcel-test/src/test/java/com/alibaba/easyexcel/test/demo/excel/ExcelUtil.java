package com.alibaba.easyexcel.test.demo.excel;

import com.alibaba.easyexcel.test.demo.write.WriteTest;
import com.alibaba.excel.util.ListUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExcelUtil {
    @Test
    public void method() {
        String allSlotId = ReadText.ReadTxt("/Users/xietongyang/Desktop/allSlotId.text");
        String allInfo = ReadText.ReadTxt("/Users/xietongyang/Desktop/allInfo.text");
        WriteTest.simpleWrite(getDataLis(allSlotId,allInfo));

    }

    private List<BusinessSlotData> getDataLis(String allSlotId,String allInfo) {
        List<BusinessSlotData> list = ListUtils.newArrayList();
        String[] idList = allSlotId.split(",");
        List<String> infoList = Arrays.asList(allInfo.split("&"));
        for (String id : idList) {
            String rule = infoList.stream().filter(infoStr->infoStr.contains(id)).collect(Collectors.joining("---"));
            BusinessSlotData data = new BusinessSlotData();
            data.setSlotId(id);
            data.setRule(rule);
            list.add(data);
        }
        return list;
    }
}
