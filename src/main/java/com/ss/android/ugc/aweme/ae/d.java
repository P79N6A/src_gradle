package com.ss.android.ugc.aweme.ae;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33216a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile d f33217c;

    /* renamed from: b  reason: collision with root package name */
    public boolean f33218b = false;

    /* renamed from: d  reason: collision with root package name */
    private List<a> f33219d = new ArrayList();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33220a;

        /* renamed from: b  reason: collision with root package name */
        String f33221b;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final boolean equals(Object obj) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{obj2}, this, f33220a, false, 70337, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f33220a, false, 70337, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            }
            if (obj2 instanceof a) {
                if (TextUtils.equals(((a) obj2).f33221b, this.f33221b)) {
                    return true;
                }
            }
            return false;
        }
    }

    private d() {
    }

    public static final d a() {
        if (PatchProxy.isSupport(new Object[0], null, f33216a, true, 70333, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f33216a, true, 70333, new Class[0], d.class);
        }
        if (f33217c == null) {
            synchronized (d.class) {
                if (f33217c == null) {
                    f33217c = new d();
                }
            }
        }
        return f33217c;
    }

    private void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f33216a, false, 70335, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f33216a, false, 70335, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            a aVar = new a((byte) 0);
            aVar.f33221b = str;
            synchronized (this) {
                if (!this.f33219d.contains(aVar)) {
                    this.f33219d.add(aVar);
                }
            }
        }
    }

    public final void a(List<String> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f33216a, false, 70334, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f33216a, false, 70334, new Class[]{List.class}, Void.TYPE);
        } else if (list != null) {
            for (String b2 : list) {
                b(b2);
            }
        }
    }

    public final boolean a(String str) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str}, this, f33216a, false, 70336, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f33216a, false, 70336, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            synchronized (this) {
                Iterator<a> it2 = this.f33219d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    a next = it2.next();
                    if (next != null && TextUtils.equals(next.f33221b, str)) {
                        break;
                    }
                }
            }
            return z;
        }
    }
}
