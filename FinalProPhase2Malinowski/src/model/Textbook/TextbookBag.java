package model.Textbook;

public class TextbookBag {
	private  Textbook [] textbookArr;
	private  int nElems;
	
	public TextbookBag(int maxSize) {
		textbookArr = new Textbook[maxSize];
		nElems = 0;
	}	
	public void insert(Textbook textbook) {
		textbookArr[nElems++] = textbook;
	}
	public Textbook findByIsbn(String isbn){
		for (int i = 0; i < nElems; i++){
			if (textbookArr[i].getIsbn().equals(isbn)){
				return textbookArr[i];
			}
		}
		return null;
	}
	public Textbook deleteByIsbn(String isbn) {
		int i = 0;
		for(i =0; i < nElems; i++) {
			if(textbookArr[i].getIsbn().equals(isbn)) {
				break;
			}
		}
		
		if( i == nElems ) { 
			return null;
		} else { 
			Textbook temp = textbookArr[i];
			for(int j = i; j < nElems-1; j++) {
				textbookArr[j] = textbookArr[j+1]; 
			}
			nElems--;
			return temp;
		}
	}
	public void showBag() {
		for(int i = 0; i<nElems; i++) {
			System.out.println(textbookArr[i]);
		}
	}
}
