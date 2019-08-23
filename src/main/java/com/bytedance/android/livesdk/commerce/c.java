package com.bytedance.android.livesdk.commerce;

import android.content.Context;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.setting.l;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/android/livesdk/commerce/LiveCommerceService;", "", "()V", "Companion", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13613a;

    /* renamed from: b  reason: collision with root package name */
    public static l<String> f13614b = new l<>("live_shop_edit_url", "https://hotsoon.snssdk.com/falcon/live_inapp/page/live_manage_goods/index.html");

    /* renamed from: c  reason: collision with root package name */
    public static final a f13615c = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u0011J,\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/android/livesdk/commerce/LiveCommerceService$Companion;", "", "()V", "liveShopEditUrl", "Lcom/bytedance/android/live/core/setting/SettingKey;", "", "checkLastEnableStatus", "Lio/reactivex/Observable;", "", "userId", "", "checkLiveCommerceGoodsNum", "createLiveGoodsEditDialog", "Lcom/bytedance/android/live/core/widget/BaseDialogFragment;", "context", "Landroid/content/Context;", "roomId", "(Landroid/content/Context;Ljava/lang/Long;)Lcom/bytedance/android/live/core/widget/BaseDialogFragment;", "fetchLiveCommerce", "Lcom/bytedance/android/live/core/network/response/ListResponse;", "Lcom/bytedance/android/livesdk/commerce/LiveGoods;", "offset", "count", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13616a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "liveGoodsListResponse", "Lcom/bytedance/android/live/core/network/response/Response;", "Lcom/bytedance/android/livesdk/commerce/LiveGoodsUserStatus;", "apply"}, k = 3, mv = {1, 1, 13})
        /* renamed from: com.bytedance.android.livesdk.commerce.c$a$a  reason: collision with other inner class name */
        static final class C0095a<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13617a;

            /* renamed from: b  reason: collision with root package name */
            public static final C0095a f13618b = new C0095a();

            C0095a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                d dVar = (d) obj;
                boolean z = false;
                if (PatchProxy.isSupport(new Object[]{dVar}, this, f13617a, false, 8036, new Class[]{d.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{dVar}, this, f13617a, false, 8036, new Class[]{d.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Intrinsics.checkParameterIsNotNull(dVar, "liveGoodsListResponse");
                    f fVar = (f) dVar.f7871b;
                    if (fVar != null) {
                        z = fVar.f13630b;
                    }
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "liveGoodsListResponse", "Lcom/bytedance/android/live/core/network/response/Response;", "Lcom/bytedance/android/livesdk/commerce/LiveGoodsUserStatus;", "apply"}, k = 3, mv = {1, 1, 13})
        static final class b<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13619a;

            /* renamed from: b  reason: collision with root package name */
            public static final b f13620b = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                int i;
                d dVar = (d) obj;
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{dVar}, this, f13619a, false, 8037, new Class[]{d.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{dVar}, this, f13619a, false, 8037, new Class[]{d.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Intrinsics.checkParameterIsNotNull(dVar, "liveGoodsListResponse");
                    f fVar = (f) dVar.f7871b;
                    if (fVar != null) {
                        i = fVar.f13629a;
                    } else {
                        i = 0;
                    }
                    if (i <= 0) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Observable<Boolean> a(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f13616a, false, 8032, new Class[]{Long.TYPE}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f13616a, false, 8032, new Class[]{Long.TYPE}, Observable.class);
            }
            Observable<Boolean> observeOn = ((LiveCommerceApi) j.q().d().a(LiveCommerceApi.class)).fetchLiveGoodsUserStatus("https://hotsoon.snssdk.com/hotsoon/commerce/live/user/info/", j2).map(C0095a.f13618b).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkExpressionValueIsNotNull(observeOn, "LiveInternalService.inst…dSchedulers.mainThread())");
            return observeOn;
        }

        @JvmStatic
        @NotNull
        public final Observable<Boolean> b(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f13616a, false, 8033, new Class[]{Long.TYPE}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f13616a, false, 8033, new Class[]{Long.TYPE}, Observable.class);
            }
            Observable<Boolean> observeOn = ((LiveCommerceApi) j.q().d().a(LiveCommerceApi.class)).fetchLiveGoodsUserStatus("https://hotsoon.snssdk.com/hotsoon/commerce/live/user/info/", j2).map(b.f13620b).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkExpressionValueIsNotNull(observeOn, "LiveInternalService.inst…dSchedulers.mainThread())");
            return observeOn;
        }

        @JvmStatic
        @NotNull
        public final BaseDialogFragment a(@NotNull Context context, @Nullable Long l) {
            Context context2 = context;
            Long l2 = l;
            if (PatchProxy.isSupport(new Object[]{context2, l2}, this, f13616a, false, 8035, new Class[]{Context.class, Long.class}, BaseDialogFragment.class)) {
                return (BaseDialogFragment) PatchProxy.accessDispatch(new Object[]{context2, l2}, this, f13616a, false, 8035, new Class[]{Context.class, Long.class}, BaseDialogFragment.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            String str = (String) c.f13614b.a();
            BaseDialogFragment baseDialogFragment = null;
            if (l2 != null) {
                l2.longValue();
                Intrinsics.checkExpressionValueIsNotNull(str, PushConstants.WEB_URL);
                if (!StringsKt.contains$default((CharSequence) str, '?', false, 2, (Object) null)) {
                    str = str + '?';
                }
                str = str + "&room_id=" + l2;
            }
            com.bytedance.android.livesdk.browser.c.b f2 = j.q().f();
            if (f2 != null) {
                baseDialogFragment = f2.a(context2, str, "");
            }
            if (baseDialogFragment == null) {
                Intrinsics.throwNpe();
            }
            return baseDialogFragment;
        }
    }

    @JvmStatic
    @NotNull
    public static final BaseDialogFragment a(@NotNull Context context, @Nullable Long l) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2, null}, null, f13613a, true, 8031, new Class[]{Context.class, Long.class}, BaseDialogFragment.class)) {
            return f13615c.a(context2, null);
        }
        return (BaseDialogFragment) PatchProxy.accessDispatch(new Object[]{context2, null}, null, f13613a, true, 8031, new Class[]{Context.class, Long.class}, BaseDialogFragment.class);
    }

    @JvmStatic
    @NotNull
    public static final Observable<Boolean> a(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f13613a, true, 8028, new Class[]{Long.TYPE}, Observable.class)) {
            return f13615c.a(j2);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f13613a, true, 8028, new Class[]{Long.TYPE}, Observable.class);
    }

    @JvmStatic
    @NotNull
    public static final Observable<Boolean> b(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f13613a, true, 8029, new Class[]{Long.TYPE}, Observable.class)) {
            return f13615c.b(j2);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f13613a, true, 8029, new Class[]{Long.TYPE}, Observable.class);
    }
}
