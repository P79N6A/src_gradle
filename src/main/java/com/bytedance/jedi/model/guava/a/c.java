package com.bytedance.jedi.model.guava.a;

import com.bytedance.jedi.model.guava.annotations.CanIgnoreReturnValue;
import com.bytedance.jedi.model.guava.annotations.GwtCompatible;
import com.bytedance.jedi.model.guava.annotations.NullableDecl;

@GwtCompatible
public final class c {
    @CanIgnoreReturnValue
    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static void a(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, @NullableDecl String str, long j) {
        if (!z) {
            throw new IllegalStateException(e.a(str, Long.valueOf(j)));
        }
    }
}
