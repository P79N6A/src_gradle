package com.ss.android.ugc.aweme.shortvideo.mvtemplate.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.j;
import com.ss.android.ugc.aweme.video.b;
import com.ss.android.ugc.effectmanager.common.f.d;
import com.ss.android.ugc.effectmanager.common.f.e;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68490a;

    /* renamed from: c  reason: collision with root package name */
    private static c f68491c;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, Integer> f68492b = new HashMap<>();

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f68490a, true, 78077, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f68490a, true, 78077, new Class[0], c.class);
        }
        if (f68491c == null) {
            synchronized (c.class) {
                f68491c = new c();
            }
        }
        return f68491c;
    }

    public final int a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f68490a, false, 78080, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f68490a, false, 78080, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.f68492b.get(str) == null) {
            return 4;
        } else {
            return this.f68492b.get(str).intValue();
        }
    }

    public final void a(List<j> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f68490a, false, 78081, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f68490a, false, 78081, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f68492b.clear();
        if (!com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) list)) {
            for (j next : list) {
                if (next != null && !TextUtils.isEmpty(next.c())) {
                    this.f68492b.put(next.c(), 4);
                }
            }
        }
    }

    public final boolean a(j jVar) {
        if (PatchProxy.isSupport(new Object[]{jVar}, this, f68490a, false, 78079, new Class[]{j.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jVar}, this, f68490a, false, 78079, new Class[]{j.class}, Boolean.TYPE)).booleanValue();
        } else if (jVar == null || TextUtils.isEmpty(jVar.f()) || TextUtils.isEmpty(jVar.d()) || !b.b(jVar.d()) || TextUtils.isEmpty(jVar.e())) {
            return false;
        } else {
            File file = new File(jVar.d());
            try {
                if (e.a(file).equals(jVar.f())) {
                    d.a(jVar.d(), jVar.e());
                    return true;
                }
                d.b(file.getAbsolutePath());
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
