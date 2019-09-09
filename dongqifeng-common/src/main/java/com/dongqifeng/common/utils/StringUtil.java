package com.dongqifeng.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//字符串工具类
public class StringUtil {
	
	//将字符创转换成html文本
	public static String toHtml(String text) {
		
		String s1 = "<p>";
		String s2 = "</p>";
		String s3 = null;
		String[] split = text.split("(\n\r)");
		
		for (String string : split) {
			 s3 = s1 + string+ s2;
			 System.out.println(s3);
		}

		return s3;
		
	}
	
	//验证手机号
	public static boolean isPhone(String text) {
		
		Pattern pattern = Pattern.compile("^1[3|5|6]\\d{9}$");
		Matcher matcher = pattern.matcher(text);
		if(matcher.matches()) {
			return true;
		}
		return false;
		
	}
	
	//验证邮箱方法
	public static boolean isEmail(String text) {
		
		Pattern pattern = Pattern.compile("^\\d+@\\w{2}\\.com$");
		Matcher matcher = pattern.matcher(text);
		if(matcher.matches()) {
			return true;
		}
		return false;
		
		
	}
	
	//验证空串方法
	

}
