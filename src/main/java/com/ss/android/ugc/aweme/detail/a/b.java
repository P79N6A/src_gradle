package com.ss.android.ugc.aweme.detail.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.detail.a;
import com.ss.android.ugc.aweme.detail.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u0006\u0010\"\u001a\u00020\u001cJ\b\u0010#\u001a\u00020\u001cH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR&\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/animator/DetailFragmentAnimatorImpl;", "Lcom/ss/android/ugc/aweme/detail/IDetailFragmentAnimator;", "context", "Landroid/content/Context;", "viewGroup", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "getContext", "()Landroid/content/Context;", "value", "", "couldShowRecord", "getCouldShowRecord", "()Z", "setCouldShowRecord", "(Z)V", "hasRecordButtonViewGroupShown", "getHasRecordButtonViewGroupShown", "setHasRecordButtonViewGroupShown", "recordButtonAnimator", "Lcom/ss/android/ugc/aweme/detail/IDetailRecordButtonAnimator;", "getRecordButtonAnimator", "()Lcom/ss/android/ugc/aweme/detail/IDetailRecordButtonAnimator;", "recordButtonViewGroup", "getRecordButtonViewGroup", "()Landroid/view/ViewGroup;", "getViewGroup", "hideStartRecordBtn", "", "onPageSelected", "position", "", "onSlidedown", "onSlideup", "showStartRecordBtn", "start", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41093a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f41094b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.detail.b f41095c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f41096d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final Context f41097e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f41098f;
    private boolean g = true;

    private boolean d() {
        return this.g;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f41093a, false, 34661, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41093a, false, 34661, new Class[0], Void.TYPE);
            return;
        }
        this.f41095c.a(b.a.C0530a.INSTANCE);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f41093a, false, 34662, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41093a, false, 34662, new Class[0], Void.TYPE);
            return;
        }
        e();
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f41093a, false, 34665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41093a, false, 34665, new Class[0], Void.TYPE);
            return;
        }
        if (d() && !this.f41096d) {
            this.f41094b.setVisibility(0);
            this.f41094b.startAnimation(a.a());
            this.f41096d = true;
            this.f41095c.a(b.a.C0530a.INSTANCE);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f41093a, false, 34663, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41093a, false, 34663, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f41093a, false, 34666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41093a, false, 34666, new Class[0], Void.TYPE);
            return;
        }
        if (d() && this.f41096d) {
            this.f41095c.b(b.a.C0531b.INSTANCE);
            this.f41094b.startAnimation(a.b());
            this.f41094b.setVisibility(8);
            this.f41096d = false;
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41093a, false, 34664, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41093a, false, 34664, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        e();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f41093a, false, 34660, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f41093a, false, 34660, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41094b.setVisibility(8);
        this.g = false;
    }

    public b(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
        this.f41097e = context;
        this.f41098f = viewGroup;
        View findViewById = this.f41098f.findViewById(C0906R.id.cup);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "this.viewGroup.findViewById(R.id.start_record)");
        this.f41094b = (ViewGroup) findViewById;
        this.f41095c = new d(this.f41097e, this.f41094b);
        this.f41096d = true;
    }
}
