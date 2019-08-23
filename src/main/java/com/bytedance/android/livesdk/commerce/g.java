package com.bytedance.android.livesdk.commerce;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13631a;

    public static boolean a(String str) {
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f13631a, true, 8065, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f13631a, true, 8065, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!a.f8887a.booleanValue() || TextUtils.isEmpty(str)) {
            return false;
        } else {
            if (!str2.startsWith("market://details?id=") && !str2.startsWith("https://play.google.com")) {
                return false;
            }
            if (PatchProxy.isSupport(new Object[0], null, f13631a, true, 8066, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f13631a, true, 8066, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = com.bytedance.android.livesdk.utils.a.b("com.android.vending");
            }
            if (!z) {
                return false;
            }
            Context a2 = TTLiveSDKContext.getHostService().a().a();
            if (a2 == null) {
                return false;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.setPackage("com.android.vending");
                intent.addFlags(268435456);
                a2.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
