package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.d;
import java.lang.reflect.Type;

public final class m implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68361a;

    /* renamed from: b  reason: collision with root package name */
    VideoRecordNewActivity f68362b;

    public m(VideoRecordNewActivity videoRecordNewActivity) {
        this.f68362b = videoRecordNewActivity;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f68361a, false, 73910, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f68361a, false, 73910, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != d.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68363a;

                public final void a(Object obj, T t) {
                    int i;
                    int i2 = 2;
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f68363a, false, 73911, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f68363a, false, 73911, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    d dVar = (d) t;
                    VideoRecordNewActivity videoRecordNewActivity = m.this.f68362b;
                    if (dVar.f74666b) {
                        i = C0906R.string.lo;
                    } else {
                        i = C0906R.string.lk;
                    }
                    a.c((Context) videoRecordNewActivity, i).a();
                    if (dVar.f74666b) {
                        m.this.f68362b.b(true);
                    } else {
                        m.this.f68362b.b(false);
                    }
                    e eVar = com.ss.android.ugc.aweme.port.in.a.L;
                    e.a aVar = e.a.BeautificationMode;
                    if (dVar.f74666b) {
                        i2 = 1;
                    }
                    eVar.a(aVar, i2);
                }
            };
        }
    }
}
