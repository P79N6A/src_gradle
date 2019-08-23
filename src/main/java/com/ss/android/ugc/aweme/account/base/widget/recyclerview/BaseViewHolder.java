package com.ss.android.ugc.aweme.account.base.widget.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.ss.android.ugc.aweme.base.mvvm.d;

public class BaseViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public d f31795a;

    /* renamed from: b  reason: collision with root package name */
    public int f31796b;

    private BaseViewHolder(View view) {
        super(view);
        this.f31796b = -1;
    }

    public BaseViewHolder(d dVar) {
        this(dVar.getAndroidView());
        this.f31795a = dVar;
    }
}
