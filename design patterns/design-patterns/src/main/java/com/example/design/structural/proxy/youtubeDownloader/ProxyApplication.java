package com.example.design.structural.proxy.youtubeDownloader;

import com.example.design.structural.proxy.youtubeDownloader.downloader.YouTubeDownloader;
import com.example.design.structural.proxy.youtubeDownloader.proxy.YouTubeCacheProxy;
import com.example.design.structural.proxy.youtubeDownloader.some_cool_media_library.ThirdPartyYouTubeClass;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyApplication {

	public static void main(String[] args) {
		YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
		YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

		long naive = test(naiveDownloader);
		long smart = test(smartDownloader);
		System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
	}

	private static long test(YouTubeDownloader downloader) {
		long startTime = System.currentTimeMillis();

		// User behavior in our app:
		downloader.renderPopularVideos();
		downloader.renderVideoPage("catzzzzzzzzz");
		downloader.renderPopularVideos();
		downloader.renderVideoPage("dancesvideoo");

		// Users might visit the same page quite often.
		downloader.renderVideoPage("catzzzzzzzzz");
		downloader.renderVideoPage("someothervid");

		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.print("Time elapsed: " + estimatedTime + "ms\n");
		return estimatedTime;
	}
}
