public class List<T> {

    private Node<T> inicio;
    private int quantidade;

    public void inserir(T novo) {
        Node<T> novoNo = new Node<T>(novo);
        if(inicio == null) {
            inicio = novoNo;
        }
        else {
            Node<T> aux = inicio;
            while(aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo= novoNo;
        }
        quantidade++;
    }

    public String toString(){
        String s = "";
        Node<T> aux = inicio;
        while(aux != null) {
            s = s + aux + ",";
            aux = aux.proximo;
        }
        return "[" + s + "]";
    }

    public void print() {
        System.out.println(this);
    }

    public int size() {
        return quantidade;
    }
}