package com.ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.bo;
import com.ss.android.ugc.aweme.utils.GenericWidget;

public class VideoDiggWidget extends GenericWidget implements Observer<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45331a;

    /* renamed from: b  reason: collision with root package name */
    bo f45332b;
    private String k;

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f45331a, false, 41134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45331a, false, 41134, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a("video_params", (Observer<a>) this);
        this.g.a("awesome_update_data", (Observer<a>) this);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f45331a, false, 41136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45331a, false, 41136, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f45332b != null) {
            this.f45332b.b();
        }
    }

    public VideoDiggWidget(@Nullable String str) {
        this.k = str;
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45331a, false, 41135, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45331a, false, 41135, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.f45332b = new bo(view, this.k);
        this.f45332b.b(this.g);
        VideoItemParams videoItemParams = (VideoItemParams) this.g.a("video_params");
        if (videoItemParams != null) {
            this.f45332b.a(videoItemParams);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f45331a, false, 41137, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f45331a, false, 41137, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!(this.f45332b == null || aVar == null || (!TextUtils.equals(aVar.f34376a, "video_params") && !TextUtils.equals(aVar.f34376a, "awesome_update_data")))) {
            VideoItemParams videoItemParams = (VideoItemParams) aVar.a();
            if (videoItemParams != null) {
                this.f45332b.a(videoItemParams);
            }
        }
    }
}
