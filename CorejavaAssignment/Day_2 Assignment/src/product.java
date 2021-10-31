
public class product{
	  int proid;
	  String proname;
	  double proprice;
	   
	  product(){};

       product(int a,String n,double b)
        {
        	this.proid=a;
        	this.proname=n;
        	this.proprice=b;
        }
        public double Gst(double proprice,double addgst){
        	return this.proprice+addgst;
        }
        
        public void display()
        {
        System.out.println(proid);
        System.out.println(proname);
        System.out.println(proprice);
        }
    public static void main(String[] args)
    {
    	product p1=new product();
    	p1.proid=101;	
    	p1.proname="Juicer";
    	p1.proprice=786;
    	p1.display();
    	
    	product p2=new product(102,"Oven",9876);
    	p2.display();
    	double totalgst=p2.Gst(749,330);
    	System.out.println(totalgst);
    	}
        
}
 