package com.ss.android.ugc.aweme.paginglibrary.kotlin.model;

import android.arch.core.util.Function;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.PagedList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H&J\b\u0010\u0016\u001a\u00020\u0017H&J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u001f\u0010\u001b\u001a\u00020\u00192\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d\"\u00020\u001e¢\u0006\u0002\u0010\u001fR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R5\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fRM\u0010\r\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0001 \n*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e0\u000e \n*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0001 \n*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e0\u000e\u0018\u00010\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR5\u0010\u0010\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00140\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/model/PagingModel;", "Key", "Value", "Landroid/arch/lifecycle/ViewModel;", "()V", "factory", "Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/bypage/DataSourceFactory;", "networkState", "Landroid/arch/lifecycle/LiveData;", "Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/model/NetworkState;", "kotlin.jvm.PlatformType", "getNetworkState", "()Landroid/arch/lifecycle/LiveData;", "posts", "Landroid/arch/paging/PagedList;", "getPosts", "refreshState", "getRefreshState", "result", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/model/Listing;", "getFactory", "getPageSize", "", "refresh", "", "retry", "startFetchData", "objects", "", "", "([Ljava/lang/Object;)V", "paginglibrary_release"}, k = 1, mv = {1, 1, 10})
public abstract class PagingModel<Key, Value> extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public final LiveData<PagedList<Value>> f58438a = Transformations.switchMap(this.f58441d, b.f58444a);

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<Object> f58439b = Transformations.switchMap(this.f58441d, a.f58443a);

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<Object> f58440c = Transformations.switchMap(this.f58441d, c.f58445a);

    /* renamed from: d  reason: collision with root package name */
    private final MutableLiveData<a<Value>> f58441d = new MutableLiveData<>();

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.paginglibrary.kotlin.a.a<Key, Value> f58442e = a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u0002H\u0004 \u0007*\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/LiveData;", "Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/model/NetworkState;", "Key", "Value", "it", "Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/model/Listing;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 1, 10})
    static final class a<I, O> implements Function<X, LiveData<Y>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f58443a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return ((a) obj).f58448c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00032\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u0002H\u0003 \u0007*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/LiveData;", "Landroid/arch/paging/PagedList;", "Value", "Key", "it", "Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/model/Listing;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 1, 10})
    static final class b<I, O> implements Function<X, LiveData<Y>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f58444a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return ((a) obj).f58447b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u0002H\u0004 \u0007*\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/LiveData;", "Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/model/NetworkState;", "Key", "Value", "it", "Lcom/ss/android/ugc/aweme/paginglibrary/kotlin/model/Listing;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 1, 10})
    static final class c<I, O> implements Function<X, LiveData<Y>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f58445a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return ((a) obj).f58449d;
        }
    }

    @NotNull
    public abstract com.ss.android.ugc.aweme.paginglibrary.kotlin.a.a<Key, Value> a();
}
