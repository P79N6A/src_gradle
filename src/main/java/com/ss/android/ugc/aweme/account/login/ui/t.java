package com.ss.android.ugc.aweme.account.login.ui;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.a.a.b;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.w;
import java.util.Map;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32647a;

    /* renamed from: b  reason: collision with root package name */
    private final OneLoginStartFragment f32648b;

    t(OneLoginStartFragment oneLoginStartFragment) {
        this.f32648b = oneLoginStartFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f32647a, false, 20675, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f32647a, false, 20675, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        OneLoginStartFragment oneLoginStartFragment = this.f32648b;
        int id = view.getId();
        if (id == C0906R.id.dms) {
            if (oneLoginStartFragment.getActivity() != null) {
                oneLoginStartFragment.getActivity().finish();
            }
        } else if (id == C0906R.id.bul) {
            if (oneLoginStartFragment.getActivity() != null && (oneLoginStartFragment.getActivity() instanceof LoginOrRegisterActivity)) {
                oneLoginStartFragment.e();
            }
        } else if (id == C0906R.id.buo) {
            oneLoginStartFragment.d();
        } else if (id == C0906R.id.dn8) {
            try {
                h.a().a(g.b().aQ().getNotLoggedIn());
            } catch (a unused) {
                ((v) w.a(v.class)).a((Context) w.b(), "https://aweme.snssdk.com/falcon/douyin_falcon/faq/?id=1209", true);
            }
            r.a("click_feedback_entrance", (Map) new b().a("enter_method", oneLoginStartFragment.n).a("enter_from", "login_pad").f31599b);
            r.onEvent(MobClick.obtain().setEventName("sign_in_problem").setLabelName("sign_in_page"));
        } else if (id == C0906R.id.dn_) {
            ((v) w.a(v.class)).a(oneLoginStartFragment.getContext(), "https://www.douyin.com/falcon/douyin_falcon/privacy_agreement/", true);
        } else if (id == C0906R.id.dna) {
            ((v) w.a(v.class)).a(oneLoginStartFragment.getContext(), "https://www.douyin.com/falcon/douyin_falcon/user_agreement/", true);
        }
    }
}
