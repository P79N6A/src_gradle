package com.taobao.accs.d;

import com.taobao.accs.utl.ALog;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f78923a;

    /* renamed from: b  reason: collision with root package name */
    private ClassLoader f78924b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f78925c;

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f78923a == null) {
                f78923a = new a();
            }
            aVar = f78923a;
        }
        return aVar;
    }

    public synchronized ClassLoader b() {
        if (this.f78924b == null) {
            ALog.d("ACCSClassLoader", "getClassLoader", new Object[0]);
            this.f78924b = a.class.getClassLoader();
        }
        return this.f78924b;
    }
}
