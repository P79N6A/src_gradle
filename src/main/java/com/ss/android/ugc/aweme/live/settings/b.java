package com.ss.android.ugc.aweme.live.settings;

import a.g;
import a.i;
import android.content.Context;
import com.bytedance.android.live.base.sp.TTLiveSettingUtil;
import com.bytedance.android.livesdk.feed.j.a;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.live.d;

public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53537a;

    /* renamed from: b  reason: collision with root package name */
    public static final g f53538b = new b();

    private b() {
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f53537a, false, 55950, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f53537a, false, 55950, new Class[]{i.class}, Object.class);
        }
        if (!iVar.d()) {
            c cVar = (c) iVar.e();
            if (cVar.status_code == 0) {
                if (PatchProxy.isSupport(new Object[]{cVar}, null, d.f53357a, true, 55390, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, null, d.f53357a, true, 55390, new Class[]{c.class}, Void.TYPE);
                } else if (cVar != null && cVar.status_code == 0) {
                    k a2 = k.a();
                    JsonObject jsonObject = cVar.f53539a;
                    if (PatchProxy.isSupport(new Object[]{a2, jsonObject}, null, a.f14209a, true, 8900, new Class[]{Context.class, JsonObject.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{a2, jsonObject}, null, a.f14209a, true, 8900, new Class[]{Context.class, JsonObject.class}, Void.TYPE);
                    } else {
                        TTLiveSettingUtil.updateSettings(a2, jsonObject);
                    }
                }
            }
        }
        return null;
    }
}
