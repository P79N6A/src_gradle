package com.ss.android.ugc.aweme.feed.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.feed.ui.aj;

public class CityItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44663a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f44664b;

    /* renamed from: c  reason: collision with root package name */
    NearbyCities.CityBean f44665c;

    /* renamed from: d  reason: collision with root package name */
    public aj f44666d;

    public CityItemViewHolder(View view, aj ajVar) {
        super(view);
        this.f44664b = (TextView) view.findViewById(C0906R.id.d_e);
        this.f44664b.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44667a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44667a, false, 40330, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44667a, false, 40330, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!(CityItemViewHolder.this.f44666d == null || CityItemViewHolder.this.f44664b.getTag() == null || !(CityItemViewHolder.this.f44664b.getTag() instanceof NearbyCities.CityBean))) {
                    CityItemViewHolder.this.f44666d.a((NearbyCities.CityBean) CityItemViewHolder.this.f44664b.getTag());
                }
            }
        });
        this.f44666d = ajVar;
    }
}
