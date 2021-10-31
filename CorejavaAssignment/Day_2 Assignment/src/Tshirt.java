

	public class Tshirt {
		String Color;
		String Material;
		String Design;
		int Size;
		
		Tshirt(){
			System.out.println("Small-Sized Tshirts contain\n");
		};
		
		Tshirt(String c, String m, String d, int s){
			this.Color = c;
			this.Material = m;
			this.Design = d;
			this.Size = s;
			System.out.println("Medium-Sized-Tshirts contain\n");
		}
		
		Tshirt(String c, String m, String d){
			this.Color  = c;
			this.Material = m;
			this.Design = d;
			this.Size = 42;
			System.out.println("Large-Sized Tshirts contain\n");
		}

		public void display(){
			System.out.println("Color : "+Color);
			System.out.println("Material : "+Material);
			System.out.println("Design : "+Design);
			System.out.println("Size : "+Size+"\n");
		}

		public static void main(String[] args) {
			Tshirt Small = new Tshirt();
			Small.Color = "Gray";
			Small.Material = "Nylon";
			Small.Design = "Casual";
			Small.Size = 25;
			Small.display();
			
			Tshirt Medium = new Tshirt("Blue","Polyster","Sports",30);
			Medium.display();
			
			Tshirt Large = new Tshirt("Black","Casual","Jersey");
			Large.display();
			
		}

	}

