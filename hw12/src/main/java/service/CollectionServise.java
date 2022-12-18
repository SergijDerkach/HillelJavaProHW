package service;

public interface CollectionServise {

    boolean add(String o);
    boolean add(int index, String o);
    boolean delete(String o);
    String get(int index);

    int size();

    boolean contains(String o);
    boolean clear();

    boolean equals(Object o);
    int hashCode();
}
