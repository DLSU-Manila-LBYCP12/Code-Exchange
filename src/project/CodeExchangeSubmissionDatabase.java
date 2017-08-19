/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import ph.edu.dlsu.EMI.myqueue.MyQueue;

/**
 *
 * @author Rivera
 */
public class CodeExchangeSubmissionDatabase {

    MyQueue<CodeExchangeSubmission> submission = new MyQueue<>();

    public CodeExchangeSubmissionDatabase() throws IOException {
        initDatabase();
    }

    private void initDatabase() throws IOException {
        String path = System.getProperty("user.dir") + "\\src\\project\\submitted\\submitted.txt";
        File f = new File(path);
        FileReader source = new FileReader(f);
        BufferedReader br = new BufferedReader(source);
        String temp;

        temp = br.readLine();
        System.out.println(temp);
        while (temp != null) {
            CodeExchangeSubmission tempSubmission = new CodeExchangeSubmission();
            tempSubmission.setSubmitter(temp);
            tempSubmission.setTitle(br.readLine());
            tempSubmission.setRequester(br.readLine());
            String lang = "";
            temp=br.readLine();
            while(!temp.equals("end language")) {
                lang += temp + System.lineSeparator();
                temp = br.readLine();
            }
            tempSubmission.setLanguage(lang);
            temp=br.readLine();
            String feats = "";
            while (!temp.equals("end features")) {
                feats += temp + System.lineSeparator();
                temp = br.readLine();
            } 
            temp=br.readLine();
            tempSubmission.setFeatures(feats);
            String shots = "";
            while (!temp.equals("end shots")) {
                shots += temp + System.lineSeparator();
                temp = br.readLine();
            }     
            tempSubmission.setScreenshot(shots); 
            temp=br.readLine();  
            String addfeats="";
            while (!temp.equals("end added features")) {
                addfeats += temp + System.lineSeparator();
                temp = br.readLine();
            }
            temp=br.readLine();            
            tempSubmission.setAddFeatures(addfeats);
            String code="";
            while (!temp.equals("end code")) {
                code += temp + System.lineSeparator();
                temp = br.readLine();
            }   
            tempSubmission.setCode(code);
            
            temp=br.readLine();
            while (!temp.equals("end")) {
                temp = br.readLine();
            } 
            temp=br.readLine();
            submission.enQueue(tempSubmission);
        }
    }

    public void printAllSubmissions() {
        System.out.println("Submission titles");
        for (int i = 1; i < submission.size() + 1; i++) {
            System.out.println(submission.deQueue().getSubmitter());
        }

    }
    public CodeExchangeSubmission findByTitle(String title){
        CodeExchangeSubmission tempSubmission = null;
        for(int i =0; i<submission.size();i++){
            if(submission.get(i).getTitle().equals(title)){
                tempSubmission = submission.get(i);
               return tempSubmission;
            }
        }
        return tempSubmission;
    }
    public void remove(CodeExchangeSubmission submission){
        findByTitle(submission.getTitle());
    }
    public void removeByTitle(String title){
        
        for(int i =0; i<submission.size();i++){
            if(submission.get(i).getTitle().equals(title)){
                submission.remove(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        CodeExchangeSubmissionDatabase database = new CodeExchangeSubmissionDatabase();
        database.printAllSubmissions();
    }
    public void saveDataBase(){
        
    }
}
