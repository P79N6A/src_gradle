package com.ss.android.ugc.aweme.commercialize.api;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Map;

public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38499a;

    /* renamed from: b  reason: collision with root package name */
    static final g f38500b = new b();

    private b() {
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f38499a, false, 30422, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f38499a, false, 30422, new Class[]{i.class}, Object.class);
        }
        if (!iVar.c()) {
            if (!iVar.d()) {
                Map<String, j> map = ((c) iVar.e()).f38501a;
                ArrayList arrayList = new ArrayList();
                for (String next : map.keySet()) {
                    j jVar = map.get(next);
                    if (jVar != null) {
                        if (com.ss.android.ugc.aweme.commercialize.feed.j.a().a(next) != null) {
                            Aweme a2 = com.ss.android.ugc.aweme.commercialize.feed.j.a().a(next);
                            if (a2.getLinkAdData() == null) {
                                jVar.setLinkType(1);
                                a2.setLinkAdData(jVar);
                                arrayList.add(a2);
                                com.ss.android.ugc.aweme.commercialize.feed.j.a().a(a2);
                            }
                        } else if (a.a().b(next) != null) {
                            Aweme b2 = a.a().b(next);
                            if (b2.getLinkAdData() == null) {
                                jVar.setLinkType(1);
                                b2.setLinkAdData(jVar);
                                arrayList.add(b2);
                                a.a().a(b2);
                            }
                        }
                    }
                }
            } else {
                throw iVar.f();
            }
        }
        return null;
    }
}
