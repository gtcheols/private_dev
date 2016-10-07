package com.callgate.dev.javasimple;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public String action1(){
		return "ACTION1";
	}

	public String action2(){
		return "ACTION2";
	}
	
	public static void main(String[] args){
		System.out.println("Hello JAVA");
		Main obj = new Main();
		System.out.println("ACTION1=[" + obj.action1() + "]");
		System.out.println("ACTION2=[" + obj.action2() + "]");
	}
}
