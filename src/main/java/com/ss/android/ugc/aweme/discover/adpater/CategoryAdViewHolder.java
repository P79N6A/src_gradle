package com.ss.android.ugc.aweme.discover.adpater;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver;
import com.ss.android.ugc.aweme.discover.adapter.BaseCategoryNewViewHolder;
import com.ss.android.ugc.aweme.discover.model.CategoryListAdInfo;
import com.ss.android.ugc.aweme.discover.widget.CategoryAdView;
import java.util.Collection;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;

public class CategoryAdViewHolder extends BaseCategoryNewViewHolder implements RecyclerViewVisibilityObserver.d {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f42003b;

    /* renamed from: c  reason: collision with root package name */
    public int f42004c;

    public CategoryAdViewHolder(View view, RecyclerView recyclerView) {
        super(view, recyclerView);
    }

    public final void a(int i, @Nullable Object obj, @Nullable RecyclerView.ViewHolder viewHolder, @Nullable View view, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), obj, viewHolder, view, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f42003b, false, 35963, new Class[]{Integer.TYPE, Object.class, RecyclerView.ViewHolder.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), obj, viewHolder, view, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f42003b, false, 35963, new Class[]{Integer.TYPE, Object.class, RecyclerView.ViewHolder.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0 && i3 == 1) {
            CategoryListAdInfo ad = ((CategoryAdView) this.itemView).getAd();
            if (ad != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("topic_order", Integer.valueOf((i + 1) - this.f42004c));
                d.a().a("list_ad").b("show").a(ad.getCreativeId()).g(ad.getLogExtra()).a((Object) hashMap).a(this.itemView.getContext());
                if (!(ad.getTrackUrlList() == null || ad.getTrackUrlList().getUrlList() == null)) {
                    g.a((g.a) new a(ad), (Collection<String>) ad.getTrackUrlList().getUrlList(), true);
                }
            }
        }
    }
}
