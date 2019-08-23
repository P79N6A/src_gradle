package com.bytedance.apm;

import com.bytedance.apm.c.c;
import com.bytedance.apm.internal.ApmDelegate;

public final class a {

    /* renamed from: com.bytedance.apm.a$a  reason: collision with other inner class name */
    public static class C0005a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1873a = new a((byte) 0);
    }

    private a() {
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public static void a(c cVar) {
        ApmDelegate.getInstance().start(cVar);
    }
}
