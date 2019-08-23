package com.ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.bt;
import com.ss.android.ugc.aweme.utils.GenericWidget;

public class VideoMusicCoverWidget extends GenericWidget implements Observer<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45335a;

    /* renamed from: b  reason: collision with root package name */
    bt f45336b;

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f45335a, false, 41142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45335a, false, 41142, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a("video_params", (Observer<a>) this);
        this.g.a("hw_hide_origin_music_widget", (Observer<a>) this);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f45335a, false, 41146, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45335a, false, 41146, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f45336b != null) {
            this.f45336b.h();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f45335a, false, 41147, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45335a, false, 41147, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.f45336b != null) {
            this.f45336b.g();
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45335a, false, 41143, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45335a, false, 41143, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.f45336b = new bt(view);
        this.f45336b.b(this.g);
        VideoItemParams videoItemParams = (VideoItemParams) this.g.a("video_params");
        if (videoItemParams != null) {
            this.f45336b.a(videoItemParams);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f45335a, false, 41144, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f45335a, false, 41144, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.f45336b != null) {
            if (aVar != null && TextUtils.equals(aVar.f34376a, "video_params")) {
                VideoItemParams videoItemParams = (VideoItemParams) aVar.a();
                if (videoItemParams != null) {
                    this.f45336b.a(videoItemParams);
                }
            } else if (aVar != null && TextUtils.equals(aVar.f34376a, "hw_hide_origin_music_widget")) {
                if (PatchProxy.isSupport(new Object[0], this, f45335a, false, 41145, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f45335a, false, 41145, new Class[0], Void.TYPE);
                    return;
                }
                if (this.f45336b != null) {
                    this.f45336b.h();
                    this.f45336b.i();
                }
                if (this.f2711f != null && (this.f2711f instanceof ViewGroup)) {
                    ((ViewGroup) this.f2711f).removeAllViews();
                }
            }
        }
    }
}
