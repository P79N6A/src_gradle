package com.bytedance.android.livesdk.share;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class StartLiveShareView extends a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f17203f;
    private static final /* synthetic */ a.C0900a q;
    ImageView g;
    ImageView h;
    ImageView i;
    ImageView j;
    ImageView k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    static {
        if (PatchProxy.isSupport(new Object[0], null, f17203f, true, 13304, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f17203f, true, 13304, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("StartLiveShareView.java", StartLiveShareView.class);
        q = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.share.StartLiveShareView", "android.view.View", NotifyType.VIBRATE, "", "void"), 74);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f17203f, false, 13301, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17203f, false, 13301, new Class[0], Void.TYPE);
        } else if (a("weixin_moment") && !this.n) {
            this.f17206b = "weixin_moment";
            this.i.setImageResource(2130841373);
        } else if (!a("qzone") || this.o) {
            if (a("weibo") && !this.m) {
                this.f17206b = "weibo";
                this.j.setImageResource(2130841393);
            }
        } else {
            this.f17206b = "qzone";
            this.k.setImageResource(2130841381);
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f17203f, false, 13302, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17203f, false, 13302, new Class[0], Void.TYPE);
            return;
        }
        this.g.setImageResource(2130841390);
        this.h.setImageResource(2130841378);
        this.i.setImageResource(2130841372);
        this.j.setImageResource(2130841392);
        this.k.setImageResource(2130841380);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17203f, false, 13293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17203f, false, 13293, new Class[0], Void.TYPE);
            return;
        }
        inflate(getContext(), C0906R.layout.any, this);
        this.g = (ImageView) findViewById(C0906R.id.dxg);
        this.i = (ImageView) findViewById(C0906R.id.dxf);
        this.h = (ImageView) findViewById(C0906R.id.c9l);
        this.j = (ImageView) findViewById(C0906R.id.dxc);
        this.k = (ImageView) findViewById(C0906R.id.c9x);
        this.g.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.k.setOnClickListener(this);
        boolean booleanValue = ((Boolean) com.bytedance.android.livesdk.config.a.Q.a()).booleanValue();
        this.l = booleanValue;
        if (booleanValue) {
            this.j.setVisibility(8);
        }
        boolean booleanValue2 = ((Boolean) com.bytedance.android.livesdk.config.a.S.a()).booleanValue();
        this.m = booleanValue2;
        if (booleanValue2) {
            this.g.setVisibility(8);
        }
        boolean booleanValue3 = ((Boolean) com.bytedance.android.livesdk.config.a.T.a()).booleanValue();
        this.n = booleanValue3;
        if (booleanValue3) {
            this.i.setVisibility(8);
        }
        boolean booleanValue4 = ((Boolean) com.bytedance.android.livesdk.config.a.R.a()).booleanValue();
        this.o = booleanValue4;
        if (booleanValue4) {
            this.k.setVisibility(8);
        }
        boolean booleanValue5 = ((Boolean) com.bytedance.android.livesdk.config.a.U.a()).booleanValue();
        this.p = booleanValue5;
        if (booleanValue5) {
            this.h.setVisibility(8);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f17203f, false, 13300, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17203f, false, 13300, new Class[0], Void.TYPE);
            return;
        }
        String str = (String) com.bytedance.android.livesdk.w.b.r.a();
        boolean booleanValue = ((Boolean) com.bytedance.android.livesdk.w.b.s.a()).booleanValue();
        com.bytedance.android.livesdk.w.b.s.a(Boolean.FALSE);
        if (!booleanValue) {
            if (StringUtils.equal(str, "qq") && !this.p) {
                if (a("qq")) {
                    this.f17206b = "qq";
                    this.h.setImageResource(2130841379);
                } else {
                    c();
                }
                this.f17209e.b(this.f17206b);
            } else if (StringUtils.equal(str, "qzone") && !this.p) {
                if (a("qzone")) {
                    this.f17206b = "qzone";
                    this.k.setImageResource(2130841381);
                } else {
                    c();
                }
                this.f17209e.b(this.f17206b);
            } else if (StringUtils.equal(str, "weixin") && !this.m) {
                if (a("weixin")) {
                    this.f17206b = "weixin";
                    this.g.setImageResource(2130841391);
                } else {
                    c();
                }
                this.f17209e.b(this.f17206b);
            } else if (!StringUtils.equal(str, "weixin_moment") || this.n) {
                if (StringUtils.equal(str, "weibo") && !this.l) {
                    if (a("weibo")) {
                        this.f17206b = "weibo";
                        this.j.setImageResource(2130841393);
                    }
                }
                this.f17209e.b(this.f17206b);
            } else {
                if (a("weixin_moment")) {
                    this.f17206b = "weixin_moment";
                    this.i.setImageResource(2130841373);
                } else {
                    c();
                }
                this.f17209e.b(this.f17206b);
            }
        }
        c();
        this.f17209e.b(this.f17206b);
    }

    public StartLiveShareView(Context context) {
        super(context);
    }

    private boolean a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f17203f, false, 13303, new Class[]{String.class}, Boolean.TYPE)) {
            return this.f17208d.a(this.f17207c, str);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f17203f, false, 13303, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17203f, false, 13294, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17203f, false, 13294, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(q, this, this, view));
        int id = view.getId();
        if (id == C0906R.id.dxg) {
            if (PatchProxy.isSupport(new Object[0], this, f17203f, false, 13295, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f17203f, false, 13295, new Class[0], Void.TYPE);
            } else if (!a("weixin")) {
                com.bytedance.android.live.uikit.d.a.a((Context) this.f17207c, (int) C0906R.string.dlu);
            } else {
                d();
                if (!"weixin".equals(this.f17206b)) {
                    this.f17206b = "weixin";
                    this.g.setImageResource(2130841391);
                } else {
                    this.g.setImageResource(2130841390);
                    this.f17206b = null;
                }
                f.a((Context) this.f17207c);
            }
        } else if (id == C0906R.id.dxf) {
            if (PatchProxy.isSupport(new Object[0], this, f17203f, false, 13296, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f17203f, false, 13296, new Class[0], Void.TYPE);
            } else if (!a("weixin_moment")) {
                com.bytedance.android.live.uikit.d.a.a((Context) this.f17207c, (int) C0906R.string.dlu);
            } else {
                d();
                if (!"weixin_moment".equals(this.f17206b)) {
                    this.f17206b = "weixin_moment";
                    this.i.setImageResource(2130841373);
                } else {
                    this.i.setImageResource(2130841372);
                    this.f17206b = null;
                }
                f.a((Context) this.f17207c);
            }
        } else if (id == C0906R.id.c9l) {
            if (PatchProxy.isSupport(new Object[0], this, f17203f, false, 13297, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f17203f, false, 13297, new Class[0], Void.TYPE);
            } else if (!a("qq")) {
                com.bytedance.android.live.uikit.d.a.a((Context) this.f17207c, (int) C0906R.string.dhx);
            } else {
                d();
                if (!"qq".equals(this.f17206b)) {
                    this.f17206b = "qq";
                    this.h.setImageResource(2130841379);
                } else {
                    this.h.setImageResource(2130841378);
                    this.f17206b = null;
                }
                f.a((Context) this.f17207c);
            }
        } else if (id == C0906R.id.dxc) {
            if (PatchProxy.isSupport(new Object[0], this, f17203f, false, 13298, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f17203f, false, 13298, new Class[0], Void.TYPE);
            } else if (!a("weibo")) {
                com.bytedance.android.live.uikit.d.a.a((Context) this.f17207c, (int) C0906R.string.dlt);
            } else {
                d();
                if (!"weibo".equals(this.f17206b)) {
                    this.f17206b = "weibo";
                    this.j.setImageResource(2130841393);
                } else {
                    this.j.setImageResource(2130841392);
                    this.f17206b = null;
                }
                f.a((Context) this.f17207c);
            }
        } else if (id == C0906R.id.c9x) {
            if (PatchProxy.isSupport(new Object[0], this, f17203f, false, 13299, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f17203f, false, 13299, new Class[0], Void.TYPE);
            } else if (!a("qzone")) {
                com.bytedance.android.live.uikit.d.a.a((Context) this.f17207c, (int) C0906R.string.dhx);
            } else {
                d();
                if (!"qzone".equals(this.f17206b)) {
                    this.f17206b = "qzone";
                    this.k.setImageResource(2130841381);
                } else {
                    this.k.setImageResource(2130841380);
                    this.f17206b = null;
                }
                f.a((Context) this.f17207c);
            }
        }
        com.bytedance.android.livesdk.w.b.r.a(this.f17206b);
        super.onClick(view);
    }

    public StartLiveShareView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StartLiveShareView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
