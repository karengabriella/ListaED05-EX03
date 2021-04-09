package util;

public class SimpleList {
	
	private Node head = null;
	private int size = 0;	
	

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	//---- Adicionar no Começo
	
	public void addFirst(String info) {
		Node node = new Node();
	    node.setInfo(info);
		node.setNext(head);
		head = node;
		size++;
	}
	
	//---- Remover no Inicio
	
	public String removeFirst() {	
		if(head == null) {
			return null;
		}
		String info = head.getInfo();
		head = head.getNext(); 
		size--;
		return info;
	}
	
	//--- Adicionar no Final
	
	public void addLast(String info) {
		
		Node node = new Node();
		node.setInfo(info);
		if(head == null) {
			node.setNext(null);
			head = node;
		}
		else {
		  Node local = head;
		  while(local.getNext() != null) {
			 local = local.getNext();
		  }
		  local.setNext(node);
		  node.setNext(null);
		}
		size++;
	}
	
	//--- Remover no Final
	public String removeLast() {
		Node local = head;
		while(local.getNext() != null) {
	      Node aux = local;
	      local = local.getNext();
	      if(local.getNext() == null) {
	    	 aux.setNext(null);
	    	 size--;
	    	 return local.getInfo();  	 
	      }
		}
		return null;
	}
	
	//------- Insirir no meio
	public void addMidle(String info) {
	   if(size == 0) {
		  addFirst(info);
	   }
	   else if(size == 1) {
		   addLast(info);
	   }
	   else {
		    Node local = head;
		    int midle = (int) size/2;
			for(int i = 0; i < midle-1; i++) {
				local = local.getNext();
			}
			Node node = new Node();
			node.setInfo(info);
			node.setNext(local.getNext()); 
			local.setNext(node);
			size++;
	   }
	   	
	}
	
	//---- Remover no Meio
	public String removeMidle() {
	   if(size == 0) {
		 return removeFirst();
	   }
	   else if(size == 1) { 
		 return removeLast(); 
	   }
	   else {
		  Node local = head;
		  int midle = (int) size/2;
		  for(int i = 0; i < midle-1; i++) {
		     local = local.getNext();
		  } 
		  String info = local.getNext().getInfo();
		  local.setNext(local.getNext().getNext());
		  size--;
		  return info;
	   }
	}
	
	//---- Verifica Lista Vazia
	public boolean checkEmpty() {
		if(size != 0) {
		 return false;
		}
		else {
		 return true;
		}
	}

	//---- Visualização da Lista
		@Override
	public String toString() {
	  StringBuffer view = new StringBuffer();
      Node local = head;
	  while(local != null) {
		 view.append(local.getInfo() + "\n");
		 local = local.getNext();
	   }
		return view.toString();
	  }
	
  
}
