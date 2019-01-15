package dp_Iterator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author archmagece
 * @since 2017-01-14 18
 */
@Slf4j
public class AggregateImpl<T> implements Aggregate {

	private T[] elements;

	public AggregateImpl(T ... elements){
		this.elements = elements;
	}

	@Override
	public Iterator<T> iterator() {
		return new IteratorImpl<>(this);
	}

	@Override
	public T get(int i) {
		if(elements.length>i){
			return elements[i];
		}
		return null;
	}
}
