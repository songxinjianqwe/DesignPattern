package singleton;
/**
 * 双重检查加锁
* @ClassName: Double_Checked_Locking
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午3:55:57
* 使用了volatile变量后，就能保证先行发生关系（happens-before relationship）。
* 对于volatile变量_instance，所有的写（write）都将先行发生于读（read）
 */
public class Double_Checked_Locking {
	private static volatile Double_Checked_Locking instance;
	private Double_Checked_Locking(){
		
	}
	
	public static Double_Checked_Locking getInstance(){
		if(instance == null){
			synchronized (Double_Checked_Locking.class) {
				if(instance == null){
					instance = new Double_Checked_Locking();
				}
			}
		}
		return instance;
	}
	
	
}
