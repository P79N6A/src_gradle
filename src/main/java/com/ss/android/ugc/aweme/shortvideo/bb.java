package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.ai;
import com.ss.android.ugc.aweme.tools.aj;
import com.ss.android.ugc.aweme.tools.ao;
import com.ss.android.ugc.aweme.tools.az;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.r;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;
import dmt.av.video.b.a;
import java.lang.reflect.Type;

public final class bb implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65777a;

    /* renamed from: b  reason: collision with root package name */
    public VideoRecordNewActivity f65778b;

    /* renamed from: c  reason: collision with root package name */
    public a f65779c;

    public bb(VideoRecordNewActivity videoRecordNewActivity, a aVar) {
        this.f65778b = videoRecordNewActivity;
        this.f65779c = aVar;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65777a, false, 74070, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65777a, false, 74070, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != r.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65780a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65780a, false, 74071, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65780a, false, 74071, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) bb.this.f65778b).get(ShortVideoContextViewModel.class)).f65401b;
                    ft ftVar = fhVar.m;
                    if (!ftVar.isEmpty()) {
                        ftVar.removeLast();
                        bb.this.f65778b.f4034c.n = (long) TimeSpeedModelExtension.calculateRealTime(fhVar.m);
                        bb.this.f65778b.N = false;
                        bb.this.f65779c.b().d();
                        bb.this.f65778b.K.c();
                        ai a2 = ai.a(fhVar.m, bb.this.f65778b.f4034c.n);
                        bb.this.f65778b.z.a((Object) bb.this.f65778b, (bc) a2);
                        bb.this.f65778b.z.a((Object) bb.this.f65778b, (bc) new aj());
                        bb.this.f65778b.z.a((Object) bb.this.f65778b, (bc) new ao(4));
                        a2.a();
                        fhVar.O.removeLastArray();
                        fhVar.P.removeLastArray();
                        fhVar.Q.removeLast();
                        fhVar.R.removeLast();
                        fhVar.T.removeLast();
                        fhVar.S.removeLast();
                        if (fhVar.E != null) {
                            fhVar.E.removeReactionWindowInfo();
                        }
                        if (PatchProxy.isSupport(new Object[0], fhVar, fh.f67718a, false, 74579, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], fhVar, fh.f67718a, false, 74579, new Class[0], Void.TYPE);
                        } else if (fhVar.F.size() > 0) {
                            fhVar.F.remove(fhVar.F.size() - 1);
                        }
                    }
                    if (!ftVar.isEmpty() || !fhVar.c()) {
                        if (ftVar.isEmpty() && !fhVar.b() && !fhVar.c()) {
                            ((RecordToolbarViewModel) ViewModelProviders.of((FragmentActivity) bb.this.f65778b).get(RecordToolbarViewModel.class)).k.setValue(Boolean.TRUE);
                            bb.this.f65778b.z.a((Object) bb.this.f65778b, (bc) new az(fhVar.V, false));
                        }
                        return;
                    }
                    bb.this.f65778b.z.a((Object) bb.this.f65778b, (bc) new ao(3));
                    bb.this.f65778b.z.a((Object) bb.this.f65778b, (bc) new az(fhVar.V, false));
                }
            };
        }
    }
}
