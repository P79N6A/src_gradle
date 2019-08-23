package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.v;
import java.lang.reflect.Type;

public final class bt implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65831a;

    /* renamed from: b  reason: collision with root package name */
    VideoRecordNewActivity f65832b;

    public bt(VideoRecordNewActivity videoRecordNewActivity) {
        this.f65832b = videoRecordNewActivity;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65831a, false, 74124, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65831a, false, 74124, new Class[]{bd.class, Type.class}, bg.class);
        } else if (v.class != type2) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65833a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65833a, false, 74125, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65833a, false, 74125, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    bt.this.f65832b.m.i();
                    bt.this.f65832b.z.a((Object) bt.this.f65832b, (bc) t);
                }
            };
        }
    }
}
