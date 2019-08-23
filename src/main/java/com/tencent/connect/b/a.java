package com.tencent.connect.b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.view.View;
import android.webkit.CookieSyncManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import com.tencent.open.a.f;
import com.tencent.open.d.e;
import com.tencent.open.d.g;
import com.tencent.open.d.h;
import com.tencent.open.web.security.JniInterface;
import com.tencent.tauth.d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends com.tencent.connect.common.a {

    /* renamed from: a  reason: collision with root package name */
    public static String f79562a = "libwbsafeedit";

    /* renamed from: b  reason: collision with root package name */
    public static String f79563b;

    /* renamed from: c  reason: collision with root package name */
    com.tencent.tauth.b f79564c;
    private String j;
    /* access modifiers changed from: private */
    public WeakReference<Activity> k;

    /* renamed from: com.tencent.connect.b.a$a  reason: collision with other inner class name */
    class C0850a implements com.tencent.tauth.b {

        /* renamed from: a  reason: collision with root package name */
        com.tencent.tauth.b f79570a;

        /* renamed from: c  reason: collision with root package name */
        private final String f79572c = "sendinstall";

        /* renamed from: d  reason: collision with root package name */
        private final String f79573d = "installwording";

        /* renamed from: e  reason: collision with root package name */
        private final String f79574e = "http://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";

        /* renamed from: com.tencent.connect.b.a$a$a  reason: collision with other inner class name */
        abstract class C0851a implements View.OnClickListener {

            /* renamed from: d  reason: collision with root package name */
            Dialog f79584d;

            C0851a(Dialog dialog) {
                this.f79584d = dialog;
            }
        }

        public final void h() {
            if (this.f79570a != null) {
                this.f79570a.h();
            }
        }

        public final void a(d dVar) {
            if (this.f79570a != null) {
                this.f79570a.a(dVar);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0245  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                if (r1 == 0) goto L_0x024b
                r2 = r1
                org.json.JSONObject r2 = (org.json.JSONObject) r2
                if (r2 == 0) goto L_0x024b
                java.lang.String r3 = ""
                r4 = 1
                r5 = 0
                java.lang.String r6 = "sendinstall"
                int r6 = r2.getInt(r6)     // Catch:{ JSONException -> 0x0021 }
                if (r6 != r4) goto L_0x0019
                r6 = 1
                goto L_0x001a
            L_0x0019:
                r6 = 0
            L_0x001a:
                java.lang.String r7 = "installwording"
                java.lang.String r2 = r2.getString(r7)     // Catch:{ JSONException -> 0x0022 }
                goto L_0x002a
            L_0x0021:
                r6 = 0
            L_0x0022:
                java.lang.String r2 = "openSDK_LOG.AuthAgent"
                java.lang.String r7 = "FeedConfirmListener onComplete There is no value for sendinstall."
                com.tencent.open.a.f.d(r2, r7)
                r2 = r3
            L_0x002a:
                java.lang.String r2 = java.net.URLDecoder.decode(r2)
                java.lang.String r3 = "openSDK_LOG.AuthAgent"
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r8 = " WORDING = "
                r7.<init>(r8)
                r7.append(r2)
                java.lang.String r8 = "xx"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.open.a.f.a(r3, r7)
                if (r6 == 0) goto L_0x023f
                boolean r3 = android.text.TextUtils.isEmpty(r2)
                if (r3 != 0) goto L_0x023f
                com.tencent.tauth.b r3 = r0.f79570a
                com.tencent.connect.b.a r6 = com.tencent.connect.b.a.this
                java.lang.ref.WeakReference r6 = r6.k
                if (r6 == 0) goto L_0x023d
                com.tencent.connect.b.a r6 = com.tencent.connect.b.a.this
                java.lang.ref.WeakReference r6 = r6.k
                java.lang.Object r6 = r6.get()
                android.app.Activity r6 = (android.app.Activity) r6
                if (r6 == 0) goto L_0x023d
                android.app.Dialog r7 = new android.app.Dialog
                r7.<init>(r6)
                r7.requestWindowFeature(r4)
                android.content.pm.PackageManager r8 = r6.getPackageManager()
                r9 = 0
                java.lang.String r10 = r6.getPackageName()     // Catch:{ NameNotFoundException -> 0x007c }
                android.content.pm.PackageInfo r10 = r8.getPackageInfo(r10, r5)     // Catch:{ NameNotFoundException -> 0x007c }
                goto L_0x007d
            L_0x007c:
                r10 = r9
            L_0x007d:
                if (r10 == 0) goto L_0x0085
                android.content.pm.ApplicationInfo r9 = r10.applicationInfo
                android.graphics.drawable.Drawable r9 = r9.loadIcon(r8)
            L_0x0085:
                com.tencent.connect.b.a$a$1 r8 = new com.tencent.connect.b.a$a$1
                r8.<init>(r7, r3, r1)
                com.tencent.connect.b.a$a$2 r10 = new com.tencent.connect.b.a$a$2
                r10.<init>(r7, r3, r1)
                android.graphics.drawable.ColorDrawable r11 = new android.graphics.drawable.ColorDrawable
                r11.<init>()
                r11.setAlpha(r5)
                android.view.Window r12 = r7.getWindow()
                r12.setBackgroundDrawable(r11)
                android.util.DisplayMetrics r11 = new android.util.DisplayMetrics
                r11.<init>()
                java.lang.String r12 = "window"
                java.lang.Object r12 = r6.getSystemService(r12)
                android.view.WindowManager r12 = (android.view.WindowManager) r12
                android.view.Display r12 = r12.getDefaultDisplay()
                r12.getMetrics(r11)
                float r11 = r11.density
                android.widget.RelativeLayout r12 = new android.widget.RelativeLayout
                r12.<init>(r6)
                android.widget.ImageView r13 = new android.widget.ImageView
                r13.<init>(r6)
                r13.setImageDrawable(r9)
                android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.FIT_XY
                r13.setScaleType(r9)
                r13.setId(r4)
                r9 = 1114636288(0x42700000, float:60.0)
                float r9 = r9 * r11
                int r9 = (int) r9
                r14 = 1096810496(0x41600000, float:14.0)
                float r15 = r11 * r14
                int r15 = (int) r15
                r16 = 1099956224(0x41900000, float:18.0)
                float r4 = r11 * r16
                int r4 = (int) r4
                r16 = 1086324736(0x40c00000, float:6.0)
                float r14 = r11 * r16
                int r14 = (int) r14
                android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
                r5.<init>(r9, r9)
                r9 = 9
                r5.addRule(r9)
                r9 = 0
                r5.setMargins(r9, r4, r14, r4)
                r12.addView(r13, r5)
                android.widget.TextView r4 = new android.widget.TextView
                r4.<init>(r6)
                r4.setText(r2)
                r2 = 1096810496(0x41600000, float:14.0)
                r4.setTextSize(r2)
                r2 = 3
                r4.setGravity(r2)
                r4.setIncludeFontPadding(r9)
                r4.setPadding(r9, r9, r9, r9)
                r5 = 2
                r4.setLines(r5)
                r9 = 5
                r4.setId(r9)
                r13 = 1127809024(0x43390000, float:185.0)
                float r13 = r13 * r11
                int r13 = (int) r13
                r4.setMinWidth(r13)
                android.widget.RelativeLayout$LayoutParams r13 = new android.widget.RelativeLayout$LayoutParams
                r14 = -2
                r13.<init>(r14, r14)
                r9 = 1
                r13.addRule(r9, r9)
                r5 = 6
                r13.addRule(r5, r9)
                r5 = 1084227584(0x40a00000, float:5.0)
                float r5 = r5 * r11
                int r9 = (int) r5
                r14 = 0
                r13.setMargins(r14, r14, r9, r14)
                r12.addView(r4, r13)
                android.view.View r4 = new android.view.View
                r4.<init>(r6)
                r9 = 214(0xd6, float:3.0E-43)
                int r9 = android.graphics.Color.rgb(r9, r9, r9)
                r4.setBackgroundColor(r9)
                r4.setId(r2)
                android.widget.RelativeLayout$LayoutParams r9 = new android.widget.RelativeLayout$LayoutParams
                r13 = -2
                r14 = 2
                r9.<init>(r13, r14)
                r13 = 1
                r9.addRule(r2, r13)
                r14 = 5
                r9.addRule(r14, r13)
                r13 = 7
                r9.addRule(r13, r14)
                r16 = 1094713344(0x41400000, float:12.0)
                float r2 = r11 * r16
                int r2 = (int) r2
                r13 = 0
                r9.setMargins(r13, r13, r13, r2)
                r12.addView(r4, r9)
                android.widget.LinearLayout r4 = new android.widget.LinearLayout
                r4.<init>(r6)
                android.widget.RelativeLayout$LayoutParams r9 = new android.widget.RelativeLayout$LayoutParams
                r13 = -2
                r9.<init>(r13, r13)
                r13 = 1
                r9.addRule(r14, r13)
                r13 = 7
                r9.addRule(r13, r14)
                r13 = 3
                r9.addRule(r13, r13)
                android.widget.Button r13 = new android.widget.Button
                r13.<init>(r6)
                java.lang.String r14 = "跳过"
                r13.setText(r14)
                java.lang.String r14 = "buttonNegt.png"
                android.graphics.drawable.Drawable r14 = a(r14, r6)
                r13.setBackgroundDrawable(r14)
                r14 = 36
                r0 = 97
                r1 = 131(0x83, float:1.84E-43)
                int r0 = android.graphics.Color.rgb(r14, r0, r1)
                r13.setTextColor(r0)
                r0 = 1101004800(0x41a00000, float:20.0)
                r13.setTextSize(r0)
                r13.setOnClickListener(r10)
                r1 = 4
                r13.setId(r1)
                android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
                r10 = 1110704128(0x42340000, float:45.0)
                float r10 = r10 * r11
                int r10 = (int) r10
                r14 = 0
                r1.<init>(r14, r10)
                r1.rightMargin = r15
                r14 = 1082130432(0x40800000, float:4.0)
                float r14 = r14 * r11
                int r14 = (int) r14
                r1.leftMargin = r14
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.weight = r0
                r4.addView(r13, r1)
                android.widget.Button r1 = new android.widget.Button
                r1.<init>(r6)
                java.lang.String r13 = "确定"
                r1.setText(r13)
                r13 = 1101004800(0x41a00000, float:20.0)
                r1.setTextSize(r13)
                r13 = 255(0xff, float:3.57E-43)
                int r13 = android.graphics.Color.rgb(r13, r13, r13)
                r1.setTextColor(r13)
                java.lang.String r13 = "buttonPost.png"
                android.graphics.drawable.Drawable r13 = a(r13, r6)
                r1.setBackgroundDrawable(r13)
                r1.setOnClickListener(r8)
                android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
                r13 = 0
                r8.<init>(r13, r10)
                r8.weight = r0
                r8.rightMargin = r14
                r4.addView(r1, r8)
                r12.addView(r4, r9)
                r0 = 1133215744(0x438b8000, float:279.0)
                float r0 = r0 * r11
                int r0 = (int) r0
                r1 = 1126367232(0x43230000, float:163.0)
                float r11 = r11 * r1
                int r1 = (int) r11
                android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
                r4.<init>(r0, r1)
                r0 = 0
                r12.setPadding(r15, r0, r2, r2)
                r12.setLayoutParams(r4)
                r0 = 251(0xfb, float:3.52E-43)
                r1 = 247(0xf7, float:3.46E-43)
                int r2 = android.graphics.Color.rgb(r1, r0, r1)
                r12.setBackgroundColor(r2)
                android.graphics.drawable.PaintDrawable r2 = new android.graphics.drawable.PaintDrawable
                int r0 = android.graphics.Color.rgb(r1, r0, r1)
                r2.<init>(r0)
                r2.setCornerRadius(r5)
                r12.setBackgroundDrawable(r2)
                r7.setContentView(r12)
                com.tencent.connect.b.a$a$3 r0 = new com.tencent.connect.b.a$a$3
                r1 = r17
                r2 = r18
                r0.<init>(r3, r2)
                r7.setOnCancelListener(r0)
                if (r6 == 0) goto L_0x023e
                boolean r0 = r6.isFinishing()
                if (r0 != 0) goto L_0x023e
                r7.show()
                goto L_0x023e
            L_0x023d:
                r1 = r0
            L_0x023e:
                return
            L_0x023f:
                r2 = r1
                r1 = r0
                com.tencent.tauth.b r0 = r1.f79570a
                if (r0 == 0) goto L_0x024c
                com.tencent.tauth.b r0 = r1.f79570a
                r0.a((java.lang.Object) r2)
                goto L_0x024c
            L_0x024b:
                r1 = r0
            L_0x024c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.connect.b.a.C0850a.a(java.lang.Object):void");
        }

        public C0850a(com.tencent.tauth.b bVar) {
            this.f79570a = bVar;
        }

        private static Drawable a(String str, Context context) {
            Drawable drawable;
            Bitmap bitmap;
            try {
                InputStream open = context.getApplicationContext().getAssets().open(str);
                if (open == null) {
                    return null;
                }
                if (str.endsWith(".9.png")) {
                    try {
                        bitmap = BitmapFactory.decodeStream(open);
                    } catch (OutOfMemoryError unused) {
                        bitmap = null;
                    }
                    if (bitmap == null) {
                        return null;
                    }
                    byte[] ninePatchChunk = bitmap.getNinePatchChunk();
                    NinePatch.isNinePatchChunk(ninePatchChunk);
                    drawable = new NinePatchDrawable(bitmap, ninePatchChunk, new Rect(), null);
                } else {
                    drawable = Drawable.createFromStream(open, str);
                    try {
                        open.close();
                    } catch (IOException unused2) {
                    }
                }
                return drawable;
            } catch (IOException unused3) {
                drawable = null;
            }
        }
    }

    class b implements com.tencent.tauth.b {

        /* renamed from: b  reason: collision with root package name */
        private final com.tencent.tauth.b f79587b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f79588c = true;

        /* renamed from: d  reason: collision with root package name */
        private final Context f79589d;

        public final void h() {
            f.b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onCancel");
            this.f79587b.h();
            f.a();
        }

        public final void a(d dVar) {
            f.b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onError");
            this.f79587b.a(dVar);
            f.a();
        }

        public final void a(Object obj) {
            f.b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete");
            JSONObject jSONObject = (JSONObject) obj;
            try {
                String string = jSONObject.getString("access_token");
                String string2 = jSONObject.getString("expires_in");
                String string3 = jSONObject.getString("openid");
                if (!(string == null || a.this.f79632e == null || string3 == null)) {
                    a.this.f79632e.a(string, string2);
                    a.this.f79632e.f79592c = string3;
                    Context context = this.f79589d;
                    d d2 = a.this.f79632e;
                    if (com.tencent.connect.a.a.g) {
                        com.tencent.connect.a.a.a(context, d2);
                        if (d2.f79592c != null) {
                            try {
                                com.tencent.connect.a.a.f79558c.invoke(com.tencent.connect.a.a.f79557b, new Object[]{context, d2.f79592c});
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                String string4 = jSONObject.getString("pf");
                if (string4 != null) {
                    try {
                        c.a(this.f79589d, "pfStore", 0).edit().putString("pf", string4).commit();
                    } catch (Exception e2) {
                        f.b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e2);
                    }
                }
                if (this.f79588c) {
                    CookieSyncManager.getInstance().sync();
                }
            } catch (JSONException e3) {
                f.b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e3);
            }
            this.f79587b.a((Object) jSONObject);
            a.this.f79564c = null;
            f.a();
        }

        public b(Context context, com.tencent.tauth.b bVar, boolean z) {
            this.f79589d = context;
            this.f79587b = bVar;
            f.b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener()");
        }
    }

    static {
        f79563b = f79562a + ".so";
        String str = Build.CPU_ABI;
        if (str == null || str.equals("")) {
            f79562a = "libwbsafeedit";
            f79563b = f79562a + ".so";
            f.c("openSDK_LOG.AuthAgent", "is arm(default) architecture");
        } else if (str.equalsIgnoreCase("arm64-v8a")) {
            f79562a = "libwbsafeedit_64";
            f79563b = f79562a + ".so";
            f.c("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
        } else if (str.equalsIgnoreCase("x86")) {
            f79562a = "libwbsafeedit_x86";
            f79563b = f79562a + ".so";
            f.c("openSDK_LOG.AuthAgent", "is x86 architecture");
        } else if (str.equalsIgnoreCase("x86_64")) {
            f79562a = "libwbsafeedit_x86_64";
            f79563b = f79562a + ".so";
            f.c("openSDK_LOG.AuthAgent", "is x86_64 architecture");
        } else {
            f79562a = "libwbsafeedit";
            f79563b = f79562a + ".so";
            f.c("openSDK_LOG.AuthAgent", "is arm(default) architecture");
        }
    }

    public a(d dVar) {
        super(dVar);
    }

    private int a(boolean z, com.tencent.tauth.b bVar) {
        f.c("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- start");
        CookieSyncManager.createInstance(com.tencent.open.d.c.a());
        Bundle a2 = a();
        if (z) {
            a2.putString("isadd", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
        a2.putString("scope", this.j);
        a2.putString("client_id", this.f79632e.f79590a);
        if (i) {
            a2.putString("pf", "desktop_m_qq-" + g + "-android" + "-" + f79630f + "-" + h);
        } else {
            a2.putString("pf", "openmobile_android");
        }
        String str = (System.currentTimeMillis() / 1000);
        a2.putString("sign", com.tencent.open.d.f.b(com.tencent.open.d.c.a(), str));
        a2.putString("time", str);
        a2.putString("display", "mobile");
        a2.putString("response_type", "token");
        a2.putString("redirect_uri", "auth://tauth.qq.com/");
        a2.putString("cancel_display", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        a2.putString("switch", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        a2.putString("status_userip", h.a());
        final String str2 = e.a().a(com.tencent.open.d.c.a(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + com.tencent.open.d.a.a(a2);
        final b bVar2 = new b(com.tencent.open.d.c.a(), bVar, true);
        f.b("openSDK_LOG.AuthAgent", "OpenUi, showDialog TDialog");
        g.a(new Runnable() {
            public final void run() {
                com.tencent.open.d.f.a(a.f79562a, a.f79563b, 3);
                if (!JniInterface.f79767a) {
                    try {
                        Context a2 = com.tencent.open.d.c.a();
                        if (a2 != null) {
                            if (new File(a2.getFilesDir().toString() + "/" + a.f79563b).exists()) {
                                System.load(a2.getFilesDir().toString() + "/" + a.f79563b);
                                JniInterface.f79767a = true;
                                StringBuilder sb = new StringBuilder("-->load lib success:");
                                sb.append(a.f79563b);
                                f.c("openSDK_LOG.JniInterface", sb.toString());
                            } else {
                                f.c("openSDK_LOG.JniInterface", "-->fail, because so is not exists:" + a.f79563b);
                            }
                        } else {
                            f.c("openSDK_LOG.JniInterface", "-->load lib fail, because context is null:" + a.f79563b);
                        }
                    } catch (Throwable th) {
                        f.b("openSDK_LOG.JniInterface", "-->load lib error:" + a.f79563b, th);
                    }
                }
                if (a.this.k != null) {
                    final Activity activity = (Activity) a.this.k.get();
                    if (activity != null) {
                        activity.runOnUiThread(new Runnable() {
                            public final void run() {
                                if (JniInterface.f79767a) {
                                    e eVar = new e(activity, "action_login", str2, bVar2, a.this.f79632e);
                                    if (!activity.isFinishing()) {
                                        eVar.show();
                                    }
                                    return;
                                }
                                f.d("openSDK_LOG.AuthAgent", "OpenUi, secure so load failed, goto download QQ.");
                                com.tencent.open.a aVar = new com.tencent.open.a(activity, "", a.this.a(""), null, a.this.f79632e);
                                if (!activity.isFinishing()) {
                                    aVar.show();
                                }
                            }
                        });
                    }
                }
            }
        });
        f.c("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- end");
        return 2;
    }

    public final int a(Activity activity, String str, com.tencent.tauth.b bVar) {
        return a(activity, str, bVar, false, null);
    }

    private boolean a(Activity activity, Fragment fragment, boolean z) {
        f.c("openSDK_LOG.AuthAgent", "startActionActivity() -- start");
        Intent b2 = b("com.tencent.open.agent.AgentActivity");
        if (b2 != null) {
            Bundle a2 = a();
            if (z) {
                a2.putString("isadd", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            a2.putString("scope", this.j);
            a2.putString("client_id", this.f79632e.f79590a);
            if (i) {
                a2.putString("pf", "desktop_m_qq-" + g + "-android" + "-" + f79630f + "-" + h);
            } else {
                a2.putString("pf", "openmobile_android");
            }
            a2.putString("need_pay", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            a2.putString("oauth_app_name", com.tencent.open.d.f.a(com.tencent.open.d.c.a()));
            b2.putExtra("key_action", "action_login");
            b2.putExtra("key_params", a2);
            b2.putExtra("appid", this.f79632e.f79590a);
            if (a(b2)) {
                this.f79564c = new C0850a(this.f79564c);
                com.tencent.connect.common.b.a().a(11101, this.f79564c);
                if (fragment != null) {
                    f.b("openSDK_LOG.AuthAgent", "startAssitActivity fragment");
                    a(fragment, b2, 11101);
                } else {
                    f.b("openSDK_LOG.AuthAgent", "startAssitActivity activity");
                    a(activity, b2, 11101);
                }
                f.c("openSDK_LOG.AuthAgent", "startActionActivity() -- end, found activity for loginIntent");
                com.tencent.open.b.d.a();
                com.tencent.open.b.d.a(0, "LOGIN_CHECK_SDK", "1000", this.f79632e.f79590a, "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
                return true;
            }
        }
        com.tencent.open.b.d.a();
        com.tencent.open.b.d.a(1, "LOGIN_CHECK_SDK", "1000", this.f79632e.f79590a, "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "startActionActivity fail");
        f.c("openSDK_LOG.AuthAgent", "startActionActivity() -- end, no target activity for loginIntent");
        return false;
    }

    public final int a(Activity activity, String str, com.tencent.tauth.b bVar, boolean z, Fragment fragment) {
        this.j = str;
        this.k = new WeakReference<>(activity);
        this.f79564c = bVar;
        if (com.tencent.open.d.d.a(activity, this.f79632e.f79590a).b("C_LoginWeb") || !a(activity, fragment, false)) {
            com.tencent.open.b.d.a();
            com.tencent.open.b.d.a(this.f79632e.f79592c, this.f79632e.f79590a, PushConstants.PUSH_TYPE_UPLOAD_LOG, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "5", PushConstants.PUSH_TYPE_THROUGH_MESSAGE, PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY);
            f.d("openSDK_LOG.AuthAgent", "doLogin startActivity fail show dialog.");
            this.f79564c = new C0850a(this.f79564c);
            return a(false, this.f79564c);
        }
        f.c("openSDK_LOG.AuthAgent", "OpenUi, showUi, return Constants.UI_ACTIVITY");
        com.tencent.open.b.d.a();
        com.tencent.open.b.d.a(this.f79632e.f79592c, this.f79632e.f79590a, PushConstants.PUSH_TYPE_UPLOAD_LOG, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "5", PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY);
        return 1;
    }
}
