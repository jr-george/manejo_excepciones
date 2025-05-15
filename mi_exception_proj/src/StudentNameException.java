//Excepcion de usuario que valida el nombre del Estudiante
public class StudentNameException extends Exception{
    public StudentNameException(String message)
    {
        super(message);
    }
}
