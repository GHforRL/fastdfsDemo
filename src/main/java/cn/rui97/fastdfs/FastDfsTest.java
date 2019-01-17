package cn.rui97.fastdfs;

import org.junit.Test;

/**
 * @Auther: rui
 * @Date: 2019/1/17 11:39
 * @Description:
 */
public class FastDfsTest {
    /**
     * 上传测试
     * @throws Exception
     */
    @Test
    public void testUpload()throws Exception{
        System.out.println(FastDfsApiOpr.upload("C:\\Users\\rui\\Pictures\\javalog.jpg", "jpg"));//测试填图片路径
    }
}
