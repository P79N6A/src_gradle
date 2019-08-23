package com.ss.android.ugc.aweme.account.views;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0007J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aJ \u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fR\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/account/views/TipsPopupWindow;", "Landroid/widget/PopupWindow;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/content/Context;Landroid/arch/lifecycle/LifecycleOwner;)V", "contentText", "Landroid/widget/TextView;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "dismissRunnable", "Ljava/lang/Runnable;", "getLifecycleOwner", "()Landroid/arch/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "addLifeCycleObserver", "", "dismiss", "onPause", "setContentText", "text", "", "showAtTop", "anchorView", "Landroid/view/View;", "xOffset", "", "yOffset", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class TipsPopupWindow extends PopupWindow implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2577a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f2578b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f2579c = new Runnable(this) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33172a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TipsPopupWindow f33173b;

        {
            this.f33173b = r1;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f33172a, false, 21539, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f33172a, false, 21539, new Class[0], Void.TYPE);
                return;
            }
            this.f33173b.dismiss();
        }
    };
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public Context f2580d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public LifecycleOwner f2581e;

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f2577a, false, 21536, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2577a, false, 21536, new Class[0], Void.TYPE);
        } else if (isShowing()) {
            b.a(this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2577a, false, 21535, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2577a, false, 21535, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
    }

    public TipsPopupWindow(@NotNull Context context, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        this.f2580d = context;
        this.f2581e = lifecycleOwner;
        View inflate = LayoutInflater.from(this.f2580d).inflate(C0906R.layout.a9l, null);
        View findViewById = inflate.findViewById(C0906R.id.da0);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.tv_content)");
        this.f2578b = (TextView) findViewById;
        inflate.measure(0, 0);
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(C0906R.style.mn);
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(false);
        if (PatchProxy.isSupport(new Object[0], this, f2577a, false, 21534, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2577a, false, 21534, new Class[0], Void.TYPE);
            return;
        }
        this.f2581e.getLifecycle().addObserver(this);
    }
}
