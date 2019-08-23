package com.ss.android.ugc.aweme.shortvideo.c;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.bj;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import java.util.Map;

public class n implements View.OnClickListener, j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65935a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.filter.a f65936b;

    /* renamed from: c  reason: collision with root package name */
    m f65937c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f65938d;

    /* renamed from: e  reason: collision with root package name */
    int f65939e;

    /* renamed from: f  reason: collision with root package name */
    private View f65940f;
    private AVDmtImageTextView g;
    private AVDmtImageTextView h;
    private AVDmtImageTextView i;
    private AVDmtImageTextView j;
    private AVDmtImageTextView k;
    private SeekBar l;
    private RelativeLayout m;
    private boolean n;
    private AVETParameter o;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65943a;

        /* renamed from: b  reason: collision with root package name */
        public View f65944b;

        /* renamed from: c  reason: collision with root package name */
        public com.ss.android.ugc.aweme.filter.a f65945c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f65946d;

        /* renamed from: e  reason: collision with root package name */
        public m f65947e;

        /* renamed from: f  reason: collision with root package name */
        public AVETParameter f65948f;

        public a(@NonNull View view) {
            this.f65944b = view;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65935a, false, 75255, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65935a, false, 75255, new Class[0], Void.TYPE);
            return;
        }
        this.f65940f.setVisibility(0);
        this.m.setVisibility(0);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f65935a, false, 75256, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65935a, false, 75256, new Class[0], Void.TYPE);
            return;
        }
        this.f65940f.setVisibility(8);
        this.m.setVisibility(8);
        c();
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f65935a, false, 75259, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65935a, false, 75259, new Class[0], Void.TYPE);
        } else if (this.f65938d) {
            this.f65938d = false;
            r.a("select_beautify", (Map) bj.a().a("creation_id", this.o.getCreationId()).a("shoot_way", this.o.getShootWay()).a("tab_name", m.f65931b[this.f65939e]).a("beautify_value", this.f65937c.f65934d[this.f65939e]).a("content_source", this.o.getContentSource()).a("content_type", this.o.getContentType()).a("enter_from", "video_shoot_page").f65805b);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f65935a, false, 75257, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65935a, false, 75257, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.hh) {
            this.l.setProgress((int) ((m.f65932c[this.f65939e] / m.f65933e[this.f65939e]) * 100.0f));
            return;
        }
        c();
        if (PatchProxy.isSupport(new Object[0], this, f65935a, false, 75258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65935a, false, 75258, new Class[0], Void.TYPE);
        } else {
            this.g.a(false);
            this.h.a(false);
            this.i.a(false);
            this.j.a(false);
            this.k.a(false);
        }
        if (id == C0906R.id.hj) {
            this.g.a(true);
            this.f65939e = 0;
        } else if (id == C0906R.id.hi) {
            this.h.a(true);
            this.f65939e = 1;
        } else if (id == C0906R.id.hf) {
            this.i.a(true);
            this.f65939e = 2;
        } else if (id == C0906R.id.hg) {
            this.j.a(true);
            this.f65939e = 3;
        } else if (id == C0906R.id.hd) {
            this.k.a(true);
            this.f65939e = 4;
        }
        if (this.o != null) {
            r.a("click_beautify_tab", (Map) bj.a().a("creation_id", this.o.getCreationId()).a("shoot_way", this.o.getShootWay()).a("tab_name", m.f65931b[this.f65939e]).a("content_source", this.o.getContentSource()).a("content_type", this.o.getContentType()).a("enter_from", "video_shoot_page").f65805b);
        }
        this.l.setProgress(this.f65937c.f65934d[this.f65939e]);
    }

    private n(View view, m mVar, boolean z, @Nullable AVETParameter aVETParameter) {
        this.f65937c = mVar;
        this.n = z;
        this.o = aVETParameter;
        this.f65940f = view.findViewById(C0906R.id.h4);
        this.g = (AVDmtImageTextView) this.f65940f.findViewById(C0906R.id.hj);
        this.h = (AVDmtImageTextView) this.f65940f.findViewById(C0906R.id.hi);
        this.i = (AVDmtImageTextView) this.f65940f.findViewById(C0906R.id.hf);
        this.j = (AVDmtImageTextView) this.f65940f.findViewById(C0906R.id.hg);
        this.k = (AVDmtImageTextView) this.f65940f.findViewById(C0906R.id.hd);
        if (this.n) {
            this.j.setVisibility(0);
            this.k.setVisibility(0);
        }
        TextView textView = (TextView) view.findViewById(C0906R.id.hh);
        if (c.a()) {
            textView.setText("");
            textView.setPadding((int) UIUtils.dip2Px(view.getContext(), 18.0f), 0, 0, 0);
            textView.setCompoundDrawablesWithIntrinsicBounds(2130837717, 0, 0, 0);
        }
        this.l = (SeekBar) view.findViewById(C0906R.id.hc);
        this.m = (RelativeLayout) view.findViewById(C0906R.id.he);
        this.g.a(true);
        this.l.setProgress(this.f65937c.f65934d[this.f65939e]);
        this.g.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.k.setOnClickListener(this);
        textView.setOnClickListener(this);
        this.l.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65941a;

            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
                n.this.f65938d = true;
            }

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                int i2 = i;
                boolean z2 = z;
                if (PatchProxy.isSupport(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f65941a, false, 75260, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z)}, this, f65941a, false, 75260, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                n nVar = n.this;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, nVar, n.f65935a, false, 75254, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    n nVar2 = nVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, nVar2, n.f65935a, false, 75254, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                nVar.f65937c.f65934d[nVar.f65939e] = i2;
                if (nVar.f65936b != null) {
                    if (nVar.f65939e == 0) {
                        com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserChangeSkinLevel, z2);
                        nVar.f65936b.a(i2);
                    } else if (nVar.f65939e == 1) {
                        com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserChangeShapeLevel, z2);
                        nVar.f65936b.b(i2);
                    } else if (nVar.f65939e == 2) {
                        com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserChangeBigEyeLevel, z2);
                        nVar.f65936b.c(i2);
                    } else if (nVar.f65939e == 3) {
                        com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserChangeLipLevel, z2);
                        nVar.f65936b.e(i2);
                    } else if (nVar.f65939e == 4) {
                        com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserChangeBlushLevel, z2);
                        nVar.f65936b.f(i2);
                    }
                }
            }
        });
    }

    public /* synthetic */ n(View view, m mVar, boolean z, AVETParameter aVETParameter, byte b2) {
        this(view, mVar, z, aVETParameter);
    }
}
