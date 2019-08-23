package com.ss.android.ugc.aweme.poi.nearby.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.poi.PoiOptionStruct;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiFilterDetailAdapter;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;

public final class a extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60102a;

    /* renamed from: b  reason: collision with root package name */
    private Context f60103b;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f60104c;

    /* renamed from: d  reason: collision with root package name */
    private PoiFilterDetailAdapter f60105d;

    /* renamed from: e  reason: collision with root package name */
    private PoiFilterDetailAdapter.a f60106e;

    public final void a(List<PoiOptionStruct> list) {
        List<PoiOptionStruct> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f60102a, false, 65359, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f60102a, false, 65359, new Class[]{List.class}, Void.TYPE);
            return;
        }
        int dip2Px = ((int) UIUtils.dip2Px(this.f60103b, (float) (list.size() * 52))) + 30;
        int dip2Px2 = (int) UIUtils.dip2Px(this.f60103b, 394.0f);
        if (dip2Px > dip2Px2) {
            dip2Px = dip2Px2;
        }
        this.f60104c.setLayoutParams(new LinearLayout.LayoutParams(-1, dip2Px));
        if (this.f60105d != null) {
            PoiFilterDetailAdapter poiFilterDetailAdapter = this.f60105d;
            if (PatchProxy.isSupport(new Object[]{list2}, poiFilterDetailAdapter, PoiFilterDetailAdapter.f59962a, false, 65187, new Class[]{List.class}, Void.TYPE)) {
                PoiFilterDetailAdapter poiFilterDetailAdapter2 = poiFilterDetailAdapter;
                PatchProxy.accessDispatch(new Object[]{list2}, poiFilterDetailAdapter2, PoiFilterDetailAdapter.f59962a, false, 65187, new Class[]{List.class}, Void.TYPE);
            } else {
                poiFilterDetailAdapter.f59963b = list2;
                poiFilterDetailAdapter.notifyDataSetChanged();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list2.get(i).isSelected()) {
                this.f60104c.scrollToPosition(i);
            }
        }
    }

    public a(Context context, PoiFilterDetailAdapter.a aVar) {
        super(context);
        this.f60103b = context;
        this.f60106e = aVar;
        if (PatchProxy.isSupport(new Object[0], this, f60102a, false, 65358, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60102a, false, 65358, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(this.f60103b).inflate(C0906R.layout.arc, null, false);
        setContentView(inflate);
        this.f60104c = (RecyclerView) inflate.findViewById(C0906R.id.c1m);
        setWidth(-1);
        setHeight(-1);
        setBackgroundDrawable(new ColorDrawable(this.f60103b.getResources().getColor(C0906R.color.a7l)));
        setOutsideTouchable(true);
        this.f60104c.setLayoutManager(new WrapLinearLayoutManager(this.f60103b, 1, false));
        this.f60105d = new PoiFilterDetailAdapter(this.f60106e);
        this.f60104c.setAdapter(this.f60105d);
        inflate.findViewById(C0906R.id.dte).setAlpha(0.5f);
        inflate.findViewById(C0906R.id.dte).setOnClickListener(new b(this));
    }

    public final void showAsDropDown(View view, int i, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60102a, false, 65360, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60102a, false, 65360, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Rect rect = new Rect();
            view2.getGlobalVisibleRect(rect);
            setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) - i2);
        }
        super.showAsDropDown(view, i, i2);
    }
}
