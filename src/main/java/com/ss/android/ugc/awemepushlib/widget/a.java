package com.ss.android.ugc.awemepushlib.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.awemepushlib.a.c;
import com.ss.android.ugc.awemepushlib.interaction.k;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
public final class a extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77096a;

    /* renamed from: b  reason: collision with root package name */
    final ViewDragHelper f77097b;

    /* renamed from: c  reason: collision with root package name */
    final ViewConfiguration f77098c;

    /* renamed from: d  reason: collision with root package name */
    View f77099d;

    /* renamed from: e  reason: collision with root package name */
    final Handler f77100e;

    /* renamed from: f  reason: collision with root package name */
    final int f77101f;
    final int g;
    final long h;
    final boolean i;
    final ImageView j;
    final boolean k;
    int l;
    JSONObject m;
    final Runnable n;
    final Runnable o;
    C0804a p;
    private boolean q;
    private final Intent r;
    private final c s;
    private float t;
    private float u;
    private b v;

    /* renamed from: com.ss.android.ugc.awemepushlib.widget.a$a  reason: collision with other inner class name */
    public interface C0804a {
        void a();
    }

    final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f77109a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f77109a, false, 90447, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f77109a, false, 90447, new Class[0], Void.TYPE);
                return;
            }
            if (!a.this.i || !a.this.k) {
                a.this.performClick();
            } else {
                ViewGroup.LayoutParams layoutParams = a.this.getLayoutParams();
                if (layoutParams instanceof WindowManager.LayoutParams) {
                    try {
                        ((WindowManager.LayoutParams) layoutParams).flags = SearchJediMixFeedAdapter.f42517f;
                        ((WindowManager) a.this.getContext().getSystemService("window")).updateViewLayout(a.this, layoutParams);
                        a.this.f77100e.post(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f77111a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f77111a, false, 90448, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f77111a, false, 90448, new Class[0], Void.TYPE);
                                    return;
                                }
                                a.this.performClick();
                            }
                        });
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        private b() {
        }

        /* synthetic */ b(a aVar, byte b2) {
            this();
        }
    }

    public final void computeScroll() {
        if (PatchProxy.isSupport(new Object[0], this, f77096a, false, 90431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77096a, false, 90431, new Class[0], Void.TYPE);
            return;
        }
        if (this.f77097b.continueSettling(true)) {
            postInvalidate();
        }
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f77096a, false, 90436, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77096a, false, 90436, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (this.q) {
            this.f77100e.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f77103a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f77103a, false, 90444, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f77103a, false, 90444, new Class[0], Void.TYPE);
                        return;
                    }
                    a.this.f77099d.setTranslationY((float) (-a.this.f77099d.getHeight()));
                    a.this.f77099d.animate().translationY(0.0f).setInterpolator(new OvershootInterpolator()).setDuration(300).start();
                    a.this.f77100e.postDelayed(a.this.n, a.this.h);
                    k.a(a.this.getContext(), "news_notify_anim_push_show", (long) a.this.f77101f, (long) a.this.g, a.this.m);
                }
            });
            this.q = false;
        }
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f77096a, false, 90437, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77096a, false, 90437, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f77097b.abort();
        } catch (Throwable unused) {
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f77096a, false, 90439, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77096a, false, 90439, new Class[0], Void.TYPE);
            return;
        }
        this.f77099d.animate().translationY((float) (-this.f77099d.getHeight())).setDuration(300).start();
        this.f77100e.postDelayed(this.o, 300);
    }

    public final void setDismissListener(C0804a aVar) {
        this.p = aVar;
    }

    private static String b(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, f77096a, true, 90434, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, f77096a, true, 90434, new Class[]{Integer.TYPE}, String.class);
        } else if (i3 > 9) {
            return String.valueOf(i2);
        } else {
            return PushConstants.PUSH_TYPE_NOTIFY + i3;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f77096a, false, 90432, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f77096a, false, 90432, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f77096a, false, 90438, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f77096a, false, 90438, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        getContext().startActivity(this.r);
        a(this.f77101f);
        this.f77100e.removeCallbacks(this.n);
        a();
        k.a(getContext(), "news_notify_anim_push_click", (long) this.f77101f, (long) this.g, this.m);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (!PatchProxy.isSupport(new Object[]{motionEvent2}, this, f77096a, false, 90433, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return this.f77097b.shouldInterceptTouchEvent(motionEvent2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f77096a, false, 90433, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f77096a, false, 90440, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f77096a, false, 90440, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        NotificationManagerCompat.from(getContext()).cancel("app_notify_ame", i2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f77096a, false, 90435, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f77096a, false, 90435, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        this.f77100e.removeCallbacks(this.n);
        this.f77097b.processTouchEvent(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (MotionEventCompat.getActionMasked(motionEvent)) {
            case 0:
                this.t = x;
                this.u = y;
                this.v = new b(this, (byte) 0);
                break;
            case 1:
                if (Math.abs(x - this.t) >= ((float) this.f77098c.getScaledTouchSlop()) || Math.abs(y - this.u) >= ((float) this.f77098c.getScaledTouchSlop())) {
                    this.v = null;
                } else if (this.v != null) {
                    this.v.run();
                }
                this.v = null;
                break;
            case 2:
                if (Math.abs(x - this.t) >= ((float) this.f77098c.getScaledTouchSlop()) || Math.abs(y - this.u) >= ((float) this.f77098c.getScaledTouchSlop())) {
                    this.v = null;
                    break;
                }
            case 3:
                this.v = null;
                break;
        }
        return true;
    }

    @SuppressLint({"SetTextI18n"})
    public a(Context context, int i2, @NonNull c cVar, Bitmap bitmap, @NonNull Intent intent, long j2, int i3) {
        this(context, i2, cVar, bitmap, intent, j2, true, i3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01a1  */
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r5, int r6, @android.support.annotation.NonNull com.ss.android.ugc.awemepushlib.a.c r7, android.graphics.Bitmap r8, @android.support.annotation.NonNull android.content.Intent r9, long r10, boolean r12, int r13) {
        /*
            r4 = this;
            r4.<init>(r5)
            r0 = 1
            r4.q = r0
            com.bytedance.common.utility.collection.WeakHandler r1 = new com.bytedance.common.utility.collection.WeakHandler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            com.ss.android.ugc.awemepushlib.widget.a$1 r3 = new com.ss.android.ugc.awemepushlib.widget.a$1
            r3.<init>()
            r1.<init>(r2, r3)
            r4.f77100e = r1
            com.ss.android.ugc.awemepushlib.widget.a$3 r1 = new com.ss.android.ugc.awemepushlib.widget.a$3
            r1.<init>()
            r4.n = r1
            com.ss.android.ugc.awemepushlib.widget.a$4 r1 = new com.ss.android.ugc.awemepushlib.widget.a$4
            r1.<init>()
            r4.o = r1
            r4.r = r9
            r4.g = r6
            r4.s = r7
            r4.l = r13
            int r6 = r7.id
            r4.f77101f = r6
            r1 = 0
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 > 0) goto L_0x0038
            r10 = 5000(0x1388, double:2.4703E-320)
        L_0x0038:
            r4.h = r10
            java.lang.String r6 = "oppo"
            java.lang.String r10 = android.os.Build.BRAND
            boolean r6 = r6.equalsIgnoreCase(r10)
            r4.i = r6
            r4.k = r12
            r6 = 0
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Throwable -> 0x006f }
            r10.<init>()     // Catch:{ Throwable -> 0x006f }
            r4.m = r10     // Catch:{ Throwable -> 0x006f }
            org.json.JSONObject r10 = r4.m     // Catch:{ Throwable -> 0x006f }
            java.lang.String r11 = "isWindowMode"
            r10.put(r11, r12)     // Catch:{ Throwable -> 0x006f }
            org.json.JSONObject r10 = r4.m     // Catch:{ Throwable -> 0x006f }
            java.lang.String r11 = "with_pic"
            java.lang.String r12 = "message_with_pic"
            boolean r12 = r9.getBooleanExtra(r12, r6)     // Catch:{ Throwable -> 0x006f }
            r10.put(r11, r12)     // Catch:{ Throwable -> 0x006f }
            org.json.JSONObject r10 = r4.m     // Catch:{ Throwable -> 0x006f }
            java.lang.String r11 = "download_pic"
            java.lang.String r12 = "message_download_pic"
            boolean r9 = r9.getBooleanExtra(r12, r6)     // Catch:{ Throwable -> 0x006f }
            r10.put(r11, r9)     // Catch:{ Throwable -> 0x006f }
        L_0x006f:
            java.lang.String r9 = r7.title
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L_0x007e
            r9 = 2131558447(0x7f0d002f, float:1.874221E38)
            java.lang.String r9 = r5.getString(r9)
        L_0x007e:
            boolean r10 = r4.i
            r11 = 2131170387(0x7f071453, float:1.795513E38)
            r12 = 2131166313(0x7f070469, float:1.7946868E38)
            r13 = 2131170404(0x7f071464, float:1.7955165E38)
            if (r10 == 0) goto L_0x00dd
            com.ss.android.ugc.awemepushlib.manager.a r10 = com.ss.android.ugc.awemepushlib.manager.a.a()
            int r10 = r10.v
            if (r10 <= 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r0 = 0
        L_0x0095:
            if (r0 != 0) goto L_0x00dd
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r5)
            r0 = 2131690942(0x7f0f05be, float:1.9010942E38)
            android.view.View r6 = r10.inflate(r0, r4, r6)
            r4.f77099d = r6
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.lang.String r10 = "HH:mm"
            java.util.Locale r0 = java.util.Locale.getDefault()
            r6.<init>(r10, r0)
            android.view.View r10 = r4.f77099d
            android.view.View r10 = r10.findViewById(r11)
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.util.Date r11 = new java.util.Date
            r11.<init>()
            java.lang.String r6 = r6.format(r11)
            r10.setText(r6)
            android.view.View r6 = r4.f77099d
            android.view.View r6 = r6.findViewById(r13)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setText(r9)
            android.view.View r6 = r4.f77099d
            android.view.View r6 = r6.findViewById(r12)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r7 = r7.text
            r6.setText(r7)
            goto L_0x0189
        L_0x00dd:
            int r10 = r4.l
            r0 = 21
            r1 = 11
            if (r10 == r1) goto L_0x00e9
            int r10 = r4.l
            if (r10 != r0) goto L_0x0164
        L_0x00e9:
            if (r8 == 0) goto L_0x0164
            boolean r10 = r7.functionalPush
            if (r10 != 0) goto L_0x0164
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r5)
            int r2 = r4.l
            if (r2 != r1) goto L_0x00ff
            r2 = 2131690973(0x7f0f05dd, float:1.9011005E38)
            goto L_0x0102
        L_0x00ff:
            r2 = 2131690975(0x7f0f05df, float:1.9011009E38)
        L_0x0102:
            android.view.View r6 = r12.inflate(r2, r4, r6)
            r4.f77099d = r6
            int r6 = r4.l
            if (r6 != r0) goto L_0x0117
            android.view.View r6 = r4.f77099d
            android.view.View r6 = r6.findViewById(r13)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setText(r9)
        L_0x0117:
            android.view.View r6 = r4.f77099d
            android.view.View r6 = r6.findViewById(r11)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r12 = r10.get(r1)
            java.lang.String r12 = b(r12)
            r11.append(r12)
            java.lang.String r12 = ":"
            r11.append(r12)
            r12 = 12
            int r10 = r10.get(r12)
            java.lang.String r10 = b(r10)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r6.setText(r10)
            android.view.View r6 = r4.f77099d
            r10 = 2131171157(0x7f071755, float:1.7956693E38)
            android.view.View r6 = r6.findViewById(r10)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r7 = r7.text
            r6.setText(r7)
            android.view.View r6 = r4.f77099d
            android.view.View r6 = r6.findViewById(r13)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setText(r9)
            goto L_0x0189
        L_0x0164:
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r5)
            r11 = 2131690925(0x7f0f05ad, float:1.9010907E38)
            android.view.View r6 = r10.inflate(r11, r4, r6)
            r4.f77099d = r6
            android.view.View r6 = r4.f77099d
            android.view.View r6 = r6.findViewById(r13)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setText(r9)
            android.view.View r6 = r4.f77099d
            android.view.View r6 = r6.findViewById(r12)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r7 = r7.text
            r6.setText(r7)
        L_0x0189:
            android.view.View r6 = r4.f77099d
            r4.addView(r6)
            r6 = 2131167240(0x7f070808, float:1.7948748E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r4.j = r6
            if (r8 == 0) goto L_0x01a1
            android.widget.ImageView r6 = r4.j
            r6.setImageBitmap(r8)
            goto L_0x01b0
        L_0x01a1:
            android.widget.ImageView r6 = r4.j
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r6.setScaleType(r7)
            android.widget.ImageView r6 = r4.j
            r7 = 2130840577(0x7f020c01, float:1.7286197E38)
            r6.setImageResource(r7)
        L_0x01b0:
            com.ss.android.ugc.awemepushlib.widget.AnimatablePushView$2 r6 = new com.ss.android.ugc.awemepushlib.widget.AnimatablePushView$2
            r6.<init>(r4)
            android.support.v4.widget.ViewDragHelper r6 = android.support.v4.widget.ViewDragHelper.create(r4, r6)
            r4.f77097b = r6
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            r4.f77098c = r5
            r4.setOnClickListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.widget.a.<init>(android.content.Context, int, com.ss.android.ugc.awemepushlib.a.c, android.graphics.Bitmap, android.content.Intent, long, boolean, int):void");
    }
}
