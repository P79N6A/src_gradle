package com.ss.android.ugc.aweme.account.ui;

import android.arch.lifecycle.Observer;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.k.a;
import com.ss.android.ugc.aweme.account.model.b;
import com.ss.android.ugc.aweme.account.util.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class i implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33048a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseBindMobileActivity f33049b;

    i(BaseBindMobileActivity baseBindMobileActivity) {
        this.f33049b = baseBindMobileActivity;
    }

    public final void onChanged(Object obj) {
        String str;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f33048a, false, 21072, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f33048a, false, 21072, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        BaseBindMobileActivity baseBindMobileActivity = this.f33049b;
        b bVar = (b) obj;
        if (bVar != null && !TextUtils.isEmpty(bVar.f32743b) && !TextUtils.isEmpty(baseBindMobileActivity.q)) {
            if (baseBindMobileActivity.q == null || !baseBindMobileActivity.q.contains("third_party_")) {
                str = baseBindMobileActivity.q;
            } else {
                str = "log_in";
            }
            r.a("phone_bundling_success", (Map) com.ss.android.ugc.aweme.account.a.a.b.a().a("enter_from", str).a("status", 1).a("platform", a.a(d.a(baseBindMobileActivity.q))).f31599b);
        }
    }
}
