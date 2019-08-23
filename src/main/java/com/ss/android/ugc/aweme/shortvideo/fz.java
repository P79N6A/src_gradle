package com.ss.android.ugc.aweme.shortvideo;

import android.animation.ValueAnimator;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.record.a.b;
import com.ss.android.ugc.aweme.shortvideo.record.a.f;
import com.ss.android.ugc.aweme.shortvideo.record.o;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.au;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.y;
import dmt.av.video.b.a;
import java.lang.reflect.Type;

public final class fz implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67829a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoRecordNewActivity f67830b;

    /* renamed from: c  reason: collision with root package name */
    public final a f67831c;

    public fz(VideoRecordNewActivity videoRecordNewActivity, a aVar) {
        this.f67830b = videoRecordNewActivity;
        this.f67831c = aVar;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67829a, false, 74715, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67829a, false, 74715, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != au.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67832a;

                public final void a(Object obj, T t) {
                    boolean z = false;
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67832a, false, 74716, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67832a, false, 74716, new Class[]{Object.class, bc.class}, Void.TYPE);
                    } else if (fz.this.f67830b.f4034c.n >= fz.this.f67830b.f4034c.f67720c) {
                        fz.this.f67830b.z.a((Object) fz.this.f67830b, (bc) new y("record_full"));
                    } else if (!fz.this.f67831c.b().a()) {
                        fz.this.f67830b.K.a(ga.f67847b);
                        fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) fz.this.f67830b).get(ShortVideoContextViewModel.class)).f65401b;
                        if (fhVar.c() && fz.this.f67830b.q != null) {
                            b bVar = fz.this.f67830b.q;
                            if (PatchProxy.isSupport(new Object[0], bVar, b.f69060a, false, 78415, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], bVar, b.f69060a, false, 78415, new Class[0], Void.TYPE);
                            } else {
                                if (PatchProxy.isSupport(new Object[0], bVar, b.f69060a, false, 78418, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], bVar, b.f69060a, false, 78418, new Class[0], Void.TYPE);
                                } else {
                                    if (bVar.s != null) {
                                        bVar.s.cancel();
                                    }
                                    bVar.s = ValueAnimator.ofFloat(new float[]{0.66f, 1.0f}).setDuration(150);
                                    bVar.s.addUpdateListener(f.f69079b);
                                    bVar.s.start();
                                }
                            }
                        }
                        au auVar = (au) t;
                        fz.this.f67831c.c().a(fhVar.e(), (long) fz.this.f67830b.o.f66617d, fhVar.n);
                        fz.this.f67831c.b().a(com.ss.android.ugc.aweme.property.f.g());
                        dmt.av.video.b.y b2 = fz.this.f67831c.b();
                        if (fhVar.o == 1) {
                            z = true;
                        }
                        o.a(b2, z, auVar.f74633b, new gb(this, fhVar, auVar));
                    }
                }
            };
        }
    }
}
