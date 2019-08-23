package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.filter.e;
import com.ss.android.ugc.aweme.shortvideo.m.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.ai;
import com.ss.android.ugc.aweme.tools.ax;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.r;
import com.ss.android.ugc.aweme.util.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dmt.av.video.b.a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class gg implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67920a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoRecordNewActivity f67921b;

    /* renamed from: c  reason: collision with root package name */
    public final a f67922c;

    public final Effect a() {
        if (PatchProxy.isSupport(new Object[0], this, f67920a, false, 74731, new Class[0], Effect.class)) {
            return (Effect) PatchProxy.accessDispatch(new Object[0], this, f67920a, false, 74731, new Class[0], Effect.class);
        } else if (this.f67921b != null) {
            return (Effect) ((CurUseStickerViewModel) ViewModelProviders.of((FragmentActivity) this.f67921b).get(CurUseStickerViewModel.class)).f70249b.getValue();
        } else {
            return null;
        }
    }

    public gg(VideoRecordNewActivity videoRecordNewActivity, a aVar) {
        this.f67921b = videoRecordNewActivity;
        this.f67922c = aVar;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67920a, false, 74732, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67920a, false, 74732, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != ax.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67923a;

                public final void a(Object obj, T t) {
                    List<String> list;
                    List<String> list2;
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67923a, false, 74733, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67923a, false, 74733, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) gg.this.f67921b).get(ShortVideoContextViewModel.class);
                    if (!shortVideoContextViewModel.f()) {
                        fh fhVar = shortVideoContextViewModel.f65401b;
                        if (fhVar.c() && gg.this.f67921b.q != null) {
                            gg.this.f67921b.q.e();
                        }
                        c.a("set hasStopped to true");
                        shortVideoContextViewModel.d(true);
                        gg.this.f67921b.K.a(false);
                        gg.this.f67922c.b().c();
                        c.a("stopRecord() called");
                        shortVideoContextViewModel.a(0);
                        long b2 = gg.this.f67922c.b().b() / 1000;
                        if (b2 >= 0) {
                            long j = fhVar.n;
                            ft ftVar = fhVar.m;
                            if (ae.d(gg.this.a())) {
                                list = gg.this.f67921b.am;
                            } else {
                                list = null;
                            }
                            if (ae.e(gg.this.a())) {
                                list2 = gg.this.f67921b.am;
                            } else {
                                list2 = null;
                            }
                            fhVar.n = j + ftVar.end(b2, null, list, list2);
                        }
                        h e2 = ((e) gg.this.f67921b.l.c()).e();
                        if (e2.f47600d != null) {
                            fhVar.O.addIndex();
                        }
                        if (String.valueOf(e2.f47598b) != null) {
                            fhVar.P.addIndex();
                        }
                        if (((ax) t).f74636a == 1) {
                            gg.this.f67921b.A.a((Object) gg.this.f67921b, (bc) new r());
                            f.f63288b = fhVar.m.isEmpty();
                            fhVar.o = f.a() ? 1 : 0;
                        } else {
                            if (b2 <= 10 && b2 >= 0) {
                                gg.this.f67921b.A.a((Object) gg.this.f67921b, (bc) new r());
                            }
                            ai a2 = ai.a(fhVar.m, fhVar.n);
                            gg.this.f67921b.z.a((Object) gg.this.f67921b, (bc) a2);
                            a2.a();
                            if (!com.ss.android.g.a.b()) {
                                fhVar.Q.add(Integer.toString(((e) gg.this.f67921b.l.c()).k()));
                                fhVar.T.add(Integer.toString(((e) gg.this.f67921b.l.c()).d()));
                                fhVar.S.add(Integer.toString(((e) gg.this.f67921b.l.c()).j()));
                                fhVar.R.add(Integer.toString(((e) gg.this.f67921b.l.c()).i()));
                            } else {
                                fhVar.Q.add(Integer.toString((int) (f.a(((e) gg.this.f67921b.l.c()).k()) * 100.0f)));
                                int b3 = (int) (f.b(((e) gg.this.f67921b.l.c()).i()) * 100.0f);
                                fhVar.R.add(Integer.toString(b3));
                                fhVar.S.add(Integer.toString(b3));
                                fhVar.T.add(Integer.toString(((e) gg.this.f67921b.l.c()).d()));
                            }
                            com.ss.android.ugc.aweme.shortvideo.d.a.a(fhVar.f67720c);
                            com.ss.android.ugc.aweme.shortvideo.d.a.b(fhVar.z, fhVar.A);
                            com.ss.android.ugc.aweme.shortvideo.d.a.a(fhVar.E);
                            com.ss.android.ugc.aweme.shortvideo.d.a.b(fhVar.p ? 1 : 0);
                            com.ss.android.ugc.aweme.shortvideo.d.a.a(fhVar.o);
                            com.ss.android.ugc.aweme.shortvideo.d.a.a(fhVar.f67723f, ej.a().b(), fhVar.g);
                            com.ss.android.ugc.aweme.shortvideo.d.a.a((ArrayList<TimeSpeedModelExtension>) fhVar.m);
                            com.ss.android.ugc.aweme.shortvideo.d.a.a(gg.this.f67921b.K.e());
                            com.ss.android.ugc.aweme.shortvideo.d.a.a(fhVar.O.toString(), fhVar.P.toString());
                        }
                        if (com.ss.android.ugc.aweme.shortvideo.m.a.a(gg.this.f67921b.m.o)) {
                            b bVar = new b(gg.this.f67921b);
                            if (PatchProxy.isSupport(new Object[]{null}, bVar, b.f68366a, false, 78517, new Class[]{b.a.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{null}, bVar, b.f68366a, false, 78517, new Class[]{b.a.class}, Void.TYPE);
                                return;
                            }
                            bVar.a(C0906R.raw.shutter_sound_stop, bVar.f68368c.getStreamMaxVolume(3), bVar.f68368c.getStreamVolume(3), null);
                        }
                    }
                }
            };
        }
    }
}
