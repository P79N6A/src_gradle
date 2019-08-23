package com.ss.android.ugc.aweme.feed.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.feed.ui.aj;
import com.ss.android.ugc.aweme.feed.widget.CityViewTagLayout;

public class CityListHeadViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44672a;

    /* renamed from: b  reason: collision with root package name */
    CityViewTagLayout f44673b;

    /* renamed from: c  reason: collision with root package name */
    TextView f44674c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f44675d;

    /* renamed from: e  reason: collision with root package name */
    CityViewTagLayout f44676e;

    /* renamed from: f  reason: collision with root package name */
    public aj f44677f;
    View g;

    public CityListHeadViewHolder(View view, aj ajVar) {
        super(view);
        this.g = view.findViewById(C0906R.id.alp);
        this.f44673b = (CityViewTagLayout) view.findViewById(C0906R.id.ao8);
        this.f44674c = (TextView) view.findViewById(C0906R.id.sv);
        this.f44675d = (TextView) view.findViewById(C0906R.id.dan);
        this.f44676e = (CityViewTagLayout) view.findViewById(C0906R.id.ap4);
        this.f44675d.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44678a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44678a, false, 40339, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44678a, false, 40339, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!(CityListHeadViewHolder.this.f44677f == null || CityListHeadViewHolder.this.f44675d.getTag() == null || !(CityListHeadViewHolder.this.f44675d.getTag() instanceof NearbyCities.CityBean))) {
                    NearbyCities.CityBean cityBean = (NearbyCities.CityBean) CityListHeadViewHolder.this.f44675d.getTag();
                    if (!TextUtils.isEmpty(cityBean.name)) {
                        CityListHeadViewHolder.this.f44677f.a(cityBean);
                    }
                }
            }
        });
        this.f44676e.setListener(new CityViewTagLayout.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44680a;

            public final void a(NearbyCities.CityBean cityBean) {
                if (PatchProxy.isSupport(new Object[]{cityBean}, this, f44680a, false, 40340, new Class[]{NearbyCities.CityBean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cityBean}, this, f44680a, false, 40340, new Class[]{NearbyCities.CityBean.class}, Void.TYPE);
                    return;
                }
                if (CityListHeadViewHolder.this.f44677f != null) {
                    CityListHeadViewHolder.this.f44677f.a(cityBean);
                }
            }
        });
        this.f44673b.setListener(new CityViewTagLayout.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44682a;

            public final void a(NearbyCities.CityBean cityBean) {
                if (PatchProxy.isSupport(new Object[]{cityBean}, this, f44682a, false, 40341, new Class[]{NearbyCities.CityBean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cityBean}, this, f44682a, false, 40341, new Class[]{NearbyCities.CityBean.class}, Void.TYPE);
                    return;
                }
                if (CityListHeadViewHolder.this.f44677f != null) {
                    CityListHeadViewHolder.this.f44677f.a(cityBean);
                }
            }
        });
        this.f44677f = ajVar;
    }
}
