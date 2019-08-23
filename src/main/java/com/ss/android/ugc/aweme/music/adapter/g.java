package com.ss.android.ugc.aweme.music.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.adapter.ThirdMusicCoverAdapter;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56291a;

    /* renamed from: b  reason: collision with root package name */
    private final ThirdMusicCoverAdapter.ThirdMusicCoverViewHolder f56292b;

    g(ThirdMusicCoverAdapter.ThirdMusicCoverViewHolder thirdMusicCoverViewHolder) {
        this.f56292b = thirdMusicCoverViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f56291a, false, 59954, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f56291a, false, 59954, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ThirdMusicCoverAdapter.ThirdMusicCoverViewHolder thirdMusicCoverViewHolder = this.f56292b;
        if (ThirdMusicCoverAdapter.this.f56258b != null) {
            ThirdMusicCoverAdapter.this.f56258b.a(thirdMusicCoverViewHolder.getLayoutPosition());
        }
    }
}
