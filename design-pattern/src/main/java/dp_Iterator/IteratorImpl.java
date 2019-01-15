package dp_Iterator;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author archmagece
 * @since 2017-01-14 18
 */
@Slf4j
public class IteratorImpl<T> implements Iterator<T>{

	private Aggregate<T> aggregate;
	private AtomicInteger aint = new AtomicInteger(0);

	public IteratorImpl(Aggregate<T> aggregate){
		this.aggregate = aggregate;
	}

	@Override
	public boolean hasNext() {
		if(aggregate.get(aint.intValue())!=null){
			return true;
		}
		return false;
	}

	@Override
	public T next() {
		return aggregate.get(aint.getAndIncrement());
	}
}
