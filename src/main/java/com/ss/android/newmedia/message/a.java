package com.ss.android.newmedia.message;

import android.content.Intent;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30231a;

    public static boolean a(Intent intent, String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{intent, str2, (byte) 0}, null, f30231a, true, 18694, new Class[]{Intent.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{intent, str2, (byte) 0}, null, f30231a, true, 18694, new Class[]{Intent.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Object obj = extras.get(str2);
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            try {
                return Boolean.parseBoolean((String) obj);
            } catch (NumberFormatException unused) {
                return false;
            }
        } else {
            try {
                return ((Boolean) obj).booleanValue();
            } catch (ClassCastException unused2) {
                return false;
            }
        }
    }

    public static int a(Intent intent, String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{intent, str2, -1}, null, f30231a, true, 18689, new Class[]{Intent.class, String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{intent, str2, -1}, null, f30231a, true, 18689, new Class[]{Intent.class, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return -1;
        }
        Object obj = extras.get(str2);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                return -1;
            }
        } else {
            try {
                return ((Integer) obj).intValue();
            } catch (ClassCastException unused2) {
                return -1;
            }
        }
    }
}
