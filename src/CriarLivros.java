public class CriarLivros {

    public  static  void  main ( String [] args ) {
        //Instanciando um objeto => criar o objeto na memória
        // tipoObjeto nomeObjeto = operadorInstanciação construtor;
        // Livro favorito = new Livro();
        Livro  favorito = new  Livro ();
        favorito.titulo = "Ó Hobbit" ;
        favorito.autor = "JRR Talkien" ;
        favorito.valor = 37.27 ;
        favorito.editora = "Harper Collins" ;
        favorito.resumo = "Bilbo era um dos..." ;
        favorito.tipoCapa = "COMUM" ;

        System.out.printf( "Meu livro favorito é:" +
                favorito.titulo + " \n Seu autor é: " + favorito.autor +
                " preço: R$ " + favorito . valor );

        Livro  meuLivro = new  Livro ();
        meuLivro.titulo = "UML 2.0" ;
        meuLivro.valor = 58.98 ;
        System.out.println( " \n \n Titulo: " + meuLivro.titulo );
        System.out.println ( "Autor: " + meuLivro.autor );

    }
}
