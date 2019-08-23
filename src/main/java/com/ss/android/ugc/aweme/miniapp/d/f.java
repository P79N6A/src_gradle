package com.ss.android.ugc.aweme.miniapp.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.e.b;
import com.ss.android.ugc.aweme.miniapp.h.a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.NativeModule;
import com.tt.option.ext.AbstractHostOptionModuleExtDepend;
import java.util.ArrayList;
import java.util.List;

public final class f extends AbstractHostOptionModuleExtDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55681a;

    public final List<NativeModule> createNativeModules(AppbrandContext appbrandContext) {
        AppbrandContext appbrandContext2 = appbrandContext;
        if (PatchProxy.isSupport(new Object[]{appbrandContext2}, this, f55681a, false, 59388, new Class[]{AppbrandContext.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{appbrandContext2}, this, f55681a, false, 59388, new Class[]{AppbrandContext.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(appbrandContext2));
        arrayList.add(new a(appbrandContext2));
        arrayList.add(new com.ss.android.ugc.aweme.miniapp.k.b(appbrandContext2));
        arrayList.add(new com.ss.android.ugc.aweme.miniapp.j.a(appbrandContext2));
        arrayList.add(new com.ss.android.ugc.aweme.miniapp.g.a(appbrandContext2));
        arrayList.add(new com.ss.android.ugc.aweme.miniapp.dialog.b(appbrandContext2));
        arrayList.add(new com.ss.android.ugc.aweme.miniapp.dialog.a(appbrandContext2));
        return arrayList;
    }
}
