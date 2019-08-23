package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.filter.e;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.t;
import java.lang.reflect.Type;

public final class bn implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65813a;

    /* renamed from: b  reason: collision with root package name */
    public ShortVideoRecordingOperationPanelFragment f65814b;

    public bn(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f65814b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65813a, false, 74116, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65813a, false, 74116, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != t.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65815a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65815a, false, 74117, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65815a, false, 74117, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    t tVar = (t) t;
                    VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) bn.this.f65814b.getActivity();
                    if (tVar.f74938d == 2) {
                        ((e) videoRecordNewActivity.l.c()).a(tVar.f74937c);
                        return;
                    }
                    if (tVar.f74938d == 1) {
                        ((e) videoRecordNewActivity.l.c()).a(tVar.f74936b, tVar.f74937c);
                    }
                }
            };
        }
    }
}
