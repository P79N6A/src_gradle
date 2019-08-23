package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.s;
import java.lang.reflect.Type;

public final class be implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65788a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f65789b;

    public be(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f65789b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65788a, false, 74087, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65788a, false, 74087, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != s.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65790a;

                /* renamed from: b  reason: collision with root package name */
                RecordLayout f65791b;

                public final void a(Object obj, T t) {
                    int i = 1;
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65790a, false, 74088, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65790a, false, 74088, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    if (this.f65791b == null) {
                        this.f65791b = (RecordLayout) be.this.f65789b.getView().findViewById(C0906R.id.ca_);
                    }
                    this.f65791b.b();
                    switch (((ShortVideoContextViewModel) ViewModelProviders.of(be.this.f65789b.getActivity()).get(ShortVideoContextViewModel.class)).f65401b.N) {
                        case 0:
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    this.f65791b.a(i, false);
                }
            };
        }
    }
}
