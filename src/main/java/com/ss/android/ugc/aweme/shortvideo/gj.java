package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.port.internal.m;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.tools.ac;
import com.ss.android.ugc.aweme.tools.ay;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.gamora.recorder.RecordTitleViewModel;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;
import java.lang.reflect.Type;
import java.util.Map;

public final class gj implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67933a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f67934b = a.L.c(e.a.LongVideoThreshold);

    /* renamed from: c  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f67935c;

    /* renamed from: d  reason: collision with root package name */
    public RecordToolbarViewModel f67936d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67933a, false, 74741, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67933a, false, 74741, new Class[0], Void.TYPE);
            return;
        }
        m mVar = (m) com.ss.android.ugc.aweme.common.g.a.a(com.ss.android.ugc.aweme.framework.e.a.a(), m.class);
        if (mVar != null && !mVar.b(false)) {
            mVar.c(true);
        }
    }

    public gj(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f67935c = shortVideoRecordingOperationPanelFragment;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67933a, false, 74740, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67933a, false, 74740, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if ((this.f67935c instanceof PlanC) && !z) {
            ((RecordTitleViewModel) com.ss.android.ugc.gamora.a.a.a(this.f67935c.getActivity()).get(RecordTitleViewModel.class)).f77610f.setValue(null);
        }
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67933a, false, 74739, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67933a, false, 74739, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != ay.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67937a;

                public final void a(Object obj, T t) {
                    String str;
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67937a, false, 74742, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67937a, false, 74742, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    ay ayVar = (ay) t;
                    if (gj.this.f67936d == null) {
                        gj.this.f67936d = (RecordToolbarViewModel) ViewModelProviders.of(gj.this.f67935c.getActivity()).get(RecordToolbarViewModel.class);
                    }
                    fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of(gj.this.f67935c.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
                    if (ayVar.f74638b) {
                        boolean a2 = fhVar.a();
                        long j = ea.f66827f;
                        if (a2) {
                            int b2 = a.i.b(fhVar.f67723f);
                            if (cz.a()) {
                                if (!ayVar.f74639c) {
                                    j = gj.f67934b;
                                }
                                j = Math.min(j, (long) b2);
                            } else {
                                if (ayVar.a()) {
                                    gj.this.f67935c.r().f65401b.V = !ayVar.f74639c;
                                    a.L.a(e.a.DurationMode, fhVar.V);
                                    gj.this.a();
                                }
                                gj.this.a(ayVar.f74641e);
                                return;
                            }
                        } else if (!ayVar.f74639c) {
                            j = gj.f67934b;
                        }
                        gj.this.f67936d.g.setValue(ayVar);
                        gj.this.f67935c.r().f65401b.V = !ayVar.f74639c;
                        gj.this.f67935c.r().f65401b.f67720c = j;
                        ac acVar = new ac(j);
                        gj.this.f67935c.q().a((Object) this, (bc) acVar);
                        gj.this.f67935c.k().a((Object) this, (bc) acVar);
                        a.L.a(e.a.DurationMode, fhVar.V);
                        gj.this.a();
                        if (a2) {
                            gj.this.a(ayVar.f74641e);
                        }
                        if (!ayVar.a()) {
                            d a3 = d.a();
                            if (ayVar.f74639c) {
                                str = "15s";
                            } else {
                                str = "60s";
                            }
                            r.a("video_duration_select", (Map) a3.a("to_status", str).a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("draft_id", fhVar.v).f34114b);
                        }
                    }
                }
            };
        }
    }
}
