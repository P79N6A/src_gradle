package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.taobao.android.dexposed.ClassUtils;
import java.util.regex.Pattern;

public final class cc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75669a;

    private static boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f75669a, true, 88356, new Class[]{String.class}, Boolean.TYPE)) {
            return Pattern.compile("[0-9]*").matcher(str2).matches();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f75669a, true, 88356, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    private static boolean b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f75669a, true, 88357, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f75669a, true, 88357, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str == null || !str.toLowerCase().contains("tiktok")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean a(String str, Context context) {
        String str2 = str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str2, context2}, null, f75669a, true, 88355, new Class[]{String.class, Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, context2}, null, f75669a, true, 88355, new Class[]{String.class, Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (!a.a()) {
            if (str2 == null || str.length() < 4) {
                com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.any).a();
                return false;
            }
        } else if (str2 == null || str.length() < 2) {
            com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.aoc).a();
            return false;
        }
        if (a.a() && str2 != null && str.length() > 24) {
            com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.aob).a();
            return false;
        } else if (!str2.matches("[0-9A-Za-z_.]*")) {
            com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.anz).a();
            return false;
        } else if (a(str)) {
            com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.ao_).a();
            return false;
        } else if (a.a() || !str2.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
            return true;
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.aoa).a();
            return false;
        }
    }

    public static boolean a(String str, String str2, String str3, Context context) {
        String str4 = str;
        String str5 = str2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str3, context2}, null, f75669a, true, 88354, new Class[]{String.class, String.class, String.class, Context.class}, Boolean.TYPE)) {
            Object[] objArr = {str4, str5, str3, context2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f75669a, true, 88354, new Class[]{String.class, String.class, String.class, Context.class}, Boolean.TYPE)).booleanValue();
        } else if (b(str3) || TextUtils.equals(str4, "2062")) {
            com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.ao9).a();
            return false;
        } else if (TextUtils.equals(str4, "2064")) {
            com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.ao4).a();
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            return true;
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(context2, str5).a();
            return false;
        }
    }
}
