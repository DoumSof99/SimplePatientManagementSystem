import java.io.*; // Importing all the commands of the io Java package
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;
import java.util.*;
public class PatientMain
{    
    public static void main (String []args) throws IOException // Declares that an error (exception) may occur
    {        
        // Prepare for input
        InputStreamReader isr = new InputStreamReader(System.in); // Variable (object) reading the keystrokes
        BufferedReader br = new BufferedReader(isr);   // Variable (object) transalting the input stream     
        Scanner sc = new Scanner(System.in);
        String inData=null;  // Text variable to receive the user's input
  
        // Declare Variables        
        char choice=0;
        String first=null;
        String last=null;
        String comments=null;
        String visited=null;
        int age=0;
        int ID=0;
        double height=0;
        double weight=0;
        double BMI=0;
        char sex=' ';
        
        ArrayList<PatientTest> PatientList= new ArrayList<PatientTest>(); 
        
        PatientList.add(new PatientTest(100, "Michel", "Andrew", "02/05/17",'m' ,26 ,1.90 ,85 ,"Broke leg"));
        PatientList.add(new PatientTest(200, "Nick", "Mathious", "12/02/18", 'm', 20, 1.78, 81,"sick"));
        PatientList.add(new PatientTest(300, "Mairy", "Seven", "30/11/17", 'f', 36, 1.65, 56, "Paranoid"));
        PatientList.add(new PatientTest(400, "Anna", "Petridou", "20/04/15", 'f', 34 , 1.67, 85,"sick"));
        PatientList.add(new PatientTest(500, "Antonis", "Pilis", "23/08/16", 'm', 56, 1.76, 75,"dead"));
        PatientList.add(new PatientTest(600, "Giorge", "Clou", "1/1/16", 'm', 32,  2.02, 90,"broken neck"));
        PatientList.add(new PatientTest(700, "Martha", "Mpeth", "9/6/13", 'f', 19, 1.56, 45,"brolen leg"));
        PatientList.add(new PatientTest(800, "Sofia", "Doumani", "3/12/17", 'f', 20, 1.66, 58,"broken arm"));
        PatientList.add(new PatientTest(900, "Anastasia", "Marilou", "30/11/13", 'f', 39, 1.90, 79,"sick"));
        PatientList.add(new PatientTest(340, "Manos", "Poulios", "04/07/12", 'm', 21, 1.82, 80,"sick"));
        
        // Create all objects  
        while ( true )
        {   
            System.out.println();
            System.out.println("Please select one of the following:");
            System.out.println("Press 'a' and insert new patient data");
            System.out.println("Press 'b' to retrieve existing patient data");
            System.out.println("Press 'c' to modify existing patient data");
            System.out.println("Press 'd' to sort existing data and display on screen");
            System.out.println("Press 'e' to exit");
            System.out.println();
            System.out.print("Your choice: ");          
             // Read the user's choice
            inData = br.readLine();
            if (inData.equals(""))
            {
                inData = "a";
            }
            choice = inData.trim().toLowerCase().charAt(0);
         
            switch (choice)
            {
                case 'a':
            
                do
                {
                    System.out.print("Please enter your national healthcare ID number(1-999): ");
                    ID = sc.nextInt();
                }while((1>ID)&&(ID>1000));
                    
                System.out.print("Please enter your first name: ");
                first = sc.next();
            
                System.out.print("Please enter your last name: ");
                last=sc.next();
            
                System.out.print("Please enter the last date you visited: ");
                visited=sc.next();
            
            
                System.out.print("Please enter your sex (m/f): ");
                sex = sc.next().charAt(0);
                                    
            
               while(true)
               {
                   try
                   {
                       System.out.print("Please enter your age: ");
                       age=sc.nextInt();
                       break;
                   }
                   catch(Exception e)
                   {
                       System.out.println("Warning: incorect entry!");
                       continue;               
                   }
               }
               while(true)
               {
                   try
                   {
                       System.out.print("Please enter your height: ");
                       height= sc.nextDouble();
                       break;
                   }
                   catch(Exception e)
                   {
                       System.out.println("Warning: incorect entry!");
                       continue;
                   }
               }
               while(true)
               {
                   try
                   {
                       System.out.print("Please enter your weight: ");
                       weight=sc.nextDouble();
                       break;
                   }
                   catch(Exception e)
                   {
                        System.out.println("Warning: incorect entry!");
                        continue;
                   }
               }
               while(true)
               {
                   System.out.print("Please enter your comments: ");
                   comments=sc.next();
                   break;
               }
               PatientList.add(new PatientTest(ID, first, last, visited,sex ,age ,height, weight ,comments));
                
               break;
            
               case 'b':   //sometimes it works some other times not (it printss out an error)
                
               System.out.println("Enter the ID of the patient :");
               int healthCare = sc.nextInt();
               boolean foundPatient=false;
            
               for(int i=0;i<PatientList.size();i++)
               {
                   if(PatientList.get(i).getID()==healthCare)
                   {
                       System.out.println("We found the patient ID.");
                       foundPatient=true;
                       PatientList.get(i).display();
                   }
               }
               if(!foundPatient)
               {
                   System.out.println("Patient not found");
               }
               break;
            
               case 'c':
                              
               while(true)
               {
                   try
                   {
                       System.out.println("Please enter the patient's ID .");            
                       healthCare=sc.nextInt();
                       break;
                   }
                   catch(NullPointerException e)
                   {
                       System.out.println("Warning: Incorrect entry!");
                       continue;
                   }
               }
               
               System.out.println(" ");
               System.out.println("Select the field you want to change: ") ;
               System.out.println("1:First name") ;
               System.out.println("2:Last name") ;
               System.out.println("3:Last date the patient visited the medical practice") ;
               System.out.println("4:Sex") ;
               System.out.println("5:Age") ;
               System.out.println("6:Weight") ;
               System.out.println("7:Height") ;
               System.out.println("8:Comments ") ;
               System.out.print("Please enter your choice  ") ;               
               int field=sc.nextInt();
               
               while(true)
               {
                   try
                   {
                       for(int i=0;i<PatientList.size();i++)
                       {
                           if(PatientList.get(i).getID()==healthCare)
                           {
                               if(field==1)
                               {
                                   System.out.println("The first name is "+PatientList.get(i).getFirst());
                                   first=null;
                                   System.out.println("Enter the new first name of the patient");
                                   first=sc.next();
                                   PatientList.get(i).setfirst(first);
                                   System.out.println("The new first name of the patien is "+PatientList.get(i).getFirst());
                               }
                               else if(field==2)
                               {
                                   System.out.println("The last name is "+PatientList.get(i).getLast());
                                   last=null;
                                   System.out.println("Enter the new last name of the patient");
                                   last=sc.next();
                                   PatientList.get(i).setlast(last);
                                   System.out.println("The new last name of the patien is "+PatientList.get(i).getLast());
                               }
                               else if(field==3)
                               {
                                   System.out.println("The last date the patient visited the medical practice is "+PatientList.get(i).getVisited());
                                   visited=null;
                                   System.out.println("Enter the new last date the patient visited the medical practice");
                                   visited=sc.next();
                                   PatientList.get(i).setvisited(visited);
                                   System.out.println("The new last name of the patien is "+PatientList.get(i).getVisited());
                               }
                               else if(field==4)
                               {
                                   System.out.println("The sex is "+PatientList.get(i).getSex());
                                   sex=' ';
                                   System.out.println("Enter the new gender of the patient");
                                   sex=sc.next().charAt(0);
                                   PatientList.get(i).setsex(sex);
                                   System.out.println("The new gender of the patien is "+PatientList.get(i).getSex());
                               }
                               else if(field==5)
                               {
                                   System.out.println("The age is "+PatientList.get(i).getAge());
                                   age=0;
                                   System.out.println("Enter the new age of the patient");
                                   age=sc.nextInt();
                                   PatientList.get(i).setage(age);
                                   System.out.println("The new age of the patien is "+PatientList.get(i).getAge());
                               }
                               else if(field==6)
                               {
                                   System.out.println("The weight is "+PatientList.get(i).getWeight());
                                   weight=0;
                                   System.out.println("Enter the new weight of the patient");
                                   weight=sc.nextDouble();
                                   PatientList.get(i).setweight(weight);
                                   System.out.println("The new weight of the patien is "+PatientList.get(i).getWeight());
                               }
                               else if(field==7)
                               {
                                   System.out.println("The height is "+PatientList.get(i).getHeight());
                                   weight=0;
                                   System.out.println("Enter the new weight of the patient");
                                   weight=sc.nextDouble();
                                   PatientList.get(i).setweight(weight);
                                   System.out.println("The new weight of the patien is "+PatientList.get(i).getWeight());
                               }
                               else if(field==8)
                               {
                                   System.out.println("The comments are "+PatientList.get(i).getComments());
                                   comments=null;
                                   System.out.println("Enter the new comments of the patient");
                                   comments=sc.next();
                                   PatientList.get(i).setComments(comments);
                                   System.out.println("The new comments of the patien is "+PatientList.get(i).getComments());
                               }
                           }
                       }
                   }
                   catch(Exception e)
                   {
                        System.out.println("Warning: Incorrect entry!");
                   }
                   break;
               }
               case 'd':
               
               PatientList.add(new PatientTest(ID, first, last, visited, sex ,age ,height, weight ,comments));
               PatientList.add(new PatientTest(100, "Michel", "Andrew", "02/05/17",'m' ,26 ,1.90 ,85 ,"Broke leg"));
               PatientList.add(new PatientTest(200, "Nick", "Mathious", "12/02/18", 'm', 20, 1.78, 81,"sick"));
               PatientList.add(new PatientTest(300, "Mairy", "Seven", "30/11/17", 'f', 36, 1.65, 56, "Paranoid"));
               PatientList.add(new PatientTest(400, "Anna", "Petridou", "20/04/15", 'f', 34 , 1.67, 85,"sick"));
               PatientList.add(new PatientTest(500, "Antonis", "Pilis", "23/08/16", 'm', 56, 1.76, 75,"dead"));
               PatientList.add(new PatientTest(600, "Giorge", "Clou", "1/1/16", 'm', 32,  2.02, 90,"broken neck"));
               PatientList.add(new PatientTest(700, "Martha", "Mpeth", "9/6/13", 'f', 19, 1.56, 45,"brolen leg"));
               PatientList.add(new PatientTest(800, "Sofia", "Doumani", "3/12/17", 'f', 20, 1.66, 58,"broken arm"));
               PatientList.add(new PatientTest(900, "Anastasia", "Marilou", "30/11/13", 'f', 39, 1.90, 79,"sick"));
               PatientList.add(new PatientTest(340, "Manos", "Poulios", "04/07/12", 'm', 21, 1.82, 80,"sick"));
        
               System.out.println("The unsorted list.");
               System.out.println(" ");
               for(int i=0;i<PatientList.size();i++)
               {
                   System.out.println(PatientList.get(i));
               }
               Collections.sort(PatientList, new sortByRoll());
               System.out.println("The sorted list.");
               System.out.println(" ");               
               for(int i=0;i<PatientList.size();i++)
               {
                   System.out.println(PatientList.get(i));
               }
               break;
               case 'e':
               System.out.println("You have just exit the program!Goodbye!");
               System.out.println();
               return;
             
               default:
               System.out.println("Default messege!!!");
            }
        }
    }
}