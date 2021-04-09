package principal;
import util.SimpleList;
import controller.adicionaralunos;
import javax.swing.JOptionPane;

public class menuprincipal {
 public static void main(String[] args) {
	 
	 adicionaralunos add = new adicionaralunos();
	 SimpleList simplelist = new SimpleList();
	 
	 int op = 0;
	 do {
	  op = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Aluno no Final da Lista \n "
	  		+ "2 - Adicionar Aluno no Inicio da Lista \n 3 - Adcionar Aluno no Meio da Lista \n 4 - Remover Aluno no Inicio da lista"
	  		+ "\n 5 - Remover Aluno no meio da Lista \n 6 - Remover Aluno no Final da Lista \n 7 - Visualizar Lista \n 8 - Encerrar"));
	  switch (op) {
	   case 1: {
		add.adicionaraluno();
		simplelist.addLast(add.dadosalunos());
		break;
	   }  
	   case 2: {
		 add.adicionaraluno();
		 simplelist.addFirst(add.dadosalunos());
		 break;
	    }
	   case 3: {
		  add.adicionaraluno();
		  simplelist.addMidle(add.dadosalunos());
		  break;
	    }
	   case 4: {
		  if(simplelist.checkEmpty()) {
		    JOptionPane.showMessageDialog(null, "Não é possível Remover Alunos. Lista Vazia!");  
		   }
		  else {
		    JOptionPane.showMessageDialog(null,"Aluno Removido: \n" + simplelist.removeFirst());
		   }
		  break;
	     }
	    case 5: {
	        if(simplelist.checkEmpty()) {
			  JOptionPane.showMessageDialog(null, "Não é possível Remover Alunos. Lista Vazia!");  
			}
			else {
			  JOptionPane.showMessageDialog(null,"Aluno Removido: \n" + simplelist.removeMidle());
			 }
		    break;
		  }
	    case 6: {
	      if(simplelist.checkEmpty()) {
	 	   JOptionPane.showMessageDialog(null, "Não é possível Remover Alunos. Lista Vazia!");  
	 	  }
	 	  else {
	 	   JOptionPane.showMessageDialog(null,"Aluno Removido: \n" + simplelist.removeLast());
	 	   } 
	     break; 	
	    }
	    case 7: {
 		 System.out.println(simplelist.toString());
		 break;
	   }
	   case 8: {
		  System.out.println("Fim do programa!");
		  break;
	   } 
	   default: {
		System.out.println("Opção invalida!");
	   }
	  }
	  
	 }while(op != 8); 
	 
	 }
 
}
