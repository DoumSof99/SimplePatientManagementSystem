import java.util.*;
import java.lang.*;
import java.io.*;
class PatientTest
{
    // Variables Area
    String last; 
    String first;
    String comments;
    String visited;
    int age;
    int ID;
    double height;
    double weight; 
    double BMI;
    char sex;
    // Constructor Area
    PatientTest(int ID, String first, String last, String visited, char sex, int age, double height, double weight, String comments)
    {
        this.ID=ID;
        this.first=first;
        this.last=last;
        this.visited=visited;
        this.sex=sex;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.comments=comments;
        this.BMI=BMI;        
    }
    //methods area
    int getID()
    {
        return ID;
    }
    public String getFirst()
    {
        return first;
    }
    public String getLast()
    {
        return last;
    }
    public String getVisited()
    {
        return visited;
    }
    public char getSex()
    {
        return sex;
    }
    public int getAge()
    {
        return age;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWeight()
    {
        return weight;
    }
    public String getComments()
    {
        return comments=comments;
    }
    public double getBMI()
    {
        BMI = weight/(height*height);
        return BMI;
    }    
    public void setID(int newID)
    {
        ID=newID;
    }
    public void setfirst(String newfirst)
    { 
        first=newfirst;
    }
    public void setlast(String newlast)
    { 
        last=newlast;
    }
    public void setvisited(String newvisited)
    { 
        visited=newvisited;
    }
    public void setsex(char newsex)
    { 
        sex=newsex;
    }
    public void setheight(double newheight)
    { 
        height=newheight;
    }
    public void setage(int newage)
    { 
        age=newage;
    }
    public void setweight(double newweight)
    { 
        weight=newweight;
    }      
    public void setComments(String newcomments)
    {
        comments=newcomments;
    }
    public void display()   
    {
        System.out.println("National Health ID: " +ID);
        System.out.println("First name : " +first);
        System.out.println("Last name: " +last);
        System.out.println("Last date the patient visited: " +visited);
        System.out.println("Sex: " +sex);
        System.out.println("Age: " +age);
        System.out.println("Height: " +height);
        System.out.println("Weight: " +weight);
        System.out.println("Comments: " +comments);
        System.out.print("BMI : "+BMI+ " and ");
        if(BMI<18)
        {
            System.out.println("you are under-weight!");
        }
        else if ((18<BMI)&&(BMI<28))
        {
            System.out.println("you are normal!");
        }
        else if((28<BMI)&&(BMI<30))
        {
            System.out.println("you are over-weight!");
        }
        else 
        {
            System.out.println("you are obese!");
        }           
    }
    public String toSort()
    {
        return this.ID+" "+this.first+" "+this.last+" "+this.visited+" "+this.sex+" "+this.age+" "+this.height+" "+this.weight+" "+this.comments+" "+this.BMI; 
    }
}