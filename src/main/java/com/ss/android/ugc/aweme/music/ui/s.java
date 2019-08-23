package com.ss.android.ugc.aweme.music.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public final /* synthetic */ class s implements IAVService.MusicWaveDataListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56760a;

    /* renamed from: b  reason: collision with root package name */
    private final p f56761b;

    /* renamed from: c  reason: collision with root package name */
    private final MusicModel f56762c;

    /* renamed from: d  reason: collision with root package name */
    private final String f56763d;

    /* renamed from: e  reason: collision with root package name */
    private final String f56764e;

    s(p pVar, MusicModel musicModel, String str, String str2) {
        this.f56761b = pVar;
        this.f56762c = musicModel;
        this.f56763d = str;
        this.f56764e = str2;
    }

    public final void onFinish(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f56760a, false, 60349, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f56760a, false, 60349, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f56761b.a(this.f56762c, this.f56763d, this.f56764e, obj);
    }
}
