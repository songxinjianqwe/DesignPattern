package mediator;

import mediator.depts.Department;

public interface Mediator {
	void register(String dname,Department dept);
	void command(String dname);
}
