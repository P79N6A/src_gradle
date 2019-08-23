package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.a.c;
import com.ss.android.ugc.aweme.tools.au;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import java.lang.reflect.Type;

public final class ge implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67893a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f67894b;

    /* renamed from: c  reason: collision with root package name */
    c f67895c;

    public ge(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, c cVar) {
        this.f67894b = shortVideoRecordingOperationPanelFragment;
        this.f67895c = cVar;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67893a, false, 74724, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67893a, false, 74724, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != au.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67896a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67896a, false, 74725, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67896a, false, 74725, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    ge.this.f67894b.d(false);
                    if (ge.this.f67895c instanceof PlanC) {
                        ge.this.f67895c.f(8);
                    }
                }
            };
        }
    }
}
