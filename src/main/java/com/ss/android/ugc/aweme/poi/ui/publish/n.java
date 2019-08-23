package com.ss.android.ugc.aweme.poi.ui.publish;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.az;
import com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiAdapter;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;

public final class n extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60882a;

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f60883b;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f60884c;

    /* renamed from: d  reason: collision with root package name */
    private SpeedRecommendPoiAdapter f60885d;

    /* renamed from: e  reason: collision with root package name */
    private SpeedRecommendPoiAdapter.a f60886e;

    public final void setOnItemClick(SpeedRecommendPoiAdapter.a aVar) {
        this.f60886e = aVar;
    }

    public n(Context context) {
        this(context, null);
    }

    public final void setData(List<az> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f60882a, false, 66702, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f60882a, false, 66702, new Class[]{List.class}, Void.TYPE);
        } else if (list == null || list.size() == 0) {
            setVisibility(8);
        } else {
            this.f60884c.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0, false));
            this.f60884c.addItemDecoration(new SpeedRecommendPoiView$1(this));
            this.f60885d = new SpeedRecommendPoiAdapter(list);
            this.f60885d.f60828b = this.f60886e;
            this.f60884c.setAdapter(this.f60885d);
        }
    }

    private n(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public final void a(PoiStruct poiStruct, List<az> list) {
        if (PatchProxy.isSupport(new Object[]{poiStruct, list}, this, f60882a, false, 66703, new Class[]{PoiStruct.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiStruct, list}, this, f60882a, false, 66703, new Class[]{PoiStruct.class, List.class}, Void.TYPE);
        } else if (list != null) {
            if (poiStruct == null) {
                for (az azVar : list) {
                    azVar.f59910b = false;
                }
            } else {
                for (az next : list) {
                    if (next.f59909a.getPoiId().equals(poiStruct.getPoiId())) {
                        next.f59910b = true;
                    } else {
                        next.f59910b = false;
                    }
                }
            }
            if (this.f60885d != null) {
                this.f60885d.notifyDataSetChanged();
            }
        }
    }

    private n(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (PatchProxy.isSupport(new Object[]{context}, this, f60882a, false, 66701, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f60882a, false, 66701, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f60883b = (ViewGroup) LayoutInflater.from(context).inflate(C0906R.layout.arw, this, true);
        this.f60884c = (RecyclerView) this.f60883b.findViewById(C0906R.id.c2t);
    }
}
