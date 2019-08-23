package com.ss.android.ugc.aweme.newfollow.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.newfollow.IContainerKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57416a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, d> f57417b = new HashMap();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f57418a = new e();
    }

    public static e a() {
        return a.f57418a;
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f57416a, false, 61904, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57416a, false, 61904, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f57417b.isEmpty()) {
            return false;
        } else {
            for (d dVar : this.f57417b.values()) {
                if (dVar.f57413d.c(16777216)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void a(@IContainerKey String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57416a, false, 61901, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f57416a, false, 61901, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f57417b.clear();
        }
        Iterator<String> it2 = this.f57417b.keySet().iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (!TextUtils.isEmpty(next) && next.startsWith(str)) {
                it2.remove();
            }
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57416a, false, 61902, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f57416a, false, 61902, new Class[]{String.class}, Void.TYPE);
        } else if (!this.f57417b.isEmpty()) {
            this.f57417b.remove(str);
        }
    }

    public final d c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57416a, false, 61903, new Class[]{String.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str}, this, f57416a, false, 61903, new Class[]{String.class}, d.class);
        } else if (this.f57417b.isEmpty()) {
            return null;
        } else {
            return this.f57417b.get(str);
        }
    }

    public final void a(String str, d dVar) {
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{str2, dVar2}, this, f57416a, false, 61900, new Class[]{String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, dVar2}, this, f57416a, false, 61900, new Class[]{String.class, d.class}, Void.TYPE);
            return;
        }
        this.f57417b.put(str2, dVar2);
    }
}
