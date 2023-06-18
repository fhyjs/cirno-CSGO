package cn.fhyjs.cirno.csgo.cirnocsgo.util;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class I18n
{
    public static List<String> langs=new ArrayList<>();
    public static Map<String,Map<String,String>> langs_table = new HashMap<>();
    public static void init(){
        try {
            langs=FileManager.readAllResFiles("jntm","langs");
            for (String s:langs) {
                String[] s_fn=s.replaceAll("\\\\","/").split("/");
                String lang_name=s_fn[s_fn.length-1].split("\\.")[0];
                Map<String,String> tm=new HashMap<>();
                String fnr = FileManager.getTemplateContent(s);
                String[] s_fnr = fnr.replaceAll("\r","").split("\n");
                for (String l:s_fnr) {
                    String[] s_l=l.split("=");
                    tm.put(s_l[0],s_l[1]);
                }
                langs_table.put(lang_name,tm);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static String get(String translateKey)
    {
        if(hasKey(translateKey))
            return langs_table.get(Config.Language).get(translateKey);
        return translateKey;
    }

    public static boolean hasKey(String key)
    {
        return langs_table.get(Config.Language).containsKey(key)&&langs_table.containsKey(Config.Language);
    }
}

