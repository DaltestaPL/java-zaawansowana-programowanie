package org.sda.task5;

import java.util.*;

/**
 * ZADANIE 5.
 * Zaimplementuj klasę SDAHashSet , która będzie implementować logikę HashSet.
 * W tym celu zaimplementuj obsługę metod:
 * • add
 * • remove
 * • size
 * • contains
 * • clear
 */
public class SDAHashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, java.io.Serializable {

    private Map<Integer, E> map = new HashMap<>();

    public SDAHashSet() {}


    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    public boolean add(E value) {
        if (!map.containsKey(value.hashCode())) {
            map.put(value.hashCode(), value);
            return true;
        }
        return false;
    }

    public boolean remove(Object value) {
        return map.remove(value.hashCode(), value);
    }

    public int size() {
        return map.size();
    }

    public boolean contains(Object value) {
        return map.containsValue(value);
    }

    @Override
    public void clear() {
        map.clear();
    }
}
