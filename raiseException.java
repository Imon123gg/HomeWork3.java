import java.net.SocketException;
import java.nio.file.AccessDeniedException;
import java.rmi.server.ExportException;
import java.util.Objects;
import java.util.Scanner;

public class raiseException {
    public static  boolean raiseException() throws SocketException, ClassNotFoundException, AccessDeniedException, ExportException {
        raiseException raiseException = new raiseException();
        System.out.print("Enter random text except 1-4: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (Objects.equals(s, "1")) {
            throw new SocketException("\nSocketException");
        } else if (Objects.equals(s, "2")) {
            throw new ClassNotFoundException();
        } else if (Objects.equals(s, "3")) {
            throw new AccessDeniedException("AccessDeniedException");
        } else if (Objects.equals(s, "4")) {
            throw new ExportException("ExportException");
        }
        System.out.println("Your text: " + s);
        return false;
    }
}
