package com.ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.discover.model.CategoryOrAd;
import com.ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.ss.android.ugc.aweme.discover.model.DiscoverListData;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0017\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0005J\u0016\u0010 \u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/viewmodel/DiscoverViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "hasMore", "Landroid/arch/lifecycle/MutableLiveData;", "", "getHasMore", "()Landroid/arch/lifecycle/MutableLiveData;", "hotSearchWordsBundle", "Lcom/ss/android/ugc/aweme/arch/BundleData;", "", "", "getHotSearchWordsBundle", "list", "", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverItemData;", "getList", "loadMoreResult", "getLoadMoreResult", "mCursor", "", "mRepo", "Lcom/ss/android/ugc/aweme/discover/repo/DiscoverRepository;", "refreshResult", "getRefreshResult", "loadMore", "", "mobTrendingShowEvent", "num", "(Ljava/lang/Integer;)V", "refresh", "cacheThenFetch", "request", "useCache", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoverViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43210a;
    public static final a h = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final MutableLiveData<Boolean> f43211b = new MutableLiveData<>();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final MutableLiveData<Boolean> f43212c = new MutableLiveData<>();
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final MutableLiveData<Boolean> f43213d = new MutableLiveData<>();
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final MutableLiveData<List<DiscoverItemData>> f43214e = new MutableLiveData<>();
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final MutableLiveData<com.ss.android.ugc.aweme.arch.b<String, Object>> f43215f = new MutableLiveData<>();
    public int g;
    private com.ss.android.ugc.aweme.discover.d.a i = new com.ss.android.ugc.aweme.discover.d.a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/viewmodel/DiscoverViewModel$Companion;", "", "()V", "TAG", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/discover/viewmodel/DiscoverViewModel$loadMore$1", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverListData;", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "onSuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Observer<DiscoverListData> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43216a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoverViewModel f43217b;

        public final void onComplete() {
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f43216a, false, 38156, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f43216a, false, 38156, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "d");
        }

        b(DiscoverViewModel discoverViewModel) {
            this.f43217b = discoverViewModel;
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f43216a, false, 38159, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f43216a, false, 38159, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
            this.f43217b.f43213d.setValue(Boolean.FALSE);
        }

        public final /* synthetic */ void onNext(Object obj) {
            DiscoverListData discoverListData = (DiscoverListData) obj;
            if (PatchProxy.isSupport(new Object[]{discoverListData}, this, f43216a, false, 38157, new Class[]{DiscoverListData.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{discoverListData}, this, f43216a, false, 38157, new Class[]{DiscoverListData.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(discoverListData, "t");
            if (PatchProxy.isSupport(new Object[]{discoverListData}, this, f43216a, false, 38158, new Class[]{DiscoverListData.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{discoverListData}, this, f43216a, false, 38158, new Class[]{DiscoverListData.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(discoverListData, "t");
            List arrayList = new ArrayList();
            List list = (List) this.f43217b.f43214e.getValue();
            if (list != null) {
                Intrinsics.checkExpressionValueIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
                arrayList.addAll(list);
            }
            arrayList.addAll(discoverListData.getItemList());
            this.f43217b.a(Integer.valueOf(discoverListData.getItemList().size()));
            this.f43217b.f43214e.setValue(arrayList);
            this.f43217b.f43213d.setValue(Boolean.TRUE);
            this.f43217b.f43211b.setValue(Boolean.valueOf(discoverListData.getHasMore()));
            this.f43217b.g = discoverListData.getCursor();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverListData;", "it", "apply"}, k = 3, mv = {1, 1, 15})
    static final class c<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43218a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoverViewModel f43219b;

        c(DiscoverViewModel discoverViewModel) {
            this.f43219b = discoverViewModel;
        }

        public final /* synthetic */ Object apply(Object obj) {
            DiscoverListData discoverListData = (DiscoverListData) obj;
            if (PatchProxy.isSupport(new Object[]{discoverListData}, this, f43218a, false, 38160, new Class[]{DiscoverListData.class}, DiscoverListData.class)) {
                return (DiscoverListData) PatchProxy.accessDispatch(new Object[]{discoverListData}, this, f43218a, false, 38160, new Class[]{DiscoverListData.class}, DiscoverListData.class);
            }
            Intrinsics.checkParameterIsNotNull(discoverListData, AdvanceSetting.NETWORK_TYPE);
            if (!discoverListData.isCache()) {
                ArrayList arrayList = new ArrayList();
                for (DiscoverItemData next : discoverListData.getItemList()) {
                    if (next.getType() == 5) {
                        CategoryOrAd categoryOrAd = next.getCategoryOrAd();
                        if (categoryOrAd != null && categoryOrAd.isCategory()) {
                            arrayList.add(next);
                        }
                    }
                }
                this.f43219b.a(Integer.valueOf(arrayList.size()));
            }
            return discoverListData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/discover/viewmodel/DiscoverViewModel$refresh$2", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/discover/model/DiscoverListData;", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "onSuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements Observer<DiscoverListData> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43220a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiscoverViewModel f43221b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f43222c;

        public final void onComplete() {
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f43220a, false, 38162, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f43220a, false, 38162, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "d");
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f43220a, false, 38164, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f43220a, false, 38164, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
            this.f43221b.f43212c.setValue(Boolean.FALSE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00d6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNext(java.lang.Object r11) {
            /*
                r10 = this;
                r7 = r11
                com.ss.android.ugc.aweme.discover.model.DiscoverListData r7 = (com.ss.android.ugc.aweme.discover.model.DiscoverListData) r7
                r8 = 1
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r9 = 0
                r0[r9] = r7
                com.meituan.robust.ChangeQuickRedirect r2 = f43220a
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<com.ss.android.ugc.aweme.discover.model.DiscoverListData> r1 = com.ss.android.ugc.aweme.discover.model.DiscoverListData.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 38161(0x9511, float:5.3475E-41)
                r1 = r10
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0035
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r0[r9] = r7
                com.meituan.robust.ChangeQuickRedirect r2 = f43220a
                r3 = 0
                r4 = 38161(0x9511, float:5.3475E-41)
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<com.ss.android.ugc.aweme.discover.model.DiscoverListData> r1 = com.ss.android.ugc.aweme.discover.model.DiscoverListData.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0035:
                java.lang.String r0 = "t"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r0[r9] = r7
                com.meituan.robust.ChangeQuickRedirect r2 = f43220a
                r3 = 0
                r4 = 38163(0x9513, float:5.3478E-41)
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<com.ss.android.ugc.aweme.discover.model.DiscoverListData> r1 = com.ss.android.ugc.aweme.discover.model.DiscoverListData.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r10
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x006a
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r0[r9] = r7
                com.meituan.robust.ChangeQuickRedirect r2 = f43220a
                r3 = 0
                r4 = 38163(0x9513, float:5.3478E-41)
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<com.ss.android.ugc.aweme.discover.model.DiscoverListData> r1 = com.ss.android.ugc.aweme.discover.model.DiscoverListData.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x006a:
                java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r0 = r10.f43221b
                android.arch.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverItemData>> r0 = r0.f43214e
                java.util.List r1 = r7.getItemList()
                r0.setValue(r1)
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r0 = r10.f43221b
                android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.f43212c
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.setValue(r1)
                java.util.List r0 = r7.getItemList()
                java.util.Iterator r0 = r0.iterator()
            L_0x0089:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00e4
                java.lang.Object r1 = r0.next()
                com.ss.android.ugc.aweme.discover.model.DiscoverItemData r1 = (com.ss.android.ugc.aweme.discover.model.DiscoverItemData) r1
                int r2 = r1.getType()
                if (r2 != r8) goto L_0x0089
                com.ss.android.ugc.aweme.arch.b r0 = new com.ss.android.ugc.aweme.arch.b
                r0.<init>()
                com.ss.android.ugc.aweme.discover.model.HotSearchListResponse r1 = r1.getHotSearchResponse()
                java.lang.String r2 = "key_hot_search_list"
                r3 = 0
                if (r1 == 0) goto L_0x00b4
                com.ss.android.ugc.aweme.discover.model.HotSearchEntity r4 = r1.getData()
                if (r4 == 0) goto L_0x00b4
                java.util.List r4 = r4.getList()
                goto L_0x00b5
            L_0x00b4:
                r4 = r3
            L_0x00b5:
                r0.a(r2, r4)
                java.lang.String r2 = "key_operated_search_list"
                if (r1 == 0) goto L_0x00c1
                java.lang.String r4 = r1.getDefaultSearchKeyword()
                goto L_0x00c2
            L_0x00c1:
                r4 = r3
            L_0x00c2:
                r0.a(r2, r4)
                java.lang.String r2 = "key_operated_real_search_word"
                if (r1 == 0) goto L_0x00ce
                java.lang.String r4 = r1.getRealDefaultSearchKeyword()
                goto L_0x00cf
            L_0x00ce:
                r4 = r3
            L_0x00cf:
                r0.a(r2, r4)
                java.lang.String r2 = "ad_search_list"
                if (r1 == 0) goto L_0x00da
                java.util.List r3 = r1.getAdSearchList()
            L_0x00da:
                r0.a(r2, r3)
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r1 = r10.f43221b
                android.arch.lifecycle.MutableLiveData<com.ss.android.ugc.aweme.arch.b<java.lang.String, java.lang.Object>> r1 = r1.f43215f
                r1.setValue(r0)
            L_0x00e4:
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r0 = r10.f43221b
                android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.f43211b
                boolean r1 = r7.getHasMore()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.setValue(r1)
                com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel r0 = r10.f43221b
                int r1 = r7.getCursor()
                r0.g = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel.d.onNext(java.lang.Object):void");
        }

        d(DiscoverViewModel discoverViewModel, long j) {
            this.f43221b = discoverViewModel;
            this.f43222c = j;
        }
    }

    private final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43210a, false, 38154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43210a, false, 38154, new Class[0], Void.TYPE);
            return;
        }
        this.i.a(new com.ss.android.ugc.aweme.discover.d.b.b(this.g), false).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new b<Object>(this));
    }

    private final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43210a, false, 38153, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43210a, false, 38153, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g = -1;
        this.i.a(new com.ss.android.ugc.aweme.discover.d.b.b(this.g), z).map(new c(this)).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new d<Object>(this, System.currentTimeMillis()));
    }

    public final void a(Integer num) {
        Integer num2 = num;
        if (PatchProxy.isSupport(new Object[]{num2}, this, f43210a, false, 38155, new Class[]{Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num2}, this, f43210a, false, 38155, new Class[]{Integer.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.discover.helper.b.a()) {
            new com.ss.android.ugc.aweme.discover.mob.a.a().a("discovery").a(num2).e();
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43210a, false, 38151, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43210a, false, 38151, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(z, false);
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f43210a, false, 38152, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f43210a, false, 38152, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            b(z2);
        } else {
            a();
        }
    }
}
