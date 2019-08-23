package com.ss.android.ugc.aweme.tools.extract;

import a.g;
import a.i;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.jni.EffectThumb;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.medialib.player.EffectConfig;
import com.ss.android.ugc.aweme.shortvideo.b.a;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure;
import com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment;
import com.ss.android.ugc.aweme.tools.extract.e;
import java.io.File;
import java.util.concurrent.Callable;

public final class l extends a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f74722f = null;
    public static final String i = "l";
    public EffectThumb g;
    public int h;
    public String j;
    VEPreviewConfigure k;

    public final String f() {
        return "extract_upload";
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public final /* bridge */ /* synthetic */ boolean b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ ExtractFramesModel e() {
        return super.e();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74722f, false, 87074, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74722f, false, 87074, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        if (this.g != null) {
            this.g.stopRender();
            this.g = null;
        }
        this.j = null;
    }

    public final /* bridge */ /* synthetic */ void a(ExtractFramesModel extractFramesModel) {
        super.a(extractFramesModel);
    }

    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public final void a(@NonNull final e.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f74722f, false, 87072, new Class[]{e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f74722f, false, 87072, new Class[]{e.a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        if (b()) {
            i.a((Callable<TResult>) new Callable<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74726a;

                public final /* synthetic */ Object call() throws Exception {
                    long[] jArr;
                    if (PatchProxy.isSupport(new Object[0], this, f74726a, false, 87077, new Class[0], Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[0], this, f74726a, false, 87077, new Class[0], Void.class);
                    }
                    if (!TextUtils.isEmpty(l.this.j)) {
                        l.this.g = new a();
                        if (l.this.g.init(l.this.j) >= 0) {
                            EffectThumb effectThumb = l.this.g;
                            l lVar = l.this;
                            long duration = l.this.g.getDuration();
                            if (PatchProxy.isSupport(new Object[]{new Long(duration)}, lVar, l.f74722f, false, 87075, new Class[]{Long.TYPE}, long[].class)) {
                                l lVar2 = lVar;
                                jArr = (long[]) PatchProxy.accessDispatch(new Object[]{new Long(duration)}, lVar2, l.f74722f, false, 87075, new Class[]{Long.TYPE}, long[].class);
                            } else {
                                if (lVar.k != null && !lVar.k.getVideoSegments().isEmpty()) {
                                    VEVideoSegment vEVideoSegment = lVar.k.getVideoSegments().get(0);
                                    if (vEVideoSegment != null) {
                                        lVar.h = (vEVideoSegment.getEnd() - vEVideoSegment.start) / 500;
                                        long[] jArr2 = new long[lVar.h];
                                        for (int i = 0; i < lVar.h; i++) {
                                            jArr2[i] = (long) (vEVideoSegment.start + (i * 500));
                                        }
                                        jArr = jArr2;
                                    }
                                }
                                lVar.h = (int) (duration / 500);
                                jArr = new long[lVar.h];
                                for (int i2 = 0; i2 < lVar.h; i2++) {
                                    jArr[i2] = (long) (i2 * 500);
                                }
                            }
                            effectThumb.renderVideo(jArr, new EffectConfig().setEffectType(1), ExtractFrameConfig.f74690a[0], ExtractFrameConfig.f74690a[1]);
                            for (int i3 = 0; i3 < l.this.h; i3++) {
                                CoverInfo thumb = l.this.g.getThumb(i3);
                                if (!(thumb == null || thumb.getData() == null)) {
                                    Bitmap createBitmap = Bitmap.createBitmap(thumb.getData(), thumb.getWidth(), thumb.getHeight(), Bitmap.Config.RGB_565);
                                    if (createBitmap != null) {
                                        String a2 = l.this.f74694d.a();
                                        File file = new File(a2);
                                        if (file.exists()) {
                                            file.delete();
                                        }
                                        com.ss.android.ugc.aweme.tools.e.a(createBitmap, file, 70, Bitmap.CompressFormat.JPEG);
                                        l.this.f74692b.addFrameAtLastSegment(a2);
                                        if (!createBitmap.isRecycled()) {
                                            createBitmap.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
            }).a((g<TResult, TContinuationResult>) new g<Void, Object>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74723a;

                public final Object then(i<Void> iVar) {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f74723a, false, 87076, new Class[]{i.class}, Object.class)) {
                        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f74723a, false, 87076, new Class[]{i.class}, Object.class);
                    }
                    aVar.a(iVar.b());
                    l.this.a(true);
                    l.this.a();
                    return null;
                }
            });
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74722f, false, 87073, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74722f, false, 87073, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
        if (this.g != null) {
            this.g.stopRender();
        }
    }

    public l(String str, VEPreviewConfigure vEPreviewConfigure) {
        this.j = str;
        this.k = vEPreviewConfigure;
    }
}
