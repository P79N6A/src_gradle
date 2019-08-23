package com.ss.android.ugc.aweme.notification.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR#\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u00038BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/adapter/FansRecommendTitleHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mLine", "kotlin.jvm.PlatformType", "getMLine", "()Landroid/view/View;", "mLine$delegate", "Lkotlin/Lazy;", "bind", "", "position", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FansRecommendTitleHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57893a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f57894b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansRecommendTitleHolder.class), "mLine", "getMLine()Landroid/view/View;"))};

    /* renamed from: c  reason: collision with root package name */
    final Lazy f57895c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ View $view;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.$view = view;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63018, new Class[0], View.class)) {
                return this.$view.findViewById(C0906R.id.bbl);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63018, new Class[0], View.class);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FansRecommendTitleHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f57895c = LazyKt.lazy(new a(view));
    }
}
