package com.bytedance.ad.symphony;

import android.content.Context;
import com.bytedance.ad.symphony.a.a.a;
import com.bytedance.ad.symphony.e.b;
import com.bytedance.ad.symphony.g.d;
import com.bytedance.ad.symphony.provider.AbsNativeAdProvider;
import com.bytedance.ad.symphony.provider.b;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class e {
    private static void a(List<b> list) {
        if (b.b()) {
            StringBuilder sb = new StringBuilder();
            List arrayList = new ArrayList(list);
            List arrayList2 = new ArrayList();
            int i = 0;
            while (arrayList != null && !arrayList.isEmpty()) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append("-->");
                }
                sb.append("[");
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    b bVar = (b) arrayList.get(i3);
                    if (i3 > 0) {
                        sb.append(", ");
                    } else {
                        arrayList2 = bVar.e();
                    }
                    sb.append(bVar.d());
                }
                sb.append("]");
                arrayList = arrayList2;
                i = i2;
            }
            new StringBuilder("requestQueue: ").append(sb.toString());
        }
    }

    private static void a(List<b> list, List<b> list2) {
        if (!d.a(list) && !d.a(list2)) {
            for (b next : list) {
                for (b a2 : list2) {
                    a2.a(next);
                    next.a();
                }
            }
        }
    }

    private static boolean a(List<b> list, String str, a aVar) {
        for (b next : list) {
            if (!AbsNativeAdProvider.isInhouseNativeAdProvider(next.d())) {
                com.bytedance.ad.symphony.provider.b bVar = aVar.f7552c.get(Integer.valueOf(next.d()));
                if (bVar != null && bVar.hasValidAd(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static com.bytedance.ad.symphony.e.a a(Context context, int i, String str, b.a aVar, a aVar2) {
        com.bytedance.ad.symphony.e.a aVar3;
        com.bytedance.ad.symphony.provider.b bVar = aVar2.f7552c.get(Integer.valueOf(i));
        com.bytedance.ad.symphony.f.a a2 = aVar2.b().a(str);
        if (bVar == null || a2 == null) {
            aVar3 = null;
        } else {
            aVar3 = new com.bytedance.ad.symphony.e.a(str, bVar, a2, aVar);
        }
        if (aVar3 == null || !aVar3.a(context)) {
            return null;
        }
        new StringBuilder("handler-->").append(aVar3.d());
        return aVar3;
    }

    public static List<com.bytedance.ad.symphony.e.b> a(Context context, com.bytedance.ad.symphony.f.a aVar, String str, b.a aVar2, a aVar3) {
        if (aVar == null) {
            return null;
        }
        List c2 = aVar.c();
        List<Integer> d2 = aVar.d();
        LinkedList linkedList = new LinkedList();
        if (d2 != null) {
            for (Integer intValue : d2) {
                com.bytedance.ad.symphony.e.a a2 = a(context, intValue.intValue(), str, aVar2, aVar3);
                if (a2 != null) {
                    linkedList.add(a2);
                }
            }
        }
        linkedList.addAll(a(context, c2, str, aVar2, aVar3));
        return linkedList;
    }

    private static List<com.bytedance.ad.symphony.e.b> a(Context context, List<List<Integer>> list, String str, b.a aVar, a aVar2) {
        LinkedList linkedList = new LinkedList();
        if (d.a(list) || d.a(list.get(0))) {
            return linkedList;
        }
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            List list2 = list.get(i);
            linkedList3.clear();
            for (int i2 = 0; i2 < list2.size(); i2++) {
                com.bytedance.ad.symphony.e.a a2 = a(context, ((Integer) list2.get(i2)).intValue(), str, aVar, aVar2);
                if (a2 != null) {
                    linkedList3.add(a2);
                }
            }
            if (!linkedList3.isEmpty()) {
                if (a(linkedList3, str, aVar2)) {
                    break;
                } else if (linkedList.isEmpty()) {
                    linkedList.addAll(linkedList3);
                    linkedList2.clear();
                    linkedList2.addAll(linkedList3);
                } else {
                    a(linkedList3, linkedList2);
                    linkedList2.clear();
                    linkedList2.addAll(linkedList3);
                }
            }
        }
        a(linkedList);
        return linkedList;
    }
}
