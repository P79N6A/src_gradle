package com.ss.android.common.b;

import com.bytedance.common.utility.collection.WeakContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28228a;

    /* renamed from: b  reason: collision with root package name */
    private static Set<String> f28229b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private static WeakContainer<C0330a> f28230c = new WeakContainer<>();

    /* renamed from: com.ss.android.common.b.a$a  reason: collision with other inner class name */
    public interface C0330a {
        String a();

        boolean b();
    }

    public static String a() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], null, f28228a, true, 15243, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f28228a, true, 15243, new Class[0], String.class);
        }
        if (f28229b == null || f28229b.isEmpty()) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (String next : f28229b) {
                if (i < f28229b.size() - 1) {
                    sb.append(next);
                    sb.append("|");
                } else {
                    sb.append(next);
                }
                i++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], null, f28228a, true, 15244, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f28228a, true, 15244, new Class[0], String.class);
        }
        if (f28230c == null || f28230c.isEmpty()) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator it2 = f28230c.iterator();
            while (it2.hasNext()) {
                C0330a aVar = (C0330a) it2.next();
                if (aVar != null && !f28229b.contains(aVar.a()) && aVar.b()) {
                    if (i < f28230c.size() - 1) {
                        sb.append(aVar.a());
                        sb.append("|");
                    } else {
                        sb.append(aVar.a());
                    }
                }
                i++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
