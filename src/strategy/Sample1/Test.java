package strategy.Sample1;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Cat[] cats = {
				new Cat(32,21),
				new Cat(21,22),
				new Cat(42,11),
				new Cat(44,30)
		};
		//不同的排序策略，从外部传入
		//按身高排序
		Sort.sort(cats, new MyComparator<Cat>() {
			@Override
			public int compare(Cat t1, Cat t2) {
				return t1.getHeight()-t2.getHeight();
			}
		});
		System.out.println(Arrays.toString(cats));
		//按体重排序
		Sort.sort(cats, new MyComparator<Cat>() {
			@Override
			public int compare(Cat t1, Cat t2) {
				return t1.getWeight()-t2.getWeight();
			}
		});
		System.out.println(Arrays.toString(cats));
	}
}
