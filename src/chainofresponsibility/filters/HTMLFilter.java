package chainofresponsibility.filters;

public class HTMLFilter implements Filter{
	@Override
	public String doFilter(String str) {
		return str.replace('<', '[').replace('>', ']');
	}

}
