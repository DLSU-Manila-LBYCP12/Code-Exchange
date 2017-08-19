/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import ph.edu.dlsu.EMI.mystack.MyStack;

/**
 *
 * @author Rivera
 */
public class CodeExchangeRequestsDatabase {

    MyStack<CodeExchangeRequest> requests = new MyStack<>();

    public CodeExchangeRequestsDatabase() throws IOException {
        initDatabase();
    }

    private void initDatabase() throws IOException {
        String path = System.getProperty("user.dir") + "\\src\\project\\submittedprojects\\submittedprojects.txt";
        File f = new File(path);
        FileReader source = new FileReader(f);
        BufferedReader br = new BufferedReader(source);
        String temp;

        temp = br.readLine();
        System.out.println(temp);
        while (temp!= null) {
            CodeExchangeRequest tempRequest = new CodeExchangeRequest();
            tempRequest.setSubmitter(temp);
            tempRequest.setTitle(br.readLine());
            temp = br.readLine();
            temp = br.readLine();
            String desc = "";
        while (!temp.equals("end description")) {

                desc += temp + System.lineSeparator();
                temp = br.readLine();
            }
            tempRequest.setDescription(desc);
            temp = br.readLine();
            temp = br.readLine();
            String feats = "";
            while (!temp.equals("end features")) {

                feats += temp + System.lineSeparator();
                temp = br.readLine();
            }
            tempRequest.setFeatures(feats);
            tempRequest.setLanguage(br.readLine());

            tempRequest.setTheme(br.readLine());
            try {
                tempRequest.setPayment(Integer.parseInt(br.readLine()));
            } catch (Exception e) {
                tempRequest.setPayment(90);
            }
            requests.push(tempRequest);
            temp = br.readLine();
            temp = br.readLine();

        }
    }

    public void printAllRequests() {
        System.out.println("Request titles");
        for (int i = 1; i < requests.size() + 1; i++) {
            System.out.println(requests.get(i).getTitle());
        }

    }

    public void printAllUserRequests(String user) {
        System.out.println("Request user titles");
        for (int i = 1; i < requests.size() + 1; i++) {
            if (requests.get(i).getSubmitter().equals(user)) {
                System.out.println(requests.get(i).getTitle());
            }
        }

    }

    public static void main(String[] args) throws IOException {
        CodeExchangeRequestsDatabase database = new CodeExchangeRequestsDatabase();
        database.printAllRequests();
    }

    public void removeByTitle(String title) throws IOException {
        for (int i = 1; i < requests.size() + 1; i++) {
            if (requests.get(i).getTitle().equals(title)) {
                requests.remove(i);
                System.out.println("Removed one request");
            }
        }
        saveDatabase();
    }

    public void saveDatabase() throws IOException {
        String n = System.lineSeparator();
        FileWriter writer;
String path = System.getProperty("user.dir") + "\\src\\project\\submittedprojects\\submittedprojects.txt";
        writer = new FileWriter(path,false);
        PrintWriter print = new PrintWriter(writer);

        for (int i = 1; i < requests.size() + 1; i++) {
            CodeExchangeRequest request = requests.get(i);
            String submissionForm = "";
            submissionForm = request.getSubmitter() + n + request.getTitle() + n + "start description" + n + request.getDescription() + n + "end description" + n + "start features" + n + request.getFeatures() + n + "end features" + n + request.getLanguage() + n + request.getTheme() + n + request.getPayment() + n + "end";
            
            print.println(submissionForm);

        }
        print.close();
    }

    public CodeExchangeRequest findByTitle(String title) {
        
    CodeExchangeRequest tempSubmission = null;
        for(int i =1; i<requests.size()+1;i++){
            if(requests.get(i).getTitle().equals(title)){
                tempSubmission = requests.get(i);
               return tempSubmission;
            }
        }
        if(tempSubmission == null){
            System.out.println("Submission doesn't exist!");
        }
        return tempSubmission;
    }

}
