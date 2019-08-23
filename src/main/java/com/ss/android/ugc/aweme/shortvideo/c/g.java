package com.ss.android.ugc.aweme.shortvideo.c;

import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.filter.d;

public class g implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65880a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.filter.a f65881b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f65882c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f65883d;

    /* renamed from: e  reason: collision with root package name */
    private View f65884e;

    /* renamed from: f  reason: collision with root package name */
    private SeekBar f65885f;
    private SeekBar g;
    private SeekBar h;
    private TextView i;
    private TextView j;
    private TextView k;
    private com.ss.android.ugc.aweme.filter.g l;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65892a;

        /* renamed from: b  reason: collision with root package name */
        public View f65893b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f65894c;

        /* renamed from: d  reason: collision with root package name */
        public com.ss.android.ugc.aweme.filter.a f65895d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f65896e = true;

        /* renamed from: f  reason: collision with root package name */
        public com.ss.android.ugc.aweme.filter.g f65897f;

        public a(@NonNull View view) {
            this.f65893b = view;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f65880a, false, 75221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65880a, false, 75221, new Class[0], Void.TYPE);
            return;
        }
        this.f65884e.setVisibility(4);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65880a, false, 75220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65880a, false, 75220, new Class[0], Void.TYPE);
            return;
        }
        if (this.f65883d) {
            this.i.setCompoundDrawables(null, null, null, null);
            this.i.setText(C0906R.string.i9);
            this.j.setCompoundDrawables(null, null, null, null);
            this.j.setText(C0906R.string.i8);
            this.k.setCompoundDrawables(null, null, null, null);
            if (this.f65882c) {
                this.k.setText(C0906R.string.i_);
            } else {
                this.k.setText(C0906R.string.i4);
            }
        } else {
            this.i.setCompoundDrawablesWithIntrinsicBounds(ActivityCompat.getDrawable(this.f65884e.getContext(), this.l.l), null, null, null);
            this.j.setCompoundDrawablesWithIntrinsicBounds(ActivityCompat.getDrawable(this.f65884e.getContext(), this.l.m), null, null, null);
            if (this.f65882c) {
                this.k.setCompoundDrawablesWithIntrinsicBounds(ActivityCompat.getDrawable(this.f65884e.getContext(), this.l.j), null, null, null);
            } else {
                this.k.setCompoundDrawablesWithIntrinsicBounds(ActivityCompat.getDrawable(this.f65884e.getContext(), this.l.k), null, null, null);
            }
        }
        this.f65884e.setVisibility(0);
    }

    private g(View view, com.ss.android.ugc.aweme.filter.g gVar, boolean z) {
        this.f65883d = true;
        this.f65884e = view;
        this.f65882c = z;
        this.l = gVar;
        this.f65885f = (SeekBar) view.findViewById(C0906R.id.h7);
        this.g = (SeekBar) view.findViewById(C0906R.id.h6);
        this.h = (SeekBar) view.findViewById(C0906R.id.h5);
        this.i = (TextView) view.findViewById(C0906R.id.h_);
        this.j = (TextView) view.findViewById(C0906R.id.h9);
        this.k = (TextView) view.findViewById(C0906R.id.h8);
        this.f65885f.setOnSeekBarChangeListener(new d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65886a;

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (PatchProxy.isSupport(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f65886a, false, 75222, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z)}, this, f65886a, false, 75222, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (g.this.f65881b != null) {
                    int i2 = i;
                    g.this.f65881b.a(i);
                }
            }
        });
        this.g.setOnSeekBarChangeListener(new d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65888a;

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (PatchProxy.isSupport(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f65888a, false, 75223, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z)}, this, f65888a, false, 75223, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (g.this.f65881b != null) {
                    int i2 = i;
                    g.this.f65881b.b(i);
                }
            }
        });
        this.h.setOnSeekBarChangeListener(new d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65890a;

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f65890a, false, 75224, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z)}, this, f65890a, false, 75224, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (g.this.f65881b != null) {
                    if (g.this.f65882c) {
                        g.this.f65881b.d(i);
                        return;
                    }
                    g.this.f65881b.c(i);
                }
            }
        });
        this.f65885f.setMax(gVar.f47592b);
        this.f65885f.setProgress(gVar.f47593c);
        this.g.setMax(gVar.h);
        this.g.setProgress(gVar.i);
        if (this.f65882c) {
            this.h.setMax(gVar.f47596f);
            this.h.setProgress(gVar.g);
            return;
        }
        this.h.setMax(gVar.f47594d);
        this.h.setProgress(gVar.f47595e);
    }

    public /* synthetic */ g(View view, com.ss.android.ugc.aweme.filter.g gVar, boolean z, byte b2) {
        this(view, gVar, z);
    }
}
