package com.google.common.b;

import com.google.common.a.s;
import com.google.common.annotations.GwtCompatible;
import java.util.concurrent.atomic.AtomicLong;

@GwtCompatible
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final s<h> f24524a;

    static final class a extends AtomicLong implements h {
        private a() {
        }

        public final void increment() {
            getAndIncrement();
        }

        public final long sum() {
            return get();
        }

        public final void add(long j) {
            getAndAdd(j);
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static h a() {
        return (h) f24524a.get();
    }

    static {
        s<h> sVar;
        try {
            new j();
            sVar = new s<h>() {
                public final /* synthetic */ Object get() {
                    return new j();
                }
            };
        } catch (Throwable unused) {
            sVar = new s<h>() {
                public final /* synthetic */ Object get() {
                    return new a((byte) 0);
                }
            };
        }
        f24524a = sVar;
    }
}
