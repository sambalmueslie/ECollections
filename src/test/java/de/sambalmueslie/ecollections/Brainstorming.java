package de.sambalmueslie.ecollections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import de.sambalmueslie.ecollections.internal.EFactory;

public class Brainstorming {

	@Test
	public void test() {
		final List<String> sample = new LinkedList<>();
		sample.addAll(Arrays.asList("This", "is", "a", "message"));

		sample.stream().filter(t -> t.startsWith("T")).forEach(System.out::println);

		final EList<String> mySample = EFactory.decorate(sample);
		mySample.filter(t -> t.startsWith("T")).forEach(System.out::println);
	}

}
