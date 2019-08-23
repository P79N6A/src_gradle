package com.bytedance.android.live.excitingvideoad.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.excitingvideoad.a;
import com.bytedance.android.live.excitingvideoad.b.b;
import com.bytedance.android.live.excitingvideoad.c.c;
import com.bytedance.android.live.excitingvideoad.d;
import com.bytedance.android.live.excitingvideoad.d.e;
import com.bytedance.android.live.excitingvideoad.d.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import org.json.JSONException;
import org.json.JSONObject;

public class ExcitingVideoFragment extends Fragment implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8419a;
    private d A = new d() {
    };
    private f B = new f() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8439a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f8439a, false, 1622, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8439a, false, 1622, new Class[0], Void.TYPE);
                return;
            }
            ExcitingVideoFragment.this.f8423e.setVisibility(0);
            if (!ExcitingVideoFragment.this.k && ExcitingVideoFragment.this.f8421c != null) {
                ExcitingVideoFragment.this.k = true;
                if (!ExcitingVideoFragment.this.f8421c.w.isEmpty()) {
                    b.a().a(ExcitingVideoFragment.this.f8421c.w);
                }
                d.a().a((Context) ExcitingVideoFragment.this.f8420b, "landing_ad", "play", ExcitingVideoFragment.this.f8421c.f8372b, "video");
            }
            if (ExcitingVideoFragment.this.j != null && ExcitingVideoFragment.this.j.isShowing()) {
                ExcitingVideoFragment.this.f8422d.b();
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f8439a, false, 1623, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8439a, false, 1623, new Class[0], Void.TYPE);
                return;
            }
            if (ExcitingVideoFragment.this.f8424f != null) {
                ExcitingVideoFragment.this.f8424f.setText("关闭广告");
            }
            ExcitingVideoFragment.this.l = true;
            if (!ExcitingVideoFragment.this.f8421c.x.isEmpty()) {
                b.a().a(ExcitingVideoFragment.this.f8421c.x);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("refer", "video");
                jSONObject.put("duration", ExcitingVideoFragment.this.n * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                jSONObject.put("video_length", ExcitingVideoFragment.this.n * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                jSONObject.put("percent", 100);
                jSONObject.put("log_extra", ExcitingVideoFragment.this.f8421c.g);
                jSONObject.put("is_ad_event", 1);
                if (!TextUtils.isEmpty(d.a().g)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("adUnitId", d.a().g);
                    jSONObject.put("ad_extra_data", jSONObject2);
                }
            } catch (JSONException unused) {
            }
            d.a().a((Context) ExcitingVideoFragment.this.f8420b, "landing_ad", "play_over", ExcitingVideoFragment.this.f8421c.f8372b, jSONObject);
            if (ExcitingVideoFragment.this.q != null) {
                ExcitingVideoFragment.this.e();
            }
        }

        public final void a(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f8439a, false, 1621, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f8439a, false, 1621, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (ExcitingVideoFragment.this.f8421c != null && i == ExcitingVideoFragment.this.f8421c.q && !ExcitingVideoFragment.this.f8421c.y.isEmpty()) {
                b.a().a(ExcitingVideoFragment.this.f8421c.y);
            }
            if (i == 5) {
                ExcitingVideoFragment.this.f8424f.setVisibility(0);
            }
            ExcitingVideoFragment.this.n = i;
            ExcitingVideoFragment.this.c();
        }

        public final void a(int i, String str) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f8439a, false, 1624, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f8439a, false, 1624, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            } else if (!ExcitingVideoFragment.this.k || ExcitingVideoFragment.this.f8421c == null) {
                if (ExcitingVideoFragment.this.i != null) {
                    String.format("视频播放错误, errorCode = %d, errorMsg = %s", new Object[]{Integer.valueOf(i), str});
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("refer", "video");
                    jSONObject.put("duration", ExcitingVideoFragment.this.n * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                    int i2 = ExcitingVideoFragment.this.f8421c.s;
                    jSONObject.put("video_length", ExcitingVideoFragment.this.f8421c.s * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                    double d2 = (double) ExcitingVideoFragment.this.n;
                    Double.isNaN(d2);
                    double d3 = (double) i2;
                    Double.isNaN(d3);
                    jSONObject.put("percent", (int) (((d2 * 1.0d) / d3) * 100.0d));
                    jSONObject.put("log_extra", ExcitingVideoFragment.this.f8421c.g);
                    jSONObject.put("is_ad_event", 1);
                    if (!TextUtils.isEmpty(d.a().g)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("adUnitId", d.a().g);
                        jSONObject.put("ad_extra_data", jSONObject2);
                    }
                } catch (JSONException unused) {
                }
                d.a().a((Context) ExcitingVideoFragment.this.f8420b, "landing_ad", "play_break", ExcitingVideoFragment.this.f8421c.f8372b, jSONObject);
                if (ExcitingVideoFragment.this.i != null) {
                    String.format("视频播放错误, errorCode = %d, errorMsg = %s", new Object[]{Integer.valueOf(i), str});
                }
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public Activity f8420b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.live.excitingvideoad.a.b f8421c;

    /* renamed from: d  reason: collision with root package name */
    public e f8422d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f8423e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f8424f;
    public a g;
    public View h;
    public a i;
    public AlertDialog j;
    public boolean k;
    public boolean l;
    public boolean m = true;
    public int n;
    public View o;
    public b p;
    public c q;
    public boolean r;
    private RelativeLayout s;
    private com.bytedance.android.live.excitingvideoad.d.a t;
    private RelativeLayout u;
    private TextView v;
    private TextView w;
    private int x;
    private com.bytedance.android.live.excitingvideoad.f y;
    private RelativeLayout z;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f8419a, false, 1596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8419a, false, 1596, new Class[0], Void.TYPE);
            return;
        }
        e();
        if (this.p != null) {
            this.p.a();
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f8419a, false, 1601, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8419a, false, 1601, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.r) {
            this.t.setVisibility(4);
        }
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f8419a, false, 1603, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8419a, false, 1603, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.k && (this.l || this.n >= this.f8421c.p)) {
            a();
        } else if (this.f8421c != null) {
            d();
            return true;
        }
        return false;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f8419a, false, 1604, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8419a, false, 1604, new Class[0], Void.TYPE);
        } else if (!this.f8422d.g() && this.f8421c != null) {
            String str = "关闭广告";
            if (this.f8421c.p - this.n > 0) {
                str = "关闭广告 " + r0 + NotifyType.SOUND;
            }
            this.f8424f.setText(str);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f8419a, false, 1602, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8419a, false, 1602, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f8422d.d();
        if (this.j != null && this.j.isShowing()) {
            this.j.dismiss();
        }
        this.j = null;
        this.B = null;
        this.h = null;
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f8419a, false, 1600, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8419a, false, 1600, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.f8422d.b();
        if (!(this.f8421c == null || d.a().f8450c == null)) {
            this.f8421c.j.equals(PushConstants.EXTRA_APPLICATION_PENDING_INTENT);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f8419a, false, 1599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8419a, false, 1599, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.t.getVisibility() == 4) {
            this.t.setVisibility(0);
        }
        this.r = false;
        this.f8422d.c();
        if (!(this.f8421c == null || d.a().f8450c == null)) {
            this.f8421c.j.equals(PushConstants.EXTRA_APPLICATION_PENDING_INTENT);
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f8419a, false, 1606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8419a, false, 1606, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f8422d.g() || !this.l) {
            if (this.i != null) {
                this.f8422d.e();
            }
            if (this.f8422d.e() >= this.f8421c.p) {
                d.a().a((Context) this.f8420b, "landing_ad", "receive_award", this.f8421c.f8372b, "video");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("refer", "video");
                jSONObject.put("duration", this.n * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                int i2 = this.f8421c.s;
                jSONObject.put("video_length", this.f8421c.s * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                double d2 = (double) this.n;
                Double.isNaN(d2);
                double d3 = (double) i2;
                Double.isNaN(d3);
                jSONObject.put("percent", (int) (((d2 * 1.0d) / d3) * 100.0d));
                jSONObject.put("log_extra", this.f8421c.g);
                jSONObject.put("is_ad_event", 1);
                if (!TextUtils.isEmpty(d.a().g)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("adUnitId", d.a().g);
                    jSONObject.put("ad_extra_data", jSONObject2);
                }
            } catch (JSONException unused) {
            }
            d.a().a((Context) this.f8420b, "landing_ad", "play_break", this.f8421c.f8372b, jSONObject);
        } else {
            d.a().a((Context) this.f8420b, "landing_ad", "receive_award", this.f8421c.f8372b, "video");
        }
        d.a().f8452e = null;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f8419a, false, 1605, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8419a, false, 1605, new Class[0], Void.TYPE);
            return;
        }
        if (this.j == null || this.z == null) {
            this.z = new RelativeLayout(this.f8420b);
            this.z.setBackgroundColor(Color.parseColor("#ffffff"));
            int a2 = (int) c.a(this.f8420b, 280.0f);
            int a3 = (int) c.a(this.f8420b, 114.0f);
            this.z.setLayoutParams(new RelativeLayout.LayoutParams(a2, a3));
            TextView textView = new TextView(this.f8420b);
            if (TextUtils.isEmpty(this.f8421c.v)) {
                textView.setText("观看完整视频可获得奖励");
            } else {
                textView.setText(this.f8421c.v);
            }
            textView.setTextColor(Color.parseColor("#222222"));
            textView.setTextSize(1, 17.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = (int) c.a(this.f8420b, 24.0f);
            layoutParams.topMargin = (int) c.a(this.f8420b, 21.0f);
            textView.setLayoutParams(layoutParams);
            this.z.addView(textView);
            TextView textView2 = new TextView(this.f8420b);
            textView2.setText("关闭广告");
            textView2.setTextColor(Color.parseColor("#2a90d7"));
            textView2.setTextSize(1, 15.0f);
            textView2.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8434a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f8434a, false, 1612, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f8434a, false, 1612, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ExcitingVideoFragment.this.o.setVisibility(8);
                    ExcitingVideoFragment.this.j.dismiss();
                    ExcitingVideoFragment.this.a();
                    d.a().a((Context) ExcitingVideoFragment.this.f8420b, "landing_ad", "otherclick", ExcitingVideoFragment.this.f8421c.f8372b, "confirm");
                }
            });
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(12, -1);
            layoutParams2.leftMargin = (int) c.a(this.f8420b, 117.0f);
            layoutParams2.bottomMargin = (int) c.a(this.f8420b, 16.0f);
            textView2.setLayoutParams(layoutParams2);
            this.z.addView(textView2);
            TextView textView3 = new TextView(this.f8420b);
            textView3.setText("继续观看");
            textView3.setTextColor(Color.parseColor("#2a90d7"));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8436a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f8436a, false, 1613, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f8436a, false, 1613, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ExcitingVideoFragment.this.o.setVisibility(8);
                    ExcitingVideoFragment.this.j.dismiss();
                    ExcitingVideoFragment.this.f8422d.c();
                    d.a().a((Context) ExcitingVideoFragment.this.f8420b, "landing_ad", "otherclick", ExcitingVideoFragment.this.f8421c.f8372b, "cancel");
                }
            });
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(12, -1);
            layoutParams3.addRule(11, -1);
            layoutParams3.rightMargin = (int) c.a(this.f8420b, 18.0f);
            layoutParams3.bottomMargin = (int) c.a(this.f8420b, 16.0f);
            textView3.setLayoutParams(layoutParams3);
            this.z.addView(textView3);
            this.j = new AlertDialog.Builder(this.f8420b, C0906R.style.rk).create();
            WindowManager.LayoutParams attributes = this.j.getWindow().getAttributes();
            attributes.width = a2;
            attributes.height = a3;
            this.j.getWindow().setAttributes(attributes);
            this.j.setCancelable(false);
        }
        this.o.setVisibility(0);
        this.j.show();
        this.j.setContentView(this.z);
        this.f8422d.b();
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8419a, false, 1598, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8419a, false, 1598, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.i = d.a().f8452e;
        if (PatchProxy.isSupport(new Object[0], this, f8419a, false, 1595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8419a, false, 1595, new Class[0], Void.TYPE);
            return;
        }
        this.f8421c = d.a().f8453f;
        if (this.f8421c == null) {
            if (getContext() != null && (getContext() instanceof Activity)) {
                ((Activity) getContext()).finish();
            }
            return;
        }
        if (!(!this.f8421c.b() || this.f8421c.t == 0 || this.f8421c.u == 0)) {
            com.bytedance.android.live.excitingvideoad.d.a aVar = this.t;
            int i3 = this.f8421c.t;
            int i4 = this.f8421c.u;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, aVar, com.bytedance.android.live.excitingvideoad.d.a.f8394a, false, 1656, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                com.bytedance.android.live.excitingvideoad.d.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, aVar2, com.bytedance.android.live.excitingvideoad.d.a.f8394a, false, 1656, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (i3 > 0 && i4 > 0) {
                Context context = aVar.getContext();
                if (PatchProxy.isSupport(new Object[]{context}, null, c.f8385a, true, 1644, new Class[]{Context.class}, Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, c.f8385a, true, 1644, new Class[]{Context.class}, Integer.TYPE)).intValue();
                } else if (context != null) {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    if (displayMetrics != null) {
                        i2 = displayMetrics.widthPixels;
                    }
                }
                double d2 = (double) i2;
                Double.isNaN(d2);
                double d3 = (double) i3;
                Double.isNaN(d3);
                double d4 = (double) i4;
                Double.isNaN(d4);
                int i5 = (int) (((d2 * 1.0d) / d3) * d4);
                ViewGroup.LayoutParams layoutParams = aVar.f8395b.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i5;
                    aVar.f8395b.setLayoutParams(layoutParams);
                }
            }
        }
        this.f8422d.a(this.f8421c.o, !this.f8421c.b());
        this.v.setText(this.f8421c.f8373c);
        if (TextUtils.isEmpty(this.f8421c.f8374d)) {
            this.w.setVisibility(8);
        } else {
            this.w.setText(this.f8421c.f8374d);
        }
        c();
        if (!this.f8421c.j.equals(PushConstants.EXTRA_APPLICATION_PENDING_INTENT)) {
            this.g.setText(this.f8421c.f8375e);
        } else if (com.bytedance.android.live.excitingvideoad.c.b.a(this.f8420b, this.f8421c.m)) {
            this.g.setText("立即打开");
        } else if (d.a().f8450c == null || !d.a().f8450c.a()) {
            this.g.setText(this.f8421c.f8375e);
        } else {
            this.g.setText("立即安装");
        }
        if (TextUtils.isEmpty(this.f8421c.f8376f)) {
            if (this.h != null) {
                this.h.setVisibility(8);
            }
        } else if (this.y != null) {
            new Object() {
            };
        }
        if (!this.f8421c.h.isEmpty()) {
            b.a().a(this.f8421c.h);
        }
        d.a().a((Context) this.f8420b, "landing_ad", "othershow", this.f8421c.f8372b, "card");
        d.a().a((Context) this.f8420b, "landing_ad", "show", this.f8421c.f8372b, "video");
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f8419a, false, 1597, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f8419a, false, 1597, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        view2.setOnTouchListener(this);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f8419a, false, 1593, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f8419a, false, 1593, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.f8420b = (Activity) getContext();
        this.s = new RelativeLayout(this.f8420b);
        this.s.setBackgroundColor(Color.parseColor("#000000"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.s.setLayoutParams(layoutParams);
        this.t = new com.bytedance.android.live.excitingvideoad.d.a(this.f8420b);
        this.f8422d = new e(this.t);
        this.f8422d.g = this.B;
        this.f8422d.b(true);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(13, -1);
        this.s.addView(this.t, layoutParams2);
        this.f8421c = d.a().f8453f;
        if (PatchProxy.isSupport(new Object[0], this, f8419a, false, 1594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8419a, false, 1594, new Class[0], Void.TYPE);
        } else {
            this.f8423e = new ImageView(this.f8420b);
            this.f8423e.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f8423e.setImageResource(2130838658);
            int a2 = (int) c.a(this.f8420b, 32.0f);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(a2, a2);
            layoutParams3.leftMargin = (int) c.a(this.f8420b, 15.0f);
            layoutParams3.topMargin = (int) c.a(this.f8420b, 23.0f);
            this.f8423e.setLayoutParams(layoutParams3);
            this.f8423e.setVisibility(4);
            this.f8423e.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8425a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f8425a, false, 1607, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f8425a, false, 1607, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (ExcitingVideoFragment.this.m) {
                        ExcitingVideoFragment.this.f8423e.setImageResource(2130838661);
                        ExcitingVideoFragment.this.m = false;
                        d.a().a((Context) ExcitingVideoFragment.this.f8420b, "landing_ad", "vocal", ExcitingVideoFragment.this.f8421c.f8372b, "video");
                    } else {
                        ExcitingVideoFragment.this.f8423e.setImageResource(2130838658);
                        ExcitingVideoFragment.this.m = true;
                        d.a().a((Context) ExcitingVideoFragment.this.f8420b, "landing_ad", "mute", ExcitingVideoFragment.this.f8421c.f8372b, "video");
                    }
                    ExcitingVideoFragment.this.f8422d.b(ExcitingVideoFragment.this.m);
                }
            });
            this.s.addView(this.f8423e);
            ImageView imageView = this.f8423e;
            int a3 = (int) c.a(this.f8420b, 10.0f);
            if (PatchProxy.isSupport(new Object[]{imageView, Integer.valueOf(a3)}, null, c.f8385a, true, 1645, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{imageView, Integer.valueOf(a3)}, null, c.f8385a, true, 1645, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            } else {
                if (PatchProxy.isSupport(new Object[]{imageView, Integer.valueOf(a3), Integer.valueOf(a3), Integer.valueOf(a3), Integer.valueOf(a3)}, null, c.f8385a, true, 1646, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageView, Integer.valueOf(a3), Integer.valueOf(a3), Integer.valueOf(a3), Integer.valueOf(a3)}, null, c.f8385a, true, 1646, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    c.AnonymousClass1 r15 = new Runnable(imageView, a3, a3, a3, a3) {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f8386a;

                        /* renamed from: b */
                        final /* synthetic */ View f8387b;

                        /* renamed from: c */
                        final /* synthetic */ int f8388c;

                        /* renamed from: d */
                        final /* synthetic */ int f8389d;

                        /* renamed from: e */
                        final /* synthetic */ int f8390e;

                        /* renamed from: f */
                        final /* synthetic */ int f8391f;

                        public final void run(
/*
Method generation error in method: com.bytedance.android.live.excitingvideoad.c.c.1.run():void, dex: classes2.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.live.excitingvideoad.c.c.1.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                        
*/
                    };
                    ((View) imageView.getParent()).post(r15);
                }
            }
            this.f8424f = new TextView(this.f8420b);
            this.f8424f.setTextSize(1, 12.0f);
            this.f8424f.setTextColor(Color.parseColor("#ffffff"));
            this.f8424f.setGravity(17);
            this.f8424f.setBackgroundResource(2130838657);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) c.a(this.f8420b, 89.0f), (int) c.a(this.f8420b, 32.0f));
            layoutParams4.topMargin = (int) c.a(this.f8420b, 23.0f);
            layoutParams4.rightMargin = (int) c.a(this.f8420b, 7.0f);
            layoutParams4.addRule(11);
            this.f8424f.setLayoutParams(layoutParams4);
            this.f8424f.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8427a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f8427a, false, 1608, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f8427a, false, 1608, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (!ExcitingVideoFragment.this.k || (!ExcitingVideoFragment.this.l && ExcitingVideoFragment.this.n < ExcitingVideoFragment.this.f8421c.p)) {
                        ExcitingVideoFragment.this.d();
                    } else {
                        ExcitingVideoFragment.this.a();
                    }
                    d.a().a((Context) ExcitingVideoFragment.this.f8420b, "landing_ad", "close", ExcitingVideoFragment.this.f8421c.f8372b, "video");
                }
            });
            this.f8424f.setVisibility(4);
            this.s.addView(this.f8424f);
            View view = new View(this.f8420b);
            view.setBackgroundResource(2130838665);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, (int) c.a(this.f8420b, 100.0f));
            layoutParams5.leftMargin = (int) c.a(this.f8420b, 2.0f);
            layoutParams5.rightMargin = (int) c.a(this.f8420b, 2.0f);
            layoutParams5.bottomMargin = (int) c.a(this.f8420b, 2.0f);
            layoutParams5.addRule(12, -1);
            view.setLayoutParams(layoutParams5);
            this.s.addView(view);
            this.u = new RelativeLayout(this.f8420b);
            this.u.setBackgroundResource(2130838662);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, (int) c.a(this.f8420b, 80.0f));
            layoutParams6.leftMargin = (int) c.a(this.f8420b, 12.0f);
            layoutParams6.rightMargin = (int) c.a(this.f8420b, 12.0f);
            layoutParams6.bottomMargin = (int) c.a(this.f8420b, 12.0f);
            layoutParams6.addRule(12, -1);
            this.u.setLayoutParams(layoutParams6);
            this.s.addView(this.u);
            if (d.a().f8449b != null) {
                this.y = d.a().f8449b.a();
                com.bytedance.android.live.excitingvideoad.f fVar = this.y;
                c.a(this.f8420b, 14.0f);
                this.h = fVar.a();
                this.h.setId(C0906R.id.aas);
                this.x = (int) c.a(this.f8420b, 56.0f);
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(this.x, this.x);
                layoutParams7.addRule(15);
                layoutParams7.leftMargin = (int) c.a(this.f8420b, 12.0f);
                this.h.setLayoutParams(layoutParams7);
                this.u.addView(this.h);
            }
            this.g = new a(this.f8420b);
            this.g.setId(C0906R.id.aat);
            this.g.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8429a;

                public final void onClick(View view) {
                    boolean z;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f8429a, false, 1609, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f8429a, false, 1609, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.live.excitingvideoad.a.b bVar = ExcitingVideoFragment.this.f8421c;
                    if (PatchProxy.isSupport(new Object[0], bVar, com.bytedance.android.live.excitingvideoad.a.a.f8371a, false, 1565, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], bVar, com.bytedance.android.live.excitingvideoad.a.a.f8371a, false, 1565, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        z = "web".equals(bVar.j);
                    }
                    if (z) {
                        if (!ExcitingVideoFragment.this.f8421c.i.isEmpty()) {
                            b.a().a(ExcitingVideoFragment.this.f8421c.i, false);
                        }
                        if (d.a().f8451d != null && (!TextUtils.isEmpty(ExcitingVideoFragment.this.f8421c.k) || !TextUtils.isEmpty(ExcitingVideoFragment.this.f8421c.l))) {
                            ExcitingVideoFragment.this.r = true;
                            d.a().a((Context) ExcitingVideoFragment.this.f8420b, "landing_ad", "click", ExcitingVideoFragment.this.f8421c.f8372b, "card_button");
                        }
                    } else {
                        ExcitingVideoFragment.this.f8421c.a();
                    }
                }
            });
            this.g.setBackgroundResource(2130838663);
            this.g.setTextSize(1, 14.0f);
            this.g.setMinHeight(0);
            this.g.setPadding(0, 0, 0, 0);
            this.g.setTextColor(Color.parseColor("#ffffff"));
            RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams((int) c.a(this.f8420b, 72.0f), (int) c.a(this.f8420b, 28.0f));
            layoutParams8.addRule(15, -1);
            layoutParams8.addRule(11, -1);
            layoutParams8.rightMargin = (int) c.a(this.f8420b, 12.0f);
            this.g.setLayoutParams(layoutParams8);
            this.u.addView(this.g);
            LinearLayout linearLayout = new LinearLayout(this.f8420b);
            RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
            if (this.f8421c == null || TextUtils.isEmpty(this.f8421c.f8376f)) {
                layoutParams9.addRule(9, -1);
            } else {
                layoutParams9.addRule(1, C0906R.id.aas);
            }
            layoutParams9.addRule(0, C0906R.id.aat);
            layoutParams9.rightMargin = (int) c.a(this.f8420b, 15.0f);
            layoutParams9.leftMargin = (int) c.a(this.f8420b, 12.0f);
            layoutParams9.addRule(15, -1);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(layoutParams9);
            this.v = new TextView(this.f8420b);
            this.v.setTextSize(1, 16.0f);
            this.v.setTextColor(Color.parseColor("#222222"));
            this.v.setSingleLine();
            this.v.setEllipsize(TextUtils.TruncateAt.END);
            this.v.getPaint().setFakeBoldText(true);
            this.v.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(this.v);
            this.w = new TextView(this.f8420b);
            this.w.setTextSize(1, 12.0f);
            this.w.setTextColor(Color.parseColor("#505050"));
            this.w.setMaxLines(2);
            this.w.setEllipsize(TextUtils.TruncateAt.END);
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams10.topMargin = (int) c.a(this.f8420b, 0.0f);
            this.w.setLayoutParams(layoutParams10);
            linearLayout.addView(this.w);
            this.u.addView(linearLayout);
            this.u.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8431a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f8431a, false, 1610, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f8431a, false, 1610, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (!ExcitingVideoFragment.this.f8421c.i.isEmpty()) {
                        b.a().a(ExcitingVideoFragment.this.f8421c.i, false);
                    }
                    if (d.a().f8451d == null || (TextUtils.isEmpty(ExcitingVideoFragment.this.f8421c.k) && TextUtils.isEmpty(ExcitingVideoFragment.this.f8421c.l))) {
                        if (d.a().f8450c != null) {
                            ExcitingVideoFragment.this.f8421c.a();
                        }
                        return;
                    }
                    ExcitingVideoFragment.this.r = true;
                    d.a().a((Context) ExcitingVideoFragment.this.f8420b, "landing_ad", "click", ExcitingVideoFragment.this.f8421c.f8372b, "card_other");
                }
            });
        }
        this.o = new View(this.f8420b);
        this.o.setBackgroundColor(Color.parseColor("#4d000000"));
        this.o.setVisibility(8);
        this.s.addView(this.o, layoutParams);
        return this.s;
    }
}
