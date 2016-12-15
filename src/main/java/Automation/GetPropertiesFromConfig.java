package Automation;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by divya on 17/11/16.
 */
public class GetPropertiesFromConfig {

    public static void main(String[] args)throws Exception{
        String separator = System.getProperty("file.separator");
        String path = System.getProperty("user.dir")+separator+"src"+separator+"main"+separator+"resources"+separator;
        path = path + "Regress.cfg";
        Properties properties = new Properties();
        properties.load(new FileInputStream(path));
        System.out.println("\n"+path);
        System.out.println("\nName : "+properties.getProperty("name"));
        System.out.println("\nClass : "+properties.getProperty("class"));
    }
}
