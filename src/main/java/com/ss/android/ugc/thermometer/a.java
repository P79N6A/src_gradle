package com.ss.android.ugc.thermometer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C0827a[] f77801a = f77804d;

    /* renamed from: b  reason: collision with root package name */
    public static final b f77802b = new b() {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, Long> f77806a = new ConcurrentHashMap();

        public final void a(Runnable runnable, String str, String str2, Map<String, String> map) {
            long currentTimeMillis = System.currentTimeMillis();
            runnable.run();
            long currentTimeMillis2 = System.currentTimeMillis();
            a.f77803c.a(currentTimeMillis2 - currentTimeMillis, currentTimeMillis2, str, str2, null, false, map);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static final C0827a f77803c = new C0827a() {
        /* access modifiers changed from: protected */
        public final void a() {
            throw new RuntimeException("call log method of delegate");
        }

        /* access modifiers changed from: protected */
        public final void a(long j, long j2, String str, String str2, String str3, boolean z, Map<String, String> map) {
            for (C0827a a2 : a.f77801a) {
                a2.a(j, j2, str, str2, str3, z, map);
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final C0827a[] f77804d = new C0827a[0];

    /* renamed from: e  reason: collision with root package name */
    private static final List<C0827a> f77805e = new ArrayList();

    /* renamed from: com.ss.android.ugc.thermometer.a$a  reason: collision with other inner class name */
    public static abstract class C0827a {
        /* access modifiers changed from: protected */
        public abstract void a();

        /* access modifiers changed from: protected */
        public void a(long j, long j2, String str, String str2, String str3, boolean z, Map<String, String> map) {
            a();
        }
    }

    public interface b {
        void a(Runnable runnable, String str, String str2, Map<String, String> map);
    }
}
