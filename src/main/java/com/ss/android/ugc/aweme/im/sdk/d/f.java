package com.ss.android.ugc.aweme.im.sdk.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51232a;

    /* renamed from: b  reason: collision with root package name */
    private final e f51233b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f51234c;

    /* renamed from: d  reason: collision with root package name */
    private final String f51235d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f51236e;

    /* renamed from: f  reason: collision with root package name */
    private final m f51237f;

    f(e eVar, boolean z, String str, Map map, m mVar) {
        this.f51233b = eVar;
        this.f51234c = z;
        this.f51235d = str;
        this.f51236e = map;
        this.f51237f = mVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f51232a, false, 51749, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f51232a, false, 51749, new Class[]{i.class}, Object.class);
        }
        e eVar = this.f51233b;
        boolean z = this.f51234c;
        String str = this.f51235d;
        Map map = this.f51236e;
        m mVar = this.f51237f;
        if (!iVar.d() || !z) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    eVar.f51220c.remove(entry.getKey());
                }
            }
            if (iVar.b() && iVar.e() != null) {
                List<? extends IMUser> list = ((com.ss.android.ugc.aweme.im.sdk.model.f) iVar.e()).f51828a;
                if (list != null && list.size() > 0) {
                    for (IMUser a2 : list) {
                        eVar.a(a2);
                    }
                }
                if (mVar != null) {
                    mVar.a((com.ss.android.ugc.aweme.im.sdk.model.f) iVar.e());
                }
                return list;
            }
        } else {
            eVar.a(str, map, false, mVar);
        }
        return null;
    }
}
