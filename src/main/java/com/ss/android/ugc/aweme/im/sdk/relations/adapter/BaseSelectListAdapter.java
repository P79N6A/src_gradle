package com.ss.android.ugc.aweme.im.sdk.relations.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.arch.adpater.BaseDiffableAdapter;
import com.ss.android.ugc.aweme.im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.ss.android.ugc.aweme.im.sdk.relations.viewholder.HeaderViewHolder;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 )*\u0004\b\u0000\u0010\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0004:\u0001)B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u000fJ\u001e\u0010\u001e\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010 \u001a\u00020\nH\u0016J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001e\u0010\"\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\nH&J\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\nJ\u0006\u0010(\u001a\u00020\u0011Ra\u0010\b\u001aI\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter;", "T", "Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/BaseDiffableAdapter;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/viewholder/BaseSelectViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/ViewModelOwner;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "mActionListener", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "type", "position", "Landroid/view/View;", "view", "", "getMActionListener", "()Lkotlin/jvm/functions/Function3;", "setMActionListener", "(Lkotlin/jvm/functions/Function3;)V", "mBottomMargin", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mHeaderView", "addHeaderView", "headerView", "adjustLayoutParams", "holder", "getHeaderViewCount", "getItemViewType", "onBindViewHolder", "onCreateBasicViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onCreateViewHolder", "removeHeaderView", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class BaseSelectListAdapter<T> extends BaseDiffableAdapter<BaseSelectViewHolder<T>, T> {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f52066e;
    public static final a h = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final int f52067b = ((int) UIUtils.dip2Px(this.f52069f, 40.0f));
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private Function3<? super Integer, ? super Integer, ? super View, Unit> f52068c;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final Context f52069f;
    public View g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter$Companion;", "", "()V", "TYPE_HEADER", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @NotNull
    public abstract BaseSelectViewHolder<T> a(@NotNull ViewGroup viewGroup, int i);

    @Nullable
    public Function3<Integer, Integer, View, Unit> c() {
        return this.f52068c;
    }

    public final int b() {
        if (this.g == null) {
            return 0;
        }
        return 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseSelectListAdapter(@NotNull LifecycleOwner lifecycleOwner) {
        super(null, 1);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        this.f52069f = (Context) lifecycleOwner;
    }

    public final void a(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f52066e, false, 52839, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f52066e, false, 52839, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "headerView");
        if (this.g == null) {
            this.g = view;
            notifyItemInserted(0);
            return;
        }
        if (!Intrinsics.areEqual((Object) this.g, (Object) view)) {
            this.g = view;
            notifyItemChanged(0);
        }
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52066e, false, 52837, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52066e, false, 52837, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i < b()) {
            return Integer.MAX_VALUE;
        } else {
            return super.getItemViewType(i);
        }
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        BaseSelectViewHolder baseSelectViewHolder = (BaseSelectViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{baseSelectViewHolder, Integer.valueOf(i)}, this, f52066e, false, 52836, new Class[]{BaseSelectViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseSelectViewHolder, Integer.valueOf(i)}, this, f52066e, false, 52836, new Class[]{BaseSelectViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseSelectViewHolder, "holder");
        if (i >= b()) {
            a(baseSelectViewHolder, i);
            Object a2 = a(i);
            if (a2 != null) {
                baseSelectViewHolder.a(a2, a(i - 1), i);
                baseSelectViewHolder.f52238d = c();
            }
        }
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        BaseSelectViewHolder baseSelectViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f52066e, false, 52835, new Class[]{ViewGroup.class, Integer.TYPE}, BaseSelectViewHolder.class)) {
            baseSelectViewHolder = (BaseSelectViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f52066e, false, 52835, new Class[]{ViewGroup.class, Integer.TYPE}, BaseSelectViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            if (i == Integer.MAX_VALUE) {
                View view = this.g;
                if (view == null) {
                    Intrinsics.throwNpe();
                }
                baseSelectViewHolder = new HeaderViewHolder(view);
            } else {
                baseSelectViewHolder = a(viewGroup, i);
            }
        }
        return baseSelectViewHolder;
    }

    public void a(@NotNull BaseSelectViewHolder<T> baseSelectViewHolder, int i) {
        BaseSelectViewHolder<T> baseSelectViewHolder2 = baseSelectViewHolder;
        if (PatchProxy.isSupport(new Object[]{baseSelectViewHolder2, Integer.valueOf(i)}, this, f52066e, false, 52838, new Class[]{BaseSelectViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseSelectViewHolder2, Integer.valueOf(i)}, this, f52066e, false, 52838, new Class[]{BaseSelectViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseSelectViewHolder2, "holder");
        View view = baseSelectViewHolder2.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            if (i == getItemCount() - 1) {
                layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, this.f52067b);
                return;
            }
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
    }
}
