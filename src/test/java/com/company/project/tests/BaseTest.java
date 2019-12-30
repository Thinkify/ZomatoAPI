package com.company.project.tests;
import io.restassured.RestAssured;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;
import utils.ApiConfig;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Properties;

public class BaseTest {
    ApiConfig apiConfig= new ApiConfig();

  /* static {
        try {
          Properties prop = readPropertiesFile("src/main/java/configs/config.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/




    Properties properties;
    @BeforeClass
    public  void setup(){
      apiConfig.getHost();
    }
}

   /* public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            File src = new File("src/main/java/configs/config.properties");

            fis = new FileInputStream(src);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
    return prop;
    }}*/

   /* public void testDataSetup() throws IOException {


        System.out.println(new File("src/main/java/configs/config.properties").getAbsolutePath());





        File src=  new File("src/main/java/configs/config.properties");
        FileInputStream fileInputStream = new FileInputStream(src);
        properties.load(fileInputStream);*/

//         Properties properties = new Properties();
//        Thread currentThread = Thread.currentThread();
//        ClassLoader contextClassLoader = currentThread.getContextClassLoader();
//        InputStream propertiesStream = contextClassLoader.getResourceAsStream("./resources/properties");
//        if (propertiesStream != null) {
//            properties.load(propertiesStream);
//            // TODO close the stream
//        } else {
//            // Properties file not found!
//        }
//        }

