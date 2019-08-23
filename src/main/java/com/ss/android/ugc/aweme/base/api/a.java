package com.ss.android.ugc.aweme.base.api;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.http.a.b.f;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34525a;

    public static String a(f fVar) {
        com.ss.android.http.a.a[] aVarArr;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, null, f34525a, true, 24129, new Class[]{f.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{fVar2}, null, f34525a, true, 24129, new Class[]{f.class}, String.class);
        }
        if (PatchProxy.isSupport(new Object[]{fVar2, "X-TT-LOGID"}, null, f34525a, true, 24130, new Class[]{f.class, String.class}, com.ss.android.http.a.a[].class)) {
            aVarArr = (com.ss.android.http.a.a[]) PatchProxy.accessDispatch(new Object[]{fVar2, "X-TT-LOGID"}, null, f34525a, true, 24130, new Class[]{f.class, String.class}, com.ss.android.http.a.a[].class);
        } else if (TextUtils.isEmpty("X-TT-LOGID") || fVar2 == null) {
            aVarArr = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < fVar2.f2464a.size(); i++) {
                com.ss.android.http.a.a aVar = (com.ss.android.http.a.a) fVar2.f2464a.get(i);
                if (aVar.a().equalsIgnoreCase("X-TT-LOGID")) {
                    arrayList.add(aVar);
                }
            }
            aVarArr = (com.ss.android.http.a.a[]) arrayList.toArray(new com.ss.android.http.a.a[arrayList.size()]);
        }
        if (aVarArr != null) {
            for (com.ss.android.http.a.a aVar2 : aVarArr) {
                if ("X-TT-LOGID".equalsIgnoreCase(aVar2.a())) {
                    return aVar2.b();
                }
            }
        }
        return null;
    }
}
