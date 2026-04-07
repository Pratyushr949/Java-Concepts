package Concepts;

public class SubString {
    public static void main(String[] args){

        String email="Pratyushr549@kmail.com";
       // String username = email.substring(0,12);
        //String domain   = email.substring(13,22);

        //System.out.println("username:" + username);
        //System.out.println("domain" +domain);


                    //OR

        String username= email.substring(0,email.indexOf("@"));
        String domain= email.substring(email.indexOf("@"));

        System.out.println("username:" + username);
        System.out.println("domain :" +domain);

    }
}
