package dmt.av.video;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.SurfaceView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.a.a;
import com.ss.android.ugc.aweme.shortvideo.edit.a.b;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.p;
import dmt.av.video.a.a;
import dmt.av.video.a.c;
import dmt.av.video.a.d;
import dmt.av.video.a.e;
import dmt.av.video.a.i;
import dmt.av.video.a.j;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

public class ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82855a;
    public a A;
    public boolean B = false;
    MutableLiveData<p> C;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    Context f82856b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    LifecycleOwner f82857c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    SurfaceView f82858d;

    /* renamed from: e  reason: collision with root package name */
    public LiveData<u> f82859e;

    /* renamed from: f  reason: collision with root package name */
    public LiveData<t> f82860f;
    public LiveData<h> g;
    public LiveData<s> h;
    public LiveData<p> i;
    public h<x> j;
    public h<j> k;
    public LiveData<VEVolumeChangeOp> l;
    public LiveData<r> m;
    public MutableLiveData<com.ss.android.ugc.aweme.n.a> n;
    public LiveData<b> o;
    @Nullable
    public VEEditorAutoStartStopArbiter p;
    public com.ss.android.ugc.aweme.shortvideo.b.b q;
    public MutableLiveData<Integer> r = new MutableLiveData<>();
    public m s;
    public VEListener.k t;
    public MutableLiveData<Void> u = new MutableLiveData<>();
    m v;
    public MutableLiveData<Boolean> w = new MutableLiveData<>();
    boolean x = false;
    boolean y = false;
    volatile boolean z = false;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f82855a, false, 92088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82855a, false, 92088, new Class[0], Void.TYPE);
            return;
        }
        if (this.C != null) {
            this.C.setValue(null);
        }
        if (this.q != null) {
            this.q.k();
        }
    }

    public final h<j> b() {
        if (PatchProxy.isSupport(new Object[0], this, f82855a, false, 92089, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f82855a, false, 92089, new Class[0], h.class);
        } else if (this.k == null) {
            return new h<>();
        } else {
            return this.k;
        }
    }

    public final void a(MutableLiveData<Boolean> mutableLiveData) {
        this.A.f82815b = mutableLiveData;
    }

    public final void b(MutableLiveData<AudioEffectParam> mutableLiveData) {
        this.A.f82816c = mutableLiveData;
    }

    public final void a(ArrayList<EffectPointModel> arrayList) {
        this.A.f82817d = arrayList;
    }

    public ad(int i2) {
        a aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, a.f82814a, true, 92156, new Class[]{Integer.TYPE}, a.class)) {
            aVar = (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, a.f82814a, true, 92156, new Class[]{Integer.TYPE}, a.class);
        } else if (i2 == 2) {
            aVar = new j();
        } else if (i2 == 3) {
            aVar = new i();
        } else {
            aVar = new dmt.av.video.a.h();
        }
        this.A = aVar;
    }

    public final void a(boolean z2, boolean z3) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f82855a, false, 92087, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f82855a, false, 92087, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!this.y) {
            this.y = true;
            this.w.postValue(Boolean.valueOf(z2));
            n.b(this.q, this.v);
            if (z3) {
                str = "receive dld done event";
            } else {
                str = "not receive dld done event";
            }
            com.ss.android.ugc.aweme.framework.a.a.a(str);
        }
    }

    public final void a(@Nullable Context context, @NonNull LifecycleOwner lifecycleOwner, @Nullable SurfaceView surfaceView) {
        Context context2 = context;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        SurfaceView surfaceView2 = surfaceView;
        if (PatchProxy.isSupport(new Object[]{context2, lifecycleOwner2, surfaceView2}, this, f82855a, false, 92084, new Class[]{Context.class, LifecycleOwner.class, SurfaceView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, lifecycleOwner2, surfaceView2}, this, f82855a, false, 92084, new Class[]{Context.class, LifecycleOwner.class, SurfaceView.class}, Void.TYPE);
            return;
        }
        a(context2, lifecycleOwner2, surfaceView2, false);
    }

    public final void a(@Nullable Context context, @NonNull LifecycleOwner lifecycleOwner, @Nullable SurfaceView surfaceView, boolean z2) {
        Context context2 = context;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        SurfaceView surfaceView2 = surfaceView;
        if (PatchProxy.isSupport(new Object[]{context2, lifecycleOwner2, surfaceView2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f82855a, false, 92085, new Class[]{Context.class, LifecycleOwner.class, SurfaceView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, lifecycleOwner2, surfaceView2, Byte.valueOf(z2)}, this, f82855a, false, 92085, new Class[]{Context.class, LifecycleOwner.class, SurfaceView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.x = z2;
        this.f82856b = context2;
        this.f82857c = lifecycleOwner2;
        this.f82858d = surfaceView2;
        this.f82859e.observe(this.f82857c, new Observer<u>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82861a;

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void a(int i) {
                if (i == 4116) {
                    com.ss.android.ugc.aweme.framework.a.a.a("receive prepare done event");
                    ad.this.u.postValue(null);
                    n.b(ad.this.q, ad.this.s);
                }
            }

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                int i;
                boolean z;
                int i2;
                Object[] objArr;
                ChangeQuickRedirect changeQuickRedirect;
                boolean z2;
                int i3;
                Class[] clsArr;
                Class cls;
                a.C0711a aVar;
                u uVar = (u) obj;
                int i4 = 1;
                int i5 = 0;
                if (PatchProxy.isSupport(new Object[]{uVar}, this, f82861a, false, 92092, new Class[]{u.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{uVar}, this, f82861a, false, 92092, new Class[]{u.class}, Void.TYPE);
                    return;
                }
                if (ad.this.f82858d == null) {
                    ad.this.q = new com.ss.android.ugc.aweme.shortvideo.b.b(uVar.mWorkspace);
                } else {
                    if (uVar.editorHandler > 0) {
                        ad.this.q = new com.ss.android.ugc.aweme.shortvideo.b.b(uVar.mWorkspace, ad.this.f82858d, uVar.editorHandler);
                        ad.this.q.b(false);
                        ad.this.q.c(-1);
                    } else {
                        ad.this.q = new com.ss.android.ugc.aweme.shortvideo.b.b(uVar.mWorkspace, ad.this.f82858d);
                    }
                    ad.this.p = new VEEditorAutoStartStopArbiter(ad.this.f82856b, ad.this.f82857c, ad.this.q, ad.this.f82858d);
                    ad.this.A.f82818e = ad.this.p;
                    if (ad.this.t != null) {
                        ad.this.q.g = ad.this.t;
                    }
                }
                ad.this.q.n.setDestroyVersion(!com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VeEditorANRDestroy));
                ad.this.s = new ag(this);
                n.a(ad.this.q, ad.this.s);
                ad.this.q.j(uVar.mFps);
                boolean z3 = uVar instanceof VEPreviewConfigure;
                if (z3) {
                    VEPreviewConfigure vEPreviewConfigure = (VEPreviewConfigure) uVar;
                    int previewWidth = vEPreviewConfigure.getPreviewWidth();
                    int previewHeight = vEPreviewConfigure.getPreviewHeight();
                    if (previewHeight > 0 && previewWidth > 0) {
                        ad.this.q.b(previewWidth, previewHeight);
                    }
                }
                int a2 = ad.this.A.a(ad.this.f82856b, (p) ad.this.q, uVar);
                if (ad.this.f82858d != null && uVar.canvasWidth > 0 && uVar.canvasHeight > 0) {
                    ad.this.q.a(p.c.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
                    com.ss.android.ugc.aweme.shortvideo.b.b bVar = ad.this.q;
                    bVar.n.setWidthHeight(uVar.canvasWidth, uVar.canvasHeight);
                }
                if (uVar.sceneIn >= 0 && uVar.sceneOut > uVar.sceneIn) {
                    ad.this.q.a(uVar.sceneIn, uVar.sceneOut);
                }
                if (uVar.veCherEffectParam == null || uVar.veCherEffectParam.getMatrix() == null) {
                    z = z3;
                    i = a2;
                } else {
                    com.ss.android.ugc.aweme.shortvideo.b.b bVar2 = ad.this.q;
                    VECherEffectParam vECherEffectParam = uVar.veCherEffectParam;
                    int length = vECherEffectParam.getMatrix().length;
                    int[] iArr = new int[length];
                    int[] iArr2 = new int[length];
                    int[] iArr3 = new int[length];
                    String[] strArr = new String[length];
                    int[] iArr4 = new int[length];
                    int[] iArr5 = new int[length];
                    int i6 = 0;
                    while (i6 < length) {
                        iArr[i6] = i5;
                        iArr2[i6] = i4;
                        strArr[i6] = "audio chereffect";
                        iArr3[i6] = i4;
                        int i7 = i6 * 2;
                        iArr4[i6] = (int) vECherEffectParam.getDuration()[i7];
                        iArr5[i6] = (int) vECherEffectParam.getDuration()[i7 + 1];
                        i6++;
                        z3 = z3;
                        a2 = a2;
                        i4 = 1;
                        i5 = 0;
                    }
                    z = z3;
                    i = a2;
                    int[] addFilters = bVar2.n.addFilters(iArr, strArr, iArr4, iArr5, iArr2, iArr3);
                    for (int i8 = 0; i8 < length; i8++) {
                        bVar2.n.setFilterParam(addFilters[i8], "cher_matrix", vECherEffectParam.getMatrix()[i8]);
                    }
                }
                ad adVar = ad.this;
                if (PatchProxy.isSupport(new Object[0], adVar, ad.f82855a, false, 92086, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], adVar, ad.f82855a, false, 92086, new Class[0], Void.TYPE);
                } else if (adVar.x) {
                    adVar.v = new af(adVar);
                    n.a(adVar.q, adVar.v);
                    if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.shortvideo.edit.a.a.f66932a, true, 76700, new Class[0], Integer.TYPE)) {
                        objArr = new Object[0];
                        aVar = null;
                        changeQuickRedirect = com.ss.android.ugc.aweme.shortvideo.edit.a.a.f66932a;
                        z2 = true;
                        i3 = 76700;
                        clsArr = new Class[0];
                        cls = Integer.TYPE;
                    } else {
                        a.C0711a aVar2 = com.ss.android.ugc.aweme.shortvideo.edit.a.a.f66935d;
                        if (PatchProxy.isSupport(new Object[0], aVar2, a.C0711a.f66936a, false, 76704, new Class[0], Integer.TYPE)) {
                            objArr = new Object[0];
                            changeQuickRedirect = a.C0711a.f66936a;
                            z2 = false;
                            i3 = 76704;
                            clsArr = new Class[0];
                            cls = Integer.TYPE;
                            aVar = aVar2;
                        } else {
                            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
                            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
                            Integer bQ = b2.bQ();
                            Intrinsics.checkExpressionValueIsNotNull(bQ, "SettingsReader.get().lightEnhanceThreshold");
                            i2 = bQ.intValue();
                            adVar.q.n.setDldThrVal(i2);
                            adVar.q.n.setDldEnabled(true);
                            new Timer().schedule(new TimerTask() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f82869a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f82869a, false, 92095, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f82869a, false, 92095, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    ad.this.z = true;
                                    ad.this.a(false, false);
                                }
                            }, TimeUnit.SECONDS.toMillis(2));
                        }
                    }
                    i2 = ((Integer) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, z2, i3, clsArr, cls)).intValue();
                    adVar.q.n.setDldThrVal(i2);
                    adVar.q.n.setDldEnabled(true);
                    new Timer().schedule(new TimerTask() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f82869a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f82869a, false, 92095, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f82869a, false, 92095, new Class[0], Void.TYPE);
                                return;
                            }
                            ad.this.z = true;
                            ad.this.a(false, false);
                        }
                    }, TimeUnit.SECONDS.toMillis(2));
                }
                ad.this.q.a(true);
                if (!(ad.this.f82858d == null && uVar.veAudioEffectParam == null)) {
                    ad.this.q.h();
                }
                if (!(uVar.veAudioEffectParam == null || ad.this.b() == null)) {
                    ad.this.b().setValue(j.a(true, uVar.veAudioEffectParam));
                }
                if (ad.this.A instanceof i) {
                    ad.this.q.a(0, 1, uVar.mMusicVolume);
                } else if (ad.this.A instanceof j) {
                    ad.this.q.a(0, 1, uVar.mMusicVolume);
                } else if (uVar.mAudioPaths != null && uVar.mAudioPaths.length == 1) {
                    ad.this.q.a(0, 0, uVar.mVolume);
                }
                if (z && ad.this.q.f78038b != null) {
                    ad.this.q.a(ad.this.q.f78038b.h, ad.this.q.f78038b.i, uVar.mVolume);
                }
                ad.this.r.setValue(Integer.valueOf(i));
                if (ad.this.C != null) {
                    ad.this.C.setValue(ad.this.q);
                }
            }
        });
        this.f82859e.observe(this.f82857c, new d());
        this.f82860f.observe(this.f82857c, new Observer<t>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82871a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                t tVar = (t) obj;
                if (PatchProxy.isSupport(new Object[]{tVar}, this, f82871a, false, 92096, new Class[]{t.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{tVar}, this, f82871a, false, 92096, new Class[]{t.class}, Void.TYPE);
                    return;
                }
                ad.this.A.a(tVar);
            }
        });
        this.f82860f.observe(this.f82857c, new d());
        this.g.observe(this.f82857c, new Observer<h>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82873a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                h hVar = (h) obj;
                if (PatchProxy.isSupport(new Object[]{hVar}, this, f82873a, false, 92097, new Class[]{h.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{hVar}, this, f82873a, false, 92097, new Class[]{h.class}, Void.TYPE);
                    return;
                }
                ad.this.A.a(hVar);
            }
        });
        this.g.observe(this.f82857c, new d());
        this.h.observe(this.f82857c, new Observer<s>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82875a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                s sVar = (s) obj;
                if (PatchProxy.isSupport(new Object[]{sVar}, this, f82875a, false, 92098, new Class[]{s.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{sVar}, this, f82875a, false, 92098, new Class[]{s.class}, Void.TYPE);
                    return;
                }
                ad.this.A.a(sVar);
            }
        });
        this.h.observe(this.f82857c, new d());
        this.i.observe(this.f82857c, new Observer<p>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82877a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                p pVar = (p) obj;
                if (PatchProxy.isSupport(new Object[]{pVar}, this, f82877a, false, 92099, new Class[]{p.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{pVar}, this, f82877a, false, 92099, new Class[]{p.class}, Void.TYPE);
                    return;
                }
                ad.this.A.a(pVar);
            }
        });
        this.i.observe(this.f82857c, new d());
        this.j.a(this.f82857c, new b<x>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82879a;

            public final /* synthetic */ void a(Object obj, Object obj2) {
                x xVar = (x) obj;
                x xVar2 = (x) obj2;
                if (PatchProxy.isSupport(new Object[]{xVar, xVar2}, this, f82879a, false, 92100, new Class[]{x.class, x.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{xVar, xVar2}, this, f82879a, false, 92100, new Class[]{x.class, x.class}, Void.TYPE);
                    return;
                }
                ad.this.A.a(xVar, xVar2);
            }
        });
        this.j.observe(this.f82857c, new d());
        b().a(this.f82857c, new b<j>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82881a;

            public final /* synthetic */ void a(Object obj, Object obj2) {
                Callable callable;
                a.g gVar;
                j jVar = (j) obj;
                j jVar2 = (j) obj2;
                if (PatchProxy.isSupport(new Object[]{jVar, jVar2}, this, f82881a, false, 92101, new Class[]{j.class, j.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{jVar, jVar2}, this, f82881a, false, 92101, new Class[]{j.class, j.class}, Void.TYPE);
                    return;
                }
                dmt.av.video.a.a aVar = ad.this.A;
                if (PatchProxy.isSupport(new Object[]{jVar, jVar2}, aVar, dmt.av.video.a.a.f82814a, false, 92147, new Class[]{j.class, j.class}, Void.TYPE)) {
                    dmt.av.video.a.a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{jVar, jVar2}, aVar2, dmt.av.video.a.a.f82814a, false, 92147, new Class[]{j.class, j.class}, Void.TYPE);
                    return;
                }
                boolean z = jVar2.f83008e;
                if ("apply".equals(jVar2.f83007d)) {
                    if (jVar2.f83009f != null) {
                        if (PatchProxy.isSupport(new Object[]{jVar, jVar2, Byte.valueOf(z ? (byte) 1 : 0)}, aVar, dmt.av.video.a.a.f82814a, false, 92150, new Class[]{j.class, j.class, Boolean.TYPE}, Callable.class)) {
                            dmt.av.video.a.a aVar3 = aVar;
                            callable = (Callable) PatchProxy.accessDispatch(new Object[]{jVar, jVar2, Byte.valueOf(z)}, aVar3, dmt.av.video.a.a.f82814a, false, 92150, new Class[]{j.class, j.class, Boolean.TYPE}, Callable.class);
                        } else {
                            callable = new e(aVar, jVar, jVar2, z);
                        }
                        if (PatchProxy.isSupport(new Object[]{jVar2}, aVar, dmt.av.video.a.a.f82814a, false, 92149, new Class[]{j.class}, a.g.class)) {
                            dmt.av.video.a.a aVar4 = aVar;
                            gVar = (a.g) PatchProxy.accessDispatch(new Object[]{jVar2}, aVar4, dmt.av.video.a.a.f82814a, false, 92149, new Class[]{j.class}, a.g.class);
                        } else {
                            gVar = new d(aVar, jVar2);
                        }
                        a.i.a(callable, aVar.a()).a(gVar, a.i.f1052b);
                    }
                } else if ("clear".equals(jVar2.f83007d)) {
                    dmt.av.video.a.b bVar = new dmt.av.video.a.b(aVar, jVar, jVar2, z);
                    a.i.a((Callable<TResult>) bVar, aVar.a()).a((a.g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(aVar), a.i.f1052b);
                }
            }
        });
        this.l.observe(this.f82857c, new Observer<VEVolumeChangeOp>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82863a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                VEVolumeChangeOp vEVolumeChangeOp = (VEVolumeChangeOp) obj;
                if (PatchProxy.isSupport(new Object[]{vEVolumeChangeOp}, this, f82863a, false, 92102, new Class[]{VEVolumeChangeOp.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{vEVolumeChangeOp}, this, f82863a, false, 92102, new Class[]{VEVolumeChangeOp.class}, Void.TYPE);
                    return;
                }
                ad.this.A.a(vEVolumeChangeOp);
            }
        });
        this.l.observe(this.f82857c, new d());
        this.m.observe(this.f82857c, new Observer<r>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82865a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                r rVar = (r) obj;
                if (PatchProxy.isSupport(new Object[]{rVar}, this, f82865a, false, 92103, new Class[]{r.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{rVar}, this, f82865a, false, 92103, new Class[]{r.class}, Void.TYPE);
                    return;
                }
                ad.this.A.a(rVar);
            }
        });
        this.m.observe(this.f82857c, new d());
        this.n.observe(this.f82857c, new ae(this));
        this.n.observe(this.f82857c, new d());
        if (this.o != null) {
            this.o.observe(this.f82857c, new d<b>() {

                /* renamed from: c  reason: collision with root package name */
                public static ChangeQuickRedirect f82867c;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    String str;
                    String str2;
                    b bVar = (b) obj;
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f82867c, false, 92094, new Class[]{b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f82867c, false, 92094, new Class[]{b.class}, Void.TYPE);
                        return;
                    }
                    dmt.av.video.a.a aVar = ad.this.A;
                    if (PatchProxy.isSupport(new Object[]{bVar}, aVar, dmt.av.video.a.a.f82814a, false, 92141, new Class[]{b.class}, Void.TYPE)) {
                        dmt.av.video.a.a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{bVar}, aVar2, dmt.av.video.a.a.f82814a, false, 92141, new Class[]{b.class}, Void.TYPE);
                        return;
                    }
                    if (bVar != null) {
                        String str3 = "";
                        switch (bVar.f66938b) {
                            case 0:
                                str3 = "apply nothing";
                                break;
                            case 1:
                                aVar.a(bVar.f66937a, bVar.f66939c);
                                StringBuilder sb = new StringBuilder("apply light enhance, ");
                                if (bVar.f66937a) {
                                    str = "on ";
                                } else {
                                    str = "off";
                                }
                                sb.append(str);
                                str3 = sb.toString();
                                break;
                            case 2:
                                aVar.a(bVar.f66937a);
                                StringBuilder sb2 = new StringBuilder("apply hdr enhance, ");
                                if (bVar.f66937a) {
                                    str2 = "on ";
                                } else {
                                    str2 = "off";
                                }
                                sb2.append(str2);
                                str3 = sb2.toString();
                                break;
                        }
                        com.ss.android.ugc.aweme.shortvideo.edit.a.c.a(aVar.f82819f, str3);
                    }
                }
            });
        }
    }
}
