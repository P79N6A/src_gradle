package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.music.b.a.a;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.ak;
import com.ss.android.ugc.aweme.shortvideo.cut.model.ScrollInterceptedLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.cut.model.c;
import com.ss.android.ugc.aweme.shortvideo.cut.model.d;
import com.ss.android.ugc.aweme.shortvideo.cut.model.e;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import com.ss.android.ugc.aweme.shortvideo.util.ap;
import com.ss.android.ugc.aweme.shortvideo.widget.n;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.aweme.themechange.base.b;
import com.ss.android.ugc.aweme.tools.R$styleable;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.vesdk.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class VideoEditView extends FrameLayout implements View.OnTouchListener {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f66542c;
    private View A;
    private View B;
    private View C;
    private View D;
    private View E;
    private float F;
    private float G;
    private float H;
    private boolean I;
    private boolean J;
    private long K;
    private d L;
    private e M;
    @PointerType
    private int N;
    @CoverType
    private int O;
    @ColorInt
    private int P;
    private boolean Q;
    private boolean R;
    private p S;
    private MutableLiveData<Bitmap> T;
    private MutableLiveData<Boolean> U;
    private boolean V;
    private boolean W;

    /* renamed from: a  reason: collision with root package name */
    private boolean f66543a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private boolean aj;
    private int ak;
    private RecyclerView.OnScrollListener al;

    /* renamed from: b  reason: collision with root package name */
    private float f66544b;

    /* renamed from: d  reason: collision with root package name */
    FragmentActivity f66545d;

    /* renamed from: e  reason: collision with root package name */
    VideoEditViewModel f66546e;

    /* renamed from: f  reason: collision with root package name */
    CutMultiVideoViewModel f66547f;
    @BindView(2131493188)
    FrameLayout frameContainer;
    @BindView(2131493189)
    MVRecycleView frameRecyclerView;
    protected RTLImageView g;
    protected RTLImageView h;
    protected TextView i;
    protected TextView j;
    protected FrameLayout.LayoutParams k;
    protected FrameLayout.LayoutParams l;
    protected boolean m;
    @BindView(2131493037)
    ImageView mCurPointer;
    @BindView(2131493038)
    RTLLinearLayout mCurPointerContainer;
    protected c n;
    FramesAdapter o;
    FramesAdapter p;
    public n q;
    protected float r;
    @BindView(2131493025)
    View recyleBorderView;
    protected float s;
    @BindView(2131493676)
    MVRecycleView singleFrameRecyclerView;
    public int t;
    protected int u;
    protected int v;
    protected int w;
    private int x;
    private long y;
    private long z;

    public @interface CoverType {
    }

    public @interface PointerType {
    }

    public int getEditState() {
        return this.u;
    }

    public View getEndSlide() {
        return this.g;
    }

    public long getMinVideoLength() {
        return this.y;
    }

    public int getOverXScroll() {
        return this.t;
    }

    public View getStartSlide() {
        return this.h;
    }

    public VideoEditViewModel getVideoEditViewModel() {
        return this.f66546e;
    }

    public final boolean a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, String str) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        CutMultiVideoViewModel cutMultiVideoViewModel2 = cutMultiVideoViewModel;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, cutMultiVideoViewModel2, str2}, this, f66542c, false, 75901, new Class[]{FragmentActivity.class, CutMultiVideoViewModel.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fragmentActivity2, cutMultiVideoViewModel2, str2}, this, f66542c, false, 75901, new Class[]{FragmentActivity.class, CutMultiVideoViewModel.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        this.f66547f = cutMultiVideoViewModel2;
        a a2 = a(str2, cutMultiVideoViewModel2);
        if (a2 == null) {
            return false;
        }
        return a(fragmentActivity2, cutMultiVideoViewModel2, Collections.singletonList(a2));
    }

    public final boolean a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<a> list) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        CutMultiVideoViewModel cutMultiVideoViewModel2 = cutMultiVideoViewModel;
        List<a> list2 = list;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, cutMultiVideoViewModel2, list2}, this, f66542c, false, 75903, new Class[]{FragmentActivity.class, CutMultiVideoViewModel.class, List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fragmentActivity2, cutMultiVideoViewModel2, list2}, this, f66542c, false, 75903, new Class[]{FragmentActivity.class, CutMultiVideoViewModel.class, List.class}, Boolean.TYPE)).booleanValue();
        }
        this.f66545d = fragmentActivity2;
        if (list.size() > 1) {
            i2 = 1;
        }
        this.u = i2;
        this.f66547f = cutMultiVideoViewModel2;
        this.f66546e = (VideoEditViewModel) ViewModelProviders.of(fragmentActivity).get(VideoEditViewModel.class);
        a(cutMultiVideoViewModel2, list2);
        l();
        return true;
    }

    private void a(CutMultiVideoViewModel cutMultiVideoViewModel, List<a> list) {
        CutMultiVideoViewModel cutMultiVideoViewModel2 = cutMultiVideoViewModel;
        List<a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{cutMultiVideoViewModel2, list2}, this, f66542c, false, 75905, new Class[]{CutMultiVideoViewModel.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cutMultiVideoViewModel2, list2}, this, f66542c, false, 75905, new Class[]{CutMultiVideoViewModel.class, List.class}, Void.TYPE);
            return;
        }
        if (cutMultiVideoViewModel2.m) {
            for (a next : list) {
                next.h = (long) cutMultiVideoViewModel2.n;
                next.l = 720;
                next.m = 1280;
            }
        }
        this.f66546e.a(list2);
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75908, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75908, new Class[0], Void.TYPE);
            return;
        }
        this.f66547f.f66182d.observe(this.f66545d, new c(this));
        this.f66547f.f66184f.observe(this.f66545d, new d(this));
        this.f66547f.g.observe(this.f66545d, new e(this));
        this.f66547f.h.observe(this.f66545d, new f(this));
        this.f66547f.i.observe(this.f66545d, new g(this));
        this.f66547f.j.observe(this.f66545d, new h(this));
        this.f66547f.k.observe(this.f66545d, new i(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Long l2) {
        this.K = l2.longValue();
        int i2 = this.u;
        long j2 = this.K;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j2)}, this, f66542c, false, 75953, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j2)}, this, f66542c, false, 75953, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE);
        } else if (!this.m && j2 != -1 && j2 != 1) {
            float f2 = 0.0f;
            if (i2 == 1) {
                f2 = this.n.a(this.f66546e.c(), j2, this.f66546e.d()) - this.r;
            } else if (i2 == 2 || i2 == 0) {
                f2 = ((((float) j2) * 1.0f) / (this.M.f66488d * this.n.f66481f)) - this.r;
            }
            a(this.h.getStartX() + f2, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Float f2) {
        float floatValue = f2.floatValue();
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(floatValue)}, this, f66542c, false, 75914, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(floatValue)}, this, f66542c, false, 75914, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.u == 1) {
            VideoEditViewModel videoEditViewModel = this.f66546e;
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(floatValue)}, videoEditViewModel, VideoEditViewModel.f66560a, false, 76000, new Class[]{Float.TYPE}, Void.TYPE)) {
                VideoEditViewModel videoEditViewModel2 = videoEditViewModel;
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(floatValue)}, videoEditViewModel2, VideoEditViewModel.f66560a, false, 76000, new Class[]{Float.TYPE}, Void.TYPE);
            } else {
                ((com.ss.android.ugc.aweme.shortvideo.cut.model.a) videoEditViewModel.r.getValue()).totalSpeed = floatValue;
            }
        } else {
            this.M.f66488d = floatValue;
            if (this.u == 0) {
                this.f66546e.a(this.M, 0);
            }
        }
        if (this.u == 1) {
            this.n.a(this.f66546e.c(), this.f66546e.d());
            this.o.a((LifecycleOwner) this.f66545d, this.n.f66478c, this.u, true);
            this.frameRecyclerView.scrollToPosition(0);
        } else {
            this.n.a(((h) this.f66546e.c().get(this.v)).f66496c, ((h) this.f66546e.c().get(this.v)).f66495b, this.M.f66488d, this.u);
            this.p.a((LifecycleOwner) this.f66545d, this.n.f66478c, (h) this.f66546e.c().get(this.v), true);
            this.singleFrameRecyclerView.scrollToPosition(0);
        }
        a((float) this.ak, (float) ((this.x - this.ak) - ak.f66359e), 0);
        v();
        if (this.u == 0) {
            this.n.a(((h) this.f66546e.c().get(this.v)).f66495b, this.M.f66488d);
        }
        VideoEditViewModel videoEditViewModel3 = this.f66546e;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(floatValue)}, videoEditViewModel3, VideoEditViewModel.f66560a, false, 75987, new Class[]{Float.TYPE}, Void.TYPE)) {
            VideoEditViewModel videoEditViewModel4 = videoEditViewModel3;
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(floatValue)}, videoEditViewModel4, VideoEditViewModel.f66560a, false, 75987, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        videoEditViewModel3.m.setValue(Float.valueOf(floatValue));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f66542c, false, 75909, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, f66542c, false, 75909, new Class[]{h.class}, Void.TYPE);
            return;
        }
        this.u = 1;
        this.f66546e.a(1);
        if (this.M != null) {
            this.M.a();
        }
        if (this.L != null) {
            this.L.a();
        }
        VideoEditViewModel videoEditViewModel = this.f66546e;
        String str = hVar2.f66495b;
        if (!PatchProxy.isSupport(new Object[]{str}, videoEditViewModel, VideoEditViewModel.f66560a, false, 76003, new Class[]{String.class}, Void.TYPE)) {
            Iterator it2 = ((com.ss.android.ugc.aweme.shortvideo.cut.model.a) videoEditViewModel.r.getValue()).getVideoSegmentList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                h hVar3 = (h) it2.next();
                if (hVar3.f66495b.equals(str)) {
                    hVar3.j = true;
                    break;
                }
            }
        } else {
            VideoEditViewModel videoEditViewModel2 = videoEditViewModel;
            PatchProxy.accessDispatch(new Object[]{str}, videoEditViewModel2, VideoEditViewModel.f66560a, false, 76003, new Class[]{String.class}, Void.TYPE);
        }
        this.n.a(this.f66546e.c(), this.f66546e.d());
        a((float) this.ak, (float) ((this.x - this.ak) - ak.f66359e), 0);
        this.singleFrameRecyclerView.setVisibility(8);
        this.p.a();
        this.frameRecyclerView.setVisibility(0);
        this.frameRecyclerView.scrollToPosition(0);
        FramesAdapter framesAdapter = this.o;
        FragmentActivity fragmentActivity = this.f66545d;
        HashMap<String, Float> hashMap = this.n.f66478c;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, hVar2, hashMap}, framesAdapter, FramesAdapter.f66522a, false, 75875, new Class[]{LifecycleOwner.class, h.class, HashMap.class}, Void.TYPE)) {
            FramesAdapter framesAdapter2 = framesAdapter;
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, hVar2, hashMap}, framesAdapter2, FramesAdapter.f66522a, false, 75875, new Class[]{LifecycleOwner.class, h.class, HashMap.class}, Void.TYPE);
        } else if (!Lists.isEmpty(framesAdapter.g)) {
            framesAdapter.g.remove(hVar2);
            framesAdapter.a(hashMap);
        }
        VideoEditViewModel videoEditViewModel3 = this.f66546e;
        if (PatchProxy.isSupport(new Object[]{hVar2}, videoEditViewModel3, VideoEditViewModel.f66560a, false, 75991, new Class[]{h.class}, Void.TYPE)) {
            VideoEditViewModel videoEditViewModel4 = videoEditViewModel3;
            PatchProxy.accessDispatch(new Object[]{hVar2}, videoEditViewModel4, VideoEditViewModel.f66560a, false, 75991, new Class[]{h.class}, Void.TYPE);
            return;
        }
        videoEditViewModel3.q.setValue(hVar2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Pair pair) {
        float f2;
        Pair pair2 = pair;
        if (PatchProxy.isSupport(new Object[]{pair2}, this, f66542c, false, 75915, new Class[]{Pair.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pair2}, this, f66542c, false, 75915, new Class[]{Pair.class}, Void.TYPE);
            return;
        }
        this.u = 2;
        this.f66546e.a(2);
        this.w = ((Integer) pair2.first).intValue();
        this.v = ((Integer) pair2.second).intValue();
        h hVar = (h) this.f66546e.c().get(this.v);
        if (this.M == null) {
            this.M = new e(hVar);
        } else {
            this.M.a(hVar);
        }
        this.n.a(hVar.f66496c, hVar.f66495b, this.f66546e.c(this.v).f66499f, this.u);
        this.frameRecyclerView.setVisibility(8);
        this.o.a();
        this.singleFrameRecyclerView.setVisibility(0);
        this.singleFrameRecyclerView.scrollToPosition(0);
        this.p.a((LifecycleOwner) this.f66545d, this.n.f66478c, hVar, false);
        this.singleFrameRecyclerView.smoothScrollBy(this.f66546e.b(this.v), 0);
        d dVar = this.L;
        float startSlideX = getStartSlideX();
        float endSlideX = getEndSlideX();
        int overXScroll = getOverXScroll();
        dVar.f66482a = startSlideX;
        dVar.f66483b = endSlideX;
        dVar.f66484c = overXScroll;
        c cVar = this.n;
        h c2 = this.f66546e.c(this.v);
        int b2 = this.f66546e.b(this.v);
        float f3 = (((((float) c2.f66497d) * 1.0f) / (c2.f66499f * cVar.f66481f)) + ((float) this.ak)) - ((float) b2);
        FragmentActivity fragmentActivity = this.f66545d;
        c cVar2 = this.n;
        h c3 = this.f66546e.c(this.v);
        int i2 = this.ak;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, cVar2, Float.valueOf(f3), c3, Integer.valueOf(i2)}, null, ak.f66355a, true, 75513, new Class[]{Context.class, c.class, Float.TYPE, h.class, Integer.TYPE}, Float.TYPE)) {
            Object[] objArr = {fragmentActivity, cVar2, Float.valueOf(f3), c3, Integer.valueOf(i2)};
            Object[] objArr2 = objArr;
            f2 = ((Float) PatchProxy.accessDispatch(objArr2, null, ak.f66355a, true, 75513, new Class[]{Context.class, c.class, Float.TYPE, h.class, Integer.TYPE}, Float.TYPE)).floatValue();
        } else if (c3.f66498e - c3.f66497d == c3.f66496c) {
            f2 = (float) ((com.ss.android.ugc.aweme.base.utils.p.b(fragmentActivity) - i2) - ak.f66359e);
        } else {
            f2 = ((float) ak.f66359e) + f3 + (((float) (c3.f66498e - c3.f66497d)) / (c3.f66499f * cVar2.f66481f));
        }
        a(f3, f2, 0);
        VideoEditViewModel videoEditViewModel = this.f66546e;
        if (PatchProxy.isSupport(new Object[]{pair2}, videoEditViewModel, VideoEditViewModel.f66560a, false, 75988, new Class[]{Pair.class}, Void.TYPE)) {
            VideoEditViewModel videoEditViewModel2 = videoEditViewModel;
            PatchProxy.accessDispatch(new Object[]{pair2}, videoEditViewModel2, VideoEditViewModel.f66560a, false, 75988, new Class[]{Pair.class}, Void.TYPE);
            return;
        }
        videoEditViewModel.n.setValue(pair2);
    }

    public final boolean a(int i2, int i3, int i4) {
        float f2;
        int i5 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), 0}, this, f66542c, false, 75916, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), 0}, this, f66542c, false, 75916, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT < 19 || !this.h.isLaidOut() || this.h.getLeft() == 0) {
            return false;
        } else {
            if (this.f66543a) {
                h hVar = (h) this.f66546e.c().get(this.v);
                if (this.M == null) {
                    this.M = new e(hVar);
                } else {
                    this.M.a(hVar);
                }
                this.n.a(hVar.f66496c, hVar.f66495b, this.f66546e.c(this.v).f66499f, this.u);
            }
            this.f66546e.a(this.v, 0);
            this.singleFrameRecyclerView.scrollToPosition(0);
            this.singleFrameRecyclerView.smoothScrollBy(0, 0);
            h c2 = this.f66546e.c(this.v);
            float f3 = (((((float) i5) * 1.0f) / (c2.f66499f * this.n.f66481f)) + ((float) this.ak)) - 0.0f;
            int i6 = i3 - i5;
            if (((long) i6) == c2.f66496c) {
                f2 = (float) ((com.ss.android.ugc.aweme.base.utils.p.b(this.f66545d) - this.ak) - ak.f66359e);
            } else {
                f2 = ((float) ak.f66359e) + f3 + (((float) i6) / (c2.f66499f * this.n.f66481f));
            }
            a(f3, f2, 0);
            setCurPointerContainerStartX((float) (this.ak + ak.f66359e));
            return true;
        }
    }

    public final void a(float f2, boolean z2) {
        float f3;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66542c, false, 75948, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Byte.valueOf(z2)}, this, f66542c, false, 75948, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.N == 2) {
            f3 = Math.min(Math.max((float) (this.ak + ak.f66359e), f2), (float) (((this.x - this.ak) - ak.f66359e) - ak.f66360f));
        } else {
            f3 = f2 < this.h.getStartX() + ((float) ak.f66359e) ? this.h.getStartX() + ((float) ak.f66359e) : f2;
            if (f3 > this.g.getStartX() - ((float) this.mCurPointer.getWidth())) {
                f3 = this.g.getStartX() - ((float) this.mCurPointer.getWidth());
            }
        }
        setCurPointerContainerStartX(f3);
        this.f66546e.a(this.s);
        if (z2) {
            if (this.u == 2) {
                this.f66546e.a(getSinglePlayingPosition());
                return;
            }
            this.f66546e.a(getMultiPlayingPosition());
        }
    }

    public final void a(final boolean z2, boolean z3, com.ss.android.ugc.aweme.base.a<Void> aVar) {
        boolean z4 = z2;
        final com.ss.android.ugc.aweme.base.a<Void> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), (byte) 1, aVar2}, this, f66542c, false, 75958, new Class[]{Boolean.TYPE, Boolean.TYPE, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), (byte) 1, aVar2}, this, f66542c, false, 75958, new Class[]{Boolean.TYPE, Boolean.TYPE, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE);
            return;
        }
        AlphaAnimation alphaAnimation = z4 ? new AlphaAnimation(0.0f, 1.0f) : new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200);
        if (this.h != null) {
            this.h.startAnimation(alphaAnimation);
        }
        if (this.g != null) {
            this.g.startAnimation(alphaAnimation);
        }
        if (this.A != null) {
            this.A.startAnimation(alphaAnimation);
        }
        if (this.B != null) {
            this.B.startAnimation(alphaAnimation);
        }
        if (this.E != null) {
            this.E.startAnimation(alphaAnimation);
        }
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66556a;

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f66556a, false, 75973, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f66556a, false, 75973, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                if (z2) {
                    VideoEditView.this.b(true);
                }
            }

            public final void onAnimationEnd(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f66556a, false, 75974, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f66556a, false, 75974, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                if (!z2) {
                    VideoEditView.this.b(false);
                }
                if (aVar2 != null) {
                    aVar2.run(null);
                }
            }
        });
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f66542c, false, 75959, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f66542c, false, 75959, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        long j2 = (long) i2;
        setMaxVideoLength(j2);
        List c2 = this.f66546e.c();
        if (!Lists.isEmpty(c2)) {
            h hVar = (h) c2.get(0);
            hVar.f66496c = j2;
            hVar.f66498e = j2;
        }
        this.n.i = j2;
        this.n.a(this.f66546e.c(), this.f66546e.d());
        this.f66543a = true;
    }

    public long getMaxCutDuration() {
        return this.n.g;
    }

    public RecyclerView getCurrentFrameRecyclerView() {
        if (this.u == 0) {
            return this.singleFrameRecyclerView;
        }
        return this.frameRecyclerView;
    }

    public float getSelectedTime() {
        return (this.s * this.n.f66481f) / 1000.0f;
    }

    public long getSingleSeekTime() {
        return (long) ((this.r + ((float) ak.f66359e)) * this.n.f66481f);
    }

    public int getCurrentRotate() {
        if (this.u == 2 || this.u == 0) {
            return this.M.f66487c;
        }
        return 0;
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75941, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75941, new Class[0], Void.TYPE);
        } else if (this.O == 1) {
            t();
        } else {
            s();
        }
    }

    private void u() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75954, new Class[0], Void.TYPE);
        } else if (!this.J) {
            this.J = true;
            ak.a((Context) this.f66545d);
        }
    }

    public float getEndSlideX() {
        if (!PatchProxy.isSupport(new Object[0], this, f66542c, false, 75918, new Class[0], Float.TYPE)) {
            return this.g.getStartX();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75918, new Class[0], Float.TYPE)).floatValue();
    }

    public Pair<Long, Long> getPlayBoundary() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75921, new Class[0], Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75921, new Class[0], Pair.class);
        } else if (this.u == 1) {
            return getMultiVideoPlayBoundary();
        } else {
            return getSingleVideoPlayBoundary();
        }
    }

    public long getSeekTime() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75922, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75922, new Class[0], Long.TYPE)).longValue();
        } else if (this.u == 1) {
            return getMultiSeekTime();
        } else {
            return getSingleSeekTime();
        }
    }

    public float getStartSlideX() {
        if (!PatchProxy.isSupport(new Object[0], this, f66542c, false, 75917, new Class[0], Float.TYPE)) {
            return this.h.getStartX();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75917, new Class[0], Float.TYPE)).floatValue();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        this.M.f66487c += 90;
        if (this.M.f66487c >= 360) {
            this.M.f66487c = 0;
        }
        if (this.u == 0) {
            this.f66546e.a(this.M, 0);
        }
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75907, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
    }

    private void l() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75906, new Class[0], Void.TYPE);
            return;
        }
        this.x = com.ss.android.ugc.aweme.base.utils.p.b(this.f66545d);
        this.w = 0;
        this.v = 0;
        this.n = new c(this.f66546e.c(), ak.b(this.f66545d, this.ak));
        this.n.i = this.z;
        this.n.j = this.y;
        ButterKnife.bind((Object) this, View.inflate(this.f66545d, C0906R.layout.apv, this));
        m();
        q();
        p();
        a();
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75926, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75926, new Class[0], Void.TYPE);
            return;
        }
        if (this.u == 1) {
            this.L = new d();
        } else {
            this.M = new e((h) this.f66546e.c().get(0));
        }
        this.n.a(this.f66546e.c(), this.f66546e.d());
        this.s = (float) ((this.x - (this.ak * 2)) - (ak.f66359e * 2));
        this.r = (float) (-ak.f66359e);
    }

    private void o() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75934, new Class[0], Void.TYPE);
        } else if (this.E != null) {
            int startX = (int) (this.h.getStartX() + ((float) ak.f66359e));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.s, this.ad);
            layoutParams.topMargin = this.ag;
            layoutParams.leftMargin = startX;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(startX);
            }
            this.E.setLayoutParams(layoutParams);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75910, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75910, new Class[0], Void.TYPE);
            return;
        }
        this.n.a(this.f66546e.c(), this.f66546e.d());
        a((float) this.ak, (float) ((this.x - this.ak) - ak.f66359e), 0);
        this.frameRecyclerView.scrollToPosition(0);
        ArrayList arrayList = new ArrayList();
        for (h hVar : this.f66546e.c()) {
            if (!hVar.j) {
                arrayList.add(hVar);
            }
        }
        this.o.a((List<h>) arrayList);
    }

    public final void f() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75933, new Class[0], Void.TYPE);
        } else if (this.C != null) {
            float startX = this.h.getStartX();
            int i3 = (this.ak + ak.f66359e) - this.t;
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = (int) (startX - ((float) i3));
            if (i4 >= 0) {
                i2 = i4;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, this.ad);
            layoutParams.topMargin = this.ag;
            layoutParams.leftMargin = i3;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(i3);
            }
            layoutParams.gravity = 8388611;
            this.C.setLayoutParams(layoutParams);
        }
    }

    public final void g() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75935, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75935, new Class[0], Void.TYPE);
        } else if (this.D != null) {
            float startX = this.g.getStartX();
            int a2 = (int) ((((((float) this.n.a(this.u)) / this.n.f66481f) - this.r) - ((float) (ak.f66359e * 2))) - this.s);
            int i3 = (int) ((((float) this.x) - startX) - ((float) ak.f66359e));
            if (a2 >= i3) {
                a2 = i3;
            }
            if (a2 >= 0) {
                i2 = a2;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, this.ad);
            int i4 = i3 - i2;
            layoutParams.rightMargin = i4;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(i4);
            }
            layoutParams.topMargin = this.ag;
            layoutParams.gravity = 8388613;
            this.D.setLayoutParams(layoutParams);
        }
    }

    public float getCurrentSpeed() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75955, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75955, new Class[0], Float.TYPE)).floatValue();
        } else if (this.u == 2 || this.u == 0) {
            return this.M.f66488d;
        } else {
            return this.f66546e.d();
        }
    }

    public long getMultiPlayingPosition() {
        if (!PatchProxy.isSupport(new Object[0], this, f66542c, false, 75940, new Class[0], Long.TYPE)) {
            return this.n.a(this.f66546e.c(), ((this.r + this.mCurPointerContainer.getStartX()) - this.h.getStartX()) * this.n.f66481f, this.f66546e.d());
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75940, new Class[0], Long.TYPE)).longValue();
    }

    public long getMultiSeekTime() {
        if (!PatchProxy.isSupport(new Object[0], this, f66542c, false, 75923, new Class[0], Long.TYPE)) {
            return this.n.a(this.f66546e.c(), (this.r + ((float) ak.f66359e)) * this.n.f66481f, this.f66546e.d());
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75923, new Class[0], Long.TYPE)).longValue();
    }

    public Pair<Long, Long> getMultiVideoPlayBoundary() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75920, new Class[0], Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75920, new Class[0], Pair.class);
        }
        return Pair.create(Long.valueOf(this.n.a(this.f66546e.c(), (this.r + ((float) ak.f66359e)) * this.n.f66481f, this.f66546e.d())), Long.valueOf(this.n.a(this.f66546e.c(), (this.r + ((float) ak.f66359e) + this.s) * this.n.f66481f, this.f66546e.d())));
    }

    public long getSinglePlayingPosition() {
        if (!PatchProxy.isSupport(new Object[0], this, f66542c, false, 75939, new Class[0], Long.TYPE)) {
            return (long) (((this.r + this.mCurPointerContainer.getStartX()) - this.h.getStartX()) * this.n.f66481f * this.M.f66488d);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75939, new Class[0], Long.TYPE)).longValue();
    }

    public Pair<Long, Long> getSingleVideoPlayBoundary() {
        if (!PatchProxy.isSupport(new Object[0], this, f66542c, false, 75919, new Class[0], Pair.class)) {
            return Pair.create(Long.valueOf((long) ((this.r + ((float) ak.f66359e)) * this.n.f66481f * this.M.f66488d)), Long.valueOf((long) ((this.r + ((float) ak.f66359e) + this.s) * this.n.f66481f * this.M.f66488d)));
        }
        return (Pair) PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75919, new Class[0], Pair.class);
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75945, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75945, new Class[0], Void.TYPE);
        } else if (this.f66546e != null) {
            if (this.u == 0) {
                if (this.p != null) {
                    this.p.a(this.f66546e.c());
                }
            } else if (this.o != null) {
                this.o.a(this.f66546e.c());
            }
        }
    }

    private void n() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75928, new Class[0], Void.TYPE);
        } else if (this.V) {
            Pair<Long, Long> playBoundary = getPlayBoundary();
            long max = Math.max(0, ((Long) playBoundary.first).longValue());
            Math.min(this.z, ((Long) playBoundary.second).longValue());
            String format = String.format(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(((float) max) / 1000.0f)});
            String format2 = String.format(Locale.getDefault(), "%.1fs", new Object[]{Float.valueOf(((float) ((Long) playBoundary.second).longValue()) / 1000.0f)});
            v.a(this.j, (CharSequence) format);
            v.a(this.i, (CharSequence) format2);
            e();
        }
    }

    private void s() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75942, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75942, new Class[0], Void.TYPE);
            return;
        }
        this.C = new View(this.f66545d);
        this.D = new View(this.f66545d);
        this.P = b.f74589e.a(false, false, true, false, false);
        this.C.setBackgroundColor(this.P);
        this.D.setBackgroundColor(this.P);
        int i3 = this.t - ak.f66359e;
        if (i3 < 0) {
            i3 = 0;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, this.ad);
        layoutParams.topMargin = (int) UIUtils.dip2Px(this.f66545d, 7.0f);
        layoutParams.gravity = 8388611;
        layoutParams.leftMargin = this.ak - i3;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(this.ak - i3);
        }
        this.C.setLayoutParams(layoutParams);
        int a2 = (int) ((((((float) this.n.a(this.u)) / this.n.f66481f) - ((float) this.t)) - this.s) - ((float) ak.f66359e));
        if (a2 >= 0) {
            i2 = a2;
        }
        int i4 = this.ak;
        if (i2 >= i4) {
            i2 = i4;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, this.ad);
        layoutParams2.topMargin = (int) UIUtils.dip2Px(this.f66545d, 7.0f);
        int i5 = i4 - i2;
        layoutParams2.rightMargin = i5;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd(i5);
        }
        layoutParams2.gravity = 8388613;
        this.D.setLayoutParams(layoutParams2);
        this.frameContainer.addView(this.C);
        this.frameContainer.addView(this.D);
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75943, new Class[0], Void.TYPE);
            return;
        }
        this.E = new View(this.f66545d);
        this.E.setTag("block");
        this.E.setOnTouchListener(this);
        this.E.setBackgroundColor(this.P);
        this.E.setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.s, this.ad);
        layoutParams.topMargin = (int) UIUtils.dip2Px(this.f66545d, 7.0f);
        layoutParams.leftMargin = this.ak + ak.f66359e;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(this.ak + ak.f66359e);
        }
        this.E.setLayoutParams(layoutParams);
        this.frameContainer.addView(this.E);
        this.mCurPointerContainer.bringToFront();
    }

    private void v() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75956, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75956, new Class[0], Void.TYPE);
            return;
        }
        String format = String.format(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf((this.s * this.n.f66481f) / 1000.0f)});
        String str2 = "";
        if (!(this.mCurPointerContainer == null || this.h == null || this.f66547f.f66182d.getValue() == null)) {
            str2 = String.format(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) ((Long) this.f66547f.f66182d.getValue()).longValue()) / 1000.0f)});
        }
        if (this.f66547f.f66180b.getValue() == null) {
            str = "";
        } else {
            str = ((Pair) this.f66547f.f66180b.getValue()).toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(C0906R.string.bd9, new Object[]{format}));
        sb.append(";curPointer:");
        sb.append(str2);
        sb.append("s;Totalspeed:");
        sb.append(this.f66546e.d());
        sb.append(";mOneWidthDur:");
        sb.append(this.n.f66481f);
        sb.append("\npair:");
        sb.append(str);
        sb.append(";curOriginIndex:");
        sb.append(this.v);
        sb.append(";curEditIndex:");
        sb.append(this.w);
        sb.append("\n");
    }

    /* renamed from: c */
    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75911, new Class[0], Void.TYPE);
            return;
        }
        this.u = 1;
        this.f66546e.a(1);
        if (this.M != null) {
            this.M.a();
        }
        this.n.a(this.f66546e.c(), this.f66546e.d());
        a(this.L.f66482a, this.L.f66483b, this.L.f66484c);
        this.frameRecyclerView.setVisibility(0);
        this.p.a();
        this.singleFrameRecyclerView.setVisibility(8);
        VideoEditViewModel videoEditViewModel = this.f66546e;
        if (PatchProxy.isSupport(new Object[0], videoEditViewModel, VideoEditViewModel.f66560a, false, 75989, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], videoEditViewModel, VideoEditViewModel.f66560a, false, 75989, new Class[0], Void.TYPE);
            return;
        }
        videoEditViewModel.o.setValue(null);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75927, new Class[0], Void.TYPE);
            return;
        }
        this.s = (this.g.getStartX() - this.h.getStartX()) - ((float) ak.f66359e);
        this.r = (((float) (this.t - ak.f66359e)) + this.h.getStartX()) - ((float) this.ak);
        if (!(1 == this.u || this.M == null)) {
            Pair<Long, Long> singleVideoPlayBoundary = getSingleVideoPlayBoundary();
            this.M.f66485a = ((Long) singleVideoPlayBoundary.first).longValue();
            this.M.f66486b = ((Long) singleVideoPlayBoundary.second).longValue();
            if (this.N != 2 && this.u == 0) {
                this.f66546e.a(this.M, 0);
            }
        }
        v();
        n();
    }

    public final void e() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75929, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75929, new Class[0], Void.TYPE);
        } else if (this.V) {
            this.j.setX(a((View) this.h, (View) this.j));
            this.i.setX(a((View) this.g, (View) this.i));
            float f2 = 0.0f;
            if (Math.abs(this.j.getX() - this.i.getX()) - (((float) (this.j.getWidth() + this.i.getWidth())) / 2.0f) > 0.0f) {
                z2 = true;
            }
            if (z2) {
                f2 = 1.0f;
            }
            if (this.j.getAlpha() != f2) {
                this.j.animate().alpha(f2).setDuration(150).start();
                this.i.animate().alpha(f2).setDuration(150).start();
            }
        }
    }

    public List<String> getFinalPathes() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75924, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75924, new Class[0], List.class);
        }
        c cVar = this.n;
        List c2 = this.f66546e.c();
        float f2 = (this.r + ((float) ak.f66359e)) * this.n.f66481f;
        float f3 = (this.r + ((float) ak.f66359e) + this.s) * this.n.f66481f;
        float d2 = this.f66546e.d();
        if (PatchProxy.isSupport(new Object[]{c2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(d2)}, cVar, c.f66476a, false, 75846, new Class[]{List.class, Float.TYPE, Float.TYPE, Float.TYPE}, List.class)) {
            Object[] objArr = {c2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(d2)};
            return (List) PatchProxy.accessDispatch(objArr, cVar, c.f66476a, false, 75846, new Class[]{List.class, Float.TYPE, Float.TYPE, Float.TYPE}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < c2.size(); i2++) {
            if (!((h) c2.get(i2)).j) {
                arrayList2.add(c2.get(i2));
            }
        }
        int b2 = cVar.b(arrayList2, f3, d2);
        for (int b3 = cVar.b(arrayList2, f2, d2); b3 <= b2; b3++) {
            arrayList.add(((h) arrayList2.get(b3)).f66495b);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75912, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75912, new Class[0], Void.TYPE);
            return;
        }
        this.u = 1;
        this.f66546e.a(1);
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75913, new Class[0], Void.TYPE);
        } else {
            this.f66546e.a(this.M, this.v);
            this.f66546e.a(this.v, getOverXScroll());
            this.n.a(((h) this.f66546e.c().get(this.v)).f66495b, this.M.f66488d);
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f66547f;
            String str = ((h) this.f66546e.c().get(this.v)).f66495b;
            if (PatchProxy.isSupport(new Object[]{str}, cutMultiVideoViewModel, CutMultiVideoViewModel.f66179a, false, 75488, new Class[]{String.class}, Void.TYPE)) {
                CutMultiVideoViewModel cutMultiVideoViewModel2 = cutMultiVideoViewModel;
                PatchProxy.accessDispatch(new Object[]{str}, cutMultiVideoViewModel2, CutMultiVideoViewModel.f66179a, false, 75488, new Class[]{String.class}, Void.TYPE);
            } else {
                cutMultiVideoViewModel.f66181c.put(str, 1);
            }
        }
        if (this.L != null) {
            this.L.a();
        }
        this.n.a(this.f66546e.c(), this.f66546e.d());
        a((float) this.ak, (float) ((this.x - this.ak) - ak.f66359e), 0);
        this.frameRecyclerView.setVisibility(0);
        this.singleFrameRecyclerView.setVisibility(8);
        this.p.a();
        this.frameRecyclerView.scrollToPosition(0);
        this.o.a((LifecycleOwner) this.f66545d, this.n.f66478c, this.u, false);
        VideoEditViewModel videoEditViewModel = this.f66546e;
        if (PatchProxy.isSupport(new Object[0], videoEditViewModel, VideoEditViewModel.f66560a, false, 75990, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], videoEditViewModel, VideoEditViewModel.f66560a, false, 75990, new Class[0], Void.TYPE);
            return;
        }
        videoEditViewModel.p.setValue(null);
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75936, new Class[0], Void.TYPE);
            return;
        }
        this.h = new RTLImageView(this.f66545d);
        this.h.setScaleType(ImageView.ScaleType.FIT_XY);
        this.h.setImageResource(2130841692);
        this.k = new FrameLayout.LayoutParams(ak.f66359e, this.ae);
        this.k.topMargin = this.ah;
        this.k.leftMargin = this.ak;
        if (Build.VERSION.SDK_INT >= 17) {
            this.k.setMarginStart(this.ak);
        }
        this.h.setLayoutParams(this.k);
        this.h.setOnTouchListener(this);
        this.h.setTag("startSlide");
        this.frameContainer.addView(this.h);
        this.j = a((Context) this.f66545d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = (int) (((float) (this.k.topMargin + this.k.height)) + UIUtils.dip2Px(this.f66545d, 4.0f));
        layoutParams.leftMargin = this.ak;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(this.ak);
        }
        this.j.setLayoutParams(layoutParams);
        this.j.setTag("startSlideTime");
        this.frameContainer.addView(this.j);
        this.j.addTextChangedListener(new com.ss.android.ugc.aweme.base.ui.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66548a;

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f66548a, false, 75967, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f66548a, false, 75967, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                super.afterTextChanged(editable);
                VideoEditView.this.j.post(new j(this));
            }
        });
        this.g = new RTLImageView(this.f66545d);
        this.g.setScaleType(ImageView.ScaleType.FIT_XY);
        this.g.setImageResource(2130841691);
        this.l = new FrameLayout.LayoutParams(ak.f66359e + ak.i, this.ae);
        this.l.topMargin = this.ah;
        this.l.leftMargin = (this.x - this.ak) - ak.f66359e;
        if (Build.VERSION.SDK_INT >= 17) {
            this.l.setMarginStart((this.x - this.ak) - ak.f66359e);
        }
        this.g.setLayoutParams(this.l);
        this.g.setOnTouchListener(this);
        this.g.setPadding(0, 0, ak.i, 0);
        if (Build.VERSION.SDK_INT >= 17) {
            this.g.setPaddingRelative(0, 0, ak.i, 0);
        }
        this.g.setTag("endSlide");
        this.frameContainer.addView(this.g);
        this.i = a((Context) this.f66545d);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) (((float) (this.l.topMargin + this.l.height)) + UIUtils.dip2Px(this.f66545d, 4.0f));
        layoutParams2.leftMargin = (this.x - this.ak) - ak.f66359e;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart(this.ak);
        }
        this.i.setLayoutParams(layoutParams2);
        this.i.setTag("endSlideTime");
        this.frameContainer.addView(this.i);
        this.i.addTextChangedListener(new com.ss.android.ugc.aweme.base.ui.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66550a;

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f66550a, false, 75969, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f66550a, false, 75969, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                super.afterTextChanged(editable);
                VideoEditView.this.i.post(new k(this));
            }
        });
        this.A = new View(this.f66545d);
        this.B = new View(this.f66545d);
        this.A.setBackgroundColor(this.f66545d.getResources().getColor(C0906R.color.a1w));
        this.B.setBackgroundColor(this.f66545d.getResources().getColor(C0906R.color.a1w));
        this.frameContainer.addView(this.A);
        this.frameContainer.addView(this.B);
        a(this.ak, (this.x - this.ak) - ak.f66359e);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.mCurPointerContainer.getLayoutParams();
        layoutParams3.leftMargin = this.ak + ak.f66359e;
        layoutParams3.height = this.ab;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart(this.ak + ak.f66359e);
        }
        this.mCurPointerContainer.setLayoutParams(layoutParams3);
        this.mCurPointerContainer.setTag("curPoint");
        this.mCurPointerContainer.setOnTouchListener(this);
        if (this.mCurPointerContainer != null) {
            this.frameContainer.removeView(this.mCurPointerContainer);
            this.frameContainer.addView(this.mCurPointerContainer);
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.mCurPointer.getLayoutParams();
        layoutParams4.width = this.aa;
        this.mCurPointer.setLayoutParams(layoutParams4);
        c(this.V);
        r();
    }

    private void q() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f66542c, false, 75938, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66542c, false, 75938, new Class[0], Void.TYPE);
            return;
        }
        View view = this.recyleBorderView;
        if (this.aj) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        int i3 = this.ak + ak.f66359e;
        this.recyleBorderView.setBackground(bc.a(b.f74589e.b(false), 0, (int) UIUtils.dip2Px(getContext(), 1.0f), 0));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.recyleBorderView.getLayoutParams();
        layoutParams.topMargin = this.ag;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(i3);
            layoutParams.setMarginEnd(i3);
        }
        this.recyleBorderView.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.singleFrameRecyclerView.getLayoutParams();
        layoutParams2.topMargin = this.ag;
        this.singleFrameRecyclerView.setLayoutParams(layoutParams2);
        this.singleFrameRecyclerView.setPadding(this.ak + ak.f66359e, 0, this.ak + ak.f66359e, 0);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.frameRecyclerView.getLayoutParams();
        layoutParams3.topMargin = this.ag;
        this.frameRecyclerView.setLayoutParams(layoutParams3);
        this.frameRecyclerView.setPadding(this.ak + ak.f66359e, 0, this.ak + ak.f66359e, 0);
        if (this.q != null) {
            FramesAdapter framesAdapter = new FramesAdapter(this.f66545d, new int[]{this.ac, this.ad}, this.f66546e.c(), this.n.f66478c, 2, this.singleFrameRecyclerView, this.q);
            this.p = framesAdapter;
        } else {
            FramesAdapter framesAdapter2 = new FramesAdapter(this.f66545d, new int[]{this.ac, this.ad}, this.f66546e.c(), this.n.f66478c, 2, this.singleFrameRecyclerView);
            this.p = framesAdapter2;
        }
        this.p.a(this.W);
        this.singleFrameRecyclerView.setAdapter(this.p);
        this.singleFrameRecyclerView.setLayoutManager(new MVLinearLayoutManager(this.f66545d, 0, false));
        this.singleFrameRecyclerView.addOnScrollListener(this.al);
        this.singleFrameRecyclerView.setflingScale(0.12d);
        if (this.q != null) {
            FramesAdapter framesAdapter3 = new FramesAdapter(this.f66545d, new int[]{this.ac, this.ad}, this.f66546e.c(), this.n.f66478c, 1, this.frameRecyclerView, this.q);
            this.o = framesAdapter3;
        } else {
            FramesAdapter framesAdapter4 = new FramesAdapter(this.f66545d, new int[]{this.ac, this.ad}, this.f66546e.c(), this.n.f66478c, 1, this.frameRecyclerView);
            this.o = framesAdapter4;
        }
        this.o.a(this.W);
        this.frameRecyclerView.setAdapter(this.o);
        this.frameRecyclerView.setLayoutManager(new ScrollInterceptedLayoutManager(this.f66545d, 0, false));
        this.frameRecyclerView.setflingScale(0.12d);
        this.frameRecyclerView.addOnScrollListener(this.al);
        if (this.u == 0) {
            this.singleFrameRecyclerView.setVisibility(0);
            this.frameRecyclerView.setVisibility(8);
            h hVar = (h) this.f66546e.c().get(0);
            this.n.a(hVar.f66496c, hVar.f66495b, hVar.f66499f, this.u);
            if (this.f66547f.m) {
                this.p.n = true;
                this.p.o = this.S;
            }
            this.p.j = this.U;
            this.p.i = this.T;
        } else {
            this.singleFrameRecyclerView.setVisibility(8);
            this.frameRecyclerView.setVisibility(0);
        }
        if (this.R) {
            h();
        }
        this.mCurPointer.setImageDrawable(bc.a(b.f74589e.a(), -1, 1, this.aa / 2));
    }

    public final VideoEditView a(boolean z2) {
        this.W = true;
        return this;
    }

    public void setFirstFrameBitmapLiveData(MutableLiveData<Bitmap> mutableLiveData) {
        this.T = mutableLiveData;
    }

    public void setFirstFrameVisibleLiveData(MutableLiveData<Boolean> mutableLiveData) {
        this.U = mutableLiveData;
    }

    public void setLoadThumbnailDirectly(boolean z2) {
        this.R = z2;
    }

    public void setMaxVideoLength(long j2) {
        this.z = j2;
    }

    public void setMinVideoLength(long j2) {
        this.y = j2;
    }

    public void setPointerScaleRatio(float f2) {
        this.f66544b = f2;
    }

    public void setPointerType(@PointerType int i2) {
        this.N = i2;
    }

    public void setVeEditor(p pVar) {
        this.S = pVar;
    }

    public VideoEditView(Context context) {
        this(context, null);
    }

    private void c(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66542c, false, 75931, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f66542c, false, 75931, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z2) {
            i2 = 8;
        }
        this.j.setVisibility(i2);
        this.i.setVisibility(i2);
    }

    public void setEnableBoundaryText(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66542c, false, 75930, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f66542c, false, 75930, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2 != this.V) {
            c(z2);
        }
        this.V = z2;
    }

    public void setEnabled(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66542c, false, 75946, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f66542c, false, 75946, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.Q = z2;
        if (this.frameRecyclerView.getLayoutManager() instanceof ScrollInterceptedLayoutManager) {
            ((ScrollInterceptedLayoutManager) this.frameRecyclerView.getLayoutManager()).f66474b = z2;
        }
    }

    private TextView a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f66542c, false, 75937, new Class[]{Context.class}, TextView.class)) {
            return (TextView) PatchProxy.accessDispatch(new Object[]{context2}, this, f66542c, false, 75937, new Class[]{Context.class}, TextView.class);
        }
        AVDmtTextView aVDmtTextView = new AVDmtTextView(context2);
        aVDmtTextView.setTextColor(b.f74589e.b(false));
        aVDmtTextView.setTextSize(11.0f);
        aVDmtTextView.setClickable(true);
        aVDmtTextView.a();
        aVDmtTextView.setOnTouchListener(this);
        return aVDmtTextView;
    }

    private void setCurPointerContainerStartX(float f2) {
        float f3;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66542c, false, 75949, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66542c, false, 75949, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        RTLLinearLayout rTLLinearLayout = this.mCurPointerContainer;
        if (f2 <= ((float) (this.ak + ak.f66359e))) {
            f3 = (float) ((this.ak + ak.f66359e) - ak.h);
        } else if (f2 >= ((float) (((this.x - this.ak) - ak.f66359e) - ak.f66360f))) {
            f3 = (float) ((((this.x - this.ak) - ak.f66359e) - ak.f66360f) + ak.h);
        } else {
            f3 = (((float) ak.h) * (((2.0f * f2) / ((float) ((this.x - this.ak) - ak.f66359e))) - 4.0f)) + f2;
        }
        rTLLinearLayout.setStartX(f3);
    }

    public final void b(boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66542c, false, 75957, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f66542c, false, 75957, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int i10 = 4;
        if (this.h != null) {
            RTLImageView rTLImageView = this.h;
            if (z2) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            rTLImageView.setVisibility(i9);
        }
        if (this.j != null && this.V) {
            TextView textView = this.j;
            if (z2) {
                i8 = 0;
            } else {
                i8 = 4;
            }
            textView.setVisibility(i8);
        }
        if (this.g != null) {
            RTLImageView rTLImageView2 = this.g;
            if (z2) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            rTLImageView2.setVisibility(i7);
        }
        if (this.i != null && this.V) {
            TextView textView2 = this.i;
            if (z2) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            textView2.setVisibility(i6);
        }
        if (this.A != null) {
            View view = this.A;
            if (z2) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            view.setVisibility(i5);
        }
        if (this.B != null) {
            View view2 = this.B;
            if (z2) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            view2.setVisibility(i4);
        }
        if (this.C != null) {
            View view3 = this.C;
            if (z2) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            view3.setVisibility(i3);
        }
        if (this.D != null) {
            View view4 = this.D;
            if (z2) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view4.setVisibility(i2);
        }
        if (this.E != null) {
            View view5 = this.E;
            if (z2) {
                i10 = 0;
            }
            view5.setVisibility(i10);
        }
    }

    public VideoEditView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static float a(View view, View view2) {
        if (!PatchProxy.isSupport(new Object[]{view, view2}, null, f66542c, true, 75932, new Class[]{View.class, View.class}, Float.TYPE)) {
            return (view.getX() + (((float) (view.getMeasuredWidth() - view.getPaddingRight())) / 2.0f)) - (((float) view2.getMeasuredWidth()) / 2.0f);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{view, view2}, null, f66542c, true, 75932, new Class[]{View.class, View.class}, Float.TYPE)).floatValue();
    }

    private a a(String str, CutMultiVideoViewModel cutMultiVideoViewModel) {
        String str2 = str;
        CutMultiVideoViewModel cutMultiVideoViewModel2 = cutMultiVideoViewModel;
        if (PatchProxy.isSupport(new Object[]{str2, cutMultiVideoViewModel2}, this, f66542c, false, 75904, new Class[]{String.class, CutMultiVideoViewModel.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str2, cutMultiVideoViewModel2}, this, f66542c, false, 75904, new Class[]{String.class, CutMultiVideoViewModel.class}, a.class);
        } else if (cutMultiVideoViewModel2.m) {
            a aVar = new a(-1);
            aVar.f56315e = str2;
            aVar.l = 720;
            aVar.m = 1280;
            aVar.h = (long) cutMultiVideoViewModel2.n;
            return aVar;
        } else {
            int[] iArr = new int[10];
            if (com.ss.android.ugc.aweme.tools.b.c.a(str2, iArr) != 0) {
                return null;
            }
            a aVar2 = new a(-1);
            aVar2.f56315e = str2;
            aVar2.l = iArr[0];
            aVar2.m = iArr[1];
            aVar2.h = (long) iArr[3];
            return aVar2;
        }
    }

    private void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66542c, false, 75944, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66542c, false, 75944, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.A != null && this.B != null) {
            int i4 = ak.f66359e + i2;
            int i5 = (i3 - i2) - ak.f66359e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, this.ai);
            layoutParams.leftMargin = i4;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(i4);
            }
            layoutParams.topMargin = this.ah;
            this.A.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i5, this.ai);
            layoutParams2.leftMargin = i4;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams2.setMarginStart(i4);
            }
            layoutParams2.topMargin = (this.ah + this.ae) - this.ai;
            this.B.setLayoutParams(layoutParams2);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        byte b2;
        float f2;
        float f3;
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f66542c, false, 75947, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f66542c, false, 75947, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.Q) {
            return false;
        } else {
            String str = (String) view.getTag();
            if (str == null) {
                return false;
            }
            if (str.equals("curPoint") || ((int) ((this.g.getStartX() - this.h.getStartX()) - ((float) ak.f66359e))) >= ((int) this.n.h) - 2) {
                switch (motionEvent.getAction()) {
                    case 0:
                        this.m = true;
                        this.F = motionEvent.getRawX();
                        this.H = this.F;
                        if (!str.equals("curPoint")) {
                            if (!str.equals("startSlide") && !str.equals("startSlideTime")) {
                                if (!str.equals("endSlide") && !str.equals("endSlideTime")) {
                                    if (str.equals("block")) {
                                        this.G = (this.h.getLeftX() + this.g.getLeftX()) / 2.0f;
                                        break;
                                    }
                                } else {
                                    this.G = this.g.getLeftX();
                                    break;
                                }
                            } else {
                                this.G = this.h.getLeftX();
                                break;
                            }
                        } else {
                            this.G = this.mCurPointerContainer.getLeftX();
                            this.I = true;
                            this.f66546e.a(true);
                            break;
                        }
                        break;
                    case 1:
                        this.m = false;
                        this.J = false;
                        if (!str.equals("curPoint")) {
                            if (!str.equals("startSlide") && !str.equals("startSlideTime")) {
                                if (!str.equals("endSlide") && !str.equals("endSlideTime")) {
                                    if (str.equals("block")) {
                                        VideoEditViewModel videoEditViewModel = this.f66546e;
                                        if (!PatchProxy.isSupport(new Object[0], videoEditViewModel, VideoEditViewModel.f66560a, false, 75984, new Class[0], Void.TYPE)) {
                                            videoEditViewModel.i.setValue(null);
                                            break;
                                        } else {
                                            PatchProxy.accessDispatch(new Object[0], videoEditViewModel, VideoEditViewModel.f66560a, false, 75984, new Class[0], Void.TYPE);
                                            break;
                                        }
                                    }
                                } else {
                                    this.f66546e.a();
                                    this.f66546e.a();
                                    break;
                                }
                            } else {
                                VideoEditViewModel videoEditViewModel2 = this.f66546e;
                                if (!PatchProxy.isSupport(new Object[0], videoEditViewModel2, VideoEditViewModel.f66560a, false, 75981, new Class[0], Void.TYPE)) {
                                    videoEditViewModel2.h.setValue(null);
                                    break;
                                } else {
                                    PatchProxy.accessDispatch(new Object[0], videoEditViewModel2, VideoEditViewModel.f66560a, false, 75981, new Class[0], Void.TYPE);
                                    break;
                                }
                            }
                        } else {
                            this.I = false;
                            this.f66546e.a(false);
                            break;
                        }
                        break;
                    case 2:
                        this.m = true;
                        float rawX = motionEvent.getRawX();
                        float f4 = this.G + (rawX - this.F);
                        if (ey.a((Context) this.f66545d)) {
                            f4 = ((float) this.x) - f4;
                        }
                        float f5 = f4;
                        if (str.equals("curPoint")) {
                            this.I = true;
                            this.f66546e.a(true);
                            a(f5, true);
                        } else if (str.equals("startSlide") || str.equals("startSlideTime")) {
                            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f5)}, this, f66542c, false, 75950, new Class[]{Float.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f5)}, this, f66542c, false, 75950, new Class[]{Float.TYPE}, Void.TYPE);
                            } else {
                                if ((this.g.getStartX() - f5) - ((float) ak.f66359e) < this.n.h) {
                                    u();
                                    f5 = (this.g.getStartX() - ((float) ak.f66359e)) - this.n.h;
                                }
                                if (f5 < ((float) this.ak)) {
                                    if (this.g.getStartX() == ((float) ((this.x - this.ak) - ak.f66359e))) {
                                        u();
                                    }
                                    f5 = (float) this.ak;
                                }
                                this.h.setStartX(f5);
                                setCurPointerContainerStartX(f5 + ((float) ak.f66359e));
                                a((int) this.h.getStartX(), (int) this.g.getStartX());
                                d();
                                VideoEditViewModel videoEditViewModel3 = this.f66546e;
                                if (PatchProxy.isSupport(new Object[0], videoEditViewModel3, VideoEditViewModel.f66560a, false, 75979, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], videoEditViewModel3, VideoEditViewModel.f66560a, false, 75979, new Class[0], Void.TYPE);
                                } else {
                                    videoEditViewModel3.g.setValue(null);
                                }
                                f();
                                o();
                            }
                        } else if (str.equals("endSlide") || str.equals("endSlideTime")) {
                            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f5)}, this, f66542c, false, 75951, new Class[]{Float.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f5)}, this, f66542c, false, 75951, new Class[]{Float.TYPE}, Void.TYPE);
                            } else {
                                if (f5 > ((float) ((this.x - this.ak) - ak.f66359e))) {
                                    f5 = (float) ((this.x - this.ak) - ak.f66359e);
                                    if (this.h.getStartX() == ((float) this.ak)) {
                                        u();
                                    }
                                }
                                if ((f5 - this.h.getStartX()) - ((float) ak.f66359e) < this.n.h) {
                                    u();
                                    f5 = this.h.getStartX() + this.n.h + ((float) ak.f66359e);
                                }
                                this.g.setStartX(f5);
                                setCurPointerContainerStartX(this.g.getStartX() - ((float) this.mCurPointer.getWidth()));
                                a((int) this.h.getStartX(), (int) this.g.getStartX());
                                d();
                                VideoEditViewModel videoEditViewModel4 = this.f66546e;
                                if (PatchProxy.isSupport(new Object[0], videoEditViewModel4, VideoEditViewModel.f66560a, false, 75980, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], videoEditViewModel4, VideoEditViewModel.f66560a, false, 75980, new Class[0], Void.TYPE);
                                } else {
                                    videoEditViewModel4.f66565f.setValue(null);
                                }
                                g();
                                o();
                            }
                        } else if (str.equals("block")) {
                            float f6 = rawX - this.H;
                            if (f6 < 0.0f) {
                                b2 = 1;
                            } else {
                                b2 = 0;
                            }
                            if (ey.a((Context) this.f66545d)) {
                                b2 ^= 1;
                                f6 = -f6;
                            }
                            float f7 = f6;
                            byte b3 = b2;
                            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f7), Byte.valueOf(b3)}, this, f66542c, false, 75952, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f7), Byte.valueOf(b3)}, this, f66542c, false, 75952, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE);
                            } else {
                                if (b3 != 0) {
                                    f3 = this.h.getStartX() + f7;
                                    if (f3 < ((float) this.ak)) {
                                        u();
                                    } else {
                                        f2 = this.g.getStartX() + f7;
                                    }
                                } else {
                                    f2 = f7 + this.g.getStartX();
                                    if (f2 > ((float) ((this.x - this.ak) - ak.f66359e))) {
                                        u();
                                    } else {
                                        f3 = this.h.getStartX() + f7;
                                    }
                                }
                                this.h.setStartX(f3);
                                this.g.setStartX(f2);
                                setCurPointerContainerStartX(f3 + ((float) ak.f66359e));
                                a((int) this.h.getStartX(), (int) this.g.getStartX());
                                d();
                                VideoEditViewModel videoEditViewModel5 = this.f66546e;
                                if (PatchProxy.isSupport(new Object[0], videoEditViewModel5, VideoEditViewModel.f66560a, false, 75983, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], videoEditViewModel5, VideoEditViewModel.f66560a, false, 75983, new Class[0], Void.TYPE);
                                } else {
                                    videoEditViewModel5.i.setValue(null);
                                }
                                g();
                                o();
                            }
                        }
                        this.H = rawX;
                        break;
                    case 3:
                        ImageView imageView = this.mCurPointer;
                        if (!PatchProxy.isSupport(new Object[]{imageView, Float.valueOf(1.0f)}, null, ap.f71116a, true, 81075, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                            imageView.setPivotX(((float) imageView.getWidth()) / 2.0f);
                            imageView.setPivotY(((float) imageView.getHeight()) / 2.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "scaleY", new float[]{imageView.getScaleY(), 1.0f});
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, "scaleX", new float[]{imageView.getScaleX(), 1.0f});
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.setInterpolator(new LinearInterpolator());
                            animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat});
                            animatorSet.start();
                            break;
                        } else {
                            PatchProxy.accessDispatch(new Object[]{imageView, Float.valueOf(1.0f)}, null, ap.f71116a, true, 81075, new Class[]{View.class, Float.TYPE}, Void.TYPE);
                            break;
                        }
                }
                return true;
            }
            ak.a((Context) this.f66545d);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoEditView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.f66544b = 1.0f;
        this.N = 1;
        this.O = 1;
        this.Q = true;
        this.R = true;
        this.ac = ak.f66357c;
        this.ad = ak.f66356b;
        this.ak = u.a(36.0d);
        this.al = new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66552a;

            /* renamed from: c  reason: collision with root package name */
            private boolean f66554c;

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                RecyclerView recyclerView2 = recyclerView;
                if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f66552a, false, 75971, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f66552a, false, 75971, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == 0) {
                    if (this.f66554c) {
                        VideoEditViewModel videoEditViewModel = VideoEditView.this.f66546e;
                        if (PatchProxy.isSupport(new Object[0], videoEditViewModel, VideoEditViewModel.f66560a, false, 75986, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], videoEditViewModel, VideoEditViewModel.f66560a, false, 75986, new Class[0], Void.TYPE);
                        } else {
                            videoEditViewModel.l.setValue(null);
                        }
                        this.f66554c = false;
                    }
                    recyclerView2.postDelayed(new Runnable() {
                        public final void run() {
                            VideoEditView.this.m = false;
                        }
                    }, 100);
                } else {
                    VideoEditView.this.m = true;
                }
                super.onScrollStateChanged(recyclerView, i);
            }

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int i3;
                int i4 = i;
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f66552a, false, 75972, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f66552a, false, 75972, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (i4 != 0) {
                    this.f66554c = true;
                    VideoEditView videoEditView = VideoEditView.this;
                    int i5 = VideoEditView.this.t;
                    if (ey.a(recyclerView.getContext())) {
                        i3 = -i4;
                    } else {
                        i3 = i4;
                    }
                    videoEditView.t = i5 + i3;
                    VideoEditView.this.d();
                    VideoEditView.this.f();
                    VideoEditView.this.g();
                    VideoEditViewModel videoEditViewModel = VideoEditView.this.f66546e;
                    if (PatchProxy.isSupport(new Object[0], videoEditViewModel, VideoEditViewModel.f66560a, false, 75985, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], videoEditViewModel, VideoEditViewModel.f66560a, false, 75985, new Class[0], Void.TYPE);
                        return;
                    }
                    videoEditViewModel.k.setValue(null);
                }
            }
        };
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f66542c, false, 75900, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f66542c, false, 75900, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        this.ai = (int) UIUtils.dip2Px(context, 2.0f);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VideoEditView);
            this.O = obtainStyledAttributes.getInt(1, 2);
            this.P = obtainStyledAttributes.getColor(0, context.getResources().getColor(C0906R.color.rs));
            this.N = obtainStyledAttributes.getInt(7, 1);
            this.ac = Math.round(obtainStyledAttributes.getDimension(5, (float) ak.f66357c));
            this.ad = Math.round(obtainStyledAttributes.getDimension(4, (float) ak.f66356b));
            this.aa = Math.round(obtainStyledAttributes.getDimension(3, 0.0f));
            this.ab = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
            this.af = Math.round(obtainStyledAttributes.getDimension(6, 0.0f));
            this.aj = obtainStyledAttributes.getBoolean(8, false);
            ak.f66358d = this.ad + (this.ai * 2);
            this.ae = ak.f66358d;
            this.ak = this.af - ak.f66359e;
            this.ah = (this.ab - ak.f66358d) / 2;
            this.ag = (this.ab - this.ad) / 2;
            obtainStyledAttributes.recycle();
        }
    }

    private void a(float f2, float f3, int i2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2)}, this, f66542c, false, 75925, new Class[]{Float.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2)}, this, f66542c, false, 75925, new Class[]{Float.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h.setStartX(f2);
        this.g.setStartX(f3);
        a((int) this.h.getStartX(), (int) this.g.getStartX());
        setCurPointerContainerStartX(this.h.getStartX() + ((float) ak.f66359e));
        this.t = i2;
        d();
        f();
        o();
        g();
    }
}
