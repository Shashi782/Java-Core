class ChatshoppRunner{
public static void main(String[] shop){
	
boolean addedchat=Chatshopp.createchatName("Bhelpuri");
System.out.println("the given chat is :"+addedchat);

addedchat=Chatshopp.createchatName("panipuri");
System.out.println("the given chat is :"+addedchat);


addedchat=Chatshopp.createchatName("sev puri");
System.out.println("the given chat is :"+addedchat);

addedchat=Chatshopp.createchatName("masala lpuri");
System.out.println("the given chat is :"+addedchat);

addedchat=Chatshopp.createchatName("tikki puri");
System.out.println("the given chat is :"+addedchat);

addedchat=Chatshopp.createchatName("dahi puri");
System.out.println("the given chat is :"+addedchat);


Chatshopp.getchatName();

boolean nextchat=Chatshopp.chatUpdated("tikki puri","kachori");
System.out.println("the given chat is" +nextchat);



boolean deletchat=Chatshopp.deleteChatName("sev puri");
Chatshopp.getchatName();


}
}