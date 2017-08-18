/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import ph.edu.dlsu.EMI.myarraylist.MyList;
import ph.edu.dlsu.EMI.mylinkedlist.MyLinkedList;

/**
 *
 * @author Rivera
 */
public class CodeExchangeDataBase {

    MyList<CodeExchangeUserProfile> users = new MyList<>();
    MyList<CodeExchangeCoderProfile> coders = new MyList<>();

    public CodeExchangeDataBase() throws FileNotFoundException, IOException {
        //reading users from the text file
        String path = System.getProperty("user.dir") + "\\src\\project\\users\\users.txt";
        File f = new File(path);
        FileReader source = new FileReader(f);
        BufferedReader br = new BufferedReader(source);

        String temp = br.readLine();
        
        while (temp != null) {
            CodeExchangeUserProfile temp_profile = new CodeExchangeUserProfile(temp);
            temp_profile.setCompany_name(br.readLine());
            temp_profile.setEmail(br.readLine());
            temp_profile.setNumber(br.readLine());
            temp_profile.setLanguage(br.readLine());
            temp_profile.setPassword(br.readLine());
            temp_profile.setSpendings(Integer.parseInt(br.readLine()));
            users.add(temp_profile);
            
            if (!"end".equals(br.readLine())) {

                System.out.println("Error in the database");
                break;
            }
            temp = br.readLine();
        }
        br.close();
        source.close();
        //getting profiles of coders
        path = System.getProperty("user.dir") + "\\src\\project\\coders\\coders.txt";
        f = new File(path);
        source = new FileReader(f);
        br = new BufferedReader(source);
        
        temp = br.readLine();
        
        while (temp != null) {
            CodeExchangeCoderProfile temp_profile = new CodeExchangeCoderProfile(temp);
            temp_profile.setAlias(br.readLine());
            temp_profile.setEmail(br.readLine());
            temp_profile.setNumber(br.readLine());
            temp = br.readLine();
            System.out.println(temp);
            StringTokenizer token = new StringTokenizer(temp, " ");
            MyLinkedList<String> languages = new MyLinkedList<>();
            while(token.hasMoreTokens()){
                languages.add(token.nextToken());
            }
            temp_profile.setLanguages(languages);
            temp_profile.setPassword(br.readLine());
            temp_profile.setEarnings(Integer.parseInt(br.readLine()));
            coders.add(temp_profile);
            
            if (!"end".equals(br.readLine())) {

                System.out.println("Error in the database");
                break;
            }
            temp = br.readLine();
        }
    }
    public void printAllProfiles(){
        System.out.println("Users");
        for(int i=1;i<=users.size();i++){
            System.out.println(users.get(i).getName()+"    :    " + users.get(i).getPassword());
        }
        System.out.println("Coders");
        for(int i=1;i<=coders.size();i++){
            System.out.println(coders.get(i).getName()+"    :    " + coders.get(i).getPassword());
        }
    }
}
