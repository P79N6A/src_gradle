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
import com.ss.android.ugc.aweme.feed.ui.bu;
import com.ss.android.ugc.aweme.utils.GenericWidget;

public class VideoMusicTitleWidget extends GenericWidget implements Observer<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45337a;

    /* renamed from: b  reason: collision with root package name */
    bu f45338b;

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f45337a, false, 41148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45337a, false, 41148, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a("video_params", (Observer<a>) this);
        this.g.a("hw_hide_origin_music_widget", (Observer<a>) this);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45337a, false, 41149, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45337a, false, 41149, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.f45338b = new bu(view);
        this.f45338b.b(this.g);
        VideoItemParams videoItemParams = (VideoItemParams) this.g.a("video_params");
        if (videoItemParams != null) {
            this.f45338b.a(videoItemParams);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f45337a, false, 41150, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f45337a, false, 41150, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.f45338b != null) {
            if (aVar != null && TextUtils.equals(aVar.f34376a, "video_params")) {
                VideoItemParams videoItemParams = (VideoItemParams) aVar.a();
                if (this.f45338b != null) {
                    this.f45338b.a(videoItemParams);
                }
            } else if (aVar != null && TextUtils.equals(aVar.f34376a, "hw_hide_origin_music_widget")) {
                if (PatchProxy.isSupport(new Object[0], this, f45337a, false, 41151, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f45337a, false, 41151, new Class[0], Void.TYPE);
                    return;
                }
                if (this.f45338b != null) {
                    this.f45338b.g();
                    this.f45338b.h();
                }
                if (this.f2711f != null && (this.f2711f instanceof ViewGroup)) {
                    ((ViewGroup) this.f2711f).removeAllViews();
                }
            }
        }
    }
}
