package com.ss.android.ugc.aweme.hotsearch.view;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.ui.OnAnimatedScrollListener;
import com.ss.android.ugc.aweme.discover.model.HotVideoItem;
import com.ss.android.ugc.aweme.hotsearch.adapter.BaseHotSearchAdapter;
import com.ss.android.ugc.aweme.hotsearch.adapter.RankingListVideoAdapter;
import com.ss.android.ugc.aweme.hotsearch.fragment.RankingListVideoFragment;

public final class l extends a<HotVideoItem> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f49901f;
    private OnAnimatedScrollListener g = new OnAnimatedScrollListener();

    /* access modifiers changed from: package-private */
    public final BaseHotSearchAdapter f() {
        if (!PatchProxy.isSupport(new Object[0], this, f49901f, false, 49865, new Class[0], BaseHotSearchAdapter.class)) {
            return new RankingListVideoAdapter(this.f49867b, (RankingListVideoFragment) this.f49868c, this.f49868c.f49753b);
        }
        return (BaseHotSearchAdapter) PatchProxy.accessDispatch(new Object[0], this, f49901f, false, 49865, new Class[0], BaseHotSearchAdapter.class);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49901f, false, 49864, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49901f, false, 49864, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
        this.g.a(this.f49869d, false);
    }

    public l(View view, Context context, RankingListVideoFragment rankingListVideoFragment) {
        super(view, context, rankingListVideoFragment);
        this.f49869d.addOnScrollListener(this.g);
    }
}
