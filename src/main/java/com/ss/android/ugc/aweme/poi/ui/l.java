package com.ss.android.ugc.aweme.poi.ui;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.widget.c;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60818a;

    /* renamed from: b  reason: collision with root package name */
    private final j f60819b;

    l(j jVar) {
        this.f60819b = jVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60818a, false, 66018, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60818a, false, 66018, new Class[0], Void.TYPE);
            return;
        }
        j jVar = this.f60819b;
        if (jVar.f60809b != null && jVar.f60809b.isViewValid() && jVar.a() != null) {
            if (jVar.f60811d == null || !jVar.f60811d.isShowing()) {
                jVar.f60811d = new c(jVar.a());
                View inflate = ((LayoutInflater) jVar.a().getApplicationContext().getSystemService("layout_inflater")).inflate(C0906R.layout.ar_, null);
                ((DmtTextView) inflate.findViewById(C0906R.id.d05)).setText(C0906R.string.bo2);
                ((DmtTextView) inflate.findViewById(C0906R.id.d06)).setText(C0906R.string.boq);
                inflate.setOnClickListener(new m(jVar));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = (int) UIUtils.dip2Px(jVar.a(), 4.0f);
                inflate.findViewById(C0906R.id.d06).setLayoutParams(layoutParams);
                jVar.f60811d.a((int) UIUtils.dip2Px(jVar.a(), 202.0f), (int) UIUtils.dip2Px(jVar.a(), 50.0f));
                c cVar = jVar.f60811d;
                int parseColor = Color.parseColor("#33FFFFFF");
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(parseColor)}, cVar, c.f61054a, false, 66958, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(parseColor)}, cVar, c.f61054a, false, 66958, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (cVar.f61056c != null) {
                    cVar.f61056c.setBorderColor(parseColor);
                }
                jVar.f60811d.r = 500;
                jVar.f60811d.s = 300;
                jVar.f60811d.a(inflate);
                jVar.f60811d.o = 3000;
                int i = jVar.f60813f ? -16 : -4;
                float width = (float) ((jVar.f60811d.getWidth() - jVar.f60812e.getWidth()) / 2);
                jVar.f60811d.j = i;
                jVar.f60811d.a(jVar.f60812e, (int) width, (int) (-width));
            }
        }
    }
}
