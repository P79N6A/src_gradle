package com.ss.android.ugc.aweme.feed;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.h.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.command.o;
import com.ss.android.ugc.aweme.feed.ui.g;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45255a;

    /* renamed from: b  reason: collision with root package name */
    private final d f45256b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f45257c;

    /* renamed from: d  reason: collision with root package name */
    private final n f45258d;

    e(d dVar, Aweme aweme, n nVar) {
        this.f45256b = dVar;
        this.f45257c = aweme;
        this.f45258d = nVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45255a, false, 40021, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45255a, false, 40021, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        d dVar = this.f45256b;
        Aweme aweme = this.f45257c;
        n nVar = this.f45258d;
        if (!a.a(view) && !d.c(aweme) && !TimeLockRuler.isEnableShowTeenageTip(C0906R.string.cij) && dVar.f(aweme)) {
            if (g.e(aweme)) {
                nVar.a(aweme.getAid());
                dVar.k.dismiss();
                return;
            }
            dVar.l.dismiss();
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("enter_from", dVar.r);
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
            com.ss.android.ugc.aweme.feed.share.command.d a2 = com.ss.android.ugc.aweme.feed.share.command.e.a(aweme, (Context) dVar.c());
            a2.j.extraParams = hashMap;
            new o(dVar.c(), a2).show();
        }
    }
}
