class Battery{

   String name;
   String weight;
   
   
   public Battery(String name,String weight){
    
	  this.name=name;
	  this.weight=weight;
	  
   }
   
   public void displayInfo(){
	   System.out.println("The name of the battery is :"+this.name);
	   System.out.println("The Weight of the battery is :"+this.weight);
	 
   }

}