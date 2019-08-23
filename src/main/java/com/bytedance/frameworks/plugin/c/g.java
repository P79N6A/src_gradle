package com.bytedance.frameworks.plugin.c;

import android.app.Notification;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.lang.reflect.Method;
import java.util.Iterator;

public final class g extends j {

    static class a extends i {
        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public Object a(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                int i = 0;
                while (true) {
                    if (i >= objArr.length) {
                        break;
                    } else if (objArr[i] == null || !(objArr[i] instanceof String)) {
                        i++;
                    } else if (com.bytedance.frameworks.plugin.pm.c.a(objArr[i])) {
                        objArr[i] = com.bytedance.frameworks.plugin.e.a().getPackageName();
                    }
                }
            }
            return super.a(obj, method, objArr);
        }
    }

    static class b extends a {
        b() {
            super((byte) 0);
        }
    }

    static class c extends a {
        c() {
            super((byte) 0);
        }
    }

    static class d extends a {
        d() {
            super((byte) 0);
        }

        public final Object a(Object obj, Method method, Object[] objArr) {
            return super.a(obj, method, objArr);
        }
    }

    static class e extends a {
        e() {
            super((byte) 0);
        }

        private static Bitmap a(Drawable drawable) {
            Bitmap.Config config;
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (drawable.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            return createBitmap;
        }

        private static void a(RemoteViews remoteViews) {
            if (remoteViews != null && !TextUtils.equals(remoteViews.getPackage(), com.bytedance.frameworks.plugin.e.a().getPackageName())) {
                try {
                    if (Build.VERSION.SDK_INT >= 21) {
                        com.bytedance.frameworks.plugin.e.a.a((Object) remoteViews, "mApplication", (Object) com.bytedance.frameworks.plugin.e.a().getApplicationInfo());
                    } else {
                        com.bytedance.frameworks.plugin.e.a.a((Object) remoteViews, "mPackage", (Object) com.bytedance.frameworks.plugin.e.a().getPackageName());
                    }
                } catch (Exception unused) {
                }
            }
        }

        public final Object a(Object obj, Method method, Object[] objArr) {
            String str;
            Notification notification = null;
            int i = 0;
            if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof String)) {
                str = null;
            } else {
                str = objArr[0];
            }
            while (true) {
                if (objArr != null && i < objArr.length) {
                    if (objArr[i] != null && (objArr[i] instanceof Notification)) {
                        notification = objArr[i];
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            if (!TextUtils.equals(str, com.bytedance.frameworks.plugin.e.a().getPackageName()) && notification != null) {
                a(notification.contentView);
                a(notification.tickerView);
                if (Build.VERSION.SDK_INT >= 16) {
                    a(notification.bigContentView);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    a(notification.headsUpContentView);
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    Icon smallIcon = notification.getSmallIcon();
                    if (smallIcon != null) {
                        Bitmap a2 = a(smallIcon.loadDrawable(com.bytedance.frameworks.plugin.e.a()));
                        if (a2 != null) {
                            try {
                                com.bytedance.frameworks.plugin.e.a.a((Object) notification, "mSmallIcon", (Object) Icon.createWithBitmap(a2));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    Icon largeIcon = notification.getLargeIcon();
                    if (largeIcon != null) {
                        Bitmap a3 = a(largeIcon.loadDrawable(com.bytedance.frameworks.plugin.e.a()));
                        if (a3 != null) {
                            try {
                                com.bytedance.frameworks.plugin.e.a.a((Object) notification, "mLargeIcon", (Object) Icon.createWithBitmap(a3));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
                if (Build.VERSION.SDK_INT > 23) {
                    try {
                        Bundle bundle = (Bundle) com.bytedance.frameworks.plugin.e.a.a((Object) notification, "extras");
                        Iterator it2 = bundle.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String str2 = (String) it2.next();
                            if (bundle.get(str2) != null && (bundle.get(str2) instanceof ApplicationInfo)) {
                                if (!TextUtils.equals(((ApplicationInfo) bundle.get(str2)).packageName, com.bytedance.frameworks.plugin.e.a().getPackageName())) {
                                    bundle.putParcelable(str2, com.bytedance.frameworks.plugin.e.a().getApplicationInfo());
                                }
                            }
                        }
                    } catch (Exception unused3) {
                    }
                }
            }
            return super.a(obj, method, objArr);
        }
    }

    static class f extends a {
        f() {
            super((byte) 0);
        }

        public final Object a(Object obj, Method method, Object[] objArr) {
            return super.a(obj, method, objArr);
        }
    }

    static {
        f2174b.put("enqueueToast", new f());
        f2174b.put("cancelToast", new d());
        f2174b.put("enqueueNotificationWithTag", new e());
        f2174b.put("cancelNotificationWithTag", new c());
        f2174b.put("cancelAllNotifications", new b());
    }

    public final void a() {
        b bVar = new b("notification", this);
        bVar.a();
        try {
            b(com.bytedance.frameworks.plugin.e.b.a(Class.forName("android.app.INotificationManager$Stub"), "asInterface", (Class<?>[]) new Class[]{IBinder.class}).invoke(null, new Object[]{bVar.f2178e}));
        } catch (Exception e2) {
            com.bytedance.frameworks.plugin.f.g.a("Hook proxy NotificationManager Failed!!!", (Throwable) e2);
        }
    }
}
