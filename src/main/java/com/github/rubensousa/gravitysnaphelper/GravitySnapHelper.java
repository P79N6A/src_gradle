package com.github.rubensousa.gravitysnaphelper;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class GravitySnapHelper extends LinearSnapHelper {

    /* renamed from: a  reason: collision with root package name */
    private a f24391a;

    public interface a {
    }

    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return this.f24391a.a(layoutManager);
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        this.f24391a.a(recyclerView);
        super.attachToRecyclerView(recyclerView);
    }

    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        return this.f24391a.a(layoutManager, view);
    }
}
