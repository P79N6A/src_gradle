package com.ss.android.ugc.aweme.detail.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.detail.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00140\u0016j\u0002`\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00140\u0016j\u0002`\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonInitialBreatheAnimatorImpl;", "Lcom/ss/android/ugc/aweme/detail/IDetailRecordButtonAnimator;", "context", "Landroid/content/Context;", "viewGroup", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "getContext", "()Landroid/content/Context;", "recordTitleView", "Landroid/widget/TextView;", "getRecordTitleView", "()Landroid/widget/TextView;", "recordVg", "Landroid/view/View;", "getRecordVg", "()Landroid/view/View;", "getViewGroup", "()Landroid/view/ViewGroup;", "start", "", "callback", "Lkotlin/Function0;", "Lcom/ss/android/ugc/aweme/detail/AnimationCallback;", "stop", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41115a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final View f41116b = this.f41119e.findViewById(C0906R.id.cuq);
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final TextView f41117c = ((TextView) this.f41119e.findViewById(C0906R.id.cut));
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final Context f41118d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final ViewGroup f41119e;

    public final void a(@NotNull Function0<Unit> function0) {
        if (PatchProxy.isSupport(new Object[]{function0}, this, f41115a, false, 34686, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function0}, this, f41115a, false, 34686, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        TextView textView = this.f41117c;
        if (textView != null) {
            textView.setVisibility(0);
        }
        View view = this.f41116b;
        if (view != null && view.getAnimation() == null) {
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), C0906R.anim.co));
            function0.invoke();
        }
    }

    public final void b(@NotNull Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f41115a, false, 34687, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f41115a, false, 34687, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "callback");
        View view = this.f41116b;
        if (view != null) {
            view.clearAnimation();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            function0.invoke();
        }
    }

    public e(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
        this.f41118d = context;
        this.f41119e = viewGroup;
    }
}
