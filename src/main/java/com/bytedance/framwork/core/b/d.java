package com.bytedance.framwork.core.b;

import java.io.Closeable;

public final class d {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
