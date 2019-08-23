package com.bytedance.apm.k;

import com.bytedance.apm.d;
import java.io.Closeable;

public final class g {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                d.a().a(th, "IoUtil: close");
            }
        }
    }
}
