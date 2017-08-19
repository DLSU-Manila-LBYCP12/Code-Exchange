/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import ph.edu.dlsu.EMI.myqueue.*;

/**
 *
 * @author Rivera
 */
public class CodeExchangeSubmission {
    private String submitter;
    private String features;
    private String language;
    private String screenshot;
    private String code;
    private String addfeatures;
    private String requester;
    
    /**
     * @return the submitter
     */
    public String getSubmitter() {
        return submitter;
    }

    /**
     * @param submitter the submitter to set
     */
    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }
     public String getRequester() {
        return requester;
    }

    /**
     * @param submitter the submitter to set
     */
    public void setRequester(String requester) {
        this.requester = requester;
    }
    /**
     * @return the features
     */
    public String getFeatures() {
        return features;
    }

    /**
     * @param features the features to set
     */
    public void setFeatures(String features) {
        this.features = features;
    }
    
    public String getAddFeatures() {
        return addfeatures;
    }

    /**
     * @param features the features to set
     */
    public void setAddFeatures(String addfeatures) {
        this.addfeatures = addfeatures;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }
    public String getCode() {
        return code;
    }

    /**
     * @param submitter the submitter to set
     */
    public void setCode(String code) {
        this.code = code;
    }
}
