package com.ss.android.ugc.aweme.shortvideo.cut.gif.a;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.ugc.aweme.share.b.a;
import com.ss.android.ugc.aweme.shortvideo.bm;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.p;
import java.io.File;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66432a;

    static final /* synthetic */ Object a(@NonNull IVideo2GifService.ConvertListener convertListener, p pVar) throws Exception {
        convertListener.onDone(false);
        pVar.k();
        return null;
    }

    public final void a(@NonNull a aVar, @NonNull IVideo2GifService.ConvertListener convertListener) {
        int i;
        float f2;
        a aVar2 = aVar;
        IVideo2GifService.ConvertListener convertListener2 = convertListener;
        if (PatchProxy.isSupport(new Object[]{aVar2, convertListener2}, this, f66432a, false, 75834, new Class[]{a.class, IVideo2GifService.ConvertListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, convertListener2}, this, f66432a, false, 75834, new Class[]{a.class, IVideo2GifService.ConvertListener.class}, Void.TYPE);
            return;
        }
        convertListener.onStart();
        p pVar = new p(aVar2.g);
        if (pVar.a(new String[]{aVar2.f64703b}, (String[]) null, (String[]) null, p.i.VIDEO_OUT_RATIO_ORIGINAL) != 0) {
            convertListener2.onDone(false);
            return;
        }
        pVar.h();
        pVar.b((m) new c(convertListener2, pVar));
        pVar.a((m) new d(convertListener2, pVar));
        if (!TextUtils.isEmpty(aVar2.f64707f)) {
            File file = new File(aVar2.f64707f);
            if (file.exists()) {
                file.delete();
            }
            pVar.a((int) aVar2.n, (int) aVar2.o);
            if (aVar2.f64705d) {
                String str = GlobalContext.getContext().getExternalCacheDir() + "/watermark.png";
                if (bm.a(str)) {
                    com.ss.android.ugc.aweme.video.b.c(str);
                }
                new com.ss.android.ugc.aweme.shortvideo.q.b.b().a().a(str);
                if (aVar2.j < aVar2.k) {
                    f2 = 0.47f;
                } else {
                    f2 = 0.27f;
                }
                float f3 = (((((float) aVar2.j) * f2) * 52.0f) / 145.0f) / ((float) aVar2.k);
                pVar.D = str;
                pVar.E = (double) f2;
                pVar.F = (double) f3;
                pVar.G = (double) (1.0f - (f2 / 2.0f));
                pVar.H = (double) (1.0f - (f3 / 2.0f));
            }
            int i2 = aVar2.j;
            if (aVar2.j > aVar2.k) {
                i = 480;
            } else {
                i = 270;
            }
            int min = Math.min(i2, i);
            int i3 = (int) (((((float) min) * 1.0f) / ((float) aVar2.j)) * ((float) aVar2.k));
            VEVideoEncodeSettings a2 = new VEVideoEncodeSettings.a(2).a(VEVideoEncodeSettings.b.COMPILE_TYPE_HIGH_GIF).a(min, i3).a(8).b(f.b()).a();
            a2.setSpeed(2.5f);
            a aVar3 = new a(min, i3, aVar2.n, aVar2.o, 2.5f);
            convertListener2.onConfigured(aVar3);
            pVar.c(2);
            pVar.a(aVar2.f64707f, (String) null, a2);
        }
    }

    static final /* synthetic */ Object a(int i, @NonNull IVideo2GifService.ConvertListener convertListener, float f2, p pVar) throws Exception {
        if (i == 4103) {
            convertListener.onDone(true);
            pVar.k();
        } else if (i == 4105) {
            convertListener.onUpdateProgress((int) (f2 * 100.0f));
        }
        return null;
    }
}
