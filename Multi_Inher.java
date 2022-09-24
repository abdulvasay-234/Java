class Multi_Inher{
    public static void main(String args[]){
        percentage stu = new percentage(102689, "xyz", 350, 70); //call constructor percentage
        stu.dispdatap();// call dispdatap of percentage class
    }
}
class percentage extends marks{
    int per;
    percentage(int r, String n, int t, int p){
        super(r,n,t);//call super class(marks) constructor
        per = p;
    }
    void dispdatap(){
        dispdatam();// call dispdatap of marks class
        System.out.println("Percentage = " + per);
    }
}
class marks extends student{
    int total;
    marks(int r, String n, int t){
        super(r,n);//call super class (student) constructor
        total = t;
    }
    void dispdatam(){
        dispdatas();// call dispdatap of student class
        System.out.println("Total = " + total);
    }
}
class student{
    int rollno;
    String name;
    student(int r, String n){
        rollno = r;
        name = n;
    }
    void dispdatas(){
        System.out.println("Rollno = " + rollno);
        System.out.println("Name = " + name);
    }
}
