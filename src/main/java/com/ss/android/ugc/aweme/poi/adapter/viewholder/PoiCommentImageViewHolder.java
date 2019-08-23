package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.poi.adapter.b;

public class PoiCommentImageViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59509a;

    /* renamed from: b  reason: collision with root package name */
    public b f59510b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f59511c;

    /* renamed from: d  reason: collision with root package name */
    public RemoteImageView f59512d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f59513e;

    public PoiCommentImageViewHolder(Context context, View view, b bVar) {
        super(view);
        this.f59510b = bVar;
        this.f59512d = (RemoteImageView) view.findViewById(C0906R.id.bzq);
        this.f59513e = (TextView) view.findViewById(C0906R.id.bzp);
        this.f59511c = context;
    }
}
