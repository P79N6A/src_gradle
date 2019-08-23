package com.ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.Observer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.e;
import com.ss.android.ugc.aweme.utils.GenericWidget;

public abstract class AbsFeedWidget extends GenericWidget implements Observer<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45323a;

    /* renamed from: b  reason: collision with root package name */
    e f45324b;

    @NonNull
    public abstract e b(View view);

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f45323a, false, 41117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45323a, false, 41117, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a("video_params", (Observer<a>) this);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f45323a, false, 41120, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45323a, false, 41120, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f45324b != null) {
            this.f45324b.b();
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45323a, false, 41118, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45323a, false, 41118, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.f45324b = b(view);
        this.f45324b.b(this.g);
        VideoItemParams videoItemParams = (VideoItemParams) this.g.a("video_params");
        if (videoItemParams != null) {
            this.f45324b.a(videoItemParams);
        }
    }

    /* renamed from: a */
    public void onChanged(@Nullable a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f45323a, false, 41119, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f45323a, false, 41119, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!(this.f45324b == null || aVar == null || !TextUtils.equals(aVar.f34376a, "video_params"))) {
            VideoItemParams videoItemParams = (VideoItemParams) aVar.a();
            if (this.f45324b != null) {
                this.f45324b.a(videoItemParams);
            }
        }
    }
}
