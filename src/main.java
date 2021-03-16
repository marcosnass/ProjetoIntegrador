import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) throws Exception {
		 Libary biblio = new Libary();
	       
	        biblio.setNome(JOptionPane.showInputDialog("Nome da Biblioteca:"));
	        biblio.setLocal(JOptionPane.showInputDialog("Localização da Biblioteca:"));
	        biblio.criaLivros(Integer.parseInt(
	        JOptionPane.showInputDialog("Capacidade de Livros:")));
	       
	        Books book;
	        int opcao = 0;
	        String opcoes =
	          "Biblioteca: "+biblio.getNome()+
	          "\nLocalização: "+biblio.getLocal()+
	          "\n\n***Opções*** "+
	          "\n1. Cadastrar Livro"+
	          "\n2. Pesquisar Livro (título)"+
	          "\n3. Listar Livros"+
	          "\n4. Informações"+
	          "\n5. Finalizar"+
	          "\n\nSelecione a opção: ";

	        while (opcao != 5)
	        {
	            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,opcoes,
	                    "Biblioteca "+biblio.getNome(),JOptionPane.QUESTION_MESSAGE));

	            switch(opcao)
	            {
	              case 1:
	                biblio.incluirLivro(digitarLivro());
	                JOptionPane.showMessageDialog(null, "Livro Cadastrado!\nTotal: "+
	                        biblio.getQuantidade()+" livro(s)");
	                break;
	              case 2:
	                  book = biblio.obterLivro(JOptionPane.showInputDialog("Digite Título do Livro para pesquisar:"));
	                  if (book != null)
	                	  mostrarLivro(book,biblio.getNome());
	                  else
	                      JOptionPane.showMessageDialog(null, "Livro Não Localizado!");
	                break;
	              case 3:
	              {
	                  StringBuffer lista = new StringBuffer();
	                  lista.append("Lista de Livros Cadastrados:\n");
	                  for (int i=0;i<biblio.getQuantidade();i++)
	                  {
	                      book = biblio.getLivro(i);
	                      lista.append(book.getEdit()+" - "+
	                              book.getTitulo()+" - "+book.getAutor()+" - "+
	                              book.getYearPub()+" ano de publicação.\n");
	                  }
	                  lista.append("Total: "+biblio.getQuantidade()+" livro(s)");
	                  JOptionPane.showMessageDialog(null, lista.toString());
	                  break;
	              }
	              case 4:
	                    JOptionPane.showMessageDialog(null, "Informações da Biblioteca\n"+
	                            "Nome da Biblioteca: "+biblio.getNome()+"\n"+
	                            "Localização: "+biblio.getNome()+"\n"+
	                            "Existem até o momento\n"+biblio.getQuantidade()+
	                            " livro(s) cadastrado(s)");
	                    break;
	            }
	        }
	        System.out.println("# Fim do Programa #");
	        System.out.println("bye...");
	    }
	   
	    static Books digitarLivro()
	    {
	        Books liv = new Books();
	        liv.setTitulo(JOptionPane.showInputDialog("Título do Livro:"));
	        liv.setAutor(JOptionPane.showInputDialog("Autor do Livro:"));
	        liv.setISBN(JOptionPane.showInputDialog("Número ISBN do Livro:"));
	        liv.setYearPub(JOptionPane.showInputDialog("Ano da publicação:"));
	        liv.setEdit(JOptionPane.showInputDialog("Nome da Editora"));
	        return liv;
	    }
	       
	    static void mostrarLivro(Books x,String bib)
	    {
	        String texto = "Livro:\n"+
	        "\nTítulo: "+x.getTitulo()+
	        "\nAutor: "+x.getAutor()+
	        "\nISBN: "+x.getISBN()+
	        "\nAnoPubli: "+x.getYearPub()+
	        "\nEditora: "+x.getEdit();
	        JOptionPane.showMessageDialog(null, texto, "Biblioteca: "+bib,
	                JOptionPane.WARNING_MESSAGE);
	    }

	
	}
