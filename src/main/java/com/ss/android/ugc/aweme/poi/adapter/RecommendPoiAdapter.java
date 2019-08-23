package com.ss.android.ugc.aweme.poi.adapter;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.SquareImageView;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity;
import com.ss.android.ugc.aweme.u.aa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B/\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/adapter/RecommendPoiAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "mPoiList", "", "Lcom/ss/android/ugc/aweme/feed/model/poi/SimplePoiInfoStruct;", "poiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "recommendType", "Ljava/lang/Integer;", "title", "", "(Ljava/util/List;Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;Ljava/lang/Integer;Ljava/lang/String;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClickToMoreViewHolder", "PoiItemViewHolder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendPoiAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59454a;

    /* renamed from: b  reason: collision with root package name */
    private final List<SimplePoiInfoStruct> f59455b;

    /* renamed from: c  reason: collision with root package name */
    private final c f59456c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f59457d;

    /* renamed from: e  reason: collision with root package name */
    private final String f59458e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/adapter/RecommendPoiAdapter$ClickToMoreViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "title", "", "poiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "recommendType", "Ljava/lang/Integer;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class ClickToMoreViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59459a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59460a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ClickToMoreViewHolder f59461b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c f59462c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Integer f59463d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f59464e;

            a(ClickToMoreViewHolder clickToMoreViewHolder, c cVar, Integer num, String str) {
                this.f59461b = clickToMoreViewHolder;
                this.f59462c = cVar;
                this.f59463d = num;
                this.f59464e = str;
            }

            public final void onClick(View view) {
                String str;
                if (PatchProxy.isSupport(new Object[]{view}, this, f59460a, false, 64788, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f59460a, false, 64788, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                c cVar = this.f59462c;
                d a2 = d.a().a("enter_from", "poi_page").a("enter_method", "click").a("poi_channel", aa.b());
                c cVar2 = this.f59462c;
                String str2 = null;
                if (cVar2 != null) {
                    str = cVar2.getPoiId();
                } else {
                    str = null;
                }
                h.a(cVar, "click_more_recommend_poi", a2.a("poi_id", str).a("city_info", aa.a()).a("content_type", p.a(this.f59463d.intValue())));
                IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
                if (iBridgeService != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("enter_from", "poi_page");
                    bundle.putString("enter_method", "click_poi_explore_more_card");
                    c cVar3 = this.f59462c;
                    if (cVar3 != null) {
                        str2 = cVar3.getPoiId();
                    }
                    bundle.putString("id", str2);
                    bundle.putInt("recommend_type", this.f59463d.intValue());
                    bundle.putString("recommend_title", this.f59464e);
                    View view2 = this.f59461b.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    iBridgeService.openPoiFilterDetailActivity(view2.getContext(), bundle);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClickToMoreViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/adapter/RecommendPoiAdapter$PoiItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mDistance", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mImg", "Lcom/ss/android/ugc/aweme/base/ui/SquareImageView;", "mImgPlaceholder", "Landroid/widget/ImageView;", "mPrice", "mTitle", "bind", "", "poi", "Lcom/ss/android/ugc/aweme/feed/model/poi/SimplePoiInfoStruct;", "poiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "recommendType", "Ljava/lang/Integer;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class PoiItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59465a;

        /* renamed from: b  reason: collision with root package name */
        final ImageView f59466b;

        /* renamed from: c  reason: collision with root package name */
        final SquareImageView f59467c;

        /* renamed from: d  reason: collision with root package name */
        final DmtTextView f59468d;

        /* renamed from: e  reason: collision with root package name */
        final DmtTextView f59469e;

        /* renamed from: f  reason: collision with root package name */
        final DmtTextView f59470f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59471a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PoiItemViewHolder f59472b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c f59473c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ SimplePoiInfoStruct f59474d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Integer f59475e;

            a(PoiItemViewHolder poiItemViewHolder, c cVar, SimplePoiInfoStruct simplePoiInfoStruct, Integer num) {
                this.f59472b = poiItemViewHolder;
                this.f59473c = cVar;
                this.f59474d = simplePoiInfoStruct;
                this.f59475e = num;
            }

            public final void onClick(View view) {
                String str;
                if (PatchProxy.isSupport(new Object[]{view}, this, f59471a, false, 64790, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f59471a, false, 64790, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                l.a aVar = new l.a();
                c cVar = this.f59473c;
                if (cVar != null) {
                    str = cVar.getPoiId();
                } else {
                    str = null;
                }
                l.a l = aVar.q(str).i("poi_page").c(this.f59474d.poiId).g(this.f59474d.poiName).a(this.f59474d).s(p.a(this.f59475e.intValue())).l("click_poi_explore_card");
                View view2 = this.f59472b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                PoiDetailActivity.a(view2.getContext(), l.a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PoiItemViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(C0906R.id.awv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.…item_poi_img_placeholder)");
            this.f59466b = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0906R.id.awu);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.item_poi_img)");
            this.f59467c = (SquareImageView) findViewById2;
            View findViewById3 = view.findViewById(C0906R.id.axc);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.item_poi_title)");
            this.f59468d = (DmtTextView) findViewById3;
            View findViewById4 = view.findViewById(C0906R.id.awt);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.item_poi_distance)");
            this.f59469e = (DmtTextView) findViewById4;
            View findViewById5 = view.findViewById(C0906R.id.awy);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.item_poi_price)");
            this.f59470f = (DmtTextView) findViewById5;
        }
    }

    public final int getItemCount() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f59454a, false, 64786, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59454a, false, 64786, new Class[0], Integer.TYPE)).intValue();
        }
        List<SimplePoiInfoStruct> list = this.f59455b;
        if (list != null) {
            i = list.size();
        }
        return i;
    }

    public final int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59454a, false, 64785, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59454a, false, 64785, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        List<SimplePoiInfoStruct> list = this.f59455b;
        if (list == null) {
            Intrinsics.throwNpe();
        }
        if (list.get(i).isValid()) {
            return 1;
        }
        return 2;
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f59454a, false, 64783, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f59454a, false, 64783, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zh, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new PoiItemViewHolder(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.wl, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "view");
        return new ClickToMoreViewHolder(inflate2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0217  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(@org.jetbrains.annotations.NotNull android.support.v7.widget.RecyclerView.ViewHolder r22, int r23) {
        /*
            r21 = this;
            r7 = r21
            r8 = r22
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r11 = 1
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f59454a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 64784(0xfd10, float:9.0782E-41)
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004d
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f59454a
            r3 = 0
            r4 = 64784(0xfd10, float:9.0782E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004d:
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter.PoiItemViewHolder
            r1 = 3
            if (r0 == 0) goto L_0x0238
            r0 = r8
            com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter$PoiItemViewHolder r0 = (com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter.PoiItemViewHolder) r0
            java.util.List<com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct> r2 = r7.f59455b
            if (r2 != 0) goto L_0x0061
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0061:
            r3 = r23
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r2 = (com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct) r2
            com.ss.android.ugc.aweme.poi.c r3 = r7.f59456c
            java.lang.Integer r4 = r7.f59457d
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r10] = r2
            r12[r11] = r3
            r12[r9] = r4
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter.PoiItemViewHolder.f59465a
            r15 = 0
            r16 = 64789(0xfd15, float:9.0789E-41)
            java.lang.Class[] r5 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct> r6 = com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct.class
            r5[r10] = r6
            java.lang.Class<com.ss.android.ugc.aweme.poi.c> r6 = com.ss.android.ugc.aweme.poi.c.class
            r5[r11] = r6
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            r5[r9] = r6
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r5 == 0) goto L_0x00ba
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r10] = r2
            r12[r11] = r3
            r12[r9] = r4
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter.PoiItemViewHolder.f59465a
            r15 = 0
            r16 = 64789(0xfd15, float:9.0789E-41)
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct> r2 = com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.poi.c> r2 = com.ss.android.ugc.aweme.poi.c.class
            r1[r11] = r2
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r1[r9] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02a7
        L_0x00ba:
            java.lang.String r1 = "recommendType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r1)
            if (r2 == 0) goto L_0x0237
            android.view.View r1 = r0.itemView
            com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter$PoiItemViewHolder$a r5 = new com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter$PoiItemViewHolder$a
            r5.<init>(r0, r3, r2, r4)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r1.setOnClickListener(r5)
            com.ss.android.ugc.aweme.base.ui.SquareImageView r1 = r0.f59467c
            r5 = 2131624836(0x7f0e0384, float:1.8876863E38)
            r1.setImageResource(r5)
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r2.cover
            r5 = 8
            if (r1 == 0) goto L_0x00fe
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r2.cover
            java.lang.String r6 = "poi.cover"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
            java.util.List r1 = r1.getUrlList()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00ef
            goto L_0x00fe
        L_0x00ef:
            android.widget.ImageView r1 = r0.f59466b
            r1.setVisibility(r5)
            com.ss.android.ugc.aweme.base.ui.SquareImageView r1 = r0.f59467c
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r2.cover
            com.ss.android.ugc.aweme.base.c.b(r1, r6)
            goto L_0x0103
        L_0x00fe:
            android.widget.ImageView r1 = r0.f59466b
            r1.setVisibility(r10)
        L_0x0103:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f59468d
            java.lang.String r6 = r2.poiName
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.setText(r6)
            android.view.View r1 = r0.itemView
            java.lang.String r6 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
            android.content.Context r1 = r1.getContext()
            com.ss.android.ugc.aweme.app.af r1 = com.ss.android.ugc.aweme.app.af.a((android.content.Context) r1)
            java.lang.String r6 = "LocationHelperCompat.getInstance(itemView.context)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
            com.ss.android.ugc.aweme.poi.a r1 = r1.f()
            if (r1 == 0) goto L_0x0180
            boolean r6 = r1.isValid()
            if (r6 == 0) goto L_0x0180
            java.lang.String r6 = r2.latitude
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0180
            java.lang.String r6 = r2.longitude
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0141
            goto L_0x0180
        L_0x0141:
            double r13 = r1.latitude
            double r8 = r1.longitude
            java.lang.String r1 = r2.latitude
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            if (r1 != 0) goto L_0x0150
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0150:
            double r17 = r1.doubleValue()
            java.lang.String r1 = r2.longitude
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            if (r1 != 0) goto L_0x015f
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x015f:
            double r19 = r1.doubleValue()
            android.view.View r1 = r0.itemView
            java.lang.String r6 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
            android.content.Context r12 = r1.getContext()
            r15 = r8
            java.lang.String r1 = com.ss.android.ugc.aweme.poi.e.c.a(r12, r13, r15, r17, r19)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r0.f59469e
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r6.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f59469e
            r1.setVisibility(r10)
            goto L_0x01a2
        L_0x0180:
            java.lang.String r1 = r2.getCity()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0192
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f59469e
            r1.setVisibility(r5)
            goto L_0x01a2
        L_0x0192:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f59469e
            java.lang.String r6 = r2.getCity()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.setText(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f59469e
            r1.setVisibility(r10)
        L_0x01a2:
            double r1 = r2.cost
            int r1 = (int) r1
            if (r1 != 0) goto L_0x01ad
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f59470f
            r0.setVisibility(r5)
            goto L_0x01ee
        L_0x01ad:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f59470f
            android.view.View r5 = r0.itemView
            java.lang.String r6 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            android.content.Context r5 = r5.getContext()
            java.lang.String r6 = "itemView.context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131561719(0x7f0d0cf7, float:1.8748846E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "itemView.context.resourc…String(R.string.poi_cost)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            java.lang.Object[] r6 = new java.lang.Object[r11]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r6[r10] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r6, r11)
            java.lang.String r1 = java.lang.String.format(r5, r1)
            java.lang.String r5 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f59470f
            r0.setVisibility(r10)
        L_0x01ee:
            java.lang.String r0 = "poi_explore_card"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "enter_from"
            java.lang.String r5 = "poi_page"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r5)
            java.lang.String r2 = "enter_method"
            java.lang.String r5 = "show"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r5)
            java.lang.String r2 = "poi_channel"
            java.lang.String r5 = com.ss.android.ugc.aweme.u.aa.b()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r5)
            java.lang.String r2 = "poi_id"
            if (r3 == 0) goto L_0x0217
            java.lang.String r5 = r3.getPoiId()
            goto L_0x0218
        L_0x0217:
            r5 = 0
        L_0x0218:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r5)
            java.lang.String r2 = "city_info"
            java.lang.String r5 = com.ss.android.ugc.aweme.u.aa.a()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r5)
            java.lang.String r2 = "content_type"
            int r4 = r4.intValue()
            java.lang.String r4 = com.ss.android.ugc.aweme.poi.e.p.a((int) r4)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r4)
            com.ss.android.ugc.aweme.poi.e.h.a((com.ss.android.ugc.aweme.poi.c) r3, (java.lang.String) r0, (com.ss.android.ugc.aweme.app.d.d) r1)
        L_0x0237:
            return
        L_0x0238:
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter.ClickToMoreViewHolder
            if (r0 == 0) goto L_0x02a7
            r0 = r8
            com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter$ClickToMoreViewHolder r0 = (com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter.ClickToMoreViewHolder) r0
            java.lang.String r2 = r7.f59458e
            com.ss.android.ugc.aweme.poi.c r3 = r7.f59456c
            java.lang.Integer r4 = r7.f59457d
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r10] = r2
            r12[r11] = r3
            r12[r9] = r4
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter.ClickToMoreViewHolder.f59459a
            r15 = 0
            r16 = 64787(0xfd13, float:9.0786E-41)
            java.lang.Class[] r5 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r10] = r6
            java.lang.Class<com.ss.android.ugc.aweme.poi.c> r6 = com.ss.android.ugc.aweme.poi.c.class
            r5[r11] = r6
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            r5[r9] = r6
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r5 == 0) goto L_0x0291
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r10] = r2
            r12[r11] = r3
            r12[r9] = r4
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter.ClickToMoreViewHolder.f59459a
            r15 = 0
            r16 = 64787(0xfd13, float:9.0786E-41)
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.poi.c> r2 = com.ss.android.ugc.aweme.poi.c.class
            r1[r11] = r2
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r1[r9] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0291:
            java.lang.String r1 = "title"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r1)
            java.lang.String r1 = "recommendType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r1)
            android.view.View r1 = r0.itemView
            com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter$ClickToMoreViewHolder$a r5 = new com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter$ClickToMoreViewHolder$a
            r5.<init>(r0, r3, r4, r2)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r1.setOnClickListener(r5)
        L_0x02a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.adapter.RecommendPoiAdapter.onBindViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }

    public RecommendPoiAdapter(@Nullable List<? extends SimplePoiInfoStruct> list, @Nullable c cVar, @NotNull Integer num, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(num, "recommendType");
        Intrinsics.checkParameterIsNotNull(str, PushConstants.TITLE);
        this.f59455b = list;
        this.f59456c = cVar;
        this.f59457d = num;
        this.f59458e = str;
    }
}
