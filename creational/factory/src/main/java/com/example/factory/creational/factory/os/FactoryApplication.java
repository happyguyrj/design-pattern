package com.example.factory.creational.factory.os;

import com.example.factory.creational.factory.os.factory.OSFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {


	public static void main(String[] args) {
		OSFactory osFactory = new OSFactory();
		osFactory.getOS("IOS").spec();
	}

}
