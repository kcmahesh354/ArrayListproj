public class StudentDetails {
    private String Name;
    private  int Rollno;
    private  String Username;

    public StudentDetails(String name, int rollno, String username) {
        Name = name;
        Rollno = rollno;
        Username = username;
    }

    public StudentDetails() {

    }

    public String getName(){
        return Name;
    }
    public int getRollno(){
        return Rollno;
    }
    public String getUsername(){
        return Username;
    }
    public void setName(String Name){
        this.Name =Name;
    }
    public void setRollno(int Rollno){
        this.Rollno=Rollno;
    }
    public void setUsername(String Username){
        this.Username=Username;
    }
}
