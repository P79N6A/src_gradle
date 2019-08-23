package com.ss.android.ugc.aweme.shortvideo.record.a;

import android.animation.ValueAnimator;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.gesture.a;
import com.ss.android.ugc.aweme.shortvideo.gesture.a.c;
import com.ss.android.ugc.aweme.shortvideo.i.i;
import com.ss.android.ugc.aweme.shortvideo.i.m;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.ae;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.utils.ey;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69060a;

    /* renamed from: b  reason: collision with root package name */
    public VideoRecordNewActivity f69061b;

    /* renamed from: c  reason: collision with root package name */
    public MediaRecordPresenter f69062c;

    /* renamed from: d  reason: collision with root package name */
    public i f69063d;

    /* renamed from: e  reason: collision with root package name */
    public int f69064e;

    /* renamed from: f  reason: collision with root package name */
    public int f69065f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public a r;
    public ValueAnimator s;
    public i t;
    public m u;
    public a v = new a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69066a;

        /* renamed from: b  reason: collision with root package name */
        boolean f69067b;

        /* renamed from: c  reason: collision with root package name */
        boolean f69068c;

        /* renamed from: d  reason: collision with root package name */
        boolean f69069d;

        /* renamed from: e  reason: collision with root package name */
        boolean f69070e;

        /* renamed from: f  reason: collision with root package name */
        float f69071f;
        private float h;

        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return true;
        }

        public final boolean b(MotionEvent motionEvent) {
            return false;
        }

        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return true;
        }

        public final boolean a(c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f69066a, false, 78428, new Class[]{c.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar}, this, f69066a, false, 78428, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
            }
            if (((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) b.this.f69061b).get(ShortVideoContextViewModel.class)).f() && !((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) b.this.f69061b).get(ShortVideoContextViewModel.class)).b()) {
                this.f69069d = true;
                b.this.c();
                b.this.f();
                b.this.f69061b.z.a((Object) b.this.f69061b, (bc) new ae(b.this, 0, true));
                this.f69071f = b.this.k;
            }
            return this.f69069d;
        }

        public final boolean a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f69066a, false, 78433, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f69066a, false, 78433, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            if (this.f69068c) {
                b.this.d();
                this.f69068c = false;
                b.this.f69061b.z.a((Object) b.this.f69061b, (bc) new ae(b.this, 8, true));
            }
            super.a(f2);
            return true;
        }

        public final boolean c(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f69066a, false, 78430, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f69066a, false, 78430, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            this.f69071f = b.this.k;
            if (this.f69069d) {
                b.this.d();
                this.f69069d = false;
                b.this.f69061b.z.a((Object) b.this.f69061b, (bc) new ae(b.this, 8, true));
            }
            super.c(f2);
            return true;
        }

        public final boolean a(ScaleGestureDetector scaleGestureDetector) {
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f69066a, false, 78431, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f69066a, false, 78431, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            }
            if (((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) b.this.f69061b).get(ShortVideoContextViewModel.class)).f() && !((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) b.this.f69061b).get(ShortVideoContextViewModel.class)).b()) {
                this.f69068c = true;
                b.this.c();
                b.this.f();
                b.this.f69061b.z.a((Object) b.this.f69061b, (bc) new ae(b.this, 0, true));
            }
            return this.f69068c;
        }

        public final boolean b(float f2) {
            float f3;
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f69066a, false, 78429, new Class[]{Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f69066a, false, 78429, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!this.f69069d) {
                return false;
            } else {
                this.f69071f += f2;
                b bVar = b.this;
                MediaRecordPresenter mediaRecordPresenter = b.this.f69062c;
                float f4 = this.f69071f;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f4)}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17572, new Class[]{Float.TYPE}, Float.TYPE)) {
                    f3 = ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f4)}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17572, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
                } else {
                    f3 = mediaRecordPresenter.j.rotateReactionWindow(f4);
                }
                bVar.k = f3;
                return true;
            }
        }

        public final boolean a(MotionEvent motionEvent) {
            int i;
            m mVar;
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f69066a, false, 78435, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f69066a, false, 78435, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b.this.f69061b.x.getLayoutParams();
            if (Build.VERSION.SDK_INT >= 17) {
                i = Math.min(layoutParams.getMarginStart(), layoutParams.leftMargin);
            } else {
                i = layoutParams.leftMargin;
            }
            if (((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) b.this.f69061b).get(ShortVideoContextViewModel.class)).f() && b.this.f69062c.c(((int) motionEvent.getX()) - i, (int) motionEvent.getY()) && !((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) b.this.f69061b).get(ShortVideoContextViewModel.class)).b()) {
                if (PatchProxy.isSupport(new Object[0], this, f69066a, false, 78434, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f69066a, false, 78434, new Class[0], Void.TYPE);
                } else {
                    m mVar2 = b.this.u;
                    b bVar = b.this;
                    i iVar = b.this.t;
                    if (PatchProxy.isSupport(new Object[0], iVar, i.f69084a, false, 78442, new Class[0], m.class)) {
                        mVar = (m) PatchProxy.accessDispatch(new Object[0], iVar, i.f69084a, false, 78442, new Class[0], m.class);
                    } else {
                        iVar.f69089f = (iVar.f69089f + 1) % (i.f69086c + i.f69085b);
                        mVar = iVar.f69087d.get(iVar.f69089f);
                    }
                    bVar.u = mVar;
                    if (mVar2.mIsCircle && !b.this.u.mIsCircle) {
                        b.this.q = (int) (((float) b.this.p) / b.this.u.getWidthHeightRatio());
                    } else if (!mVar2.mIsCircle && b.this.u.mIsCircle) {
                        b.this.q = b.this.p;
                    }
                    b.this.a();
                    b.this.k = b.this.f69062c.a();
                    b.this.b();
                }
                this.f69070e = true;
            }
            return true;
        }

        public final void b(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar) {
            int i;
            int i2;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f69066a, false, 78438, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f69066a, false, 78438, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Void.TYPE);
                return;
            }
            if (this.f69067b) {
                b.this.d();
                this.f69067b = false;
                b.this.f69061b.z.a((Object) b.this.f69061b, (bc) new ae(b.this, 8, true));
            }
            if (!com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ReactionWindowChangeTipShow) && !this.f69070e) {
                b.this.g();
                if (b.this.r != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b.this.f69061b.x.getLayoutParams();
                    if (ey.a((Context) b.this.f69061b)) {
                        if (Build.VERSION.SDK_INT >= 17) {
                            i2 = Math.min(layoutParams.getMarginStart(), layoutParams.rightMargin);
                        } else {
                            i2 = layoutParams.rightMargin;
                        }
                        b.this.r.a((fc.b(b.this.f69061b) - (b.this.g + i2)) - b.this.i, b.this.h + b.this.j, b.this.i);
                    } else {
                        if (Build.VERSION.SDK_INT >= 17) {
                            i = Math.min(layoutParams.getMarginStart(), layoutParams.leftMargin);
                        } else {
                            i = layoutParams.leftMargin;
                        }
                        b.this.r.a(b.this.g + i, b.this.h + b.this.j, b.this.i);
                    }
                    a aVar = b.this.r;
                    if (PatchProxy.isSupport(new Object[0], aVar, a.f69048a, false, 78399, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar, a.f69048a, false, 78399, new Class[0], Void.TYPE);
                    } else {
                        aVar.a();
                        if (PatchProxy.isSupport(new Object[0], aVar, a.f69048a, false, 78405, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], aVar, a.f69048a, false, 78405, new Class[0], Void.TYPE);
                        } else {
                            aVar.j.setText(C0906R.string.bvo);
                        }
                        aVar.j.setVisibility(0);
                    }
                    com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ReactionWindowChangeTipShow, true);
                    new SafeHandler(b.this.f69061b).postDelayed(new h(this), 5000);
                    this.f69070e = true;
                }
            }
            super.b(bVar);
        }

        public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f69066a, false, 78437, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, f69066a, false, 78437, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class}, Boolean.TYPE)).booleanValue();
            } else if (!this.f69067b) {
                return false;
            } else {
                b.this.g = (int) (((float) b.this.g) + bVar.j.x);
                b.this.h = (int) (((float) b.this.h) + bVar.j.y);
                int[] a2 = b.this.f69062c.a(b.this.g, b.this.h, -1, -1);
                if (a2 != null) {
                    b.this.g = a2[0];
                    b.this.h = a2[1];
                    b.this.i = a2[2];
                    b.this.j = a2[3];
                    b.this.l = a2[4];
                    b.this.m = a2[5];
                }
                return true;
            }
        }

        public final boolean b(ScaleGestureDetector scaleGestureDetector) {
            int[] iArr;
            int[] iArr2;
            if (PatchProxy.isSupport(new Object[]{scaleGestureDetector}, this, f69066a, false, 78432, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector}, this, f69066a, false, 78432, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
            } else if (!this.f69068c) {
                return false;
            } else {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                int i = (int) (((float) b.this.p) * scaleFactor);
                int i2 = (int) (((float) b.this.q) * scaleFactor);
                if (i > b.this.u.getMinWidth() && i2 > b.this.u.getMinHeight()) {
                    MediaRecordPresenter mediaRecordPresenter = b.this.f69062c;
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(scaleFactor)}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17571, new Class[]{Float.TYPE}, int[].class)) {
                        iArr = (int[]) PatchProxy.accessDispatch(new Object[]{Float.valueOf(scaleFactor)}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17571, new Class[]{Float.TYPE}, int[].class);
                    } else {
                        iArr = mediaRecordPresenter.j.scaleReactionWindow(scaleFactor);
                    }
                    if (iArr != null) {
                        b.this.g = iArr[0];
                        b.this.h = iArr[1];
                        b.this.i = iArr[2];
                        b.this.j = iArr[3];
                        MediaRecordPresenter mediaRecordPresenter2 = b.this.f69062c;
                        if (PatchProxy.isSupport(new Object[0], mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17575, new Class[0], int[].class)) {
                            iArr2 = (int[]) PatchProxy.accessDispatch(new Object[0], mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17575, new Class[0], int[].class);
                        } else {
                            iArr2 = mediaRecordPresenter2.j.getReactionCameraPosInRecordPixel();
                        }
                        b.this.l = iArr2[0];
                        b.this.m = iArr2[1];
                        b.this.p = iArr2[2];
                        b.this.q = iArr2[3];
                        this.h *= scaleFactor;
                    }
                }
                return true;
            }
        }

        public final boolean a(com.ss.android.ugc.aweme.shortvideo.gesture.a.b bVar, float f2, float f3) {
            int i;
            if (PatchProxy.isSupport(new Object[]{bVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f69066a, false, 78436, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f69066a, false, 78436, new Class[]{com.ss.android.ugc.aweme.shortvideo.gesture.a.b.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b.this.f69061b.x.getLayoutParams();
            if (Build.VERSION.SDK_INT >= 17) {
                i = Math.min(layoutParams.getMarginStart(), layoutParams.leftMargin);
            } else {
                i = layoutParams.leftMargin;
            }
            if (((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) b.this.f69061b).get(ShortVideoContextViewModel.class)).f() && b.this.f69062c.c(((int) f2) - i, (int) f3) && !((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) b.this.f69061b).get(ShortVideoContextViewModel.class)).b()) {
                this.f69067b = true;
                b.this.c();
                b.this.f();
                b.this.f69061b.z.a((Object) b.this.f69061b, (bc) new ae(b.this, 0, true));
            }
            return this.f69067b;
        }
    };
    private boolean w;

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f69060a, false, 78416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69060a, false, 78416, new Class[0], Void.TYPE);
            return;
        }
        h();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f69060a, false, 78420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69060a, false, 78420, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.a(false);
        }
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f69060a, false, 78417, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69060a, false, 78417, new Class[0], Void.TYPE);
            return;
        }
        if (this.s != null) {
            this.s.cancel();
        }
        this.s = ValueAnimator.ofFloat(new float[]{1.0f, 0.66f}).setDuration(150);
        this.s.addUpdateListener(e.f69077b);
        this.s.start();
    }

    private FrameLayout.LayoutParams i() {
        if (PatchProxy.isSupport(new Object[0], this, f69060a, false, 78422, new Class[0], FrameLayout.LayoutParams.class)) {
            return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f69060a, false, 78422, new Class[0], FrameLayout.LayoutParams.class);
        } else if (Build.VERSION.SDK_INT >= 19) {
            return new FrameLayout.LayoutParams((FrameLayout.LayoutParams) this.f69061b.x.getLayoutParams());
        } else {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f69061b.x.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = layoutParams.height;
            layoutParams2.leftMargin = layoutParams.leftMargin;
            layoutParams2.topMargin = layoutParams.topMargin;
            layoutParams2.rightMargin = layoutParams.rightMargin;
            layoutParams2.bottomMargin = layoutParams.bottomMargin;
            layoutParams2.gravity = layoutParams.gravity;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams2.setMarginEnd(layoutParams.getMarginEnd());
                layoutParams2.setMarginStart(layoutParams.getMarginStart());
            }
            return layoutParams2;
        }
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f69060a, false, 78411, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69060a, false, 78411, new Class[0], Void.TYPE);
        } else if (this.u.mImagePath == null) {
            if (("update style failed: imagePath is null " + this.f69061b) != null) {
                new StringBuilder("finishing :").append(this.f69061b.isFinishing());
            }
        } else {
            if (this.f69062c.a(this.u.mImagePath, this.u.mIsCircle)) {
                StringBuilder sb = new StringBuilder("update style: ");
                if (this.u.mIsCircle) {
                    str = "is circle";
                } else {
                    str = "is not circle";
                }
                sb.append(str);
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f69060a, false, 78414, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69060a, false, 78414, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            a aVar = this.r;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f69048a, false, 78401, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f69048a, false, 78401, new Class[0], Void.TYPE);
            } else if (aVar.f69051d != null) {
                aVar.f69051d.setVisibility(8);
            }
        }
    }

    public final void b() {
        int[] iArr;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f69060a, false, 78412, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69060a, false, 78412, new Class[0], Void.TYPE);
            return;
        }
        if (this.g > 0 || this.h > 0) {
            iArr = this.f69062c.a(this.g, this.h, this.p, this.q, this.k);
        } else if (ey.a((Context) this.f69061b)) {
            int[] b2 = this.f69062c.b();
            if (b2 == null) {
                i2 = 0;
            } else {
                i2 = b2[0];
            }
            iArr = this.f69062c.a(fc.b(this.f69061b) - i2, this.o, this.p, this.q, this.k);
        } else {
            iArr = this.f69062c.a(this.n, this.o, this.p, this.q, this.k);
        }
        if (iArr == null) {
            if (("update position failed. posResult is null " + this.f69061b) != null) {
                new StringBuilder("finishing :").append(this.f69061b.isFinishing());
            }
            return;
        }
        this.g = iArr[0];
        this.h = iArr[1];
        this.i = iArr[2];
        this.j = iArr[3];
        this.l = iArr[4];
        this.m = iArr[5];
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f69060a, false, 78413, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69060a, false, 78413, new Class[0], Void.TYPE);
            return;
        }
        g();
        if (this.r != null) {
            a aVar = this.r;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f69048a, false, 78397, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f69048a, false, 78397, new Class[0], Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[0], aVar, a.f69048a, false, 78402, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f69048a, false, 78402, new Class[0], Void.TYPE);
            } else if (aVar.f69051d == null) {
                FrameLayout frameLayout = new FrameLayout(aVar.f69049b);
                aVar.f69050c.addView(frameLayout, aVar.i);
                aVar.f69051d = new View(aVar.f69049b);
                aVar.f69051d.setBackgroundResource(2130840433);
                frameLayout.addView(aVar.f69051d, new ViewGroup.MarginLayoutParams(-1, -1));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar.f69051d.getLayoutParams();
                marginLayoutParams.setMargins(aVar.f69052e, aVar.f69053f, aVar.g, aVar.h);
                if (Build.VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginStart(aVar.f69052e);
                    marginLayoutParams.setMarginEnd(aVar.g);
                }
                frameLayout.requestLayout();
            }
            aVar.f69051d.setVisibility(0);
        }
    }

    public final void g() {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[0], this, f69060a, false, 78421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69060a, false, 78421, new Class[0], Void.TYPE);
            return;
        }
        if (this.r == null) {
            int[] b2 = this.f69062c.b();
            if (b2 == null) {
                com.ss.android.ugc.aweme.util.c.a("getReactionPosMarginInViewPixel return null");
                return;
            }
            this.r = new a(this.f69061b, this.f69061b.w);
            this.r.a(b2[2], b2[0], b2[3], b2[1], i());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f69061b.x.getLayoutParams();
            if (ey.a((Context) this.f69061b)) {
                if (Build.VERSION.SDK_INT >= 17) {
                    i3 = Math.min(layoutParams.getMarginStart(), layoutParams.rightMargin);
                } else {
                    i3 = layoutParams.rightMargin;
                }
                this.r.a((fc.b(this.f69061b) - (this.g + i3)) - this.i, this.h + this.j, this.i);
                return;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                i2 = Math.min(layoutParams.getMarginStart(), layoutParams.leftMargin);
            } else {
                i2 = layoutParams.leftMargin;
            }
            this.r.a(this.g + i2, this.h + this.j, this.i);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            if (PatchProxy.isSupport(new Object[0], this, f69060a, false, 78410, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69060a, false, 78410, new Class[0], Void.TYPE);
                return;
            }
            a();
            b();
            if (PatchProxy.isSupport(new Object[0], this, f69060a, false, 78419, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69060a, false, 78419, new Class[0], Void.TYPE);
                return;
            }
            if (!com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ReactionTipShow)) {
                g();
                if (this.r != null) {
                    a aVar = this.r;
                    if (PatchProxy.isSupport(new Object[0], aVar, a.f69048a, false, 78398, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar, a.f69048a, false, 78398, new Class[0], Void.TYPE);
                    } else {
                        aVar.a();
                        if (PatchProxy.isSupport(new Object[0], aVar, a.f69048a, false, 78404, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], aVar, a.f69048a, false, 78404, new Class[0], Void.TYPE);
                        } else {
                            aVar.j.setText(C0906R.string.bvp);
                        }
                        aVar.j.setVisibility(0);
                    }
                    com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ReactionTipShow, true);
                    new SafeHandler(this.f69061b).postDelayed(new g(this), 5000);
                }
            }
            if (!this.w) {
                if (com.ss.android.ugc.aweme.port.in.a.L.b(e.a.DefaultMicrophoneState) == 1) {
                    com.bytedance.ies.dmt.ui.d.a.c((Context) this.f69061b, (int) C0906R.string.bvq).a();
                }
                this.w = true;
            }
        }
    }

    public b(VideoRecordNewActivity videoRecordNewActivity, MediaRecordPresenter mediaRecordPresenter, i iVar, int i2, int i3) {
        m mVar;
        this.f69061b = videoRecordNewActivity;
        this.f69062c = mediaRecordPresenter;
        this.f69063d = iVar;
        this.f69064e = i2;
        this.f69065f = i3;
        this.t = new i(videoRecordNewActivity, i2, i3);
        i iVar2 = this.t;
        if (PatchProxy.isSupport(new Object[0], iVar2, i.f69084a, false, 78441, new Class[0], m.class)) {
            mVar = (m) PatchProxy.accessDispatch(new Object[0], iVar2, i.f69084a, false, 78441, new Class[0], m.class);
        } else {
            mVar = iVar2.f69087d.get(iVar2.f69089f);
        }
        this.u = mVar;
        this.p = this.u.getDefaultWidth();
        this.q = this.u.getDefaultHeight();
        ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) videoRecordNewActivity).get(ShortVideoContextViewModel.class)).j().observe(videoRecordNewActivity, new c(this));
    }
}
