import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) throws Exception {
			
		 	Libary biblio = new Libary();
	        
	        int opcao = 0;
	        String opcoes =
	          "\n\n****OP��ES****"+
	          "\n1. Cadastrar Livro"+
	          "\n2. Cadastrar Livro no in�cio"+
	          "\n3. Cadastrar Livro no final"+
	          "\n4. Pesquisar Livro (t�tulo)"+
	          "\n5. Listar Livros"+
	          "\n6. Remover �ltimo livro:"+
	          "\n7. Remover pelo �ndice:"+
	          "\n8. Informa��es"+
	          "\n9. Ordenar em ordem alfab�tica"+
	          "\n10. Finalizar"+
	          "\n\nSelecione a op��o: ";
	        
	        Books book;
	        Author author = new Author();
	        
	        while (opcao != 10)
	        {
	            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,opcoes));
	            
	            switch(opcao)
	            {
	              case 1:
	            	  	int size = biblio.size();
	            	  	Boolean answer = false;
	            	  	Books newBook = digitarLivro();
	            		try {
	                		
	                		if(size == 0) {
	                			biblio.includeBook(newBook);
	                			JOptionPane.showMessageDialog(null, "Livro Cadastrado!!");
	                			break;
	                		}
	                		
                			if(size > 0) {
	                		  for (int i=0;i<size;i++)
			                  {
			                      book = biblio.getBook(i);
			                      if(book.getTitle().equals(newBook.getTitle())) {
			                    	  answer = true;
			                    	  break;
			                      }
			                  }
	                		} 
                		if(answer == true) {
                			throw new ExcecaoDeLivroJaExistente(newBook.getTitle());
                		}else {
                			 biblio.includeBook(newBook);
	                			JOptionPane.showMessageDialog(null, "Livro Cadastrado!!");
	                			break;
                		}
	                		
	                	}catch(ExcecaoDeLivroJaExistente e) {
	                		JOptionPane.showMessageDialog(null, e.toString());
	                	}
	            		break;
	              
	              case 2:
	            	  size = biblio.size();
	            	
	            	  answer = false;
	            	  newBook = digitarLivro();
	            		try {
	                		
	                		if(size == 0) {
	                			biblio.includeBookFirst(newBook, 0);
	     		                JOptionPane.showMessageDialog(null, "Livro Cadastrado na primeira posi��o!!");
	     		                break;
	                		}
	                		
	          			if(size > 0) {
	                		  for (int i=0;i<size;i++)
			                  {
			                      book = biblio.getBook(i);
			                      if(book.getTitle().equals(newBook.getTitle())) {
			                    	  answer = true;
			                    	  break;
			                      }
			                  }
	                		} 
              		if(answer == true) {
              			throw new ExcecaoDeLivroJaExistente(newBook.getTitle());
              		}else {
              			 biblio.includeBookFirst(newBook, 0);
 		                JOptionPane.showMessageDialog(null, "Livro Cadastrado na primeira posi��o!!");
 		                break;
              		}
	                		
	                	}catch(ExcecaoDeLivroJaExistente e) {
	                		JOptionPane.showMessageDialog(null, e.toString());
	                	}
	            	  
		          break; 
	              case 3:
	            	  size = biblio.size();
	            	
	            	  answer = false;
	            	  newBook = digitarLivro();
	            		try {
	                		
	                		if(size == 0) {
	                			biblio.includeBookLast(newBook, size);
	     		                JOptionPane.showMessageDialog(null, "Livro Cadastrado na �ltima posi��o!!");
	     		                break;
	                		}
	                		
	          			if(size > 0) {
	                		  for (int i=0;i<size;i++)
			                  {
			                      book = biblio.getBook(i);
			                      if(book.getTitle().equals(newBook.getTitle())) {
			                    	  answer = true;
			                    	  break;
			                      }
			                  }
	                		} 
              		if(answer == true) {
              			throw new ExcecaoDeLivroJaExistente(newBook.getTitle());
              		}else {
              			 biblio.includeBookLast(newBook, size);
 		                JOptionPane.showMessageDialog(null, "Livro Cadastrado na �ltima posi��o!!");
 		                break;
              		}
	                		
	                	}catch(ExcecaoDeLivroJaExistente e) {
	                		JOptionPane.showMessageDialog(null, e.toString());
	                	}
	            	  
		          break; 
	              case 4:
		                  book = biblio.getBookTitle(JOptionPane.showInputDialog("Digite T�tulo do Livro para pesquisar:"));
		                  try {
			                  if (book != null) {
			                	  showBook(book);
			                	  break;
			                  } else {
			                	  throw new ExcecaoDeLivroNaoEncontrado();
			                  }
		                  } catch(ExcecaoDeLivroNaoEncontrado e) {
		                	  JOptionPane.showMessageDialog(null, e.toString());
		                  }
			          break; 
	              case 5:
	            	  size = biblio.size();
	            	  {
		                  StringBuffer lista = new StringBuffer();
		                  lista.append("Lista de Livros Cadastrados:\n");
		                  
		                  for (int i=0;i<size;i++)
		                  {
		                      book = biblio.getBook(i);
		                      lista.append("-----------------------------------------------------\n"
		                      		+ "Info do livro, " + book.getTitle() + "\n" + book + "\n"
		                      		+ "Info Autor\n" + book.getAutor() + "\n");
		                  }
		                  lista.append("Total: "+ size +" livro(s)");
		                  JOptionPane.showMessageDialog(null, lista.toString());
		              }
	                  break;
	              case 6:
	              {
            			 biblio.removeLast();
            			 JOptionPane.showMessageDialog(null, "O �ltimo livro foi removido!");
			                  
	              } 	 
			          break; 
	              case 7:
	              {		
	            	 
	            	 try {
	            		 size = biblio.size();
		            	 int indice = Integer.parseInt(JOptionPane.showInputDialog("�ndice que deseja remover:"));
		            	
		            	 if(size > 0) {
		            		 size--;
		            	 }
		            	 
	            		 if (indice < 0) {
	            			 throw new ExcecaoDeLivroNaoEncontrado();
		                  } 
            			  if(indice > size) {
		                	  throw new ExcecaoDeLivroNaoEncontrado();
		                  } else {
		                	  biblio.removeInPos(indice);
		            			 JOptionPane.showMessageDialog(null, "O livro na posi��o " + indice + " foi removido.");
		                  }
	            		 
		            	 }catch(ExcecaoDeLivroNaoEncontrado e) {
		            		 JOptionPane.showMessageDialog(null, e.toString());
		            	 }
	            	 
	              }
		          break; 
	              case 8:
		              {
		                    JOptionPane.showMessageDialog(null, "Informa��es da Biblioteca\n"+"\n"+
		                            "Existem at� o momento\n"+biblio.size()+
		                            " livro(s) cadastrado(s)");
		              }
	                    break;
	              case 9:
		              {
		            	  	size = biblio.size();
		            	  
		            	  	
			            	ArrayList<Books> list = new ArrayList<Books>();
			            	StringBuffer list1 = new StringBuffer();
			      	        for (int i=0;i<size;i++) {
			      	        	book = biblio.getBook(i);
			      	        	list.add(book);
			      	        }
			      	        Collections.sort(list, new ComparatorName());
			      	        list1.append("Lista de Livros Ordenados pelo t�tulo1:\n");
			      	        for(Books b : list) {
								list1.append(b.getEdit()+" - "+
			                              b.getTitle()+" - "+b.getAutor()+" - "+
			                              b.getYearPub()+" ano de publica��o.\n");
			      	        }
			                JOptionPane.showMessageDialog(null, list1.toString());
			      			break;
		              }
	            	}
	            }
	        JOptionPane.showMessageDialog(null, "Programa finalizado,\n" + "volte logo!");
	        }
	        
	    
	   
	    static Books digitarLivro()
	    {
	        Books liv = new Books();
	        Author author = new Author();
	        
	        liv.setTitulo(JOptionPane.showInputDialog("T�tulo do Livro:"));
	        int op = Integer.parseInt(JOptionPane.showInputDialog("Quantos autores o livro possui?"));
	        if(op > 1) {
	        	int cont = 1;
	        	while(op != 0) {
	        		String name;
	        		String country; 
	        		
	        		name = JOptionPane.showInputDialog("Nome do " + cont + "� Autor:");
	        		country = JOptionPane.showInputDialog("Pa�s de origem do " + cont + "� Autor:");
	        		
	        		author = new Author(name, country);
		        	liv.addAuthor(author);
		        	
		        	cont++;
	        		op--;
	        	}
	        }else {
	        	String name;
        		String country;
        		
        		name = JOptionPane.showInputDialog("Nome do Autor:");
        		country = JOptionPane.showInputDialog("Pa�s de origem do Autor:");
	        	
	        	author = new Author(name, country);
	        	liv.addAuthor(author);
	        }
	        
	        liv.setISBN(JOptionPane.showInputDialog("N�mero ISBN do Livro:"));
	        liv.setYearPub(JOptionPane.showInputDialog("Ano da publica��o:"));
	        liv.setEdit(JOptionPane.showInputDialog("Nome da Editora"));
	       
	        return liv;
	    }
	       
	    static void showBook(Books x)
	    {
	        String texto = "Livro:\n"+
	        "\nT�tulo: "+x.getTitle()+
	        "\nAutor: "+x.getAutor()+
	        "\nISBN: "+x.getISBN()+
	        "\nAnoPubli: "+x.getYearPub()+
	        "\nEditora: "+x.getEdit();
	        JOptionPane.showMessageDialog(null, texto);
	    }	
	}
