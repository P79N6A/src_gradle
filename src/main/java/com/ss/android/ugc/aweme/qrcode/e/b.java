package com.ss.android.ugc.aweme.qrcode.e;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63462a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f63463b = new ArrayList(Arrays.asList(new String[]{"v16.musical.ly", "v16.tiktokv.com", "v.douyin.com", "v.tiktok.com", "vt.tiktok.com", "vm.tiktok.com"}));

    private static boolean a(Uri uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, null, f63462a, true, 70506, new Class[]{Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri}, null, f63462a, true, 70506, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
        }
        Set set = (Set) x.a().u().c();
        if (set.isEmpty()) {
            return f63463b.contains(uri.getHost());
        }
        return set.contains(uri.getHost());
    }

    public static boolean b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f63462a, true, 70507, new Class[]{String.class}, Boolean.TYPE)) {
            return Pattern.compile("(https?|http)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str2).find();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f63462a, true, 70507, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f63462a, true, 70508, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f63462a, true, 70508, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || !str2.startsWith("aweme://webview/")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f63462a, true, 70505, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f63462a, true, 70505, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (b(str)) {
            return a(Uri.parse(str));
        } else {
            return false;
        }
    }
}
