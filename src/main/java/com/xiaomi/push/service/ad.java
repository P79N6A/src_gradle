package com.xiaomi.push.service;

import com.xiaomi.push.ie;
import java.util.Iterator;
import java.util.List;

public final class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f82487a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f922a;

    ad(List list, boolean z) {
        this.f82487a = list;
        this.f922a = z;
    }

    public final void run() {
        int i;
        boolean a2 = ac.a("www.baidu.com:80");
        Iterator it2 = this.f82487a.iterator();
        while (true) {
            i = 1;
            if (!it2.hasNext()) {
                break;
            }
            a2 = a2 || ac.a((String) it2.next());
            if (a2 && !this.f922a) {
                break;
            }
        }
        if (!a2) {
            i = 2;
        }
        ie.a(i);
    }
}
