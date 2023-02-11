public class catchException {
    public static void catchException() throws Exception {
        catchException catchException = new catchException();
        try {
            System.out.println(raiseException.raiseException());
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        } catch (Exception s) {
            System.err.println(s.getMessage());
        }
    }
}
