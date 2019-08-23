package com.ss.android.ugc.aweme.poi.nearby.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.text.TextUtils;
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
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.views.SmartAnimatedImageView;
import com.tt.miniapphost.util.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u001aH\u0016J\u001a\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u001aH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000b¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/nearby/adapter/PoiRankListAdapter;", "Lcom/ss/android/ugc/aweme/common/adapter/BaseAdapter;", "Lcom/ss/android/ugc/aweme/feed/model/poi/SimplePoiInfoStruct;", "listener", "Lcom/ss/android/ugc/aweme/poi/nearby/adapter/PoiRankListAdapter$OnPoiRankListItemClickListener;", "(Lcom/ss/android/ugc/aweme/poi/nearby/adapter/PoiRankListAdapter$OnPoiRankListItemClickListener;)V", "districtCode", "", "getDistrictCode", "()Ljava/lang/String;", "setDistrictCode", "(Ljava/lang/String;)V", "enterFrom", "getEnterFrom", "setEnterFrom", "locationBundle", "Lcom/ss/android/ugc/aweme/poi/LocationBundle;", "mPoiRankResIcon", "", "mShowTopDivider", "", "getMShowTopDivider", "()Z", "setMShowTopDivider", "(Z)V", "poiClassCode", "", "getPoiClassCode", "()I", "setPoiClassCode", "(I)V", "rankSubClass", "getRankSubClass", "setRankSubClass", "onBindBasicViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "position", "onCreateBasicViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnPoiRankListItemClickListener", "PoiRankListViewHolder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiRankListAdapter extends BaseAdapter<SimplePoiInfoStruct> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59971a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f59972b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f59973c = "";

    /* renamed from: d  reason: collision with root package name */
    public int f59974d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public String f59975e = "";
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public String f59976f = "";
    private final int[] g = {2130839206, 2130839208, 2130839209, 2130839210, 2130839211, 2130839212, 2130839213, 2130839214, 2130839215, 2130839207};
    private com.ss.android.ugc.aweme.poi.a h;
    private a i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JT\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"J8\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\"H\u0002R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \b*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \b*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \b*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \b*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/nearby/adapter/PoiRankListAdapter$PoiRankListViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "poiRankResIcon", "", "(Landroid/view/View;[I)V", "mLine", "kotlin.jvm.PlatformType", "mPoiAddress", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mPoiDistance", "mPoiImage", "Lcom/ss/android/ugc/aweme/views/SmartAnimatedImageView;", "mPoiImagePlaceHolder", "Landroid/widget/ImageView;", "mPoiName", "mPoiPerPrice", "mPoiRankIcon", "mPoiType", "mTopDivider", "bind", "", "simplePoiInfoStruct", "Lcom/ss/android/ugc/aweme/feed/model/poi/SimplePoiInfoStruct;", "position", "", "locationBundle", "Lcom/ss/android/ugc/aweme/poi/LocationBundle;", "listener", "Lcom/ss/android/ugc/aweme/poi/nearby/adapter/PoiRankListAdapter$OnPoiRankListItemClickListener;", "showTopDivider", "", "previousPage", "", "poiClassCode", "districtCode", "rankSubClass", "mobLeaderBoardCellShowEvent", "struct", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class PoiRankListViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59977a;
        public static final a m = new a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        final ImageView f59978b;

        /* renamed from: c  reason: collision with root package name */
        final SmartAnimatedImageView f59979c;

        /* renamed from: d  reason: collision with root package name */
        final ImageView f59980d;

        /* renamed from: e  reason: collision with root package name */
        final DmtTextView f59981e;

        /* renamed from: f  reason: collision with root package name */
        public final DmtTextView f59982f;
        public final View g;
        public final DmtTextView h;
        public final DmtTextView i;
        public final DmtTextView j;
        final View k;
        final int[] l;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/nearby/adapter/PoiRankListAdapter$PoiRankListViewHolder$Companion;", "", "()V", "POI_ADDRESS_AND_DISTANCE_SPACE_WIDTH", "", "POI_TYPE_AND_PER_PRICE_SPACE_WIDTH", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59983a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f59984b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ SimplePoiInfoStruct f59985c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f59986d;

            b(a aVar, SimplePoiInfoStruct simplePoiInfoStruct, int i) {
                this.f59984b = aVar;
                this.f59985c = simplePoiInfoStruct;
                this.f59986d = i;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f59983a, false, 65200, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f59983a, false, 65200, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                a aVar = this.f59984b;
                if (aVar != null) {
                    aVar.a(this.f59985c, PushConstants.PUSH_TYPE_NOTIFY, this.f59986d);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59987a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PoiRankListViewHolder f59988b;

            c(PoiRankListViewHolder poiRankListViewHolder) {
                this.f59988b = poiRankListViewHolder;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f59987a, false, 65201, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f59987a, false, 65201, new Class[0], Void.TYPE);
                    return;
                }
                View view = this.f59988b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                int screenWidth = UIUtils.getScreenWidth(view.getContext());
                DmtTextView dmtTextView = this.f59988b.f59982f;
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "mPoiType");
                if (!TextUtils.isEmpty(dmtTextView.getText())) {
                    DmtTextView dmtTextView2 = this.f59988b.h;
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "mPoiPerPrice");
                    if (!TextUtils.isEmpty(dmtTextView2.getText())) {
                        View view2 = this.f59988b.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                        float dip2Px = UIUtils.dip2Px(view2.getContext(), 140.5f);
                        DmtTextView dmtTextView3 = this.f59988b.f59982f;
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "mPoiType");
                        TextPaint paint = dmtTextView3.getPaint();
                        DmtTextView dmtTextView4 = this.f59988b.f59982f;
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "mPoiType");
                        float measureText = dip2Px + paint.measureText(dmtTextView4.getText().toString());
                        DmtTextView dmtTextView5 = this.f59988b.h;
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView5, "mPoiPerPrice");
                        TextPaint paint2 = dmtTextView5.getPaint();
                        DmtTextView dmtTextView6 = this.f59988b.h;
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView6, "mPoiPerPrice");
                        if (((int) (measureText + paint2.measureText(dmtTextView6.getText().toString()))) >= screenWidth) {
                            View view3 = this.f59988b.g;
                            Intrinsics.checkExpressionValueIsNotNull(view3, "mLine");
                            view3.setVisibility(8);
                            DmtTextView dmtTextView7 = this.f59988b.h;
                            Intrinsics.checkExpressionValueIsNotNull(dmtTextView7, "mPoiPerPrice");
                            dmtTextView7.setVisibility(8);
                        }
                    }
                }
                DmtTextView dmtTextView8 = this.f59988b.i;
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView8, "mPoiAddress");
                if (!TextUtils.isEmpty(dmtTextView8.getText())) {
                    DmtTextView dmtTextView9 = this.f59988b.j;
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView9, "mPoiDistance");
                    if (!TextUtils.isEmpty(dmtTextView9.getText())) {
                        View view4 = this.f59988b.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                        float dip2Px2 = UIUtils.dip2Px(view4.getContext(), 132.0f);
                        DmtTextView dmtTextView10 = this.f59988b.i;
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView10, "mPoiAddress");
                        TextPaint paint3 = dmtTextView10.getPaint();
                        DmtTextView dmtTextView11 = this.f59988b.i;
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView11, "mPoiAddress");
                        float measureText2 = dip2Px2 + paint3.measureText(dmtTextView11.getText().toString());
                        DmtTextView dmtTextView12 = this.f59988b.j;
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView12, "mPoiDistance");
                        TextPaint paint4 = dmtTextView12.getPaint();
                        DmtTextView dmtTextView13 = this.f59988b.j;
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView13, "mPoiDistance");
                        if (((int) (measureText2 + paint4.measureText(dmtTextView13.getText().toString()))) >= screenWidth) {
                            DmtTextView dmtTextView14 = this.f59988b.j;
                            Intrinsics.checkExpressionValueIsNotNull(dmtTextView14, "mPoiDistance");
                            dmtTextView14.setVisibility(8);
                        }
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PoiRankListViewHolder(@NotNull View view, @NotNull int[] iArr) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            Intrinsics.checkParameterIsNotNull(iArr, "poiRankResIcon");
            this.l = iArr;
            this.f59978b = (ImageView) view.findViewById(C0906R.id.c2l);
            this.f59979c = (SmartAnimatedImageView) view.findViewById(C0906R.id.c1w);
            this.f59980d = (ImageView) view.findViewById(C0906R.id.c1y);
            this.f59981e = (DmtTextView) view.findViewById(C0906R.id.c29);
            this.f59982f = (DmtTextView) view.findViewById(C0906R.id.c3y);
            this.g = view.findViewById(C0906R.id.bbl);
            this.h = (DmtTextView) view.findViewById(C0906R.id.c2d);
            this.i = (DmtTextView) view.findViewById(C0906R.id.bz5);
            this.j = (DmtTextView) view.findViewById(C0906R.id.c1g);
            this.k = view.findViewById(C0906R.id.d58);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/nearby/adapter/PoiRankListAdapter$OnPoiRankListItemClickListener;", "", "onPoiRankListItemClick", "", "simplePoiInfoStruct", "Lcom/ss/android/ugc/aweme/feed/model/poi/SimplePoiInfoStruct;", "isCoupon", "", "position", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(@NotNull SimplePoiInfoStruct simplePoiInfoStruct, @NotNull String str, int i);
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f59971a, false, 65195, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f59971a, false, 65195, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.f59976f = str2;
    }

    public PoiRankListAdapter(@Nullable a aVar) {
        this.i = aVar;
        af a2 = af.a(d.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "LocationHelperCompat.get…ionUtils.getAppContext())");
        this.h = a2.f();
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(@Nullable ViewGroup viewGroup, int i2) {
        Context context;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f59971a, false, 65197, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f59971a, false, 65197, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        if (viewGroup2 != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.yu, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new PoiRankListViewHolder(inflate, this.g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x03a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindBasicViewHolder(@org.jetbrains.annotations.Nullable android.support.v7.widget.RecyclerView.ViewHolder r30, int r31) {
        /*
            r29 = this;
            r7 = r29
            r9 = r31
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r12 = 1
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f59971a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 65196(0xfeac, float:9.1359E-41)
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f59971a
            r3 = 0
            r4 = 65196(0xfeac, float:9.1359E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004d:
            if (r30 == 0) goto L_0x042e
            r0 = r30
            com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter$PoiRankListViewHolder r0 = (com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter.PoiRankListViewHolder) r0
            java.util.List r1 = r7.mItems
            java.lang.Object r1 = r1.get(r9)
            com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r1 = (com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct) r1
            com.ss.android.ugc.aweme.poi.a r2 = r7.h
            com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter$a r3 = r7.i
            boolean r4 = r7.f59972b
            java.lang.String r5 = r7.f59973c
            int r6 = r7.f59974d
            java.lang.String r8 = r7.f59975e
            java.lang.String r15 = r7.f59976f
            r14 = 9
            java.lang.Object[] r13 = new java.lang.Object[r14]
            r13[r11] = r1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r31)
            r13[r12] = r16
            r13[r10] = r2
            r20 = 3
            r13[r20] = r3
            java.lang.Byte r16 = java.lang.Byte.valueOf(r4)
            r21 = 4
            r13[r21] = r16
            r22 = 5
            r13[r22] = r5
            java.lang.Integer r16 = java.lang.Integer.valueOf(r6)
            r10 = 6
            r13[r10] = r16
            r24 = 7
            r13[r24] = r8
            r10 = 8
            r13[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter.PoiRankListViewHolder.f59977a
            r17 = 0
            r18 = 65198(0xfeae, float:9.1362E-41)
            java.lang.Class[] r10 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct> r19 = com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct.class
            r10[r11] = r19
            java.lang.Class r19 = java.lang.Integer.TYPE
            r10[r12] = r19
            java.lang.Class<com.ss.android.ugc.aweme.poi.a> r19 = com.ss.android.ugc.aweme.poi.a.class
            r23 = 2
            r10[r23] = r19
            java.lang.Class<com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter$a> r19 = com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter.a.class
            r10[r20] = r19
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r10[r21] = r19
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r10[r22] = r19
            java.lang.Class r19 = java.lang.Integer.TYPE
            r25 = 6
            r10[r25] = r19
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r10[r24] = r19
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r26 = 8
            r10[r26] = r19
            java.lang.Class r19 = java.lang.Void.TYPE
            r12 = 9
            r14 = r0
            r27 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r10
            boolean r10 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r10 == 0) goto L_0x0141
            java.lang.Object[] r10 = new java.lang.Object[r12]
            r10[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r9 = 1
            r10[r9] = r1
            r1 = 2
            r10[r1] = r2
            r10[r20] = r3
            java.lang.Byte r1 = java.lang.Byte.valueOf(r4)
            r10[r21] = r1
            r10[r22] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2 = 6
            r10[r2] = r1
            r10[r24] = r8
            r15 = r27
            r1 = 8
            r10[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r1 = com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter.PoiRankListViewHolder.f59977a
            r2 = 0
            r3 = 65198(0xfeae, float:9.1362E-41)
            java.lang.Class[] r13 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct> r4 = com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct.class
            r13[r11] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r5 = 1
            r13[r5] = r4
            java.lang.Class<com.ss.android.ugc.aweme.poi.a> r4 = com.ss.android.ugc.aweme.poi.a.class
            r5 = 2
            r13[r5] = r4
            java.lang.Class<com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter$a> r4 = com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter.a.class
            r13[r20] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r13[r21] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r13[r22] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r5 = 6
            r13[r5] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r13[r24] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 8
            r13[r5] = r4
            java.lang.Class r14 = java.lang.Void.TYPE
            r8 = r10
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0141:
            r15 = r27
            java.lang.String r10 = "previousPage"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r10)
            java.lang.String r10 = "districtCode"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r10)
            java.lang.String r10 = "rankSubClass"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r15, r10)
            if (r1 == 0) goto L_0x042d
            if (r9 < 0) goto L_0x042d
            r10 = 10
            if (r9 < r10) goto L_0x015c
            goto L_0x042d
        L_0x015c:
            r10 = 6
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r13[r11] = r1
            r10 = 1
            r13[r10] = r5
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r12 = 2
            r13[r12] = r10
            r13[r20] = r8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r31)
            r13[r21] = r10
            r13[r22] = r15
            com.meituan.robust.ChangeQuickRedirect r10 = com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter.PoiRankListViewHolder.f59977a
            r16 = 0
            r17 = 65199(0xfeaf, float:9.1363E-41)
            r12 = 6
            java.lang.Class[] r14 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct> r12 = com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct.class
            r14[r11] = r12
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r18 = 1
            r14[r18] = r12
            java.lang.Class r12 = java.lang.Integer.TYPE
            r18 = 2
            r14[r18] = r12
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r14[r20] = r12
            java.lang.Class r12 = java.lang.Integer.TYPE
            r14[r21] = r12
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r14[r22] = r12
            java.lang.Class r19 = java.lang.Void.TYPE
            r12 = r14
            r14 = r0
            r28 = r15
            r15 = r10
            r18 = r12
            boolean r10 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r10 == 0) goto L_0x01f2
            r10 = 6
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r13[r11] = r1
            r10 = 1
            r13[r10] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r6 = 2
            r13[r6] = r5
            r13[r20] = r8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r31)
            r13[r21] = r5
            r10 = r28
            r13[r22] = r10
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter.PoiRankListViewHolder.f59977a
            r16 = 0
            r17 = 65199(0xfeaf, float:9.1363E-41)
            r5 = 6
            java.lang.Class[] r5 = new java.lang.Class[r5]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct> r6 = com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct.class
            r5[r11] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r8 = 1
            r5[r8] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r8 = 2
            r5[r8] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r20] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r5[r21] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r22] = r6
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r5
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x023b
        L_0x01f2:
            r10 = r28
            java.lang.String r12 = "leaderboard_cell_show"
            com.ss.android.ugc.aweme.app.d.d r13 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r14 = "enter_from"
            java.lang.String r15 = "poi_leaderboard"
            com.ss.android.ugc.aweme.app.d.d r13 = r13.a((java.lang.String) r14, (java.lang.String) r15)
            java.lang.String r14 = "previous_page"
            com.ss.android.ugc.aweme.app.d.d r5 = r13.a((java.lang.String) r14, (java.lang.String) r5)
            java.lang.String r13 = "rank_index"
            int r14 = r9 + 1
            java.lang.String r14 = java.lang.String.valueOf(r14)
            com.ss.android.ugc.aweme.app.d.d r5 = r5.a((java.lang.String) r13, (java.lang.String) r14)
            java.lang.String r13 = "poi_channel"
            com.ss.android.ugc.aweme.app.d.d r5 = r5.a((java.lang.String) r13, (int) r6)
            java.lang.String r6 = "sub_class"
            com.ss.android.ugc.aweme.app.d.d r5 = r5.a((java.lang.String) r6, (java.lang.String) r10)
            java.lang.String r6 = "city_info"
            java.lang.String r10 = com.ss.android.ugc.aweme.u.aa.a()
            com.ss.android.ugc.aweme.app.d.d r5 = r5.a((java.lang.String) r6, (java.lang.String) r10)
            java.lang.String r6 = "district_code"
            com.ss.android.ugc.aweme.app.d.d r5 = r5.a((java.lang.String) r6, (java.lang.String) r8)
            java.lang.String r6 = "poi_id"
            java.lang.String r8 = r1.poiId
            com.ss.android.ugc.aweme.app.d.d r5 = r5.a((java.lang.String) r6, (java.lang.String) r8)
            com.ss.android.ugc.aweme.poi.e.h.a((com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct) r1, (java.lang.String) r12, (com.ss.android.ugc.aweme.app.d.d) r5)
        L_0x023b:
            android.view.View r5 = r0.itemView
            com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter$PoiRankListViewHolder$b r6 = new com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter$PoiRankListViewHolder$b
            r6.<init>(r3, r1, r9)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5.setOnClickListener(r6)
            if (r4 == 0) goto L_0x0256
            if (r9 != 0) goto L_0x0256
            android.view.View r3 = r0.k
            java.lang.String r4 = "mTopDivider"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r3.setVisibility(r11)
            goto L_0x0262
        L_0x0256:
            android.view.View r3 = r0.k
            java.lang.String r4 = "mTopDivider"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r4 = 8
            r3.setVisibility(r4)
        L_0x0262:
            android.widget.ImageView r3 = r0.f59978b
            int[] r4 = r0.l
            r4 = r4[r9]
            r3.setImageResource(r4)
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r1.cover
            if (r3 == 0) goto L_0x029d
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r1.cover
            java.lang.String r4 = "simplePoiInfoStruct.cover"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.util.List r3 = r3.getUrlList()
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0283
            goto L_0x029d
        L_0x0283:
            com.ss.android.ugc.aweme.views.SmartAnimatedImageView r3 = r0.f59979c
            com.bytedance.lighten.loader.SmartImageView r3 = (com.bytedance.lighten.loader.SmartImageView) r3
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r1.cover
            java.lang.String r5 = "poi"
            r6 = 240(0xf0, float:3.36E-43)
            com.ss.android.ugc.aweme.views.m.a((com.bytedance.lighten.loader.SmartImageView) r3, (com.ss.android.ugc.aweme.base.model.UrlModel) r4, (int) r6, (int) r6, (java.lang.String) r5)
            android.widget.ImageView r3 = r0.f59980d
            java.lang.String r4 = "mPoiImagePlaceHolder"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r4 = 8
            r3.setVisibility(r4)
            goto L_0x02af
        L_0x029d:
            com.ss.android.ugc.aweme.views.SmartAnimatedImageView r3 = r0.f59979c
            r4 = 2131624939(0x7f0e03eb, float:1.8877072E38)
            r3.setImageResource(r4)
            android.widget.ImageView r3 = r0.f59980d
            java.lang.String r4 = "mPoiImagePlaceHolder"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r3.setVisibility(r11)
        L_0x02af:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.f59981e
            java.lang.String r4 = "mPoiName"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.String r4 = r1.poiName
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            java.lang.String r3 = r1.optionName
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x02e2
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.f59982f
            java.lang.String r4 = "mPoiType"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.String r4 = r1.optionName
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.f59982f
            java.lang.String r4 = "mPoiType"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r3.setVisibility(r11)
            r4 = 8
            goto L_0x02ee
        L_0x02e2:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.f59982f
            java.lang.String r4 = "mPoiType"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r4 = 8
            r3.setVisibility(r4)
        L_0x02ee:
            double r5 = r1.cost
            int r3 = (int) r5
            if (r3 != 0) goto L_0x02fe
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.h
            java.lang.String r5 = "mPoiPerPrice"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
            r3.setVisibility(r4)
            goto L_0x034a
        L_0x02fe:
            android.view.View r4 = r0.itemView
            java.lang.String r5 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            android.content.Context r4 = r4.getContext()
            java.lang.String r5 = "itemView.context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131561719(0x7f0d0cf7, float:1.8748846E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "itemView.context.resourc…String(R.string.poi_cost)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r6[r11] = r3
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.String r4 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r0.h
            java.lang.String r5 = "mPoiPerPrice"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4.setText(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.h
            java.lang.String r4 = "mPoiPerPrice"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r3.setVisibility(r11)
        L_0x034a:
            android.view.View r3 = r0.g
            java.lang.String r4 = "mLine"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r0.f59982f
            java.lang.String r5 = "mPoiType"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            int r4 = r4.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x0370
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r0.h
            java.lang.String r6 = "mPoiPerPrice"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r6)
            int r4 = r4.getVisibility()
            if (r4 != r5) goto L_0x036e
            goto L_0x0370
        L_0x036e:
            r4 = 0
            goto L_0x0372
        L_0x0370:
            r4 = 8
        L_0x0372:
            r3.setVisibility(r4)
            java.lang.String r3 = r1.businessAreaName
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0398
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.i
            java.lang.String r4 = "mPoiAddress"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r3.setVisibility(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.i
            java.lang.String r4 = "mPoiAddress"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.String r4 = r1.businessAreaName
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            goto L_0x03a4
        L_0x0398:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.i
            java.lang.String r4 = "mPoiAddress"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r4 = 8
            r3.setVisibility(r4)
        L_0x03a4:
            if (r2 == 0) goto L_0x0414
            boolean r3 = r2.isValid()
            if (r3 == 0) goto L_0x0414
            com.ss.android.ugc.aweme.poi.model.f r3 = r1.poiAddress
            java.lang.String r3 = r3.cityCode
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = com.ss.android.ugc.aweme.feed.c.d()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0414
            java.lang.String r3 = r1.latitude
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0414
            java.lang.String r3 = r1.longitude
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x03d3
            goto L_0x0414
        L_0x03d3:
            double r13 = r2.latitude
            double r2 = r2.longitude
            java.lang.String r4 = r1.latitude
            java.lang.String r5 = "simplePoiInfoStruct.latitude"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            double r17 = java.lang.Double.parseDouble(r4)
            java.lang.String r1 = r1.longitude
            java.lang.String r4 = "simplePoiInfoStruct.longitude"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            double r19 = java.lang.Double.parseDouble(r1)
            android.view.View r1 = r0.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            android.content.Context r12 = r1.getContext()
            r15 = r2
            java.lang.String r1 = com.ss.android.ugc.aweme.poi.e.c.a(r12, r13, r15, r17, r19)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.j
            java.lang.String r3 = "mPoiDistance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.j
            java.lang.String r2 = "mPoiDistance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r11)
            goto L_0x0420
        L_0x0414:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.j
            java.lang.String r2 = "mPoiDistance"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r2 = 8
            r1.setVisibility(r2)
        L_0x0420:
            android.view.View r1 = r0.g
            com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter$PoiRankListViewHolder$c r2 = new com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter$PoiRankListViewHolder$c
            r2.<init>(r0)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.post(r2)
            return
        L_0x042d:
            return
        L_0x042e:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter.PoiRankListViewHolder"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.nearby.adapter.PoiRankListAdapter.onBindBasicViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }
}
