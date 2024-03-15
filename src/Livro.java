public class Livro {

    public  String  titulo ;
    public  String  autor ;
    public  double  valor;
    public  Editora  editora ;
    public  int  páginas ;
    public  String  resumo ;
    public  String  tipoCapa ;




    // --- MÉTODOS ---
    public String exibirDados(){
        String dados = "" +
                "--------------" +
                "\nTítulo: " + this.titulo +
                "\nResumo: " + this.resumo +
                "\nPreço: R$ " + this.valor +
                "\nPáginas: " + this.páginas +
                "\nAutor: " + this.autor +
                "\nEditora:" + this.editora.nome +
                "\n---------------";
        return dados;
    }
    public Livro(String titulo){
        this.titulo = titulo;
    }

}
