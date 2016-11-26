package proxy.remoteproxy.server;

import java.rmi.*;

import proxy.remoteproxy.common.GumballMachineRemote;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		String loc = "192.128.0.0/santafe.mightygumball.com";
		GumballMachineRemote gumballMachine = null;
		try {
			gumballMachine = new GumballMachine(loc, 10);
			Naming.rebind("rmi://" + loc + "/gumballmachine", gumballMachine);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
