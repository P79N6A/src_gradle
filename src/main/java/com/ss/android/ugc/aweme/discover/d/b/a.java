package com.ss.android.ugc.aweme.discover.d.b;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.discover.api.DiscoverApiNew;
import com.ss.android.ugc.aweme.discover.api.HotSearchApi;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.model.BannerList;
import com.ss.android.ugc.aweme.discover.model.Category;
import com.ss.android.ugc.aweme.discover.model.CategoryList;
import com.ss.android.ugc.aweme.discover.model.CategoryOrAd;
import com.ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.ss.android.ugc.aweme.discover.model.DiscoverListData;
import com.ss.android.ugc.aweme.discover.model.HotSearchEntity;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.ss.android.ugc.aweme.discover.model.HotVideoItem;
import com.ss.android.ugc.aweme.discover.model.HotVideoListResponse;
import com.ss.android.ugc.aweme.discover.model.RankingListCover;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u001b\u001a\u00020\u0002H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/repo/fetcher/DiscoverFetcher;", "Lcom/bytedance/jedi/model/fetcher/SimpleFetcher;", "Lcom/ss/android/ugc/aweme/discover/repo/fetcher/DiscoverRequestParam;", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverListData;", "()V", "discoverApi", "Lcom/ss/android/ugc/aweme/discover/api/DiscoverApiNew;", "hasMore", "", "hotSearchApi", "Lcom/ss/android/ugc/aweme/discover/api/HotSearchApi;", "mCursor", "", "getBanner", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverItemData;", "getCategoryList", "cursor", "count", "getCommonCategoryList", "Lcom/ss/android/ugc/aweme/discover/model/CategoryList;", "getHotSearchWords", "getHotVideos", "getRankingListCover", "refreshHotSearchBillboardCache", "", "requestActual", "param", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends com.bytedance.jedi.model.d.c<b, DiscoverListData> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42190a;

    /* renamed from: d  reason: collision with root package name */
    public static final C0537a f42191d = new C0537a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public volatile int f42192b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f42193c = true;

    /* renamed from: e  reason: collision with root package name */
    private final DiscoverApiNew f42194e = DiscoverApiNew.a.f42073a;

    /* renamed from: f  reason: collision with root package name */
    private final HotSearchApi f42195f = HotSearchApi.a.a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/repo/fetcher/DiscoverFetcher$Companion;", "", "()V", "CATEGORY_PAGE_COUNT", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.discover.d.b.a$a  reason: collision with other inner class name */
    public static final class C0537a {
        private C0537a() {
        }

        public /* synthetic */ C0537a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002 \u0004*.\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lcom/ss/android/ugc/aweme/discover/model/Banner;", "kotlin.jvm.PlatformType", "", "it", "Lcom/ss/android/ugc/aweme/discover/model/BannerList;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42196a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f42197b = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            BannerList bannerList = (BannerList) obj;
            if (PatchProxy.isSupport(new Object[]{bannerList}, this, f42196a, false, 37344, new Class[]{BannerList.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{bannerList}, this, f42196a, false, 37344, new Class[]{BannerList.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(bannerList, AdvanceSetting.NETWORK_TYPE);
            LogPbBean logPbBean = bannerList.logPb;
            Intrinsics.checkExpressionValueIsNotNull(logPbBean, "it.logPb");
            String imprId = logPbBean.getImprId();
            for (Banner next : bannerList.items) {
                Intrinsics.checkExpressionValueIsNotNull(next, "banner");
                next.setRequestId(imprId);
            }
            return Observable.just(bannerList.items);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverItemData;", "it", "", "Lcom/ss/android/ugc/aweme/discover/model/Banner;", "kotlin.jvm.PlatformType", "", "apply"}, k = 3, mv = {1, 1, 15})
    static final class c<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42198a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f42199b = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f42198a, false, 37345, new Class[]{List.class}, DiscoverItemData.class)) {
                return (DiscoverItemData) PatchProxy.accessDispatch(new Object[]{list}, this, f42198a, false, 37345, new Class[]{List.class}, DiscoverItemData.class);
            }
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            DiscoverItemData discoverItemData = new DiscoverItemData(4);
            discoverItemData.setBannerList(list);
            return discoverItemData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/discover/model/Category;", "kotlin.jvm.PlatformType", "it", "Lcom/ss/android/ugc/aweme/discover/model/CategoryList;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class d<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42200a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f42201b;

        d(a aVar) {
            this.f42201b = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            CategoryList categoryList = (CategoryList) obj;
            if (PatchProxy.isSupport(new Object[]{categoryList}, this, f42200a, false, 37346, new Class[]{CategoryList.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{categoryList}, this, f42200a, false, 37346, new Class[]{CategoryList.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(categoryList, AdvanceSetting.NETWORK_TYPE);
            this.f42201b.f42192b = categoryList.cursor;
            this.f42201b.f42193c = categoryList.isHasMore();
            return Observable.fromIterable(categoryList.items);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/CategoryOrAd;", "it", "Lcom/ss/android/ugc/aweme/discover/model/Category;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class e<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42202a;

        /* renamed from: b  reason: collision with root package name */
        public static final e f42203b = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Category category = (Category) obj;
            if (PatchProxy.isSupport(new Object[]{category}, this, f42202a, false, 37347, new Class[]{Category.class}, CategoryOrAd.class)) {
                return (CategoryOrAd) PatchProxy.accessDispatch(new Object[]{category}, this, f42202a, false, 37347, new Class[]{Category.class}, CategoryOrAd.class);
            }
            Intrinsics.checkParameterIsNotNull(category, AdvanceSetting.NETWORK_TYPE);
            List<Aweme> items = category.getItems();
            if (!CollectionUtils.isEmpty(items)) {
                int size = items.size();
                for (int i = 0; i < size; i++) {
                    items.set(i, com.ss.android.ugc.aweme.feed.a.a().a(items.get(i)));
                }
            }
            if (category.isPicAd()) {
                return new CategoryOrAd(category.getAdData());
            }
            return new CategoryOrAd(category);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverItemData;", "it", "Lcom/ss/android/ugc/aweme/discover/model/CategoryOrAd;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class f<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42204a;

        /* renamed from: b  reason: collision with root package name */
        public static final f f42205b = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            CategoryOrAd categoryOrAd = (CategoryOrAd) obj;
            if (PatchProxy.isSupport(new Object[]{categoryOrAd}, this, f42204a, false, 37348, new Class[]{CategoryOrAd.class}, DiscoverItemData.class)) {
                return (DiscoverItemData) PatchProxy.accessDispatch(new Object[]{categoryOrAd}, this, f42204a, false, 37348, new Class[]{CategoryOrAd.class}, DiscoverItemData.class);
            }
            Intrinsics.checkParameterIsNotNull(categoryOrAd, AdvanceSetting.NETWORK_TYPE);
            DiscoverItemData discoverItemData = new DiscoverItemData(5);
            discoverItemData.setCategoryOrAd(categoryOrAd);
            return discoverItemData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "it", "apply"}, k = 3, mv = {1, 1, 15})
    static final class g<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42206a;

        /* renamed from: b  reason: collision with root package name */
        public static final g f42207b = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            HotSearchListResponse hotSearchListResponse = (HotSearchListResponse) obj;
            if (PatchProxy.isSupport(new Object[]{hotSearchListResponse}, this, f42206a, false, 37349, new Class[]{HotSearchListResponse.class}, HotSearchListResponse.class)) {
                return (HotSearchListResponse) PatchProxy.accessDispatch(new Object[]{hotSearchListResponse}, this, f42206a, false, 37349, new Class[]{HotSearchListResponse.class}, HotSearchListResponse.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSearchListResponse, AdvanceSetting.NETWORK_TYPE);
            HotSearchEntity data = hotSearchListResponse.getData();
            Intrinsics.checkExpressionValueIsNotNull(data, "it.data");
            List<HotSearchItem> list = data.getList();
            LogPbBean logPb = hotSearchListResponse.getLogPb();
            for (HotSearchItem logPb2 : list) {
                logPb2.setLogPb(logPb);
            }
            return hotSearchListResponse;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverItemData;", "it", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class h<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42208a;

        /* renamed from: b  reason: collision with root package name */
        public static final h f42209b = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            HotSearchListResponse hotSearchListResponse = (HotSearchListResponse) obj;
            if (PatchProxy.isSupport(new Object[]{hotSearchListResponse}, this, f42208a, false, 37350, new Class[]{HotSearchListResponse.class}, DiscoverItemData.class)) {
                return (DiscoverItemData) PatchProxy.accessDispatch(new Object[]{hotSearchListResponse}, this, f42208a, false, 37350, new Class[]{HotSearchListResponse.class}, DiscoverItemData.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSearchListResponse, AdvanceSetting.NETWORK_TYPE);
            DiscoverItemData discoverItemData = new DiscoverItemData(1);
            discoverItemData.setHotSearchResponse(hotSearchListResponse);
            return discoverItemData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002 \u0004*.\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lcom/ss/android/ugc/aweme/discover/model/HotVideoItem;", "kotlin.jvm.PlatformType", "", "it", "Lcom/ss/android/ugc/aweme/discover/model/HotVideoListResponse;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class i<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42210a;

        /* renamed from: b  reason: collision with root package name */
        public static final i f42211b = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            HotSearchInfo hotSearchInfo;
            HotVideoListResponse hotVideoListResponse = (HotVideoListResponse) obj;
            if (PatchProxy.isSupport(new Object[]{hotVideoListResponse}, this, f42210a, false, 37351, new Class[]{HotVideoListResponse.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{hotVideoListResponse}, this, f42210a, false, 37351, new Class[]{HotVideoListResponse.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(hotVideoListResponse, AdvanceSetting.NETWORK_TYPE);
            List<HotVideoItem> list = hotVideoListResponse.mHotVideoItemList;
            Collection collection = list;
            if (!CollectionUtils.isEmpty(collection)) {
                Intrinsics.checkExpressionValueIsNotNull(list, "videoItems");
                int size = collection.size();
                for (int i = 0; i < size; i++) {
                    HotVideoItem hotVideoItem = list.get(i);
                    Intrinsics.checkExpressionValueIsNotNull(hotVideoItem, "item");
                    Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a(hotVideoItem.getAweme());
                    if (a2 != null) {
                        String hotValue = hotVideoItem.getHotValue();
                        if (a2.getHotSearchInfo() == null) {
                            hotSearchInfo = new HotSearchInfo();
                        } else {
                            hotSearchInfo = a2.getHotSearchInfo();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(hotSearchInfo, "hotSearchInfo");
                        hotSearchInfo.setVideoRank(i + 1);
                        Long valueOf = Long.valueOf(hotValue);
                        Intrinsics.checkExpressionValueIsNotNull(valueOf, "java.lang.Long.valueOf(hotValue)");
                        hotSearchInfo.setVideoRankVV(valueOf.longValue());
                        a2.setHotSearchInfo(hotSearchInfo);
                        a2 = com.ss.android.ugc.aweme.feed.a.a().a(a2);
                    }
                    hotVideoItem.setAweme(a2);
                }
            }
            return Observable.just(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverItemData;", "it", "", "Lcom/ss/android/ugc/aweme/discover/model/HotVideoItem;", "kotlin.jvm.PlatformType", "", "apply"}, k = 3, mv = {1, 1, 15})
    static final class j<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42212a;

        /* renamed from: b  reason: collision with root package name */
        public static final j f42213b = new j();

        j() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f42212a, false, 37352, new Class[]{List.class}, DiscoverItemData.class)) {
                return (DiscoverItemData) PatchProxy.accessDispatch(new Object[]{list}, this, f42212a, false, 37352, new Class[]{List.class}, DiscoverItemData.class);
            }
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            DiscoverItemData discoverItemData = new DiscoverItemData(3);
            discoverItemData.setHotSearchVideos(list);
            return discoverItemData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverItemData;", "it", "Lcom/ss/android/ugc/aweme/discover/model/RankingListCover;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class k<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42214a;

        /* renamed from: b  reason: collision with root package name */
        public static final k f42215b = new k();

        k() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            RankingListCover rankingListCover = (RankingListCover) obj;
            if (PatchProxy.isSupport(new Object[]{rankingListCover}, this, f42214a, false, 37353, new Class[]{RankingListCover.class}, DiscoverItemData.class)) {
                return (DiscoverItemData) PatchProxy.accessDispatch(new Object[]{rankingListCover}, this, f42214a, false, 37353, new Class[]{RankingListCover.class}, DiscoverItemData.class);
            }
            Intrinsics.checkParameterIsNotNull(rankingListCover, AdvanceSetting.NETWORK_TYPE);
            DiscoverItemData discoverItemData = new DiscoverItemData(2);
            discoverItemData.setRankingListCover(rankingListCover);
            return discoverItemData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "kotlin.jvm.PlatformType", "", "it", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class l<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42216a;

        /* renamed from: b  reason: collision with root package name */
        public static final l f42217b = new l();

        l() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            HotSearchListResponse hotSearchListResponse = (HotSearchListResponse) obj;
            if (PatchProxy.isSupport(new Object[]{hotSearchListResponse}, this, f42216a, false, 37354, new Class[]{HotSearchListResponse.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{hotSearchListResponse}, this, f42216a, false, 37354, new Class[]{HotSearchListResponse.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSearchListResponse, AdvanceSetting.NETWORK_TYPE);
            HotSearchEntity data = hotSearchListResponse.getData();
            Intrinsics.checkExpressionValueIsNotNull(data, "it.data");
            return data.getList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/discover/repo/fetcher/DiscoverFetcher$refreshHotSearchBillboardCache$2", "Lio/reactivex/SingleObserver;", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "onError", "", "e", "", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "onSuccess", "t", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class m implements SingleObserver<List<? extends HotSearchItem>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42218a;

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f42218a, false, 37357, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f42218a, false, 37357, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "d");
        }

        m() {
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f42218a, false, 37355, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f42218a, false, 37355, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
            com.ss.android.ugc.aweme.hotsearch.d.a.a((List<HotSearchItem>) null);
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f42218a, false, 37356, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f42218a, false, 37356, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list, "t");
            com.ss.android.ugc.aweme.hotsearch.d.a.a(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverItemData;", "test"}, k = 3, mv = {1, 1, 15})
    static final class n<T> implements Predicate<DiscoverItemData> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42219a;

        /* renamed from: b  reason: collision with root package name */
        public static final n f42220b = new n();

        n() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            DiscoverItemData discoverItemData = (DiscoverItemData) obj;
            if (PatchProxy.isSupport(new Object[]{discoverItemData}, this, f42219a, false, 37358, new Class[]{DiscoverItemData.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{discoverItemData}, this, f42219a, false, 37358, new Class[]{DiscoverItemData.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(discoverItemData, AdvanceSetting.NETWORK_TYPE);
            if (discoverItemData.getType() != 0) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverListData;", "it", "", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverItemData;", "kotlin.jvm.PlatformType", "", "apply"}, k = 3, mv = {1, 1, 15})
    static final class o<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42221a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f42222b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f42223c;

        o(a aVar, boolean z) {
            this.f42222b = aVar;
            this.f42223c = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f42221a, false, 37359, new Class[]{List.class}, DiscoverListData.class)) {
                return (DiscoverListData) PatchProxy.accessDispatch(new Object[]{list}, this, f42221a, false, 37359, new Class[]{List.class}, DiscoverListData.class);
            }
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            if (!this.f42223c || !list.isEmpty()) {
                DiscoverListData discoverListData = new DiscoverListData(list, this.f42222b.f42192b, this.f42222b.f42193c, false, 8, null);
                return discoverListData;
            }
            throw new Exception("api all went wrong");
        }
    }

    private final Observable<DiscoverItemData> b() {
        int i2;
        Integer num;
        if (PatchProxy.isSupport(new Object[0], this, f42190a, false, 37340, new Class[0], Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[0], this, f42190a, false, 37340, new Class[0], Observable.class);
        }
        if (com.ss.android.ugc.aweme.discover.helper.b.a()) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        if (com.ss.android.g.a.b()) {
            SharePrefCache inst = SharePrefCache.inst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
            an<Integer> personalizationMode = inst.getPersonalizationMode();
            Intrinsics.checkExpressionValueIsNotNull(personalizationMode, "SharePrefCache.inst().personalizationMode");
            num = (Integer) personalizationMode.c();
        } else {
            num = null;
        }
        Observable<DiscoverItemData> map = this.f42194e.getBannerList(Integer.valueOf(i2), num).flatMap(b.f42197b).map(c.f42199b);
        Intrinsics.checkExpressionValueIsNotNull(map, "discoverApi.getBannerLis…turn@map banner\n        }");
        return map;
    }

    public final /* synthetic */ Observable b(Object obj) {
        boolean z;
        Observable observable;
        Observable observable2;
        Observable observable3;
        Observable observable4;
        b bVar = (b) obj;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f42190a, false, 37336, new Class[]{b.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{bVar}, this, f42190a, false, 37336, new Class[]{b.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(bVar, "param");
        List<Observable> arrayList = new ArrayList<>();
        List arrayList2 = new ArrayList();
        if (bVar.getCursor() == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f42192b = 0;
            this.f42193c = true;
            if (com.ss.android.g.a.a()) {
                arrayList.add(b());
                arrayList.add(b(0, 10));
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f42190a, false, 37337, new Class[0], Observable.class)) {
                    observable2 = (Observable) PatchProxy.accessDispatch(new Object[0], this, f42190a, false, 37337, new Class[0], Observable.class);
                } else {
                    observable2 = this.f42195f.getHotSearchList(0, 0, "").map(g.f42207b).map(h.f42209b);
                    Intrinsics.checkExpressionValueIsNotNull(observable2, "hotSearchApi.getHotSearc…ap item\n                }");
                }
                arrayList.add(observable2);
                if (PatchProxy.isSupport(new Object[0], this, f42190a, false, 37339, new Class[0], Observable.class)) {
                    observable3 = (Observable) PatchProxy.accessDispatch(new Object[0], this, f42190a, false, 37339, new Class[0], Observable.class);
                } else {
                    observable3 = this.f42195f.getRankingListCover().map(k.f42215b);
                    Intrinsics.checkExpressionValueIsNotNull(observable3, "hotSearchApi.getRankingL…return@map item\n        }");
                }
                arrayList.add(observable3);
                if (PatchProxy.isSupport(new Object[0], this, f42190a, false, 37341, new Class[0], Observable.class)) {
                    observable4 = (Observable) PatchProxy.accessDispatch(new Object[0], this, f42190a, false, 37341, new Class[0], Observable.class);
                } else {
                    observable4 = this.f42195f.getHotVideoList().flatMap(i.f42211b).map(j.f42213b);
                    Intrinsics.checkExpressionValueIsNotNull(observable4, "hotSearchApi.getHotVideo…return@map item\n        }");
                }
                arrayList.add(observable4);
                arrayList.add(b());
                arrayList.add(b(0, 10));
                if (PatchProxy.isSupport(new Object[0], this, f42190a, false, 37338, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f42190a, false, 37338, new Class[0], Void.TYPE);
                } else {
                    Single.fromObservable(this.f42195f.getHotSearchList(1, 0, "").map(l.f42217b).subscribeOn(Schedulers.io())).observeOn(AndroidSchedulers.mainThread()).subscribe((SingleObserver<? super T>) new m<Object>());
                }
            }
        } else {
            arrayList.add(b(bVar.getCursor(), 10));
        }
        for (Observable observable5 : arrayList) {
            if (z) {
                observable = observable5.onErrorReturnItem(new DiscoverItemData(0)).subscribeOn(Schedulers.io());
                Intrinsics.checkExpressionValueIsNotNull(observable, "item.onErrorReturnItem(D…scribeOn(Schedulers.io())");
            } else {
                observable = observable5.subscribeOn(Schedulers.io());
                Intrinsics.checkExpressionValueIsNotNull(observable, "item.subscribeOn(Schedulers.io())");
            }
            arrayList2.add(observable);
        }
        Observable subscribeOn = Observable.concatEager((Iterable<? extends ObservableSource<? extends T>>) arrayList2).filter(n.f42220b).toList().map(new o(this, z)).toObservable().subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "Observable.concatEager(r…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    private final Observable<CategoryList> a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f42190a, false, 37342, new Class[]{Integer.TYPE, Integer.TYPE}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f42190a, false, 37342, new Class[]{Integer.TYPE, Integer.TYPE}, Observable.class);
        }
        Integer num = null;
        if (com.ss.android.g.a.b()) {
            SharePrefCache inst = SharePrefCache.inst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
            an<Integer> personalizationMode = inst.getPersonalizationMode();
            Intrinsics.checkExpressionValueIsNotNull(personalizationMode, "SharePrefCache.inst().personalizationMode");
            num = (Integer) personalizationMode.c();
        }
        if (com.ss.android.g.a.a() && AbTestManager.a().P()) {
            return this.f42194e.getCategoryV2List(i2, i3, num);
        }
        if (com.ss.android.ugc.aweme.discover.helper.b.a()) {
            return this.f42194e.getFindFascinatingList(i2, i3, num);
        }
        return this.f42194e.getCategoryList(i2, i3, num);
    }

    private final Observable<DiscoverItemData> b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), 10}, this, f42190a, false, 37343, new Class[]{Integer.TYPE, Integer.TYPE}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), 10}, this, f42190a, false, 37343, new Class[]{Integer.TYPE, Integer.TYPE}, Observable.class);
        }
        Observable<DiscoverItemData> map = a(i2, 10).flatMap(new d(this)).map(e.f42203b).map(f.f42205b);
        Intrinsics.checkExpressionValueIsNotNull(map, "getCommonCategoryList(cu…ap item\n                }");
        return map;
    }
}
