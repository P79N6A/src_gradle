package com.bytedance.apm.a.c;

import java.io.Closeable;

public final class a {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
