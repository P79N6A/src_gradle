package com.ss.android.ugc.aweme.im.sdk.widget;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/widget/IMLoadingDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mLoadingTv", "Landroid/widget/TextView;", "mMainLayout", "Landroid/view/View;", "kotlin.jvm.PlatformType", "dismiss", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setLoadingText", "loadingTxt", "", "show", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52851a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f52852b;

    /* renamed from: c  reason: collision with root package name */
    private final View f52853c;

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f52851a, false, 54094, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52851a, false, 54094, new Class[0], Void.TYPE);
            return;
        }
        g.a(this);
        View view = this.f52853c;
        View view2 = this.f52853c;
        Intrinsics.checkExpressionValueIsNotNull(view2, "mMainLayout");
        ObjectAnimator.ofFloat(view, "alpha", new float[]{view2.getAlpha(), 0.0f}).setDuration(300).start();
    }

    public final void show() {
        if (PatchProxy.isSupport(new Object[0], this, f52851a, false, 54093, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52851a, false, 54093, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        ObjectAnimator.ofFloat(this.f52853c, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context) {
        super(context, C0906R.style.fk);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f52853c = LayoutInflater.from(context).inflate(C0906R.layout.ja, null);
        View findViewById = this.f52853c.findViewById(C0906R.id.bjj);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mMainLayout.findViewById(R.id.loading_tv)");
        this.f52852b = (TextView) findViewById;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f52851a, false, 54092, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f52851a, false, 54092, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(this.f52853c);
        setCanceledOnTouchOutside(false);
    }
}
