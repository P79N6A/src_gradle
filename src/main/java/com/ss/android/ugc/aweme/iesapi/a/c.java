package com.ss.android.ugc.aweme.iesapi.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.iesapi.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.b.a;
import com.ss.android.ugc.aweme.setting.serverpush.b.d;
import com.ss.android.ugc.aweme.shortvideo.util.ac;

public final class c extends a implements a {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f50041d;

    /* renamed from: e  reason: collision with root package name */
    private d f50042e = new d();

    public final void X_() {
        if (PatchProxy.isSupport(new Object[0], this, f50041d, false, 50013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50041d, false, 50013, new Class[0], Void.TYPE);
            return;
        }
        b();
        this.f50011c.a("");
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f50041d, false, 50012, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50041d, false, 50012, new Class[0], Void.TYPE);
            return;
        }
        b();
        this.f50011c.a();
        com.ss.android.ugc.aweme.account.d.a().queryUser();
    }

    public c(Context context) {
        super(context);
        this.f50042e.a(this);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(a.C0592a aVar) {
        if (ac.a()) {
            super.a(aVar);
            a(true);
            return;
        }
        b();
        aVar.a("");
    }

    public final void a(a.C0592a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f50041d, false, 50008, new Class[]{a.C0592a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f50041d, false, 50008, new Class[]{a.C0592a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        a();
        a(true);
    }

    public final void b(a.C0592a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f50041d, false, 50009, new Class[]{a.C0592a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f50041d, false, 50009, new Class[]{a.C0592a.class}, Void.TYPE);
            return;
        }
        super.b(aVar);
        a();
        a(false);
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50041d, false, 50011, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50041d, false, 50011, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
        if (curUser != null) {
            curUser.setIsSyncToutiao(z ? 1 : 0);
            com.ss.android.ugc.aweme.account.d.a().updateCurUser(curUser);
        } else {
            boolean z2 = z;
        }
        SharePrefCache.inst().getSyncTT().a(Integer.valueOf(z ? 1 : 0));
        this.f50042e.a("sync_to_toutiao", Integer.valueOf(z));
    }
}
