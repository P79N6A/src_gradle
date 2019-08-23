package com.ss.android.ugc.aweme.notification.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eJ\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\u00130\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0017\u001a\n \r*\u0004\u0018\u00010\u00180\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/adapter/FansStatusHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "listener", "Lkotlin/Function0;", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "mContext", "Landroid/content/Context;", "mEmpty", "Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultView;", "kotlin.jvm.PlatformType", "getMEmpty", "()Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultView;", "mEmpty$delegate", "Lkotlin/Lazy;", "mLoading", "Lcom/bytedance/ies/dmt/ui/widget/DmtLoadingLayout;", "getMLoading", "()Lcom/bytedance/ies/dmt/ui/widget/DmtLoadingLayout;", "mLoading$delegate", "mText", "Landroid/widget/TextView;", "getMText", "()Landroid/widget/TextView;", "mText$delegate", "bind", "notice", "Lcom/ss/android/ugc/aweme/notification/bean/BaseNotice;", "onClick", "v", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ClickableViewAccessibility"})
public final class FansStatusHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57896a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f57897b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansStatusHolder.class), "mText", "getMText()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansStatusHolder.class), "mLoading", "getMLoading()Lcom/bytedance/ies/dmt/ui/widget/DmtLoadingLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansStatusHolder.class), "mEmpty", "getMEmpty()Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultView;"))};

    /* renamed from: c  reason: collision with root package name */
    public final View f57898c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f57899d;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f57900e = LazyKt.lazy(new c(this));

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f57901f = LazyKt.lazy(new b(this));
    private final Lazy g = LazyKt.lazy(new a(this));
    private final Function0<Unit> h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<DmtDefaultView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FansStatusHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FansStatusHolder fansStatusHolder) {
            super(0);
            this.this$0 = fansStatusHolder;
        }

        public final DmtDefaultView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63024, new Class[0], DmtDefaultView.class)) {
                return (DmtDefaultView) this.this$0.f57898c.findViewById(C0906R.id.a9o);
            }
            return (DmtDefaultView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63024, new Class[0], DmtDefaultView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtLoadingLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<DmtLoadingLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FansStatusHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FansStatusHolder fansStatusHolder) {
            super(0);
            this.this$0 = fansStatusHolder;
        }

        public final DmtLoadingLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63025, new Class[0], DmtLoadingLayout.class)) {
                return (DmtLoadingLayout) this.this$0.f57898c.findViewById(C0906R.id.biy);
            }
            return (DmtLoadingLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63025, new Class[0], DmtLoadingLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FansStatusHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FansStatusHolder fansStatusHolder) {
            super(0);
            this.this$0 = fansStatusHolder;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63026, new Class[0], TextView.class)) {
                return (TextView) this.this$0.f57898c.findViewById(C0906R.id.text);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63026, new Class[0], TextView.class);
        }
    }

    /* access modifiers changed from: package-private */
    public final TextView a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f57896a, false, 63019, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f57896a, false, 63019, new Class[0], TextView.class);
        } else {
            value = this.f57900e.getValue();
        }
        return (TextView) value;
    }

    /* access modifiers changed from: package-private */
    public final DmtLoadingLayout b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f57896a, false, 63020, new Class[0], DmtLoadingLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f57896a, false, 63020, new Class[0], DmtLoadingLayout.class);
        } else {
            value = this.f57901f.getValue();
        }
        return (DmtLoadingLayout) value;
    }

    /* access modifiers changed from: package-private */
    public final DmtDefaultView c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f57896a, false, 63021, new Class[0], DmtDefaultView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f57896a, false, 63021, new Class[0], DmtDefaultView.class);
        } else {
            value = this.g.getValue();
        }
        return (DmtDefaultView) value;
    }

    public final void onClick(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57896a, false, 63023, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57896a, false, 63023, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null) {
            if (view.getId() == C0906R.id.text) {
                Function0<Unit> function0 = this.h;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FansStatusHolder(@NotNull View view, @Nullable Function0<Unit> function0) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f57898c = view;
        this.h = function0;
        com.bytedance.ies.dmt.ui.e.b.a(a());
        a().setOnClickListener(this);
        Context context = this.f57898c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        this.f57899d = context;
    }
}
