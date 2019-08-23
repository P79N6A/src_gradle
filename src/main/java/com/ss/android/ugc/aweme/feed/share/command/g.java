package com.ss.android.ugc.aweme.feed.share.command;

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
import com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView;

public class g extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45948a;

    /* renamed from: b  reason: collision with root package name */
    public a f45949b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f45950c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f45951d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f45952e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f45953f;
    private RemoteRoundImageView g;
    private TextView h;
    private TextView i;
    private RemoteImageView j;
    private View.OnClickListener k = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45954a;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f45954a, false, 42198, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f45954a, false, 42198, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            g.this.dismiss();
        }
    };

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45956a;

        /* renamed from: b  reason: collision with root package name */
        public String f45957b;

        /* renamed from: c  reason: collision with root package name */
        public String f45958c;

        /* renamed from: d  reason: collision with root package name */
        public String f45959d;

        /* renamed from: e  reason: collision with root package name */
        public String f45960e;

        /* renamed from: f  reason: collision with root package name */
        public String f45961f;
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
    }

    public static class b {

        /* renamed from: d  reason: collision with root package name */
        public static final b f45962d = null;

        /* renamed from: a  reason: collision with root package name */
        public boolean f45963a;

        /* renamed from: b  reason: collision with root package name */
        public int f45964b;
        @ColorInt

        /* renamed from: c  reason: collision with root package name */
        public int f45965c;
    }

    public g(Context context) {
        super(context, C0906R.style.su);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f45948a, false, 42185, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f45948a, false, 42185, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.ars);
        this.f45952e = (TextView) findViewById(C0906R.id.dmv);
        this.f45953f = (TextView) findViewById(C0906R.id.qy);
        this.f45950c = (TextView) findViewById(C0906R.id.dnn);
        this.f45951d = (TextView) findViewById(C0906R.id.dni);
        this.h = (TextView) findViewById(C0906R.id.dnd);
        this.i = (TextView) findViewById(C0906R.id.dnr);
        this.g = (RemoteRoundImageView) findViewById(C0906R.id.asc);
        this.j = (RemoteImageView) findViewById(C0906R.id.d53);
        this.h.setOnClickListener(this.k);
        this.i.setOnClickListener(this.k);
        if (PatchProxy.isSupport(new Object[0], this, f45948a, false, 42186, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45948a, false, 42186, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f45948a, false, 42191, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45948a, false, 42191, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f45949b.f45957b)) {
                this.f45950c.setText(this.f45949b.f45957b);
                b bVar = this.f45949b.j;
                if (bVar != b.f45962d) {
                    if (bVar.f45963a) {
                        this.f45950c.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    if (bVar.f45965c != -1) {
                        this.f45950c.setTextColor(bVar.f45965c);
                    }
                    if (bVar.f45964b != -1) {
                        this.f45950c.setTextSize((float) bVar.f45964b);
                    }
                }
            } else {
                this.f45950c.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, f45948a, false, 42192, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45948a, false, 42192, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f45949b.f45958c)) {
                this.f45951d.setText(this.f45949b.f45958c);
                this.f45951d.setVisibility(0);
                b bVar2 = this.f45949b.k;
                if (bVar2 != b.f45962d) {
                    if (bVar2.f45963a) {
                        this.f45951d.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    if (bVar2.f45965c != -1) {
                        this.f45951d.setTextColor(bVar2.f45965c);
                    }
                    if (bVar2.f45964b != -1) {
                        this.f45951d.setTextSize((float) bVar2.f45964b);
                    }
                }
            } else {
                this.f45951d.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, f45948a, false, 42193, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45948a, false, 42193, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f45949b.f45959d)) {
                this.f45952e.setText(this.f45949b.f45959d);
                this.f45952e.setMovementMethod(new ScrollingMovementMethod());
                b bVar3 = this.f45949b.l;
                if (bVar3 != b.f45962d) {
                    if (bVar3.f45963a) {
                        this.f45952e.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    if (bVar3.f45965c != -1) {
                        this.f45952e.setTextColor(bVar3.f45965c);
                    }
                    if (bVar3.f45964b != -1) {
                        this.f45952e.setTextSize((float) bVar3.f45964b);
                    }
                }
            } else {
                this.f45952e.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, f45948a, false, 42194, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45948a, false, 42194, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f45949b.g)) {
                this.h.setText(this.f45949b.g);
                b bVar4 = this.f45949b.m;
                if (bVar4 != b.f45962d) {
                    if (bVar4.f45963a) {
                        this.h.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    if (bVar4.f45965c != -1) {
                        this.h.setTextColor(bVar4.f45965c);
                    }
                    if (bVar4.f45964b != -1) {
                        this.h.setTextSize((float) bVar4.f45964b);
                    }
                }
            } else {
                this.h.setVisibility(8);
                this.i.setBackgroundResource(2130838202);
            }
            if (PatchProxy.isSupport(new Object[0], this, f45948a, false, 42195, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45948a, false, 42195, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f45949b.h)) {
                this.i.setText(this.f45949b.h);
                b bVar5 = this.f45949b.n;
                if (bVar5 != b.f45962d) {
                    if (bVar5.f45963a) {
                        this.i.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    if (bVar5.f45965c != -1) {
                        this.i.setTextColor(bVar5.f45965c);
                    }
                    if (bVar5.f45964b != -1) {
                        this.i.setTextSize((float) bVar5.f45964b);
                    }
                }
            } else {
                this.i.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, f45948a, false, 42188, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45948a, false, 42188, new Class[0], Void.TYPE);
            } else if (this.f45949b.o) {
                c.a((RemoteImageView) this.g, this.f45949b.f45961f);
            } else {
                this.g.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, f45948a, false, 42190, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45948a, false, 42190, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f45949b.i)) {
                c.a(this.j, this.f45949b.i);
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
            if (PatchProxy.isSupport(new Object[0], this, f45948a, false, 42189, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45948a, false, 42189, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f45949b.f45960e)) {
                this.f45953f.setVisibility(0);
                this.f45953f.setText(this.f45949b.f45960e);
                if (this.f45949b.p != null) {
                    this.f45953f.setOnClickListener(this.f45949b.p);
                }
            } else {
                this.f45953f.setVisibility(8);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f45948a, false, 42187, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45948a, false, 42187, new Class[0], Void.TYPE);
            return;
        }
        if (this.f45949b.q != null) {
            this.h.setOnClickListener(this.f45949b.q);
        }
        if (this.f45949b.r != null) {
            this.i.setOnClickListener(this.f45949b.r);
        }
    }
}
