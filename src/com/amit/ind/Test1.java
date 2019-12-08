package com.amit.ind;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) throws IOException {

		String data = String.join("", Files.readAllLines(Paths.get("D:\\mytext.txt")));

		Arrays.asList(data.split(("\\s+")))
		.stream()
		.collect(Collectors.groupingBy(str -> str))
		.forEach((text, list) -> {
					System.out.println(String.format("Word: %s - Occur: %d", text, list.size()));
				});
		
		
		//-----------------------------------------
		double d = 3.51f;
		float f = 1.99f;
		int i = (int)d + (int)f;
		System.out.println(i);
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("hello " + s1 == s2);
	}

}
