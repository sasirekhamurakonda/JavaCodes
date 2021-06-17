package wtlab;

import java.util.*;
import java.lang.*;
import java.io.*;

import org.xml.sax.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
public class GetUserDetails {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //Get Document Builder
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

//Build Document
        Document document = builder.parse(new File("users.xml"));

//Normalize the XML Structure; It's just too important !!
        document.getDocumentElement().normalize();

//Here comes the root node
        Element root = document.getDocumentElement();
        //System.out.println(root.getNodeName());

//Get all employees
        NodeList nList = document.getElementsByTagName("user");
        //System.out.println("============================");
        boolean found=false;
        for (int temp = 0; temp < nList.getLength(); temp++)
        {
            Node node = nList.item(temp);
            //System.out.println("");    //Just a separator

            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                //Print each employee's detail
                Element eElement = (Element) node;
                if(eElement.getElementsByTagName("name").item(0).getTextContent().equals(s)) {
                    System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Email : " + eElement.getElementsByTagName("email").item(0).getTextContent());
                    System.out.println("Password : " + eElement.getElementsByTagName("password").item(0).getTextContent());
                    System.out.println("Date of Birth : " + eElement.getElementsByTagName("dob").item(0).getTextContent());
                    System.out.println("Nationality " + eElement.getElementsByTagName("nationality").item(0).getTextContent());
                    found=true;
                }

            }
        }
        if(!found)
            System.out.println("Not found");
    }
}