package com.google.common.a;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
@Beta
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    private static final v f24425a = new v() {
        public final long a() {
            return System.nanoTime();
        }
    };

    @CanIgnoreReturnValue
    public abstract long a();

    protected v() {
    }

    public static v b() {
        return f24425a;
    }
}
