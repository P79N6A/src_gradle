package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.an;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import java.lang.reflect.Type;

public final class ev implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67617a;

    /* renamed from: b  reason: collision with root package name */
    VideoRecordNewActivity f67618b;

    public ev(VideoRecordNewActivity videoRecordNewActivity) {
        this.f67618b = videoRecordNewActivity;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67617a, false, 74512, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67617a, false, 74512, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != an.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67619a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67619a, false, 74513, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67619a, false, 74513, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    ev.this.f67618b.f4035d = (double) ((an) t).f74626b.value();
                    ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) ev.this.f67618b).get(ShortVideoContextViewModel.class);
                    double d2 = ev.this.f67618b.f4035d;
                    if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, shortVideoContextViewModel, ShortVideoContextViewModel.f65400a, false, 74612, new Class[]{Double.TYPE}, Void.TYPE)) {
                        ShortVideoContextViewModel shortVideoContextViewModel2 = shortVideoContextViewModel;
                        PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, shortVideoContextViewModel2, ShortVideoContextViewModel.f65400a, false, 74612, new Class[]{Double.TYPE}, Void.TYPE);
                        return;
                    }
                    shortVideoContextViewModel.a("record_speed", Double.valueOf(d2));
                }
            };
        }
    }
}
