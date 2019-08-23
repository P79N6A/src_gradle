package com.ss.android.ad.splash.core;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.splash.core.c.b;
import com.ss.android.ad.splash.core.c.c;
import com.ss.android.ad.splash.core.c.i;
import com.ss.android.ad.splash.core.c.j;
import com.ss.android.ad.splash.core.video2.BDASplashVideoView;
import com.ss.android.ad.splash.core.video2.a;
import com.ss.android.ad.splash.core.video2.d;
import com.ss.android.ad.splash.core.video2.e;
import com.ss.android.ad.splash.utils.f;
import com.ss.android.ad.splash.utils.g;
import com.ss.android.ad.splash.utils.h;
import com.ss.android.ad.splash.utils.k;
import com.ss.android.ad.splash.utils.l;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends RelativeLayout implements l.a {
    private int A = 0;
    private Timer B;

    /* renamed from: a  reason: collision with root package name */
    Space f27580a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f27581b;

    /* renamed from: c  reason: collision with root package name */
    BDASplashVideoView f27582c;

    /* renamed from: d  reason: collision with root package name */
    RelativeLayout f27583d;

    /* renamed from: e  reason: collision with root package name */
    TextView f27584e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27585f;
    long g;
    public int h = -1;
    public b i;
    public l j;
    public l k = new l(this);
    public e l;
    private LinearLayout m;
    private ViewStub n;
    private RelativeLayout o;
    private FrameLayout p;
    private TextView q;
    private BDASplashImageView r;
    private RelativeLayout s;
    private ImageView t;
    private FrameLayout u;
    private TextView v;
    private TextView w;
    private boolean x;
    private String y;
    private String z;

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    public final boolean performClick() {
        return super.performClick();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B == null) {
            this.B = new Timer();
            this.B.schedule(new TimerTask() {
                public final void run() {
                    Message obtainMessage = c.this.k.obtainMessage();
                    obtainMessage.what = 2;
                    c.this.k.sendMessage(obtainMessage);
                }
            }, 0, 1000);
        }
        k.a().f27703a = System.currentTimeMillis();
        this.j.c();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            public final boolean onPreDraw() {
                c.this.getViewTreeObserver().removeOnPreDrawListener(this);
                c.this.j.c(c.this.i);
                return true;
            }
        });
    }

    private void a() {
        if (this.r != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) this.r.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    this.r.setImageBitmap(null);
                }
            } catch (Exception unused) {
            }
        }
        d.a().b();
        if (this.l != null) {
            this.l.e();
            this.l = null;
            this.f27582c = null;
        }
        if (this.B != null) {
            this.B.cancel();
            this.B = null;
        }
    }

    public final void setSplashAdInteraction(l lVar) {
        this.j = lVar;
    }

    /* access modifiers changed from: package-private */
    public com.ss.android.ad.splash.core.video2.b c(final b bVar) {
        return new com.ss.android.ad.splash.core.video2.b() {
            public final void b() {
                c.this.j.b();
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
                    if (!g.a(bVar.n())) {
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
                    if (!g.a(bVar.n())) {
                        jSONObject.put("log_extra", bVar.n());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                e.a(bVar.l(), "splash_ad", "play_over", jSONObject);
                if (bVar.k != null) {
                    e.a(bVar.l(), bVar.n(), bVar.k.f27646b, 4);
                }
                c.this.j.a();
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
                    jSONObject.put("break_reason", c.this.h);
                    if (!g.a(bVar.n())) {
                        jSONObject.put("log_extra", bVar.n());
                    }
                    jSONObject2.put("break_reason", c.this.h);
                    jSONObject.put("ad_extra_data", jSONObject2);
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                e.a(bVar.l(), "splash_ad", "play_break", jSONObject);
            }
        };
    }

    private void setSkipClickListener(@NonNull final b bVar) {
        this.u.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (c.this.l != null) {
                    c.this.h = 2;
                    c.this.l.a();
                }
                c.this.j.a(bVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void setImageTouchListener(@NonNull final b bVar) {
        setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                String str;
                if ((c.this.getTouchDelegate() == null || !c.this.getTouchDelegate().onTouchEvent(motionEvent)) && motionEvent.getAction() == 1) {
                    if (c.this.f27585f) {
                        str = "click_normal_area";
                    } else {
                        str = "";
                    }
                    c.this.j.a(bVar, new c.a().a(0).a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).b(c.this.f27585f).a(str).a());
                }
                return true;
            }
        });
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 4 || i2 == 8) {
            a();
        }
    }

    private void setupWifiPreloadHindLayout(b bVar) {
        String str = bVar.z;
        if (!TextUtils.isEmpty(str)) {
            this.q.setVisibility(0);
            this.q.setText(str);
        }
    }

    private String a(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (!this.x) {
            return this.y;
        }
        return String.format("%d%s %s", new Object[]{Integer.valueOf(i2), this.z, this.y});
    }

    private void setupSkipButtonHitArea(b bVar) {
        i iVar = bVar.y;
        if (iVar != null && this.u.getVisibility() == 0) {
            FrameLayout frameLayout = this.u;
            f.AnonymousClass1 r1 = new Runnable(frameLayout, iVar.f27640b, iVar.f27640b, iVar.f27641c, iVar.f27641c) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View f27843a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f27844b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f27845c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ int f27846d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ int f27847e;

                public final void run() {
                    Rect rect = new Rect();
                    this.f27843a.setEnabled(true);
                    this.f27843a.getHitRect(rect);
                    rect.top -= this.f27844b;
                    rect.bottom += this.f27845c;
                    rect.left -= this.f27846d;
                    rect.right += this.f27847e;
                    TouchDelegate touchDelegate = new TouchDelegate(rect, this.f27843a);
                    if (View.class.isInstance(this.f27843a.getParent())) {
                        ((View) this.f27843a.getParent()).setTouchDelegate(touchDelegate);
                    }
                }

                {
                    this.f27843a = r1;
                    this.f27844b = r2;
                    this.f27845c = r3;
                    this.f27846d = r4;
                    this.f27847e = r5;
                }
            };
            ((View) frameLayout.getParent()).post(r1);
        }
    }

    @TargetApi(16)
    private void setupAdLabelLayout(b bVar) {
        com.ss.android.ad.splash.core.c.e eVar = bVar.x;
        if (eVar != null) {
            if (!TextUtils.isEmpty(eVar.f27632d)) {
                this.w.setText(eVar.f27632d);
            }
            if (!TextUtils.isEmpty(eVar.f27632d)) {
                this.w.setTextColor(Color.parseColor(eVar.f27631c));
            }
            if (!TextUtils.isEmpty(eVar.f27629a)) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadii(new float[]{k.a(getContext(), 2.0f), k.a(getContext(), 2.0f), k.a(getContext(), 2.0f), k.a(getContext(), 2.0f), k.a(getContext(), 2.0f), k.a(getContext(), 2.0f), k.a(getContext(), 2.0f), k.a(getContext(), 2.0f)});
                gradientDrawable.setColor(Color.parseColor(eVar.f27629a));
                if (Build.VERSION.SDK_INT >= 16) {
                    this.w.setBackground(gradientDrawable);
                    return;
                }
                this.w.setBackgroundDrawable(gradientDrawable);
            }
        }
    }

    public final void a(Message message) {
        if (message.what == 2) {
            int i2 = this.A;
            this.A = i2 - 1;
            if (i2 == 0) {
                if (this.B != null) {
                    this.B.cancel();
                    this.B = null;
                }
                this.j.a();
            } else if (this.v.getVisibility() == 0 && this.x) {
                this.v.setText(a(i2));
            }
            new StringBuilder("mCurrentDisplaySecLeft:").append(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(b bVar) {
        int i2;
        if (bVar.h()) {
            ViewGroup.LayoutParams layoutParams = this.f27580a.getLayoutParams();
            layoutParams.height = f.b();
            this.f27580a.setLayoutParams(layoutParams);
            this.f27580a.setVisibility(4);
            this.f27581b.setVisibility(8);
        } else {
            this.f27580a.setVisibility(8);
            this.f27581b.setVisibility(0);
        }
        String b2 = f.b(bVar.f27609a);
        if (g.a(b2) || e.u() == null) {
            return false;
        }
        e.u().a(this.r, b2, bVar.g, new com.ss.android.ad.splash.g() {
            public final void a() {
                c.this.j.a();
            }
        });
        try {
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
                if (!g.a(bVar.n())) {
                    jSONObject2.put("log_extra", bVar.n());
                }
                jSONObject2.put("ad_fetch_time", bVar.f());
                e.a(bVar.l(), "splash_ad", "show", jSONObject2);
                e.a(bVar.l(), bVar.n(), bVar.q(), 1);
            }
            this.r.f27524a = bVar;
            this.r.setInteraction(this.j);
            this.r.setVisibility(0);
            return true;
        } catch (Exception unused) {
            this.j.b();
            return false;
        }
    }

    @TargetApi(16)
    private void setupSkipLayout(b bVar) {
        this.A = (int) (this.g / 1000);
        i iVar = bVar.y;
        if (iVar == null || TextUtils.isEmpty(iVar.f27644f)) {
            this.u.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10, -1);
            layoutParams.addRule(11, -1);
            layoutParams.setMargins(0, (int) k.a(getContext(), 16.0f), (int) k.a(getContext(), 9.0f), 0);
            this.q.setLayoutParams(layoutParams);
            return;
        }
        this.u.setVisibility(0);
        this.y = iVar.f27644f;
        this.x = iVar.g;
        this.z = iVar.f27639a;
        this.v.setText(a(this.A));
        if (!TextUtils.isEmpty(iVar.f27642d)) {
            this.v.setTextColor(Color.parseColor(iVar.f27642d));
        }
        if (!TextUtils.isEmpty(iVar.f27643e)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadii(new float[]{k.a(getContext(), 12.0f), k.a(getContext(), 12.0f), k.a(getContext(), 12.0f), k.a(getContext(), 12.0f), k.a(getContext(), 12.0f), k.a(getContext(), 12.0f), k.a(getContext(), 12.0f), k.a(getContext(), 12.0f)});
            gradientDrawable.setColor(Color.parseColor(iVar.f27643e));
            if (Build.VERSION.SDK_INT >= 16) {
                this.v.setBackground(gradientDrawable);
            } else {
                this.v.setBackgroundDrawable(gradientDrawable);
            }
        }
        setSkipClickListener(bVar);
    }

    /* access modifiers changed from: package-private */
    public boolean a(@NonNull final b bVar) {
        boolean z2 = false;
        if (bVar.k == null || bVar.f27609a == null) {
            return false;
        }
        this.f27582c.setVisibility(0);
        int i2 = getResources().getDisplayMetrics().heightPixels;
        if (bVar.h()) {
            i2 -= f.b();
        }
        j jVar = bVar.k;
        int i3 = bVar.f27609a.f27627c;
        int i4 = jVar.g;
        if (i3 == 0 || i4 == 0) {
            return false;
        }
        boolean b2 = b(bVar);
        int i5 = (int) (((float) i4) * (((float) i2) / ((float) i3)));
        this.l = new a(this.f27582c);
        this.l.a(c(bVar));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        int i6 = (i2 - i5) / 2;
        layoutParams.topMargin = i6;
        layoutParams.bottomMargin = i6;
        this.f27582c.setSurfaceLayoutParams(layoutParams);
        String b3 = f.b(jVar);
        if (g.a(b3)) {
            return false;
        }
        if (this.l.a(b3) && b2) {
            z2 = true;
        }
        if (z2) {
            d.a().a(bVar, e.F());
            d.a().a(this.l, bVar.x(), bVar.c());
        }
        setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    boolean b2 = c.this.j.b(bVar, new c.a().a(false).a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).a());
                    if (c.this.l != null && b2) {
                        c.this.h = 1;
                        c.this.l.a();
                    }
                }
                return true;
            }
        });
        this.f27582c.setTextureViewOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    boolean b2 = c.this.j.b(bVar, new c.a().a(true).a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).a());
                    if (c.this.l != null && b2) {
                        c.this.h = 1;
                        c.this.l.a();
                    }
                }
                return true;
            }
        });
        if (z2) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = "not_real_time";
            try {
                if (bVar.i()) {
                    str = "real_time";
                }
                jSONObject.putOpt("show_type", str);
                jSONObject.putOpt("show_expected", Integer.valueOf(bVar.f27610b));
                jSONObject2.putOpt("ad_extra_data", jSONObject);
                jSONObject2.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                jSONObject2.putOpt("log_extra", bVar.n());
                jSONObject2.putOpt("ad_fetch_time", Long.valueOf(r.a().f()));
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            e.a(bVar.l(), "splash_ad", "banner_show", jSONObject2);
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void setupUIWidgets(b bVar) {
        int i2;
        setupSkipLayout(bVar);
        setupWifiPreloadHindLayout(bVar);
        setupAdLabelLayout(bVar);
        com.ss.android.ad.splash.core.c.e eVar = bVar.x;
        if (eVar != null) {
            switch (eVar.f27630b) {
                case 1:
                    this.w.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 85;
                    if (bVar.h == 3 && this.f27583d.getVisibility() == 0) {
                        i2 = this.f27583d.getLayoutParams().height;
                    } else {
                        i2 = 0;
                    }
                    layoutParams.setMargins(0, 0, (int) k.a(getContext(), 16.0f), ((int) k.a(getContext(), 20.0f)) + i2);
                    this.w.setLayoutParams(layoutParams);
                    this.p.addView(this.w);
                    break;
                case 2:
                    LinearLayout linearLayout = new LinearLayout(getContext());
                    linearLayout.setOrientation(0);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 53;
                    layoutParams2.setMargins(0, (int) k.a(getContext(), 15.0f), (int) k.a(getContext(), 16.0f), 0);
                    linearLayout.setLayoutParams(layoutParams2);
                    linearLayout.setVisibility(8);
                    this.p.addView(linearLayout);
                    if (this.q.getVisibility() == 0) {
                        linearLayout.setVisibility(0);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams3.setMargins(0, 0, (int) k.a(getContext(), 5.0f), 0);
                        this.q.setLayoutParams(layoutParams3);
                        this.q.setTextSize(1, 10.0f);
                        ((ViewGroup) this.q.getParent()).removeView(this.q);
                        linearLayout.addView(this.q);
                    }
                    if (!TextUtils.isEmpty(this.w.getText())) {
                        linearLayout.setVisibility(0);
                        this.w.setVisibility(0);
                        this.w.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        linearLayout.addView(this.w);
                    }
                    if (this.u.getVisibility() == 0) {
                        int g2 = f.g();
                        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, (int) k.a(getContext(), 36.0f));
                        layoutParams4.addRule(11, -1);
                        layoutParams4.addRule(12, -1);
                        layoutParams4.setMargins(0, 0, (int) k.a(getContext(), 16.0f), g2);
                        this.u.setLayoutParams(layoutParams4);
                        this.v.setTextSize(1, 14.0f);
                        break;
                    }
                    break;
                default:
                    this.w.setVisibility(8);
                    break;
            }
        }
        setupSkipButtonHitArea(bVar);
    }

    public c(@NonNull Context context) {
        super(context);
        if (e.p() != 0) {
            try {
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), e.p()).getTheme().obtainStyledAttributes(new int[]{16842836});
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            } catch (Exception unused) {
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        this.m = linearLayout;
        addView(linearLayout);
        this.n = new ViewStub(context);
        this.n.setLayoutParams(new LinearLayout.LayoutParams(-1, 27));
        this.n.setLayoutResource(C0906R.layout.ad8);
        this.n.setVisibility(8);
        this.m.addView(this.n);
        this.o = new RelativeLayout(context);
        this.o.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f27580a = new Space(context);
        this.f27580a.setId(C0906R.id.ct5);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.f27580a.setLayoutParams(layoutParams);
        this.f27580a.setBackgroundColor(getResources().getColor(C0906R.color.a4g));
        this.f27580a.setVisibility(4);
        this.p = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, this.f27580a.getId());
        this.p.setLayoutParams(layoutParams2);
        this.r = new BDASplashImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        this.r.setScaleType(ImageView.ScaleType.FIT_XY);
        this.r.setVisibility(8);
        this.r.setLayoutParams(layoutParams3);
        this.f27582c = new BDASplashVideoView(context);
        this.f27582c.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f27582c.setVisibility(8);
        this.f27583d = new RelativeLayout(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, (int) k.a(context, 60.0f));
        layoutParams4.gravity = 80;
        this.f27583d.setLayoutParams(layoutParams4);
        this.f27583d.setBackgroundColor(getResources().getColor(C0906R.color.a4a));
        this.f27583d.setVisibility(8);
        this.s = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(13, -1);
        this.s.setLayoutParams(layoutParams5);
        this.f27584e = new TextView(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(15, -1);
        this.f27584e.setEllipsize(TextUtils.TruncateAt.END);
        this.f27584e.setLines(1);
        this.f27584e.setMaxWidth((int) k.a(context, 200.0f));
        this.f27584e.setText(C0906R.string.c9s);
        this.f27584e.setTextColor(getResources().getColor(C0906R.color.a4g));
        this.f27584e.setTextSize(1, 20.0f);
        this.f27584e.setLayoutParams(layoutParams6);
        this.f27584e.setId(C0906R.id.ct_);
        this.s.addView(this.f27584e);
        this.t = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15, -1);
        layoutParams7.addRule(1, this.f27584e.getId());
        layoutParams7.setMargins((int) k.a(context, 4.0f), 0, 0, 0);
        this.t.setPadding(0, (int) k.a(context, 1.0f), 0, 0);
        this.t.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130840552));
        this.t.setLayoutParams(layoutParams7);
        this.s.addView(this.t);
        this.f27583d.addView(this.s);
        this.f27581b = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(9, -1);
        layoutParams8.addRule(10, -1);
        layoutParams8.setMargins((int) k.a(context, 14.0f), (int) k.a(context, 14.0f), 0, 0);
        this.f27581b.setVisibility(8);
        this.f27581b.setLayoutParams(layoutParams8);
        this.u = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, (int) k.a(context, 36.0f));
        layoutParams9.addRule(11, -1);
        layoutParams9.addRule(10, -1);
        layoutParams9.setMargins(0, (int) k.a(context, 8.0f), (int) k.a(context, 16.0f), 0);
        this.u.setLayoutParams(layoutParams9);
        this.u.setVisibility(8);
        this.u.setId(C0906R.id.ctb);
        this.v = new TextView(context);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, (int) k.a(context, 24.0f));
        this.v.setBackgroundResource(2130840553);
        this.v.setPadding((int) k.a(context, 10.0f), 0, (int) k.a(context, 10.0f), 0);
        layoutParams10.gravity = 17;
        this.v.setGravity(17);
        this.v.setTextSize(1, 12.0f);
        this.v.setLayoutParams(layoutParams10);
        this.u.addView(this.v);
        this.q = new TextView(context);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams11.addRule(10, -1);
        layoutParams11.addRule(0, this.u.getId());
        layoutParams11.setMargins(0, (int) k.a(context, 16.0f), (int) k.a(context, 9.0f), 0);
        this.q.setPadding(3, 3, 3, 3);
        this.q.setTextColor(Color.parseColor("#ffffff"));
        this.q.setShadowLayer(12.0f, 0.0f, 0.0f, Color.parseColor("#7f000000"));
        this.q.setTextSize(1, 12.0f);
        this.q.setVisibility(8);
        this.q.setLayoutParams(layoutParams11);
        this.w = new TextView(context);
        this.w.setPadding((int) k.a(context, 4.0f), (int) k.a(context, 2.0f), (int) k.a(context, 4.0f), (int) k.a(context, 2.0f));
        this.w.setTextSize(1, 10.0f);
        this.w.setVisibility(8);
        this.m.addView(this.o);
        this.p.addView(this.r);
        this.p.addView(this.f27582c);
        this.p.addView(this.f27583d);
        this.o.addView(this.p);
        this.o.addView(this.f27581b);
        this.o.addView(this.f27580a);
        this.o.addView(this.u);
        this.o.addView(this.q);
        if (k.c(getContext())) {
            this.n.setVisibility(0);
        }
        if (e.o() != 0) {
            this.f27581b.setImageResource(e.o());
        }
        if (e.k() != 0) {
            this.q.setText(e.k());
        } else {
            this.q.setText(C0906R.string.c__);
        }
        if (e.m() != 0) {
            this.v.setText(e.m());
        } else {
            this.v.setText(C0906R.string.c9v);
        }
        if (e.l() != 0) {
            this.v.setBackgroundResource(e.l());
        }
        if (e.L() == 1) {
            this.r.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
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
}
