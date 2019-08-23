package com.ss.android.message.a.b.a;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public final class i extends DataOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29935a;

    /* renamed from: b  reason: collision with root package name */
    a f29936b;

    static class a extends ByteArrayOutputStream {
        public final byte[] a() {
            return this.buf;
        }

        public final int b() {
            return this.count;
        }
    }

    public i() {
        this(new a());
    }

    private i(a aVar) {
        super(aVar);
        this.f29936b = aVar;
    }
}
