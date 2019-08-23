package com.bytedance.frameworks.plugin.f;

import android.support.annotation.NonNull;
import com.google.a.a.a.a.a.a;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public final class c {
    public static String a(@NonNull Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            a.a(th, printWriter);
            printWriter.flush();
            stringWriter.flush();
            String obj = stringWriter.toString();
            try {
                printWriter.close();
                stringWriter.close();
                return obj;
            } catch (IOException unused) {
                return obj;
            }
        } catch (IOException unused2) {
            return "";
        }
    }
}
