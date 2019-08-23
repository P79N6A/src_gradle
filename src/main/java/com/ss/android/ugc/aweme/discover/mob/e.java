package com.ss.android.ugc.aweme.discover.mob;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42659a;

    /* renamed from: c  reason: collision with root package name */
    private static e f42660c;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42661b = false;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<Integer, String> f42662d = new HashMap<>();

    private e() {
    }

    public static e a() {
        if (PatchProxy.isSupport(new Object[0], null, f42659a, true, 36966, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f42659a, true, 36966, new Class[0], e.class);
        }
        if (f42660c == null) {
            synchronized (e.class) {
                if (f42660c == null) {
                    f42660c = new e();
                }
            }
        }
        return f42660c;
    }

    public final String a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42659a, false, 36967, new Class[]{Integer.TYPE}, String.class)) {
            return this.f42662d.get(Integer.valueOf(i));
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42659a, false, 36967, new Class[]{Integer.TYPE}, String.class);
    }

    public final void a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f42659a, false, 36968, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f42659a, false, 36968, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.f42662d.put(Integer.valueOf(i), str2);
    }
}
