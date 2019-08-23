package com.umeng.message.inapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.inapp.UImageLoadTask;
import com.umeng.message.proguard.j;
import java.util.Calendar;

public class UmengSplashMessageActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f81215a = "com.umeng.message.inapp.UmengSplashMessageActivity";
    private static int s = 2000;
    /* access modifiers changed from: private */
    public static int t = 1000;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Activity f81216b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public UImageLoadTask f81217c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ImageView f81218d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public ImageView f81219e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public TextView f81220f;
    /* access modifiers changed from: private */
    public boolean g = true;
    private boolean h = true;
    /* access modifiers changed from: private */
    public a i;
    /* access modifiers changed from: private */
    public a j;
    /* access modifiers changed from: private */
    public UInAppMessage k;
    /* access modifiers changed from: private */
    public UInAppHandler l;
    /* access modifiers changed from: private */
    public boolean m;
    /* access modifiers changed from: private */
    public boolean n;
    /* access modifiers changed from: private */
    public boolean o;
    private boolean p;
    /* access modifiers changed from: private */
    public long q;
    /* access modifiers changed from: private */
    public long r;
    /* access modifiers changed from: private */
    public UImageLoadTask.ImageLoaderCallback u = new UImageLoadTask.ImageLoaderCallback() {
        public void onLoadImage(Bitmap[] bitmapArr) {
            if (!UmengSplashMessageActivity.this.e()) {
                if (UmengSplashMessageActivity.this.i != null) {
                    UmengSplashMessageActivity.this.i.a();
                    a unused = UmengSplashMessageActivity.this.i = null;
                }
                try {
                    if (bitmapArr.length == 1) {
                        UmengSplashMessageActivity.this.f81218d.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                boolean unused = UmengSplashMessageActivity.this.m = true;
                                if (!TextUtils.equals("none", UmengSplashMessageActivity.this.k.action_type)) {
                                    long unused2 = UmengSplashMessageActivity.this.r = UmengSplashMessageActivity.this.r + (SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.q);
                                    d.a((Context) UmengSplashMessageActivity.this.f81216b).a(UmengSplashMessageActivity.this.k.msg_id, UmengSplashMessageActivity.this.k.msg_type, 1, 1, 0, 0, 0, (int) UmengSplashMessageActivity.this.r, 0);
                                    UmengSplashMessageActivity.this.f();
                                    UmengSplashMessageActivity.this.l.handleInAppMessage(UmengSplashMessageActivity.this.f81216b, UmengSplashMessageActivity.this.k, 16);
                                    UmengSplashMessageActivity.this.finish();
                                }
                            }
                        });
                        UmengSplashMessageActivity.this.f81219e.setVisibility(8);
                        UmengSplashMessageActivity.this.f81218d.setImageBitmap(bitmapArr[0]);
                        UmengSplashMessageActivity.this.a((View) UmengSplashMessageActivity.this.f81218d);
                    }
                    if (bitmapArr.length == 2) {
                        UmengSplashMessageActivity.this.f81218d.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                boolean unused = UmengSplashMessageActivity.this.n = true;
                                if (!TextUtils.equals("none", UmengSplashMessageActivity.this.k.action_type)) {
                                    long unused2 = UmengSplashMessageActivity.this.r = UmengSplashMessageActivity.this.r + (SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.q);
                                    d.a((Context) UmengSplashMessageActivity.this.f81216b).a(UmengSplashMessageActivity.this.k.msg_id, UmengSplashMessageActivity.this.k.msg_type, 1, 0, 1, UmengSplashMessageActivity.this.a(UmengSplashMessageActivity.this.o), 0, (int) UmengSplashMessageActivity.this.r, 0);
                                    UmengSplashMessageActivity.this.f();
                                    UmengSplashMessageActivity.this.l.handleInAppMessage(UmengSplashMessageActivity.this.f81216b, UmengSplashMessageActivity.this.k, 16);
                                    UmengSplashMessageActivity.this.finish();
                                }
                            }
                        });
                        UmengSplashMessageActivity.this.f81219e.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                boolean unused = UmengSplashMessageActivity.this.o = true;
                                if (!TextUtils.equals("none", UmengSplashMessageActivity.this.k.bottom_action_type)) {
                                    long unused2 = UmengSplashMessageActivity.this.r = UmengSplashMessageActivity.this.r + (SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.q);
                                    d.a((Context) UmengSplashMessageActivity.this.f81216b).a(UmengSplashMessageActivity.this.k.msg_id, UmengSplashMessageActivity.this.k.msg_type, 1, 0, UmengSplashMessageActivity.this.a(UmengSplashMessageActivity.this.n), 1, 0, (int) UmengSplashMessageActivity.this.r, 0);
                                    UmengSplashMessageActivity.this.f();
                                    UmengSplashMessageActivity.this.l.handleInAppMessage(UmengSplashMessageActivity.this.f81216b, UmengSplashMessageActivity.this.k, 17);
                                    UmengSplashMessageActivity.this.finish();
                                }
                            }
                        });
                        UmengSplashMessageActivity.this.f81218d.setImageBitmap(bitmapArr[0]);
                        UmengSplashMessageActivity.this.f81219e.setImageBitmap(bitmapArr[1]);
                        UmengSplashMessageActivity.this.a((View) UmengSplashMessageActivity.this.f81218d);
                        UmengSplashMessageActivity.this.a((View) UmengSplashMessageActivity.this.f81219e);
                    }
                    long unused2 = UmengSplashMessageActivity.this.q = SystemClock.elapsedRealtime();
                    if (!UmengSplashMessageActivity.this.k.display_button) {
                        UmengSplashMessageActivity.this.f81220f.setVisibility(8);
                    } else {
                        UmengSplashMessageActivity.this.f81220f.setVisibility(0);
                        UmengSplashMessageActivity.this.f81220f.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                long unused = UmengSplashMessageActivity.this.r = UmengSplashMessageActivity.this.r + (SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.q);
                                d.a((Context) UmengSplashMessageActivity.this.f81216b).a(UmengSplashMessageActivity.this.k.msg_id, UmengSplashMessageActivity.this.k.msg_type, 1, UmengSplashMessageActivity.this.a(UmengSplashMessageActivity.this.m), UmengSplashMessageActivity.this.a(UmengSplashMessageActivity.this.n), UmengSplashMessageActivity.this.a(UmengSplashMessageActivity.this.o), 1, (int) UmengSplashMessageActivity.this.r, 0);
                                UmengSplashMessageActivity.this.f();
                                UmengSplashMessageActivity.this.finish();
                            }
                        });
                    }
                    InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f81216b).a(UmengSplashMessageActivity.this.k);
                    InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f81216b).a(UmengSplashMessageActivity.this.k.msg_id, 1);
                    InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f81216b).h();
                    boolean unused3 = UmengSplashMessageActivity.this.g = false;
                    UmengSplashMessageActivity umengSplashMessageActivity = UmengSplashMessageActivity.this;
                    a aVar = new a((long) (UmengSplashMessageActivity.this.k.display_time * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), (long) UmengSplashMessageActivity.t);
                    a unused4 = umengSplashMessageActivity.j = aVar;
                    UmengSplashMessageActivity.this.j.b();
                } catch (Exception unused5) {
                }
            }
        }
    };
    private IUmengInAppMessageCallback v = new IUmengInAppMessageCallback() {
        public void onCardMessage(UInAppMessage uInAppMessage) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0022 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSplashMessage(com.umeng.message.entity.UInAppMessage r7) {
            /*
                r6 = this;
                com.umeng.message.inapp.UmengSplashMessageActivity r0 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                android.app.Activity r0 = r0.f81216b
                com.umeng.message.inapp.InAppMessageManager r0 = com.umeng.message.inapp.InAppMessageManager.getInstance(r0)
                java.lang.String r0 = r0.e()
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L_0x001f
                com.umeng.message.entity.UInAppMessage r1 = new com.umeng.message.entity.UInAppMessage     // Catch:{ JSONException -> 0x001f }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001f }
                r2.<init>(r0)     // Catch:{ JSONException -> 0x001f }
                r1.<init>(r2)     // Catch:{ JSONException -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r1 = 0
            L_0x0020:
                if (r7 == 0) goto L_0x0052
                if (r1 == 0) goto L_0x004c
                java.lang.String r0 = r7.msg_id
                java.lang.String r2 = r1.msg_id
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x004c
                java.io.File r0 = new java.io.File
                com.umeng.message.inapp.UmengSplashMessageActivity r2 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                android.app.Activity r2 = r2.f81216b
                java.lang.String r1 = r1.msg_id
                java.lang.String r1 = com.umeng.message.proguard.h.d(r2, r1)
                r0.<init>(r1)
                com.umeng.message.inapp.UmengSplashMessageActivity r1 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                android.app.Activity r1 = r1.f81216b
                com.umeng.message.inapp.InAppMessageManager r1 = com.umeng.message.inapp.InAppMessageManager.getInstance(r1)
                r1.a((java.io.File) r0)
            L_0x004c:
                com.umeng.message.inapp.UmengSplashMessageActivity r0 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.entity.UInAppMessage unused = r0.k = r7
                goto L_0x0059
            L_0x0052:
                if (r1 == 0) goto L_0x015f
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.entity.UInAppMessage unused = r7.k = r1
            L_0x0059:
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.entity.UInAppMessage r7 = r7.k
                int r7 = r7.show_type
                r0 = 0
                r1 = 1
                if (r7 != r1) goto L_0x0082
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                boolean r7 = r7.g()
                if (r7 != 0) goto L_0x0082
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                android.app.Activity r7 = r7.f81216b
                com.umeng.message.inapp.InAppMessageManager r7 = com.umeng.message.inapp.InAppMessageManager.getInstance(r7)
                com.umeng.message.inapp.UmengSplashMessageActivity r2 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.entity.UInAppMessage r2 = r2.k
                java.lang.String r2 = r2.msg_id
                r7.a((java.lang.String) r2, (int) r0)
            L_0x0082:
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                android.app.Activity r7 = r7.f81216b
                com.umeng.message.inapp.InAppMessageManager r7 = com.umeng.message.inapp.InAppMessageManager.getInstance(r7)
                com.umeng.message.inapp.UmengSplashMessageActivity r2 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.entity.UInAppMessage r2 = r2.k
                boolean r7 = r7.b((com.umeng.message.entity.UInAppMessage) r2)
                if (r7 == 0) goto L_0x015e
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                android.app.Activity r7 = r7.f81216b
                com.umeng.message.inapp.InAppMessageManager r7 = com.umeng.message.inapp.InAppMessageManager.getInstance(r7)
                com.umeng.message.inapp.UmengSplashMessageActivity r2 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.entity.UInAppMessage r2 = r2.k
                boolean r7 = r7.c((com.umeng.message.entity.UInAppMessage) r2)
                if (r7 != 0) goto L_0x00b0
                goto L_0x015e
            L_0x00b0:
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.entity.UInAppMessage r7 = r7.k
                int r7 = r7.msg_type
                r2 = 2
                if (r7 != 0) goto L_0x0102
                java.lang.String r7 = com.umeng.message.inapp.UmengSplashMessageActivity.f81215a
                java.lang.String[] r3 = new java.lang.String[r1]
                java.lang.String r4 = "SPLASH_A"
                r3[r0] = r4
                com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r7, (int) r2, (java.lang.String[]) r3)
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.inapp.UImageLoadTask r3 = new com.umeng.message.inapp.UImageLoadTask
                com.umeng.message.inapp.UmengSplashMessageActivity r4 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                android.app.Activity r4 = r4.f81216b
                com.umeng.message.inapp.UmengSplashMessageActivity r5 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.entity.UInAppMessage r5 = r5.k
                r3.<init>(r4, r5)
                com.umeng.message.inapp.UImageLoadTask unused = r7.f81217c = r3
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.inapp.UImageLoadTask r7 = r7.f81217c
                com.umeng.message.inapp.UmengSplashMessageActivity r3 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.inapp.UImageLoadTask$ImageLoaderCallback r3 = r3.u
                r7.a((com.umeng.message.inapp.UImageLoadTask.ImageLoaderCallback) r3)
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.inapp.UImageLoadTask r7 = r7.f81217c
                java.lang.String[] r3 = new java.lang.String[r1]
                com.umeng.message.inapp.UmengSplashMessageActivity r4 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.entity.UInAppMessage r4 = r4.k
                java.lang.String r4 = r4.image_url
                r3[r0] = r4
                r7.execute(r3)
            L_0x0102:
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.entity.UInAppMessage r7 = r7.k
                int r7 = r7.msg_type
                if (r7 != r1) goto L_0x015d
                java.lang.String r7 = com.umeng.message.inapp.UmengSplashMessageActivity.f81215a
                java.lang.String[] r3 = new java.lang.String[r1]
                java.lang.String r4 = "SPLASH_B"
                r3[r0] = r4
                com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r7, (int) r2, (java.lang.String[]) r3)
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.inapp.UImageLoadTask r3 = new com.umeng.message.inapp.UImageLoadTask
                com.umeng.message.inapp.UmengSplashMessageActivity r4 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                android.app.Activity r4 = r4.f81216b
                com.umeng.message.inapp.UmengSplashMessageActivity r5 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.entity.UInAppMessage r5 = r5.k
                r3.<init>(r4, r5)
                com.umeng.message.inapp.UImageLoadTask unused = r7.f81217c = r3
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.inapp.UImageLoadTask r7 = r7.f81217c
                com.umeng.message.inapp.UmengSplashMessageActivity r3 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.inapp.UImageLoadTask$ImageLoaderCallback r3 = r3.u
                r7.a((com.umeng.message.inapp.UImageLoadTask.ImageLoaderCallback) r3)
                com.umeng.message.inapp.UmengSplashMessageActivity r7 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.inapp.UImageLoadTask r7 = r7.f81217c
                java.lang.String[] r2 = new java.lang.String[r2]
                com.umeng.message.inapp.UmengSplashMessageActivity r3 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.entity.UInAppMessage r3 = r3.k
                java.lang.String r3 = r3.image_url
                r2[r0] = r3
                com.umeng.message.inapp.UmengSplashMessageActivity r0 = com.umeng.message.inapp.UmengSplashMessageActivity.this
                com.umeng.message.entity.UInAppMessage r0 = r0.k
                java.lang.String r0 = r0.bottom_image_url
                r2[r1] = r0
                r7.execute(r2)
            L_0x015d:
                return
            L_0x015e:
                return
            L_0x015f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.inapp.UmengSplashMessageActivity.AnonymousClass2.onSplashMessage(com.umeng.message.entity.UInAppMessage):void");
        }
    };

    class a extends c {
        public void e() {
            if (!UmengSplashMessageActivity.this.e() || !UmengSplashMessageActivity.this.g) {
                if (!UmengSplashMessageActivity.this.g) {
                    d.a((Context) UmengSplashMessageActivity.this.f81216b).a(UmengSplashMessageActivity.this.k.msg_id, UmengSplashMessageActivity.this.k.msg_type, 1, UmengSplashMessageActivity.this.a(UmengSplashMessageActivity.this.m), UmengSplashMessageActivity.this.a(UmengSplashMessageActivity.this.n), UmengSplashMessageActivity.this.a(UmengSplashMessageActivity.this.o), 0, UmengSplashMessageActivity.this.k.display_time * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, 0);
                }
                UmengSplashMessageActivity.this.f();
                UmengSplashMessageActivity.this.finish();
            }
        }

        public void a(long j) {
            if (!UmengSplashMessageActivity.this.g) {
                UmengSplashMessageActivity.this.f81220f.setVisibility(0);
                TextView m = UmengSplashMessageActivity.this.f81220f;
                StringBuilder sb = new StringBuilder();
                double d2 = (double) j;
                Double.isNaN(d2);
                double a2 = (double) UmengSplashMessageActivity.t;
                Double.isNaN(a2);
                sb.append((int) Math.ceil((d2 * 1.0d) / a2));
                sb.append(" ");
                sb.append(UmengSplashMessageActivity.this.k.display_name);
                m.setText(sb.toString());
            }
        }

        a(long j, long j2) {
            super(j, j2);
        }
    }

    /* access modifiers changed from: private */
    public int a(boolean z) {
        return z ? 1 : 0;
    }

    public final void onBackPressed() {
    }

    public boolean onCustomPretreatment() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: private */
    public synchronized boolean e() {
        boolean z;
        z = this.p;
        this.p = true;
        return z;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.i != null) {
            this.i.d();
        }
        if (this.j != null) {
            this.q = SystemClock.elapsedRealtime();
            this.j.d();
        }
    }

    private void d() {
        if (InAppMessageManager.f81176a) {
            d.a((Context) this).a(this.v);
        } else if (System.currentTimeMillis() - InAppMessageManager.getInstance(this.f81216b).d() > ((long) InAppMessageManager.f81177b)) {
            d.a((Context) this).a(this.v);
        } else {
            this.v.onSplashMessage(null);
        }
    }

    /* access modifiers changed from: private */
    public synchronized void f() {
        if (this.h) {
            this.h = false;
            Intent intent = new Intent();
            intent.setClassName(this.f81216b, InAppMessageManager.getInstance(this).a());
            intent.setFlags(536870912);
            this.f81216b.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    public boolean g() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(InAppMessageManager.getInstance(this.f81216b).i());
        Calendar instance2 = Calendar.getInstance();
        if (instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (this.i != null) {
            this.i.a();
        }
        if (this.j != null) {
            this.j.a();
        }
        if (this.f81217c != null) {
            this.f81217c.a((UImageLoadTask.ImageLoaderCallback) null);
        }
        this.p = false;
        this.m = false;
        this.n = false;
        this.o = false;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (this.i != null) {
            this.i.c();
        }
        if (this.j != null) {
            this.r += SystemClock.elapsedRealtime() - this.q;
            this.j.c();
        }
    }

    private View c() {
        FrameLayout frameLayout = new FrameLayout(this.f81216b);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this.f81216b);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 13.0f);
        this.f81218d = new ImageView(this.f81216b);
        this.f81218d.setLayoutParams(layoutParams);
        this.f81218d.setScaleType(ImageView.ScaleType.FIT_XY);
        linearLayout.addView(this.f81218d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0, 3.0f);
        this.f81219e = new ImageView(this.f81216b);
        this.f81219e.setLayoutParams(layoutParams2);
        this.f81219e.setScaleType(ImageView.ScaleType.FIT_XY);
        linearLayout.addView(this.f81219e);
        frameLayout.addView(linearLayout);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 5;
        layoutParams3.rightMargin = j.a(this.f81216b, 30.0f);
        layoutParams3.topMargin = j.a(this.f81216b, 20.0f);
        this.f81220f = new TextView(this.f81216b);
        this.f81220f.setLayoutParams(layoutParams3);
        int a2 = j.a(this.f81216b, 6.0f);
        int i2 = a2 / 3;
        this.f81220f.setPadding(a2, i2, a2, i2);
        this.f81220f.setTextSize(14.0f);
        this.f81220f.setBackgroundColor(Color.parseColor("#80000000"));
        this.f81220f.setTextColor(-1);
        this.f81220f.setVisibility(8);
        frameLayout.addView(this.f81220f);
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f81216b = this;
        if ((getIntent().getFlags() & 4194304) > 0) {
            finish();
        } else if (!onCustomPretreatment()) {
            setRequestedOrientation(1);
            setContentView(c());
            d();
            this.l = InAppMessageManager.getInstance(this.f81216b).getInAppHandler();
            a aVar = new a((long) s, (long) t);
            this.i = aVar;
            this.i.b();
        }
    }

    /* access modifiers changed from: private */
    public void a(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
        alphaAnimation.setDuration(500);
        view.startAnimation(alphaAnimation);
    }

    public final void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }
}
