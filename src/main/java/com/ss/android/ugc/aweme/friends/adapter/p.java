package com.ss.android.ugc.aweme.friends.adapter;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.RecommendAwemeItem;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48816a;

    /* renamed from: b  reason: collision with root package name */
    private final RecommendAwemeViewHolder f48817b;

    /* renamed from: c  reason: collision with root package name */
    private final int f48818c;

    p(RecommendAwemeViewHolder recommendAwemeViewHolder, int i) {
        this.f48817b = recommendAwemeViewHolder;
        this.f48818c = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48816a, false, 46331, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48816a, false, 46331, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        RecommendAwemeViewHolder recommendAwemeViewHolder = this.f48817b;
        int i = this.f48818c;
        if (!(recommendAwemeViewHolder.g == null || TextUtils.isEmpty(((RecommendAwemeItem) recommendAwemeViewHolder.g).getAid()) || recommendAwemeViewHolder.f48749c == null)) {
            recommendAwemeViewHolder.f48749c.a(((RecommendAwemeItem) recommendAwemeViewHolder.g).getAid(), i);
        }
    }
}
