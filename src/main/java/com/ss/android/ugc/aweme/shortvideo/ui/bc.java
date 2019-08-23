package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.CutMusicModule;

public final /* synthetic */ class bc implements CutMusicModule.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70801a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70802b;

    bc(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70802b = videoRecordNewActivity;
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70801a, false, 80626, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70801a, false, 80626, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f70802b.a(i, i2);
    }
}
