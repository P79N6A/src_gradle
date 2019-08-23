package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.ies.dmt.ui.widget.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.discover.adapter.HotSearchWordViewHolder;
import com.ss.android.ugc.aweme.discover.model.HotSearchEntity;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.ak;
import com.ss.android.ugc.aweme.discover.ui.aw;
import com.ss.android.ugc.aweme.utils.bg;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0018\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0006H\u0014J\b\u0010 \u001a\u00020\u001bH\u0003J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0013H\u0016J\b\u0010#\u001a\u00020$H\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/widget/SearchEmptyView;", "Landroid/widget/ScrollView;", "Lcom/bytedance/ies/dmt/ui/widget/IDmtDefaultView;", "context", "Landroid/content/Context;", "pageIndex", "", "(Landroid/content/Context;I)V", "container", "Landroid/widget/LinearLayout;", "emptyDefaultView", "Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultView;", "hotSearchFetcher", "Lcom/ss/android/ugc/aweme/discover/repo/fetcher/HotSearchWordsFetcher;", "hotSearchHolder", "Lcom/ss/android/ugc/aweme/discover/adapter/HotSearchWordViewHolder;", "hotSearchView", "Landroid/view/View;", "mStatus", "Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;", "getPageIndex", "()I", "divider", "getHotSearchEnterFrom", "", "getSearchEnterFrom", "initEmptyView", "", "initHotSearchView", "onVisibilityChanged", "changedView", "visibility", "refresh", "setStatus", "status", "shouldShowHotSearch", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends ScrollView implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43333a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f43334c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public HotSearchWordViewHolder f43335b;

    /* renamed from: d  reason: collision with root package name */
    private View f43336d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.d.b.c f43337e = new com.ss.android.ugc.aweme.discover.d.b.c();

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f43338f;
    private DmtDefaultView g;
    private com.bytedance.ies.dmt.ui.widget.c h;
    private final int i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/widget/SearchEmptyView$Companion;", "", "()V", "DIVIDER_HEIGHT", "", "DIVIDER_MARGIN", "EMPTY_VIEW_HEIGHT", "HOT_SEARCH_BOTTOM_MARGIN", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/discover/widget/SearchEmptyView$initHotSearchView$1", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$IHotSearchHandler;", "handleHotSearchItemClick", "", "item", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "position", "", "enterFrom", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements ak.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f43340b;

        b(c cVar) {
            this.f43340b = cVar;
        }

        public final void a(@NotNull HotSearchItem hotSearchItem, int i, @NotNull String str) {
            HotSearchItem hotSearchItem2 = hotSearchItem;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{hotSearchItem2, Integer.valueOf(i), str2}, this, f43339a, false, 38292, new Class[]{HotSearchItem.class, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hotSearchItem2, Integer.valueOf(i), str2}, this, f43339a, false, 38292, new Class[]{HotSearchItem.class, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(hotSearchItem2, "item");
            Intrinsics.checkParameterIsNotNull(str2, "enterFrom");
            SearchResultParam openNewSearchContainer = new SearchResultParam().setKeyword(hotSearchItem.getWord()).setRealSearchWord(hotSearchItem.getRealSearchWord()).setSearchFrom(2).setEnterFrom(this.f43340b.getSearchEnterFrom()).setSource("hot_search_section").setOpenNewSearchContainer(!com.ss.android.g.a.a());
            Intrinsics.checkExpressionValueIsNotNull(openNewSearchContainer, "param");
            bg.a(new com.ss.android.ugc.aweme.discover.a.b(openNewSearchContainer));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "kotlin.jvm.PlatformType", "", "it", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "apply"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.discover.widget.c$c  reason: collision with other inner class name */
    static final class C0543c<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43341a;

        /* renamed from: b  reason: collision with root package name */
        public static final C0543c f43342b = new C0543c();

        C0543c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            HotSearchListResponse hotSearchListResponse = (HotSearchListResponse) obj;
            if (PatchProxy.isSupport(new Object[]{hotSearchListResponse}, this, f43341a, false, 38293, new Class[]{HotSearchListResponse.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{hotSearchListResponse}, this, f43341a, false, 38293, new Class[]{HotSearchListResponse.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSearchListResponse, AdvanceSetting.NETWORK_TYPE);
            HotSearchEntity data = hotSearchListResponse.getData();
            Intrinsics.checkExpressionValueIsNotNull(data, "it.data");
            return data.getList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "wordList", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "kotlin.jvm.PlatformType", "", "accept"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Consumer<List<HotSearchItem>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43343a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f43344b;

        d(c cVar) {
            this.f43344b = cVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f43343a, false, 38294, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f43343a, false, 38294, new Class[]{List.class}, Void.TYPE);
                return;
            }
            if (this.f43344b.isAttachedToWindow()) {
                HotSearchWordViewHolder hotSearchWordViewHolder = this.f43344b.f43335b;
                if (hotSearchWordViewHolder != null) {
                    hotSearchWordViewHolder.a(list);
                }
            }
        }
    }

    public final int getPageIndex() {
        return this.i;
    }

    private final String getHotSearchEnterFrom() {
        if (this.i == aw.f43134b) {
            return "general_search";
        }
        return "search_result";
    }

    public final String getSearchEnterFrom() {
        int i2 = this.i;
        if (i2 == aw.f43134b) {
            return "hot_search_general_search";
        }
        if (i2 == aw.f43135c) {
            return "hot_search_video_search";
        }
        return "";
    }

    private final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f43333a, false, 38285, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f43333a, false, 38285, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if ((this.i == aw.f43134b || this.i == aw.f43135c) && com.ss.android.ugc.aweme.discover.helper.b.n()) {
            z = true;
        }
        return z;
    }

    public final void setStatus(@NotNull com.bytedance.ies.dmt.ui.widget.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f43333a, false, 38283, new Class[]{com.bytedance.ies.dmt.ui.widget.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f43333a, false, 38283, new Class[]{com.bytedance.ies.dmt.ui.widget.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar, "status");
        DmtDefaultView dmtDefaultView = this.g;
        if (dmtDefaultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptyDefaultView");
        }
        dmtDefaultView.setStatus(cVar);
        this.h = cVar;
    }

    public final void onVisibilityChanged(@NotNull View view, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, f43333a, false, 38288, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, f43333a, false, 38288, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "changedView");
        super.onVisibilityChanged(view, i2);
        if (Intrinsics.areEqual((Object) view, (Object) this) && i2 == 0 && a()) {
            if (PatchProxy.isSupport(new Object[0], this, f43333a, false, 38289, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43333a, false, 38289, new Class[0], Void.TYPE);
                return;
            }
            Single.fromObservable(this.f43337e.a(0)).map(C0543c.f43342b).observeOn(AndroidSchedulers.mainThread()).subscribe((Consumer<? super T>) new d<Object>(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, int i2) {
        super(context);
        View view;
        int i3;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.i = i2;
        this.f43338f = new LinearLayout(context);
        setFillViewport(true);
        this.f43338f.setOrientation(1);
        this.f43338f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f43338f);
        if (PatchProxy.isSupport(new Object[0], this, f43333a, false, 38284, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43333a, false, 38284, new Class[0], Void.TYPE);
        } else {
            this.g = new DmtDefaultView(getContext());
            com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(getContext()).a(2130840144).b((int) C0906R.string.f4486dmt).c(C0906R.string.dmu).f20493a;
            Intrinsics.checkExpressionValueIsNotNull(cVar, "DmtDefaultStatus.Builder…\n                .build()");
            this.h = cVar;
            if (com.ss.android.ugc.aweme.discover.helper.b.n()) {
                i3 = u.a(380.0d);
            } else {
                i3 = -1;
            }
            DmtDefaultView dmtDefaultView = this.g;
            if (dmtDefaultView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emptyDefaultView");
            }
            dmtDefaultView.setLayoutParams(new LinearLayout.LayoutParams(-1, i3));
            DmtDefaultView dmtDefaultView2 = this.g;
            if (dmtDefaultView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emptyDefaultView");
            }
            com.bytedance.ies.dmt.ui.widget.c cVar2 = this.h;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatus");
            }
            dmtDefaultView2.setStatus(cVar2);
            LinearLayout linearLayout = this.f43338f;
            DmtDefaultView dmtDefaultView3 = this.g;
            if (dmtDefaultView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emptyDefaultView");
            }
            linearLayout.addView(dmtDefaultView3);
        }
        if (a()) {
            if (PatchProxy.isSupport(new Object[0], this, f43333a, false, 38286, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43333a, false, 38286, new Class[0], Void.TYPE);
                return;
            }
            this.f43335b = HotSearchWordViewHolder.a(this, getHotSearchEnterFrom(), new b(this));
            LinearLayout linearLayout2 = this.f43338f;
            if (PatchProxy.isSupport(new Object[0], this, f43333a, false, 38287, new Class[0], View.class)) {
                view = (View) PatchProxy.accessDispatch(new Object[0], this, f43333a, false, 38287, new Class[0], View.class);
            } else {
                view = new View(getContext());
                view.setBackgroundColor(getResources().getColor(C0906R.color.hk));
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, u.a(0.5d));
                marginLayoutParams.leftMargin = u.a(16.0d);
                marginLayoutParams.rightMargin = u.a(16.0d);
                view.setLayoutParams(marginLayoutParams);
            }
            linearLayout2.addView(view);
            HotSearchWordViewHolder hotSearchWordViewHolder = this.f43335b;
            if (hotSearchWordViewHolder == null) {
                Intrinsics.throwNpe();
            }
            this.f43336d = hotSearchWordViewHolder.itemView;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams2.bottomMargin = u.a(24.0d);
            LinearLayout linearLayout3 = this.f43338f;
            HotSearchWordViewHolder hotSearchWordViewHolder2 = this.f43335b;
            if (hotSearchWordViewHolder2 == null) {
                Intrinsics.throwNpe();
            }
            linearLayout3.addView(hotSearchWordViewHolder2.itemView, marginLayoutParams2);
        }
    }
}
