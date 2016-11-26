package memento;
/**
 * 备忘录模式（保存与恢复现场）
* @ClassName: Intro
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午10:26:20
* Originate是实体类，并负责创建和恢复Memento（比如JavaBean）
  Memento负责保存对象的状态
  CareTaker 负责存储Memento（一个或一系列）（多条历史记录）

  Originate除了对象的属性和setter getter之外，还有创建和恢复Memento的方法
  Memento也持有对象的所有属性和setter getter，它的构造方法是由Originate对象得到其内部状态。
  CareTaker持有一个或一组Memento，并提供setter and getter

 */
public class Intro {

}
