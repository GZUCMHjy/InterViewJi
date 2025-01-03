package com.louis.interViewJi.es;

import com.louis.interViewJi.esdao.QuestionEsDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author louis
 * @version 1.0
 * @date 2024/10/27 13:31
 */
@SpringBootTest
class QuestionEsDaoTest {

    @Resource
    private QuestionEsDao questionEsDao;

    @Test
    void findByUserId() {
        questionEsDao.findByUserId(1L);
    }

    public static void main(String[] args){
        jscienceTest();
    }
    private static void jscienceTest(){
        int a = 18;
        int b = 23;
        try {
            // 执行python脚本，进行传参
            // 运行含参函数，打印返回值
            String[] args = new String[] { "python", "F:\\Python_Code\\pythonProject\\SgFilterScipy.py", String.valueOf(a), String.valueOf(b) };
            Process proc = Runtime.getRuntime().exec(args);// 执行py文件

            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
