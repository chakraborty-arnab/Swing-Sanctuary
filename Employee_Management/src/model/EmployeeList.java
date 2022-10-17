/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Arnab
 */
public class EmployeeList {
    
    private ArrayList<Employee> list;
    
    public EmployeeList(){
        this.list = new ArrayList<Employee>();
        Employee e = new Employee();
        
        e.setName("Arnab");
        e.setEmployeeId(975);
        e.setAge(24);
        e.setPositionTitle("SDE");
        e.setTeamInfo("AI");
        e.setGender("Male");
        e.setLevel("Senior");
        e.setStartDate("06/03/2019");
        e.setPhoneNumber("8572631001");
        e.setEmailId("arnab@gmail.com");
        e.setImageLocation("C:\\Users\\Arnab\\Downloads\\husky.jpg");
        
        list.add(e);
        
        e = new Employee();
        
        e.setName("Divya");
        e.setEmployeeId(980);
        e.setAge(28);
        e.setPositionTitle("SBA");
        e.setTeamInfo("Nvidia");
        e.setGender("Male");
        e.setLevel("Junior");
        e.setStartDate("07/03/2019");
        e.setPhoneNumber("9892067106");
        e.setEmailId("divya@gmail.com");
        e.setImageLocation("C:\\Users\\Arnab\\Downloads\\cat.jpg"); 
        
                list.add(e);
    }

    public ArrayList<Employee> getList() {
        return list;
    }

    public void setList(ArrayList<Employee> list) {
        this.list = list;
    }
    
    public Employee addNewEmployee(Employee e){
        this.list.add(e);
        return e;
    }
    
    public void deleteEmployee(Employee e){
        list.remove(e);
    }
    
    public Employee searchByEmployeeId(int id){
      for(Employee e : list){
          if(e.getEmployeeId()==id){
              return e;
          }
      }
    return null;
    }
    
    public Employee searchByName(String emp){
      for(Employee e : list){
          if(e.getName().equalsIgnoreCase(emp)){
              return e;
          }
      }
    return null;
    }
    
    public Employee searchByPhoneNumber(String n){
      for(Employee e : list){
          if(e.getPhoneNumber().equalsIgnoreCase(n)){
              return e;
          }
      }
    return null;
    }
}
