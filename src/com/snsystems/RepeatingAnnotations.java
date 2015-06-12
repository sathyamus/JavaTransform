package com.snsystems;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RepeatingAnnotations {

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Filters {
		Filter[] value();
		
		// Filter filterName();
		
	}

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	@Repeatable(Filters.class)
	public @interface Filter {
		
		String value();
		
//		default String filterName() {
//			return val;
//		}
		
	}

	@Filter("filter - 1")
	@Filter("filter - 2")
	@Filter("filter - 3")
	@Filter("filter - 4")
	@Filter("filter - 5")
	public interface Filterable {

	}

	public static void main(String[] args) {
		for(Filter filter : Filterable.class.getAnnotationsByType(Filter.class)) {
			System.out.println(filter.value());
		}
	}
}
