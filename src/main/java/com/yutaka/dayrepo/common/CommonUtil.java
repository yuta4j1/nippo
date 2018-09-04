package com.yutaka.dayrepo.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {

	public static String dateFormat(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String result = sdf.format(date);
		return result;
	}

}
