package com.ss.android.ugc.aweme.im.sdk.module.session;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.m;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51931a;

    static boolean b(int i, int i2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, null, f51931a, true, 52388, new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, null, f51931a, true, 52388, new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i <= 0 || a(i, i2, z)) {
            return false;
        } else {
            return true;
        }
    }

    static boolean a(int i, int i2, boolean z) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, null, f51931a, true, 52387, new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, null, f51931a, true, 52387, new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (m.c()) {
            if (i <= 0 || z || (i3 != 0 && i3 != 3 && i3 != 4 && i3 != 7)) {
                return false;
            }
            return true;
        } else if (i <= 0 || z || (i3 != 0 && i3 != 17 && i3 != 20)) {
            return false;
        } else {
            return true;
        }
    }

    static void a(RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        int i5;
        RecyclerView recyclerView2 = recyclerView;
        int i6 = i;
        int i7 = i2;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, f51931a, true, 52386, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {recyclerView2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f51931a, true, 52386, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i7 != i3) {
            int i8 = i4 - i7;
            int height = recyclerView2.getChildAt(1).getHeight();
            if (i6 == 1 && i7 == 0 && i4 > 0) {
                i5 = (recyclerView2.getChildAt(1).getTop() - recyclerView2.getChildAt(0).getTop()) - height;
            } else if (i6 == 1 && i7 > 0 && i4 == 0) {
                i5 = -1073741823;
            } else {
                i5 = 0;
            }
            recyclerView2.smoothScrollBy(0, (height * i8) + recyclerView2.getChildAt(0).getTop() + i5);
        }
    }
}
