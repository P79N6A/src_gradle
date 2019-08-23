package com.ss.android.ugc.aweme.commerce.sdk.c;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.ag.d;
import com.ss.android.ugc.aweme.app.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/router/CommerceRegisterRouter;", "Lcom/ss/android/ugc/aweme/router/IRouter;", "()V", "open", "", "context", "Landroid/app/Activity;", "url", "", "view", "Landroid/view/View;", "openWithOptions", "activity", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37707a;

    public final boolean a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f37707a, false, 29512, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f37707a, false, 29512, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        return b(null, str2, null);
    }

    public final boolean a(@NotNull Activity activity, @NotNull String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, str2}, this, f37707a, false, 29513, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2}, this, f37707a, false, 29513, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(activity2, "context");
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        return b(activity2, str2, null);
    }

    public final boolean a(@NotNull Activity activity, @NotNull String str, @NotNull View view) {
        Activity activity2 = activity;
        String str2 = str;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{activity2, str2, view2}, this, f37707a, false, 29514, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2, view2}, this, f37707a, false, 29514, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(activity2, "context");
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(view2, "view");
        return b(activity, str, view);
    }

    private final boolean b(Activity activity, String str, View view) {
        Activity activity2;
        if (PatchProxy.isSupport(new Object[]{activity, str, view}, this, f37707a, false, 29515, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity, str, view}, this, f37707a, false, 29515, new Class[]{Activity.class, String.class, View.class}, Boolean.TYPE)).booleanValue();
        }
        if (activity == null) {
            com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
            activity2 = b2.a();
        } else {
            activity2 = activity;
        }
        if (activity2 == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
            String path = parse.getPath();
            if (path != null) {
                int hashCode = path.hashCode();
                if (hashCode != 12082543) {
                    if (hashCode != 1454983466) {
                        if (hashCode == 1939403693) {
                            if (path.equals("/seeding/")) {
                                com.ss.android.ugc.aweme.commerce.sdk.b.a aVar = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e;
                                String queryParameter = parse.getQueryParameter("promotion_id");
                                String queryParameter2 = parse.getQueryParameter("product_id");
                                String queryParameter3 = parse.getQueryParameter("target_uid");
                                String queryParameter4 = parse.getQueryParameter("sec_target_uid");
                                String queryParameter5 = parse.getQueryParameter("item_id");
                                String queryParameter6 = parse.getQueryParameter("source_page");
                                String queryParameter7 = parse.getQueryParameter("enter_method");
                                String queryParameter8 = parse.getQueryParameter("play_id");
                                if (PatchProxy.isSupport(new Object[]{activity2, queryParameter, queryParameter2, queryParameter3, queryParameter4, queryParameter5, queryParameter6, queryParameter7, queryParameter8}, aVar, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29507, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
                                    Object[] objArr = {activity2, queryParameter, queryParameter2, queryParameter3, queryParameter4, queryParameter5, queryParameter6, queryParameter7, queryParameter8};
                                    Object[] objArr2 = objArr;
                                    com.ss.android.ugc.aweme.commerce.sdk.b.a aVar2 = aVar;
                                    PatchProxy.accessDispatch(objArr2, aVar2, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29507, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
                                } else {
                                    Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
                                    aVar.b().a(activity2, queryParameter, queryParameter2, queryParameter3, queryParameter4, queryParameter5, queryParameter6, queryParameter7, queryParameter8);
                                }
                            }
                        }
                    } else if (path.equals("/shop/")) {
                        com.ss.android.ugc.aweme.commerce.sdk.b.a aVar3 = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e;
                        String queryParameter9 = parse.getQueryParameter("uid");
                        String queryParameter10 = parse.getQueryParameter(c.f33976b);
                        String queryParameter11 = parse.getQueryParameter("entrance_location");
                        String queryParameter12 = parse.getQueryParameter("enter_from");
                        String queryParameter13 = parse.getQueryParameter("enter_method");
                        if (PatchProxy.isSupport(new Object[]{activity2, queryParameter9, queryParameter10, queryParameter11, queryParameter12, queryParameter13}, aVar3, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29503, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
                            Object[] objArr3 = {activity2, queryParameter9, queryParameter10, queryParameter11, queryParameter12, queryParameter13};
                            Object[] objArr4 = objArr3;
                            com.ss.android.ugc.aweme.commerce.sdk.b.a aVar4 = aVar3;
                            PatchProxy.accessDispatch(objArr4, aVar4, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29503, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
                            aVar3.b().a(activity2, queryParameter9, queryParameter10, queryParameter11, queryParameter12, queryParameter13);
                        }
                    }
                } else if (path.equals("/ordershare/")) {
                    com.ss.android.ugc.aweme.commerce.sdk.b.a aVar5 = com.ss.android.ugc.aweme.commerce.sdk.b.a.f37702e;
                    String queryParameter14 = parse.getQueryParameter("promotion_id");
                    String queryParameter15 = parse.getQueryParameter("product_id");
                    String queryParameter16 = parse.getQueryParameter("target_uid");
                    String queryParameter17 = parse.getQueryParameter("sec_target_uid");
                    String queryParameter18 = parse.getQueryParameter("item_id");
                    String queryParameter19 = parse.getQueryParameter("source_page");
                    String queryParameter20 = parse.getQueryParameter("enter_method");
                    if (PatchProxy.isSupport(new Object[]{activity2, queryParameter14, queryParameter15, queryParameter16, queryParameter17, queryParameter18, queryParameter19, queryParameter20}, aVar5, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29508, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
                        Object[] objArr5 = {activity2, queryParameter14, queryParameter15, queryParameter16, queryParameter17, queryParameter18, queryParameter19, queryParameter20};
                        Object[] objArr6 = objArr5;
                        com.ss.android.ugc.aweme.commerce.sdk.b.a aVar6 = aVar5;
                        PatchProxy.accessDispatch(objArr6, aVar6, com.ss.android.ugc.aweme.commerce.sdk.b.a.f37701a, false, 29508, new Class[]{Activity.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(activity2, "fromAct");
                        aVar5.b().a(activity2, queryParameter14, queryParameter15, queryParameter16, queryParameter17, queryParameter18, queryParameter19, queryParameter20);
                    }
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
