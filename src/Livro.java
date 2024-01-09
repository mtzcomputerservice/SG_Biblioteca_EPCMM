public class Livro {
    String isbn="0000", titulo="Java POO para Iniciantes", autor="Deintel", editora="SP", edicao="4a";
    int ano=2010;


    public String getISBN(){
        return this.isbn;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getEditora(){
        return this.editora;
    }
    public String getEdicao(){
        return this.edicao;
    }
    public int getAno(){
        return this.ano;
    }

    public void setISBN(String isbn){
        this.isbn=isbn;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setEditora(String editora){
        this.editora=editora;
    }
    public void setEdicao(String edicao){
        this.edicao=edicao;
    }
    public void setAno(int ano){
        this.ano=ano;
    }

}
