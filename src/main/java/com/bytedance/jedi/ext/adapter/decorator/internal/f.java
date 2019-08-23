package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.decorator.LoadingStatus;
import com.bytedance.jedi.ext.adapter.decorator.c;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010)\u001a\u00020\u001fJ\u0010\u0010*\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0006\u0010,\u001a\u00020\u001fJ\u0006\u0010-\u001a\u00020\u001fJ\u0010\u0010.\u001a\u00020\u001f2\b\b\u0002\u0010/\u001a\u00020\u001cJ\b\u00100\u001a\u00020\u001fH\u0002J\u0010\u00101\u001a\u00020\u001f2\b\b\u0003\u0010/\u001a\u00020\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\n8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u000e\u0010\u001a\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00062"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/decorator/internal/LoadingDelegate;", "Lcom/bytedance/jedi/ext/adapter/decorator/internal/Delegate;", "()V", "currentContainer", "Lcom/bytedance/jedi/ext/adapter/decorator/LoadingView;", "getCurrentContainer", "()Lcom/bytedance/jedi/ext/adapter/decorator/LoadingView;", "setCurrentContainer", "(Lcom/bytedance/jedi/ext/adapter/decorator/LoadingView;)V", "defaultLoading", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Lkotlin/ParameterName;", "name", "parent", "getDefaultLoading", "()Lkotlin/jvm/functions/Function1;", "defaultLoading$delegate", "Lkotlin/Lazy;", "enableLoadMore", "", "getEnableLoadMore", "()Z", "setEnableLoadMore", "(Z)V", "isEnable", "isLoadingExecuting", "loadingStatus", "", "onLoadMoreListener", "Lkotlin/Function0;", "", "getOnLoadMoreListener", "()Lkotlin/jvm/functions/Function0;", "setOnLoadMoreListener", "(Lkotlin/jvm/functions/Function0;)V", "viewType", "getViewType", "()I", "setViewType", "(I)V", "autoLoadMore", "createViewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "manualLoadMore", "reset", "resume", "status", "startLoading", "updateLoadingStatus", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class f extends a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f21463a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(f.class), "defaultLoading", "getDefaultLoading()Lkotlin/jvm/functions/Function1;"))};
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public c f21464b;

    /* renamed from: c  reason: collision with root package name */
    public int f21465c = 241;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21466d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21467e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public Function0<Unit> f21468f;
    private int g = 1610547200;
    private final Lazy h = LazyKt.lazy(new a(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Lkotlin/ParameterName;", "name", "parent", "Lcom/bytedance/jedi/ext/adapter/decorator/LoadingView;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Function1<? super ViewGroup, ? extends c>> {
        final /* synthetic */ f this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/ext/adapter/decorator/DefaultLoadingView;", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.f$a$a  reason: collision with other inner class name */
        static final class C0202a extends Lambda implements Function1<ViewGroup, com.bytedance.jedi.ext.adapter.decorator.a> {
            final /* synthetic */ a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0202a(a aVar) {
                super(1);
                this.this$0 = aVar;
            }

            @NotNull
            public final com.bytedance.jedi.ext.adapter.decorator.a invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkParameterIsNotNull(viewGroup, AdvanceSetting.NETWORK_TYPE);
                return new com.bytedance.jedi.ext.adapter.decorator.a(viewGroup, new Function0<Unit>(this) {
                    final /* synthetic */ C0202a this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void invoke() {
                        f fVar = this.this$0.this$0.this$0;
                        if (fVar.f21465c == 244 && !fVar.f21467e) {
                            fVar.f21467e = true;
                            fVar.g();
                            Function0<Unit> function0 = fVar.f21468f;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        }
                    }
                });
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @NotNull
        public final Function1<ViewGroup, c> invoke() {
            return new C0202a<>(this);
        }
    }

    public final int f() {
        return this.g;
    }

    public final void g() {
        b(242);
    }

    public final boolean d() {
        if (!this.f21466d || this.f21468f == null) {
            return false;
        }
        return true;
    }

    private void a(int i) {
        c cVar = this.f21464b;
        if (cVar != null) {
            cVar.a(i);
        }
    }

    private void b(@LoadingStatus int i) {
        if (this.f21465c != 242) {
            this.f21465c = 242;
            this.f21467e = true;
            a(242);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0 == null) goto L_0x000f;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.v7.widget.RecyclerView.ViewHolder a(@org.jetbrains.annotations.NotNull android.view.ViewGroup r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            com.bytedance.jedi.ext.adapter.decorator.c r0 = r1.f21464b
            if (r0 == 0) goto L_0x000f
            android.view.View r0 = r0.a()
            if (r0 != 0) goto L_0x0023
        L_0x000f:
            kotlin.Lazy r0 = r1.h
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r2 = r0.invoke(r2)
            com.bytedance.jedi.ext.adapter.decorator.c r2 = (com.bytedance.jedi.ext.adapter.decorator.c) r2
            r1.f21464b = r2
            android.view.View r0 = r2.a()
        L_0x0023:
            com.bytedance.jedi.ext.adapter.decorator.internal.LoadingHolder r2 = new com.bytedance.jedi.ext.adapter.decorator.internal.LoadingHolder
            r2.<init>(r0)
            int r0 = r1.f21465c
            r1.a((int) r0)
            android.support.v7.widget.RecyclerView$ViewHolder r2 = (android.support.v7.widget.RecyclerView.ViewHolder) r2
            r1.a((android.support.v7.widget.RecyclerView.ViewHolder) r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.decorator.internal.f.a(android.view.ViewGroup):android.support.v7.widget.RecyclerView$ViewHolder");
    }
}
