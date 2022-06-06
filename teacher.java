class employe
{
int empid,salary;
String empname,eaddress;
employe(int emid,String ename,String address,int sal)
{
empid=emid;
empname=ename;
eaddress=address;
salary=sal;
}
void print()
{
System.out.println("employe id:"+empid);
System.out.println("employe name:"+empname);
System.out.println("employe address:"+eaddress);
System.out.println("employe salary:"+salary);
}
}
class teacher extends employe
{
String dept,sub1,sub2,sub3;
teacher(String deptm,String subj1,String subj2,String subj3)
{
dept=deptm;
sub1=subj1;
sub2=subj2;
sub3=subj3;
}
void show()
{
System.out.println("department:"+dept);
System.out.println("Subjeect1:"+sub1);
System.out.println("Subject2:"+sub2);
System.out.println("Subject3:"+sub3);
}
public static void main(String args[])
{
Teacher t=new.teacher[3];
t[1].print();
t[1].show();
t[2].print();
t[2].show();
t[3].print();
t[3].show();
}
}

