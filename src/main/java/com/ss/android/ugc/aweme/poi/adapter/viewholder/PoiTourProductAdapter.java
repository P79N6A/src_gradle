package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.poi.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/adapter/viewholder/PoiTourProductAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "ads", "", "Lcom/ss/android/ugc/aweme/feed/model/AwemeRawAd;", "poiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "(Landroid/content/Context;Ljava/util/List;Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;)V", "getItemCount", "", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiTourProductAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59644a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f59645b;

    /* renamed from: c  reason: collision with root package name */
    private final List<AwemeRawAd> f59646c;

    /* renamed from: d  reason: collision with root package name */
    private final c f59647d;

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f59644a, false, 64905, new Class[0], Integer.TYPE)) {
            return this.f59646c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59644a, false, 64905, new Class[0], Integer.TYPE)).intValue();
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f59644a, false, 64906, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f59644a, false, 64906, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "p0");
        View inflate = LayoutInflater.from(this.f59645b).inflate(C0906R.layout.yz, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new PoiTourProductViewHolder(inflate);
    }

    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f59644a, false, 64904, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f59644a, false, 64904, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "p0");
        PoiTourProductViewHolder poiTourProductViewHolder = (PoiTourProductViewHolder) viewHolder2;
        AwemeRawAd awemeRawAd = this.f59646c.get(i);
        c cVar = this.f59647d;
        if (PatchProxy.isSupport(new Object[]{awemeRawAd, cVar}, poiTourProductViewHolder, PoiTourProductViewHolder.f59648a, false, 64909, new Class[]{AwemeRawAd.class, c.class}, Void.TYPE)) {
            PoiTourProductViewHolder poiTourProductViewHolder2 = poiTourProductViewHolder;
            PatchProxy.accessDispatch(new Object[]{awemeRawAd, cVar}, poiTourProductViewHolder2, PoiTourProductViewHolder.f59648a, false, 64909, new Class[]{AwemeRawAd.class, c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(awemeRawAd, "ad");
        poiTourProductViewHolder.f59649b.a(awemeRawAd, cVar);
    }

    public PoiTourProductAdapter(@NotNull Context context, @NotNull List<? extends AwemeRawAd> list, @Nullable c cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "ads");
        this.f59645b = context;
        this.f59646c = list;
        this.f59647d = cVar;
    }
}
