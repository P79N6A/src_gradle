package com.ss.android.ugc.aweme.discover.adapter;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.helper.c;
import com.ss.android.ugc.aweme.discover.model.Commodity;
import com.ss.android.ugc.aweme.discover.model.SearchCommodity;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0006\u0010\u0016\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchCommodityViewHolder;", "Lcom/ss/android/ugc/aweme/discover/adapter/AbsSearchViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "commodityImage", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "commodityPrice", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "commodityProvider", "commodityTitle", "mCommodity", "Lcom/ss/android/ugc/aweme/discover/model/Commodity;", "bind", "", "searchCommodity", "Lcom/ss/android/ugc/aweme/discover/model/SearchCommodity;", "getPriceSpannable", "", "cents", "", "getView", "mobShow", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchCommodityViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f41793c;

    /* renamed from: e  reason: collision with root package name */
    public static final a f41794e = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public Commodity f41795d;

    /* renamed from: f  reason: collision with root package name */
    private final RemoteImageView f41796f;
    private final DmtTextView g;
    private final DmtTextView h;
    private final DmtTextView i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchCommodityViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchCommodityViewHolder;", "parent", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41797a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SearchCommodityViewHolder a(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f41797a, false, 35791, new Class[]{ViewGroup.class}, SearchCommodityViewHolder.class)) {
                return (SearchCommodityViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f41797a, false, 35791, new Class[]{ViewGroup.class}, SearchCommodityViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zz, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new SearchCommodityViewHolder(inflate);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchCommodityViewHolder f41799b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ IMiniAppService f41800c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Commodity f41801d;

        b(SearchCommodityViewHolder searchCommodityViewHolder, IMiniAppService iMiniAppService, Commodity commodity) {
            this.f41799b = searchCommodityViewHolder;
            this.f41800c = iMiniAppService;
            this.f41801d = commodity;
        }

        public final void onClick(View view) {
            String str;
            LogPbBean logPbBean;
            if (PatchProxy.isSupport(new Object[]{view}, this, f41798a, false, 35792, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f41798a, false, 35792, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.miniapp_api.model.b a2 = new b.a().a();
            IMiniAppService iMiniAppService = this.f41800c;
            View view2 = this.f41799b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            iMiniAppService.openMiniApp(view2.getContext(), this.f41801d.getSchema(), a2);
            d a3 = d.a();
            if (this.f41799b.f41524b.f41974f) {
                str = "general_search";
            } else {
                str = "search_result";
            }
            d a4 = a3.a("carrier_type", str).a("commodity_id", this.f41801d.getGid());
            Commodity commodity = this.f41799b.f41795d;
            if (commodity != null) {
                logPbBean = commodity.getLogPb();
            } else {
                logPbBean = null;
            }
            r.a("click_product", (Map) a4.a("log_pb", logPbBean).a("microapp_id", this.f41800c.getAppId(this.f41801d.getSchema())).f34114b);
        }
    }

    @NotNull
    public final View a() {
        if (PatchProxy.isSupport(new Object[0], this, f41793c, false, 35786, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f41793c, false, 35786, new Class[0], View.class);
        }
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        return view;
    }

    public final void c() {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[0], this, f41793c, false, 35789, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41793c, false, 35789, new Class[0], Void.TYPE);
            return;
        }
        Commodity commodity = this.f41795d;
        if (commodity != null && !commodity.isReportShow()) {
            Commodity commodity2 = this.f41795d;
            if (commodity2 != null) {
                commodity2.setReportShow(true);
            }
            IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
            d a2 = d.a();
            if (this.f41524b.f41974f) {
                str = "general_search";
            } else {
                str = "search_result";
            }
            d a3 = a2.a("carrier_type", str);
            Commodity commodity3 = this.f41795d;
            LogPbBean logPbBean = null;
            if (commodity3 != null) {
                str2 = commodity3.getGid();
            } else {
                str2 = null;
            }
            d a4 = a3.a("commodity_id", str2);
            Commodity commodity4 = this.f41795d;
            if (commodity4 != null) {
                str3 = commodity4.getSchema();
            } else {
                str3 = null;
            }
            d a5 = a4.a("microapp_id", iMiniAppService.getAppId(str3));
            Commodity commodity5 = this.f41795d;
            if (commodity5 != null) {
                logPbBean = commodity5.getLogPb();
            }
            r.a("show_product", (Map) a5.a("log_pb", logPbBean).f34114b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchCommodityViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(C0906R.id.xp);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.commodityImage)");
        this.f41796f = (RemoteImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.xq);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.commodityPrice)");
        this.g = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.xs);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.commodityTitle)");
        this.h = (DmtTextView) findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.xr);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.commodityProvider)");
        this.i = (DmtTextView) findViewById4;
    }

    private final CharSequence a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f41793c, false, 35788, new Class[]{Long.TYPE}, CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f41793c, false, 35788, new Class[]{Long.TYPE}, CharSequence.class);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c.f42330b.a(j2));
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(11, true), 0, 1, 33);
        return spannableStringBuilder;
    }

    public final void a(@NotNull SearchCommodity searchCommodity) {
        if (PatchProxy.isSupport(new Object[]{searchCommodity}, this, f41793c, false, 35787, new Class[]{SearchCommodity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchCommodity}, this, f41793c, false, 35787, new Class[]{SearchCommodity.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchCommodity, "searchCommodity");
        Commodity commodity = searchCommodity.getCommodity();
        if (commodity != null) {
            this.f41795d = commodity;
            if (!TextUtils.isEmpty(commodity.getImage())) {
                com.ss.android.ugc.aweme.base.c.a(this.f41796f, commodity.getImage());
            }
            this.g.setText(a(commodity.getPrice()));
            DmtTextView dmtTextView = this.i;
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            dmtTextView.setText(view.getContext().getString(C0906R.string.bsu, new Object[]{commodity.getPlatformName()}));
            DmtTextView dmtTextView2 = this.h;
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            dmtTextView2.setText(com.ss.android.ugc.aweme.base.utils.a.a(view2.getContext(), commodity.getName(), searchCommodity.getPositions()));
            IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
            iMiniAppService.preloadMiniApp(commodity.getSchema());
            this.itemView.setOnClickListener(new b(this, iMiniAppService, commodity));
        }
    }
}
