package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttplatformsdk.c.b;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class AwemeSSOPlatformUtils {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75439a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String> f75440b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f75441c = "AwemeSSOPlatformUtils";

    static class AccountStatusChangedTask implements LegoTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        private AccountStatusChangedTask() {
        }

        @NotNull
        public f type() {
            return f.BACKGROUND;
        }

        public void run(@NotNull Context context) {
            String str;
            if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 88015, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 88015, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            a.a("AccountStatusChangedTask");
            User curUser = d.a().getCurUser();
            UrlModel avatarThumb = curUser.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() <= 0) {
                str = "";
            } else {
                str = avatarThumb.getUrlList().get(0);
            }
            b.a(context).a(curUser.getNickname(), str, d.a().isLogin());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f75440b = hashMap;
        hashMap.put("qzone_sns", "qq");
        f75440b.put("weixin", "weixin");
        f75440b.put("sina_weibo", "weibo");
        f75440b.put("mobile", "phone");
        f75440b.put("toutiao", "toutiao");
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f75439a, true, 88012, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f75439a, true, 88012, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.lego.a.i.a().a(new AccountStatusChangedTask()).a();
        }
    }

    private static String b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], null, f75439a, true, 88014, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f75439a, true, 88014, new Class[0], String.class);
        }
        String str2 = "";
        CookieManager instance = CookieManager.getInstance();
        if (instance == null) {
            str = "";
        } else {
            str = instance.getCookie(com.ss.android.c.b.f2437f);
        }
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(";");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str3 = split[i];
                if (!TextUtils.isEmpty(str3)) {
                    String[] split2 = str3.split("=");
                    if (split2.length >= 2 && split2[0].trim().equals("sessionid")) {
                        str2 = split2[1];
                        break;
                    }
                }
                i++;
            }
        }
        return str2;
    }

    public static void a(Context context, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{context, str, str2}, null, f75439a, true, 88013, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2}, null, f75439a, true, 88013, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
        } else if (d.a().isLogin()) {
            try {
                b.a(context).a(str, Long.parseLong(str2), b(), null);
            } catch (Exception unused) {
            }
        }
    }
}
