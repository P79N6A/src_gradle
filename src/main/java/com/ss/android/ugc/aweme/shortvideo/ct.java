package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.ac;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.gamora.a.a;
import com.ss.android.ugc.gamora.recorder.RecordTitleViewModel;
import java.lang.reflect.Type;

public final class ct implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66133a;

    /* renamed from: b  reason: collision with root package name */
    public final ShortVideoRecordingOperationPanelFragment f66134b;

    public ct(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f66134b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f66133a, false, 74230, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f66133a, false, 74230, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != ac.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f66135a;

                /* renamed from: b  reason: collision with root package name */
                RecordTitleViewModel f66136b;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f66135a, false, 74231, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f66135a, false, 74231, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    if (this.f66136b == null) {
                        this.f66136b = (RecordTitleViewModel) a.a(ct.this.f66134b.getActivity()).get(RecordTitleViewModel.class);
                    }
                    this.f66136b.c(new RecordTitleViewModel.g(((ac) t).f74600b));
                }
            };
        }
    }
}
