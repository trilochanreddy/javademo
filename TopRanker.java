package com.vidvaan.spring.ioc.singleton;

public class TopRanker {
	private static TopRanker ranker = new TopRanker();

	private TopRanker() {
		System.out.println("TopRanker()");
	}

	public static TopRanker getInstance() {
		return ranker;
	}

}
