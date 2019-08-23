package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.push.ae;
import com.xiaomi.push.iq;
import com.xiaomi.push.ir;
import com.xiaomi.push.it;
import com.xiaomi.push.iv;
import com.xiaomi.push.jh;
import com.xiaomi.push.ji;
import java.util.ArrayList;
import java.util.List;

public class ah {
    public static int a(ag agVar, iq iqVar) {
        String a2 = a(iqVar);
        int i = 0;
        switch (ai.f82493a[iqVar.ordinal()]) {
            case 1:
                i = 1;
                break;
        }
        return agVar.f925a.getInt(a2, i);
    }

    private static String a(iq iqVar) {
        return "oc_version_" + iqVar.a();
    }

    private static List<Pair<Integer, Object>> a(List<iv> list, boolean z) {
        Pair pair;
        if (ae.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (iv next : list) {
            int a2 = next.a();
            ir a3 = ir.a(next.b());
            if (a3 != null) {
                if (!z || !next.f576a) {
                    switch (ai.f82494b[a3.ordinal()]) {
                        case 1:
                            pair = new Pair(Integer.valueOf(a2), Integer.valueOf(next.c()));
                            break;
                        case 2:
                            pair = new Pair(Integer.valueOf(a2), Long.valueOf(next.a()));
                            break;
                        case 3:
                            pair = new Pair(Integer.valueOf(a2), next.a());
                            break;
                        case 4:
                            pair = new Pair(Integer.valueOf(a2), Boolean.valueOf(next.g()));
                            break;
                        default:
                            pair = null;
                            break;
                    }
                    arrayList.add(pair);
                } else {
                    arrayList.add(new Pair(Integer.valueOf(a2), null));
                }
            }
        }
        return arrayList;
    }

    public static void a(ag agVar, iq iqVar, int i) {
        agVar.f925a.edit().putInt(a(iqVar), i).commit();
    }

    public static void a(ag agVar, jh jhVar) {
        agVar.b(a(jhVar.a(), true));
        agVar.b();
    }

    public static void a(ag agVar, ji jiVar) {
        for (it itVar : jiVar.a()) {
            if (itVar.a() > a(agVar, itVar.a())) {
                a(agVar, itVar.a(), itVar.a());
                agVar.a(a(itVar.f568a, false));
            }
        }
        agVar.b();
    }
}
