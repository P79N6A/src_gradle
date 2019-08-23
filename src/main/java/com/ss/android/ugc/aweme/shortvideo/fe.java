package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.l.b;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.ap;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.u;
import java.lang.reflect.Type;

public final class fe implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67672a;

    /* renamed from: b  reason: collision with root package name */
    public VideoRecordNewActivity f67673b;

    public fe(VideoRecordNewActivity videoRecordNewActivity) {
        this.f67673b = videoRecordNewActivity;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67672a, false, 74560, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67672a, false, 74560, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != ap.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67674a;

                public final void a(Object obj, T t) {
                    int i = 2;
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67674a, false, 74561, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67674a, false, 74561, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    boolean z = ((ap) t).f74628a;
                    b bVar = fe.this.f67673b.m.p;
                    VideoRecordNewActivity videoRecordNewActivity = fe.this.f67673b;
                    if (PatchProxy.isSupport(new Object[]{videoRecordNewActivity, Byte.valueOf(z ? (byte) 1 : 0)}, bVar, b.f68283a, false, 78507, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
                        b bVar2 = bVar;
                        PatchProxy.accessDispatch(new Object[]{videoRecordNewActivity, Byte.valueOf(z)}, bVar2, b.f68283a, false, 78507, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
                    } else {
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, bVar, b.f68283a, false, 78508, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            b bVar3 = bVar;
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, bVar3, b.f68283a, false, 78508, new Class[]{Boolean.TYPE}, Void.TYPE);
                        } else {
                            b.f68285d = z;
                            e eVar = a.L;
                            e.a aVar = e.a.CurrentShakeFreeMode;
                            if (z) {
                                i = 1;
                            }
                            eVar.a(aVar, i);
                        }
                        bVar.a((Context) videoRecordNewActivity, z);
                    }
                    fe.this.f67673b.z.a((Object) fe.this.f67673b, (bc) new u(0));
                    fe.this.f67673b.A.a((Object) fe.this.f67673b, (bc) new u(0));
                }
            };
        }
    }
}
