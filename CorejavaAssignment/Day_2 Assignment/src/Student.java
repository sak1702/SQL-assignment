

public class Student{
	int stdid;
	String stdname;
	int stdclass;
	   
     Student(){}
      Student(int a,String n,int b)
      {
      	this.stdid=a;
      	this.stdname=n;
      	this.stdclass=b;
      }
      
      public void display()
      {
      System.out.println(stdid);
      System.out.println(stdname);
      System.out.println(stdclass);
      }
  public static void main(String[] args)
  {
  	Student s1=new Student();
  	s1.stdid=11;
  	s1.stdname="john";
  	s1.stdclass=8;
  	s1.display();
  	
  	Student s2=new Student(22,"mark",9);
  	s2.display();
  	
  	}
}
