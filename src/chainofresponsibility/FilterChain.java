package chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

import chainofresponsibility.filters.Filter;
/**
 * 过滤链本身也是一个过滤器，可以将一个过滤器或者多个过滤器加入其中
* @ClassName: FilterChain
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午9:54:31
*
 */
public class FilterChain implements Filter {
	private List<Filter> filters = new ArrayList<>();;

	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}

	public String doFilter(String str) {
		for (Filter filter : filters) {
			str = filter.doFilter(str);
		}
		return str;
	}

}
