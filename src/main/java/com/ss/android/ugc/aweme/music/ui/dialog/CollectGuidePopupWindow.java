package com.ss.android.ugc.aweme.music.ui.dialog;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0007J\u0016\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0006J\u001c\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/music/ui/dialog/CollectGuidePopupWindow;", "Landroid/widget/PopupWindow;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "layoutId", "", "(Landroid/content/Context;I)V", "contentTv", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "dismissRunnable", "Ljava/lang/Runnable;", "popupHeight", "popupWidth", "rootContainer", "Landroid/widget/FrameLayout;", "dismiss", "", "dismissDelayed", "delayMillis", "", "onHostDestroy", "onScroll", "translationY", "maxY", "setBackground", "bgId", "setContent", "strId", "show", "anchor", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CollectGuidePopupWindow extends PopupWindow implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3629a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f3630b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3631c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3632d;

    /* renamed from: e  reason: collision with root package name */
    private final DmtTextView f3633e;

    /* renamed from: f  reason: collision with root package name */
    private final FrameLayout f3634f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56674a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectGuidePopupWindow f56675b;

        a(CollectGuidePopupWindow collectGuidePopupWindow) {
            this.f56675b = collectGuidePopupWindow;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f56674a, false, 60544, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f56674a, false, 60544, new Class[0], Void.TYPE);
                return;
            }
            this.f56675b.dismiss();
        }
    }

    @JvmOverloads
    public CollectGuidePopupWindow(@NotNull Context context) {
        this(context, 0, 2);
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f3629a, false, 60541, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3629a, false, 60541, new Class[0], Void.TYPE);
        } else if (isShowing()) {
            a.a(this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onHostDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3629a, false, 60542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3629a, false, 60542, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
        getContentView().removeCallbacks(this.f3630b);
    }

    @JvmOverloads
    private CollectGuidePopupWindow(@NotNull Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f3630b = new a(this);
        View inflate = LayoutInflater.from(context).inflate(i, null);
        View findViewById = inflate.findViewById(C0906R.id.da0);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.tv_content)");
        this.f3633e = (DmtTextView) findViewById;
        View findViewById2 = inflate.findViewById(C0906R.id.ag1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.fl_root_container)");
        this.f3634f = (FrameLayout) findViewById2;
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(C0906R.style.fs);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        this.f3632d = inflate.getMeasuredHeight();
        this.f3631c = inflate.getMeasuredWidth();
    }

    private /* synthetic */ CollectGuidePopupWindow(Context context, int i, int i2) {
        this(context, C0906R.layout.abn);
    }
}
