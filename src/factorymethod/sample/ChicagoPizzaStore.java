package factorymethod.sample;
/**
 * 具体创建者类
* @ClassName: ChicagoPizzaStore
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午2:20:47
*
 */
public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		}else{
			return null;
		}
	}

}
