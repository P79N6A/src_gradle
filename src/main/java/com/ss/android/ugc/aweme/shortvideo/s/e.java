package com.ss.android.ugc.aweme.shortvideo.s;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69144a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f69145b = {"Cepheus", "MI 9 Transparent Edition", "MI 9 ROY", "MI 9"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f69146c = {"VCE-AL00", "VCE-TL00", "VCE-L22", "GNA-AL00", "GNA-TL00", "GNA-L22"};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f69147d = new String[0];

    public static int a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f69144a, true, 81265, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f69144a, true, 81265, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        for (String equals : f69145b) {
            if (equals.equals(str2)) {
                return 3;
            }
        }
        for (String equals2 : f69146c) {
            if (equals2.equals(str2)) {
                return 1;
            }
        }
        for (String equals3 : f69147d) {
            if (equals3.equals(str2)) {
                return 2;
            }
        }
        return 0;
    }
}
