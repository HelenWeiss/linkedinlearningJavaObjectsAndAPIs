package exceptions;

import java.util.List;

public class UnauthorizedUser {

    public static void main(String[] args) {

         // This is how your code will be called.

        String username = "angie";
        //String username = "techwizard87";
        //UnauthorizedUser.checkAccess(username);

        try {
            checkAccess(username);
            System.out.println("Access approved");
        } catch (UnauthorizedException e) {
            System.out.println(e.getMessage());
        }
    }

    static List<String> authorizedUsers = List.of("techwizard87", "codeNinja123", "dataQueen99", "cyberPioneer", "byteMaster", "algorithmGuru", "cloudSurfer55", "pixelPilot", "javaJedi", "scriptScribe");
    static String accessDeniedMessage = "Access denied";


    static void checkAccess(String username) throws UnauthorizedException {

        if (!authorizedUsers.contains(username)) {
            throw new UnauthorizedException(accessDeniedMessage);
        }
    }

}


class UnauthorizedException extends Exception {
    public UnauthorizedException(){
        this ("Unauthorized to access");
    }
    public UnauthorizedException(String message){
        super(message);
    }

}
