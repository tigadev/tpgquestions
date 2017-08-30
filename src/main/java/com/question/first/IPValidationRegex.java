package com.question.first;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by adzam on 31/08/2017
public class IPValidationRegex {

    private Pattern pattern;
    private Matcher matcher;

    private static final String IP_PATTERN =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void main(String[] args) {
        IPValidationRegex obj = new IPValidationRegex();
        System.out.println(obj.getFile("ip_address.txt"));
    }

    public IPValidationRegex(){
        pattern = Pattern.compile(IP_PATTERN);
    }

    public boolean validate(String address){
        matcher = pattern.matcher(address);
        return matcher.matches();
    }

    private String getFile(String fileName) {

        StringBuilder result = new StringBuilder("");

        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        try{
            Scanner scanner = new Scanner(file);
            List<String> ipAddressValid = new LinkedList<String>();
            List<String> ipAddressInvalid = new LinkedList<String>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Boolean pass = validate(line);

                if(pass){
                    ipAddressValid.add(line);
                }else{
                    ipAddressInvalid.add(line);
                }
            }

            System.out.println("Valid IP Address");
            for (String ipAddress : ipAddressValid) {
                System.out.println(ipAddress);
            }

            System.out.println("\nInvalid IP Addresses");
            for (String ipAddress : ipAddressInvalid) {
                System.out.println(ipAddress);
            }

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();

    }
}
