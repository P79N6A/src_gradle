package com.ss.android.ugc.aweme.commercialize;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commerce.service.models.m;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38874a;

    @SuppressLint({"TooManyMethodParam"})
    public static void a(@NonNull n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, null, f38874a, true, 30258, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, null, f38874a, true, 30258, new Class[]{n.class}, Void.TYPE);
            return;
        }
        ICommerceService a2 = a();
        if (a2 != null) {
            a2.showFullPreview(nVar2);
        }
    }

    public static boolean a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f38874a, true, 30262, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f38874a, true, 30262, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
        }
        ICommerceService a2 = a();
        if (a2 == null || !jSONObject2.has("taobaoUrl")) {
            return false;
        }
        try {
            a2.goBindTaobao(jSONObject2.optString("taobaoUrl"), a.b().a());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(h hVar, Activity activity, String str, Function1<? super Boolean, Unit> function1) {
        h hVar2 = hVar;
        Activity activity2 = activity;
        String str2 = str;
        Function1<? super Boolean, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{hVar2, activity2, str2, function12}, null, f38874a, true, 30265, new Class[]{h.class, Activity.class, String.class, Function1.class}, Void.TYPE)) {
            Object[] objArr = {hVar2, activity2, str2, function12};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f38874a, true, 30265, new Class[]{h.class, Activity.class, String.class, Function1.class}, Void.TYPE);
            return;
        }
        ICommerceService a2 = a();
        if (a2 != null) {
            a2.openApp(hVar2, activity2, str2, function12);
        } else {
            function12.invoke(Boolean.FALSE);
        }
    }

    @SuppressLint({"TooManyMethodParam"})
    public static void a(m mVar, String str, String str2, String str3) {
        m mVar2 = mVar;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{mVar2, str4, str5, str6}, null, f38874a, true, 30266, new Class[]{m.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {mVar2, str4, str5, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f38874a, true, 30266, new Class[]{m.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        ICommerceService a2 = a();
        if (a2 != null) {
            a2.gotoGoodShop(mVar2, str4, str5, str6);
        }
    }

    public static boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f38874a, true, 30269, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f38874a, true, 30269, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        ICommerceService a2 = a();
        if (a2 != null) {
            return a2.shouldNeedGuideFootprint(context2);
        }
        return false;
    }

    public static ICommerceService a() {
        if (PatchProxy.isSupport(new Object[0], null, f38874a, true, 30255, new Class[0], ICommerceService.class)) {
            return (ICommerceService) PatchProxy.accessDispatch(new Object[0], null, f38874a, true, 30255, new Class[0], ICommerceService.class);
        }
        return (ICommerceService) ServiceManager.get().getService(ICommerceService.class);
    }

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f38874a, true, 30261, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f38874a, true, 30261, new Class[0], Void.TYPE);
        } else if (PatchProxy.isSupport(new Object[0], null, f38874a, true, 30259, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f38874a, true, 30259, new Class[0], Void.TYPE);
        } else {
            ICommerceService a2 = a();
            if (a2 != null) {
                a2.fetchCommerceRights();
            }
        }
    }

    public static void a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, null, f38874a, true, 30270, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, null, f38874a, true, 30270, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        ICommerceService a2 = a();
        if (a2 != null) {
            a2.startAppByUrl(context2, str3, str4);
        }
    }

    public static void a(Context context, int i, String str, String str2, com.ss.android.ugc.aweme.commerce.service.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), str, str2, aVar}, null, f38874a, true, 30257, new Class[]{Context.class, Integer.TYPE, String.class, String.class, com.ss.android.ugc.aweme.commerce.service.a.a.class}, Void.TYPE)) {
            Object[] objArr = {context, Integer.valueOf(i), str, str2, aVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f38874a, true, 30257, new Class[]{Context.class, Integer.TYPE, String.class, String.class, com.ss.android.ugc.aweme.commerce.service.a.a.class}, Void.TYPE);
            return;
        }
        ICommerceService a2 = a();
        if (a2 != null) {
            a2.tryCheckRealName(context, i, str, str2, aVar);
        }
    }

    public static void a(@Nullable Context context, @Nullable String str, @Nullable String str2, long j, Function0<Unit> function0) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, new Long(j2), function0}, null, f38874a, true, 30267, new Class[]{Context.class, String.class, String.class, Long.TYPE, Function0.class}, Void.TYPE)) {
            Object[] objArr = {context, str, str2, new Long(j2), function0};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f38874a, true, 30267, new Class[]{Context.class, String.class, String.class, Long.TYPE, Function0.class}, Void.TYPE);
            return;
        }
        ICommerceService a2 = a();
        if (a2 != null) {
            a2.checkLoginAndLawHint(context, str, str2, j, function0);
        }
    }

    public static void a(@NonNull Activity activity, CommerceUser commerceUser, @Nullable String str, String str2, String str3, String str4) {
        if (PatchProxy.isSupport(new Object[]{activity, commerceUser, str, str2, str3, str4}, null, f38874a, true, 30256, new Class[]{Activity.class, CommerceUser.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {activity, commerceUser, str, str2, str3, str4};
            PatchProxy.accessDispatch(objArr, null, f38874a, true, 30256, new Class[]{Activity.class, CommerceUser.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        ICommerceService a2 = a();
        if (a2 != null) {
            a2.openPortfolioAccordingToAB(activity, commerceUser, str, str2, str3, str4);
        }
    }

    @SuppressLint({"TooManyMethodParam"})
    public static void a(Activity activity, String str, h hVar, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7) {
        if (PatchProxy.isSupport(new Object[]{activity, str, hVar, str2, str3, str4, str5, str6, bool, str7}, null, f38874a, true, 30264, new Class[]{Activity.class, String.class, h.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, str, hVar, str2, str3, str4, str5, str6, bool, str7}, null, f38874a, true, 30264, new Class[]{Activity.class, String.class, h.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, String.class}, Void.TYPE);
            return;
        }
        ICommerceService a2 = a();
        if (a2 != null) {
            a2.openTaobao(activity, str, hVar, str2, str3, str4, str5, str6, bool.booleanValue(), str7);
        }
    }
}
