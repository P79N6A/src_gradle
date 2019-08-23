package com.c.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.a.a.a.a.a.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

public final class h {
    @NonNull
    static <T> T a(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    static String a(Throwable th) {
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
