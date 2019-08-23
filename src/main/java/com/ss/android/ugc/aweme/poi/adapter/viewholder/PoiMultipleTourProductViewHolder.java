package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.poi.a.l;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0006\u0010\u001a\u001a\u00020\u0013R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/adapter/viewholder/PoiMultipleTourProductViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mAd", "Lcom/ss/android/ugc/aweme/poi/bean/PoiTourProduct;", "mContext", "Landroid/content/Context;", "mLinearLayoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "mList", "Landroid/support/v7/widget/RecyclerView;", "mPoiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "mTitle", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mTopDivider", "bind", "", "ad", "poiSimpleBundle", "mobItemShow", "poiId", "", "id", "mobShow", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiMultipleTourProductViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59568a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f59569b;

    /* renamed from: c  reason: collision with root package name */
    public final View f59570c;

    /* renamed from: d  reason: collision with root package name */
    public final DmtTextView f59571d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f59572e;

    /* renamed from: f  reason: collision with root package name */
    public l f59573f;
    public LinearLayoutManager g;
    public c h;

    public final void a() {
        Integer num;
        Integer num2;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f59568a, false, 64842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59568a, false, 64842, new Class[0], Void.TYPE);
            return;
        }
        l lVar = this.f59573f;
        if (!(lVar == null || lVar.f59411b == null)) {
            LinearLayoutManager linearLayoutManager = this.g;
            if (linearLayoutManager != null) {
                num = Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition());
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                LinearLayoutManager linearLayoutManager2 = this.g;
                if (linearLayoutManager2 != null) {
                    num2 = Integer.valueOf(linearLayoutManager2.findLastVisibleItemPosition());
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    int i = intValue2 - 1;
                    if (intValue >= 0 && i >= intValue) {
                        l lVar2 = this.f59573f;
                        if (lVar2 == null) {
                            Intrinsics.throwNpe();
                        }
                        List<? extends AwemeRawAd> list = lVar2.f59411b;
                        if (list == null) {
                            Intrinsics.throwNpe();
                        }
                        if (intValue2 < list.size() && intValue <= intValue2) {
                            int i2 = intValue;
                            while (true) {
                                c cVar = this.h;
                                if (cVar != null) {
                                    str = cVar.getPoiId();
                                } else {
                                    str = null;
                                }
                                l lVar3 = this.f59573f;
                                if (lVar3 == null) {
                                    Intrinsics.throwNpe();
                                }
                                List<? extends AwemeRawAd> list2 = lVar3.f59411b;
                                if (list2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                String creativeIdStr = ((AwemeRawAd) list2.get(i2)).getCreativeIdStr();
                                Intrinsics.checkExpressionValueIsNotNull(creativeIdStr, "mAd!!.products!![i].creativeIdStr");
                                if (PatchProxy.isSupport(new Object[]{str, creativeIdStr}, this, f59568a, false, 64843, new Class[]{String.class, String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str, creativeIdStr}, this, f59568a, false, 64843, new Class[]{String.class, String.class}, Void.TYPE);
                                } else if (str != null) {
                                    h.a(this.h, "show_poi_product", d.a().a("enter_from", "poi_page").a("enter_method", "show").a("poi_id", str).a("poi_posititon", "poi_page").a("product_id", creativeIdStr));
                                }
                                if (i2 == intValue2) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PoiMultipleTourProductViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        this.f59569b = context;
        View findViewById = view.findViewById(C0906R.id.c3r);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.…tour_product_divider_top)");
        this.f59570c = findViewById;
        View findViewById2 = view.findViewById(C0906R.id.c3t);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.poi_tour_product_title)");
        this.f59571d = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.c3s);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.poi_tour_product_list)");
        this.f59572e = (RecyclerView) findViewById3;
    }
}
