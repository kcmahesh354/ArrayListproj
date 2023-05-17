import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)throws IOException {
        ArrayList list= new ArrayList();
//        StudentDetails obj1= new StudentDetails("Mahesh",20,"Mk");
//        StudentDetails obj2=new StudentDetails("suren",21,"sr");
//        list.add(obj1);//adding object to array lsit
//        list.add(obj2);
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            int rollno = Integer.parseInt(bufferedReader.readLine());
            String username=bufferedReader.readLine();
            String Name = bufferedReader.readLine();
            StudentDetails obj3=new StudentDetails(Name,rollno,username);
            list.add(obj3);


        }
        for(int i = 0; i<5;i++){
            System.out.println(list.get(i));
        }
    }
}
//https://stackoverflow.com/questions/2047003/print-arraylist-element