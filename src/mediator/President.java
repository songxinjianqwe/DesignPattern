package mediator;

import java.util.HashMap;
import java.util.Map;

import mediator.depts.Department;

public class President implements Mediator {

	private Map<String, Department> map = new HashMap<>();

	// 互相持有对方引用
	@Override
	public void register(String dname, Department dept) {
		map.put(dname, dept);
	}

	// 可以传入其他参数，根据参数调用该部门的不同方法
	@Override
	public void command(String dname) {
		Department dept = map.get(dname);
		dept.selfAction();
	}

}
