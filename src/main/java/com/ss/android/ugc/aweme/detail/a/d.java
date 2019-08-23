package com.ss.android.ugc.aweme.detail.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.detail.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u001a\u0010\u0012\u001a\u00020\u00102\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00100\u0014j\u0002`\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00102\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00100\u0014j\u0002`\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonBreatheAnimatorImpl;", "Lcom/ss/android/ugc/aweme/detail/IDetailRecordButtonAnimator;", "context", "Landroid/content/Context;", "viewGroup", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "getContext", "()Landroid/content/Context;", "ringView", "Landroid/view/View;", "getRingView", "()Landroid/view/View;", "getViewGroup", "()Landroid/view/ViewGroup;", "hideStartRecordClickAnim", "", "showStartRecordClickAnim", "start", "callback", "Lkotlin/Function0;", "Lcom/ss/android/ugc/aweme/detail/AnimationCallback;", "stop", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41109a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final View f41110b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Context f41111c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f41112d;

    public final void a(@NotNull Function0<Unit> function0) {
        if (PatchProxy.isSupport(new Object[]{function0}, this, f41109a, false, 34681, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function0}, this, f41109a, false, 34681, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        this.f41110b.setVisibility(0);
        if (this.f41110b.getAnimation() == null) {
            this.f41110b.startAnimation(AnimationUtils.loadAnimation(this.f41111c, C0906R.anim.dl));
        }
        function0.invoke();
    }

    public final void b(@NotNull Function0<Unit> function0) {
        if (PatchProxy.isSupport(new Object[]{function0}, this, f41109a, false, 34682, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function0}, this, f41109a, false, 34682, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        this.f41110b.clearAnimation();
        this.f41110b.setVisibility(8);
        function0.invoke();
    }

    public d(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
        this.f41111c = context;
        this.f41112d = viewGroup;
        View findViewById = this.f41112d.findViewById(C0906R.id.cus);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "this.viewGroup.findViewB…id.start_record_out_ring)");
        this.f41110b = findViewById;
        this.f41112d.setOnTouchListener(new View.OnTouchListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41113a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f41114b;

            {
                this.f41114b = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                if (PatchProxy.isSupport(new Object[]{view, motionEvent2}, this, f41113a, false, 34685, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent2}, this, f41113a, false, 34685, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                Intrinsics.checkExpressionValueIsNotNull(motionEvent2, "event");
                switch (motionEvent.getAction()) {
                    case 0:
                        d dVar = this.f41114b;
                        if (!PatchProxy.isSupport(new Object[0], dVar, d.f41109a, false, 34683, new Class[0], Void.TYPE)) {
                            dVar.b(b.a.C0531b.INSTANCE);
                            dVar.f41112d.startAnimation(AnimationUtils.loadAnimation(dVar.f41111c, C0906R.anim.dj));
                            break;
                        } else {
                            PatchProxy.accessDispatch(new Object[0], dVar, d.f41109a, false, 34683, new Class[0], Void.TYPE);
                            break;
                        }
                    case 1:
                        d dVar2 = this.f41114b;
                        if (!PatchProxy.isSupport(new Object[0], dVar2, d.f41109a, false, 34684, new Class[0], Void.TYPE)) {
                            dVar2.a(b.a.C0530a.INSTANCE);
                            dVar2.f41112d.clearAnimation();
                            break;
                        } else {
                            PatchProxy.accessDispatch(new Object[0], dVar2, d.f41109a, false, 34684, new Class[0], Void.TYPE);
                            break;
                        }
                }
                return false;
            }
        });
    }
}
