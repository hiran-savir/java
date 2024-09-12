/*
// Figura 3.1: GradeBook.java
// Declaração de classe com um método.

public class GradeBook
{
    // exibe uma mensagem de boasvindas para o usuário GradeBook
    public void displayMessage()
    {
        System.out.println("Welcome to the Grade Book!" );
    } 
    // fim do método displayMessage
} 
// fim da classe GradeBook
*/

/*
// Figura 3.4: GradeBook.java
// Declaração de classe com um método que tem um parâmetro.
public class GradeBook
{
    // exibe uma mensagem de boasvindas para o usuário GradeBook
    public void displayMessage( String courseName )
    {
        System.out.printf( "Welcome to the GradeBook for\n%s!\n", courseName );
    } 
    // fim do método displayMessage
} 
// fim da classe GradeBook
*/

// Figura 3.7: GradeBook.java
// classe GradeBook que contém uma variável de instância
// courseName e métodos para configurar e obter seu valor.

/*
public class GradeBook
{
    private String courseName; // nome do curso para esse GradeBook

    // método para configurar o nome do curso
    public void setCourseName( String name )
    {
        courseName = name; // armazena o nome do curso
    } 
    // fim do método setCourseName

    // método para recuperar o nome do curso
    public String getCourseName()
    {
        return courseName;
    } 
    // fim do método getCourseName

    // exibe uma mensagem de boas-vindas para o usuário GradeBook
    public void displayMessage()
    {
        // chama getCourseName para obter o nome do
        // o curso que essa GradeBook representa
        System.out.printf( "Welcome to the GradeBook for...%s!\n", getCourseName() );
    } 
    // fim do método displayMessage
} 
// fim da classe GradeBook
*/

// Figura 3.10: GradeBook.java
// Classe GradeBook com um construtor para inicializar o
// nome de um curso.
public class GradeBook
{
    private String courseName; // nome do curso para esse GradeBook

    // o construtor inicializa courseName com o argumento String
    public GradeBook( String name )
    {
        courseName = name; // inicializa courseName
    } // fim do construtor

    // método para confi gurar o nome do curso
    public void setCourseName( String name )
    {
        courseName = name; // armazena o nome do curso
    } 
    // fim do método setCourseName

    // método para recuperar o nome do curso
    public String getCourseName()
    {
        return courseName;
    } 
    // fim do método getCourseName

    // exibe uma mensagem de boasvindas para o usuário GradeBook
    public void displayMessage()
    {
        // essa instrução chama getCourseName para obter o nome do curso que esse GradeBook representa
        System.out.printf( "Welcome to the GradeBook for\n%s!", getCourseName() );
    } 
    // fim do método displayMessage
} 
// fim da classe GradeBook