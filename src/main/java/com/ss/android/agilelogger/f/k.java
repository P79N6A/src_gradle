package com.ss.android.agilelogger.f;

import com.google.a.a.a.a.a.a;
import com.ss.android.agilelogger.ALog;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f27925a;

    static {
        String name = ALog.class.getName();
        f27925a = name.substring(0, name.lastIndexOf(46) + 1);
    }

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        a.a(th, printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
