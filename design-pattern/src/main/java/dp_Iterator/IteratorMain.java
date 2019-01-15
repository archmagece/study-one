package dp_Iterator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author archmagece
 * @since 2017-01-14 19
 */
@Slf4j
public class IteratorMain {
	public static void main(String[] args) {
		System.out.println("한글");
		Iterator<Element> iterator = new AggregateImpl<>(
				new Element("아템1"),
				new Element("아템2"),
				new Element("아템3"),
				new Element("아템4"),
				new Element("아템5")
		).iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
