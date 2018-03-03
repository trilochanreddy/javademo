package com.vidvaan.spring.ioc.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		System.out.println(TopRanker.getInstance());
		System.out.println(TopRanker.getInstance());
		System.out.println(TopRanker.getInstance());
		System.out.println(TopRanker.getInstance());
		System.out.println(TopRanker.getInstance());
	}
}
