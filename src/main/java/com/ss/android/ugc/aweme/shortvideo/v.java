package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.az;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.i;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;
import java.lang.reflect.Type;

public final class v implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71221a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f71222b;

    /* renamed from: c  reason: collision with root package name */
    public RecordToolbarViewModel f71223c;

    public v(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f71222b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f71221a, false, 73941, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f71221a, false, 73941, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != i.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71224a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f71224a, false, 73942, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f71224a, false, 73942, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    if (v.this.f71223c == null) {
                        v.this.f71223c = (RecordToolbarViewModel) ViewModelProviders.of(v.this.f71222b.getActivity()).get(RecordToolbarViewModel.class);
                    }
                    v.this.f71223c.n.setValue(null);
                    fh fhVar = v.this.f71222b.r().f65401b;
                    if (!fhVar.U) {
                        v.this.f71222b.q().a((Object) this, (bc) new az(fhVar.V, false));
                        v.this.f71222b.k().a((Object) this, (bc) new az(fhVar.V, false));
                    }
                }
            };
        }
    }
}
