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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import ph.edu.dlsu.EMI.myarraylist.MyList;
import ph.edu.dlsu.EMI.mylinkedlist.MyLinkedList;

/**
 *
 * @author Rivera
 */
public class CodeExchangeDataBase {

    public MyList<CodeExchangeUserProfile> users = new MyList<>();
    public MyList<CodeExchangeCoderProfile> coders = new MyList<>();
    public MyList<String> names = new MyList<>();
    ArrayList<String> namesArrayList = new ArrayList<>();
    int codersSize = 0, usersSize = 0;

    public CodeExchangeDataBase() throws FileNotFoundException, IOException {
        CodeExchangeDataBaseInit();
    }

    public void updateDataBase() throws IOException {
        users = new MyList<>();
        coders = new MyList<>();
        CodeExchangeDataBaseInit();
    }

    public void printAllProfiles() {
        System.out.println("Users");
        for (int i = 1; i <= users.size(); i++) {
            System.out.println(users.get(i).getName() + "    :    " + users.get(i).getPassword());
        }
        System.out.println("Coders");
        for (int i = 1; i <= coders.size(); i++) {
            System.out.println(coders.get(i).getName() + "    :    " + coders.get(i).getPassword());
        }
    }

    public MyLinkedList<String> getNames() {
        names = new MyList<>();
        MyLinkedList<String> namesList = new MyLinkedList<>();

        for (int i = 1; i <= users.size(); i++) {
            names.add(users.get(i).getName());
            namesList.add(users.get(i).getName());
        }
        System.out.println("Coders");
        for (int i = 1; i <= coders.size(); i++) {
            names.add(coders.get(i).getName());
            namesList.add(users.get(i).getName());
        }

        return namesList;
    }

    public Integer[][] getInteractions() throws FileNotFoundException, IOException {
        int totalUsers = usersSize + codersSize;
        Integer[][] interactions = new Integer[totalUsers][totalUsers];
        ArrayList<String> logs = new ArrayList<>();
        String path = System.getProperty("user.dir") + "\\src\\project\\users\\users.txt";
        File f = new File(path);
        FileReader source = new FileReader(f);
        BufferedReader br = new BufferedReader(source);

        String temp = br.readLine();
        while (temp != null) {
            logs.add(temp);
            temp = br.readLine();
        }

        return interactions;

    }

    public void CodeExchangeDataBaseInit() throws IOException {
        usersSize = 0;
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
            usersSize++;
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
            StringTokenizer token = new StringTokenizer(temp, " ");
            MyLinkedList<String> languages = new MyLinkedList<>();
            while (token.hasMoreTokens()) {
                languages.add(token.nextToken());
            }
            temp_profile.setLanguages(languages);
            temp_profile.setPassword(br.readLine());
            temp_profile.setEarnings(Integer.parseInt(br.readLine()));
            coders.add(temp_profile);
            codersSize++;
            if (!"end".equals(br.readLine())) {

                System.out.println("Error in the database");
                break;
            }
            temp = br.readLine();
        }
    }

    public CodeExchangeUserProfile getProfileUser(String name) {
        CodeExchangeUserProfile temp = null;
        for (int i = 1; i < users.size()+1; i++) {
            temp = users.get(i);
            if (name.equals(temp.getName())) {
                return temp;
            }
        }
        return temp;
    }

    public CodeExchangeCoderProfile getProfileCoder(String name) {
        CodeExchangeCoderProfile temp = null;
        for (int i = 1; i < coders.size(); i++) {
            temp = coders.get(i);
            if (name.equals(temp.getName())) {
                return temp;
            }
        }
        return temp;
    }

    public void saveDatabase() throws IOException {
        String path = System.getProperty("user.dir") + "\\src\\project\\coders\\coders.txt";
        File f = new File(path);

        FileWriter writer;
        writer = new FileWriter(path, false);
        PrintWriter print = new PrintWriter(writer);

        for (int i = 1; i < coders.size() + 1; i++) {
            print.println(coders.get(i).toString());

        }
        print.close();
    }
}
