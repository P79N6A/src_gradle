package com.ss.android.ugc.aweme.miniapp.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55944a;

    /* renamed from: b  reason: collision with root package name */
    public C0641a f55945b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f55946c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f55947d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f55948e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f55949f;
    private RemoteRoundImageView g;
    private TextView h;
    private TextView i;
    private RemoteImageView j;
    private View.OnClickListener k = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55950a;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f55950a, false, 59617, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f55950a, false, 59617, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            a.this.dismiss();
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.miniapp.views.a$a  reason: collision with other inner class name */
    public static class C0641a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55952a;

        /* renamed from: b  reason: collision with root package name */
        public String f55953b;

        /* renamed from: c  reason: collision with root package name */
        public String f55954c;

        /* renamed from: d  reason: collision with root package name */
        public String f55955d;

        /* renamed from: e  reason: collision with root package name */
        public String f55956e;

        /* renamed from: f  reason: collision with root package name */
        public String f55957f;
        public String g;
        public String h;
        public String i;
        public b j;
        public b k;
        public b l;
        public b m;
        public b n;
        public boolean o = true;
        public View.OnClickListener p;
        public View.OnClickListener q;
        public View.OnClickListener r;

        public final C0641a a(View.OnClickListener onClickListener) {
            this.q = onClickListener;
            return this;
        }

        public final C0641a b(View.OnClickListener onClickListener) {
            this.r = onClickListener;
            return this;
        }

        public final a a(Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f55952a, false, 59618, new Class[]{Context.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{context2}, this, f55952a, false, 59618, new Class[]{Context.class}, a.class);
            }
            a aVar = new a(context2);
            aVar.f55945b = this;
            return aVar;
        }

        public final C0641a a(String str, b bVar) {
            this.f55953b = str;
            this.j = bVar;
            return this;
        }

        public final C0641a b(String str, b bVar) {
            this.f55955d = str;
            this.l = bVar;
            return this;
        }

        public final C0641a c(String str, b bVar) {
            this.g = str;
            this.m = bVar;
            return this;
        }

        public final C0641a d(String str, b bVar) {
            this.h = str;
            this.n = bVar;
            return this;
        }
    }

    public static class b {

        /* renamed from: d  reason: collision with root package name */
        public static final b f55958d = null;

        /* renamed from: a  reason: collision with root package name */
        public boolean f55959a;

        /* renamed from: b  reason: collision with root package name */
        public int f55960b = -1;
        @ColorInt

        /* renamed from: c  reason: collision with root package name */
        public int f55961c;

        public b(boolean z, int i, @ColorInt int i2) {
            this.f55959a = z;
            this.f55961c = i2;
        }
    }

    public a(Context context) {
        super(context, C0906R.style.sv);
    }

    public final void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f55944a, false, 59615, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f55944a, false, 59615, new Class[]{View.OnClickListener.class}, Void.TYPE);
        } else if (this.f55945b != null) {
            this.f55945b.b(onClickListener);
        } else {
            throw new IllegalStateException("You must init Builder first !");
        }
    }

    public final void b(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f55944a, false, 59616, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f55944a, false, 59616, new Class[]{View.OnClickListener.class}, Void.TYPE);
        } else if (this.f55945b != null) {
            this.f55945b.a(onClickListener);
        } else {
            throw new IllegalStateException("You must init Builder first !");
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f55944a, false, 59604, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f55944a, false, 59604, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.art);
        this.f55948e = (TextView) findViewById(C0906R.id.dmv);
        this.f55949f = (TextView) findViewById(C0906R.id.qy);
        this.f55946c = (TextView) findViewById(C0906R.id.dnn);
        this.f55947d = (TextView) findViewById(C0906R.id.dni);
        this.h = (TextView) findViewById(C0906R.id.dnd);
        this.i = (TextView) findViewById(C0906R.id.dnr);
        this.g = (RemoteRoundImageView) findViewById(C0906R.id.asc);
        this.j = (RemoteImageView) findViewById(C0906R.id.d53);
        this.h.setOnClickListener(this.k);
        this.i.setOnClickListener(this.k);
        if (PatchProxy.isSupport(new Object[0], this, f55944a, false, 59605, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55944a, false, 59605, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f55944a, false, 59610, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55944a, false, 59610, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f55945b.f55953b)) {
                this.f55946c.setText(this.f55945b.f55953b);
                b bVar = this.f55945b.j;
                if (bVar != b.f55958d) {
                    if (bVar.f55959a) {
                        this.f55946c.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    if (bVar.f55961c != -1) {
                        this.f55946c.setTextColor(bVar.f55961c);
                    }
                    if (bVar.f55960b != -1) {
                        this.f55946c.setTextSize((float) bVar.f55960b);
                    }
                }
            } else {
                this.f55946c.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, f55944a, false, 59611, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55944a, false, 59611, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f55945b.f55954c)) {
                this.f55947d.setText(this.f55945b.f55954c);
                this.f55947d.setVisibility(0);
                b bVar2 = this.f55945b.k;
                if (bVar2 != b.f55958d) {
                    if (bVar2.f55959a) {
                        this.f55947d.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    if (bVar2.f55961c != -1) {
                        this.f55947d.setTextColor(bVar2.f55961c);
                    }
                    if (bVar2.f55960b != -1) {
                        this.f55947d.setTextSize((float) bVar2.f55960b);
                    }
                }
            } else {
                this.f55947d.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, f55944a, false, 59612, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55944a, false, 59612, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f55945b.f55955d)) {
                this.f55948e.setText(this.f55945b.f55955d);
                this.f55948e.setMovementMethod(new ScrollingMovementMethod());
                b bVar3 = this.f55945b.l;
                if (bVar3 != b.f55958d) {
                    if (bVar3.f55959a) {
                        this.f55948e.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    if (bVar3.f55961c != -1) {
                        this.f55948e.setTextColor(bVar3.f55961c);
                    }
                    if (bVar3.f55960b != -1) {
                        this.f55948e.setTextSize((float) bVar3.f55960b);
                    }
                }
            } else {
                this.f55948e.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, f55944a, false, 59613, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55944a, false, 59613, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f55945b.g)) {
                this.h.setText(this.f55945b.g);
                b bVar4 = this.f55945b.m;
                if (bVar4 != b.f55958d) {
                    if (bVar4.f55959a) {
                        this.h.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    if (bVar4.f55961c != -1) {
                        this.h.setTextColor(bVar4.f55961c);
                    }
                    if (bVar4.f55960b != -1) {
                        this.h.setTextSize((float) bVar4.f55960b);
                    }
                }
            } else {
                this.h.setVisibility(8);
                this.i.setBackgroundResource(2130838203);
            }
            if (PatchProxy.isSupport(new Object[0], this, f55944a, false, 59614, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55944a, false, 59614, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f55945b.h)) {
                this.i.setText(this.f55945b.h);
                b bVar5 = this.f55945b.n;
                if (bVar5 != b.f55958d) {
                    if (bVar5.f55959a) {
                        this.i.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    if (bVar5.f55961c != -1) {
                        this.i.setTextColor(bVar5.f55961c);
                    }
                    if (bVar5.f55960b != -1) {
                        this.i.setTextSize((float) bVar5.f55960b);
                    }
                }
            } else {
                this.i.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, f55944a, false, 59607, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55944a, false, 59607, new Class[0], Void.TYPE);
            } else if (this.f55945b.o) {
                c.a((RemoteImageView) this.g, this.f55945b.f55957f);
            } else {
                this.g.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, f55944a, false, 59609, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55944a, false, 59609, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f55945b.i)) {
                c.a(this.j, this.f55945b.i);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
                layoutParams.topMargin = (int) UIUtils.dip2Px(getContext(), 80.0f);
                this.g.setLayoutParams(layoutParams);
                this.j.setVisibility(0);
            } else {
                this.j.setVisibility(8);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.g.getLayoutParams();
                layoutParams2.topMargin = (int) UIUtils.dip2Px(getContext(), 20.0f);
                this.g.setLayoutParams(layoutParams2);
            }
            if (PatchProxy.isSupport(new Object[0], this, f55944a, false, 59608, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55944a, false, 59608, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f55945b.f55956e)) {
                this.f55949f.setVisibility(0);
                this.f55949f.setText(this.f55945b.f55956e);
                if (this.f55945b.p != null) {
                    this.f55949f.setOnClickListener(this.f55945b.p);
                }
            } else {
                this.f55949f.setVisibility(8);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f55944a, false, 59606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55944a, false, 59606, new Class[0], Void.TYPE);
            return;
        }
        if (this.f55945b.q != null) {
            this.h.setOnClickListener(this.f55945b.q);
        }
        if (this.f55945b.r != null) {
            this.i.setOnClickListener(this.f55945b.r);
        }
    }
}
