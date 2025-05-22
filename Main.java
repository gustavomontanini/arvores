public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        arvore.inserirRaiz("A");
        arvore.inserirEsquerda(arvore.raiz, "B");
        arvore.inserirDireita(arvore.raiz, "C");
        arvore.inserirEsquerda(arvore.raiz.esquerda, "D");
        arvore.inserirDireita(arvore.raiz.esquerda, "E");
        arvore.inserirDireita(arvore.raiz.direita, "F");

        System.out.println("Contagem de nós: " + arvore.contarNos());

        System.out.print("Pré-Ordem: ");
        arvore.preOrdem(); 
        System.out.println();

        System.out.print("Em-Ordem: ");
        arvore.emOrdem(); 
        System.out.println();

        System.out.print("Pós-Ordem: ");
        arvore.posOrdem(); 
        System.out.println();

        System.out.print("Em Nível: ");
        arvore.emNivel();
        System.out.println();
    }
}
