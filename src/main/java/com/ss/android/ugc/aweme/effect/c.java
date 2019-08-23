package com.ss.android.ugc.aweme.effect;

import android.graphics.Color;
import android.support.annotation.NonNull;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.port.in.a;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43712a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f43713b = a.f61119b.getResources().getColor(C0906R.color.a7l);

    /* renamed from: c  reason: collision with root package name */
    public static final int f43714c = (UIUtils.getScreenWidth(a.f61119b) - (((int) UIUtils.dip2Px(a.f61119b, 16.0f)) * 2));

    /* renamed from: d  reason: collision with root package name */
    private static int[] f43715d;

    @NonNull
    public static int[] a() {
        List<String> list;
        if (PatchProxy.isSupport(new Object[0], null, f43712a, true, 38535, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], null, f43712a, true, 38535, new Class[0], int[].class);
        }
        com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
        if (PatchProxy.isSupport(new Object[0], b2, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48764, new Class[0], List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[0], b2, com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a, false, 48764, new Class[0], List.class);
        } else if (b2.f49569c == null) {
            list = b2.f49568b.getFilterColors();
        } else {
            list = com.ss.android.ugc.aweme.global.config.settings.pojo.a.a(b2.f49569c, "filter_colors", String.class, b2.f49568b.getFilterColors());
        }
        if (list != null && !list.isEmpty()) {
            int[] iArr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                iArr[i] = a(list.get(i));
            }
            return iArr;
        } else if (PatchProxy.isSupport(new Object[0], null, f43712a, true, 38534, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], null, f43712a, true, 38534, new Class[0], int[].class);
        } else {
            if (f43715d != null) {
                return f43715d;
            }
            int[] intArray = a.f61119b.getResources().getIntArray(C0906R.array.k);
            f43715d = intArray;
            return intArray;
        }
    }

    private static int a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f43712a, true, 38536, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, null, f43712a, true, 38536, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return -1;
        }
    }
}
