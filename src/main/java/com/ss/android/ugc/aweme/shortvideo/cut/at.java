package com.ss.android.ugc.aweme.shortvideo.cut;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter;

public final /* synthetic */ class at implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66392a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoSegmentAdapter.VideoSegmentViewHolder f66393b;

    /* renamed from: c  reason: collision with root package name */
    private final VideoSegmentAdapter.VideoSegmentViewHolder f66394c;

    at(VideoSegmentAdapter.VideoSegmentViewHolder videoSegmentViewHolder, VideoSegmentAdapter.VideoSegmentViewHolder videoSegmentViewHolder2) {
        this.f66393b = videoSegmentViewHolder;
        this.f66394c = videoSegmentViewHolder2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f66392a, false, 75798, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f66392a, false, 75798, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VideoSegmentAdapter.VideoSegmentViewHolder videoSegmentViewHolder = this.f66393b;
        VideoSegmentAdapter.VideoSegmentViewHolder videoSegmentViewHolder2 = this.f66394c;
        if (VideoSegmentAdapter.this.f66330e) {
            int adapterPosition = videoSegmentViewHolder2.getAdapterPosition();
            VideoSegmentAdapter.this.f66329d.a(view, adapterPosition, VideoSegmentAdapter.this.f66327b.get(adapterPosition).f66396b.f66495b);
        }
    }
}
