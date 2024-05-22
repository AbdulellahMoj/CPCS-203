public class Pair <T> {
private T Element;
public Pair(T element){
this.Element = element;
}

public T getElement(){
    return this.Element;
}

public void setElement(T Element) {
    this.Element = Element;
}

public void displayElement(){
    System.out.println("Element: "+ Element);
}

}
