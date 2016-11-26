package chainofresponsibility;

import chainofresponsibility.filters.Filter;

public class MessageProcessor {
	private String msg;
	private Filter filter;
	public MessageProcessor(Filter fc){
		this.filter = fc;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String process() {
		return filter.doFilter(msg);
	}

}
