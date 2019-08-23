package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

public final class al extends k implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    private static ArrayList<ak> f79424b;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<ak> f79425a;

    public final void a(StringBuilder sb, int i) {
    }

    public final void a(j jVar) {
        jVar.a((Collection<T>) this.f79425a, 0);
    }

    public final void a(i iVar) {
        if (f79424b == null) {
            f79424b = new ArrayList<>();
            f79424b.add(new ak());
        }
        this.f79425a = (ArrayList) iVar.a(f79424b, 0, true);
    }
}
