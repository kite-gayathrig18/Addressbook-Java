/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.models;

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private String mob;
    private String email;
    private String rollno;
    private String state;
    
   
   
   
   /* public User(){
        x=0;
    }
   
    public User(int x){
        this.x=x;
    }
   
    public void incX(){
        x++;
    }
   
    public void decX(){
        x--;
    }
    public int getX(){
        return x;
    }*/
    public String getName(){
        return this.name;
   }
   
    public String getMob(){
        return this.mob;
   }
   
    public String getEmail(){
        return this.email;
   }
    
     
      public String getState(){
        return this.state;
   }
   
   

    public String getRno() {
        return this.rollno;
    }

    public void setData(String name, String mobile, String email, String rollno, String state) {
        //To change body of generated methods, choose Tools | Templates.
        this.name = name;
        this.mob = mob;
        this.email = email;
        this.rollno= rollno;
        this.state = state;
    }
    
   
 

}
