package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/poi/adapter/viewholder/PoiMultipleTourProductViewHolder$bind$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiMultipleTourProductViewHolder$bind$1 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59574a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PoiMultipleTourProductViewHolder f59575b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f59576c;

    public PoiMultipleTourProductViewHolder$bind$1(PoiMultipleTourProductViewHolder poiMultipleTourProductViewHolder, c cVar) {
        this.f59575b = poiMultipleTourProductViewHolder;
        this.f59576c = cVar;
    }

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        String str;
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f59574a, false, 64844, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f59574a, false, 64844, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        if (i == 0) {
            c cVar = this.f59575b.h;
            d a2 = d.a().a("enter_from", "poi_page").a("enter_method", "slide");
            c cVar2 = this.f59576c;
            if (cVar2 != null) {
                str = cVar2.getPoiId();
            } else {
                str = null;
            }
            h.a(cVar, "show_poi_product", a2.a("poi_id", str).a("product_id", "").a("poi_posititon", "poi_page"));
        }
    }
}
