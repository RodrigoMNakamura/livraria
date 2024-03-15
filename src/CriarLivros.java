public class CriarLivros {

    public  static  void  main ( String [] args ) {
        //Instanciando um objeto => criar o objeto na memória
        // tipoObjeto nomeObjeto = operadorInstanciação construtor;
        // Livro           favorito = new Livro();
        //Instanciar editora
        Editora editora = new Editora();
        editora.nome = "Harper Collins";
        editora.representante = "Joao";
                Livro  favorito = new  Livro ("Ó Hobbit");
        //favorito.titulo = "Ó Hobbit" ;
        favorito.autor = "JRR Talkien" ;
        favorito.valor = 37.27 ;
        favorito.editora = editora;
        favorito.resumo = "Bilbo era um dos..." ;
        favorito.tipoCapa = "COMUM" ;

        System.out.printf( "Meu livro favorito é:" +
                favorito.titulo + " \n Seu autor é: " + favorito.autor +
                " preço: R$ " + favorito . valor );
        System.out.println(favorito.exibirDados());

        Livro  meuLivro = new  Livro ("UML 2.0");
        meuLivro.titulo = "UML 2.0" ;
        meuLivro.valor = 58.98 ;
        meuLivro.editora = editora;
        //System.out.println( " \n \n Titulo: " + meuLivro.titulo );
        //System.out.println ( "Autor: " + meuLivro.autor );
        System.out.println(meuLivro.exibirDados());
    }
}
