package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.w;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.filter.e;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.a.b;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.shortvideo.util.z;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.ag;
import com.ss.android.ugc.aweme.tools.as;
import com.ss.android.ugc.aweme.tools.ax;
import com.ss.android.ugc.aweme.tools.ay;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.f;
import com.ss.android.ugc.aweme.tools.g;
import com.ss.android.ugc.aweme.tools.u;
import com.ss.android.ugc.gamora.a.a;
import com.ss.android.ugc.gamora.recorder.RecordTitleViewModel;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;
import com.ss.android.ugc.gamora.recorder.RecordViewModel;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ed implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66838a;

    /* renamed from: b  reason: collision with root package name */
    public final ShortVideoRecordingOperationPanelFragment f66839b;

    /* renamed from: c  reason: collision with root package name */
    public final VideoRecordNewActivity f66840c;

    /* renamed from: d  reason: collision with root package name */
    b f66841d;

    /* renamed from: e  reason: collision with root package name */
    public RecordToolbarViewModel f66842e;

    /* renamed from: f  reason: collision with root package name */
    w.a f66843f = new w.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66844a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f66844a, false, 74393, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66844a, false, 74393, new Class[0], Void.TYPE);
                return;
            }
            if (!(ed.this.f66840c == null || ed.this.f66840c.t == null)) {
                ed.this.f66840c.t.n();
            }
        }
    };

    public final boolean a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66838a, false, 74390, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return this.f66840c.m.o.f69149b.b(z);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66838a, false, 74390, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public ed(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, b bVar) {
        this.f66839b = shortVideoRecordingOperationPanelFragment;
        this.f66840c = (VideoRecordNewActivity) shortVideoRecordingOperationPanelFragment.getActivity();
        this.f66841d = bVar;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f66838a, false, 74387, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f66838a, false, 74387, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != g.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f66846a;

                /* renamed from: b  reason: collision with root package name */
                RecyclerView f66847b;

                public final void a(Object obj, T t) {
                    int i;
                    int i2;
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f66846a, false, 74394, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f66846a, false, 74394, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) ViewModelProviders.of(ed.this.f66839b.getActivity()).get(ShortVideoContextViewModel.class);
                    fh fhVar = shortVideoContextViewModel.f65401b;
                    if (this.f66847b == null) {
                        this.f66847b = (RecyclerView) ed.this.f66839b.getView().findViewById(C0906R.id.cca);
                    }
                    RecordLayout recordLayout = (RecordLayout) ed.this.f66839b.getView().findViewById(C0906R.id.ca_);
                    RecordTitleViewModel recordTitleViewModel = (RecordTitleViewModel) a.a(ed.this.f66839b.getActivity()).get(RecordTitleViewModel.class);
                    boolean d2 = ed.this.f66840c.m.d();
                    g gVar = (g) t;
                    if (ed.this.f66842e == null) {
                        ed.this.f66842e = (RecordToolbarViewModel) ViewModelProviders.of(ed.this.f66839b.getActivity()).get(RecordToolbarViewModel.class);
                    }
                    if (ed.this.f66840c.getResources().getString(C0906R.string.bx5).equals(gVar.f74762c)) {
                        ed.this.f66839b.X = true;
                    } else {
                        ed.this.f66839b.X = false;
                    }
                    ed edVar = ed.this;
                    int i3 = gVar.f74763d;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, edVar, ed.f66838a, false, 74392, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        Object[] objArr = {Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect = ed.f66838a;
                        Class[] clsArr = {Integer.TYPE};
                        Class cls = Void.TYPE;
                        i = C0906R.string.bx3;
                        PatchProxy.accessDispatch(objArr, edVar, changeQuickRedirect, false, 74392, clsArr, cls);
                    } else {
                        i = C0906R.string.bx3;
                        if (TextUtils.equals(edVar.f66841d.j(i3), edVar.f66840c.getString(C0906R.string.bx3))) {
                            com.ss.android.ugc.aweme.port.in.a.u.b(edVar.f66843f);
                            ((RecordViewModel) ViewModelProviders.of(edVar.f66839b.getActivity()).get(RecordViewModel.class)).f77634d.setValue(Boolean.FALSE);
                            if (!com.ss.android.g.a.b()) {
                                if (!(edVar.f66840c.p == null || edVar.f66840c.p == FaceStickerBean.NONE)) {
                                    edVar.f66840c.k.a(edVar.f66840c.p);
                                }
                                ((e) edVar.f66840c.l.c()).b(edVar.f66840c.f4034c.p, true);
                                ((e) edVar.f66840c.l.c()).c(edVar.f66840c.f4034c.p, true);
                            }
                        }
                    }
                    recordLayout.setVisibility(0);
                    if (ed.this.f66840c.getString(C0906R.string.bx1).equals(gVar.f74761b)) {
                        ed.this.f66839b.q().a((Object) this, (bc) new ag(0));
                        recordLayout.x = false;
                    }
                    if (TextUtils.equals((CharSequence) gVar.f74762c, ed.this.f66840c.getResources().getString(C0906R.string.bx9))) {
                        a(8);
                        ed edVar2 = ed.this;
                        if (PatchProxy.isSupport(new Object[0], edVar2, ed.f66838a, false, 74388, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], edVar2, ed.f66838a, false, 74388, new Class[0], Void.TYPE);
                        } else {
                            RecordLayout recordLayout2 = (RecordLayout) edVar2.f66839b.getView().findViewById(C0906R.id.ca_);
                            ShortVideoContextViewModel shortVideoContextViewModel2 = (ShortVideoContextViewModel) ViewModelProviders.of(edVar2.f66839b.getActivity()).get(ShortVideoContextViewModel.class);
                            if (shortVideoContextViewModel2.f65401b.m.isEmpty()) {
                                shortVideoContextViewModel2.b(0);
                                shortVideoContextViewModel2.b(true);
                                edVar2.f66840c.c(shortVideoContextViewModel2.c());
                                edVar2.f66840c.m.c(0);
                                recordLayout2.a(1, true);
                                boolean d3 = edVar2.f66840c.m.d();
                                edVar2.f66842e.f77615e.setValue(new f(true, edVar2.a(d3), edVar2.a(d3, true)));
                                edVar2.f66842e.f77616f.setValue(new u(0));
                                com.ss.android.ugc.aweme.port.in.a.f61121d.a(edVar2.f66840c.j(), "photo_shoot");
                                r.onEvent(MobClick.obtain().setEventName("shoot_photo_mode").setLabelName("shoot_page").setJsonObject(edVar2.f66840c.i()));
                            }
                        }
                        recordTitleViewModel.c(false);
                    } else if (TextUtils.equals((CharSequence) gVar.f74762c, ed.this.f66840c.getResources().getString(C0906R.string.bx7))) {
                        recordLayout.b();
                        if (!shortVideoContextViewModel.f()) {
                            ax axVar = new ax();
                            ed.this.f66840c.z.a((Object) this, (bc) axVar);
                            ed.this.f66840c.k().a((Object) this, (bc) axVar);
                        }
                        ed.this.f66840c.m.c(0);
                        ed.this.f66842e.f77615e.setValue(new f(false, ed.this.a(d2), ed.this.a(d2, false)));
                        ed.this.f66842e.f77616f.setValue(new u(0));
                        shortVideoContextViewModel.b(gVar.f74764e);
                        if (shortVideoContextViewModel.c()) {
                            ed.this.f66840c.m.c(0);
                            shortVideoContextViewModel.b(false);
                        }
                        recordTitleViewModel.c(true);
                        ed.this.f66840c.c(shortVideoContextViewModel.c());
                        recordLayout.a(0, false);
                        com.ss.android.ugc.aweme.port.in.a.f61121d.a(ed.this.f66840c.j(), "long_press_shoot");
                        r.onEvent(MobClick.obtain().setEventName("shoot_mode").setLabelName("shoot_page").setJsonObject(ed.this.f66840c.i()));
                        if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.SpeedPanelOpen)) {
                            a(0);
                        }
                        com.ss.android.ugc.aweme.shortvideo.d.a.c(1);
                        fhVar.N = 1;
                    } else if (TextUtils.equals((CharSequence) gVar.f74762c, ed.this.f66840c.getResources().getString(C0906R.string.bwu))) {
                        recordLayout.b();
                        ed.this.f66840c.m.c(0);
                        ed.this.f66842e.f77615e.setValue(new f(false, ed.this.a(d2), ed.this.a(d2, false)));
                        ed.this.f66842e.f77616f.setValue(new u(0));
                        shortVideoContextViewModel.b(gVar.f74764e);
                        if (shortVideoContextViewModel.c()) {
                            ed.this.f66840c.m.c(0);
                            shortVideoContextViewModel.b(false);
                        }
                        recordTitleViewModel.c(true);
                        ed.this.f66840c.c(shortVideoContextViewModel.c());
                        recordLayout.a(1, false);
                        com.ss.android.ugc.aweme.port.in.a.f61121d.a(ed.this.f66840c.j(), "click_shoot");
                        r.onEvent(MobClick.obtain().setEventName("click_mode").setLabelName("shoot_page").setJsonObject(ed.this.f66840c.i()));
                        if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.SpeedPanelOpen)) {
                            a(0);
                        }
                        com.ss.android.ugc.aweme.shortvideo.d.a.c(0);
                        fhVar.N = 0;
                    } else if (TextUtils.equals((CharSequence) gVar.f74762c, ed.this.f66840c.getString(i))) {
                        recordLayout.setVisibility(8);
                        ed edVar3 = ed.this;
                        if (PatchProxy.isSupport(new Object[0], edVar3, ed.f66838a, false, 74389, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], edVar3, ed.f66838a, false, 74389, new Class[0], Void.TYPE);
                        } else {
                            RecordTitleViewModel recordTitleViewModel2 = (RecordTitleViewModel) a.a(edVar3.f66839b.getActivity()).get(RecordTitleViewModel.class);
                            edVar3.f66839b.u();
                            ShortVideoContextViewModel shortVideoContextViewModel3 = (ShortVideoContextViewModel) ViewModelProviders.of(edVar3.f66839b.getActivity()).get(ShortVideoContextViewModel.class);
                            if (shortVideoContextViewModel3.f65401b.m.isEmpty()) {
                                if (!com.ss.android.g.a.b()) {
                                    shortVideoContextViewModel3.b(0);
                                    edVar3.f66840c.m.c(0);
                                    boolean d4 = edVar3.f66840c.m.d();
                                    edVar3.f66842e.f77615e.setValue(new f(false, edVar3.a(d4), edVar3.a(d4, false)));
                                    edVar3.f66842e.f77616f.setValue(new u(0));
                                    edVar3.f66840c.p = edVar3.f66840c.k.g;
                                    if (!(edVar3.f66840c.p == null || edVar3.f66840c.p == FaceStickerBean.NONE)) {
                                        edVar3.f66840c.k.a(FaceStickerBean.NONE);
                                    }
                                    ((com.ss.android.ugc.aweme.shortvideo.filter.e) edVar3.f66840c.l.c()).b(false, true);
                                    ((com.ss.android.ugc.aweme.shortvideo.filter.e) edVar3.f66840c.l.c()).c(false, true);
                                }
                                com.ss.android.ugc.aweme.port.in.a.u.a(edVar3.f66843f);
                                ((RecordViewModel) ViewModelProviders.of(edVar3.f66839b.getActivity()).get(RecordViewModel.class)).f77634d.setValue(Boolean.TRUE);
                                recordTitleViewModel2.c(false);
                            }
                        }
                    } else if (TextUtils.equals((CharSequence) gVar.f74762c, ed.this.f66840c.getResources().getString(C0906R.string.bx1))) {
                        recordLayout.a(2, false);
                        ed.this.f66839b.q().a((Object) this, (bc) new ag(1));
                        com.ss.android.ugc.aweme.port.in.a.f61121d.a(ed.this.f66840c.j(), "super_slow");
                        r.onEvent(MobClick.obtain().setEventName("super_slow").setLabelName("shoot_page").setJsonObject(ed.this.f66839b.t()));
                    } else if (aj.f65581d.a((String) gVar.f74762c)) {
                        aj ajVar = aj.f65581d;
                        String str = (String) gVar.f74762c;
                        if (PatchProxy.isSupport(new Object[]{str}, ajVar, aj.f65578a, false, 73987, new Class[]{String.class}, Integer.TYPE)) {
                            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{str}, ajVar, aj.f65578a, false, 73987, new Class[]{String.class}, Integer.TYPE)).intValue();
                        } else {
                            Intrinsics.checkParameterIsNotNull(str, "tag");
                            i2 = Intrinsics.areEqual((Object) str, (Object) aj.f65579b) ? 10 : Intrinsics.areEqual((Object) str, (Object) aj.f65580c) ? 11 : 8;
                        }
                        recordLayout.b();
                        ed.this.f66840c.m.c(0);
                        ed.this.f66842e.f77615e.setValue(new f(false, ed.this.a(d2), ed.this.a(d2, false)));
                        ed.this.f66842e.f77616f.setValue(new u(0));
                        if (ed.this.f66840c.l == null) {
                            StringBuilder sb = new StringBuilder("PreviewBottomTab activity.plan = ");
                            sb.append(ed.this.f66840c.P == null);
                            ai.b(sb.toString());
                            String tag = TextUtils.isEmpty(ed.this.f66839b.getTag()) ? " " : ed.this.f66839b.getTag();
                            ai.b("PreviewBottomTab fragment tag = " + tag);
                            FragmentManager supportFragmentManager = ed.this.f66840c.getSupportFragmentManager();
                            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("tag_ui_fragment");
                            StringBuilder sb2 = new StringBuilder("PreviewBottomTab findFragmentByTag addedFragment");
                            sb2.append(findFragmentByTag == null);
                            ai.b(sb2.toString());
                            StringBuilder sb3 = new StringBuilder("PreviewBottomTab findFragmentByTag addedFragment == fragment");
                            sb3.append(findFragmentByTag == ed.this.f66839b);
                            ai.b(sb3.toString());
                            List<Fragment> fragments = supportFragmentManager.getFragments();
                            if (Lists.notEmpty(fragments)) {
                                List<T> a2 = z.a(fragments, ee.f67508b);
                                if (Lists.notEmpty(a2)) {
                                    for (T tag2 : a2) {
                                        String tag3 = tag2.getTag();
                                        StringBuilder sb4 = new StringBuilder("PreviewBottomTab removeUIFragment getFragments ");
                                        if (TextUtils.isEmpty(tag3)) {
                                            tag3 = "";
                                        }
                                        sb4.append(tag3);
                                        ai.b(sb4.toString());
                                    }
                                }
                            }
                            ai.b("PreviewBottomTab fragment isAdded = " + ed.this.f66839b.isAdded());
                            ai.b("PreviewBottomTab fragment isDetached = " + ed.this.f66839b.isDetached());
                            ai.b("PreviewBottomTab fragment isRemoving = " + ed.this.f66839b.isRemoving());
                            ai.b("PreviewBottomTab fragment isVisible = " + ed.this.f66839b.isVisible());
                            ai.b("PreviewBottomTab fragment state = " + ed.this.f66839b.getLifecycle().getCurrentState());
                        }
                        shortVideoContextViewModel.b(gVar.f74764e);
                        if (shortVideoContextViewModel.c()) {
                            ed.this.f66840c.m.c(0);
                            shortVideoContextViewModel.b(false);
                        }
                        recordTitleViewModel.c(true);
                        ed.this.f66840c.c(shortVideoContextViewModel.c());
                        recordLayout.a(3, false);
                        if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.SpeedPanelOpen)) {
                            a(0);
                        }
                        String str2 = (String) gVar.f74762c;
                        String str3 = str2;
                        if (PatchProxy.isSupport(new Object[]{str2, fhVar, gVar}, this, f66846a, false, 74396, new Class[]{String.class, fh.class, g.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str3, fhVar, gVar}, this, f66846a, false, 74396, new Class[]{String.class, fh.class, g.class}, Void.TYPE);
                        } else if ((aj.b().equals(str3) || aj.a().equals(str3)) && !fhVar.b() && !fhVar.c()) {
                            ay ayVar = new ay(!aj.b().equals(str3), true);
                            ayVar.f74641e = gVar.f74765f;
                            ayVar.f74640d = 2;
                            ed.this.f66839b.q().a((Object) ed.this.f66839b, (bc) ayVar);
                            ed.this.f66839b.k().a((Object) ed.this.f66839b, (bc) ayVar);
                        }
                        String str4 = (String) gVar.f74762c;
                        if (PatchProxy.isSupport(new Object[]{str4, fhVar}, this, f66846a, false, 74397, new Class[]{String.class, fh.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str4, fhVar}, this, f66846a, false, 74397, new Class[]{String.class, fh.class}, Void.TYPE);
                        } else if ((aj.b().equals(str4) || aj.a().equals(str4)) && fhVar.a()) {
                            fhVar.g = 0;
                            com.ss.android.ugc.aweme.shortvideo.d.a.a(fhVar.f67723f, ej.a().b(), fhVar.g);
                            ed.this.f66840c.af.c().a(fhVar.f67723f, (long) fhVar.g, fhVar.n);
                            ed.this.f66840c.o.f66617d = fhVar.g;
                        }
                        com.ss.android.ugc.aweme.shortvideo.d.a.c(i2);
                        fhVar.N = i2;
                    } else if (TextUtils.equals((CharSequence) gVar.f74762c, ed.this.f66840c.getResources().getString(C0906R.string.bx5))) {
                        VideoRecordNewActivity videoRecordNewActivity = ed.this.f66840c;
                        if (PatchProxy.isSupport(new Object[0], videoRecordNewActivity, VideoRecordNewActivity.f4033b, false, 80578, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], videoRecordNewActivity, VideoRecordNewActivity.f4033b, false, 80578, new Class[0], Void.TYPE);
                        } else {
                            ((RecordViewModel) ViewModelProviders.of((FragmentActivity) videoRecordNewActivity).get(RecordViewModel.class)).f77633c.setValue(Boolean.TRUE);
                        }
                        ed.this.f66840c.P.h(false);
                    } else {
                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new IllegalArgumentException("unknown index: " + gVar.f74764e));
                    }
                    if (fc.a()) {
                        VideoRecordNewActivity videoRecordNewActivity2 = ed.this.f66840c;
                        boolean equals = TextUtils.equals((CharSequence) gVar.f74762c, ed.this.f66840c.getString(C0906R.string.bx3));
                        boolean equals2 = TextUtils.equals((CharSequence) gVar.f74761b, ed.this.f66840c.getString(C0906R.string.bx3));
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(equals ? (byte) 1 : 0), Byte.valueOf(equals2 ? (byte) 1 : 0)}, videoRecordNewActivity2, VideoRecordNewActivity.f4033b, false, 80546, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(equals), Byte.valueOf(equals2)}, videoRecordNewActivity2, VideoRecordNewActivity.f4033b, false, 80546, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                        } else {
                            if (equals) {
                                fb.a((View) videoRecordNewActivity2.x, videoRecordNewActivity2.f4034c.j, videoRecordNewActivity2.f4034c.k);
                                videoRecordNewActivity2.a(false);
                            }
                            if (equals2) {
                                fb.a(videoRecordNewActivity2.x, videoRecordNewActivity2, videoRecordNewActivity2.f4034c.j, videoRecordNewActivity2.f4034c.k, videoRecordNewActivity2.W);
                                if (videoRecordNewActivity2.P != null) {
                                    videoRecordNewActivity2.P.an_();
                                }
                                videoRecordNewActivity2.a(true);
                            }
                        }
                    }
                    if (!TextUtils.equals((CharSequence) gVar.f74762c, ed.this.f66840c.getResources().getString(C0906R.string.bx5))) {
                        VideoRecordNewActivity videoRecordNewActivity3 = ed.this.f66840c;
                        if (PatchProxy.isSupport(new Object[0], videoRecordNewActivity3, VideoRecordNewActivity.f4033b, false, 80579, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], videoRecordNewActivity3, VideoRecordNewActivity.f4033b, false, 80579, new Class[0], Void.TYPE);
                        } else {
                            ((RecordViewModel) ViewModelProviders.of((FragmentActivity) videoRecordNewActivity3).get(RecordViewModel.class)).f77633c.setValue(Boolean.FALSE);
                        }
                        if (!TextUtils.equals((CharSequence) gVar.f74762c, ed.this.f66840c.getString(C0906R.string.bx3))) {
                            ed.this.f66840c.P.h(true);
                        }
                    }
                    if (TextUtils.equals((CharSequence) gVar.f74762c, ed.this.f66840c.getString(C0906R.string.bx1))) {
                        ed.this.f66840c.P.h(false);
                        ed.this.f66840c.P.c(true);
                    }
                }

                private void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66846a, false, 74395, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66846a, false, 74395, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    ed.this.f66840c.z.a((Object) ed.this.f66840c, (bc) new as(i));
                }
            };
        }
    }

    public final boolean a(boolean z, boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66838a, false, 74391, new Class[]{Boolean.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return this.f66840c.m.p.a(z, z2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f66838a, false, 74391, new Class[]{Boolean.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
