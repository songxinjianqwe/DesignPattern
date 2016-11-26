package proxy.protectproxy;
/**
 * 对象村需要配对，每个人可以修改自己的属性，但不能对自己评分
 * 其他人可以对自己评分
* @ClassName: PersonBean
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午9:29:44
*
 */
public interface PersonBean {
	String getName();
	String getGender();
	String getInterests();
	int getHotOrNotRating();
	
	void setName(String name);
	void setGender(String gender);
	void setInterests(String interests);
	void setHotOrNotRating(int rating);
}
