class ChatNamesRunner{
public static void main(String[] chat){
	ChatNames.getShopdetalis();
 boolean addChat=ChatNames.addChats("paniPuri");
System.out.println(addChat);
 boolean addPrice=ChatNames.addPrice(20.0);
System.out.println(addPrice);	
addChat=ChatNames.addChats("pani");
System.out.println(addChat);
 addPrice=ChatNames.addPrice(20.0);
System.out.println(addPrice);
 addChat=ChatNames.addChats("puri");
System.out.println(addChat);
 addPrice=ChatNames.addPrice(20.0);
System.out.println(addPrice);
 addChat=ChatNames.addChats("bhale");
System.out.println(addChat);
 addPrice=ChatNames.addPrice(20.0);
System.out.println(addPrice);
 addChat=ChatNames.addChats("Dhai");
System.out.println(addChat);
 addPrice=ChatNames.addPrice(20.0);
System.out.println(addPrice);
 addChat=ChatNames.addChats("Samosa");
System.out.println(addChat);
 addPrice=ChatNames.addPrice(20.0);
System.out.println(addPrice);
ChatNames.getChatNames();
ChatNames.getChatPrice();
}
}