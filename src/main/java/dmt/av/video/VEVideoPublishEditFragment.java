package dmt.av.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.p;
import com.ss.android.vesdk.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class VEVideoPublishEditFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82760a;

    /* renamed from: b  reason: collision with root package name */
    public LiveData<v> f82761b;

    /* renamed from: c  reason: collision with root package name */
    public LiveData<w> f82762c;

    /* renamed from: d  reason: collision with root package name */
    public ad f82763d = new ad(0);

    /* renamed from: e  reason: collision with root package name */
    public b f82764e;

    /* renamed from: f  reason: collision with root package name */
    public SurfaceView f82765f;
    public ImageView g;
    float h;
    private LinkedHashSet<View> i = new LinkedHashSet<>();
    private int j;
    private boolean k;
    private a l;
    private int m = Integer.MAX_VALUE;

    public interface a {
        boolean G();
    }

    public interface b {
        void a(v vVar);

        void a(w wVar);
    }

    static float a(float f2, boolean z) {
        return z ? 1.0f - f2 : f2;
    }

    public final void a(int i2, VEListener.k kVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), kVar}, this, f82760a, false, 92041, new Class[]{Integer.TYPE, VEListener.k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), kVar}, this, f82760a, false, 92041, new Class[]{Integer.TYPE, VEListener.k.class}, Void.TYPE);
            return;
        }
        this.f82763d = new ad(i2);
        this.f82763d.t = kVar;
    }

    public final void a(h<j> hVar) {
        this.f82763d.k = hVar;
    }

    public final void a(ArrayList<EffectPointModel> arrayList) {
        ArrayList<EffectPointModel> arrayList2 = arrayList;
        if (PatchProxy.isSupport(new Object[]{arrayList2}, this, f82760a, false, 92054, new Class[]{ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList2}, this, f82760a, false, 92054, new Class[]{ArrayList.class}, Void.TYPE);
            return;
        }
        this.f82763d.a(arrayList2);
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f82760a, false, 92055, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f82760a, false, 92055, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        return fb.a(i3, i2);
    }

    public final void a(boolean z, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        boolean z2 = z;
        final int i11 = i2;
        int i12 = i5;
        int i13 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)}, this, f82760a, false, 92056, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)}, this, f82760a, false, 92056, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!z2) {
            this.f82763d.p.a(true);
            this.f82763d.q.b(i11);
            if (fc.a() && (getActivity() instanceof VEVideoPublishEditActivity)) {
                ((VEVideoPublishEditActivity) getActivity()).a(i11);
            }
        } else if (fc.a() && (getActivity() instanceof VEVideoPublishEditActivity)) {
            ((VEVideoPublishEditActivity) getActivity()).a(getResources().getColor(C0906R.color.d5));
        }
        int e2 = fc.e(getActivity());
        int width = getView().getWidth();
        int c2 = fc.c(getActivity());
        aj d2 = this.f82763d.q.d();
        int i14 = d2.f77891b;
        int i15 = d2.f77890a;
        float f2 = (float) i14;
        float f3 = ((float) i15) / f2;
        if (i12 <= i14) {
            float f4 = z2 ? (float) i12 : f2;
            if (!z2) {
                f2 = (float) i12;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f4, f2});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            int i16 = i15;
            ab abVar = r0;
            int i17 = i14;
            ValueAnimator valueAnimator = ofFloat;
            ab abVar2 = new ab(this, z, i14, i15, f3, width, i3, c2, e2, i4);
            valueAnimator.addUpdateListener(abVar);
            if (z2) {
                valueAnimator.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f82801a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f82801a, false, 92081, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f82801a, false, 92081, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        VEVideoPublishEditFragment.this.f82763d.q.b(i11);
                        VEVideoPublishEditFragment.this.f82763d.p.a(false);
                    }
                });
            }
            valueAnimator.start();
            if (!a(i17, i16) && fc.a()) {
                if (!z2) {
                    this.j = ((ViewGroup.MarginLayoutParams) getView().getLayoutParams()).topMargin - i3;
                }
                if (z2) {
                    i8 = -this.j;
                    i9 = 0;
                } else {
                    i9 = -this.j;
                    i8 = 0;
                }
                a(z2, i11, i8, i9);
            }
        } else if (fc.a()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
            if (z2) {
                i13 = (((((fc.e(getContext()) - i3) - i4) - i14) / 2) + i3) - marginLayoutParams.topMargin;
                i10 = 0;
            } else {
                i10 = (((((fc.e(getContext()) - i3) - i4) - i14) / 2) + i3) - marginLayoutParams.topMargin;
            }
            a(z2, i11, i13, i10);
            a((float) i13, (float) i10);
        } else {
            int i18 = (int) (((float) width) / f3);
            float f5 = z2 ? (float) i18 : f2;
            if (!z2) {
                f2 = (float) i18;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{f5, f2});
            ofFloat2.setDuration(300);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            aa aaVar = r0;
            aa aaVar2 = new aa(this, z, f3, e2, i4, i3, i6, i7, i14);
            ofFloat2.addUpdateListener(aaVar);
            if (z2) {
                ofFloat2.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f82798a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f82798a, false, 92080, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f82798a, false, 92080, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        VEVideoPublishEditFragment.this.f82763d.q.b(i11);
                        VEVideoPublishEditFragment.this.f82763d.p.a(false);
                    }
                });
            }
            ofFloat2.start();
        }
        this.f82763d.q.a(z2);
    }

    public final void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f82760a, false, 92062, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f82760a, false, 92062, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.i.add(view2);
    }

    public final MutableLiveData<Void> b() {
        return this.f82763d.u;
    }

    private p c() {
        if (this.f82763d == null) {
            return null;
        }
        return this.f82763d.q;
    }

    public final VEEditorAutoStartStopArbiter a() {
        return this.f82763d.p;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f82760a, false, 92063, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82760a, false, 92063, new Class[0], Void.TYPE);
            return;
        }
        this.f82763d.a();
        super.onDestroy();
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f82760a, false, 92046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82760a, false, 92046, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        if (this.k) {
            c().h();
            this.k = false;
            ai.d("VEVideoPublishEditFragment prepare");
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f82760a, false, 92047, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82760a, false, 92047, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEditPageMemoryOpt) && this.l != null && this.l.G() && c() != null) {
            p c2 = c();
            synchronized (c2) {
                if (c2.n != null) {
                    y.c("VEEditor", "onRelease... ");
                    c2.n.stop();
                    c2.n.releaseEngine();
                }
            }
            this.k = true;
            ai.d("VEVideoPublishEditFragment releaseEngine");
        }
        super.onStop();
    }

    public final void c(LiveData<h> liveData) {
        this.f82763d.g = liveData;
    }

    public final void d(LiveData<s> liveData) {
        this.f82763d.h = liveData;
    }

    public final void e(LiveData<p> liveData) {
        this.f82763d.i = liveData;
    }

    public final void f(LiveData<r> liveData) {
        this.f82763d.m = liveData;
    }

    public final void b(LiveData<t> liveData) {
        this.f82763d.f82860f = liveData;
    }

    public final void d(MutableLiveData<VEVolumeChangeOp> mutableLiveData) {
        this.f82763d.l = mutableLiveData;
    }

    public final void f(MutableLiveData<com.ss.android.ugc.aweme.n.a> mutableLiveData) {
        this.f82763d.n = mutableLiveData;
    }

    public final void a(LiveData<u> liveData) {
        this.f82763d.f82859e = liveData;
    }

    public final void b(h<x> hVar) {
        this.f82763d.j = hVar;
    }

    public final void c(MutableLiveData<com.ss.android.ugc.aweme.shortvideo.edit.a.b> mutableLiveData) {
        if (mutableLiveData != null) {
            this.f82763d.o = mutableLiveData;
        }
    }

    public final void a(MutableLiveData<p> mutableLiveData) {
        if (this.f82763d != null) {
            this.f82763d.C = mutableLiveData;
        }
    }

    public final void e(MutableLiveData<Boolean> mutableLiveData) {
        MutableLiveData<Boolean> mutableLiveData2 = mutableLiveData;
        if (PatchProxy.isSupport(new Object[]{mutableLiveData2}, this, f82760a, false, 92053, new Class[]{MutableLiveData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mutableLiveData2}, this, f82760a, false, 92053, new Class[]{MutableLiveData.class}, Void.TYPE);
            return;
        }
        this.f82763d.a(mutableLiveData2);
    }

    public static VEVideoPublishEditFragment a(u uVar) {
        if (PatchProxy.isSupport(new Object[]{null}, null, f82760a, true, 92039, new Class[]{u.class}, VEVideoPublishEditFragment.class)) {
            return (VEVideoPublishEditFragment) PatchProxy.accessDispatch(new Object[]{null}, null, f82760a, true, 92039, new Class[]{u.class}, VEVideoPublishEditFragment.class);
        }
        VEVideoPublishEditFragment vEVideoPublishEditFragment = new VEVideoPublishEditFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("params", null);
        vEVideoPublishEditFragment.setArguments(bundle);
        return vEVideoPublishEditFragment;
    }

    public final void b(MutableLiveData<AudioEffectParam> mutableLiveData) {
        MutableLiveData<AudioEffectParam> mutableLiveData2 = mutableLiveData;
        if (PatchProxy.isSupport(new Object[]{mutableLiveData2}, this, f82760a, false, 92052, new Class[]{MutableLiveData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mutableLiveData2}, this, f82760a, false, 92052, new Class[]{MutableLiveData.class}, Void.TYPE);
            return;
        }
        if (mutableLiveData2 != null) {
            this.f82763d.b(mutableLiveData2);
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f82760a, false, 92048, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f82760a, false, 92048, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.f82763d.a(getContext(), this, this.f82765f, com.ss.android.ugc.aweme.shortvideo.edit.a.a.a());
        this.f82761b.observe(this, new Observer<v>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82766a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                v vVar = (v) obj;
                if (PatchProxy.isSupport(new Object[]{vVar}, this, f82766a, false, 92068, new Class[]{v.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{vVar}, this, f82766a, false, 92068, new Class[]{v.class}, Void.TYPE);
                    return;
                }
                if (vVar.f83072b == 1) {
                    VEVideoPublishEditFragment vEVideoPublishEditFragment = VEVideoPublishEditFragment.this;
                    int i = vVar.f83073c;
                    Object[] objArr = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect = VEVideoPublishEditFragment.f82760a;
                    Class[] clsArr = {Integer.TYPE};
                    int i2 = i;
                    if (PatchProxy.isSupport(objArr, vEVideoPublishEditFragment, changeQuickRedirect, false, 92058, clsArr, Void.TYPE)) {
                        VEVideoPublishEditFragment vEVideoPublishEditFragment2 = vEVideoPublishEditFragment;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, vEVideoPublishEditFragment2, VEVideoPublishEditFragment.f82760a, false, 92058, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else {
                        vEVideoPublishEditFragment.f82763d.p.a(true);
                        vEVideoPublishEditFragment.f82763d.q.b(i2);
                        Context context = vEVideoPublishEditFragment.getView().getContext();
                        int height = vEVideoPublishEditFragment.getView().getHeight();
                        int width = vEVideoPublishEditFragment.getView().getWidth();
                        int e2 = (int) (((float) fc.e(context)) - UIUtils.dip2Px(context, 250.0f));
                        float dip2Px = UIUtils.dip2Px(context, 50.0f);
                        float dip2Px2 = UIUtils.dip2Px(context, 250.0f);
                        aj d2 = vEVideoPublishEditFragment.f82763d.q.d();
                        int i3 = d2.f77891b;
                        int i4 = d2.f77890a;
                        if (i3 > i4) {
                            int i5 = ((width / 2) * i3) / i4;
                            if (i5 >= e2) {
                                i5 = e2;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) i3, (float) i5});
                            ofFloat.setDuration(300);
                            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                            AnonymousClass10 r11 = new ValueAnimator.AnimatorUpdateListener(i4, i3, width, height, dip2Px2) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f82768a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ int f82769b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ int f82770c;

                                /* renamed from: d  reason: collision with root package name */
                                final /* synthetic */ int f82771d;

                                /* renamed from: e  reason: collision with root package name */
                                final /* synthetic */ int f82772e;

                                /* renamed from: f  reason: collision with root package name */
                                final /* synthetic */ float f82773f;

                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f82768a, false, 92083, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f82768a, false, 92083, new Class[]{ValueAnimator.class}, Void.TYPE);
                                        return;
                                    }
                                    float animatedFraction = valueAnimator.getAnimatedFraction();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    float f2 = (((float) this.f82769b) * floatValue) / ((float) this.f82770c);
                                    int i = (int) ((((float) this.f82771d) - f2) / 2.0f);
                                    int i2 = (int) (((((float) this.f82772e) - (this.f82773f * animatedFraction)) - floatValue) / 2.0f);
                                    int i3 = (int) f2;
                                    int i4 = (int) floatValue;
                                    VEVideoPublishEditFragment.this.f82763d.q.a(i, i2, i3, i4);
                                    VEVideoPublishEditFragment.this.a(i, i2, i3, i4);
                                    VEVideoPublishEditFragment.this.a((floatValue * 1.0f) / ((float) this.f82770c), i, i2);
                                }

                                {
                                    this.f82769b = r2;
                                    this.f82770c = r3;
                                    this.f82771d = r4;
                                    this.f82772e = r5;
                                    this.f82773f = r6;
                                }
                            };
                            ofFloat.addUpdateListener(r11);
                            ofFloat.start();
                        } else {
                            int i6 = height;
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, ((float) e2) / ((float) i6)});
                            ofFloat2.setDuration(300);
                            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                            AnonymousClass2 r112 = new ValueAnimator.AnimatorUpdateListener(width, i3, i4, i6, dip2Px2, dip2Px) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f82774a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ int f82775b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ int f82776c;

                                /* renamed from: d  reason: collision with root package name */
                                final /* synthetic */ int f82777d;

                                /* renamed from: e  reason: collision with root package name */
                                final /* synthetic */ int f82778e;

                                /* renamed from: f  reason: collision with root package name */
                                final /* synthetic */ float f82779f;
                                final /* synthetic */ float g;

                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f82774a, false, 92069, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f82774a, false, 92069, new Class[]{ValueAnimator.class}, Void.TYPE);
                                        return;
                                    }
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    float animatedFraction = valueAnimator.getAnimatedFraction();
                                    float f2 = floatValue * ((float) this.f82775b);
                                    float f3 = (((float) this.f82776c) * f2) / ((float) this.f82777d);
                                    int i = (int) ((((float) this.f82775b) - f2) / 2.0f);
                                    int i2 = (int) (((((float) this.f82778e) - ((this.f82779f - this.g) * animatedFraction)) - f3) / 2.0f);
                                    int i3 = (int) f2;
                                    int i4 = (int) f3;
                                    VEVideoPublishEditFragment.this.f82763d.q.a(i, i2, i3, i4);
                                    VEVideoPublishEditFragment.this.a(i, i2, i3, i4);
                                    VEVideoPublishEditFragment.this.a((f3 * 1.0f) / ((float) this.f82776c), i, i2);
                                }

                                {
                                    this.f82775b = r2;
                                    this.f82776c = r3;
                                    this.f82777d = r4;
                                    this.f82778e = r5;
                                    this.f82779f = r6;
                                    this.g = r7;
                                }
                            };
                            ofFloat2.addUpdateListener(r112);
                            ofFloat2.start();
                        }
                        vEVideoPublishEditFragment.f82763d.q.a(false);
                    }
                } else if (vVar.f83072b == 0) {
                    VEVideoPublishEditFragment vEVideoPublishEditFragment3 = VEVideoPublishEditFragment.this;
                    int i7 = vVar.f83073c;
                    Object[] objArr2 = {Integer.valueOf(i7)};
                    ChangeQuickRedirect changeQuickRedirect2 = VEVideoPublishEditFragment.f82760a;
                    Class[] clsArr2 = {Integer.TYPE};
                    int i8 = i7;
                    if (PatchProxy.isSupport(objArr2, vEVideoPublishEditFragment3, changeQuickRedirect2, false, 92049, clsArr2, Void.TYPE)) {
                        VEVideoPublishEditFragment vEVideoPublishEditFragment4 = vEVideoPublishEditFragment3;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i8)}, vEVideoPublishEditFragment4, VEVideoPublishEditFragment.f82760a, false, 92049, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else {
                        Context context2 = vEVideoPublishEditFragment3.getView().getContext();
                        int height2 = vEVideoPublishEditFragment3.getView().getHeight();
                        int width2 = vEVideoPublishEditFragment3.getView().getWidth();
                        int e3 = (int) (((float) fc.e(context2)) - UIUtils.dip2Px(context2, 250.0f));
                        float dip2Px3 = UIUtils.dip2Px(context2, 50.0f);
                        float dip2Px4 = UIUtils.dip2Px(context2, 250.0f);
                        aj d3 = vEVideoPublishEditFragment3.f82763d.q.d();
                        int i9 = d3.f77891b;
                        int i10 = d3.f77890a;
                        if (i9 > i10) {
                            int i11 = width2 / 2;
                            if ((i11 * height2) / width2 < e3) {
                                e3 = (i11 * i9) / i10;
                            }
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{(float) e3, (float) i9});
                            ofFloat3.setDuration(300);
                            ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                            AnonymousClass3 r113 = new ValueAnimator.AnimatorUpdateListener(i10, i9, width2, height2, dip2Px4) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f82780a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ int f82781b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ int f82782c;

                                /* renamed from: d  reason: collision with root package name */
                                final /* synthetic */ int f82783d;

                                /* renamed from: e  reason: collision with root package name */
                                final /* synthetic */ int f82784e;

                                /* renamed from: f  reason: collision with root package name */
                                final /* synthetic */ float f82785f;

                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f82780a, false, 92076, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f82780a, false, 92076, new Class[]{ValueAnimator.class}, Void.TYPE);
                                        return;
                                    }
                                    float animatedFraction = valueAnimator.getAnimatedFraction();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    float f2 = (((float) this.f82781b) * floatValue) / ((float) this.f82782c);
                                    int i = (int) ((((float) this.f82783d) - f2) / 2.0f);
                                    int i2 = (int) (((((float) this.f82784e) - (this.f82785f * (1.0f - animatedFraction))) - floatValue) / 2.0f);
                                    int i3 = (int) f2;
                                    int i4 = (int) floatValue;
                                    VEVideoPublishEditFragment.this.f82763d.q.a(i, i2, i3, i4);
                                    VEVideoPublishEditFragment.this.a(i, i2, i3, i4);
                                    VEVideoPublishEditFragment.this.a((floatValue * 1.0f) / ((float) this.f82782c), i, i2);
                                }

                                {
                                    this.f82781b = r2;
                                    this.f82782c = r3;
                                    this.f82783d = r4;
                                    this.f82784e = r5;
                                    this.f82785f = r6;
                                }
                            };
                            ofFloat3.addUpdateListener(r113);
                            ofFloat3.addListener(new AnimatorListenerAdapter(i8) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f82786a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ int f82787b;

                                public final void onAnimationEnd(Animator animator) {
                                    if (PatchProxy.isSupport(new Object[]{animator}, this, f82786a, false, 92077, new Class[]{Animator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{animator}, this, f82786a, false, 92077, new Class[]{Animator.class}, Void.TYPE);
                                        return;
                                    }
                                    VEVideoPublishEditFragment.this.f82763d.q.b(this.f82787b);
                                    VEVideoPublishEditFragment.this.f82763d.p.a(false);
                                }

                                {
                                    this.f82787b = r2;
                                }
                            });
                            ofFloat3.start();
                        } else {
                            int i12 = height2;
                            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{((float) e3) / ((float) i12), 1.0f});
                            ofFloat4.setDuration(300);
                            ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                            AnonymousClass5 r114 = new ValueAnimator.AnimatorUpdateListener(width2, i9, i10, i12, dip2Px4, dip2Px3) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f82789a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ int f82790b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ int f82791c;

                                /* renamed from: d  reason: collision with root package name */
                                final /* synthetic */ int f82792d;

                                /* renamed from: e  reason: collision with root package name */
                                final /* synthetic */ int f82793e;

                                /* renamed from: f  reason: collision with root package name */
                                final /* synthetic */ float f82794f;
                                final /* synthetic */ float g;

                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f82789a, false, 92078, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f82789a, false, 92078, new Class[]{ValueAnimator.class}, Void.TYPE);
                                        return;
                                    }
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    float animatedFraction = valueAnimator.getAnimatedFraction();
                                    float f2 = floatValue * ((float) this.f82790b);
                                    float f3 = (((float) this.f82791c) * f2) / ((float) this.f82792d);
                                    int i = (int) ((((float) this.f82790b) - f2) / 2.0f);
                                    int i2 = (int) (((((float) this.f82793e) - ((this.f82794f - this.g) * (1.0f - animatedFraction))) - f3) / 2.0f);
                                    int i3 = (int) f2;
                                    int i4 = (int) f3;
                                    VEVideoPublishEditFragment.this.f82763d.q.a(i, i2, i3, i4);
                                    VEVideoPublishEditFragment.this.a(i, i2, i3, i4);
                                    VEVideoPublishEditFragment.this.a((f3 * 1.0f) / ((float) this.f82791c), i, i2);
                                }

                                {
                                    this.f82790b = r2;
                                    this.f82791c = r3;
                                    this.f82792d = r4;
                                    this.f82793e = r5;
                                    this.f82794f = r6;
                                    this.g = r7;
                                }
                            };
                            ofFloat4.addUpdateListener(r114);
                            ofFloat4.addListener(new AnimatorListenerAdapter(i8) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f82795a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ int f82796b;

                                public final void onAnimationEnd(Animator animator) {
                                    if (PatchProxy.isSupport(new Object[]{animator}, this, f82795a, false, 92079, new Class[]{Animator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{animator}, this, f82795a, false, 92079, new Class[]{Animator.class}, Void.TYPE);
                                        return;
                                    }
                                    VEVideoPublishEditFragment.this.f82763d.q.b(this.f82796b);
                                    VEVideoPublishEditFragment.this.f82763d.p.a(false);
                                }

                                {
                                    this.f82796b = r2;
                                }
                            });
                            ofFloat4.start();
                        }
                        vEVideoPublishEditFragment3.f82763d.q.a(true);
                    }
                }
                if (VEVideoPublishEditFragment.this.f82764e != null) {
                    VEVideoPublishEditFragment.this.f82764e.a(vVar);
                }
            }
        });
        this.f82761b.observe(this, new d());
        this.f82762c.observe(this, new z(this));
        this.f82762c.observe(this, new d());
    }

    public void onAttach(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f82760a, false, 92040, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f82760a, false, 92040, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        if (context2 instanceof a) {
            this.l = (a) context2;
        }
    }

    public static IllegalStateException a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, f82760a, true, 92042, new Class[]{Integer.TYPE}, IllegalStateException.class)) {
            return (IllegalStateException) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, f82760a, true, 92042, new Class[]{Integer.TYPE}, IllegalStateException.class);
        }
        return new IllegalStateException("Seek failed. ret = " + i2 + " See logs for more details.");
    }

    private void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f82760a, false, 92050, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f82760a, false, 92050, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        Iterator it2 = this.i.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).animate().translationY(f3).setDuration(300).start();
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f82760a, false, 92045, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f82760a, false, 92045, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Context context = getContext();
        if (PatchProxy.isSupport(new Object[]{context}, this, f82760a, false, 92043, new Class[]{Context.class}, FrameLayout.class)) {
            return (FrameLayout) PatchProxy.accessDispatch(new Object[]{context}, this, f82760a, false, 92043, new Class[]{Context.class}, FrameLayout.class);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f82765f = new SurfaceView(context);
        this.f82765f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this.f82765f);
        this.g = new ImageView(context);
        this.g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this.g);
        this.g.setScaleType(ImageView.ScaleType.FIT_XY);
        return frameLayout;
    }

    public final void a(float f2, int i2, int i3) {
        float f3 = f2;
        int i4 = i3;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f82760a, false, 92051, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f82760a, false, 92051, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.m == Integer.MAX_VALUE) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(1.0f)}, null, com.ss.android.ugc.aweme.shortvideo.util.y.f71219a, true, 80984, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(1.0f)}, null, com.ss.android.ugc.aweme.shortvideo.util.y.f71219a, true, 80984, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (Float.isNaN(f2) || Float.isNaN(1.0f) ? !(!Float.isNaN(f2) || !Float.isNaN(1.0f)) : Math.abs(1.0f - f3) < 1.0E-5f) {
                z = true;
            }
            if (z) {
                this.m = i4;
            }
        }
        Iterator it2 = this.i.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(f3);
            view.setScaleY(f3);
            view.setTranslationX((float) i2);
            view.setTranslationY(((float) (i4 - this.m)) + this.h);
        }
    }

    private void a(boolean z, final int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f82760a, false, 92057, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f82760a, false, 92057, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        float f2 = (float) i3;
        float f3 = (float) i4;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f2, f3);
        translateAnimation.setDuration(300);
        translateAnimation.setFillAfter(true);
        if (z) {
            int i5 = i2;
            translateAnimation.setAnimationListener(new Animation.AnimationListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f82804a;

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f82804a, false, 92082, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f82804a, false, 92082, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    VEVideoPublishEditFragment.this.f82763d.q.b(i2);
                    VEVideoPublishEditFragment.this.f82763d.p.a(false);
                }
            });
        }
        getView().startAnimation(translateAnimation);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f3});
        ofFloat.addUpdateListener(new ac(this));
        ofFloat.start();
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f82760a, false, 92044, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f82760a, false, 92044, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        layoutParams.width = i4;
        layoutParams.height = i5;
        this.g.setLayoutParams(layoutParams);
    }
}
