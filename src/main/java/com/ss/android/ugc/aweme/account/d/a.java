package com.ss.android.ugc.aweme.account.d;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/account/dialog/AccountStatusViewDialog;", "Landroid/app/Dialog;", "context", "Landroid/app/Activity;", "loadingView", "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;)V", "getContext", "()Landroid/app/Activity;", "enableBackPress", "", "mDmtStatusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "dismiss", "", "enabled", "onBackPressed", "show", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31833a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f31834b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Activity f31835c;

    /* renamed from: d  reason: collision with root package name */
    private DmtStatusView f31836d;

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f31833a, false, 19893, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31833a, false, 19893, new Class[0], Void.TYPE);
            return;
        }
        if (this.f31834b) {
            super.onBackPressed();
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f31833a, false, 19892, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31833a, false, 19892, new Class[0], Void.TYPE);
            return;
        }
        if (getOwnerActivity() != null) {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity == null) {
                Intrinsics.throwNpe();
            }
            if (!ownerActivity.isFinishing()) {
                b.a(this);
                this.f31836d.setVisibility(8);
            }
        }
    }

    public final void show() {
        if (PatchProxy.isSupport(new Object[0], this, f31833a, false, 19891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31833a, false, 19891, new Class[0], Void.TYPE);
            return;
        }
        if (getOwnerActivity() != null) {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity == null) {
                Intrinsics.throwNpe();
            }
            if (!ownerActivity.isFinishing()) {
                super.show();
                this.f31836d.d();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull Activity activity, @Nullable View view) {
        super(activity, C0906R.style.t);
        Intrinsics.checkParameterIsNotNull(activity, "context");
        this.f31835c = activity;
        setOwnerActivity(this.f31835c);
        setContentView(C0906R.layout.f4507it);
        ButterKnife.bind((Dialog) this);
        View findViewById = findViewById(C0906R.id.cvd);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.status_view)");
        this.f31836d = (DmtStatusView) findViewById;
        DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
        if (view != null) {
            a2.a(view);
        }
        this.f31836d.setBuilder(a2);
    }
}
