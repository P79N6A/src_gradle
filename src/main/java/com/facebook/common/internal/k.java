package com.facebook.common.internal;

import com.google.a.a.a.a.a.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.annotation.Nullable;

public final class k {
    public static void a(@Nullable Throwable th) {
        a(th, Error.class);
        a(th, RuntimeException.class);
    }

    public static RuntimeException b(Throwable th) {
        a((Throwable) Preconditions.checkNotNull(th));
        throw new RuntimeException(th);
    }

    public static String c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        a.a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static <X extends Throwable> void a(@Nullable Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }
}
