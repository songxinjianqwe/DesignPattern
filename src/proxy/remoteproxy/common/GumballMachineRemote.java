package proxy.remoteproxy.common;

import java.rmi.*;

import proxy.remoteproxy.server.State;
 
public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
