package chainofresponsibility.filters;

public class FaceFilter implements Filter{
	@Override
	public String doFilter(String str) {
		return str.replace(":)", "O(กษ_กษ)O~");
	}

}
