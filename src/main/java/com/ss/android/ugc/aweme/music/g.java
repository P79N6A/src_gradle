package com.ss.android.ugc.aweme.music;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.a.f;
import com.ss.android.ugc.aweme.music.util.d;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56332a;

    /* renamed from: b  reason: collision with root package name */
    private final OriginMusicViewHolder f56333b;

    public g(OriginMusicViewHolder originMusicViewHolder) {
        this.f56333b = originMusicViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f56332a, false, 59861, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f56332a, false, 59861, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        OriginMusicViewHolder originMusicViewHolder = this.f56333b;
        if (PatchProxy.isSupport(new Object[0], originMusicViewHolder, OriginMusicViewHolder.f56141a, false, 59855, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], originMusicViewHolder, OriginMusicViewHolder.f56141a, false, 59855, new Class[0], Void.TYPE);
            return;
        }
        if (originMusicViewHolder.f56142b != null && d.a(originMusicViewHolder.f56142b, originMusicViewHolder.itemView.getContext(), true)) {
            if (originMusicViewHolder.f56145e != null) {
                originMusicViewHolder.f56145e.a(new f(originMusicViewHolder.f56142b, originMusicViewHolder.f56143c ? "unfollow_type" : "follow_type"));
            }
            originMusicViewHolder.f56143c = true ^ originMusicViewHolder.f56143c;
            originMusicViewHolder.mIvMusicCollect.b();
        }
    }
}
