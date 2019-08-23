package com.ss.android.ugc.aweme.miniapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class MostUseMicroAppViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55449a;

    /* renamed from: b  reason: collision with root package name */
    TextView f55450b;

    /* renamed from: c  reason: collision with root package name */
    RemoteImageView f55451c;

    /* renamed from: d  reason: collision with root package name */
    Context f55452d;

    MostUseMicroAppViewHolder(View view) {
        super(view);
        if (PatchProxy.isSupport(new Object[]{view}, this, f55449a, false, 59155, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55449a, false, 59155, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f55451c = (RemoteImageView) view.findViewById(C0906R.id.bmw);
            this.f55450b = (TextView) view.findViewById(C0906R.id.bmy);
        }
        this.f55452d = view.getContext();
    }
}
