package com.clover.jvm.gc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreadLockTest {
	public static void createBusiThread() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true)
					;
			}
		}, "testBusiThread");
		thread.start();
	}

	public static void createLockThread(final Object lock) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock) {
					try {
						lock.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}, "testLockThread");

		thread.start();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		createBusiThread();
		br.readLine();
		Object obj = new Object();
		createLockThread(obj);
	}
}
