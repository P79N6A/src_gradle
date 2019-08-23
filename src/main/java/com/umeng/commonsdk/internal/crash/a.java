package com.umeng.commonsdk.internal.crash;

import java.io.PrintWriter;
import java.io.StringWriter;

public class a {
    public static String a(Throwable th) {
        String str;
        if (th == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            com.google.a.a.a.a.a.a.a(th, printWriter);
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                com.google.a.a.a.a.a.a.a(cause, printWriter);
            }
            str = stringWriter.toString();
            try {
                printWriter.close();
                stringWriter.close();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = null;
        }
        return str;
    }
}
