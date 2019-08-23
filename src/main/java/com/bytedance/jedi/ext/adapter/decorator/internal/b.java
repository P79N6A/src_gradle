package com.bytedance.jedi.ext.adapter.decorator.internal;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u000e\u0010*\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0016J\u0012\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u00020\u0016H\u0002J\u0010\u00102\u001a\u0002002\b\b\u0003\u00101\u001a\u00020\u0016J\u0017\u00103\u001a\u00020\u001f*\u00020\u00162\b\b\u0001\u00104\u001a\u00020\u0016H\bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR6\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00060\f8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0003\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0015\u0010\u001e\u001a\u00020\u001f8Â\u0002X\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0015\u0010\"\u001a\u00020\u001f8Â\u0002X\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0015\u0010$\u001a\u00020\u001f8Â\u0002X\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010!R\u0014\u0010'\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0019R\u001a\u0010)\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001b¨\u00065"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/decorator/internal/EmptyDelegate;", "Lcom/bytedance/jedi/ext/adapter/decorator/internal/Delegate;", "header", "footer", "(Lcom/bytedance/jedi/ext/adapter/decorator/internal/Delegate;Lcom/bytedance/jedi/ext/adapter/decorator/internal/Delegate;)V", "currentContainer", "Lcom/bytedance/jedi/ext/adapter/decorator/EmptyView;", "getCurrentContainer", "()Lcom/bytedance/jedi/ext/adapter/decorator/EmptyView;", "setCurrentContainer", "(Lcom/bytedance/jedi/ext/adapter/decorator/EmptyView;)V", "defaultEmpty", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Lkotlin/ParameterName;", "name", "parent", "getDefaultEmpty", "()Lkotlin/jvm/functions/Function1;", "defaultEmpty$delegate", "Lkotlin/Lazy;", "emptyStatus", "", "emptyViewStrategy", "getEmptyViewStrategy", "()I", "setEmptyViewStrategy", "(I)V", "footerPosition", "getFooterPosition", "hasEmpty", "", "getHasEmpty", "()Z", "hasFooter", "getHasFooter", "hasHeader", "getHasHeader", "isEnable", "viewCount", "getViewCount", "viewType", "getViewType", "setViewType", "createViewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "position", "resume", "", "status", "updateEmptyStatus", "contains", "target", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f21455a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "defaultEmpty", "getDefaultEmpty()Lkotlin/jvm/functions/Function1;"))};
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.jedi.ext.adapter.decorator.b f21456b;

    /* renamed from: c  reason: collision with root package name */
    public int f21457c;

    /* renamed from: d  reason: collision with root package name */
    public final a f21458d;

    /* renamed from: e  reason: collision with root package name */
    public final a f21459e;

    /* renamed from: f  reason: collision with root package name */
    private int f21460f;
    private final Lazy g;
    private int h;

    public final int f() {
        return this.f21460f;
    }

    public final boolean d() {
        if (this.h != 241) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r5 = this;
            boolean r0 = r5.d()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0014
            int r0 = r5.f21457c
            r0 = r0 & r2
            if (r0 != r2) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            com.bytedance.jedi.ext.adapter.decorator.internal.a r3 = r5.f21458d
            boolean r3 = r3.d()
            if (r3 == 0) goto L_0x002f
            int r3 = r5.f21457c
            r4 = 2
            r3 = r3 & r4
            if (r3 != r4) goto L_0x002a
            r3 = 1
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            if (r3 == 0) goto L_0x002f
            r3 = 1
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            if (r3 == 0) goto L_0x0039
            com.bytedance.jedi.ext.adapter.decorator.internal.a r3 = r5.f21458d
            int r3 = r3.e()
            int r0 = r0 + r3
        L_0x0039:
            com.bytedance.jedi.ext.adapter.decorator.internal.a r3 = r5.f21459e
            boolean r3 = r3.d()
            if (r3 == 0) goto L_0x004d
            int r3 = r5.f21457c
            r4 = 4
            r3 = r3 & r4
            if (r3 != r4) goto L_0x0049
            r3 = 1
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            if (r3 == 0) goto L_0x004d
            r1 = 1
        L_0x004d:
            if (r1 == 0) goto L_0x0056
            com.bytedance.jedi.ext.adapter.decorator.internal.a r1 = r5.f21459e
            int r1 = r1.e()
            int r0 = r0 + r1
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.decorator.internal.b.e():int");
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
            com.bytedance.jedi.ext.adapter.decorator.b r0 = r1.f21456b
            if (r0 == 0) goto L_0x000f
            android.view.View r0 = r0.a()
            if (r0 != 0) goto L_0x0023
        L_0x000f:
            kotlin.Lazy r0 = r1.g
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r2 = r0.invoke(r2)
            com.bytedance.jedi.ext.adapter.decorator.b r2 = (com.bytedance.jedi.ext.adapter.decorator.b) r2
            r1.f21456b = r2
            android.view.View r0 = r2.a()
        L_0x0023:
            com.bytedance.jedi.ext.adapter.decorator.internal.EmptyHolder r2 = new com.bytedance.jedi.ext.adapter.decorator.internal.EmptyHolder
            r2.<init>(r0)
            android.support.v7.widget.RecyclerView$ViewHolder r2 = (android.support.v7.widget.RecyclerView.ViewHolder) r2
            r1.a((android.support.v7.widget.RecyclerView.ViewHolder) r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.decorator.internal.b.a(android.view.ViewGroup):android.support.v7.widget.RecyclerView$ViewHolder");
    }
}
