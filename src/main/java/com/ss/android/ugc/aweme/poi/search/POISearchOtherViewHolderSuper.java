package com.ss.android.ugc.aweme.poi.search;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.b.c;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ed;

public class POISearchOtherViewHolderSuper extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60315a;

    /* renamed from: b  reason: collision with root package name */
    TextView f60316b;

    /* renamed from: c  reason: collision with root package name */
    TextView f60317c;

    /* renamed from: d  reason: collision with root package name */
    View f60318d;

    /* renamed from: e  reason: collision with root package name */
    View f60319e;

    /* renamed from: f  reason: collision with root package name */
    View f60320f;
    PoiStruct g;
    String h;
    int i = -1;
    boolean j;
    private LinearLayout k;

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60315a, false, 65734, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60315a, false, 65734, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.axa) {
            if (this.g != null) {
                this.g.put("keyword", this.h);
                this.g.put("order", String.valueOf(this.i));
            }
            bg.a(new c(2, this.g));
            return;
        }
        if (id == C0906R.id.bqz) {
            bg.a(new c(1));
        }
    }

    public POISearchOtherViewHolderSuper(View view, boolean z) {
        super(view);
        this.j = z;
        this.f60316b = (TextView) view.findViewById(C0906R.id.axb);
        this.f60317c = (TextView) view.findViewById(C0906R.id.ax6);
        this.f60318d = view.findViewById(C0906R.id.ax8);
        this.f60319e = view.findViewById(C0906R.id.ax_);
        this.k = (LinearLayout) view.findViewById(C0906R.id.axa);
        this.f60320f = view.findViewById(C0906R.id.bqz);
        this.k.setOnClickListener(this);
        this.f60320f.setOnClickListener(this);
        this.k.setOnTouchListener(ed.a(0.5f, 1.0f));
    }
}
