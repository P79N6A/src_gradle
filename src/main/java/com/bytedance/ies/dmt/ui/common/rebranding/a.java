package com.bytedance.ies.dmt.ui.common.rebranding;

import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<Class, C0186a> f20320a = new HashMap<>();

    /* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.a$a  reason: collision with other inner class name */
    public static class C0186a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f20321a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f20322b = -1;

        public C0186a(int i) {
            this.f20322b = i;
        }
    }

    public static C0186a a(Class cls) {
        C0186a aVar;
        synchronized (f20320a) {
            aVar = f20320a.get(cls);
        }
        return aVar;
    }

    public static void a(Class cls, C0186a aVar) {
        synchronized (f20320a) {
            f20320a.put(cls, aVar);
        }
    }
}
