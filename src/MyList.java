public interface MyList {
    void add(String s);
    void remove(String s);
    void remove(Integer i);
    void addAll(MyList list);
    Integer size();
    boolean isEmpty();
    int Clear();
    String get(Integer i);
}
