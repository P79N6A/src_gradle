package com.ss.android.ugc.aweme.feed;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.h.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.command.e;
import com.ss.android.ugc.aweme.feed.share.command.o;
import com.ss.android.ugc.aweme.feed.ui.g;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45629a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f45630b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f45631c;

    /* renamed from: d  reason: collision with root package name */
    private final IShareService.SharePage f45632d;

    /* renamed from: e  reason: collision with root package name */
    private final n f45633e;

    /* renamed from: f  reason: collision with root package name */
    private final String f45634f;

    public p(Aweme aweme, Context context, IShareService.SharePage sharePage, n nVar, String str) {
        this.f45630b = aweme;
        this.f45631c = context;
        this.f45632d = sharePage;
        this.f45633e = nVar;
        this.f45634f = str;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45629a, false, 40032, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45629a, false, 40032, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Aweme aweme = this.f45630b;
        Context context = this.f45631c;
        IShareService.SharePage sharePage = this.f45632d;
        n nVar = this.f45633e;
        String str = this.f45634f;
        if (!a.a(view) && !d.c(aweme) && !TimeLockRuler.isEnableShowTeenageTip(C0906R.string.cij)) {
            if (c.L(aweme)) {
                com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.ca).a();
                sharePage.dismiss();
            } else if (g.e(aweme)) {
                nVar.a(aweme.getAid());
                sharePage.dismiss();
            } else {
                sharePage.dismiss();
                Activity a2 = v.a(context);
                if (a2 != null) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("enter_from", str);
                    hashMap.put("author_id", aweme.getAuthorUid());
                    hashMap.put("group_id", aweme.getAid());
                    hashMap.put("qr_code_type", (AbTestManager.a().bh() || aweme.isForwardAweme()) ? "shaped" : "general");
                    if (aweme.isForwardAweme()) {
                        if (aweme.getForwardItem() != null) {
                            hashMap.put("from_user_id", aweme.getForwardItem().getAuthorUid());
                            hashMap.put("from_group_id", aweme.getForwardItem().getAid());
                            hashMap.put("repost_from_group_id", aweme.getForwardItem().getForwardItemId());
                            hashMap.put("repost_from_user_id", aweme.getForwardItem().getForwardUserId());
                        }
                        hashMap.put("is_reposted", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        hashMap.put("forward_user_id", aweme.getForwardUserId());
                        hashMap.put("forward_group_id", aweme.getForwardGroupId());
                    }
                    r.a("click_qr_code", (Map) d.a().a(hashMap).a("platform", "scan").f34114b);
                    com.ss.android.ugc.aweme.feed.share.command.d a3 = e.a(aweme, (Context) a2);
                    a3.j.extraParams = hashMap;
                    new o(a2, a3).show();
                }
            }
        }
    }
}
