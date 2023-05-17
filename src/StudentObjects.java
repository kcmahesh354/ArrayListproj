public class StudentObjects implements StudentInterface{
    private StudentDetails newStudent = new StudentDetails();
    public void setDetails(String Studentname,int Rollno,String Username){
        this.newStudent.setName(Studentname);
        this.newStudent.setRollno(Rollno);
        this.newStudent.setUsername(Username);
    }
    public void getDetails(){
        System.out.println(newStudent.getName()+" "+newStudent.getRollno()+" "+newStudent.getUsername());


    }
}
