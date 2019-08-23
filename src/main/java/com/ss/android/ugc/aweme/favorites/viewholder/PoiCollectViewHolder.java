package com.ss.android.ugc.aweme.favorites.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.discover.adapter.PoiItemViewHolder;
import com.ss.android.ugc.aweme.favorites.d.a;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;

public class PoiCollectViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, a.C0553a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44390a;

    /* renamed from: b  reason: collision with root package name */
    public PoiItemViewHolder f44391b;

    /* renamed from: c  reason: collision with root package name */
    public PoiStruct f44392c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44390a, false, 39704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44390a, false, 39704, new Class[0], Void.TYPE);
            return;
        }
        if (this.f44392c != null) {
            a.a(1, this.f44392c.poiId);
        }
    }

    public PoiCollectViewHolder(View view) {
        super(view);
        this.f44391b = new PoiItemViewHolder(view, af.a(d.a()).f());
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f44390a, false, 39703, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f44390a, false, 39703, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (this.f44392c != null) {
            PoiDetailActivity.a(this.itemView.getContext(), new l.a().c(this.f44392c.getPoiId()).g(this.f44392c.getPoiName()).a(this.f44392c).i("collection_poi").l("click_collection_poi").o(PushConstants.PUSH_TYPE_NOTIFY).a());
            a.a(2, this.f44392c.poiId);
        }
    }
}
