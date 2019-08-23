package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.playerkit.a.d;
import com.ss.android.ugc.playerkit.c.f;
import com.ss.android.ugc.playerkit.videoview.c.a;

public final /* synthetic */ class s implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76268a;

    /* renamed from: b  reason: collision with root package name */
    private final o f76269b;

    /* renamed from: c  reason: collision with root package name */
    private final VideoUrlModel f76270c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f76271d;

    s(o oVar, VideoUrlModel videoUrlModel, boolean z) {
        this.f76269b = oVar;
        this.f76270c = videoUrlModel;
        this.f76271d = z;
    }

    public final Object a() {
        if (PatchProxy.isSupport(new Object[0], this, f76268a, false, 89028, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f76268a, false, 89028, new Class[0], Object.class);
        }
        o oVar = this.f76269b;
        VideoUrlModel videoUrlModel = this.f76270c;
        boolean z = this.f76271d;
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel, Byte.valueOf(z ? (byte) 1 : 0)}, oVar, o.f76178a, false, 88977, new Class[]{VideoUrlModel.class, Boolean.TYPE}, f.class)) {
            return a.a().b(videoUrlModel.getBitRatedRatioUri()).a(videoUrlModel, oVar.m(), z);
        }
        return (f) PatchProxy.accessDispatch(new Object[]{videoUrlModel, Byte.valueOf(z)}, oVar, o.f76178a, false, 88977, new Class[]{VideoUrlModel.class, Boolean.TYPE}, f.class);
    }
}
