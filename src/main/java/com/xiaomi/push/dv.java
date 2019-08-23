package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Iterator;

public class dv extends dp {

    /* renamed from: a  reason: collision with root package name */
    dp f81958a = this.f81959b;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ dt f288a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ dp f81959b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dv(dt dtVar, String str, dp dpVar) {
        super(str);
        this.f288a = dtVar;
        this.f81959b = dpVar;
        this.f274b = this.f274b;
        if (this.f81959b != null) {
            this.f81950f = this.f81959b.f81950f;
        }
    }

    public ArrayList<String> a(boolean z) {
        ArrayList<String> arrayList;
        synchronized (this) {
            arrayList = new ArrayList<>();
            if (this.f81958a != null) {
                arrayList.addAll(this.f81958a.a(true));
            }
            synchronized (dt.f81954b) {
                dp dpVar = dt.f81954b.get(this.f274b);
                if (dpVar != null) {
                    Iterator<String> it2 = dpVar.a(true).iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (arrayList.indexOf(next) == -1) {
                            arrayList.add(next);
                        }
                    }
                    arrayList.remove(this.f274b);
                    arrayList.add(this.f274b);
                }
            }
        }
        return arrayList;
    }

    public void a(String str, Cdo doVar) {
        synchronized (this) {
            if (this.f81958a != null) {
                this.f81958a.a(str, doVar);
            }
        }
    }

    public boolean b() {
        return false;
    }
}
