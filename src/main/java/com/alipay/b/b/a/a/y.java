package com.alipay.b.b.a.a;

import java.io.Closeable;
import java.io.IOException;

public final class y {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
