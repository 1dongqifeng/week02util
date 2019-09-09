import com.dongqifeng.common.utils.StringUtil;

public class Test {
	public static void main(String[] args) {
		boolean phone = StringUtil.isPhone("1644670112");
		System.out.println(phone);
		
		boolean email = StringUtil.isEmail("148qq.com");
		System.out.println(email);
		
		StringUtil.toHtml("123 dsadas");
		
	}
	

}
