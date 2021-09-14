package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
//        System.out.printf("Hello World");
//        int a = 5;
//        int b = 3;
//        System.out.println("Soma: "+(a+b));
        Gato gato = new Gato();
        gato.setNome("Tom Cat");
        gato.setCor("Preto/Branco");
        gato.setIdade(3);
        System.out.println("Gato: " + gato);
        Livro livro = new Livro("Arquitetura Limpa","Robert C. Martin",400);
        System.out.println("Livro: "+livro);;
    }



}

 class Livro {
    private String nomeLivro;
    private String autor;
    private int numeroPaginas;

    public Livro(String nomeLivro, String autor, int numeroPaginas) {
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeLivro=" + nomeLivro +
                ", autor=" + autor +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
