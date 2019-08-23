package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.ba;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import java.lang.reflect.Type;

public final class gm implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67944a;

    /* renamed from: b  reason: collision with root package name */
    VideoRecordNewActivity f67945b;

    /* renamed from: c  reason: collision with root package name */
    private String f67946c = "WideCamera";

    public gm(VideoRecordNewActivity videoRecordNewActivity) {
        this.f67945b = videoRecordNewActivity;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67944a, false, 74745, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67944a, false, 74745, new Class[]{bd.class, Type.class}, bg.class);
        } else if (ba.class != type2) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67947a;

                public final void a(Object obj, T t) {
                    T t2 = t;
                    if (PatchProxy.isSupport(new Object[]{obj, t2}, this, f67947a, false, 74746, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t2}, this, f67947a, false, 74746, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    gm.this.f67945b.z.a((Object) gm.this.f67945b, (bc) t2);
                    ba baVar = (ba) t2;
                    gm.this.f67945b.m.c(0);
                    CameraModule cameraModule = gm.this.f67945b.m;
                    if (PatchProxy.isSupport(new Object[0], cameraModule, CameraModule.f3959a, false, 78348, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], cameraModule, CameraModule.f3959a, false, 78348, new Class[0], Void.TYPE);
                    } else {
                        cameraModule.o.f69149b.a((Context) cameraModule.g, (c) null);
                        cameraModule.f3962d = cameraModule.o.f69149b.a(cameraModule.f3961c, cameraModule.h.f());
                        cameraModule.f3963e = cameraModule.o.f69149b.b(0.0f, cameraModule.h.f());
                    }
                    if (gm.this.f67945b.m.o.f69149b.f69128b && baVar.f74650b) {
                        a.b((Context) gm.this.f67945b, (int) C0906R.string.a5q, 1).a();
                    }
                }
            };
        }
    }
}
