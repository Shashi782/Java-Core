class Car{
	String Name;
	String Color;
	int  Price;
	String Purchacedate;
	

public Car(String name,String color,int price,String purchacedate){
//parameterized constrcutor.
System.out.println("The Car Deatiles are");
this.Name=name;
this.Color=color;
this.Price=price;
this.Purchacedate=purchacedate;
}

public void carDetalies(){
System.out.println("The Car Name is :"+this.Name);
System.out.println("The Color is :"+this.Color);
System.out.println("the Price is :"+this.Price);
System.out.println("The purchacedate is :"+this.Purchacedate);


}
}