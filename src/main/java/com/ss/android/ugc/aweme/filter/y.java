package com.ss.android.ugc.aweme.filter;

import android.support.v4.math.MathUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.fg;
import java.util.Collections;
import java.util.List;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47671a;

    /* renamed from: b  reason: collision with root package name */
    private static h f47672b;

    public static List<h> b() {
        if (PatchProxy.isSupport(new Object[0], null, f47671a, true, 44290, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f47671a, true, 44290, new Class[0], List.class);
        }
        List<h> list = (List) a.d().a().getValue();
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public static h a() {
        if (PatchProxy.isSupport(new Object[0], null, f47671a, true, 44289, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], null, f47671a, true, 44289, new Class[0], h.class);
        }
        if (f47672b == null) {
            h hVar = new h();
            f47672b = hVar;
            hVar.j = "";
            h hVar2 = f47672b;
            hVar2.i = fg.s + "filter_00";
            f47672b.f47600d = "normal";
            f47672b.f47599c = "";
            f47672b.f47602f = 0;
        }
        return f47672b;
    }

    public static h a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f47671a, true, 44288, new Class[]{Integer.TYPE}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f47671a, true, 44288, new Class[]{Integer.TYPE}, h.class);
        }
        try {
            List list = (List) a.d().a().getValue();
            return (h) list.get(MathUtils.clamp(i, 0, list.size()));
        } catch (IndexOutOfBoundsException | NullPointerException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
            return a();
        }
    }
}
