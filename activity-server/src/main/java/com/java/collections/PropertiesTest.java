package com.java.collections;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
//        File  dir = new File(".");
//        System.out.println(dir.getAbsolutePath());


        Properties props = new Properties();
//        从文件系统读
//        String f = "setting.properties";
//        props.load(new java.io.FileInputStream(f));
//        从 classpath 读
//        props.load(PropertiesTest.class.getResourceAsStream("setting.properties")); //报错
        props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("setting.properties"));

        String filepath = props.getProperty("last_open_file");
        String interval = props.getProperty("auto_save_interval", "120");

//        如果有多个.properties文件，可以反复调用load()读取，后读取的key-value会覆盖已读取的key-value：
//        Properties props = new Properties();
//        props.load(getClass().getResourceAsString("/common/setting.properties"));
//        props.load(new FileInputStream("C:\\conf\\setting.properties"));

//        如果通过setProperty()修改了Properties实例，可以把配置写入文件，以便下次启动时获得最新配置。写入配置文件使用store()方法：
//        Properties props = new Properties();
//        props.setProperty("url", "http://www.liaoxuefeng.com");
//        props.setProperty("language", "Java");
//        props.store(new FileOutputStream("C:\\conf\\setting.properties"), "这是写入的properties注释");

//        早期版本的Java规定.properties文件编码是ASCII编码（ISO8859-1），如果涉及到中文就必须用name=\u4e2d\u6587来表示，非常别扭。
//        从JDK9开始，Java的.properties文件可以使用UTF-8编码了。
//        不过，需要注意的是，由于load(InputStream)默认总是以ASCII编码读取字节流，所以会导致读到乱码。我们需要用另一个重载方法load(Reader)读取：
//        Properties props = new Properties();
//        props.load(new FileReader("settings.properties", StandardCharsets.UTF_8));
//        InputStream和Reader的区别是一个是字节流，一个是字符流。字符流在内存中已经以char类型表示了，不涉及编码问题。

    }
}
