package state.states;
/**
 * 实现一个糖果机
 * 没有25分 --投入--> 有25分钱 --转动曲柄--> 售出糖果 --发放糖果-->糖果数量<0  糖果售罄
 * 		  <--退回25分钱--		                                                                 糖果数量>0  没有25分钱
 * 	  	  
* @ClassName: State
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午8:42:04
*
 */
public interface State {
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
}
