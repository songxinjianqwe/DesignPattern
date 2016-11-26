package flyweight;
/**
 * 享元模式
* @ClassName: Intro
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午10:17:40
* 内存属于稀缺资源，不要随便浪费。如果有多个完全相同或相似的对象，我们可以通过享元模式，节省内存
* 享元对象能做到共享的关键是区分是内部状态和外部状态。
* 内部状态：可以共享，不会随环境变化而改变
* 外部状态：不可以共享，会随环境变化而改变
* 
* 
* 围棋：每个棋子是一个对象，每个棋子都是一个对象，
* 棋子的颜色形状大小是一样的（对一方而他吧，内部状态），
* 位置是不一样的（外部状态）。
* 
* 
* FlyWeightFactory (持有一个键值对)
* FlyWeight（享元类）
* ConcreteFlyWeight
* UnsharedConcreteFlyWeight
* 
 */
public class Intro {

}
