package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.d;
import java.util.Map;

public final /* synthetic */ class u implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70927a;

    /* renamed from: b  reason: collision with root package name */
    private final t f70928b;

    u(t tVar) {
        this.f70928b = tVar;
    }

    public final void OnSettingItemClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f70927a, false, 80286, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70927a, false, 80286, new Class[]{View.class}, Void.TYPE);
            return;
        }
        t tVar = this.f70928b;
        if (tVar.f70925d == null || tVar.f70925d.k != d.f63936e) {
            tVar.f70923b.setChecked(true ^ tVar.f70923b.a());
            if (PatchProxy.isSupport(new Object[0], tVar, t.f70922a, false, 80285, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], tVar, t.f70922a, false, 80285, new Class[0], Void.TYPE);
                return;
            }
            if (tVar.f70924c != null) {
                r.a("disable_comment", (Map) tVar.f70924c);
            }
            return;
        }
        a.c(tVar.f70923b.getContext(), tVar.f70923b.getContext().getString(C0906R.string.er)).a();
    }
}
