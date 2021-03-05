public class Elem<F> {
    public F value;
    public Elem<F> next;

    public Elem(F value, Elem<F> next){
        this.value = value;
        this.next = next;
    }
}
