package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020\u001eH\u0016R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0005R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\u0016X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/decorator/internal/IDelegate;", "", "fullSpan", "", "getFullSpan", "()Z", "setFullSpan", "(Z)V", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "getHolder", "()Landroid/support/v7/widget/RecyclerView$ViewHolder;", "setHolder", "(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V", "isEnable", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "viewCount", "", "getViewCount", "()I", "viewType", "getViewType", "setViewType", "(I)V", "applyFullSpan", "", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "updateViewType", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public interface e {
    @NotNull
    RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup);

    void a(boolean z);

    boolean a();

    @Nullable
    View b();

    @Nullable
    RecyclerView.ViewHolder c();

    boolean d();

    int f();
}
