package com.ss.android.ugc.aweme.commerce.preview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.preview.api.a.b;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/ProductCommentAdapter;", "Lcom/ss/android/ugc/aweme/common/adapter/BaseAdapter;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewCommentListResponse$Comment;", "()V", "mOnClickListener", "Lcom/ss/android/ugc/aweme/commerce/preview/OnItemClickListener;", "onBindBasicViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "position", "", "onCreateBasicViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnClickListener", "itemClickListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProductCommentAdapter extends BaseAdapter<b.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37281a;

    /* renamed from: b  reason: collision with root package name */
    d f37282b;

    public final void onBindBasicViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f37281a, false, 28802, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f37281a, false, 28802, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        b.a aVar = (b.a) this.mItems.get(i);
        Intrinsics.checkExpressionValueIsNotNull(aVar, "comment");
        ((CommentItemViewHolder) viewHolder2).a(aVar);
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(@NotNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f37281a, false, 28803, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f37281a, false, 28803, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.hp, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new CommentItemViewHolder(inflate, this.f37282b);
    }
}
