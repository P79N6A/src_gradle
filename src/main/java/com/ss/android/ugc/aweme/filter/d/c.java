package com.ss.android.ugc.aweme.filter.d;

import a.g;
import a.i;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.port.in.a;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47580a;

    /* renamed from: b  reason: collision with root package name */
    static final g f47581b = new c();

    private c() {
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f47580a, false, 44466, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f47580a, false, 44466, new Class[]{i.class}, Object.class);
        } else if (!iVar.b() || Lists.isEmpty((List) iVar.e())) {
            return null;
        } else {
            List<h> list = (List) iVar.e();
            if (PatchProxy.isSupport(new Object[]{list}, null, w.f47662a, true, 44281, new Class[]{List.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{list}, null, w.f47662a, true, 44281, new Class[]{List.class}, List.class);
            } else if (Lists.isEmpty(list)) {
                return new ArrayList();
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (h hVar : list) {
                    if (w.b(hVar)) {
                        h e2 = w.e(hVar);
                        w.d(e2);
                        w.d(hVar);
                        arrayList.add(e2);
                    } else {
                        arrayList2.add(hVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    a.d().b((List<h>) arrayList);
                }
                return arrayList2;
            }
        }
    }
}
