package com.bytedance.android.live.core.utils.fresco;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8286a;

    static class a extends HashMap<String, Object> {
        private a(String str, Object obj) {
            put(str, obj);
        }

        /* synthetic */ a(String str, Object obj, byte b2) {
            this(str, obj);
        }
    }

    public static Object a(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, null, f8286a, true, 1396, new Class[]{View.class}, Object.class)) {
            return a(view2, "DraweeHolder");
        }
        return PatchProxy.accessDispatch(new Object[]{view2}, null, f8286a, true, 1396, new Class[]{View.class}, Object.class);
    }

    public static Object a(View view, String str) {
        View view2 = view;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{view2, str2}, null, f8286a, true, 1399, new Class[]{View.class, String.class}, Object.class)) {
            return b(view2, str2, null);
        }
        return PatchProxy.accessDispatch(new Object[]{view2, str2}, null, f8286a, true, 1399, new Class[]{View.class, String.class}, Object.class);
    }

    public static void a(View view, Object obj) {
        View view2 = view;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{view2, obj2}, null, f8286a, true, 1395, new Class[]{View.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, obj2}, null, f8286a, true, 1395, new Class[]{View.class, Object.class}, Void.TYPE);
            return;
        }
        a(view2, "DraweeHolder", obj2);
    }

    private static Object b(View view, String str, Object obj) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view, str2, null}, null, f8286a, true, 1400, new Class[]{View.class, String.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{view, str2, null}, null, f8286a, true, 1400, new Class[]{View.class, String.class, Object.class}, Object.class);
        }
        if (view != null) {
            Object tag = view.getTag();
            if (tag instanceof a) {
                Object obj2 = ((a) tag).get(str2);
                if (obj2 != null) {
                    return obj2;
                }
            }
        }
        return null;
    }

    public static boolean a(View view, String str, Object obj) {
        View view2 = view;
        String str2 = str;
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{view2, str2, obj2}, null, f8286a, true, 1397, new Class[]{View.class, String.class, Object.class}, Boolean.TYPE)) {
            return a(view2, str2, obj2, true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, str2, obj2}, null, f8286a, true, 1397, new Class[]{View.class, String.class, Object.class}, Boolean.TYPE)).booleanValue();
    }

    private static boolean a(View view, String str, Object obj, boolean z) {
        View view2 = view;
        String str2 = str;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{view2, str2, obj2, (byte) 1}, null, f8286a, true, 1398, new Class[]{View.class, String.class, Object.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, str2, obj2, (byte) 1}, null, f8286a, true, 1398, new Class[]{View.class, String.class, Object.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (view2 == null) {
            return false;
        } else {
            Object tag = view.getTag();
            if (tag instanceof a) {
                ((a) tag).put(str2, obj2);
                return true;
            }
            view2.setTag(new a(str2, obj2, (byte) 0));
            return true;
        }
    }
}
