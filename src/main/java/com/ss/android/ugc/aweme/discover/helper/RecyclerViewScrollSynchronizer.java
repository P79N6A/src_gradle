package com.ss.android.ugc.aweme.discover.helper;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\u00060\tR\u00020\u00008BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u001f\u0010\u000f\u001a\u00060\tR\u00020\u00008BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/helper/RecyclerViewScrollSynchronizer;", "", "first", "Landroid/support/v7/widget/RecyclerView;", "second", "(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView;)V", "getFirst", "()Landroid/support/v7/widget/RecyclerView;", "firstListener", "Lcom/ss/android/ugc/aweme/discover/helper/RecyclerViewScrollSynchronizer$RecyclerViewListener;", "getFirstListener", "()Lcom/ss/android/ugc/aweme/discover/helper/RecyclerViewScrollSynchronizer$RecyclerViewListener;", "firstListener$delegate", "Lkotlin/Lazy;", "getSecond", "secondListener", "getSecondListener", "secondListener$delegate", "syncInnerX", "", "recyclerView", "dx", "", "syncInnerY", "dy", "RecyclerViewListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecyclerViewScrollSynchronizer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42304a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f42305b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RecyclerViewScrollSynchronizer.class), "firstListener", "getFirstListener()Lcom/ss/android/ugc/aweme/discover/helper/RecyclerViewScrollSynchronizer$RecyclerViewListener;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RecyclerViewScrollSynchronizer.class), "secondListener", "getSecondListener()Lcom/ss/android/ugc/aweme/discover/helper/RecyclerViewScrollSynchronizer$RecyclerViewListener;"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f42306c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f42307d;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f42308e = e.a(new a(this));

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f42309f = e.a(new b(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/helper/RecyclerViewScrollSynchronizer$RecyclerViewListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "(Lcom/ss/android/ugc/aweme/discover/helper/RecyclerViewScrollSynchronizer;)V", "onScrolled", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "dx", "", "dy", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    final class RecyclerViewListener extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42310a;

        public RecyclerViewListener() {
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            RecyclerView recyclerView2 = recyclerView;
            int i3 = i;
            int i4 = i2;
            if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42310a, false, 36342, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42310a, false, 36342, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
            if (recyclerView.getScrollState() != 0) {
                RecyclerViewScrollSynchronizer recyclerViewScrollSynchronizer = RecyclerViewScrollSynchronizer.this;
                if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i)}, recyclerViewScrollSynchronizer, RecyclerViewScrollSynchronizer.f42304a, false, 36340, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    RecyclerViewScrollSynchronizer recyclerViewScrollSynchronizer2 = recyclerViewScrollSynchronizer;
                    PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i)}, recyclerViewScrollSynchronizer2, RecyclerViewScrollSynchronizer.f42304a, false, 36340, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                } else if (Intrinsics.areEqual((Object) recyclerView2, (Object) recyclerViewScrollSynchronizer.f42306c)) {
                    recyclerViewScrollSynchronizer.f42307d.scrollBy(i3, 0);
                } else if (Intrinsics.areEqual((Object) recyclerView2, (Object) recyclerViewScrollSynchronizer.f42307d)) {
                    recyclerViewScrollSynchronizer.f42306c.scrollBy(i3, 0);
                }
                RecyclerViewScrollSynchronizer recyclerViewScrollSynchronizer3 = RecyclerViewScrollSynchronizer.this;
                if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i2)}, recyclerViewScrollSynchronizer3, RecyclerViewScrollSynchronizer.f42304a, false, 36341, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    RecyclerViewScrollSynchronizer recyclerViewScrollSynchronizer4 = recyclerViewScrollSynchronizer3;
                    PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i2)}, recyclerViewScrollSynchronizer4, RecyclerViewScrollSynchronizer.f42304a, false, 36341, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                } else if (Intrinsics.areEqual((Object) recyclerView2, (Object) recyclerViewScrollSynchronizer3.f42306c)) {
                    recyclerViewScrollSynchronizer3.f42307d.scrollBy(0, i4);
                } else if (Intrinsics.areEqual((Object) recyclerView2, (Object) recyclerViewScrollSynchronizer3.f42307d)) {
                    recyclerViewScrollSynchronizer3.f42306c.scrollBy(0, i4);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/helper/RecyclerViewScrollSynchronizer$RecyclerViewListener;", "Lcom/ss/android/ugc/aweme/discover/helper/RecyclerViewScrollSynchronizer;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<RecyclerViewListener> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecyclerViewScrollSynchronizer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(RecyclerViewScrollSynchronizer recyclerViewScrollSynchronizer) {
            super(0);
            this.this$0 = recyclerViewScrollSynchronizer;
        }

        @NotNull
        public final RecyclerViewListener invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36343, new Class[0], RecyclerViewListener.class)) {
                return new RecyclerViewListener();
            }
            return (RecyclerViewListener) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36343, new Class[0], RecyclerViewListener.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/helper/RecyclerViewScrollSynchronizer$RecyclerViewListener;", "Lcom/ss/android/ugc/aweme/discover/helper/RecyclerViewScrollSynchronizer;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<RecyclerViewListener> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecyclerViewScrollSynchronizer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RecyclerViewScrollSynchronizer recyclerViewScrollSynchronizer) {
            super(0);
            this.this$0 = recyclerViewScrollSynchronizer;
        }

        @NotNull
        public final RecyclerViewListener invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36344, new Class[0], RecyclerViewListener.class)) {
                return new RecyclerViewListener();
            }
            return (RecyclerViewListener) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36344, new Class[0], RecyclerViewListener.class);
        }
    }

    public RecyclerViewScrollSynchronizer(@NotNull RecyclerView recyclerView, @NotNull RecyclerView recyclerView2) {
        Object value;
        Object value2;
        Intrinsics.checkParameterIsNotNull(recyclerView, "first");
        Intrinsics.checkParameterIsNotNull(recyclerView2, "second");
        this.f42306c = recyclerView;
        this.f42307d = recyclerView2;
        RecyclerView recyclerView3 = this.f42306c;
        if (PatchProxy.isSupport(new Object[0], this, f42304a, false, 36338, new Class[0], RecyclerViewListener.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f42304a, false, 36338, new Class[0], RecyclerViewListener.class);
        } else {
            value = this.f42308e.getValue();
        }
        recyclerView3.addOnScrollListener((RecyclerViewListener) value);
        RecyclerView recyclerView4 = this.f42307d;
        if (PatchProxy.isSupport(new Object[0], this, f42304a, false, 36339, new Class[0], RecyclerViewListener.class)) {
            value2 = PatchProxy.accessDispatch(new Object[0], this, f42304a, false, 36339, new Class[0], RecyclerViewListener.class);
        } else {
            value2 = this.f42309f.getValue();
        }
        recyclerView4.addOnScrollListener((RecyclerViewListener) value2);
    }
}
