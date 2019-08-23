package com.ss.android.ugc.aweme.im.sdk.resources;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.dexposed.ClassUtils;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52259a;

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f52259a, true, 53066, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f52259a, true, 53066, new Class[0], String.class);
        }
        return i.b("STICKER", 0, PushConstants.PUSH_TYPE_NOTIFY) + "/static/";
    }

    public static String b(com.ss.android.ugc.aweme.im.sdk.resources.model.a aVar) {
        if (!PatchProxy.isSupport(new Object[]{aVar}, null, f52259a, true, 53063, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.a.class}, String.class)) {
            return a(aVar.getResourcesId(), aVar.getVersion(), aVar.getId(), aVar.getAnimateType());
        }
        return (String) PatchProxy.accessDispatch(new Object[]{aVar}, null, f52259a, true, 53063, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.a.class}, String.class);
    }

    public static String c(com.ss.android.ugc.aweme.im.sdk.resources.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, null, f52259a, true, 53068, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.a.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aVar}, null, f52259a, true, 53068, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.a.class}, String.class);
        }
        return aVar.getId() + ClassUtils.PACKAGE_SEPARATOR + aVar.getStaticType();
    }

    public static String a(com.ss.android.ugc.aweme.im.sdk.resources.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, null, f52259a, true, 53062, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.a.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aVar}, null, f52259a, true, 53062, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.a.class}, String.class);
        }
        return i.b("STICKER", aVar.getResourcesId(), aVar.getVersion()) + "/static/" + aVar.getId() + ClassUtils.PACKAGE_SEPARATOR + aVar.getStaticType();
    }

    public static String a(long j, String str, long j2, String str2) {
        long j3 = j;
        String str3 = str;
        long j4 = j2;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), str3, new Long(j4), str4}, null, f52259a, true, 53064, new Class[]{Long.TYPE, String.class, Long.TYPE, String.class}, String.class)) {
            Object[] objArr = {new Long(j3), str3, new Long(j4), str4};
            return (String) PatchProxy.accessDispatch(objArr, null, f52259a, true, 53064, new Class[]{Long.TYPE, String.class, Long.TYPE, String.class}, String.class);
        }
        return i.b("STICKER", j3, str3) + "/animate/" + j4 + ClassUtils.PACKAGE_SEPARATOR + str4;
    }
}
