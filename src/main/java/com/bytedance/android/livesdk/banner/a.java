package com.bytedance.android.livesdk.banner;

import android.arch.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.model.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0011R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/android/livesdk/banner/InRoomBannerManager;", "", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "bannerSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/bytedance/android/livesdk/banner/InRoomBannerManager$Data;", "kotlin.jvm.PlatformType", "currentRoomId", "", "fetch", "Lio/reactivex/Observable;", "roomId", "isAnchor", "", "observe", "(Ljava/lang/Long;)Lio/reactivex/Observable;", "Companion", "Data", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9098a;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public static final C0071a f9099e = new C0071a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public long f9100b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final BehaviorSubject<b> f9101c;

    /* renamed from: d  reason: collision with root package name */
    public final LifecycleOwner f9102d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/android/livesdk/banner/InRoomBannerManager$Companion;", "", "()V", "TAG", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.android.livesdk.banner.a$a  reason: collision with other inner class name */
    static final class C0071a {
        private C0071a() {
        }

        public /* synthetic */ C0071a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/bytedance/android/livesdk/banner/InRoomBannerManager$Data;", "", "roomId", "", "data", "Lcom/bytedance/android/livesdk/chatroom/model/BannerInRoomCollection;", "(JLcom/bytedance/android/livesdk/chatroom/model/BannerInRoomCollection;)V", "getData", "()Lcom/bytedance/android/livesdk/chatroom/model/BannerInRoomCollection;", "getRoomId", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9103a;

        /* renamed from: b  reason: collision with root package name */
        public final long f9104b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final f f9105c;

        public final boolean equals(@Nullable Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f9103a, false, 3191, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f9103a, false, 3191, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (!(this.f9104b == bVar.f9104b) || !Intrinsics.areEqual((Object) this.f9105c, (Object) bVar.f9105c)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f9103a, false, 3190, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f9103a, false, 3190, new Class[0], Integer.TYPE)).intValue();
            }
            int hashCode = Long.hashCode(this.f9104b) * 31;
            f fVar = this.f9105c;
            if (fVar != null) {
                i = fVar.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f9103a, false, 3189, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f9103a, false, 3189, new Class[0], String.class);
            }
            return "Data(roomId=" + this.f9104b + ", data=" + this.f9105c + ")";
        }

        public b(long j, @NotNull f fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "data");
            this.f9104b = j;
            this.f9105c = fVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "response", "Lcom/bytedance/android/live/core/network/response/Response;", "Lcom/bytedance/android/livesdk/chatroom/model/BannerInRoomCollection;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    public static final class c<T> implements Consumer<com.bytedance.android.live.core.network.response.d<f>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9106a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f9107b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f9108c;

        public c(a aVar, long j) {
            this.f9107b = aVar;
            this.f9108c = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.network.response.d dVar = (com.bytedance.android.live.core.network.response.d) obj;
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f9106a, false, 3192, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar}, this, f9106a, false, 3192, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE);
                return;
            }
            BehaviorSubject<b> behaviorSubject = this.f9107b.f9101c;
            long j = this.f9108c;
            Object obj2 = dVar.f7871b;
            Intrinsics.checkExpressionValueIsNotNull(obj2, "response.data");
            behaviorSubject.onNext(new b(j, (f) obj2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 13})
    public static final class d<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9109a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f9110b = new d();

        d() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f9109a, false, 3193, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f9109a, false, 3193, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.live.core.c.a.a("InRoomBannerManager", th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "data", "Lcom/bytedance/android/livesdk/banner/InRoomBannerManager$Data;", "test"}, k = 3, mv = {1, 1, 13})
    static final class e<T> implements Predicate<b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9111a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Long f9112b;

        e(Long l) {
            this.f9112b = l;
        }

        public final /* synthetic */ boolean test(Object obj) {
            b bVar = (b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f9111a, false, 3194, new Class[]{b.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, f9111a, false, 3194, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(bVar, "data");
            long j = bVar.f9104b;
            Long l = this.f9112b;
            if (l != null && j == l.longValue()) {
                return true;
            }
            return false;
        }
    }

    public a(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        this.f9102d = lifecycleOwner;
        BehaviorSubject<b> create = BehaviorSubject.create();
        Intrinsics.checkExpressionValueIsNotNull(create, "BehaviorSubject.create<Data>()");
        this.f9101c = create;
    }

    @NotNull
    public final Observable<b> a(@Nullable Long l) {
        Long l2 = l;
        if (PatchProxy.isSupport(new Object[]{l2}, this, f9098a, false, 3187, new Class[]{Long.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{l2}, this, f9098a, false, 3187, new Class[]{Long.class}, Observable.class);
        }
        Observable<b> filter = this.f9101c.filter(new e(l2));
        Intrinsics.checkExpressionValueIsNotNull(filter, "bannerSubject.filter { d…> data.roomId == roomId }");
        return filter;
    }
}
