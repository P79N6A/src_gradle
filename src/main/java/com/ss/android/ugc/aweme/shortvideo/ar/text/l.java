package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65720a;

    /* renamed from: b  reason: collision with root package name */
    r[] f65721b;

    /* renamed from: c  reason: collision with root package name */
    q f65722c;

    /* renamed from: d  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f65723d;

    public l(r[] rVarArr, FragmentActivity fragmentActivity, ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        if (fragmentActivity != null) {
            this.f65721b = rVarArr;
            this.f65723d = shortVideoRecordingOperationPanelFragment;
            ((ARTextResultModule) ViewModelProviders.of(fragmentActivity).get(ARTextResultModule.class)).a().observe(fragmentActivity, new m(this));
        }
    }
}
