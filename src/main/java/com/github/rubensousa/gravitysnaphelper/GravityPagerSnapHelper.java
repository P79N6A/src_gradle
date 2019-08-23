package com.github.rubensousa.gravitysnaphelper;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class GravityPagerSnapHelper extends PagerSnapHelper {

    /* renamed from: a  reason: collision with root package name */
    private a f24390a;

    @Nullable
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return this.f24390a.a(layoutManager);
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        this.f24390a.a(recyclerView);
        super.attachToRecyclerView(recyclerView);
    }

    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        return this.f24390a.a(layoutManager, view);
    }
}
