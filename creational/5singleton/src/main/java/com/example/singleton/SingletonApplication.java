package com.example.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
				"If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
				"RESULT:" + "\n");
		SingleThreadedSingleton singleton = SingleThreadedSingleton.getInstance("SingleThreadedSingleton - FOO");
		SingleThreadedSingleton anotherSingleton = SingleThreadedSingleton.getInstance("SingleThreadedSingleton - BAR");
		System.out.println(singleton.value);
		System.out.println(anotherSingleton.value);

		Thread threadFoo = new Thread(new ThreadFoo());
		Thread threadBar = new Thread(new ThreadBar());
		threadFoo.start();
		threadBar.start();

		Thread threadmFoo = new Thread(new ThreadMFoo());
		Thread threadmBar = new Thread(new ThreadMBar());
		threadmFoo.start();
		threadmBar.start();
	}

	static class ThreadFoo implements Runnable {
		@Override
		public void run() {
			MultiThreadedSingleton singleton = MultiThreadedSingleton.getInstance("MultiThreadedSingleton - FOO");
			System.out.println(singleton.value);
		}
	}

	static class ThreadBar implements Runnable {
		@Override
		public void run() {
			MultiThreadedSingleton singleton = MultiThreadedSingleton.getInstance("MultiThreadedSingleton - BAR");
			System.out.println(singleton.value);
		}
	}

	static class ThreadMFoo implements Runnable {
		@Override
		public void run() {
			ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("ThreadSafeSingleton - FOO");
			System.out.println(singleton.value);
		}
	}

	static class ThreadMBar implements Runnable {
		@Override
		public void run() {
			ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("ThreadSafeSingleton - BAR");
			System.out.println(singleton.value);
		}
	}
}
