package com.ss.android.ugc.awemepushlib.c;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.awemepushlib.interaction.j;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76970a;

    private static boolean a(int i) {
        return i == 1 || i == 4;
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f76970a, true, 90390, new Class[]{JSONObject.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2, str2, Byte.valueOf(z)}, null, f76970a, true, 90390, new Class[]{JSONObject.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (jSONObject.isNull(str)) {
            return z;
        } else {
            int optInt = jSONObject2.optInt(str2, -1);
            if (optInt > 0) {
                return true;
            }
            if (optInt == 0) {
                return false;
            }
            return jSONObject.optBoolean(str, z);
        }
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f76970a, true, 90388, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76970a, true, 90388, new Class[0], Boolean.TYPE)).booleanValue();
        }
        boolean z = true;
        try {
            z = true ^ "Hisense".equalsIgnoreCase(Build.BRAND);
        } catch (Throwable unused) {
        }
        return z;
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f76970a, true, 90386, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76970a, true, 90386, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return j.a().isAppNotActive();
    }

    private static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f76970a, true, 90383, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f76970a, true, 90383, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if (ToolUtils.isFlyme()) {
                return true;
            }
            if (Build.VERSION.SDK_INT <= 20 || !ToolUtils.isHuaweiDevice()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    public static void a(Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{runnable}, null, f76970a, true, 90392, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable}, null, f76970a, true, 90392, new Class[]{Runnable.class}, Void.TYPE);
        } else if (UIUtils.isInUIThread()) {
            ThreadPlus.submitRunnable(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean a(Context context) {
        String str;
        if (PatchProxy.isSupport(new Object[]{context}, null, f76970a, true, 90384, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f76970a, true, 90384, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            NotificationManagerCompat from = NotificationManagerCompat.from(context);
            if (Logger.debug()) {
                StringBuilder sb = new StringBuilder("NotificationSettingSwitch: ");
                if (from.areNotificationsEnabled()) {
                    str = "Open";
                } else {
                    str = "Close";
                }
                sb.append(str);
                Logger.d("AwemePushUtils", sb.toString());
            }
            return from.areNotificationsEnabled();
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean a(Map map) {
        if (PatchProxy.isSupport(new Object[]{map}, null, f76970a, true, 90391, new Class[]{Map.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{map}, null, f76970a, true, 90391, new Class[]{Map.class}, Boolean.TYPE)).booleanValue();
        } else if (map == null || map.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean a(int i, Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), context, intent}, null, f76970a, true, 90387, new Class[]{Integer.TYPE, Context.class, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), context, intent}, null, f76970a, true, 90387, new Class[]{Integer.TYPE, Context.class, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (i != 0) {
            return false;
        } else {
            try {
                context.startActivity(intent);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static boolean a(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, str, str2}, null, f76970a, true, 90385, new Class[]{JSONObject.class, String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2, str, str2}, null, f76970a, true, 90385, new Class[]{JSONObject.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            String string = jSONObject2.getString(f.f34168b);
            if (!TextUtils.isEmpty(string) && string.startsWith("sslocal://chat/center")) {
                return j.a().isAppBackground();
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.support.v4.media.app.NotificationCompat$MediaStyle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.support.v4.media.app.NotificationCompat$MediaStyle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.support.v4.app.NotificationCompat$InboxStyle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: android.support.v4.app.NotificationCompat$BigTextStyle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v69, resolved type: android.support.v4.app.NotificationCompat$BigPictureStyle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: android.support.v4.media.app.NotificationCompat$MediaStyle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: android.support.v4.app.NotificationCompat$MessagingStyle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: android.support.v4.app.NotificationCompat$MessagingStyle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: android.support.v4.app.NotificationCompat$MessagingStyle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: android.support.v4.app.NotificationCompat$MessagingStyle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: android.support.v4.app.NotificationCompat$MessagingStyle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: android.support.v4.media.app.NotificationCompat$MediaStyle} */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:162:0x03c0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03c8 A[Catch:{ Exception -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03c9 A[Catch:{ Exception -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03cc A[Catch:{ Exception -> 0x03f4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Notification a(android.content.Context r27, com.ss.android.ugc.awemepushlib.a.c r28, android.graphics.Bitmap r29, android.graphics.Bitmap r30, android.content.Intent r31, boolean r32) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = 6
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r13 = 0
            r6[r13] = r0
            r14 = 1
            r6[r14] = r1
            r15 = 2
            r6[r15] = r2
            r12 = 3
            r6[r12] = r3
            r11 = 4
            r6[r11] = r4
            java.lang.Byte r7 = java.lang.Byte.valueOf(r32)
            r10 = 5
            r6[r10] = r7
            com.meituan.robust.ChangeQuickRedirect r8 = f76970a
            java.lang.Class[] r9 = new java.lang.Class[r5]
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r9[r13] = r7
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r7 = com.ss.android.ugc.awemepushlib.a.c.class
            r9[r14] = r7
            java.lang.Class<android.graphics.Bitmap> r7 = android.graphics.Bitmap.class
            r9[r15] = r7
            java.lang.Class<android.graphics.Bitmap> r7 = android.graphics.Bitmap.class
            r9[r12] = r7
            java.lang.Class<android.content.Intent> r7 = android.content.Intent.class
            r9[r11] = r7
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r9[r10] = r7
            java.lang.Class<android.app.Notification> r16 = android.app.Notification.class
            r7 = 0
            r17 = 1
            r18 = 90382(0x1610e, float:1.26652E-40)
            r19 = r9
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r16
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x009c
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r13] = r0
            r6[r14] = r1
            r6[r15] = r2
            r7 = 3
            r6[r7] = r3
            r8 = 4
            r6[r8] = r4
            java.lang.Byte r0 = java.lang.Byte.valueOf(r32)
            r9 = 5
            r6[r9] = r0
            r21 = 0
            com.meituan.robust.ChangeQuickRedirect r22 = f76970a
            r23 = 1
            r24 = 90382(0x1610e, float:1.26652E-40)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r13] = r1
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r1 = com.ss.android.ugc.awemepushlib.a.c.class
            r0[r14] = r1
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r0[r15] = r1
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r0[r7] = r1
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r0[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r9] = r1
            java.lang.Class<android.app.Notification> r26 = android.app.Notification.class
            r20 = r6
            r25 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            android.app.Notification r0 = (android.app.Notification) r0
            return r0
        L_0x009c:
            r7 = 3
            r8 = 4
            r9 = 5
            int r6 = r1.pass_through
            boolean r6 = a((int) r6, (android.content.Context) r0, (android.content.Intent) r4)
            r10 = 0
            if (r6 == 0) goto L_0x00a9
            return r10
        L_0x00a9:
            if (r2 != 0) goto L_0x00ad
            r1.imageType = r13
        L_0x00ad:
            if (r3 == 0) goto L_0x00b1
            r6 = r3
            goto L_0x00b2
        L_0x00b1:
            r6 = r2
        L_0x00b2:
            android.support.v4.app.NotificationCompat$Builder r11 = new android.support.v4.app.NotificationCompat$Builder
            if (r32 == 0) goto L_0x00b9
            java.lang.String r12 = "com.ss.android.ugc.aweme.server.important.low"
            goto L_0x00bb
        L_0x00b9:
            java.lang.String r12 = "com.ss.android.ugc.aweme.server"
        L_0x00bb:
            r11.<init>(r0, r12)
            java.lang.String r12 = r1.title
            boolean r12 = com.bytedance.common.utility.StringUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x00cf
            r12 = 2131558627(0x7f0d00e3, float:1.8742575E38)
            java.lang.String r12 = r0.getString(r12)
            r1.title = r12
        L_0x00cf:
            java.lang.String r12 = r1.title
            android.support.v4.app.NotificationCompat$Builder r12 = r11.setTicker(r12)
            r12.setAutoCancel(r14)
            int r12 = android.os.Build.VERSION.SDK_INT
            r8 = 20
            if (r12 <= r8) goto L_0x00e5
            r12 = 2130840576(0x7f020c00, float:1.7286195E38)
            r11.setSmallIcon(r12)
            goto L_0x00eb
        L_0x00e5:
            r12 = 2130840575(0x7f020bff, float:1.7286193E38)
            r11.setSmallIcon(r12)
        L_0x00eb:
            boolean r12 = r1.led
            if (r12 == 0) goto L_0x00f9
            r12 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r15 = 1000(0x3e8, float:1.401E-42)
            r7 = 2500(0x9c4, float:3.503E-42)
            r11.setLights(r12, r15, r7)
        L_0x00f9:
            com.ss.android.ugc.awemepushlib.a.c$a r7 = r1.extra
            boolean r7 = r7.isGroupSummary
            if (r7 != 0) goto L_0x010b
            java.lang.String r7 = "defaultGroup"
            r11.setGroup(r7)
            com.ss.android.ugc.awemepushlib.a.c$a r7 = r1.extra
            boolean r7 = r7.isGroupSummary
            r11.setGroupSummary(r7)
        L_0x010b:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            r12 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r7 = android.app.PendingIntent.getActivity(r0, r13, r7, r12)
            int r15 = r1.imageType
            boolean r15 = a((int) r15)
            if (r15 == 0) goto L_0x0157
            if (r2 == 0) goto L_0x0157
            android.support.v4.app.NotificationCompat$BigPictureStyle r5 = new android.support.v4.app.NotificationCompat$BigPictureStyle
            r5.<init>()
            android.support.v4.app.NotificationCompat$BigPictureStyle r5 = r5.bigPicture(r2)
            java.lang.String r9 = r1.title
            android.support.v4.app.NotificationCompat$BigPictureStyle r5 = r5.setBigContentTitle(r9)
            java.lang.String r9 = r1.text
            android.support.v4.app.NotificationCompat$BigPictureStyle r5 = r5.setSummaryText(r9)
            if (r3 == 0) goto L_0x013b
            r5.bigLargeIcon(r3)
            goto L_0x0154
        L_0x013b:
            android.content.res.Resources r3 = r27.getResources()
            int r9 = com.ss.android.ugc.awemepushlib.R$drawable.icon
            android.graphics.drawable.Drawable r3 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r3, (int) r9)
            boolean r9 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r9 == 0) goto L_0x0150
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r3 = r3.getBitmap()
            goto L_0x0151
        L_0x0150:
            r3 = r10
        L_0x0151:
            r5.bigLargeIcon(r3)
        L_0x0154:
            r3 = r5
            goto L_0x01f5
        L_0x0157:
            int r3 = r1.imageType
            if (r3 != r9) goto L_0x0171
            android.support.v4.media.app.NotificationCompat$MediaStyle r3 = new android.support.v4.media.app.NotificationCompat$MediaStyle
            r3.<init>()
            android.support.v4.media.session.MediaSessionCompat r5 = new android.support.v4.media.session.MediaSessionCompat
            java.lang.String r9 = "notification"
            r5.<init>((android.content.Context) r0, (java.lang.String) r9)
            android.support.v4.media.session.MediaSessionCompat$Token r5 = r5.getSessionToken()
            android.support.v4.media.app.NotificationCompat$MediaStyle r3 = r3.setMediaSession(r5)
            goto L_0x01f5
        L_0x0171:
            int r3 = r1.imageType
            if (r3 != r5) goto L_0x0198
            android.support.v4.app.NotificationCompat$BigTextStyle r3 = new android.support.v4.app.NotificationCompat$BigTextStyle
            r3.<init>()
            java.lang.String r5 = r1.title
            android.support.v4.app.NotificationCompat$BigTextStyle r3 = r3.setBigContentTitle(r5)
            java.lang.String r5 = r1.text
            android.support.v4.app.NotificationCompat$BigTextStyle r3 = r3.setSummaryText(r5)
            com.ss.android.ugc.awemepushlib.a.c$a r5 = r1.extra
            java.lang.String r5 = r5.extra_text
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01f5
            com.ss.android.ugc.awemepushlib.a.c$a r5 = r1.extra
            java.lang.String r5 = r5.extra_text
            r3.bigText(r5)
            goto L_0x01f5
        L_0x0198:
            int r3 = r1.imageType
            r5 = 7
            if (r3 != r5) goto L_0x01d6
            android.support.v4.app.NotificationCompat$InboxStyle r3 = new android.support.v4.app.NotificationCompat$InboxStyle
            r3.<init>()
            java.lang.String r5 = r1.title
            android.support.v4.app.NotificationCompat$InboxStyle r3 = r3.setBigContentTitle(r5)
            java.lang.String r5 = r1.text
            android.support.v4.app.NotificationCompat$InboxStyle r3 = r3.setSummaryText(r5)
            com.ss.android.ugc.awemepushlib.a.c$a r5 = r1.extra
            java.lang.String r5 = r5.extra_text
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01f5
            com.ss.android.ugc.awemepushlib.a.c$a r5 = r1.extra
            java.lang.String r5 = r5.extra_text
            java.lang.String r9 = "\n"
            java.lang.String[] r5 = r5.split(r9)
            int r9 = r5.length
            r15 = 0
        L_0x01c4:
            if (r15 >= r9) goto L_0x01f5
            r12 = r5[r15]
            boolean r16 = android.text.TextUtils.isEmpty(r12)
            if (r16 != 0) goto L_0x01d1
            r3.addLine(r12)
        L_0x01d1:
            int r15 = r15 + 1
            r12 = 134217728(0x8000000, float:3.85186E-34)
            goto L_0x01c4
        L_0x01d6:
            int r3 = r1.imageType
            r5 = 8
            if (r3 != r5) goto L_0x01f4
            android.support.v4.app.NotificationCompat$MessagingStyle r3 = new android.support.v4.app.NotificationCompat$MessagingStyle
            java.lang.String r5 = ""
            r3.<init>((java.lang.CharSequence) r5)
            java.lang.String r5 = r1.title
            android.support.v4.app.NotificationCompat$MessagingStyle r3 = r3.setConversationTitle(r5)
            java.lang.String r5 = r1.text
            long r13 = java.lang.System.currentTimeMillis()
            android.support.v4.app.NotificationCompat$MessagingStyle r3 = r3.addMessage((java.lang.CharSequence) r5, (long) r13, (java.lang.CharSequence) r10)
            goto L_0x01f5
        L_0x01f4:
            r3 = r10
        L_0x01f5:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 <= r8) goto L_0x0203
            com.ss.android.ugc.awemepushlib.a.c$a r5 = r1.extra
            boolean r5 = r5.is_notification_top
            if (r5 == 0) goto L_0x0203
            r5 = 1
            r11.setFullScreenIntent(r7, r5)
        L_0x0203:
            int r5 = r1.imageType
            boolean r5 = a((int) r5)
            if (r5 == 0) goto L_0x0210
            if (r6 == 0) goto L_0x0210
            r11.setLargeIcon(r6)
        L_0x0210:
            com.ss.android.ugc.awemepushlib.a.c$a r5 = r1.extra
            int r5 = r5.getPriority()
            r11.setPriority(r5)
            com.ss.android.ugc.awemepushlib.a.c$a r5 = r1.extra
            boolean r5 = r5.isZeroVibrate
            if (r5 == 0) goto L_0x0225
            r5 = 0
            long[] r7 = new long[r5]
            r11.setVibrate(r7)
        L_0x0225:
            com.ss.android.ugc.awemepushlib.a.c$a r5 = r1.extra
            java.lang.String r5 = r5.bg_color
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x023a
            com.ss.android.ugc.awemepushlib.a.c$a r5 = r1.extra
            java.lang.String r5 = r5.bg_color
            int r5 = android.graphics.Color.parseColor(r5)
            r11.setColor(r5)
        L_0x023a:
            java.lang.String r5 = r1.title
            android.support.v4.app.NotificationCompat$Builder r5 = r11.setContentTitle(r5)
            java.lang.String r7 = r1.text
            android.support.v4.app.NotificationCompat$Builder r5 = r5.setContentText(r7)
            long r12 = java.lang.System.currentTimeMillis()
            r5.setWhen(r12)
            boolean r5 = c()
            if (r5 != 0) goto L_0x025c
            com.ss.android.ugc.awemepushlib.a.c$a r5 = r1.extra
            boolean r5 = r5.user_system_style
            if (r5 == 0) goto L_0x025a
            goto L_0x025c
        L_0x025a:
            r5 = 0
            goto L_0x025d
        L_0x025c:
            r5 = 1
        L_0x025d:
            if (r5 != 0) goto L_0x0323
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r5 = "HH:mm"
            java.util.Locale r7 = java.util.Locale.getDefault()
            r2.<init>(r5, r7)
            java.util.Date r5 = new java.util.Date
            long r12 = java.lang.System.currentTimeMillis()
            r5.<init>(r12)
            java.lang.String r2 = r2.format(r5)
            java.lang.String r5 = r27.getPackageName()
            int r7 = r1.imageType
            r9 = 3
            if (r7 != r9) goto L_0x0289
            android.widget.RemoteViews r7 = new android.widget.RemoteViews
            r9 = 2131690939(0x7f0f05bb, float:1.9010936E38)
            r7.<init>(r5, r9)
            goto L_0x029f
        L_0x0289:
            int r7 = r1.imageType
            r9 = 1
            if (r7 != r9) goto L_0x0297
            android.widget.RemoteViews r7 = new android.widget.RemoteViews
            r9 = 2131690938(0x7f0f05ba, float:1.9010934E38)
            r7.<init>(r5, r9)
            goto L_0x029f
        L_0x0297:
            android.widget.RemoteViews r7 = new android.widget.RemoteViews
            r9 = 2131690937(0x7f0f05b9, float:1.9010932E38)
            r7.<init>(r5, r9)
        L_0x029f:
            r5 = 2131170404(0x7f071464, float:1.7955165E38)
            java.lang.String r9 = r1.title
            r7.setTextViewText(r5, r9)
            r5 = 2131170286(0x7f0713ee, float:1.7954926E38)
            java.lang.String r9 = r1.text
            r7.setTextViewText(r5, r9)
            r5 = 2131170387(0x7f071453, float:1.795513E38)
            r7.setTextViewText(r5, r2)
            int r2 = r1.imageType
            boolean r2 = a((int) r2)
            r5 = 2131167184(0x7f0707d0, float:1.7948634E38)
            if (r2 == 0) goto L_0x02c6
            if (r6 == 0) goto L_0x02c6
            r7.setImageViewBitmap(r5, r6)
            goto L_0x02cb
        L_0x02c6:
            int r2 = com.ss.android.ugc.awemepushlib.R$drawable.icon
            r7.setImageViewResource(r5, r2)
        L_0x02cb:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 <= r8) goto L_0x02ea
            boolean r2 = com.bytedance.ies.uikit.util.IESUIUtils.isMaterialNotification(r27)     // Catch:{ Throwable -> 0x02e9 }
            if (r2 == 0) goto L_0x02ea
            r2 = 2131169611(0x7f07114b, float:1.7953557E38)
            java.lang.String r8 = "setBackgroundColor"
            android.content.res.Resources r9 = r27.getResources()     // Catch:{ Throwable -> 0x02e9 }
            r12 = 2131624821(0x7f0e0375, float:1.8876833E38)
            int r9 = r9.getColor(r12)     // Catch:{ Throwable -> 0x02e9 }
            r7.setInt(r2, r8, r9)     // Catch:{ Throwable -> 0x02e9 }
            goto L_0x02ea
        L_0x02e9:
        L_0x02ea:
            int r2 = r1.imageType
            r8 = 2
            if (r2 == r8) goto L_0x02fb
            r9 = 3
            if (r2 == r9) goto L_0x02fc
            r12 = 1
            if (r2 == r12) goto L_0x02fc
            r12 = 4
            if (r2 != r12) goto L_0x02f9
            goto L_0x02fc
        L_0x02f9:
            r2 = 0
            goto L_0x02fd
        L_0x02fb:
            r9 = 3
        L_0x02fc:
            r2 = 1
        L_0x02fd:
            if (r2 == 0) goto L_0x031f
            if (r6 == 0) goto L_0x031f
            int r2 = r6.getWidth()     // Catch:{ Exception -> 0x031f }
            int r12 = r6.getHeight()     // Catch:{ Exception -> 0x031f }
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x031f }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r12, r13)     // Catch:{ Exception -> 0x031f }
            android.graphics.Canvas r12 = new android.graphics.Canvas     // Catch:{ Exception -> 0x031f }
            r12.<init>(r2)     // Catch:{ Exception -> 0x031f }
            android.graphics.Matrix r13 = new android.graphics.Matrix     // Catch:{ Exception -> 0x031f }
            r13.<init>()     // Catch:{ Exception -> 0x031f }
            r12.drawBitmap(r6, r13, r10)     // Catch:{ Exception -> 0x031f }
            r7.setImageViewBitmap(r5, r2)     // Catch:{ Exception -> 0x031f }
        L_0x031f:
            r11.setCustomContentView(r7)
            goto L_0x0364
        L_0x0323:
            r8 = 2
            r9 = 3
            if (r2 == 0) goto L_0x034b
            int r5 = r1.imageType
            if (r5 == 0) goto L_0x034b
            int r5 = r29.getWidth()     // Catch:{ Exception -> 0x0347 }
            int r6 = r29.getHeight()     // Catch:{ Exception -> 0x0347 }
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0347 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7)     // Catch:{ Exception -> 0x0347 }
            android.graphics.Canvas r6 = new android.graphics.Canvas     // Catch:{ Exception -> 0x0347 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x0347 }
            android.graphics.Matrix r7 = new android.graphics.Matrix     // Catch:{ Exception -> 0x0347 }
            r7.<init>()     // Catch:{ Exception -> 0x0347 }
            r6.drawBitmap(r2, r7, r10)     // Catch:{ Exception -> 0x0347 }
            r2 = r5
        L_0x0347:
            r11.setLargeIcon(r2)
            goto L_0x0364
        L_0x034b:
            android.content.res.Resources r2 = r27.getResources()
            int r5 = com.ss.android.ugc.awemepushlib.R$drawable.icon
            android.graphics.drawable.Drawable r2 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r2, (int) r5)
            boolean r5 = r2 instanceof android.graphics.drawable.BitmapDrawable
            if (r5 == 0) goto L_0x0360
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r2 = r2.getBitmap()
            goto L_0x0361
        L_0x0360:
            r2 = r10
        L_0x0361:
            r11.setLargeIcon(r2)
        L_0x0364:
            if (r3 == 0) goto L_0x0369
            r11.setStyle(r3)
        L_0x0369:
            java.lang.String r2 = r1.soundUrl     // Catch:{ Exception -> 0x03f4 }
            android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x03f4 }
            boolean r2 = r1.sound     // Catch:{ Exception -> 0x03f4 }
            if (r2 != 0) goto L_0x0376
            boolean r2 = r1.useSound     // Catch:{ Exception -> 0x03f4 }
            if (r2 == 0) goto L_0x0398
        L_0x0376:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0392 }
            java.lang.String r3 = "android.resource://"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0392 }
            java.lang.String r3 = r27.getPackageName()     // Catch:{ Exception -> 0x0392 }
            r2.append(r3)     // Catch:{ Exception -> 0x0392 }
            java.lang.String r3 = "/2131951625"
            r2.append(r3)     // Catch:{ Exception -> 0x0392 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0392 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0392 }
            goto L_0x0393
        L_0x0392:
            r2 = r10
        L_0x0393:
            if (r2 == 0) goto L_0x039b
            r11.setSound(r2)     // Catch:{ Exception -> 0x03f4 }
        L_0x0398:
            r2 = 0
            r5 = 1
            goto L_0x03a0
        L_0x039b:
            r5 = 1
            r11.setDefaults(r5)     // Catch:{ Exception -> 0x03f4 }
            r2 = 1
        L_0x03a0:
            boolean r1 = r1.vibrator     // Catch:{ Exception -> 0x03f4 }
            if (r1 == 0) goto L_0x03c0
            java.lang.String r1 = "audio"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch:{ Throwable -> 0x03c0 }
            android.media.AudioManager r1 = (android.media.AudioManager) r1     // Catch:{ Throwable -> 0x03c0 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x03c0 }
            int r1 = r1.getRingerMode()     // Catch:{ Throwable -> 0x03c0 }
            switch(r1) {
                case 0: goto L_0x03c0;
                case 1: goto L_0x03b7;
                case 2: goto L_0x03b7;
                default: goto L_0x03b6;
            }     // Catch:{ Throwable -> 0x03c0 }
        L_0x03b6:
            goto L_0x03c0
        L_0x03b7:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x03c0 }
            if (r2 == 0) goto L_0x03bd
            r8 = 3
        L_0x03bd:
            r11.setDefaults(r8)     // Catch:{ Throwable -> 0x03c0 }
        L_0x03c0:
            com.ss.android.ugc.awemepushlib.manager.a r1 = com.ss.android.ugc.awemepushlib.manager.a.a()     // Catch:{ Exception -> 0x03f4 }
            int r1 = r1.w     // Catch:{ Exception -> 0x03f4 }
            if (r1 <= 0) goto L_0x03c9
            goto L_0x03ca
        L_0x03c9:
            r5 = 0
        L_0x03ca:
            if (r5 == 0) goto L_0x03e7
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x03f4 }
            java.lang.Class<com.ss.android.ugc.awemepushlib.os.receiver.NotificationBroadcastReceiver> r2 = com.ss.android.ugc.awemepushlib.os.receiver.NotificationBroadcastReceiver.class
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r2 = "notification_cancelled"
            r1.setAction(r2)     // Catch:{ Exception -> 0x03f4 }
            java.lang.String r2 = "contentIntentURI"
            r1.putExtra(r2, r4)     // Catch:{ Exception -> 0x03f4 }
            r2 = 0
            r3 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r0, r2, r1, r3)     // Catch:{ Exception -> 0x03f4 }
            r11.setDeleteIntent(r1)     // Catch:{ Exception -> 0x03f4 }
        L_0x03e7:
            r1 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r0, r1, r4, r1)     // Catch:{ Exception -> 0x03f4 }
            r11.setContentIntent(r0)     // Catch:{ Exception -> 0x03f4 }
            android.app.Notification r0 = r11.build()     // Catch:{ Exception -> 0x03f4 }
            return r0
        L_0x03f4:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "can not get launch intent: "
            r1.<init>(r2)
            r1.append(r0)
            com.bytedance.ies.e.a.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.c.a.a(android.content.Context, com.ss.android.ugc.awemepushlib.a.c, android.graphics.Bitmap, android.graphics.Bitmap, android.content.Intent, boolean):android.app.Notification");
    }
}
