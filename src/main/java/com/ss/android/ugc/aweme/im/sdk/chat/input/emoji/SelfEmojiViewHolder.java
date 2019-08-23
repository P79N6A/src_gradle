package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class SelfEmojiViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50545a;

    /* renamed from: b  reason: collision with root package name */
    RemoteImageView f50546b = ((RemoteImageView) this.itemView.findViewById(C0906R.id.b2e));

    /* renamed from: c  reason: collision with root package name */
    ImageView f50547c = ((ImageView) this.itemView.findViewById(C0906R.id.sc));

    /* renamed from: d  reason: collision with root package name */
    public View.OnClickListener f50548d;

    public SelfEmojiViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0i, viewGroup, false));
    }
}
