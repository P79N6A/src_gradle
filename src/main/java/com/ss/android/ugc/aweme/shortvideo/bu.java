package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.gesture.a;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.x;
import java.lang.reflect.Type;

public final class bu implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65835a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f65836b;

    public bu(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f65836b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65835a, false, 74126, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65835a, false, 74126, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != x.class) {
            return null;
        } else {
            return new bg<T>() {
                public final void a(Object obj, T t) {
                    x xVar = (x) t;
                    if (xVar.f74952e == 1) {
                        bu.this.f65836b.P.f67907d = xVar.f74949b;
                    } else if (xVar.f74952e == 2) {
                        bu.this.f65836b.P.f67908e = xVar.f74950c;
                    } else {
                        if (xVar.f74952e == 3) {
                            bu.this.f65836b.P.f67905b = (a) xVar.f74951d;
                        }
                    }
                }
            };
        }
    }
}
