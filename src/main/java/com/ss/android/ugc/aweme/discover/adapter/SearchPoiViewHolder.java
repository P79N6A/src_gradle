package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.model.SearchPoi;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.poi.a;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;

public class SearchPoiViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f41863c;

    /* renamed from: d  reason: collision with root package name */
    Context f41864d;

    /* renamed from: e  reason: collision with root package name */
    SearchPoi f41865e;

    /* renamed from: f  reason: collision with root package name */
    String f41866f;
    public boolean g;
    private PoiItemViewHolder h;

    public final View a() {
        return this.itemView;
    }

    public final void a(SearchPoi searchPoi, String str) {
        if (PatchProxy.isSupport(new Object[]{searchPoi, str}, this, f41863c, false, 35869, new Class[]{SearchPoi.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchPoi, str}, this, f41863c, false, 35869, new Class[]{SearchPoi.class, String.class}, Void.TYPE);
        } else if (searchPoi != null && searchPoi.poi != null) {
            this.f41866f = str;
            this.f41865e = searchPoi;
            SimplePoiInfoStruct simplePoiInfoStruct = searchPoi.poi;
            simplePoiInfoStruct.position = searchPoi.position;
            this.h.a(-1, simplePoiInfoStruct);
        }
    }

    private SearchPoiViewHolder(View view, String str, a aVar, boolean z) {
        super(view);
        this.g = z;
        this.f41864d = view.getContext();
        this.f41864d = view.getContext();
        this.h = new PoiItemViewHolder(view, aVar);
        this.f41866f = str;
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41867a;

            public final void onClick(View view) {
                String str;
                int i;
                if (PatchProxy.isSupport(new Object[]{view}, this, f41867a, false, 35870, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41867a, false, 35870, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (SearchPoiViewHolder.this.f41865e != null && SearchPoiViewHolder.this.f41865e.poi != null) {
                    SimplePoiInfoStruct simplePoiInfoStruct = SearchPoiViewHolder.this.f41865e.poi;
                    l.a a2 = new l.a().c(simplePoiInfoStruct.poiId).g(simplePoiInfoStruct.poiName).a(simplePoiInfoStruct);
                    if (SearchPoiViewHolder.this.g) {
                        str = "general_search";
                    } else {
                        str = "search_result";
                    }
                    l.a n = a2.i(str).l("click_search_result").n(SearchPoiViewHolder.this.f41865e.logPb);
                    if (SearchPoiViewHolder.this.g) {
                        i = -1;
                    } else {
                        i = SearchPoiViewHolder.this.getAdapterPosition();
                    }
                    n.f59936f = i;
                    n.f59935e = SearchPoiViewHolder.this.f41866f;
                    PoiDetailActivity.a(SearchPoiViewHolder.this.f41864d, n.a());
                }
            }
        });
    }

    @NonNull
    public static SearchPoiViewHolder a(ViewGroup viewGroup, String str, a aVar, boolean z) {
        ViewGroup viewGroup2 = viewGroup;
        String str2 = str;
        a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, str2, aVar2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f41863c, true, 35868, new Class[]{ViewGroup.class, String.class, a.class, Boolean.TYPE}, SearchPoiViewHolder.class)) {
            return new SearchPoiViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.yo, viewGroup2, false), str2, aVar2, z);
        }
        return (SearchPoiViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, str2, aVar2, Byte.valueOf(z)}, null, f41863c, true, 35868, new Class[]{ViewGroup.class, String.class, a.class, Boolean.TYPE}, SearchPoiViewHolder.class);
    }
}
