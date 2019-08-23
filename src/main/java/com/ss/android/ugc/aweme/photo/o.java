package com.ss.android.ugc.aweme.photo;

import android.graphics.BitmapFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.bm;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58622a;

    public static int[] a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f58622a, true, 63590, new Class[]{String.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{str2}, null, f58622a, true, 63590, new Class[]{String.class}, int[].class);
        } else if (!bm.a(str)) {
            return new int[]{0, 0};
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str2, options);
            return new int[]{options.outWidth, options.outHeight};
        }
    }
}
