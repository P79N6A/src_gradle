package com.ss.android.ugc.aweme.shortvideo.cut;

import android.support.v7.widget.RecyclerView;
import android.view.ViewPropertyAnimator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/ItemTouchHelperAdapter;", "", "getRecoverAnimation", "Landroid/view/ViewPropertyAnimator;", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "onItemSelected", "", "state", "", "onItemUnselected", "isSelectedChanged", "", "onSwapItem", "sourceHolder", "targetHolder", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface aj {
    @NotNull
    ViewPropertyAnimator a(@NotNull RecyclerView.ViewHolder viewHolder);

    void a(@NotNull RecyclerView.ViewHolder viewHolder, int i);

    void a(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2);

    void a(@NotNull RecyclerView.ViewHolder viewHolder, boolean z);
}
