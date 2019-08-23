package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Category;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41930a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoryNewViewHolder f41931b;

    /* renamed from: c  reason: collision with root package name */
    private final Challenge f41932c;

    /* renamed from: d  reason: collision with root package name */
    private final Category f41933d;

    /* renamed from: e  reason: collision with root package name */
    private final int f41934e;

    b(CategoryNewViewHolder categoryNewViewHolder, Challenge challenge, Category category, int i) {
        this.f41931b = categoryNewViewHolder;
        this.f41932c = challenge;
        this.f41933d = category;
        this.f41934e = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f41930a, false, 35526, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f41930a, false, 35526, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CategoryNewViewHolder categoryNewViewHolder = this.f41931b;
        Challenge challenge = this.f41932c;
        Category category = this.f41933d;
        int i = this.f41934e;
        r.a("cell_click", (Map) new d().a("enter_from", "discovery").a("tag_id", challenge.getCid()).f34114b);
        categoryNewViewHolder.a(category.getWord());
        if (challenge.isCommerceAndValid()) {
            h a2 = h.a();
            a2.a(j.a("aweme://challenge/detail/" + challenge.getCid()).a("enter_from", "discovery").a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType()).a("is_commerce", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a());
            r.a("enter_tag_detail", (Map) new d().a("enter_from", "discovery").a("tag_id", challenge.getCid()).f34114b);
        } else {
            h.a().a(j.a("aweme://aweme/detail/" + challenge.getCategoryCover().getAwemeId()).a("refer", "discovery").a("video_from", "from_discovery_challenge").a("video_type", 2).a("challenge_id", challenge.getCid()).a());
        }
        if (category.isChallengeAd()) {
            HashMap hashMap = new HashMap();
            hashMap.put("topic_order", Integer.valueOf((i + 1) - categoryNewViewHolder.f41565f));
            com.ss.android.ugc.aweme.commercialize.log.d.a().a("list_ad").b("click").a(Long.valueOf(category.getCreativeId())).g(category.getLogExtra()).a((Object) hashMap).a(categoryNewViewHolder.itemView.getContext());
        }
    }
}
