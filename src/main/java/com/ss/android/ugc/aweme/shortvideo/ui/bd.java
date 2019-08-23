package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;

public final /* synthetic */ class bd implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70803a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70804b;

    bd(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70804b = videoRecordNewActivity;
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.f fVar) {
        com.ss.android.ugc.aweme.shortvideo.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f70803a, false, 80627, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f70803a, false, 80627, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, Void.TYPE);
            return;
        }
        this.f70804b.a(fVar2);
    }
}
