package com.ss.android.newmedia.redbadge.a;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.e;
import java.util.Arrays;
import java.util.List;

public class l implements com.ss.android.newmedia.redbadge.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30293a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f30294b = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: c  reason: collision with root package name */
    private AsyncQueryHandler f30295c;

    static class a extends AsyncQueryHandler {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f30297b;

        /* renamed from: com.ss.android.newmedia.redbadge.a.l$a$a  reason: collision with other inner class name */
        class C0367a extends AsyncQueryHandler.WorkerHandler {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f30298a;

            public final void handleMessage(Message message) {
                if (PatchProxy.isSupport(new Object[]{message}, this, f30298a, false, 18821, new Class[]{Message.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{message}, this, f30298a, false, 18821, new Class[]{Message.class}, Void.TYPE);
                    return;
                }
                try {
                    a.super.handleMessage(message);
                } catch (SecurityException unused) {
                }
            }

            C0367a(Looper looper) {
                super(a.this, looper);
            }
        }

        a(ContentResolver contentResolver) {
            super(contentResolver);
        }

        /* JADX WARNING: type inference failed for: r1v1, types: [com.ss.android.newmedia.redbadge.a.l$a$a, android.os.Handler] */
        public Handler createHandler(Looper looper) {
            Looper looper2 = looper;
            if (!PatchProxy.isSupport(new Object[]{looper2}, this, f30297b, false, 18820, new Class[]{Looper.class}, Handler.class)) {
                return new C0367a(looper2);
            }
            return (Handler) PatchProxy.accessDispatch(new Object[]{looper2}, this, f30297b, false, 18820, new Class[]{Looper.class}, Handler.class);
        }
    }

    public final List<String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f30293a, false, 18815, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f30293a, false, 18815, new Class[0], List.class);
        }
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    public final void a(Context context, ComponentName componentName, int i) throws e {
        int i2;
        boolean z;
        Context context2 = context;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{context2, componentName, Integer.valueOf(i)}, this, f30293a, false, 18814, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, componentName, Integer.valueOf(i)}, this, f30293a, false, 18814, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
        } else if (context2 != null && componentName != null) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            try {
                if (PatchProxy.isSupport(new Object[]{context2}, null, f30293a, true, 18819, new Class[]{Context.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f30293a, true, 18819, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                } else if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (PatchProxy.isSupport(new Object[]{context2, componentName, Integer.valueOf(i2)}, this, f30293a, false, 18817, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, componentName, Integer.valueOf(i2)}, this, f30293a, false, 18817, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
                    } else if (i2 >= 0) {
                        if (this.f30295c == null) {
                            this.f30295c = new a(context.getApplicationContext().getContentResolver()) {
                            };
                        }
                        String packageName = componentName.getPackageName();
                        String className = componentName.getClassName();
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), packageName, className}, this, f30293a, false, 18818, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), packageName, className}, this, f30293a, false, 18818, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
                        } else {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("badge_count", Integer.valueOf(i2));
                            contentValues.put("package_name", packageName);
                            contentValues.put("activity_name", className);
                            this.f30295c.startInsert(0, null, this.f30294b, contentValues);
                        }
                    }
                }
                if (PatchProxy.isSupport(new Object[]{context2, componentName, Integer.valueOf(i2)}, null, f30293a, true, 18816, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context2, componentName, Integer.valueOf(i2)}, null, f30293a, true, 18816, new Class[]{Context.class, ComponentName.class, Integer.TYPE}, Void.TYPE);
                } else {
                    Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i2));
                    if (i2 <= 0) {
                        z2 = false;
                    }
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z2);
                    context2.sendBroadcast(intent);
                }
            } catch (Throwable th) {
                throw new e(th.getMessage());
            }
        }
    }
}
