package com.Project.Jobfinder.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobPost")
public class Post {
    private String desc;
    private int exp;
    private String Salary;
    private String Base;
    private String Contact;



    public Post() {

    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public String getSalary() {
        return Salary;
    }
    public void setSalary(String salary) {
        Salary = salary;
    }
    public String getBase() {
        return Base;
    }
    public void setBase(String base) {
        Base = base;
    }
    public String getContact() {
        return Contact;
    }
    public void setContact(String contact) {
        Contact = contact;
    }
    @Override
    public String toString() {
        return "Post [desc=" + desc + ", exp=" + exp + ", Salary=" + Salary + ", Base=" + Base + ", Contact=" + Contact
                + "]";
    }




}
