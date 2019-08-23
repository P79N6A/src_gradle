package com.facebook.common.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

public final class c {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    static final Logger f23529a = Logger.getLogger(c.class.getName());

    private c() {
    }

    public static void a(@Nullable InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public static void a(@Nullable Closeable closeable, boolean z) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                f23529a.log(Level.WARNING, "IOException thrown while closing Closeable.", e2);
            }
        }
    }
}
