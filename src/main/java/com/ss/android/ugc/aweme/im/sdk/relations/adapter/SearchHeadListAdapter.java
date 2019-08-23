package com.ss.android.ugc.aweme.im.sdk.relations.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B4\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u0018\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016Ra\u0010\f\u001aI\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/SearchHeadListAdapter;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter;", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "contact", "", "(Landroid/arch/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V", "mActionListener", "Lkotlin/Function3;", "", "type", "position", "Landroid/view/View;", "view", "getMActionListener", "()Lkotlin/jvm/functions/Function3;", "setMActionListener", "(Lkotlin/jvm/functions/Function3;)V", "mLeftMargin", "adjustLayoutParams", "holder", "Lcom/ss/android/ugc/aweme/im/sdk/relations/viewholder/BaseSelectViewHolder;", "onCreateBasicViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchHeadListAdapter extends BaseSelectListAdapter<IMContact> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f52100b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52101c = ((int) UIUtils.dip2Px(this.f52069f, 16.0f));
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private Function3<? super Integer, ? super Integer, ? super View, Unit> f52102d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "type", "", "position", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function3<Integer, Integer, View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $callback;
        final /* synthetic */ SearchHeadListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SearchHeadListAdapter searchHeadListAdapter, Function1 function1) {
            super(3);
            this.this$0 = searchHeadListAdapter;
            this.$callback = function1;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (View) obj3);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, int i2, @NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), view2}, this, changeQuickRedirect, false, 52897, new Class[]{Integer.TYPE, Integer.TYPE, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), view2}, this, changeQuickRedirect, false, 52897, new Class[]{Integer.TYPE, Integer.TYPE, View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            if (i == 1) {
                int i3 = i2;
                IMContact iMContact = (IMContact) this.this$0.a(i2);
                if (iMContact != null) {
                    Function1 function1 = this.$callback;
                    if (function1 != null) {
                        function1.invoke(iMContact);
                    }
                }
            }
        }
    }

    @Nullable
    public final Function3<Integer, Integer, View, Unit> c() {
        return this.f52102d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchHeadListAdapter(@NotNull LifecycleOwner lifecycleOwner, @Nullable Function1<? super IMContact, Unit> function1) {
        super(lifecycleOwner);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        this.f52102d = new a(this, function1);
    }

    @NotNull
    public final BaseSelectViewHolder<IMContact> a(@NotNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f52100b, false, 52895, new Class[]{ViewGroup.class, Integer.TYPE}, BaseSelectViewHolder.class)) {
            return (BaseSelectViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f52100b, false, 52895, new Class[]{ViewGroup.class, Integer.TYPE}, BaseSelectViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        return new SearchViewHolder<>(viewGroup2);
    }

    public final void a(@NotNull BaseSelectViewHolder<IMContact> baseSelectViewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{baseSelectViewHolder, Integer.valueOf(i)}, this, f52100b, false, 52896, new Class[]{BaseSelectViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseSelectViewHolder, Integer.valueOf(i)}, this, f52100b, false, 52896, new Class[]{BaseSelectViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseSelectViewHolder, "holder");
        View view = baseSelectViewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            if (i == getItemCount() - 1) {
                layoutParams2.setMargins(this.f52101c, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams2.setMarginStart(this.f52101c);
                    return;
                }
            } else {
                layoutParams2.setMargins(0, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams2.setMarginStart(0);
                }
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
    }
}
