package com.design.patterns.singleton;

public class Client {

	public static void main(String[] args) {
		
		ApplicationData data1 = ApplicationData.INSTANCE;
		data1.addData("1", "One");
		
		ApplicationData data2 = ApplicationData.INSTANCE;
		data2.addData("2", "Two");
				
		System.out.println(data1 == data2);
		System.out.println(data1.appData == data2.appData);
		System.out.println(data1.appData.hashCode());
		System.out.println(data2.appData.hashCode());
		
		data1.appData.entrySet().stream().forEach(item -> System.out.println(item.getKey() +" : " + item.getValue()));
		
		
	}
}
