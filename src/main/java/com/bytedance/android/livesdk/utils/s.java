package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17632a;

    public static void a(Context context, EditText editText) {
        Context context2 = context;
        EditText editText2 = editText;
        if (PatchProxy.isSupport(new Object[]{context2, editText2}, null, f17632a, true, 13679, new Class[]{Context.class, EditText.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, editText2}, null, f17632a, true, 13679, new Class[]{Context.class, EditText.class}, Void.TYPE);
            return;
        }
        ((InputMethodManager) context2.getSystemService("input_method")).showSoftInput(editText2, 1);
    }

    public static void b(Context context, EditText editText) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, editText}, null, f17632a, true, 13680, new Class[]{Context.class, EditText.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, editText}, null, f17632a, true, 13680, new Class[]{Context.class, EditText.class}, Void.TYPE);
            return;
        }
        if (context2 != null) {
            ((InputMethodManager) context2.getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }
}
