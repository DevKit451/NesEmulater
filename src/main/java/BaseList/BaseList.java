package BaseList;

public class BaseList <K,V>{
    public K k;
    public V v;

    public BaseList(K k,V v){this.k=k; this.v=v;}

    public K getk (){return k;}
    public V getv (){return v;}
}
