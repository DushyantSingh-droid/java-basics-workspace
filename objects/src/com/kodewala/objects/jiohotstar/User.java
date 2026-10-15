package com.kodewala.objects.jiohotstar;

public class User {
  String userId;
  String userName;
  String type;
  public static int liveUserCount = 0;
  public User(String _userId,String _userName,String _type) {
	  this.userId = _userId;
	  this.userName = _userName;
	  this.type = _type;
	  
  }
  public User (String _userName,String _type) {
	  super();
	  this.userName = _userName;
	  this.type = _type;
  }
  public User() {
	  
  }
  {
	liveUserCount = liveUserCount + 1;  
  }
}
