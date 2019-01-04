package Utils;

public class Tools {
    public String changeBrace(String str){
        str = str.replace("[","");
        str= str.replace("]","");
        str= str.replace(" ","");
//        str = str.replace(" ",",");
        return str;
    }
}
