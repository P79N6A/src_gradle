package com.bytedance.android.livesdk;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.chatroom.api.CoverApi;
import com.bytedance.android.livesdk.chatroom.api.DutyGiftAPi;
import com.bytedance.android.livesdk.chatroom.api.FansClubApi;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.api.LinkPKApi;
import com.bytedance.android.livesdk.chatroom.api.LuckyBoxApi;
import com.bytedance.android.livesdk.chatroom.api.PkPromotionApi;
import com.bytedance.android.livesdk.chatroom.api.StatusApi;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.retrofit2.Retrofit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18599a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<Class, Object> f18600b;

    /* renamed from: c  reason: collision with root package name */
    private final Retrofit f18601c;

    public static final class a implements h.b<y> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18602a;

        @NonNull
        public final h.b.a<y> a(h.b.a<y> aVar) {
            h.b.a<y> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f18602a, false, 2663, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new y((byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f18602a, false, 2663, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    private y() {
        this.f18600b = new ConcurrentHashMap<>();
        this.f18601c = j.q().b();
    }

    public final LinkApi a() {
        if (!PatchProxy.isSupport(new Object[0], this, f18599a, false, 2649, new Class[0], LinkApi.class)) {
            return (LinkApi) a(LinkApi.class);
        }
        return (LinkApi) PatchProxy.accessDispatch(new Object[0], this, f18599a, false, 2649, new Class[0], LinkApi.class);
    }

    public final LinkPKApi b() {
        if (!PatchProxy.isSupport(new Object[0], this, f18599a, false, 2650, new Class[0], LinkPKApi.class)) {
            return (LinkPKApi) a(LinkPKApi.class);
        }
        return (LinkPKApi) PatchProxy.accessDispatch(new Object[0], this, f18599a, false, 2650, new Class[0], LinkPKApi.class);
    }

    public final LuckyBoxApi c() {
        if (!PatchProxy.isSupport(new Object[0], this, f18599a, false, 2652, new Class[0], LuckyBoxApi.class)) {
            return (LuckyBoxApi) a(LuckyBoxApi.class);
        }
        return (LuckyBoxApi) PatchProxy.accessDispatch(new Object[0], this, f18599a, false, 2652, new Class[0], LuckyBoxApi.class);
    }

    public final PkPromotionApi d() {
        if (!PatchProxy.isSupport(new Object[0], this, f18599a, false, 2653, new Class[0], PkPromotionApi.class)) {
            return (PkPromotionApi) a(PkPromotionApi.class);
        }
        return (PkPromotionApi) PatchProxy.accessDispatch(new Object[0], this, f18599a, false, 2653, new Class[0], PkPromotionApi.class);
    }

    public final FansClubApi e() {
        if (!PatchProxy.isSupport(new Object[0], this, f18599a, false, 2654, new Class[0], FansClubApi.class)) {
            return (FansClubApi) a(FansClubApi.class);
        }
        return (FansClubApi) PatchProxy.accessDispatch(new Object[0], this, f18599a, false, 2654, new Class[0], FansClubApi.class);
    }

    public final StatusApi f() {
        if (!PatchProxy.isSupport(new Object[0], this, f18599a, false, 2657, new Class[0], StatusApi.class)) {
            return (StatusApi) a(StatusApi.class);
        }
        return (StatusApi) PatchProxy.accessDispatch(new Object[0], this, f18599a, false, 2657, new Class[0], StatusApi.class);
    }

    public final CoverApi g() {
        if (!PatchProxy.isSupport(new Object[0], this, f18599a, false, 2658, new Class[0], CoverApi.class)) {
            return (CoverApi) a(CoverApi.class);
        }
        return (CoverApi) PatchProxy.accessDispatch(new Object[0], this, f18599a, false, 2658, new Class[0], CoverApi.class);
    }

    public final DutyGiftAPi h() {
        if (!PatchProxy.isSupport(new Object[0], this, f18599a, false, 2661, new Class[0], DutyGiftAPi.class)) {
            return (DutyGiftAPi) a(DutyGiftAPi.class);
        }
        return (DutyGiftAPi) PatchProxy.accessDispatch(new Object[0], this, f18599a, false, 2661, new Class[0], DutyGiftAPi.class);
    }

    /* synthetic */ y(byte b2) {
        this();
    }

    public final <T> T a(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f18599a, false, 2662, new Class[]{Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls}, this, f18599a, false, 2662, new Class[]{Class.class}, Object.class);
        }
        if (!this.f18600b.contains(cls)) {
            this.f18600b.putIfAbsent(cls, this.f18601c.create(cls));
        }
        return this.f18600b.get(cls);
    }
}
