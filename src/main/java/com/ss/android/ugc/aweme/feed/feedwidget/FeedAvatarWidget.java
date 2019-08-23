package com.ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.FeedAvatarView;
import com.ss.android.ugc.aweme.feed.ui.ak;
import com.ss.android.ugc.aweme.utils.GenericWidget;

public class FeedAvatarWidget extends GenericWidget implements Observer<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45325a;

    /* renamed from: b  reason: collision with root package name */
    private FeedAvatarView f45326b;
    private ak k;

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f45325a, false, 41121, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45325a, false, 41121, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a("video_params", (Observer<a>) this);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f45325a, false, 41124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45325a, false, 41124, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f45326b != null) {
            this.f45326b.b();
        }
    }

    public FeedAvatarWidget(ak akVar) {
        this.k = akVar;
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45325a, false, 41122, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45325a, false, 41122, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.f45326b = new FeedAvatarView(view, this.k);
        this.f45326b.b(this.g);
        VideoItemParams videoItemParams = (VideoItemParams) this.g.a("video_params");
        if (videoItemParams != null) {
            this.f45326b.a(videoItemParams);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f45325a, false, 41123, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f45325a, false, 41123, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (!(this.f45326b == null || aVar == null || !TextUtils.equals(aVar.f34376a, "video_params"))) {
            VideoItemParams videoItemParams = (VideoItemParams) aVar.a();
            if (videoItemParams != null) {
                this.f45326b.a(videoItemParams);
            }
        }
    }
}
