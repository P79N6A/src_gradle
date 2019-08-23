package com.ss.android.ugc.aweme.feed;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.h.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.g;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.qrcode.d;
import com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.Map;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45269a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f45270b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f45271c;

    /* renamed from: d  reason: collision with root package name */
    private final IShareService.SharePage f45272d;

    /* renamed from: e  reason: collision with root package name */
    private final n f45273e;

    /* renamed from: f  reason: collision with root package name */
    private final String f45274f;

    public f(Aweme aweme, Context context, IShareService.SharePage sharePage, n nVar, String str) {
        this.f45270b = aweme;
        this.f45271c = context;
        this.f45272d = sharePage;
        this.f45273e = nVar;
        this.f45274f = str;
    }

    public final void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f45269a, false, 40022, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45269a, false, 40022, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Aweme aweme = this.f45270b;
        Context context = this.f45271c;
        IShareService.SharePage sharePage = this.f45272d;
        n nVar = this.f45273e;
        String str2 = this.f45274f;
        if (!a.a(view) && !d.c(aweme) && !TimeLockRuler.isEnableShowTeenageTip(C0906R.string.cij)) {
            if (c.L(aweme)) {
                com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.ca).a();
                sharePage.dismiss();
            } else if (g.e(aweme)) {
                nVar.a(aweme.getAid());
                sharePage.dismiss();
            } else {
                sharePage.dismiss();
                r.a("share_video", (Map) d.a().a("enter_from", str2).a("platform", "scan").a("author_id", aweme.getAuthorUid()).a("group_id", aweme.getAid()).a("is_long_item", com.ss.android.ugc.aweme.longvideo.b.a.b(context) ? 1 : 0).a("enter_method", "click_qr_code").a("_staging_flag", com.ss.android.g.a.b() ^ true ? 1 : 0).f34114b);
                d.a a2 = new d.a().a(1, aweme.getAid(), "video");
                String desc = PatchProxy.isSupport(new Object[]{aweme}, null, aa.f75004a, true, 58920, new Class[]{Aweme.class}, String.class) ? (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, aa.f75004a, true, 58920, new Class[]{Aweme.class}, String.class) : aweme == null ? "" : aweme.getDesc();
                if (PatchProxy.isSupport(new Object[]{aweme}, null, ex.f75854a, true, 88671, new Class[]{Aweme.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, ex.f75854a, true, 88671, new Class[]{Aweme.class}, String.class);
                } else {
                    str = (aweme == null || aweme.getAuthor() == null) ? "" : aweme.getAuthor().getNickname();
                }
                a2.f63387b.title = desc;
                a2.f63387b.describe = str;
                QRCodeActivityV2.a(context, a2.f63387b);
            }
        }
    }
}
