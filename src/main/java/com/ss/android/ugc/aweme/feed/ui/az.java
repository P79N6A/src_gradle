package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.model.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import java.util.Map;

public final class az extends PopupWindow implements View.OnClickListener, com.ss.android.ugc.aweme.common.widget.scrollablelayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46535a;

    /* renamed from: b  reason: collision with root package name */
    public int f46536b = 4000;

    /* renamed from: c  reason: collision with root package name */
    public boolean f46537c = false;

    /* renamed from: d  reason: collision with root package name */
    public a f46538d;

    /* renamed from: e  reason: collision with root package name */
    public long f46539e = 0;

    /* renamed from: f  reason: collision with root package name */
    public Activity f46540f;
    public LinearLayout g;
    private PullUpLayout h;
    private View i = ((LayoutInflater) k.a().getSystemService("layout_inflater")).inflate(C0906R.layout.abw, null);
    private RemoteImageView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private Aweme n;
    private View o;
    private RemoteImageView p;
    private TextView q;
    private View r;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46545a;

        /* renamed from: b  reason: collision with root package name */
        boolean f46546b;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f46545a, false, 42986, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46545a, false, 42986, new Class[0], Void.TYPE);
                return;
            }
            if (!this.f46546b && System.currentTimeMillis() >= az.this.f46539e) {
                az.this.c();
            }
        }

        private a() {
        }

        /* synthetic */ a(az azVar, byte b2) {
            this();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46535a, false, 42976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46535a, false, 42976, new Class[0], Void.TYPE);
            return;
        }
        this.f46537c = false;
        c();
    }

    private void d() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f46535a, false, 42974, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46535a, false, 42974, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f46535a, false, 42973, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f46535a, false, 42973, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.n == null || this.n.getCommerceStickerInfo() == null || !this.n.getCommerceStickerInfo().enable()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            g commerceStickerInfo = this.n.getCommerceStickerInfo();
            this.o.setVisibility(0);
            this.r.setVisibility(0);
            c.a(this.p, commerceStickerInfo.getIconUrl(), (int) UIUtils.dip2Px(this.f46540f, 23.0f), (int) UIUtils.dip2Px(this.f46540f, 23.0f));
            this.q.setText(commerceStickerInfo.getLetters());
            this.o.setOnClickListener(new ba(commerceStickerInfo));
            r.a("show_link", (Map) d.a().a("prop_id", commerceStickerInfo.getCommerceStickerId()).a("enter_from", "release").a("link_type", "web_link").f34114b);
            return;
        }
        this.o.setVisibility(8);
        this.r.setVisibility(8);
    }

    public final void b() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f46535a, false, 42972, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46535a, false, 42972, new Class[0], Void.TYPE);
            return;
        }
        this.h.a();
        if (this.f46540f != null && !this.f46540f.isFinishing() && !isShowing()) {
            this.f46539e = System.currentTimeMillis() + ((long) this.f46536b);
            this.h.postDelayed(this.f46538d, (long) this.f46536b);
            if (this.i.getParent() != null) {
                ((ViewGroup) this.i.getParent()).removeView(this.i);
            }
            View decorView = this.f46540f.getWindow().getDecorView();
            if (Build.VERSION.SDK_INT >= 19) {
                i2 = -UIUtils.getStatusBarHeight(k.a());
            } else {
                i2 = UIUtils.getStatusBarHeight(k.a());
            }
            showAtLocation(decorView, 48, 0, i2);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f46535a, false, 42977, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46535a, false, 42977, new Class[0], Void.TYPE);
            return;
        }
        if (isShowing() && !this.f46537c) {
            try {
                if (this.f46540f != null && !this.f46540f.isFinishing()) {
                    this.h.a(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
            this.f46540f = null;
        }
    }

    public az() {
        super(k.a());
        boolean z;
        View view = this.i;
        if (PatchProxy.isSupport(new Object[]{view}, this, f46535a, false, 42970, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46535a, false, 42970, new Class[]{View.class}, Void.TYPE);
        } else {
            this.p = (RemoteImageView) view.findViewById(C0906R.id.b03);
            this.q = (TextView) view.findViewById(C0906R.id.d_t);
            this.o = view.findViewById(C0906R.id.bg1);
            this.r = view.findViewById(C0906R.id.bbs);
            this.j = (RemoteImageView) view.findViewById(C0906R.id.b2f);
            this.g = (LinearLayout) view.findViewById(C0906R.id.cgb);
            this.h = (PullUpLayout) view.findViewById(C0906R.id.c92);
            this.k = (TextView) view.findViewById(C0906R.id.l8);
            this.l = (TextView) view.findViewById(C0906R.id.dl_);
            this.m = (TextView) view.findViewById(C0906R.id.dat);
            this.h.a((View) this.g, false);
            this.h.setPullUpListener(this);
            this.j.setOnClickListener(this);
            this.h.setInternalTouchEventListener(new PullUpLayout.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46541a;

                public final void a(MotionEvent motionEvent) {
                    if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46541a, false, 42984, new Class[]{MotionEvent.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46541a, false, 42984, new Class[]{MotionEvent.class}, Void.TYPE);
                        return;
                    }
                    switch (motionEvent.getAction()) {
                        case 0:
                            az.this.f46537c = true;
                            if (az.this.f46538d != null) {
                                az.this.f46538d.f46546b = true;
                                return;
                            }
                            break;
                        case 1:
                            az.this.f46537c = false;
                            az.this.f46539e = System.currentTimeMillis() + ((long) az.this.f46536b);
                            az.this.f46538d.f46546b = false;
                            az.this.g.postDelayed(az.this.f46538d, (long) az.this.f46536b);
                            break;
                        case 2:
                            az.this.f46537c = true;
                            return;
                    }
                }
            });
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.d.a.f41033a, true, 25620, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.d.a.f41033a, true, 25620, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                boolean z2 = com.ss.android.ugc.aweme.d.a.f41034b;
                com.ss.android.ugc.aweme.d.a.f41034b = false;
                if (!z2 || !com.ss.android.ugc.aweme.d.d.a()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                this.k.setVisibility(0);
                this.l.setText(C0906R.string.mn);
                this.m.setText(C0906R.string.mo);
                this.l.getParent().requestLayout();
                this.k.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f46543a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f46543a, false, 42985, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f46543a, false, 42985, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        com.ss.android.ugc.aweme.d.d.a((Context) az.this.f46540f, "post");
                    }
                });
            }
            if (com.ss.android.g.a.a()) {
                this.g.setBackgroundColor(this.f46540f.getResources().getColor(C0906R.color.a12));
            } else {
                this.g.setBackgroundResource(2130838269);
            }
        }
        this.f46538d = new a(this, (byte) 0);
        setBackgroundDrawable(new ColorDrawable(0));
        if (PatchProxy.isSupport(new Object[0], this, f46535a, false, 42971, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46535a, false, 42971, new Class[0], Void.TYPE);
            return;
        }
        setContentView(this.i);
        setWidth(UIUtils.getScreenWidth(k.a()));
        setHeight(-2);
        update();
        setAnimationStyle(C0906R.style.tw);
    }

    private void b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f46535a, false, 42981, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f46535a, false, 42981, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        c.a(this.j, aweme.getVideo().getCover(), (int) UIUtils.dip2Px(this.f46540f, 49.0f), (int) UIUtils.dip2Px(this.f46540f, 59.0f));
    }

    private void c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f46535a, false, 42982, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f46535a, false, 42982, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        c.a(this.j, aweme.getImageInfos().get(0).getLabelThumb(), (int) UIUtils.dip2Px(this.f46540f, 49.0f), (int) UIUtils.dip2Px(this.f46540f, 59.0f));
    }

    public final void a(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f46535a, false, 42980, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, f46535a, false, 42980, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.n = com.ss.android.ugc.aweme.feed.a.a().a(aweme2);
        if (aweme.getVideo() != null) {
            b(aweme);
        } else if (aweme.getImageInfos() != null && aweme.getImageInfos().size() > 0) {
            c(aweme);
        }
        d();
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46535a, false, 42978, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46535a, false, 42978, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.b2f) {
            h a2 = h.a();
            Activity activity = this.f46540f;
            a2.a(activity, j.a("aweme://aweme/detail/" + this.n.getAid()).a("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "upload").a("profile_enterprise_type", this.n.getEnterpriseType()).a());
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setPublishStatus(11);
            c();
        }
    }
}
