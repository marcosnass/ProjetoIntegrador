import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) throws Exception {
		 Libary biblio = new Libary();
	       
	        biblio.setNome(JOptionPane.showInputDialog("Nome da Biblioteca:"));
	        biblio.setLocal(JOptionPane.showInputDialog("Localização da Biblioteca:"));
	        biblio.createBooks(Integer.parseInt(
	        JOptionPane.showInputDialog("Capacidade de Livros:")));
	       
	        Books book;
	        int opcao = 0;
	        String opcoes =
	          "Biblioteca: "+biblio.getNome()+
	          "\nLocalização: "+biblio.getLocal()+
	          "\n\n***Opções*** "+
	          "\n1. Cadastrar Livro"+
	          "\n2. Cadastrar Livro No início"+
	          "\n3. Pesquisar Livro (título)"+
	          "\n4. Listar Livros"+
	          "\n5. Remover último livro:"+
	          "\n6. Informações"+
	          "\n7. Ordenar em ordem alfabética"+
	          "\n8. Finalizar"+
	          "\n\nSelecione a opção: ";

	        while (opcao != 8)
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
            		  biblio.includeBookFirst(digitarLivro());
		                JOptionPane.showMessageDialog(null, "Livro Cadastrado no início!\nTotal: "+
		                        biblio.getQuantidade()+" livro(s)");
		                
			          break; 
	              case 3:
	                  book = biblio.getBookTitle(JOptionPane.showInputDialog("Digite Título do Livro para pesquisar:"));
	                  if (book != null)
	                	  showBook(book,biblio.getNome());
	                  else
	                      JOptionPane.showMessageDialog(null, "Livro Não Localizado!");
	                break;
	              case 4:
	                  StringBuffer lista = new StringBuffer();
	                  lista.append("Lista de Livros Cadastrados:\n");
	                  for (int i=0;i<biblio.getQuantidade();i++)
	                  {
	                      book = biblio.getBook(i);
	                      lista.append(book.getEdit()+" - "+
	                              book.getTitulo()+" - "+book.getAutor()+" - "+
	                              book.getYearPub()+" ano de publicação.\n");
	                  }
	                  lista.append("Total: "+biblio.getQuantidade()+" livro(s)");
	                  JOptionPane.showMessageDialog(null, lista.toString());
	                  break;
	              case 5:
	            	  for (int i=0; i<biblio.getQuantidade();i++) {
	            		  book = biblio.getBook(i);
	            		  if (i == biblio.getQuantidade() - 1) {
	            			  JOptionPane.showMessageDialog(null, "O ultimo livro foi removido!");
	            			  biblio.removeLast(book);
	            		  }
	            	  }
			          break; 
	              case 6:
	                    JOptionPane.showMessageDialog(null, "Informações da Biblioteca\n"+
	                            "Nome da Biblioteca: "+biblio.getNome()+"\n"+
	                            "Localização: "+biblio.getNome()+"\n"+
	                            "Existem até o momento\n"+biblio.getQuantidade()+
	                            " livro(s) cadastrado(s)");
	                    break;
	              case 7:
		            	ArrayList<Books> list = new ArrayList<Books>();
		            	StringBuffer list1 = new StringBuffer();
		      	        for (int i=0;i<biblio.getQuantidade();i++) {
		      	        	book = biblio.getBook(i);
		      	        	list.add(book);
		      	        }
		      	        Collections.sort(list, new ComparatorName());
		      	        list1.append("Lista de Livros Ordenados:\n");
					    int cont = 0;
		      	        for(Books b : list) {
							list1.append(b.getEdit()+" - "+
		                              b.getTitulo()+" - "+b.getAutor()+" - "+
		                              b.getYearPub()+" ano de publicação.\n");
		      	        }
		                JOptionPane.showMessageDialog(null, list1.toString());
		      			break;
	            }
	        }
	        JOptionPane.showMessageDialog(null, "End program");
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
	       
	    static void showBook(Books x,String bib)
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
