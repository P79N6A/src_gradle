package com.monitor.cloudmessage.e;

import java.io.Closeable;

public final class c {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
