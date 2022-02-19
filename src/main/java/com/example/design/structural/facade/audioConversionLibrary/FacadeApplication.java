package com.example.design.structural.facade.audioConversionLibrary;

import com.example.design.structural.facade.audioConversionLibrary.facade.VideoConversionFacade;

import java.io.File;

public class FacadeApplication {

	public static void main(String[] args) {
		VideoConversionFacade converter = new VideoConversionFacade();
		File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
	}

}
