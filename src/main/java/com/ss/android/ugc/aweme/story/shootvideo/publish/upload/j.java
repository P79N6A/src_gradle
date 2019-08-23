package com.ss.android.ugc.aweme.story.shootvideo.publish.upload;

import a.i;
import android.arch.lifecycle.MutableLiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73747a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile j f73748b;

    /* renamed from: c  reason: collision with root package name */
    public MutableLiveData<com.ss.android.ugc.aweme.story.api.j> f73749c = new MutableLiveData<>();

    /* renamed from: d  reason: collision with root package name */
    public Map<String, Object> f73750d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.story.api.j f73751e = new com.ss.android.ugc.aweme.story.api.j();

    private j() {
    }

    private boolean d() {
        int i = this.f73751e.f71843e;
        if (i != 0) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f73747a, false, 85488, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73747a, false, 85488, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.api.j jVar = (com.ss.android.ugc.aweme.story.api.j) this.f73751e.clone();
        if (jVar != null) {
            this.f73749c.postValue(jVar);
        }
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f73747a, false, 85489, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73747a, false, 85489, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f73750d.size() > 0 && d()) {
            z = true;
        }
        return z;
    }

    public static j a() {
        if (PatchProxy.isSupport(new Object[0], null, f73747a, true, 85483, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], null, f73747a, true, 85483, new Class[0], j.class);
        }
        if (f73748b == null) {
            synchronized (j.class) {
                if (f73748b == null) {
                    f73748b = new j();
                }
            }
        }
        return f73748b;
    }

    public void a(String str, Object obj) {
        String str2 = str;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{str2, obj2}, this, f73747a, false, 85491, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, obj2}, this, f73747a, false, 85491, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new k<TResult>(str2, obj2));
    }
}
