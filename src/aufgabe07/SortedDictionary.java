package aufgabe07;

/**
 * User: Julian
 * Date: 04.12.13
 * Time: 16:40
 */
public interface SortedDictionary<K extends Comparable<K>, V> {

    V min();
    V max();
    void put(K key, V value);
    void remove(K key);


}