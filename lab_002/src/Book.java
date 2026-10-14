public class Book {
    String title;
    String author;
    int publicationYear;

        public Book(){
            title = "Nieznany";
            author = "Nieznany";
            publicationYear = 0;
        }

        public Book(String title,String author){
            this.title = title;
            this.author = author;
            publicationYear = 0;
        }



        public Book(String title,
                    String author,
                    int publicationYear
        ){
          this.title = title;
          this.author = author;
          this.publicationYear = publicationYear;
        }
}
