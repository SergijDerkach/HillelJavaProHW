package hw9;

import hw8.CollectionServiseImp;

public interface CustomCollection {
    boolean add(String str);
    int size();
    boolean delete(String str);
    boolean delete(int index);
    String get(int index);
    boolean contains(String str);
    boolean clear();
    boolean addAll(CollectionServiseImp strColl);

    boolean trim();
}
