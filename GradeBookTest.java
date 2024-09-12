/*
// Figura 3.2: GradeBookTest.java
// Criando um objeto GradeBook e chamando seu método displayMessage.

public class GradeBookTest
{
    // método main inicia a execução de programa
    public static void main( String[] args )
    {
        // cria um objeto GradeBook e o atribui a myGradeBook
        GradeBook myGradeBook = new GradeBook();

        // chama método displayMessage de myGradeBook
        myGradeBook.displayMessage();
    } 
    // fim de main
} 
// fim da classe GradeBookTest
*/

/*
// Figura 3.5: GradeBookTest.java
// Cria objeto GradeBook e passa uma String para
// seu método displayMessage.
import java.util.Scanner; // programa utiliza Scanner

public class GradeBookTest
{
    // método main inicia a execução de programa
    public static void main( String[] args )
    {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner( System.in );
        
        // cria um objeto GradeBook e o atribui a myGradeBook
        GradeBook myGradeBook = new GradeBook();

        // prompt para entrada do nome do curso
        System.out.println( "Please enter the course name:" );
        String nameOfCourse = input.nextLine(); // lê uma linha de texto
        System.out.println(); // gera saída de uma linha em branco

        // chama método displayMessage de myGradeBook e passa nameOfCourse como um argumento
        myGradeBook.displayMessage( nameOfCourse );
    } 
    // fim de main
} 
// fim da classe GradeBookTest        
*/

/*
// Figura 3.8: GradeBookTest.java
// Criando e manipulando um objeto GradeBook.
import java.util.Scanner; // programa utiliza Scanner

public class GradeBookTest
{
    // método main inicia a execução de programa
    public static void main( String[] args )
    {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner( System.in );

        // cria um objeto GradeBook e o atribui a myGradeBook
        GradeBook myGradeBook = new GradeBook();

        // exibe valor inicial de courseName
        System.out.printf( "Initial course name is: %s \n",myGradeBook.getCourseName() );

        // solicita e lê o nome do curso
        System.out.printf( "Please enter the course name:" );
        String theName = input.nextLine(); // lê uma linha de texto
        myGradeBook.setCourseName( theName ); // configura o nome do curso
        System.out.println(); // gera saída de uma linha em branco
        // exibe mensagem de boas-vindas depois de especificar o nome do curso
        myGradeBook.displayMessage();
    } 
    // fim de main
} 
// fim da classe GradeBookTest
*/

// Figura 3.11: GradeBookTest.java
// construtor GradeBook utilizado para especificar o nome
// do curso na hora em que cada objeto GradeBook é criado.

public class GradeBookTest
{
    // método main inicia a execução de programa
    public static void main( String[] args )
    {
        // cria objeto GradeBook
        GradeBook gradeBook1 = new GradeBook( "CS101 Introduction to Java Programming" );
        GradeBook gradeBook2 = new GradeBook( "CS102 Data Structures in Java" );

        // exibe valor inicial de courseName para cada GradeBook
        System.out.printf( "gradeBook1 course name is: %s\n",  gradeBook1.getCourseName() );
        System.out.printf( "gradeBook2 course name is: %s"  , gradeBook2.getCourseName() );
    } 
    // fim de main
} 
// fim da classe GradeBookTest