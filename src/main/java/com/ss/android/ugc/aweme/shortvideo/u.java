package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.i;
import dmt.av.video.b.a;
import java.lang.reflect.Type;

public final class u implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70439a;

    /* renamed from: b  reason: collision with root package name */
    VideoRecordNewActivity f70440b;

    /* renamed from: c  reason: collision with root package name */
    a f70441c;

    public u(VideoRecordNewActivity videoRecordNewActivity, a aVar) {
        this.f70440b = videoRecordNewActivity;
        this.f70441c = aVar;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f70439a, false, 73939, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f70439a, false, 73939, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != i.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70442a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f70442a, false, 73940, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f70442a, false, 73940, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    u.this.f70440b.t.g(false);
                    u.this.f70441c.c().a("");
                    u.this.f70441c.c().a("", 0, 0);
                    u.this.f70441c.c().a(false);
                    StickerModule stickerModule = u.this.f70440b.k;
                    if (PatchProxy.isSupport(new Object[0], stickerModule, StickerModule.f3976a, false, 78734, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], stickerModule, StickerModule.f3976a, false, 78734, new Class[0], Void.TYPE);
                    } else {
                        stickerModule.f3979d.e((String) null);
                    }
                    u.this.f70440b.o.f66616c = 0;
                    u.this.f70440b.o.f66617d = 0;
                    u.this.f70440b.o.f66615b = null;
                    u.this.f70440b.m();
                }
            };
        }
    }
}
