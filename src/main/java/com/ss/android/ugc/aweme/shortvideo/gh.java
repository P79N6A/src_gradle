package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ui.a.a;
import com.ss.android.ugc.aweme.shortvideo.ui.a.c;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.tools.ax;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import java.lang.reflect.Type;

public final class gh implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67925a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f67926b;

    /* renamed from: c  reason: collision with root package name */
    c f67927c;

    /* renamed from: d  reason: collision with root package name */
    a f67928d;

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67925a, false, 74734, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67925a, false, 74734, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != ax.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67929a;

                /* renamed from: b  reason: collision with root package name */
                RecordLayout f67930b;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67929a, false, 74735, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67929a, false, 74735, new Class[]{Object.class, bc.class}, Void.TYPE);
                    } else if (gh.this.f67926b.getView() != null) {
                        if (this.f67930b == null) {
                            this.f67930b = (RecordLayout) gh.this.f67926b.getView().findViewById(C0906R.id.ca_);
                        }
                        this.f67930b.b();
                        this.f67930b.setVisibility(0);
                        if (gh.this.f67926b.r().f65401b.n > 0) {
                            gh.this.f67927c.e(0);
                            gh.this.f67927c.f(0);
                            gh.this.f67927c.d(8);
                        } else {
                            gh.this.f67927c.c(0);
                        }
                        gh.this.f67926b.d(true);
                    }
                }
            };
        }
    }

    public gh(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, c cVar, a aVar) {
        this.f67926b = shortVideoRecordingOperationPanelFragment;
        this.f67927c = cVar;
        this.f67928d = aVar;
    }
}
