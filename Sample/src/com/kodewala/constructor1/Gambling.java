package com.kodewala.constructor1;

public class Gambling {
  int winning;
  String game;
  int hit;
  String win;
  Gambling(int _winning,String _game,int _hit,String _win)
  {
	  this(_win);
	  this.winning = _winning;
	  this.game = _game;
	  this.hit = _hit;
  }
  Gambling(String _win)
  {
	  this.win = _win;
	  System.out.println("Inide Gambling(String _win)");
  }
}
