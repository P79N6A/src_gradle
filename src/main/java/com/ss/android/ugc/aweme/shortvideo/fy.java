package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.e.j;
import com.ss.android.ugc.aweme.shortvideo.j.c;
import com.ss.android.ugc.aweme.shortvideo.j.e;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.f;
import com.ss.android.ugc.aweme.tools.at;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.p;
import dmt.av.video.b.a;
import java.lang.reflect.Type;
import java.util.List;

public final class fy implements c, bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67823a;

    /* renamed from: b  reason: collision with root package name */
    VideoRecordNewActivity f67824b;

    /* renamed from: c  reason: collision with root package name */
    a f67825c;

    /* renamed from: d  reason: collision with root package name */
    long f67826d;

    public fy(VideoRecordNewActivity videoRecordNewActivity, a aVar) {
        this.f67824b = videoRecordNewActivity;
        this.f67825c = aVar;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67823a, false, 74712, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67823a, false, 74712, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != at.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67827a;

                public final void a(Object obj, T t) {
                    List<f> list;
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67827a, false, 74714, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67827a, false, 74714, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    fy.this.f67826d = System.currentTimeMillis();
                    fh fhVar = fy.this.f67824b.f4034c;
                    e.c a2 = fy.this.f67824b.u.g().a(fhVar.l.c().getPath()).b(fhVar.l.d().getPath()).a(fy.this.f67825c.b());
                    VideoRecordNewActivity videoRecordNewActivity = fy.this.f67824b;
                    String path = fhVar.l.c().getPath();
                    Integer valueOf = Integer.valueOf((int) fhVar.n);
                    Integer valueOf2 = Integer.valueOf(fhVar.j);
                    Integer valueOf3 = Integer.valueOf(fhVar.k);
                    if (fhVar.b()) {
                        list = fhVar.F;
                    } else {
                        list = null;
                    }
                    a2.c(j.a(true, false, (Context) videoRecordNewActivity, path, valueOf, valueOf2, valueOf3, list)).a((c) fy.this);
                }
            };
        }
    }

    public final void a(String str, String str2, int i) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i)}, this, f67823a, false, 74713, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, Integer.valueOf(i)}, this, f67823a, false, 74713, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        bd bdVar = this.f67824b.z;
        VideoRecordNewActivity videoRecordNewActivity = this.f67824b;
        p pVar = new p(this.f67826d, str, str2, i);
        bdVar.a((Object) videoRecordNewActivity, (bc) pVar);
    }
}
