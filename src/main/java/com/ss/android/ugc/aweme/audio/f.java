package com.ss.android.ugc.aweme.audio;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import java.util.Map;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34415a;

    /* renamed from: b  reason: collision with root package name */
    private final c f34416b;

    f(c cVar) {
        this.f34416b = cVar;
    }

    public final void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f34415a, false, 23901, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f34415a, false, 23901, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        c cVar = this.f34416b;
        if (cVar.f2715d instanceof FragmentActivity) {
            Aweme a2 = AwemeChangeCallBack.a((FragmentActivity) cVar.f2715d);
            String str2 = null;
            if (a2 != null) {
                str2 = a2.getAid();
                str = a2.getAuthorUid();
            } else {
                str = null;
            }
            if (cVar.k != null && cVar.k.isShowing()) {
                cVar.k.dismiss();
            }
            r.a("click_mute_icon", (Map) d.a().a("is_mute", cVar.i ^ true ? 1 : 0).a("group_id", str2).a("author_id", str).a("enter_from", cVar.j).f34114b);
            if (!cVar.i) {
                int b2 = a.b(cVar.f2715d);
                if (b2 > 0) {
                    c.f2714c = b2;
                }
            }
            cVar.a(true ^ cVar.i);
        }
    }
}
