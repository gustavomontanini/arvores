class No {
    String valor;
    No esquerda, direita;
    int fatorBalanceamento;

    public No(String valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
        this.fatorBalanceamento = 0;
    }
    // Getters e Setters
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public int getFatorBalanceamento() {
        return fatorBalanceamento;
    }

    public void setFatorBalanceamento(int fatorBalanceamento) {
        this.fatorBalanceamento = fatorBalanceamento;
    }
}





