public class LibraryDriver implements LoanItem {
    
public static void main(String args[]){

    LibraryItem libraryList[]= new LibraryItem[4];

    libraryList[0] = new CD("CD","1000","E","Music",4);
    libraryList[1] = new CD("CD","1021","B","More music",3);
    libraryList[2] = new Book("Book", "1024", "Some Guy", "How to make money", 1);
    libraryList[3] = new Book("Book", "1531","Another Guy","How to become rich II",2);

    for(int i =0;i<libraryList.length;i++){

        System.out.println(libraryList[i].toString());
        System.out.println("\nCost per week :"+LoanItem.calcultatePrice(libraryList[i],1));
        System.out.println("Cost for 3 weeks:"+LoanItem.calcultatePrice(libraryList[i],3));
        System.out.println();
    }    
}
}
