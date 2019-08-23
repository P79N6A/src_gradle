package com.ss.android.ugc.aweme.live.authentication.b.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.live.authentication.b.a;
import com.ss.android.ugc.aweme.live.authentication.model.b;
import com.ss.android.ugc.aweme.utils.bg;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53303a;

    public final void a(a.C0618a aVar) {
        final a.C0618a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f53303a, false, 55648, new Class[]{a.C0618a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f53303a, false, 55648, new Class[]{a.C0618a.class}, Void.TYPE);
            return;
        }
        if (aVar.a().f53309b.getSupportFragmentManager().getBackStackEntryCount() == 2) {
            aVar.a().f53309b.b();
        }
        if (!aVar.a().f53308a.live_agreement || !aVar.a().f53308a.live_answer) {
            if (!b.a().f53325b.live_agreement) {
                h.a().a(com.ss.android.ugc.aweme.live.authentication.a.a.a("aweme://ame/webview/?url=https://www.douyin.com/falcon/douyin_falcon/anchor/agreement/").a("show_load_dialog", false).a("hide_nav_bar", true).a("live_type", b.a().f53326c).a());
                return;
            }
            if (!b.a().f53325b.live_answer) {
                h.a().a(com.ss.android.ugc.aweme.live.authentication.a.a.a("aweme://ame/webview/?url=https://www.douyin.com/falcon/douyin_falcon/anchor/question/").a("show_load_dialog", false).a("hide_nav_bar", true).a("live_type", b.a().f53326c).a());
            }
            return;
        }
        aVar.a().f53310c.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53304a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f53304a, false, 55649, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53304a, false, 55649, new Class[0], Void.TYPE);
                    return;
                }
                bg.a(new com.ss.android.ugc.aweme.live.authentication.model.a());
                aVar2.a().f53309b.finish();
            }
        }, 100);
    }
}
