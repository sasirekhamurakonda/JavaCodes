package wtlab;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;


public class getUserDetailsSAX {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            UserHandler handler = new UserHandler();
            saxParser.parse(new File("users.xml"), handler);
            // Get Users list
            List < User > userList = handler.getEmpList();
            // print user information
            for (User user: userList) {
                if(user.getFirstName().equals(s))
                      System.out.println(user);
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}

class UserHandler extends DefaultHandler {

    private boolean hasFirstName = false;
    private boolean hasLastName = false;
    private boolean hasAge = false;
    private boolean hasGender = false;

    // List to hold Users object
    private List < User > userList = null;
    private User user = null;

    // getter method for userloyee list
    public List < User > getEmpList() {
        return userList;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName.equalsIgnoreCase("User")) {
            // create a new User and put it in Map
            String id = attributes.getValue("id");
            // initialize User object and set id attribute
            user = new User();
            user.setId(Integer.parseInt(id));
            // initialize list
            if (userList == null)
                userList = new ArrayList < > ();
        } else if (qName.equalsIgnoreCase("firstName")) {
            // set boolean values for fields, will be used in setting User variables
            hasFirstName = true;
        } else if (qName.equalsIgnoreCase("age")) {
            hasAge = true;
        } else if (qName.equalsIgnoreCase("gender")) {
            hasGender = true;
        } else if (qName.equalsIgnoreCase("lastName")) {
            hasLastName = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("User")) {
            // add User object to list
            userList.add(user);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        if (hasAge) {
            // age element, set User age
            user.setAge(Integer.parseInt(new String(ch, start, length)));
            hasAge = false;
        } else if (hasFirstName) {
            user.setFirstName(new String(ch, start, length));
            hasFirstName = false;
        } else if (hasLastName) {
            user.setLastName(new String(ch, start, length));
            hasLastName = false;
        } else if (hasGender) {
            user.setGender(new String(ch, start, length));
            hasGender = false;
        }
    }
}

class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" +
                gender + "]";
    }
}

/*
<?xml version="1.0" encoding="UTF-8"?>
<Users>
    <User id= "1">
        <firstName>Ramesh</firstName>
        <lastName>Fadatare</lastName>
        <age>28</age>
        <gender>Male</gender>
    </User>
    <User id= "2">
        <firstName>John</firstName>
        <lastName>Cena</lastName>
        <age>45</age>
        <gender>Male</gender>
    </User>
    <User id= "3">
        <firstName>Tom</firstName>
        <lastName>Cruise</lastName>
        <age>40</age>
        <gender>Male</gender>
    </User>
</Users>*/