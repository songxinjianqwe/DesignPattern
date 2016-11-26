package proxy.remoteproxy.client;

import java.rmi.*;

import proxy.remoteproxy.common.GumballMachineRemote;

public class GumballMonitorTestDrive {

	public static void main(String[] args) {
		String location = "rmi://192.128.0.0/santafe.mightygumball.com/gumballmachine";

		GumballMonitor monitor = null;

		try {
			GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location);
			monitor = new GumballMonitor(machine);
			System.out.println(monitor);
		} catch (Exception e) {
			e.printStackTrace();
		}

		monitor.report();
	}
}
