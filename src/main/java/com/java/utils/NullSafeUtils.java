package com.java.utils;

import java.math.BigDecimal;

/**
 * @author Kiran S
 *
 */
public class NullSafeUtils {

	public static String safeString(String value) {
		return value != null ? value : "";
	}

	public static Long safeLong(Long value) {
		return value != null ? value : 0L;
	}

	public static Integer safeInteger(Integer value) {
		return value != null ? value : 0;
	}

	public static BigDecimal safeBigDecimal(BigDecimal value) {
		return value != null ? value : BigDecimal.ZERO;
	}

}
