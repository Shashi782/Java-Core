class pen{
String name;
int id;
String colour;
double price;

public pen(){
	
	
}

public pen(String name,int id,String colour,double price){

this.name=name;
this.id=id;
this.colour=colour;
this.price=price;
}
public void penInfo(){
	System.out.println("The Pen name is "+this.name);
	System.out.println("The id is "+this.id);
	System.out.println("The colour is "+this.colour);
	System.out.println("The price is "+this.price);
}
}