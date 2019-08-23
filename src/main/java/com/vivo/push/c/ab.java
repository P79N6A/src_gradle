package com.vivo.push.c;

import com.vivo.push.b.t;
import com.vivo.push.p;
import com.vivo.push.w;
import com.vivo.push.y;
import java.util.ArrayList;
import java.util.List;

public final class ab extends aa {
    ab(y yVar) {
        super(yVar);
    }

    public final void a(y yVar) {
        int i;
        t tVar = (t) yVar;
        ArrayList<String> d2 = tVar.d();
        List<String> e2 = tVar.e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int h = tVar.h();
        String g = tVar.g();
        if (d2 != null) {
            for (String next : d2) {
                if (next.startsWith("ali/")) {
                    arrayList2.add(next.replace("ali/", ""));
                } else if (next.startsWith("tag/")) {
                    arrayList.add(next.replace("tag/", ""));
                }
            }
        }
        if (e2 != null) {
            for (String next2 : e2) {
                if (next2.startsWith("ali/")) {
                    arrayList4.add(next2.replace("ali/", ""));
                } else if (next2.startsWith("tag/")) {
                    arrayList3.add(next2.replace("tag/", ""));
                }
            }
        }
        if (arrayList.size() > 0 || arrayList3.size() > 0) {
            if (arrayList.size() > 0) {
                p.a().a((List<String>) arrayList);
            }
            p a2 = p.a();
            String g2 = tVar.g();
            if (arrayList3.size() > 0) {
                i = 10000;
            } else {
                i = h;
            }
            a2.a(g2, i);
            ac acVar = new ac(this, h, arrayList, arrayList3, g);
            w.b(acVar);
        }
        if (arrayList2.size() > 0 || arrayList4.size() > 0) {
            if (arrayList2.size() > 0) {
                p.a().b((String) arrayList2.get(0));
            }
            p.a().a(tVar.g(), h);
            ad adVar = new ad(this, h, arrayList2, arrayList4, g);
            w.b(adVar);
        }
    }
}
