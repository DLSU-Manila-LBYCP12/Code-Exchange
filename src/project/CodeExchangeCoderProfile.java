/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import ph.edu.dlsu.EMI.mylinkedlist.MyLinkedList;

/**
 *
 * @author Rivera
 */
public class CodeExchangeCoderProfile {

    private String name;
    private String alias;
    private String email;
    private String number;
    private MyLinkedList<String> languages;
    private String password;
    private int earnings;

    public CodeExchangeCoderProfile(String name) {
        this.setName(name);
        }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the languages
     */
    public MyLinkedList<String> getLanguages() {
        return languages;
    }

    /**
     * @param languages the languages to set
     */
    public void setLanguages(MyLinkedList<String> languages) {
        this.languages = languages;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the earnings
     */
    public int getEarnings() {
        return earnings;
    }

    /**
     * @param earnings the earnings to set
     */
    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }
    @Override
    public String toString(){
        String temp ="";
        String nl = System.lineSeparator();
        temp = getName() +nl + getAlias()+nl  + getEmail() +nl  + getPassword() +nl  + getLanguages() +nl  + getPassword() +nl+getEarnings()+nl+"end";
                         
        return temp;
    }
}
