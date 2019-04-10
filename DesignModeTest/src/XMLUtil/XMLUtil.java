package XMLUtil;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XMLUtil { //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean() {
        try {
//创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("/Users/lh/IdeaProjects/DesignModeTest/src/config.xml"));
//获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();
//通过类名生成实例对象并将其返回
            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj; }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        } }

    public static List<Object> getBeans() {

        try {
//创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("/Users/lh/IdeaProjects/DesignModeTest/src/config.xml"));
//获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            List<Object> objects=new ArrayList<>();
            for (int i = 0; i < nl.getLength(); i++) {
                Node classNode=nl.item(i).getFirstChild();
                String cName=classNode.getNodeValue();
//通过类名生成实例对象并将其返回
                Class c=Class.forName(cName);
                Object obj=c.newInstance();
                objects.add(obj);
            }
            return objects;
           }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
/*
//有了XMLUtil类后，可以对日志记录器的客户端代码进行修改，不再直接使用new关键字来创 建具体的工厂类，而是将具体工厂类的类名存储在XML文件中，再通过XMLUtil类的静态工 厂方法getBean()方法进行对象的实例化，代码修改如下:
class Client {
    public static void main(String args[]) {
        LoggerFactory factory;
        Logger logger;
        factory = (LoggerFactory)XMLUtil.getBean(); //getBean()的返回类型为Obje logger = factory.createLogger();
        logger.writeLog();
    } }*/
