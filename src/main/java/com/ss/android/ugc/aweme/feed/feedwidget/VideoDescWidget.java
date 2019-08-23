package com.ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.bj;
import com.ss.android.ugc.aweme.utils.GenericWidget;

public class VideoDescWidget extends GenericWidget implements Observer<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45329a;

    /* renamed from: b  reason: collision with root package name */
    bj f45330b;

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f45329a, false, 41131, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45329a, false, 41131, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a("video_params", (Observer<a>) this);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45329a, false, 41132, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45329a, false, 41132, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.f45330b = new bj(view);
        this.f45330b.b(this.g);
        VideoItemParams videoItemParams = (VideoItemParams) this.g.a("video_params");
        if (videoItemParams != null) {
            this.f45330b.a(videoItemParams);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f45329a, false, 41133, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f45329a, false, 41133, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!(this.f45330b == null || aVar == null || !TextUtils.equals(aVar.f34376a, "video_params"))) {
            VideoItemParams videoItemParams = (VideoItemParams) aVar.a();
            if (videoItemParams != null) {
                this.f45330b.a(videoItemParams);
            }
        }
    }
}
