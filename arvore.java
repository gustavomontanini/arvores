public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        raiz = new No("A");
        raiz.esquerdo = new No("B");
        raiz.direito = new No("C");

        raiz.esquerdo.esquerdo = new No("D");
        raiz.esquerdo.direito = new No("E");

        raiz.direito.direito = new No("F");
    }
}
