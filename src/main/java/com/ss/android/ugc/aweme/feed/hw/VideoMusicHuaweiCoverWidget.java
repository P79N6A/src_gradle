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
import com.ss.android.ugc.aweme.feed.ui.bt;

public class VideoMusicHuaweiCoverWidget extends Widget implements Observer<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45542a;

    /* renamed from: b  reason: collision with root package name */
    bt f45543b;
    HwMusicViewModel k;

    public /* bridge */ /* synthetic */ void onChanged(@Nullable Object obj) {
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f45542a, false, 41347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45542a, false, 41347, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a("video_params", (Observer<a>) this);
        this.k = (HwMusicViewModel) ViewModelProviders.of((FragmentActivity) c()).get(HwMusicViewModel.class);
        this.k.b().observe(a(), this);
        this.k.a().observe(a(), new b(this));
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45542a, false, 41348, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45542a, false, 41348, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.f45543b = new bt(view);
        if (PatchProxy.isSupport(new Object[0], this, f45542a, false, 41350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45542a, false, 41350, new Class[0], Void.TYPE);
        } else if (this.f45543b != null) {
            this.f45543b.b(this.g);
        }
        VideoItemParams videoItemParams = (VideoItemParams) this.g.a("video_params");
        if (videoItemParams != null) {
            this.f45543b.a(videoItemParams);
        }
    }
}
