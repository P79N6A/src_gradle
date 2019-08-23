package com.ss.android.ugc.awemepushlib.di;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.MultiProcessSharedProvider;
import com.ss.android.push.window.oppo.a;
import java.util.Map;
import org.json.JSONObject;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76983a;

    public final void a(Context context, Map<String, ?> map) {
        if (PatchProxy.isSupport(new Object[]{context, map}, this, f76983a, false, 90190, new Class[]{Context.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, map}, this, f76983a, false, 90190, new Class[]{Context.class, Map.class}, Void.TYPE);
            return;
        }
        try {
            MultiProcessSharedProvider.a a2 = MultiProcessSharedProvider.a(context);
            for (Map.Entry next : map.entrySet()) {
                Object value = next.getValue();
                if (value instanceof Integer) {
                    a2.a((String) next.getKey(), ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    a2.a((String) next.getKey(), ((Long) value).longValue());
                } else if (value instanceof Float) {
                    a2.a((String) next.getKey(), ((Float) value).floatValue());
                } else if (value instanceof Boolean) {
                    a2.a((String) next.getKey(), ((Boolean) value).booleanValue());
                } else if (value instanceof String) {
                    a2.a((String) next.getKey(), (String) value);
                }
            }
            a2.a();
        } catch (Throwable unused) {
        }
    }

    public final String a(Context context, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{context, str3, str4}, this, f76983a, false, 90189, new Class[]{Context.class, String.class, String.class}, String.class)) {
            return MultiProcessSharedProvider.b(context).a(str3, str4);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context, str3, str4}, this, f76983a, false, 90189, new Class[]{Context.class, String.class, String.class}, String.class);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:21|(1:23)|24|(1:26)(1:(1:28))|29|30|31|32|33|(1:35)|36) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x01e4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r23, com.ss.android.ugc.awemepushlib.a.c r24, int r25, java.util.HashMap r26) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            r13 = 1
            r5[r13] = r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r25)
            r14 = 2
            r5[r14] = r6
            r15 = 3
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f76983a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r10[r12] = r6
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r6 = com.ss.android.ugc.awemepushlib.a.c.class
            r10[r13] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r14] = r6
            java.lang.Class<java.util.HashMap> r6 = java.util.HashMap.class
            r10[r15] = r6
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r6 = 0
            r8 = 1
            r9 = 90192(0x16050, float:1.26386E-40)
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0076
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r5[r14] = r0
            r5[r15] = r3
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f76983a
            r19 = 1
            r20 = 90192(0x16050, float:1.26386E-40)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r12] = r1
            java.lang.Class<com.ss.android.ugc.awemepushlib.a.c> r1 = com.ss.android.ugc.awemepushlib.a.c.class
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r14] = r1
            java.lang.Class<java.util.HashMap> r1 = java.util.HashMap.class
            r0[r15] = r1
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r5
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0076:
            com.ss.android.push.window.oppo.c r4 = com.ss.android.push.window.oppo.c.a((android.content.Context) r23)
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x024c
            org.json.JSONObject r4 = r1.originData
            java.lang.String r5 = r1.title
            java.lang.String r6 = r1.text
            boolean r4 = com.ss.android.ugc.awemepushlib.c.a.a((org.json.JSONObject) r4, (java.lang.String) r5, (java.lang.String) r6)
            if (r4 == 0) goto L_0x024c
            com.ss.android.ugc.awemepushlib.a.c$a r4 = r1.extra
            int r4 = r4.floatWindow
            if (r4 != r13) goto L_0x024c
            com.ss.android.ugc.awemepushlib.interaction.k.a((com.ss.android.ugc.awemepushlib.a.c) r1, (boolean) r12, (int) r2)
            com.ss.android.push.window.oppo.c r4 = com.ss.android.push.window.oppo.c.a((android.content.Context) r23)
            org.json.JSONObject r5 = r1.originData
            java.lang.String r6 = r1.text
            int r7 = r1.id
            com.ss.android.ugc.awemepushlib.a.c$a r8 = r1.extra
            java.lang.String r8 = r8.toJsonString()
            com.ss.android.ugc.awemepushlib.di.c$1 r9 = new com.ss.android.ugc.awemepushlib.di.c$1
            r9.<init>(r0, r1, r2, r3)
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x024b
            boolean r0 = r4.o
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r5.toString()
            r4.a(r0, r2, r8)
            goto L_0x024b
        L_0x00bd:
            android.content.Context r0 = r4.f30445e     // Catch:{ Exception -> 0x0220 }
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x0220 }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ Exception -> 0x0220 }
            boolean r1 = r0.isScreenOn()     // Catch:{ Exception -> 0x0220 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0220 }
            r10 = 20
            if (r3 < r10) goto L_0x00d5
            boolean r1 = r0.isInteractive()     // Catch:{ Exception -> 0x0220 }
        L_0x00d5:
            if (r1 != 0) goto L_0x00e0
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0220 }
            r4.a(r0, r2, r8)     // Catch:{ Exception -> 0x0220 }
            goto L_0x024b
        L_0x00e0:
            android.view.View r0 = r4.f30444d     // Catch:{ Exception -> 0x0220 }
            if (r0 != 0) goto L_0x00f4
            android.content.Context r0 = r4.f30445e     // Catch:{ Exception -> 0x0220 }
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)     // Catch:{ Exception -> 0x0220 }
            r1 = 2131690897(0x7f0f0591, float:1.901085E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)     // Catch:{ Exception -> 0x0220 }
            r4.f30444d = r0     // Catch:{ Exception -> 0x0220 }
        L_0x00f4:
            android.view.View r0 = r4.f30444d     // Catch:{ Exception -> 0x0220 }
            r1 = 2131168421(0x7f070ca5, float:1.7951143E38)
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x0220 }
            android.view.View r1 = r4.f30444d     // Catch:{ Exception -> 0x0220 }
            r2 = 2131169622(0x7f071156, float:1.795358E38)
            android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x0220 }
            com.ss.android.push.window.oppo.PushWindowScrollView r1 = (com.ss.android.push.window.oppo.PushWindowScrollView) r1     // Catch:{ Exception -> 0x0220 }
            android.view.View r2 = r4.f30444d     // Catch:{ Exception -> 0x0220 }
            r3 = 2131170434(0x7f071482, float:1.7955226E38)
            android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x0220 }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ Exception -> 0x0220 }
            android.view.View r3 = r4.f30444d     // Catch:{ Exception -> 0x0220 }
            r5 = 2131166156(0x7f0703cc, float:1.794655E38)
            android.view.View r3 = r3.findViewById(r5)     // Catch:{ Exception -> 0x0220 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ Exception -> 0x0220 }
            android.view.View r5 = r4.f30444d     // Catch:{ Exception -> 0x0220 }
            r8 = 2131170397(0x7f07145d, float:1.7955151E38)
            android.view.View r5 = r5.findViewById(r8)     // Catch:{ Exception -> 0x0220 }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0220 }
            android.view.View r8 = r4.f30444d     // Catch:{ Exception -> 0x0220 }
            r10 = 2131167195(0x7f0707db, float:1.7948657E38)
            android.view.View r8 = r8.findViewById(r10)     // Catch:{ Exception -> 0x0220 }
            android.widget.ImageView r8 = (android.widget.ImageView) r8     // Catch:{ Exception -> 0x0220 }
            android.content.Context r10 = r4.f30445e     // Catch:{ Exception -> 0x0220 }
            r11 = 2131558447(0x7f0d002f, float:1.874221E38)
            java.lang.String r10 = r10.getString(r11)     // Catch:{ Exception -> 0x0220 }
            r2.setText(r10)     // Catch:{ Exception -> 0x0220 }
            r3.setText(r6)     // Catch:{ Exception -> 0x0220 }
            r2 = 2130840575(0x7f020bff, float:1.7286193E38)
            r8.setImageResource(r2)     // Catch:{ Exception -> 0x0220 }
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0220 }
            java.lang.String r3 = "HH:mm"
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0220 }
            r2.<init>(r3, r6)     // Catch:{ Exception -> 0x0220 }
            java.util.Date r3 = new java.util.Date     // Catch:{ Exception -> 0x0220 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0220 }
            r3.<init>(r10)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r2 = r2.format(r3)     // Catch:{ Exception -> 0x0220 }
            r5.setText(r2)     // Catch:{ Exception -> 0x0220 }
            android.view.WindowManager$LayoutParams r2 = new android.view.WindowManager$LayoutParams     // Catch:{ Exception -> 0x0220 }
            r2.<init>()     // Catch:{ Exception -> 0x0220 }
            r4.f30443c = r2     // Catch:{ Exception -> 0x0220 }
            android.view.WindowManager$LayoutParams r2 = r4.f30443c     // Catch:{ Exception -> 0x0220 }
            r3 = -2
            r2.height = r3     // Catch:{ Exception -> 0x0220 }
            android.view.WindowManager$LayoutParams r2 = r4.f30443c     // Catch:{ Exception -> 0x0220 }
            r3 = -1
            r2.width = r3     // Catch:{ Exception -> 0x0220 }
            android.view.WindowManager$LayoutParams r2 = r4.f30443c     // Catch:{ Exception -> 0x0220 }
            r3 = -3
            r2.format = r3     // Catch:{ Exception -> 0x0220 }
            android.view.WindowManager$LayoutParams r2 = r4.f30443c     // Catch:{ Exception -> 0x0220 }
            r3 = 16973828(0x1030004, float:2.406091E-38)
            r2.windowAnimations = r3     // Catch:{ Exception -> 0x0220 }
            android.view.WindowManager$LayoutParams r2 = r4.f30443c     // Catch:{ Exception -> 0x0220 }
            int r3 = r4.i     // Catch:{ Exception -> 0x0220 }
            r2.type = r3     // Catch:{ Exception -> 0x0220 }
            android.view.WindowManager$LayoutParams r2 = r4.f30443c     // Catch:{ Exception -> 0x0220 }
            int r3 = r4.j     // Catch:{ Exception -> 0x0220 }
            r2.flags = r3     // Catch:{ Exception -> 0x0220 }
            android.view.WindowManager$LayoutParams r2 = r4.f30443c     // Catch:{ Exception -> 0x0220 }
            java.lang.String r3 = "Toast"
            r2.setTitle(r3)     // Catch:{ Exception -> 0x0220 }
            android.view.WindowManager$LayoutParams r2 = r4.f30443c     // Catch:{ Exception -> 0x0220 }
            r3 = 49
            r2.gravity = r3     // Catch:{ Exception -> 0x0220 }
            r4.r = r12     // Catch:{ Exception -> 0x0220 }
            com.ss.android.push.window.oppo.c$2 r2 = new com.ss.android.push.window.oppo.c$2     // Catch:{ Exception -> 0x0220 }
            r2.<init>()     // Catch:{ Exception -> 0x0220 }
            r1.setOnScrollListener(r2)     // Catch:{ Exception -> 0x0220 }
            android.view.GestureDetector r1 = new android.view.GestureDetector     // Catch:{ Exception -> 0x0220 }
            android.content.Context r2 = r4.f30445e     // Catch:{ Exception -> 0x0220 }
            com.ss.android.push.window.oppo.c$3 r3 = new com.ss.android.push.window.oppo.c$3     // Catch:{ Exception -> 0x0220 }
            r3.<init>(r7, r12, r9)     // Catch:{ Exception -> 0x0220 }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0220 }
            com.ss.android.push.window.oppo.c$4 r2 = new com.ss.android.push.window.oppo.c$4     // Catch:{ Exception -> 0x0220 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0220 }
            r0.setOnTouchListener(r2)     // Catch:{ Exception -> 0x0220 }
            android.content.Context r0 = r4.f30445e     // Catch:{ Exception -> 0x0220 }
            com.ss.android.push.window.oppo.d r0 = com.ss.android.push.window.oppo.d.a(r0)     // Catch:{ Exception -> 0x0220 }
            android.content.Context r1 = r0.f30461a     // Catch:{ Exception -> 0x0220 }
            com.ss.android.push.window.oppo.c r1 = com.ss.android.push.window.oppo.c.a((android.content.Context) r1)     // Catch:{ Exception -> 0x0220 }
            boolean r1 = r1.m     // Catch:{ Exception -> 0x0220 }
            if (r1 != 0) goto L_0x01ce
            com.ss.android.push.window.oppo.b<java.lang.Integer, com.ss.android.push.window.oppo.d$a> r0 = r0.f30462b     // Catch:{ Exception -> 0x0220 }
            r0.a()     // Catch:{ Exception -> 0x0220 }
            goto L_0x01dc
        L_0x01ce:
            if (r7 <= 0) goto L_0x01dc
            com.ss.android.push.window.oppo.b<java.lang.Integer, com.ss.android.push.window.oppo.d$a> r1 = r0.f30462b     // Catch:{ Exception -> 0x0220 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0220 }
            r1.a(r2)     // Catch:{ Exception -> 0x0220 }
            r0.a()     // Catch:{ Exception -> 0x0220 }
        L_0x01dc:
            android.view.WindowManager r0 = r4.f30442b     // Catch:{ Exception -> 0x01e4 }
            android.view.View r1 = r4.f30444d     // Catch:{ Exception -> 0x01e4 }
            r0.removeView(r1)     // Catch:{ Exception -> 0x01e4 }
            goto L_0x01e7
        L_0x01e4:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0220 }
        L_0x01e7:
            android.view.View r0 = r4.f30444d     // Catch:{ Exception -> 0x0220 }
            r1 = 0
            r0.setTranslationY(r1)     // Catch:{ Exception -> 0x0220 }
            android.view.WindowManager r0 = r4.f30442b     // Catch:{ Exception -> 0x0220 }
            android.view.View r1 = r4.f30444d     // Catch:{ Exception -> 0x0220 }
            android.view.WindowManager$LayoutParams r2 = r4.f30443c     // Catch:{ Exception -> 0x0220 }
            r0.addView(r1, r2)     // Catch:{ Exception -> 0x0220 }
            r4.o = r13     // Catch:{ Exception -> 0x0220 }
            android.os.Handler r0 = r4.f30446f     // Catch:{ Exception -> 0x0220 }
            java.lang.Runnable r1 = r4.s     // Catch:{ Exception -> 0x0220 }
            r0.removeCallbacks(r1)     // Catch:{ Exception -> 0x0220 }
            boolean r0 = r4.n     // Catch:{ Exception -> 0x0220 }
            if (r0 == 0) goto L_0x020d
            android.os.Handler r0 = r4.f30446f     // Catch:{ Exception -> 0x0220 }
            java.lang.Runnable r1 = r4.s     // Catch:{ Exception -> 0x0220 }
            int r2 = r4.k     // Catch:{ Exception -> 0x0220 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x0220 }
            r0.postDelayed(r1, r2)     // Catch:{ Exception -> 0x0220 }
        L_0x020d:
            android.content.Context r14 = r4.f30445e     // Catch:{ Exception -> 0x0220 }
            java.lang.String r15 = "pop_window_show"
            long r0 = (long) r7     // Catch:{ Exception -> 0x0220 }
            r18 = -1
            r20 = 0
            org.json.JSONObject[] r2 = new org.json.JSONObject[r12]     // Catch:{ Exception -> 0x0220 }
            r16 = r0
            r21 = r2
            com.ss.android.push.window.oppo.c.a(r14, r15, r16, r18, r20, r21)     // Catch:{ Exception -> 0x0220 }
            goto L_0x024b
        L_0x0220:
            r0 = move-exception
            r4.o = r12
            com.bytedance.common.utility.Logger.debug()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x024b }
            r1.<init>()     // Catch:{ JSONException -> 0x024b }
            java.lang.String r2 = "error"
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x024b }
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x024b }
            android.content.Context r14 = r4.f30445e     // Catch:{ JSONException -> 0x024b }
            java.lang.String r15 = "pop_window_show_fail"
            long r2 = (long) r7     // Catch:{ JSONException -> 0x024b }
            r18 = -1
            r20 = 0
            org.json.JSONObject[] r0 = new org.json.JSONObject[r13]     // Catch:{ JSONException -> 0x024b }
            r0[r12] = r1     // Catch:{ JSONException -> 0x024b }
            r16 = r2
            r21 = r0
            com.ss.android.push.window.oppo.c.a(r14, r15, r16, r18, r20, r21)     // Catch:{ JSONException -> 0x024b }
            r4.b()     // Catch:{ JSONException -> 0x024b }
        L_0x024b:
            return r13
        L_0x024c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.di.c.a(android.content.Context, com.ss.android.ugc.awemepushlib.a.c, int, java.util.HashMap):boolean");
    }

    public final void a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4), jSONObject}, this, f76983a, false, 90191, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4), jSONObject}, this, f76983a, false, 90191, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        AppLog.onEvent(context, str, str2, str3, j, j2, jSONObject);
    }
}
