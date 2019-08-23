package com.ss.android.ugc.aweme.hotsearch;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.model.f;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49641a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListActivity f49642b;

    /* renamed from: c  reason: collision with root package name */
    private final f f49643c;

    a(RankingListActivity rankingListActivity, f fVar) {
        this.f49642b = rankingListActivity;
        this.f49643c = fVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49641a, false, 49536, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49641a, false, 49536, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        RankingListActivity rankingListActivity = this.f49642b;
        f fVar = this.f49643c;
        if (AbTestManager.a().bv() != 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "hot_search_board");
            r.a("click_ad_sticker", (Map) hashMap);
            if (!g.a((Context) rankingListActivity, fVar.f39381b.f39387c, false)) {
                g.a((Context) rankingListActivity, fVar.f39381b.f39388d, fVar.f39381b.f39389e);
            }
        }
    }
}
