package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;
import android.widget.Toast;
import com.bytedance.common.utility.ICustomToast;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;

public final class eq implements UIUtils.ToastHook {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75840a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f75841b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f75842c;

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75843a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f75844b;

        public a(Handler handler) {
            this.f75844b = handler;
        }

        public final void dispatchMessage(Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f75843a, false, 88632, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message}, this, f75843a, false, 88632, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            try {
                super.dispatchMessage(message);
            } catch (WindowManager.BadTokenException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
        }

        public final void handleMessage(Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f75843a, false, 88633, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f75843a, false, 88633, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            this.f75844b.handleMessage(message2);
        }
    }

    static {
        try {
            Field declaredField = Toast.class.getDeclaredField("mTN");
            f75841b = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = f75841b.getType().getDeclaredField("mHandler");
            f75842c = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
    }

    public static void a(Toast toast) {
        Toast toast2 = toast;
        if (PatchProxy.isSupport(new Object[]{toast2}, null, f75840a, true, 88630, new Class[]{Toast.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{toast2}, null, f75840a, true, 88630, new Class[]{Toast.class}, Void.TYPE);
            return;
        }
        try {
            Object obj = f75841b.get(toast2);
            f75842c.set(obj, new a((Handler) f75842c.get(obj)));
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
    }

    public final boolean showToast(Context context, int i, CharSequence charSequence, long j, int i2) {
        Context context2 = context;
        CharSequence charSequence2 = charSequence;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), charSequence2, new Long(j2), Integer.valueOf(i2)}, this, f75840a, false, 88631, new Class[]{Context.class, Integer.TYPE, CharSequence.class, Long.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            Object[] objArr = {context2, Integer.valueOf(i), charSequence2, new Long(j2), Integer.valueOf(i2)};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, f75840a, false, 88631, new Class[]{Context.class, Integer.TYPE, CharSequence.class, Long.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if ((context2 instanceof ICustomToast) || Build.VERSION.SDK_INT != 25) {
            return false;
        } else {
            Toast makeText = Toast.makeText(context2, charSequence2, (int) j2);
            a(makeText);
            if (PatchProxy.isSupport(new Object[]{makeText}, null, er.f75845a, true, 88634, new Class[]{Toast.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{makeText}, null, er.f75845a, true, 88634, new Class[]{Toast.class}, Void.TYPE);
            } else {
                if (Build.VERSION.SDK_INT == 25) {
                    a(makeText);
                }
                makeText.show();
            }
            return true;
        }
    }
}
