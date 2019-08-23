package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

public final class ai extends k implements Cloneable {

    /* renamed from: c  reason: collision with root package name */
    private static ArrayList<String> f79411c;

    /* renamed from: a  reason: collision with root package name */
    private String f79412a = "";

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<String> f79413b;

    public final void a(StringBuilder sb, int i) {
    }

    public final void a(j jVar) {
        jVar.a(this.f79412a, 0);
        if (this.f79413b != null) {
            jVar.a((Collection<T>) this.f79413b, 1);
        }
    }

    public final void a(i iVar) {
        this.f79412a = iVar.b(0, true);
        if (f79411c == null) {
            f79411c = new ArrayList<>();
            f79411c.add("");
        }
        this.f79413b = (ArrayList) iVar.a(f79411c, 1, false);
    }
}
