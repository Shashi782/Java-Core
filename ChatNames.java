class ChatNames{
static String shopName="xyz";
static String address="abcd";
static String chatNames[]={"null","null","null","null","null","null"};
static double chatPrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
static int index;
static int value;
public static boolean addChats(String chatName){
System.out.println("The chatNames started");
boolean isChatNameCreated=false;
if(chatNames!=null){
chatNames[index]=chatName;
index++;

isChatNameCreated=true;
}else{
System.out.println("No chatNames found");
}
System.out.println("The chatNames ended");
return isChatNameCreated;
}
public static boolean addPrice(double chatprice){
System.out.println("the price Started");
boolean isChatpriceAdded=false;
if(chatprice > 0.0){

chatPrices[value]=chatprice;
value++;
 
 isChatpriceAdded=true;
 }else{
 System.out.println("The price is not found ");
 }
 System.out.println("the price ended");
 return isChatpriceAdded;
 }
public static void getChatNames(){
System.out.println("The ChatNames are : ");
for(String chatNames :chatNames){
System.out.println(chatNames);
}
}
public static void getChatPrice(){
System.out.println("The ChatPrice are : ");
for(double chatprice:chatPrices){
System.out.println(chatprice);
}
}
public static void getShopdetalis(){
System.out.println("The Shop Name is :"+shopName);
System.out.println("The addres is :"+address);
}
}