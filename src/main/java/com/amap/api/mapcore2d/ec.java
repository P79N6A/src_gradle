package com.amap.api.mapcore2d;

import android.content.Context;
import dalvik.system.DexFile;
import java.util.HashMap;
import java.util.Map;

public abstract class ec extends ClassLoader {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f6007a;

    /* renamed from: b  reason: collision with root package name */
    protected final Map<String, Class<?>> f6008b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    protected DexFile f6009c = null;

    /* renamed from: d  reason: collision with root package name */
    volatile boolean f6010d = true;

    /* renamed from: e  reason: collision with root package name */
    protected cy f6011e;

    /* renamed from: f  reason: collision with root package name */
    protected String f6012f;

    public boolean a() {
        if (this.f6009c != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void b() {
        try {
            synchronized (this.f6008b) {
                this.f6008b.clear();
            }
            if (this.f6009c != null) {
                this.f6009c.close();
            }
        } catch (Throwable th) {
            ek.a(th, "BaseLoader", "releaseDexFile()");
        }
    }

    public ec(Context context, cy cyVar, boolean z) {
        super(context.getClassLoader());
        this.f6007a = context;
        this.f6011e = cyVar;
    }
}
