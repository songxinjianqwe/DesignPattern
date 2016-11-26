package observer.sample2;
/**
 * 气象站
* @ClassName: Subject
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午1:11:12
*
 */
public interface Subject {
	void registerObserver(Observer_2 o);
	void removeObserver(Observer_2 o);
	void notifyObservers();
}
