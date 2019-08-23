package com.ss.android.ugc.aweme.shortvideo.sticker.ar.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class FaceMattingNormalViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f69459a;

    /* renamed from: b  reason: collision with root package name */
    public RemoteImageView f69460b;

    public FaceMattingNormalViewHolder(@NonNull View view) {
        super(view);
        this.f69459a = (ImageView) view.findViewById(C0906R.id.b13);
        this.f69460b = (RemoteImageView) view.findViewById(C0906R.id.b12);
    }
}
