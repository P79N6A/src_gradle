package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.a.j;
import com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0011J\u001a\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u001aH\u0002J\u0006\u0010%\u001a\u00020\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0004\n\u0002\u0010\u001b¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/adapter/viewholder/PoiRecommendPoiViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mContext", "Landroid/content/Context;", "mDecorationAdded", "", "mLayoutManager", "Lcom/ss/android/ugc/aweme/views/WrapLinearLayoutManager;", "mPoiAdapter", "Lcom/ss/android/ugc/aweme/poi/adapter/RecommendPoiAdapter;", "mPoiList", "", "Lcom/ss/android/ugc/aweme/feed/model/poi/SimplePoiInfoStruct;", "mPoiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "mRecommendDivider", "mRecommendDividerTop", "mRecommendList", "Landroid/support/v7/widget/RecyclerView;", "mRecommendSubtitle", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mRecommendTitle", "mRecommendType", "", "Ljava/lang/Integer;", "bind", "", "poiRecommendItem", "Lcom/ss/android/ugc/aweme/poi/bean/PoiRecommendPoiFeed;", "poiSimpleBundle", "mobItemShow", "poiId", "", "recommendType", "mobShow", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiRecommendPoiViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59613a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f59614b;

    /* renamed from: c  reason: collision with root package name */
    public final DmtTextView f59615c;

    /* renamed from: d  reason: collision with root package name */
    public final DmtTextView f59616d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f59617e;

    /* renamed from: f  reason: collision with root package name */
    public final View f59618f;
    public final View g;
    public RecommendPoiAdapter h;
    public boolean i;
    public WrapLinearLayoutManager j;
    public List<? extends SimplePoiInfoStruct> k;
    public Integer l;
    public c m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59619a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PoiRecommendPoiViewHolder f59620b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f59621c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f59622d;

        public a(PoiRecommendPoiViewHolder poiRecommendPoiViewHolder, j jVar, c cVar) {
            this.f59620b = poiRecommendPoiViewHolder;
            this.f59621c = jVar;
            this.f59622d = cVar;
        }

        public final void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f59619a, false, 64895, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f59619a, false, 64895, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            String a2 = p.a(this.f59621c.getRecommendType().intValue());
            c cVar = this.f59622d;
            d a3 = d.a().a("enter_from", "poi_page").a("enter_method", "click").a("poi_channel", aa.b());
            c cVar2 = this.f59622d;
            String str2 = null;
            if (cVar2 != null) {
                str = cVar2.getPoiId();
            } else {
                str = null;
            }
            h.a(cVar, "click_more_recommend_poi", a3.a("poi_id", str).a("city_info", aa.a()).a("content_type", a2));
            IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
            if (iBridgeService != null) {
                Bundle bundle = new Bundle();
                bundle.putString("enter_from", "poi_page");
                bundle.putString("enter_method", "click_poi_explore_more_card");
                c cVar3 = this.f59622d;
                if (cVar3 != null) {
                    str2 = cVar3.getPoiId();
                }
                bundle.putString("id", str2);
                bundle.putInt("recommend_type", this.f59621c.getRecommendType().intValue());
                bundle.putString("recommend_title", this.f59621c.title());
                bundle.putString("content_type", a2);
                View view2 = this.f59620b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                iBridgeService.openPoiFilterDetailActivity(view2.getContext(), bundle);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PoiRecommendPoiViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        this.f59614b = context;
        View findViewById = view.findViewById(C0906R.id.c2s);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.poi_recommend_title)");
        this.f59615c = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.c2r);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.poi_recommend_subtitle)");
        this.f59616d = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.c2q);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.poi_recommend_list)");
        this.f59617e = (RecyclerView) findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.c2p);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.…oi_recommend_divider_top)");
        this.f59618f = findViewById4;
        View findViewById5 = view.findViewById(C0906R.id.c2o);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.poi_recommend_divider)");
        this.g = findViewById5;
    }
}
