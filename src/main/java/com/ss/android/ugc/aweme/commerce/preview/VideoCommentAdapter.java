package com.ss.android.ugc.aweme.commerce.preview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.service.logs.e;
import com.ss.android.ugc.aweme.common.adapter.AnimatedAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0014J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/VideoCommentAdapter;", "Lcom/ss/android/ugc/aweme/common/adapter/AnimatedAdapter;", "()V", "mOnClickListener", "Lcom/ss/android/ugc/aweme/commerce/preview/OnClickListener;", "watchList", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "onBindFooterViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "onBindItemViewHolder", "position", "", "onCreateFooterViewHolder", "parent", "Landroid/view/ViewGroup;", "onCreateItemViewHolder", "viewType", "setOnClickListener", "loadMoreClickListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoCommentAdapter extends AnimatedAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f37283f;
    c g;
    private final HashSet<String> i = new HashSet<>();

    public final void onBindFooterViewHolder(@NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f37283f, false, 28810, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f37283f, false, 28810, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateFooterViewHolder(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f37283f, false, 28813, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f37283f, false, 28813, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ht, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new CoverMoreViewHolder(inflate, this.g);
    }

    @Nullable
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f37283f, false, 28812, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f37283f, false, 28812, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.hs, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new CoverViewHolder(inflate, this.g);
    }

    public final void a(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f37283f, false, 28811, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f37283f, false, 28811, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        Aweme aweme = (Aweme) this.mItems.get(i2);
        ((CoverViewHolder) viewHolder).a(aweme, i2);
        HashSet<String> hashSet = this.i;
        Intrinsics.checkExpressionValueIsNotNull(aweme, "video");
        if (!hashSet.contains(aweme.getAid())) {
            new e().a("unboxing_page").b(aweme.getAid()).c(aweme.getRecallType()).b();
            this.i.add(aweme.getAid());
        }
    }
}
