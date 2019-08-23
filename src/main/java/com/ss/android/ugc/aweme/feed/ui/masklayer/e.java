package com.ss.android.ugc.aweme.feed.ui.masklayer;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

public final class e extends com.ss.android.ugc.aweme.feed.ui.e implements Observer<a> {
    public static ChangeQuickRedirect l;
    private FrameLayout m;

    public final void a(DataCenter dataCenter) {
    }

    public final void b() {
    }

    public final /* bridge */ /* synthetic */ void onChanged(@Nullable Object obj) {
    }

    public e(View view) {
        super(view);
    }

    public final void a(View view) {
        if (view instanceof FrameLayout) {
            this.m = (FrameLayout) view;
        }
    }

    public final void a(VideoItemParams videoItemParams) {
        if (PatchProxy.isSupport(new Object[]{videoItemParams}, this, l, false, 43407, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams}, this, l, false, 43407, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        super.a(videoItemParams);
    }
}
