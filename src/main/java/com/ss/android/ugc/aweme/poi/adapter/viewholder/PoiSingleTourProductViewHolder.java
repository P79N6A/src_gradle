package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/adapter/viewholder/PoiSingleTourProductViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mAdShow", "", "mContext", "Landroid/content/Context;", "mPoiTourProductPresenter", "Lcom/ss/android/ugc/aweme/poi/adapter/viewholder/PoiTourProductPresenter;", "mTitle", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mTopDivider", "bind", "", "ad", "Lcom/ss/android/ugc/aweme/poi/bean/PoiTourProduct;", "poiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiSingleTourProductViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59638a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f59639b;

    /* renamed from: c  reason: collision with root package name */
    public final DmtTextView f59640c;

    /* renamed from: d  reason: collision with root package name */
    public final View f59641d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f59642e;

    /* renamed from: f  reason: collision with root package name */
    public final m f59643f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PoiSingleTourProductViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        this.f59639b = context;
        View findViewById = view.findViewById(C0906R.id.c3t);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.poi_tour_product_title)");
        this.f59640c = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.c3r);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.…tour_product_divider_top)");
        this.f59641d = findViewById2;
        this.f59643f = new m(view);
    }
}
