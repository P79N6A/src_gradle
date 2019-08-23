package com.ss.android.ugc.aweme.shortvideo.l;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68279a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f68280b = {"Cepheus", "MI 9 Transparent Edition", "MI 9 ROY", "MI 9"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f68281c = {"PCCM00", "PCAM00"};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f68282d = new String[0];

    public static int a(String str) {
        boolean z;
        boolean z2;
        String str2 = str;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f68279a, true, 78498, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f68279a, true, 78498, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f68279a, true, 78500, new Class[]{String.class}, Boolean.TYPE)) {
            String[] strArr = f68281c;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (strArr[i].equals(str2)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        } else {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f68279a, true, 78500, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (z) {
            return 2;
        }
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f68279a, true, 78499, new Class[]{String.class}, Boolean.TYPE)) {
            String[] strArr2 = f68280b;
            int length2 = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                } else if (strArr2[i2].equals(str2)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f68279a, true, 78499, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (z2) {
            return 1;
        }
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f68279a, true, 78501, new Class[]{String.class}, Boolean.TYPE)) {
            String[] strArr3 = f68282d;
            int length3 = strArr3.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    z3 = false;
                    break;
                } else if (strArr3[i3].equals(str2)) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f68279a, true, 78501, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (z3) {
            return 3;
        }
        return 0;
    }
}
