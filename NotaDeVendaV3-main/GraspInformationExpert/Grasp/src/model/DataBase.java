package model;
import java.util.HashMap;
import java.util.Map;
public class DataBase {
    private static  Map<String, String[]> products =
            new HashMap<String,String[]>();

static{
        products.put("at" ,new String[]{"Arroz Tatiana", "30"});
        products.put("ff" ,new String[]{"Feijão Feijo", "20"});
        products.put("ms" ,new String[]{"Macarrão Santa Amália", "30"});
}

public static String[] selectProduct(String code){
    return products.get(code);
}
}
