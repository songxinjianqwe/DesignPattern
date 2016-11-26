package state;

import state.states.HasQuarterState;
import state.states.NoQuarterState;
import state.states.SoldOutState;
import state.states.SoldState;
import state.states.State;
import state.states.WinnerState;

/**
 * 去掉了容易产生问题的if-else
 * 对扩展开放，易于添加新的状态类
 * 
* @ClassName: GumballMachine
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午9:02:55
*
 */
public class GumballMachine {
	int count;
	private State soldState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldOutState;
	private State winnerState;
	
	private State state = soldState;//默认为售空
	
	
	
	public GumballMachine(int numOfGumballs) {
		soldState = new SoldState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldOutState = new SoldOutState(this);
		winnerState = new WinnerState(this);
		this.count = numOfGumballs;
		if(numOfGumballs > 0 ){
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
	}

	public void dispence() {
		state.dispense();
	}

	public int getCount() {
		return count;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public void setState(State state){
		this.state = state;
	}
	
	public void releaseBall(){
		System.out.println("A gumball comes rolling out the slot ...");
		if(count != 0 ){
			count--;
		}
	}
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
