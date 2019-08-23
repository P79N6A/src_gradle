package com.ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.discover.model.HotSearchEntity;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u0019\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R#\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/viewmodel/HotSearchViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "hotSearchWordLiveData", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "Lcom/ss/android/ugc/aweme/discover/api/common/ResultModel;", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "getHotSearchWordLiveData", "()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "hotSearchWordsBundle", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ss/android/ugc/aweme/arch/BundleData;", "", "", "getHotSearchWordsBundle", "()Landroid/arch/lifecycle/MutableLiveData;", "mGson", "Lcom/google/gson/Gson;", "mHotSearchCache", "Lcom/ss/android/ugc/aweme/discover/presenter/IHotSearchWordsCache;", "getHotSearchFromCache", "refreshHotSearchBillboardCache", "", "refreshHotSearchWords", "saveHotSearchWords", "list", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSearchViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43232a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f43233d = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<List<HotSearchItem>>> f43234b = new com.ss.android.ugc.aweme.arch.widgets.base.b<>();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final MutableLiveData<com.ss.android.ugc.aweme.arch.b<String, Object>> f43235c = new MutableLiveData<>();

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.presenter.b f43236e;

    /* renamed from: f  reason: collision with root package name */
    private final Gson f43237f = new Gson();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/viewmodel/HotSearchViewModel$Companion;", "", "()V", "MAX_HOT_SEARCH_WORDS_SIZE", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/discover/viewmodel/HotSearchViewModel$getHotSearchFromCache$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends TypeToken<List<? extends HotSearchItem>> {
        b() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "kotlin.jvm.PlatformType", "", "it", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "apply"}, k = 3, mv = {1, 1, 15})
    public static final class c<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43238a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f43239b = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            HotSearchListResponse hotSearchListResponse = (HotSearchListResponse) obj;
            if (PatchProxy.isSupport(new Object[]{hotSearchListResponse}, this, f43238a, false, 38174, new Class[]{HotSearchListResponse.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{hotSearchListResponse}, this, f43238a, false, 38174, new Class[]{HotSearchListResponse.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSearchListResponse, AdvanceSetting.NETWORK_TYPE);
            HotSearchEntity data = hotSearchListResponse.getData();
            Intrinsics.checkExpressionValueIsNotNull(data, "it.data");
            return data.getList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/discover/viewmodel/HotSearchViewModel$refreshHotSearchBillboardCache$2", "Lio/reactivex/SingleObserver;", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "onError", "", "e", "", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "onSuccess", "t", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements SingleObserver<List<? extends HotSearchItem>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43240a;

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f43240a, false, 38177, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f43240a, false, 38177, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "d");
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f43240a, false, 38176, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f43240a, false, 38176, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
            com.ss.android.ugc.aweme.hotsearch.d.a.a((List<HotSearchItem>) null);
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f43240a, false, 38175, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f43240a, false, 38175, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list, "t");
            com.ss.android.ugc.aweme.hotsearch.d.a.a(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "it", "apply"}, k = 3, mv = {1, 1, 15})
    public static final class e<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43241a;

        /* renamed from: b  reason: collision with root package name */
        public static final e f43242b = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            HotSearchListResponse hotSearchListResponse = (HotSearchListResponse) obj;
            if (PatchProxy.isSupport(new Object[]{hotSearchListResponse}, this, f43241a, false, 38178, new Class[]{HotSearchListResponse.class}, HotSearchListResponse.class)) {
                return (HotSearchListResponse) PatchProxy.accessDispatch(new Object[]{hotSearchListResponse}, this, f43241a, false, 38178, new Class[]{HotSearchListResponse.class}, HotSearchListResponse.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSearchListResponse, AdvanceSetting.NETWORK_TYPE);
            HotSearchEntity data = hotSearchListResponse.getData();
            Intrinsics.checkExpressionValueIsNotNull(data, "it.data");
            for (HotSearchItem logPb : data.getList()) {
                logPb.setLogPb(hotSearchListResponse.getLogPb());
            }
            return hotSearchListResponse;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "kotlin.jvm.PlatformType", "", "it", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "apply"}, k = 3, mv = {1, 1, 15})
    public static final class f<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43243a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HotSearchViewModel f43244b;

        public f(HotSearchViewModel hotSearchViewModel) {
            this.f43244b = hotSearchViewModel;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List<HotSearchItem> list;
            HotSearchListResponse hotSearchListResponse = (HotSearchListResponse) obj;
            if (PatchProxy.isSupport(new Object[]{hotSearchListResponse}, this, f43243a, false, 38179, new Class[]{HotSearchListResponse.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{hotSearchListResponse}, this, f43243a, false, 38179, new Class[]{HotSearchListResponse.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSearchListResponse, AdvanceSetting.NETWORK_TYPE);
            com.ss.android.ugc.aweme.arch.b bVar = new com.ss.android.ugc.aweme.arch.b();
            HotSearchEntity data = hotSearchListResponse.getData();
            if (data != null) {
                list = data.getList();
            } else {
                list = null;
            }
            bVar.a("key_hot_search_list", list);
            bVar.a("key_operated_search_list", hotSearchListResponse.getDefaultSearchKeyword());
            bVar.a("key_operated_real_search_word", hotSearchListResponse.getRealDefaultSearchKeyword());
            bVar.a("ad_search_list", hotSearchListResponse.getAdSearchList());
            this.f43244b.f43235c.setValue(bVar);
            HotSearchEntity data2 = hotSearchListResponse.getData();
            Intrinsics.checkExpressionValueIsNotNull(data2, "it.data");
            return data2.getList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/discover/viewmodel/HotSearchViewModel$refreshHotSearchWords$3", "Lio/reactivex/SingleObserver;", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "onError", "", "e", "", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "onSuccess", "t", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements SingleObserver<List<? extends HotSearchItem>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HotSearchViewModel f43246b;

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f43245a, false, 38182, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f43245a, false, 38182, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "d");
        }

        public g(HotSearchViewModel hotSearchViewModel) {
            this.f43246b = hotSearchViewModel;
        }

        public final void onError(@NotNull Throwable th) {
            boolean z;
            com.ss.android.ugc.aweme.discover.api.a.a aVar;
            if (PatchProxy.isSupport(new Object[]{th}, this, f43245a, false, 38181, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f43245a, false, 38181, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th, "e");
            List<HotSearchItem> a2 = this.f43246b.a();
            com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<List<HotSearchItem>>> bVar = this.f43246b.f43234b;
            Collection collection = a2;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar = new com.ss.android.ugc.aweme.discover.api.a.a(false, CollectionsKt.emptyList());
            } else {
                aVar = new com.ss.android.ugc.aweme.discover.api.a.a(true, a2);
            }
            bVar.setValue(aVar);
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            boolean z;
            com.ss.android.ugc.aweme.discover.api.a.a aVar;
            List<HotSearchItem> list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f43245a, false, 38180, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f43245a, false, 38180, new Class[]{List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list, "t");
            if (list.isEmpty()) {
                list = this.f43246b.a();
            } else {
                this.f43246b.a(list);
            }
            com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<List<HotSearchItem>>> bVar = this.f43246b.f43234b;
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar = new com.ss.android.ugc.aweme.discover.api.a.a(false, CollectionsKt.emptyList());
            } else {
                aVar = new com.ss.android.ugc.aweme.discover.api.a.a(true, list);
            }
            bVar.setValue(aVar);
        }
    }

    public HotSearchViewModel() {
        try {
            this.f43236e = (com.ss.android.ugc.aweme.discover.presenter.b) com.ss.android.ugc.aweme.base.sharedpref.c.a(k.a(), com.ss.android.ugc.aweme.discover.presenter.b.class);
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.util.c.a("HotSearchViewModel getSP failed " + th.getMessage());
        }
    }

    @Nullable
    public final List<HotSearchItem> a() {
        String str;
        List<HotSearchItem> list;
        if (PatchProxy.isSupport(new Object[0], this, f43232a, false, 38173, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f43232a, false, 38173, new Class[0], List.class);
        }
        com.ss.android.ugc.aweme.discover.presenter.b bVar = this.f43236e;
        if (bVar != null) {
            str = bVar.a();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            list = (List) this.f43237f.fromJson(str, new b().getType());
        } catch (JsonSyntaxException unused) {
            list = null;
        }
        return list;
    }

    public final void a(List<HotSearchItem> list) {
        List<HotSearchItem> list2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f43232a, false, 38172, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f43232a, false, 38172, new Class[]{List.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.discover.presenter.b bVar = this.f43236e;
        if (bVar != null) {
            Gson gson = this.f43237f;
            if (!list.isEmpty()) {
                if (list.size() > 30) {
                    list2 = list.subList(0, 30);
                } else {
                    list2 = list;
                }
                bVar.a(gson.toJson((Object) list2));
            }
        }
    }
}
