public interface MyList {
    void add(String s);

    void remove(String s);

    void remove(Integer i);

    void addAll(MyList list);

    Integer size();

    boolean isEmpty();

    void clear();

    String get(Integer i);

    void set(Integer index, String value);

    Integer indexOf(String s);
}
