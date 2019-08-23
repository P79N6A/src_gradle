package com.ss.android.ad.splash.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.splash.core.c.c;
import com.ss.android.ad.splash.core.c.j;
import com.ss.android.ad.splash.core.video.b;
import com.ss.android.ad.splash.core.video.f;
import com.ss.android.ad.splash.core.video.g;
import com.ss.android.ad.splash.core.video2.BDASplashVideoView;
import com.ss.android.ad.splash.core.video2.a;
import com.ss.android.ad.splash.core.video2.d;
import com.ss.android.ad.splash.core.video2.e;
import com.ss.android.ad.splash.utils.f;
import com.ss.android.ad.splash.utils.h;
import com.ss.android.ad.splash.utils.k;
import com.ss.android.ad.splash.utils.l;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends RelativeLayout implements l.a {
    private long A = 0;
    private Space B;
    private TextView C;
    private TextView D;
    private Timer E;

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ad.splash.core.c.b f27538a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f27539b;

    /* renamed from: c  reason: collision with root package name */
    Space f27540c;

    /* renamed from: d  reason: collision with root package name */
    ViewGroup f27541d;

    /* renamed from: e  reason: collision with root package name */
    TextView f27542e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f27543f;
    RotateAnimation g;
    ViewGroup h;
    FrameLayout i;
    View j;
    TextView k;
    public g l;
    public l m;
    public l n = new l(this);
    boolean o = false;
    long p = 0;
    public boolean q = false;
    FrameLayout r;
    TextView s;
    BDASplashVideoView t;
    public e u;
    public int v = -1;
    int w = -1;
    boolean x = false;
    private BDASplashImageView y;
    private TextView z;

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    public final boolean performClick() {
        return super.performClick();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        k.a().f27703a = System.currentTimeMillis();
        this.m.c();
    }

    public final void b() {
        if (this.o) {
            this.n.sendEmptyMessageDelayed(1, this.p);
            a();
        }
    }

    private void f() {
        if (this.y != null && e.L() == 1) {
            this.y.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        layoutParams.setMargins(0, (int) k.a(getContext(), 14.0f), (int) k.a(getContext(), 9.0f), 0);
        this.z.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e.M()) {
            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                public final boolean onPreDraw() {
                    b.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    b.this.b();
                    b.this.m.c(b.this.f27538a);
                    return true;
                }
            });
        }
        if (this.x && this.E == null) {
            this.E = new Timer();
            this.E.schedule(new TimerTask() {
                public final void run() {
                    Message obtainMessage = b.this.n.obtainMessage();
                    obtainMessage.what = 2;
                    b.this.n.sendMessage(obtainMessage);
                }
            }, 1000, 1000);
        }
    }

    private void e() {
        if (this.l != null) {
            this.l.d();
            this.l = null;
        }
        if (this.g != null) {
            this.g.cancel();
            this.g = null;
        }
        if (this.y != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) this.y.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    this.y.setImageBitmap(null);
                }
            } catch (Exception unused) {
            }
        }
        d.a().b();
        if (this.u != null) {
            this.u.e();
            this.u = null;
            this.t = null;
        }
        if (this.E != null) {
            this.E.cancel();
            this.E = null;
        }
    }

    private void c() {
        if (k.c(getContext())) {
            findViewById(C0906R.id.ct4).setVisibility(0);
        }
        try {
            this.y = (BDASplashImageView) findViewById(C0906R.id.ctf);
            try {
                this.t = (BDASplashVideoView) findViewById(C0906R.id.cte);
                this.f27540c = (Space) findViewById(C0906R.id.jm);
                this.z = (TextView) findViewById(C0906R.id.cv);
                this.j = findViewById(C0906R.id.ct9);
                this.k = (TextView) findViewById(C0906R.id.cta);
                this.f27541d = (ViewGroup) findViewById(C0906R.id.c8);
                this.f27542e = (TextView) findViewById(C0906R.id.cu);
                this.f27539b = (ImageView) findViewById(C0906R.id.cy);
                this.r = (FrameLayout) findViewById(C0906R.id.ba);
                this.s = (TextView) findViewById(C0906R.id.bb);
                this.B = (Space) findViewById(C0906R.id.b_);
                this.C = (TextView) findViewById(C0906R.id.bd);
                this.D = (TextView) findViewById(C0906R.id.bc);
                if (e.o() != 0) {
                    this.f27539b.setImageResource(e.o());
                }
                if (e.k() != 0) {
                    this.z.setText(e.k());
                    this.C.setText(e.k());
                } else {
                    this.z.setText(C0906R.string.c__);
                    this.C.setText(C0906R.string.c__);
                }
                if (e.m() != 0) {
                    this.f27542e.setText(e.m());
                } else {
                    this.f27542e.setText(C0906R.string.c9v);
                }
                if (e.l() != 0) {
                    this.f27542e.setBackgroundResource(e.l());
                    this.s.setBackgroundResource(e.l());
                }
                this.f27543f = (ImageView) findViewById(C0906R.id.ct);
                if (e.n() != 0) {
                    this.f27543f.setImageResource(e.n());
                } else {
                    this.f27543f.setImageResource(2130840554);
                }
                this.h = (ViewGroup) findViewById(C0906R.id.ctd);
                this.i = (FrameLayout) findViewById(C0906R.id.ctc);
                f();
            } catch (ClassCastException e2) {
                throw new RuntimeException("curClassLoader: " + BDASplashImageView.class.getClassLoader() + "; objClassLoader:" + findViewById(C0906R.id.cte).getClass().getClassLoader(), e2);
            }
        } catch (ClassCastException e3) {
            throw new RuntimeException("curClassLoader: " + BDASplashImageView.class.getClassLoader() + "; objClassLoader:" + findViewById(C0906R.id.ctf).getClass().getClassLoader(), e3);
        }
    }

    public final void setSplashAdInteraction(l lVar) {
        this.m = lVar;
    }

    /* access modifiers changed from: package-private */
    public com.ss.android.ad.splash.core.video2.b c(final com.ss.android.ad.splash.core.c.b bVar) {
        return new com.ss.android.ad.splash.core.video2.b() {
            public final void b() {
                b.this.m.b();
            }

            public final void a() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("show_expected", bVar.f27610b);
                    String str = "not_real_time";
                    if (bVar.i()) {
                        str = "real_time";
                    }
                    jSONObject.put("show_type", str);
                    if (e.Q() != -1) {
                        int i = 1;
                        if (e.Q() != 1) {
                            i = 2;
                        }
                        jSONObject.put("awemelaunch", i);
                    }
                    jSONObject2.putOpt("ad_extra_data", jSONObject);
                    jSONObject2.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    if (!com.ss.android.ad.splash.utils.g.a(bVar.n())) {
                        jSONObject2.put("log_extra", bVar.n());
                    }
                    jSONObject2.put("ad_fetch_time", r.a().f());
                } catch (JSONException unused) {
                    jSONObject2 = null;
                }
                e.a(bVar.l(), "splash_ad", "play", jSONObject2);
                if (bVar.k != null) {
                    e.a(bVar.l(), bVar.n(), bVar.k.f27645a, 2);
                }
            }

            public final void a(int i) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", Long.toString((long) i));
                    jSONObject.put("percent", Integer.toString(100));
                    jSONObject.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    jSONObject.put("ad_fetch_time", r.a().f());
                    if (!com.ss.android.ad.splash.utils.g.a(bVar.n())) {
                        jSONObject.put("log_extra", bVar.n());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                e.a(bVar.l(), "splash_ad", "play_over", jSONObject);
                if (bVar.k != null) {
                    e.a(bVar.l(), bVar.n(), bVar.k.f27646b, 4);
                }
                b.this.m.a();
            }

            public final void a(int i, int i2) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j = (long) i;
                    jSONObject.put("duration", Long.toString(j));
                    jSONObject.put("percent", h.a(j, (long) i2));
                    jSONObject.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    jSONObject.put("category", "umeng");
                    jSONObject.put("ad_fetch_time", r.a().f());
                    jSONObject.put("break_reason", b.this.v);
                    if (!com.ss.android.ad.splash.utils.g.a(bVar.n())) {
                        jSONObject.put("log_extra", bVar.n());
                    }
                    jSONObject2.put("break_reason", b.this.v);
                    jSONObject.put("ad_extra_data", jSONObject2);
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                e.a(bVar.l(), "splash_ad", "play_break", jSONObject);
            }
        };
    }

    /* access modifiers changed from: package-private */
    public void setImageTouchListener(@NonNull final com.ss.android.ad.splash.core.c.b bVar) {
        setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                String str;
                if ((b.this.getTouchDelegate() == null || !b.this.getTouchDelegate().onTouchEvent(motionEvent)) && motionEvent.getAction() == 1) {
                    if (b.this.q) {
                        str = "click_normal_area";
                    } else {
                        str = "";
                    }
                    b.this.m.a(bVar, new c.a().a(0).a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).b(b.this.q).a(str).a());
                }
                return true;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void setSplashAdListener(@NonNull final com.ss.android.ad.splash.core.c.b bVar) {
        this.l.f27788e = new b.a() {
            public final void a() {
                b.this.m.b();
            }

            public final void c() {
                b.this.m.a();
            }

            public final void b() {
                b.this.m.a(bVar);
            }

            public final void a(long j) {
                new StringBuilder("Video play Complete ").append(j);
                b.this.m.a();
            }

            public final void a(int i, int i2) {
                b.this.m.b(bVar, new c.a().a(true).a(i, i2).a());
            }
        };
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 4 || i2 == 8) {
            e();
        }
    }

    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (e.M()) {
            this.n.removeMessages(1);
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void setSkipClickListener(@NonNull final com.ss.android.ad.splash.core.c.b bVar) {
        this.r.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (b.this.l != null) {
                    b.this.l.c();
                }
                if (b.this.u != null) {
                    b.this.v = 2;
                    b.this.u.a();
                }
                b.this.m.a(bVar);
            }
        });
        this.f27541d.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (b.this.l != null) {
                    b.this.l.c();
                }
                if (b.this.u != null) {
                    b.this.v = 2;
                    b.this.u.a();
                }
                b bVar = b.this;
                bVar.f27542e.setVisibility(4);
                bVar.f27543f.setVisibility(0);
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                bVar.g = rotateAnimation;
                bVar.g.setDuration(800);
                bVar.g.setRepeatCount(-1);
                bVar.g.setRepeatMode(1);
                bVar.g.setInterpolator(new LinearInterpolator());
                bVar.f27543f.startAnimation(bVar.g);
                b.this.m.a(bVar);
            }
        });
    }

    public final void a(Message message) {
        if (message.what == 1) {
            this.m.a();
            return;
        }
        if (message.what == 2) {
            int i2 = this.w;
            this.w = i2 - 1;
            String a2 = a(i2);
            this.f27542e.setText(a2);
            this.s.setText(a2);
        }
    }

    public b(@NonNull Context context) {
        super(context);
        inflate(getContext(), C0906R.layout.ad_, this);
        if (e.p() != 0) {
            try {
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), e.p()).getTheme().obtainStyledAttributes(new int[]{16842836});
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            } catch (Exception unused) {
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        c();
    }

    static String a(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (e.m() != 0) {
            return String.format("%ds %s", new Object[]{Integer.valueOf(i2), e.F().getResources().getString(e.m())});
        }
        return String.format("%ds %s", new Object[]{Integer.valueOf(i2), e.F().getResources().getString(C0906R.string.c9v)});
    }

    /* access modifiers changed from: package-private */
    public void setSkipAndWifiPreloadLayout(com.ss.android.ad.splash.core.c.b bVar) {
        if (bVar.v()) {
            if (bVar.i == 1) {
                this.r.setVisibility(0);
            } else {
                this.r.setVisibility(8);
            }
            if (e.b()) {
                this.C.setVisibility(0);
            }
            this.D.setVisibility(0);
            a(bVar.v(), bVar.h());
            return;
        }
        if (bVar.i == 1) {
            this.f27541d.setVisibility(0);
        } else {
            this.f27541d.setVisibility(8);
            d();
        }
        if (e.b()) {
            this.z.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void setSplashInfoStyle(@NonNull com.ss.android.ad.splash.core.c.b bVar) {
        if (!bVar.v()) {
            if (bVar.h() || e.g() != 1) {
                if (!(bVar == null || bVar.i == 1)) {
                    d();
                }
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            layoutParams.setMargins(0, 0, (int) k.a(getContext(), 10.0f), (int) k.a(getContext(), 10.0f));
            this.f27541d.setLayoutParams(layoutParams);
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(com.ss.android.ad.splash.core.c.b bVar) {
        int i2;
        try {
            boolean h2 = bVar.h();
            a(bVar.v(), h2);
            if (h2) {
                ViewGroup.LayoutParams layoutParams = this.f27540c.getLayoutParams();
                layoutParams.height = f.b();
                this.f27540c.setLayoutParams(layoutParams);
                this.f27540c.setVisibility(4);
                this.f27539b.setVisibility(8);
            } else {
                this.f27540c.setVisibility(8);
                this.f27539b.setVisibility(0);
            }
            if (e.b() && bVar.g == 1) {
                if (bVar.v()) {
                    this.C.setVisibility(0);
                } else {
                    this.z.setVisibility(0);
                }
            }
            String b2 = f.b(bVar.f27609a);
            if (com.ss.android.ad.splash.utils.g.a(b2) || e.u() == null) {
                return false;
            }
            e.u().a(this.y, b2, bVar.g, new com.ss.android.ad.splash.g() {
                public final void a() {
                    b.this.m.a();
                }
            });
            if (bVar.p() == 0 || bVar.p() == 4) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("show_expected", Integer.valueOf(bVar.f27610b));
                String str = "not_real_time";
                if (bVar.i()) {
                    str = "real_time";
                }
                jSONObject.putOpt("show_type", str);
                if (e.Q() != -1) {
                    if (e.Q() == 1) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    jSONObject.put("awemelaunch", i2);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("ad_extra_data", jSONObject);
                jSONObject2.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                if (!com.ss.android.ad.splash.utils.g.a(bVar.n())) {
                    jSONObject2.put("log_extra", bVar.n());
                }
                jSONObject2.put("ad_fetch_time", bVar.f());
                e.a(bVar.l(), "splash_ad", "show", jSONObject2);
                e.a(bVar.l(), bVar.n(), bVar.q(), 1);
            }
            this.y.f27524a = bVar;
            this.y.setInteraction(this.m);
            this.y.setVisibility(0);
            return true;
        } catch (Exception unused) {
            this.m.b();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(@NonNull final com.ss.android.ad.splash.core.c.b bVar) {
        boolean z2 = false;
        if (bVar.k == null || bVar.f27609a == null) {
            return false;
        }
        JSONObject jSONObject = null;
        if (e.S()) {
            this.t.setVisibility(0);
            int i2 = getResources().getDisplayMetrics().heightPixels;
            if (bVar.h()) {
                i2 -= f.b();
                this.f27539b.setVisibility(8);
            } else {
                this.f27539b.setVisibility(0);
            }
            j jVar = bVar.k;
            int i3 = bVar.f27609a.f27627c;
            int i4 = jVar.g;
            if (i3 == 0 || i4 == 0) {
                return false;
            }
            boolean b2 = b(bVar);
            int i5 = (int) (((float) i4) * (((float) i2) / ((float) i3)));
            this.u = new a(this.t);
            this.u.a(c(bVar));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            int i6 = (i2 - i5) / 2;
            layoutParams.topMargin = i6;
            layoutParams.bottomMargin = i6;
            this.t.setSurfaceLayoutParams(layoutParams);
            String b3 = f.b(jVar);
            if (com.ss.android.ad.splash.utils.g.a(b3)) {
                return false;
            }
            if (this.u.a(b3) && b2) {
                z2 = true;
            }
            setSkipAndWifiPreloadLayout(bVar);
            setSkipClickListener(bVar);
            setOnTouchListener(new View.OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        boolean b2 = b.this.m.b(bVar, new c.a().a(false).a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).a());
                        if (b.this.u != null && b2) {
                            b.this.v = 1;
                            b.this.u.a();
                        }
                    }
                    return true;
                }
            });
            this.t.setTextureViewOnTouchListener(new View.OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        boolean b2 = b.this.m.b(bVar, new c.a().a(true).a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).a());
                        if (b.this.u != null && b2) {
                            b.this.v = 1;
                            b.this.u.a();
                        }
                    }
                    return true;
                }
            });
            if (z2) {
                d.a().a(bVar, e.F());
                d.a().a(this.u, bVar.x(), bVar.c());
                a();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str = "not_real_time";
                try {
                    if (bVar.i()) {
                        str = "real_time";
                    }
                    jSONObject2.putOpt("show_type", str);
                    jSONObject2.putOpt("show_expected", Integer.valueOf(bVar.f27610b));
                    jSONObject3.putOpt("ad_extra_data", jSONObject2);
                    jSONObject3.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                    jSONObject3.putOpt("log_extra", bVar.n());
                    jSONObject3.putOpt("ad_fetch_time", Long.valueOf(r.a().f()));
                    jSONObject = jSONObject3;
                } catch (JSONException unused) {
                }
                e.a(bVar.l(), "splash_ad", "banner_show", jSONObject);
            }
            return z2;
        }
        this.h.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -1;
        this.h.setLayoutParams(layoutParams2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i7 = displayMetrics.heightPixels;
        if (bVar.h()) {
            i7 -= f.b();
            this.f27539b.setVisibility(8);
        } else {
            this.f27539b.setVisibility(0);
        }
        j jVar2 = bVar.k;
        int i8 = bVar.f27609a.f27627c;
        int i9 = jVar2.g;
        if (i8 == 0 || i9 == 0) {
            return false;
        }
        boolean b4 = b(bVar);
        int i10 = (int) (((float) i9) * (((float) i7) / ((float) i8)));
        this.l = new g(e.F(), this.i);
        setSplashAdListener(bVar);
        String b5 = f.b(jVar2);
        if (com.ss.android.ad.splash.utils.g.a(b5)) {
            return false;
        }
        com.ss.android.ad.splash.core.video.f a2 = new f.a().a(b5).b(jVar2.f27648d).a(bVar.l()).a(displayMetrics.widthPixels).b(i10).a(jVar2.f27645a).c(bVar.n()).c((i7 - i10) / 2).d(bVar.f27610b).a(false).b(false).c(bVar.v()).a();
        this.l.f27789f = bVar.i();
        if (this.l.a(a2) && b4) {
            z2 = true;
        }
        setSkipAndWifiPreloadLayout(bVar);
        setSkipClickListener(bVar);
        setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (b.this.l != null) {
                        b.this.l.c();
                    }
                    b.this.m.b(bVar, new c.a().a(false).a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).a());
                }
                return true;
            }
        });
        if (z2) {
            a();
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = new JSONObject();
            String str2 = "not_real_time";
            try {
                if (bVar.i()) {
                    str2 = "real_time";
                }
                jSONObject4.putOpt("show_type", str2);
                jSONObject4.putOpt("show_expected", Integer.valueOf(bVar.f27610b));
                jSONObject5.putOpt("ad_extra_data", jSONObject4);
                jSONObject5.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                jSONObject5.putOpt("log_extra", bVar.n());
                jSONObject5.putOpt("ad_fetch_time", Long.valueOf(r.a().f()));
                jSONObject = jSONObject5;
            } catch (JSONException unused2) {
            }
            e.a(bVar.l(), "splash_ad", "banner_show", jSONObject);
        }
        return z2;
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        switch (i2) {
            case 24:
                d.a().c();
                break;
            case 25:
                d.a().c();
                break;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2, boolean z3) {
        if (z2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.B.getLayoutParams();
            layoutParams.height = com.ss.android.ad.splash.utils.f.g() - 4;
            this.B.setLayoutParams(layoutParams);
            this.r.setPadding(4, 4, 0, 4);
            if (!z3) {
                this.s.setBackgroundResource(2130840550);
                this.s.setTextColor(getResources().getColor(C0906R.color.a48));
            } else {
                this.s.setBackgroundResource(2130840549);
                this.s.setTextColor(getResources().getColor(C0906R.color.a49));
            }
            this.D.setVisibility(0);
        }
    }
}
