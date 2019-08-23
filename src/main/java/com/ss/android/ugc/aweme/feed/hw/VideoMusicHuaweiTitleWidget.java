package com.ss.android.ugc.aweme.feed.hw;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.bu;

public class VideoMusicHuaweiTitleWidget extends Widget implements Observer<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45544a;

    /* renamed from: b  reason: collision with root package name */
    bu f45545b;
    HwMusicViewModel k;

    public /* bridge */ /* synthetic */ void onChanged(@Nullable Object obj) {
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f45544a, false, 41352, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45544a, false, 41352, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a("video_params", (Observer<a>) this);
        this.k = (HwMusicViewModel) ViewModelProviders.of((FragmentActivity) c()).get(HwMusicViewModel.class);
        this.k.b().observe(a(), this);
        this.k.a().observe(a(), new Observer<VideoItemParams>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45546a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                VideoItemParams videoItemParams = (VideoItemParams) obj;
                if (PatchProxy.isSupport(new Object[]{videoItemParams}, this, f45546a, false, 41356, new Class[]{VideoItemParams.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{videoItemParams}, this, f45546a, false, 41356, new Class[]{VideoItemParams.class}, Void.TYPE);
                    return;
                }
                if (VideoMusicHuaweiTitleWidget.this.f45545b != null) {
                    VideoMusicHuaweiTitleWidget.this.f45545b.a(videoItemParams);
                }
            }
        });
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45544a, false, 41353, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45544a, false, 41353, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.f45545b = new bu(view);
        if (PatchProxy.isSupport(new Object[0], this, f45544a, false, 41354, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45544a, false, 41354, new Class[0], Void.TYPE);
        } else if (this.f45545b != null) {
            this.f45545b.b(this.g);
        }
        VideoItemParams videoItemParams = (VideoItemParams) this.g.a("video_params");
        if (videoItemParams != null) {
            this.f45545b.a(videoItemParams);
        }
    }
}
