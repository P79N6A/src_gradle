package com.ss.android.ugc.aweme.poi.c;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J:\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/mob/PoiMobUtils;", "", "()V", "mobCancelCollectPoiEvent", "", "params", "Lcom/ss/android/ugc/aweme/poi/mob/PoiMobEventParams;", "mobClickCouponEvent", "mobClickCtripReserveEvent", "mobCloseHalfCardEvent", "mobCollectPoiEvent", "mobReserveAndQueue", "enterMethod", "", "contentType", "enterFrom", "poiPosition", "poiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "mobShowCouponEvent", "mobShowCtripReserveEvent", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59767a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f59768b = new b();

    private b() {
    }

    @JvmStatic
    public static final void a(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f59767a, true, 64984, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f59767a, true, 64984, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "params");
        d a2 = d.a();
        if (!TextUtils.isEmpty(aVar2.f59756b)) {
            a2.a("poi_id", aVar2.f59756b);
        }
        if (!TextUtils.isEmpty(aVar2.f59755a)) {
            a2.a("enter_from", aVar2.f59755a);
        }
        if (!TextUtils.isEmpty(aVar2.f59757c)) {
            a2.a("poi_type", aVar2.f59757c);
        }
        if (!TextUtils.isEmpty(aVar2.f59758d)) {
            a2.a("group_id", aVar2.f59758d);
        }
        if (!TextUtils.isEmpty(aVar2.f59759e)) {
            a2.a("previous_page", aVar2.f59759e);
        }
        if (!TextUtils.isEmpty(aVar2.f59760f)) {
            a2.a("enter_method", aVar2.f59760f);
        }
        h.a(aVar2, "favourite_poi", a2);
    }

    @JvmStatic
    public static final void b(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f59767a, true, 64985, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f59767a, true, 64985, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "params");
        d a2 = d.a();
        if (!TextUtils.isEmpty(aVar2.f59756b)) {
            a2.a("poi_id", aVar2.f59756b);
        }
        if (!TextUtils.isEmpty(aVar2.f59755a)) {
            a2.a("enter_from", aVar2.f59755a);
        }
        if (!TextUtils.isEmpty(aVar2.f59757c)) {
            a2.a("poi_type", aVar2.f59757c);
        }
        if (!TextUtils.isEmpty(aVar2.f59758d)) {
            a2.a("group_id", aVar2.f59758d);
        }
        if (!TextUtils.isEmpty(aVar2.f59759e)) {
            a2.a("previous_page", aVar2.f59759e);
        }
        if (!TextUtils.isEmpty(aVar2.f59760f)) {
            a2.a("enter_method", aVar2.f59760f);
        }
        h.a(aVar2, "cancel_favourite_poi", a2);
    }

    @JvmStatic
    public static final void c(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f59767a, true, 64986, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f59767a, true, 64986, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "params");
        d a2 = d.a();
        if (!TextUtils.isEmpty(aVar2.f59756b)) {
            a2.a("poi_id", aVar2.f59756b);
        }
        if (!TextUtils.isEmpty(aVar2.f59755a)) {
            a2.a("enter_from", aVar2.f59755a);
        }
        if (!TextUtils.isEmpty(aVar2.f59760f)) {
            a2.a("enter_method", aVar2.f59760f);
        }
        if (!TextUtils.isEmpty(aVar2.j)) {
            a2.a("content_type", aVar2.j);
        }
        h.a(aVar2, "show_ctrip_reserve_button", a2);
    }

    @JvmStatic
    public static final void d(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f59767a, true, 64988, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f59767a, true, 64988, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "params");
        d a2 = d.a();
        if (!TextUtils.isEmpty(aVar2.f59756b)) {
            a2.a("poi_id", aVar2.f59756b);
        }
        if (!TextUtils.isEmpty(aVar2.f59755a)) {
            a2.a("enter_from", aVar2.f59755a);
        }
        if (!TextUtils.isEmpty(aVar2.g)) {
            a2.a("coupon_id", aVar2.g);
        }
        if (!TextUtils.isEmpty(aVar2.h)) {
            a2.a("coupon_type", aVar2.h);
        }
        if (!TextUtils.isEmpty(aVar2.f59760f)) {
            a2.a("enter_method", aVar2.f59760f);
        }
        if (!TextUtils.isEmpty(aVar2.l)) {
            a2.a("source_type", aVar2.l);
        }
        if (!TextUtils.isEmpty(aVar2.f59759e)) {
            a2.a("previous_page", aVar2.f59759e);
        }
        h.a(aVar2, "show_coupon", a2);
    }

    @JvmStatic
    public static final void e(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f59767a, true, 64989, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f59767a, true, 64989, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "params");
        d a2 = d.a();
        if (!TextUtils.isEmpty(aVar2.f59756b)) {
            a2.a("poi_id", aVar2.f59756b);
        }
        if (!TextUtils.isEmpty(aVar2.f59755a)) {
            a2.a("enter_from", aVar2.f59755a);
        }
        if (!TextUtils.isEmpty(aVar2.g)) {
            a2.a("coupon_id", aVar2.g);
        }
        if (!TextUtils.isEmpty(aVar2.h)) {
            a2.a("coupon_type", aVar2.h);
        }
        if (!TextUtils.isEmpty(aVar2.f59760f)) {
            a2.a("enter_method", aVar2.f59760f);
        }
        if (!TextUtils.isEmpty(aVar2.l)) {
            a2.a("source_type", aVar2.l);
        }
        if (!TextUtils.isEmpty(aVar2.f59759e)) {
            a2.a("previous_page", aVar2.f59759e);
        }
        h.a(aVar2, "click_coupon", a2);
    }

    @JvmStatic
    public static final void a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable c cVar) {
        String str5;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{str6, str7, str8, str9, cVar2}, null, f59767a, true, 64991, new Class[]{String.class, String.class, String.class, String.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str6, str7, str8, str9, cVar2}, null, f59767a, true, 64991, new Class[]{String.class, String.class, String.class, String.class, c.class}, Void.TYPE);
            return;
        }
        d a2 = d.a().a("enter_from", str8);
        String str10 = null;
        if (cVar2 != null) {
            str5 = cVar.getPreviousPage();
        } else {
            str5 = null;
        }
        d a3 = a2.a("previous_page", str5).a("enter_method", str6);
        if (cVar2 != null) {
            str10 = cVar.getPoiId();
        }
        h.a(cVar2, "poi_puscene", a3.a("poi_id", str10).a("content_type", str7).a("poi_posititon", str9));
    }
}
