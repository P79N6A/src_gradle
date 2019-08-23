package com.ss.android.newmedia.redbadge.c;

import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30329a;

    public static void a(Cursor cursor) {
        if (PatchProxy.isSupport(new Object[]{cursor}, null, f30329a, true, 18856, new Class[]{Cursor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cursor}, null, f30329a, true, 18856, new Class[]{Cursor.class}, Void.TYPE);
            return;
        }
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
}
