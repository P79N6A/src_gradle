package com.bytedance.android.livesdk.commerce;

import android.arch.lifecycle.MutableLiveData;
import android.util.Pair;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.live.core.setting.l;
import com.bytedance.android.live.core.widget.simple.SimpleListViewModel;
import com.bytedance.android.livesdk.commerce.c;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J?\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bytedance/android/livesdk/commerce/LiveGoodsViewModel;", "Lcom/bytedance/android/live/core/widget/simple/SimpleListViewModel;", "", "()V", "LIVE_COMMERCE_BANNER_LAST_CLOSE_ID", "Lcom/bytedance/android/livesdkapi/depend/prefs/Property;", "", "offset", "", "totalNum", "Landroid/arch/lifecycle/MutableLiveData;", "getTotalNum", "()Landroid/arch/lifecycle/MutableLiveData;", "userId", "createObservable", "Lio/reactivex/Observable;", "Landroid/util/Pair;", "", "Lcom/bytedance/android/live/base/model/Extra;", "initial", "", "key", "pageSize", "(ZLjava/lang/Long;I)Lio/reactivex/Observable;", "getPageSize", "getPrefetchDistance", "removeBanner", "", "data", "Lcom/bytedance/android/livesdk/commerce/LiveGoodsBanner;", "setUserId", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class LiveGoodsViewModel extends SimpleListViewModel<Object> {
    public static ChangeQuickRedirect n;
    public int o;
    long p;
    @NotNull
    public final MutableLiveData<Integer> q = new MutableLiveData<>();
    public com.bytedance.android.livesdkapi.depend.g.a<Long> r = new com.bytedance.android.livesdkapi.depend.g.a<>("live_commerce_banner_last_close_id", -1L);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "response", "Lcom/bytedance/android/live/core/network/response/ListResponse;", "Lcom/bytedance/android/livesdk/commerce/LiveGoods;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    static final class a<T> implements Consumer<c<d>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13598a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveGoodsViewModel f13599b;

        a(LiveGoodsViewModel liveGoodsViewModel) {
            this.f13599b = liveGoodsViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            c cVar = (c) obj;
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f13598a, false, 8063, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f13598a, false, 8063, new Class[]{c.class}, Void.TYPE);
                return;
            }
            this.f13599b.o += cVar.f7867b.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005 \u0004*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Landroid/util/Pair;", "", "", "kotlin.jvm.PlatformType", "Lcom/bytedance/android/live/base/model/Extra;", "response", "Lcom/bytedance/android/live/core/network/response/ListResponse;", "Lcom/bytedance/android/livesdk/commerce/LiveGoods;", "apply"}, k = 3, mv = {1, 1, 13})
    static final class b<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13600a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveGoodsViewModel f13601b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f13602c;

        b(LiveGoodsViewModel liveGoodsViewModel, boolean z) {
            this.f13601b = liveGoodsViewModel;
            this.f13602c = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            c cVar = (c) obj;
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f13600a, false, 8064, new Class[]{c.class}, Pair.class)) {
                return (Pair) PatchProxy.accessDispatch(new Object[]{cVar}, this, f13600a, false, 8064, new Class[]{c.class}, Pair.class);
            }
            Intrinsics.checkParameterIsNotNull(cVar, "response");
            ArrayList arrayList = new ArrayList();
            if (!Lists.isEmpty(cVar.f7867b)) {
                if (this.f13602c) {
                    l<e> lVar = com.bytedance.android.livesdk.config.a.f13642a;
                    Intrinsics.checkExpressionValueIsNotNull(lVar, "LiveOtherSettingKeys.LIVE_COMMERCE_BANNER");
                    e eVar = (e) lVar.a();
                    if (eVar != null) {
                        long j = eVar.f13627a;
                        Object a2 = this.f13601b.r.a();
                        Intrinsics.checkExpressionValueIsNotNull(a2, "LIVE_COMMERCE_BANNER_LAST_CLOSE_ID.value");
                        if (j > ((Number) a2).longValue()) {
                            arrayList.add(eVar);
                        }
                    }
                }
                arrayList.addAll(cVar.f7867b);
            }
            cVar.f7868c.maxTime = cVar.f7868c.now;
            this.f13601b.q.postValue(Integer.valueOf(cVar.f7868c.total));
            return Pair.create(arrayList, cVar.f7868c);
        }
    }

    @NotNull
    public final Observable<Pair<List<Object>, Extra>> a(boolean z, @Nullable Long l, int i) {
        Observable observable;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), l, Integer.valueOf(i)}, this, n, false, 8061, new Class[]{Boolean.TYPE, Long.class, Integer.TYPE}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), l, Integer.valueOf(i)}, this, n, false, 8061, new Class[]{Boolean.TYPE, Long.class, Integer.TYPE}, Observable.class);
        }
        if (z2) {
            this.o = 0;
        }
        c.a aVar = c.f13615c;
        long j = this.p;
        long j2 = (long) this.o;
        if (PatchProxy.isSupport(new Object[]{new Long(j), new Long(j2), new Long(10)}, aVar, c.a.f13616a, false, 8034, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE}, Observable.class)) {
            Object[] objArr = {new Long(j), new Long(j2), new Long(10)};
            ChangeQuickRedirect changeQuickRedirect = c.a.f13616a;
            c.a aVar2 = aVar;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            observable = (Observable) PatchProxy.accessDispatch(objArr, aVar2, changeQuickRedirect2, false, 8034, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE}, Observable.class);
        } else {
            observable = ((LiveCommerceApi) j.q().d().a(LiveCommerceApi.class)).fetchLiveCommerce("https://hotsoon.snssdk.com/hotsoon/commerce/live/promotions/", j, j2, 10, "live");
        }
        Observable<Pair<List<Object>, Extra>> map = observable.doOnNext(new a(this)).map(new b(this, z2));
        Intrinsics.checkExpressionValueIsNotNull(map, "LiveCommerceService.fetc….extra)\n                }");
        return map;
    }
}
