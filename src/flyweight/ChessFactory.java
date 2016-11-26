package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类（创建相同部分）
 * 
 * @ClassName: ChessFactory
 * @Description: TODO
 * @author NewSong
 * @date 2016年11月26日 下午10:25:29
 *
 */
public class ChessFactory {
	private static Map<String, Chess> map = new HashMap<>();

	public static Chess createChess(String color) {
		Chess c = null;
		if ((c = map.get(color)) != null) {
			return c;
		} else {
			c = new ConcreteChess(color);
			map.put(color, c);
			return c;
		}
	}

}
