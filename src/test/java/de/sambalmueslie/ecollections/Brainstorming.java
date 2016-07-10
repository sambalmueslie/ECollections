package de.sambalmueslie.ecollections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Brainstorming {

	@Test
	public void test() {
		final List<String> sample = new LinkedList<>();
		sample.addAll(Arrays.asList("This", "is", "a", "message"));

		sample.stream().filter(t -> t.startsWith("T")).forEach(System.out::println);

		EList.list("This", "is", "a", "message").map(s -> s.charAt(0)).forEach(System.out::print);

		EList.list("This", "is", "a", "message").map(s -> (int) s.charAt(0)).forEach(c -> System.out.print(Integer.toHexString(c) + " "));
	}

}
