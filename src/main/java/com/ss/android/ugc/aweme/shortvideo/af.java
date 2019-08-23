package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.az;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.l;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;
import java.lang.reflect.Type;

public final class af implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65518a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f65519b;

    /* renamed from: c  reason: collision with root package name */
    public RecordToolbarViewModel f65520c;

    public af(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f65519b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65518a, false, 73974, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65518a, false, 73974, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != l.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65521a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65521a, false, 73975, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65521a, false, 73975, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    l lVar = (l) t;
                    if (af.this.f65520c == null) {
                        af.this.f65520c = (RecordToolbarViewModel) ViewModelProviders.of(af.this.f65519b.getActivity()).get(RecordToolbarViewModel.class);
                    }
                    if (lVar.f74775b == null) {
                        af.this.f65520c.n.setValue(null);
                    } else {
                        af.this.f65520c.o.setValue(lVar.f74775b);
                    }
                    fh fhVar = af.this.f65519b.r().f65401b;
                    if (!fhVar.U) {
                        af.this.f65519b.q().a((Object) this, (bc) new az(fhVar.V, false));
                        af.this.f65519b.k().a((Object) this, (bc) new az(fhVar.V, false));
                    }
                }
            };
        }
    }
}
