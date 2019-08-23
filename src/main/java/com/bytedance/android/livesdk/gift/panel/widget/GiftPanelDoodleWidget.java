package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.DoodleCanvasView;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView;
import com.bytedance.android.livesdk.gift.p;
import com.bytedance.android.livesdk.gift.panel.a.b;
import com.bytedance.ies.sdk.widgets.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class GiftPanelDoodleWidget extends Widget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15298a;

    /* renamed from: b  reason: collision with root package name */
    View f15299b;

    /* renamed from: c  reason: collision with root package name */
    View f15300c;

    /* renamed from: d  reason: collision with root package name */
    View f15301d;

    /* renamed from: e  reason: collision with root package name */
    View f15302e;

    /* renamed from: f  reason: collision with root package name */
    TextView f15303f;
    DoodleCanvasView g;
    public GiftDialogViewModel h;
    private View i;
    private DoodleGiftView j;

    public int getLayoutId() {
        return C0906R.layout.ag5;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f15298a, false, 10008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15298a, false, 10008, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.h != null) {
            this.h.a(this);
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f15298a, false, 10003, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15298a, false, 10003, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        if (this.dataCenter != null) {
            this.h = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
            if (PatchProxy.isSupport(new Object[0], this, f15298a, false, 10004, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f15298a, false, 10004, new Class[0], Void.TYPE);
            } else {
                this.f15299b = this.contentView.findViewById(C0906R.id.ajl);
                this.f15300c = this.contentView.findViewById(C0906R.id.dny);
                this.f15301d = this.contentView.findViewById(C0906R.id.t7);
                this.i = this.contentView.findViewById(C0906R.id.tq);
                this.f15302e = this.contentView.findViewById(C0906R.id.a6_);
                this.f15303f = (TextView) this.contentView.findViewById(C0906R.id.cnr);
                this.g = (DoodleCanvasView) this.contentView.findViewById(C0906R.id.ajn);
                this.j = (DoodleGiftView) this.contentView.findViewById(C0906R.id.a7y);
                this.f15299b.setVisibility(8);
                this.g.setDrawDoodleGiftView(this.j);
                this.g.setDoodleCanvasListener(new DoodleCanvasView.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f15304a;

                    public final void a(List<p> list, int i, int i2, int i3) {
                        List<p> list2 = list;
                        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f15304a, false, 10016, new Class[]{List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f15304a, false, 10016, new Class[]{List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        } else if (list2 == null || list.isEmpty()) {
                            GiftPanelDoodleWidget.this.h.t.postValue(null);
                        } else {
                            GiftPanelDoodleWidget.this.h.t.postValue(new b(list, i, i2, i3));
                        }
                    }
                });
                this.f15300c.setOnClickListener(new m(this));
                this.f15301d.setOnClickListener(new n(this));
                this.i.setOnClickListener(new o(this));
            }
            this.h.t.observe(this, new i(this));
            this.h.s.observe(this, new j(this));
            this.h.u.observe(this, new k(this));
            this.h.n.observe(this, new l(this));
        }
    }
}
