package com.alibaba.easyexcel.test.demo.excel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadText {
    public static String ReadTxt(String fileName) {
        StringBuilder sb = new StringBuilder("");
        try {
            File file = new File(fileName);

            FileInputStream readIn = new FileInputStream(file);
            InputStreamReader read = new InputStreamReader(readIn, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(read);
            String oneLine;
            while ((oneLine = bufferedReader.readLine()) != null) {
                sb.append(oneLine);
            }
            read.close();
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();

        }
        return sb.toString();
    }
}
