package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68276a;

    /* renamed from: b  reason: collision with root package name */
    private static final l f68277b = new l();

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<String> f68278c = new ArrayList<>();

    public static l a() {
        return f68277b;
    }

    public final ArrayList<String> b() {
        if (PatchProxy.isSupport(new Object[0], this, f68276a, false, 73905, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, f68276a, false, 73905, new Class[0], ArrayList.class);
        }
        ArrayList<String> arrayList = new ArrayList<>(this.f68278c);
        this.f68278c.clear();
        return arrayList;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f68276a, false, 73904, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f68276a, false, 73904, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f68278c.add(str2);
    }
}
