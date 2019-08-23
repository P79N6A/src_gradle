package com.amap.api.services.a;

import android.content.Context;
import dalvik.system.DexFile;
import java.util.HashMap;
import java.util.Map;

public abstract class cn extends ClassLoader {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f6730a;

    /* renamed from: b  reason: collision with root package name */
    protected final Map<String, Class<?>> f6731b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    protected DexFile f6732c = null;

    /* renamed from: d  reason: collision with root package name */
    volatile boolean f6733d = true;

    /* renamed from: e  reason: collision with root package name */
    protected bn f6734e;

    /* renamed from: f  reason: collision with root package name */
    protected String f6735f;

    public boolean a() {
        if (this.f6732c != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void b() {
        try {
            synchronized (this.f6731b) {
                this.f6731b.clear();
            }
            if (this.f6732c != null) {
                this.f6732c.close();
            }
        } catch (Throwable th) {
            cv.a(th, "BaseClassLoader", "releaseDexFile()");
        }
    }

    public cn(Context context, bn bnVar, boolean z) {
        super(context.getClassLoader());
        this.f6730a = context;
        this.f6734e = bnVar;
    }
}
