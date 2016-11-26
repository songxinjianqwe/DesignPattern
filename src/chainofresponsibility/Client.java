package chainofresponsibility;

import chainofresponsibility.filters.FaceFilter;
import chainofresponsibility.filters.HTMLFilter;
import chainofresponsibility.filters.SensitiveFilter;

public class Client {
	public static void main(String[] args) {
		String msg = "<script>,¸ò¸ò¸ò¸ò¸ò,:)";
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter()).addFilter(new FaceFilter());
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new SensitiveFilter());
		fc.addFilter(fc2);
		MessageProcessor pro = new MessageProcessor(fc);
		pro.setMsg(msg);
		System.out.println(pro.process());
	}

}
