package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.ai;
import com.ss.android.ugc.aweme.tools.ao;
import com.ss.android.ugc.aweme.tools.az;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.m;
import java.lang.reflect.Type;
import java.util.Collections;

public final class ag implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65523a;

    /* renamed from: b  reason: collision with root package name */
    VideoRecordNewActivity f65524b;

    public ag(VideoRecordNewActivity videoRecordNewActivity) {
        this.f65524b = videoRecordNewActivity;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65523a, false, 73978, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65523a, false, 73978, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != m.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65525a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65525a, false, 73979, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65525a, false, 73979, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    ag.this.f65524b.e();
                    ai a2 = ai.a(Collections.emptyList(), 0);
                    ag.this.f65524b.z.a((Object) ag.this.f65524b, (bc) a2);
                    az azVar = new az(ag.this.f65524b.f4034c.V, false);
                    ao aoVar = new ao(3);
                    ag.this.f65524b.z.a((Object) ag.this.f65524b, (bc) azVar);
                    ag.this.f65524b.z.a((Object) ag.this.f65524b, (bc) aoVar);
                    a2.a();
                }
            };
        }
    }
}
