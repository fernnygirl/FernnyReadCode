package fernnyreadcode.mrr.ac.th.fernnyreadcode.utility;

/**
 * Created by Teacher on 22 มีนาคม 2561.
 */

public class MyConstant {

    //    About URL
    private String urlGetAllUserString = "http://androidthai.in.th/mar/getAllUser.php";
    private String urlPostUserString = "http://androidthai.in.th/mar/postUser.php";

    //    About Array
    private String[] loginString = new String[]{"id", "Name", "User", "Password"};


    public String[] getLoginString() {
        return loginString;
    }

    public String getUrlGetAllUserString() {
        return urlGetAllUserString;
    }

    public String getUrlPostUserString() {
        return urlPostUserString;
    }
}   // Main Class
