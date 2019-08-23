package com.ss.android.ugc.aweme.poi.search;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.b.c;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ed;

public class POISearchViewHolderSuper extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60321a;

    /* renamed from: b  reason: collision with root package name */
    TextView f60322b;

    /* renamed from: c  reason: collision with root package name */
    TextView f60323c;

    /* renamed from: d  reason: collision with root package name */
    TextView f60324d;

    /* renamed from: e  reason: collision with root package name */
    View f60325e;

    /* renamed from: f  reason: collision with root package name */
    PoiStruct f60326f;
    String g;
    int h = -1;
    boolean i;
    private View j;

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60321a, false, 65738, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60321a, false, 65738, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.axa) {
            if (this.f60326f != null) {
                this.f60326f.put("keyword", this.g);
                this.f60326f.put("order", String.valueOf(this.h));
            }
            bg.a(new c(2, this.f60326f));
            return;
        }
        if (id == C0906R.id.bqz) {
            bg.a(new c(1));
        }
    }

    public POISearchViewHolderSuper(View view, boolean z) {
        super(view);
        this.i = z;
        this.f60325e = view.findViewById(C0906R.id.bqz);
        this.f60325e.setOnClickListener(this);
        this.f60322b = (TextView) view.findViewById(C0906R.id.ax6);
        this.f60323c = (TextView) view.findViewById(C0906R.id.ax7);
        this.f60324d = (TextView) view.findViewById(C0906R.id.ax9);
        this.j = view.findViewById(C0906R.id.axa);
        this.j.setOnClickListener(this);
        this.j.setOnTouchListener(ed.a(0.5f, 1.0f));
    }
}
