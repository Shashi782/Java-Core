class SimCard{

   String name;
   String plan;
   
   public  SimCard(String name,String plan){
	   this.name=name;
	   this.plan=plan;
   }
   public void getCommunication(){
   System.out.println("The sim name is "+this.name);
   System.out.println("The plan is "+this.plan);




}
}