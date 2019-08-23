package com.ss.android.ugc.aweme.base.widget.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.ss.android.ugc.aweme.base.mvvm.d;

public class BaseViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public d f35176a;

    /* renamed from: b  reason: collision with root package name */
    public int f35177b;

    private BaseViewHolder(View view) {
        super(view);
        this.f35177b = -1;
    }

    public BaseViewHolder(d dVar) {
        this(dVar.getAndroidView());
        this.f35176a = dVar;
    }
}
