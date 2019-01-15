package dp_Iterator;

/**
 * @author archmagece
 * @since 2017-01-11 22
 */
public interface Aggregate<T> {
	Iterator iterator();

	T get(int i);
}
