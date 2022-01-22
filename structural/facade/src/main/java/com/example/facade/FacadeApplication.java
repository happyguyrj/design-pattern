package com.example.facade;

import com.example.facade.facade.VideoConversionFacade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class FacadeApplication {

	public static void main(String[] args) {
		VideoConversionFacade converter = new VideoConversionFacade();
		File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
	}

}
