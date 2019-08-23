package com.ss.android.ugc.aweme.utils;

import android.animation.Animator;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class fe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75875a;

    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75888a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f75888a, false, 88723, new Class[]{Parcel.class}, a.class)) {
                    return new a(parcel2);
                }
                return (a) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f75888a, false, 88723, new Class[]{Parcel.class}, a.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75883a;

        /* renamed from: b  reason: collision with root package name */
        public int f75884b;

        /* renamed from: c  reason: collision with root package name */
        public int f75885c;

        /* renamed from: d  reason: collision with root package name */
        public int f75886d;

        /* renamed from: e  reason: collision with root package name */
        public int f75887e;

        public int describeContents() {
            return 0;
        }

        public a(Parcel parcel) {
            this.f75884b = parcel.readInt();
            this.f75885c = parcel.readInt();
            this.f75886d = parcel.readInt();
            this.f75887e = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f75883a, false, 88722, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f75883a, false, 88722, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            parcel.writeInt(this.f75884b);
            parcel.writeInt(this.f75885c);
            parcel.writeInt(this.f75886d);
            parcel.writeInt(this.f75887e);
        }

        public a(int i, int i2, int i3, int i4) {
            this.f75884b = i;
            this.f75885c = i2;
            this.f75886d = i3;
            this.f75887e = i4;
        }
    }

    public static a a(@NonNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f75875a, true, 88719, new Class[]{View.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{view2}, null, f75875a, true, 88719, new Class[]{View.class}, a.class);
        }
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        return new a(iArr[0], iArr[1], view.getWidth(), view.getHeight());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.view.View r21, android.graphics.drawable.ColorDrawable r22, int... r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f75875a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r9[r11] = r5
            java.lang.Class<android.graphics.drawable.ColorDrawable> r5 = android.graphics.drawable.ColorDrawable.class
            r9[r12] = r5
            java.lang.Class<int[]> r5 = int[].class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 88718(0x15a8e, float:1.2432E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0055
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f75875a
            r17 = 1
            r18 = 88718(0x15a8e, float:1.2432E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0[r11] = r1
            java.lang.Class<android.graphics.drawable.ColorDrawable> r1 = android.graphics.drawable.ColorDrawable.class
            r0[r12] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0055:
            if (r0 != 0) goto L_0x0058
            return
        L_0x0058:
            java.lang.String r3 = "alpha"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofInt(r1, r3, r2)
            r3 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r3)
            com.ss.android.ugc.aweme.utils.fe$2 r3 = new com.ss.android.ugc.aweme.utils.fe$2
            r3.<init>(r0, r1)
            r2.addUpdateListener(r3)
            r2.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.fe.a(android.view.View, android.graphics.drawable.ColorDrawable, int[]):void");
    }

    public static void b(a aVar, View view, Animator.AnimatorListener animatorListener) {
        a aVar2 = aVar;
        View view2 = view;
        Animator.AnimatorListener animatorListener2 = animatorListener;
        if (PatchProxy.isSupport(new Object[]{aVar2, view2, animatorListener2}, null, f75875a, true, 88717, new Class[]{a.class, View.class, Animator.AnimatorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, view2, animatorListener2}, null, f75875a, true, 88717, new Class[]{a.class, View.class, Animator.AnimatorListener.class}, Void.TYPE);
            return;
        }
        int i = aVar2.f75886d;
        int i2 = aVar2.f75887e;
        int width = view.getWidth();
        int height = view.getHeight();
        int i3 = aVar2.f75884b;
        int i4 = aVar2.f75885c;
        float f2 = ((float) i) / ((float) width);
        float f3 = ((float) i2) / ((float) height);
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i5 = iArr[0];
        int i6 = i4 - iArr[1];
        view2.setPivotX(0.0f);
        view2.setPivotY(0.0f);
        view2.setVisibility(0);
        ViewPropertyAnimator animate = view.animate();
        animate.setDuration(300).scaleX(f2).scaleY(f3).translationX((float) (i3 - i5)).translationY((float) i6);
        animate.setListener(animatorListener2);
        animate.start();
    }

    public static void a(a aVar, View view, Animator.AnimatorListener animatorListener) {
        final a aVar2 = aVar;
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{aVar2, view2, null}, null, f75875a, true, 88716, new Class[]{a.class, View.class, Animator.AnimatorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, view2, null}, null, f75875a, true, 88716, new Class[]{a.class, View.class, Animator.AnimatorListener.class}, Void.TYPE);
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(null) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75876a;

            public final boolean onPreDraw() {
                if (PatchProxy.isSupport(new Object[0], this, f75876a, false, 88720, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f75876a, false, 88720, new Class[0], Boolean.TYPE)).booleanValue();
                }
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                int i = aVar2.f75886d;
                int i2 = aVar2.f75887e;
                float width = ((float) view2.getWidth()) / ((float) i);
                float height = ((float) view2.getHeight()) / ((float) i2);
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = aVar2.f75884b - i3;
                int i6 = aVar2.f75885c - i4;
                view2.setPivotX(0.0f);
                view2.setPivotY(0.0f);
                view2.setAlpha(0.0f);
                view2.setTranslationX((float) i5);
                view2.setTranslationY((float) i6);
                if (width == 0.0f || height == 0.0f) {
                    return false;
                }
                view2.setScaleX(1.0f / width);
                view2.setScaleY(1.0f / height);
                view2.setVisibility(0);
                ViewPropertyAnimator animate = view2.animate();
                animate.setDuration(300).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationX(0.0f).translationY(0.0f);
                animate.setInterpolator(new AccelerateDecelerateInterpolator());
                if (null != null) {
                    animate.setListener(null);
                }
                animate.start();
                return true;
            }
        });
    }
}
