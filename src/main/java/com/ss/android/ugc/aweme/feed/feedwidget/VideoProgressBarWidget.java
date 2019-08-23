package com.ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.bx;
import com.ss.android.ugc.aweme.feed.ui.e;

public class VideoProgressBarWidget extends AbsFeedWidget implements Observer<a> {
    public static ChangeQuickRedirect k;
    bx l;

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 41154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 41154, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a("video_params", (Observer<a>) this);
    }

    /* renamed from: a */
    public final void onChanged(@Nullable a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, k, false, 41156, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, k, false, 41156, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!(this.l == null || aVar == null || !TextUtils.equals(aVar.f34376a, "video_params"))) {
            VideoItemParams videoItemParams = (VideoItemParams) aVar.a();
            if (videoItemParams != null) {
                this.l.a(videoItemParams);
            }
        }
    }

    public final e b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, k, false, 41155, new Class[]{View.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{view}, this, k, false, 41155, new Class[]{View.class}, e.class);
        }
        this.l = new bx(view, c());
        VideoItemParams videoItemParams = (VideoItemParams) this.g.a("video_params");
        if (videoItemParams != null) {
            this.l.a(videoItemParams);
        }
        return this.l;
    }
}
