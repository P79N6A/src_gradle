package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.l;
import dmt.av.video.b.a;
import java.io.File;
import java.lang.reflect.Type;

public final class ae implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65513a;

    /* renamed from: b  reason: collision with root package name */
    VideoRecordNewActivity f65514b;

    /* renamed from: c  reason: collision with root package name */
    a f65515c;

    public ae(VideoRecordNewActivity videoRecordNewActivity, a aVar) {
        this.f65514b = videoRecordNewActivity;
        this.f65515c = aVar;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65513a, false, 73972, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65513a, false, 73972, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != l.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65516a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65516a, false, 73973, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65516a, false, 73973, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    l lVar = (l) t;
                    e eVar = lVar.f74775b;
                    String str = lVar.f74776c;
                    boolean a2 = ae.this.f65514b.f4034c.a();
                    ae.this.f65514b.t.g(true);
                    ae.this.f65514b.f4034c.l.a(new File(str));
                    ae.this.f65514b.f4034c.f67723f = str;
                    ae.this.f65515c.c().a(str);
                    ae.this.f65515c.c().a(str, 0, 0);
                    ae.this.f65515c.c().a(true);
                    ae.this.f65514b.k.f(true);
                    if (!a2) {
                        ae.this.f65515c.b().b((Context) ae.this.f65514b, 5, ae.this.f65514b.j.a());
                    }
                    int i = eVar.duration;
                    if (i > 0) {
                        ae.this.f65514b.o.f66616c = i;
                        ae.this.f65514b.f4034c.h = i;
                    }
                    UrlModel urlModel = eVar.audioTrack;
                    if (urlModel != null) {
                        ae.this.f65514b.f4034c.f67722e = urlModel;
                    }
                    ae.this.f65514b.o.f66617d = 0;
                    ae.this.f65514b.o.f66615b = str;
                    ae.this.f65514b.m();
                }
            };
        }
    }
}
