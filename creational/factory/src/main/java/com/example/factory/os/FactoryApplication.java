package com.example.factory.os;

import com.example.factory.os.factory.OSFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {


	public static void main(String[] args) {
		OSFactory osFactory = new OSFactory();
		osFactory.getOS("IOS").spec();
	}

}
