package com.ss.android.ugc.aweme.commerce.service.l;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bJ\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/ViewAnimationUtils;", "", "()V", "alphaAnimateView", "", "isAlpha", "", "v", "Landroid/view/View;", "alphaAnimateView75", "alphaAnimation", "view", "alphaAnimation75", "blink", "scaleAnimation", "scaleAnimationView", "scaleUp", "scaleSmallAnimation", "scaleSmallAnimationView", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38046a;

    /* renamed from: b  reason: collision with root package name */
    public static final o f38047b = new o();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38048a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f38049b = new a();

        a() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            View view2 = view;
            MotionEvent motionEvent2 = motionEvent;
            if (PatchProxy.isSupport(new Object[]{view2, motionEvent2}, this, f38048a, false, 30046, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent2}, this, f38048a, false, 30046, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkExpressionValueIsNotNull(motionEvent2, "event");
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        o oVar = o.f38047b;
                        Intrinsics.checkExpressionValueIsNotNull(view2, NotifyType.VIBRATE);
                        oVar.a(true, view2);
                        break;
                    case 1:
                        break;
                }
            }
            o oVar2 = o.f38047b;
            Intrinsics.checkExpressionValueIsNotNull(view2, NotifyType.VIBRATE);
            oVar2.a(false, view2);
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38050a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f38051b = new b();

        b() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            View view2 = view;
            MotionEvent motionEvent2 = motionEvent;
            if (PatchProxy.isSupport(new Object[]{view2, motionEvent2}, this, f38050a, false, 30047, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent2}, this, f38050a, false, 30047, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkExpressionValueIsNotNull(motionEvent2, "event");
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        o oVar = o.f38047b;
                        Intrinsics.checkExpressionValueIsNotNull(view2, NotifyType.VIBRATE);
                        oVar.b(true, view2);
                        break;
                    case 1:
                        break;
                }
            }
            o oVar2 = o.f38047b;
            Intrinsics.checkExpressionValueIsNotNull(view2, NotifyType.VIBRATE);
            oVar2.b(false, view2);
            return false;
        }
    }

    private o() {
    }

    public final void b(@Nullable View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f38046a, false, 30038, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f38046a, false, 30038, new Class[]{View.class}, Void.TYPE);
        } else if (view2 != null) {
            view2.setOnTouchListener(b.f38051b);
        }
    }

    public final void a(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f38046a, false, 30037, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f38046a, false, 30037, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        view2.setOnTouchListener(a.f38049b);
    }

    public final void b(boolean z, View view) {
        float f2;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), view2}, this, f38046a, false, 30043, new Class[]{Boolean.TYPE, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), view2}, this, f38046a, false, 30043, new Class[]{Boolean.TYPE, View.class}, Void.TYPE);
            return;
        }
        float[] fArr = new float[2];
        float f3 = 0.75f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.75f;
        }
        fArr[0] = f2;
        if (!z) {
            f3 = 1.0f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", fArr);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
        ofFloat.setDuration(100);
        ofFloat.start();
    }

    public final void a(boolean z, View view) {
        float f2;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), view2}, this, f38046a, false, 30042, new Class[]{Boolean.TYPE, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), view2}, this, f38046a, false, 30042, new Class[]{Boolean.TYPE, View.class}, Void.TYPE);
            return;
        }
        float[] fArr = new float[2];
        float f3 = 0.7f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.7f;
        }
        fArr[0] = f2;
        if (!z) {
            f3 = 1.0f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", fArr);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
        ofFloat.setDuration(100);
        ofFloat.start();
    }
}
