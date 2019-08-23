package com.ss.android.ugc.aweme.hotsearch.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class UpdateTimeViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49957a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f49958b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f49959c;

    /* renamed from: d  reason: collision with root package name */
    public Animation f49960d;

    public UpdateTimeViewHolder(View view) {
        super(view);
        this.f49958b = (ImageView) view.findViewById(C0906R.id.b2w);
        this.f49959c = (TextView) view.findViewById(C0906R.id.ddh);
        if (PatchProxy.isSupport(new Object[0], this, f49957a, false, 49898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49957a, false, 49898, new Class[0], Void.TYPE);
            return;
        }
        this.f49960d = AnimationUtils.loadAnimation(this.itemView.getContext(), C0906R.anim.cf);
    }
}
