import java.util.Arrays;

class Chatshopp{
static String name="sss";
static String ownerName="aaa";
static String chatNames[]={null,null,null,null,null,null};

static int chatNameindex;

public static boolean createchatName(String chatName){
System.out.println(" iscreatename started");
  boolean isChatNameCreated=false;
  if(chatNameindex<chatNames.length){
  if(chatName!=null){
  chatNames[chatNameindex]=chatName;
  chatNameindex++;
  isChatNameCreated= true;
  }else
  System.out.println("chat name is null cannot be defined");
  }else{
	  System.out.println("no more chats are available");
  }
System.out.println(" iscreatename ended");
return isChatNameCreated;
}


public static void getchatName(){
	System.out.println("the avilable chatnames are");
for( String chatName : chatNames)
System.out.println(chatName);
return;
}

public static boolean chatUpdated(String oldName,String newName){
	System.out.println("ischatUpdated is started");
	boolean ischatUpdated=false;
	for(int chatNameindex=0;chatNameindex<chatNames.length;chatNameindex++){
		if(oldName==chatNames[chatNameindex]){
			chatNames[chatNameindex]=newName;
			ischatUpdated=true;
		}
	}
	if(ischatUpdated==false){
		System.out.println(oldName +"notfound");
	}
	System.out.println("ischatUpdated is ended");
	return ischatUpdated;
}
public static boolean  deleteChatName(String chatNameDelete){
	System.out.println("ChatNameDelete Started");
	boolean isChatNameDeleted=false;
	int newIndex,oldIndex;
	for(newIndex=0,oldIndex=0; oldIndex<chatNames.length;oldIndex++){
		if(chatNames[oldIndex]!=chatNameDelete){
			
			chatNames[newIndex]=chatNames[oldIndex];
			newIndex++;
			
		}
	}
	chatNames=Arrays.copyOf(chatNames,newIndex);
	if(chatNames !=null){
		isChatNameDeleted=true;
	}
	if(isChatNameDeleted==false){
		System.out.println( chatNameDelete +"not found");
	}
	System.out.println("ChatNameDelete Ended ");
	return isChatNameDeleted;
	
	}

}