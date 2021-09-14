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
        System.out.printf("Gato: " + gato);
    }

}
