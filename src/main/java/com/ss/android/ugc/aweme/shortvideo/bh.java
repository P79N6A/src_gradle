package com.ss.android.ugc.aweme.shortvideo;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.tools.aj;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import java.lang.reflect.Type;

public final class bh implements com.ss.android.ugc.aweme.tools.bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65794a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f65795b;

    /* renamed from: c  reason: collision with root package name */
    public a f65796c;

    public interface a {
        boolean a();
    }

    public bh(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f65795b = shortVideoRecordingOperationPanelFragment;
    }

    public bh(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, a aVar) {
        this(shortVideoRecordingOperationPanelFragment);
        this.f65796c = aVar;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65794a, false, 74090, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65794a, false, 74090, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != aj.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65797a;

                /* renamed from: b  reason: collision with root package name */
                Handler f65798b = new Handler(Looper.getMainLooper());

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65797a, false, 74091, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65797a, false, 74091, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    AnonymousClass1 r0 = new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f65800a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f65800a, false, 74092, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f65800a, false, 74092, new Class[0], Void.TYPE);
                            } else if (bh.this.f65795b.getView() != null) {
                                if (bh.this.f65796c == null || bh.this.f65796c.a()) {
                                    ((RecordLayout) bh.this.f65795b.getView().findViewById(C0906R.id.ca_)).setEnabled(true);
                                }
                            }
                        }
                    };
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        r0.run();
                    } else {
                        this.f65798b.post(r0);
                    }
                }
            };
        }
    }
}
