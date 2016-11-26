package command.commands;
/**
 * Receiver
* @ClassName: Garage
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午4:12:06
*
 */
public class Garage implements ElectricAlliances {

	@Override
	public void on() {
		System.out.println("打开车库门");
	}

	@Override
	public void off() {
		System.out.println("关闭车库门");
	}

}
