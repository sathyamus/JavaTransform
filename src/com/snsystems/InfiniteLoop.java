package com.snsystems;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class InfiniteLoop {

	public static void main(String[] args) {

		while (true) {
			BigDecimal amount1 = new BigDecimal("1000000000.00");
			BigDecimal amount2 = new BigDecimal("1000000000.00");
			BigDecimal amount3 = new BigDecimal("1000000000.00");
			BigDecimal amount4 = new BigDecimal("1000000000.00");
			BigDecimal amount5 = new BigDecimal("1000000000.00");
			BigDecimal amount6 = new BigDecimal("1000000000.00");
			BigDecimal amount7 = new BigDecimal("1000000000.00");
			BigDecimal amount8 = new BigDecimal("1000000000.00");
			
			Map map = new HashMap();
			map.put(amount1, amount1);
			map.put(amount2, amount2);
			map.put(amount3, amount3);
			map.put(amount4, amount4);
			map.put(amount5, amount5);
			map.put(amount6, amount6);
			map.put(amount7, amount7);
		}
	}

}
