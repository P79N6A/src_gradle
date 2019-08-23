package com.ss.android.ugc.aweme.shortvideo.q.a;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.ugc.aweme.base.utils.t;
import com.ss.android.ugc.aweme.shortvideo.bm;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.video.b;
import com.ss.android.vesdk.VEUtils;

public final class a extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68939a;

    /* renamed from: b  reason: collision with root package name */
    com.ss.android.ugc.aweme.shortvideo.q.a f68940b;

    /* renamed from: c  reason: collision with root package name */
    private String f68941c;

    /* renamed from: d  reason: collision with root package name */
    private String f68942d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f68943e;

    public final void run() {
        int i;
        int i2;
        float f2;
        int i3;
        if (PatchProxy.isSupport(new Object[0], this, f68939a, false, 81109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68939a, false, 81109, new Class[0], Void.TYPE);
            return;
        }
        String str = com.ss.android.ugc.aweme.port.in.a.f61119b.getExternalCacheDir() + "/watermark.png";
        if (bm.a(str)) {
            b.c(str);
        }
        int[] a2 = FFMpegManager.a().a(this.f68941c);
        if (a2[0] == 0) {
            i = a2[2];
            i2 = a2[3];
        } else {
            i2 = 0;
            i = 0;
        }
        FFMpegManager.a().b();
        if (i < i2) {
            f2 = 0.47f;
        } else {
            f2 = 0.27f;
        }
        if (i > i2) {
            i3 = 480;
        } else {
            i3 = 270;
        }
        VEUtils.b bVar = new VEUtils.b();
        bVar.f77854c = ff.a(".png");
        bVar.f77852a = this.f68941c;
        bVar.f77853b = this.f68942d;
        bVar.f77857f = 0.4f;
        bVar.g = 8;
        bVar.h = i3;
        if (this.f68943e) {
            float f3 = (float) i;
            bVar.j = (int) ((1.0f - f2) * f3);
            bVar.k = 0;
            bVar.f77856e = (int) (f2 * f3);
            new com.ss.android.ugc.aweme.shortvideo.q.b.b().a().a(str);
            bVar.f77855d = str;
        }
        int convertVideo2Gif = VEUtils.convertVideo2Gif(bVar, new b(this));
        b.c(str);
        t.a(new c(this, convertVideo2Gif));
    }

    public a(String str, String str2, boolean z, @Nullable com.ss.android.ugc.aweme.shortvideo.q.a aVar) {
        this.f68941c = str;
        this.f68942d = str2;
        this.f68940b = aVar;
        this.f68943e = z;
    }
}
