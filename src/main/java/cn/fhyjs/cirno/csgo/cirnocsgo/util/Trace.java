package cn.fhyjs.cirno.csgo.cirnocsgo.util;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Trace {
    public static String getStackTraceAsString(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        throwable.printStackTrace(printWriter);
        return stringWriter.toString();
    }
}
