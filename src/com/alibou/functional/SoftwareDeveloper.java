package com.alibou.functional;

import java.util.List;

public class SoftwareDeveloper {

  private String firstname;
  private String lastname;
  private int age;
  private double salary;
  private List<String> skills;
  private String gender;

  @Override
  public String toString() {
    return "{" +
           "firstname='" + firstname + '\'' +
           ", lastname='" + lastname + '\'' +
           ", age=" + age +
           ", salary=" + salary +
           ", skills=" + skills +
           ", gender='" + gender + '\'' +
           '}';
  }

  public SoftwareDeveloper() {
  }

  public SoftwareDeveloper(String firstname, String lastname, int age, double salary, List<String> skills, String gender) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
    this.salary = salary;
    this.skills = skills;
    this.gender = gender;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}
