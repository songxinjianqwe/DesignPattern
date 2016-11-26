package command.commands;
/**
 * Receiver
* @ClassName: Light
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午4:12:17
*
 */
public class Light implements ElectricAlliances{

	@Override
	public void on() {
		System.out.println("打开电灯");
	}

	@Override
	public void off() {
		System.out.println("关闭电灯");
	}
	
}
