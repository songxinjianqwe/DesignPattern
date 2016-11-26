package chainofresponsibility.filters;

public class SensitiveFilter implements Filter{
	@Override
	public String doFilter(String str) {
		return str.replace("被就业", "就业").replace("蛤", "哈");
	}

}
