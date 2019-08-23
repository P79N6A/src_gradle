package com.ss.android.ugc.aweme.miniapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class RecentlyMicroAppViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55458a;

    /* renamed from: b  reason: collision with root package name */
    TextView f55459b;

    /* renamed from: c  reason: collision with root package name */
    TextView f55460c;

    /* renamed from: d  reason: collision with root package name */
    RemoteImageView f55461d;

    RecentlyMicroAppViewHolder(View view) {
        super(view);
        if (PatchProxy.isSupport(new Object[]{view}, this, f55458a, false, 59173, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55458a, false, 59173, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f55459b = (TextView) view.findViewById(C0906R.id.bn2);
        this.f55461d = (RemoteImageView) view.findViewById(C0906R.id.bmw);
        this.f55460c = (TextView) view.findViewById(C0906R.id.bmy);
    }
}
