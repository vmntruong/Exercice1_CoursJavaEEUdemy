package com.directmedia.onlinestore.core;

import java.util.HashSet;

import corecom.directmedia.onlinestore.core.entity.*;

public class Startup {
	public static void main(String[] args) {
		HashSet<Work> my_listOfWorks = Catalogue.listOfWorks;
		Work work1 = new Work("Article 1");
		work1.setGenre("M");
		work1.setRelease(2000);
		work1.setSummary("Summary article 1");
		my_listOfWorks.add(work1);
		
		Work work2 = new Work("Article 2");
		work2.setGenre("M");
		work2.setRelease(2010);
		work2.setSummary("Summary article 2");
		my_listOfWorks.add(work2);
		
		Work work3 = new Work("Article 3");
		work3.setGenre("F");
		work3.setRelease(2020);
		work3.setSummary("Summary article 3");
		my_listOfWorks.add(work3);

		for (Work work : my_listOfWorks) {
			System.out.println(work.getTitle() + " (" + work.getRelease() + ")");
		}
	}
}
