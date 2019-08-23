package com.ss.android.ugc.aweme.miniapp.d;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.c.a;
import com.ss.android.ugc.aweme.miniapp.c.a.b;
import com.ss.android.ugc.aweme.miniapp.c.a.f;
import com.ss.android.ugc.aweme.miniapp.c.d;
import com.ss.android.ugc.aweme.miniapp.c.e;
import com.ss.android.ugc.aweme.miniapp.c.g;
import com.ss.android.ugc.aweme.miniapp.q;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.annotation.HostProcess;
import com.tt.miniapphost.process.handler.IAsyncHostDataHandler;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;
import com.tt.option.hostdata.AbstractHostOptionDataHandlerDepend;
import java.util.ArrayList;
import java.util.List;

public final class c extends AbstractHostOptionDataHandlerDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55672a;

    @HostProcess
    public final List<IAsyncHostDataHandler> createAsyncHostDataHandlerList() {
        if (PatchProxy.isSupport(new Object[0], this, f55672a, false, 59380, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f55672a, false, 59380, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        arrayList.add(new f());
        com.ss.android.ugc.aweme.miniapp_api.a.f fVar = q.a().i;
        if (fVar != null) {
            arrayList.add(fVar.b());
        }
        arrayList.add(new b(applicationContext));
        return arrayList;
    }

    @HostProcess
    public final List<ISyncHostDataHandler> createSyncHostDataHandlerList() {
        if (PatchProxy.isSupport(new Object[0], this, f55672a, false, 59379, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f55672a, false, 59379, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        AppbrandContext.getInst().getApplicationContext();
        arrayList.add(new com.ss.android.ugc.aweme.miniapp.c.f());
        arrayList.add(new d());
        arrayList.add(new com.ss.android.ugc.aweme.miniapp.c.b());
        arrayList.add(new com.ss.android.ugc.aweme.miniapp.c.c());
        arrayList.add(new e());
        arrayList.add(new g());
        arrayList.add(new com.ss.android.ugc.aweme.miniapp.c.a.e());
        arrayList.add(new com.ss.android.ugc.aweme.miniapp.c.a.c());
        arrayList.add(new a());
        arrayList.add(new com.ss.android.ugc.aweme.miniapp.c.a.c());
        return arrayList;
    }
}
