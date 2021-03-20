import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) throws Exception {
		 Libary biblio = new Libary();
	       
	        biblio.setNome(JOptionPane.showInputDialog("Nome da Biblioteca:"));
	        biblio.setLocal(JOptionPane.showInputDialog("Localiza��o da Biblioteca:"));
	        biblio.createBooks(Integer.parseInt(
	        JOptionPane.showInputDialog("Capacidade de Livros:")));
	       
	        Books book;
	        int opcao = 0;
	        String opcoes =
	          "Biblioteca: "+biblio.getNome()+
	          "\nLocaliza��o: "+biblio.getLocal()+
	          "\n\n***Op��es*** "+
	          "\n1. Cadastrar Livro"+
	          "\n2. Cadastrar Livro No in�cio"+
	          "\n3. Pesquisar Livro (t�tulo)"+
	          "\n4. Listar Livros"+
	          "\n5. Remover �ltimo livro:"+
	          "\n6. Informa��es"+
	          "\n7. Finalizar"+
	          "\n\nSelecione a op��o: ";

	        while (opcao != 7)
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
	            	  String op = JOptionPane.showInputDialog(JOptionPane.showInputDialog(null, "ATEN��O! O primeiro livro ser� excluido. Deseja continuar? pressione ENTER e depois [s/n]"));
	            	  if (op.equals("s")) {
	            		  biblio.includeBookFirst(digitarLivro());
			                JOptionPane.showMessageDialog(null, "Livro Cadastrado!\nTotal: "+
			                        biblio.getQuantidade()+" livro(s)");
	            	  }
			          break; 
	              case 3:
	                  book = biblio.getBookTitle(JOptionPane.showInputDialog("Digite T�tulo do Livro para pesquisar:"));
	                  if (book != null)
	                	  mostrarLivro(book,biblio.getNome());
	                  else
	                      JOptionPane.showMessageDialog(null, "Livro N�o Localizado!");
	                break;
	              case 4:
	                  StringBuffer lista = new StringBuffer();
	                  lista.append("Lista de Livros Cadastrados:\n");
	                  for (int i=0;i<biblio.getQuantidade();i++)
	                  {
	                      book = biblio.getBook(i);
	                      lista.append(book.getEdit()+" - "+
	                              book.getTitulo()+" - "+book.getAutor()+" - "+
	                              book.getYearPub()+" ano de publica��o.\n");
	                  }
	                  lista.append("Total: "+biblio.getQuantidade()+" livro(s)");
	                  JOptionPane.showMessageDialog(null, lista.toString());
	                  break;
	              case 5:
	            	  book = biblio.getBook(biblio.getQuantidade());
	            	  for (int i=0; i<biblio.getQuantidade();i++) {
	            		  book = biblio.getBook(i);
	            		  if (i == biblio.getQuantidade() - 1) {
	            			  JOptionPane.showMessageDialog(null, "O ultimo livro foi removido!");
	            			  biblio.removeLast(book);
	            		  }
	            	  }
			          break; 
	              case 6:
	                    JOptionPane.showMessageDialog(null, "Informa��es da Biblioteca\n"+
	                            "Nome da Biblioteca: "+biblio.getNome()+"\n"+
	                            "Localiza��o: "+biblio.getNome()+"\n"+
	                            "Existem at� o momento\n"+biblio.getQuantidade()+
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
	        liv.setTitulo(JOptionPane.showInputDialog("T�tulo do Livro:"));
	        liv.setAutor(JOptionPane.showInputDialog("Autor do Livro:"));
	        liv.setISBN(JOptionPane.showInputDialog("N�mero ISBN do Livro:"));
	        liv.setYearPub(JOptionPane.showInputDialog("Ano da publica��o:"));
	        liv.setEdit(JOptionPane.showInputDialog("Nome da Editora"));
	        return liv;
	    }
	       
	    static void mostrarLivro(Books x,String bib)
	    {
	        String texto = "Livro:\n"+
	        "\nT�tulo: "+x.getTitulo()+
	        "\nAutor: "+x.getAutor()+
	        "\nISBN: "+x.getISBN()+
	        "\nAnoPubli: "+x.getYearPub()+
	        "\nEditora: "+x.getEdit();
	        JOptionPane.showMessageDialog(null, texto, "Biblioteca: "+bib,
	                JOptionPane.WARNING_MESSAGE);
	    }

	
	}
