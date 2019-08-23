package com.bytedance.android.livesdk.wallet;

import android.annotation.SuppressLint;
import android.support.annotation.DrawableRes;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.livesdkapi.host.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17968a;
    @IgnoreStyleCheck

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f17969b;
    @IgnoreStyleCheck

    /* renamed from: c  reason: collision with root package name */
    public ImageView f17970c;
    @IgnoreStyleCheck

    /* renamed from: d  reason: collision with root package name */
    public TextView f17971d;
    @IgnoreStyleCheck

    /* renamed from: e  reason: collision with root package name */
    public TextView f17972e;
    @IgnoreStyleCheck

    /* renamed from: f  reason: collision with root package name */
    public TextView f17973f;
    @IgnoreStyleCheck
    public TextView g;
    @IgnoreStyleCheck
    public CheckBox h;
    @IgnoreStyleCheck
    public View i;
    @IgnoreStyleCheck
    public long j;
    @DrawableRes
    int k;
    @DrawableRes
    int l;
    String m;
    @IgnoreStyleCheck
    public String n;
    @IgnoreStyleCheck
    public String o;
    @IgnoreStyleCheck
    public boolean p;
    @IgnoreStyleCheck
    public r q;
    public String r;
    public a s;

    public interface a {
        void a(b bVar, boolean z);
    }

    public abstract boolean a();

    public abstract void b();

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f17968a, false, 13880, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f17968a, false, 13880, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int childCount = this.f17969b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.f17969b.getChildAt(i2).setEnabled(false);
        }
        if (z) {
            this.f17970c.setImageResource(this.k);
        } else {
            this.f17970c.setImageResource(this.l);
        }
    }

    @SuppressLint({"ResourceType"})
    public final void a(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f17968a, false, 13879, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f17968a, false, 13879, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        this.f17969b = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ak1, viewGroup, false);
        this.f17970c = (ImageView) this.f17969b.findViewById(C0906R.id.b3t);
        this.f17971d = (TextView) this.f17969b.findViewById(C0906R.id.dfz);
        this.f17972e = (TextView) this.f17969b.findViewById(C0906R.id.dfx);
        this.f17973f = (TextView) this.f17969b.findViewById(C0906R.id.dfy);
        this.g = (TextView) this.f17969b.findViewById(C0906R.id.dh7);
        this.h = (CheckBox) this.f17969b.findViewById(C0906R.id.sb);
        this.i = this.f17969b.findViewById(C0906R.id.a5u);
        this.f17970c.setBackgroundResource(this.k);
        this.f17971d.setText(this.m);
        this.f17972e.setText(this.n);
        if (!TextUtils.isEmpty(this.o)) {
            this.f17973f.setVisibility(0);
            this.f17973f.setText(this.o);
        }
        if (this.p) {
            this.g.setVisibility(0);
        }
        if (!a()) {
            a(false);
        }
        this.f17969b.setOnClickListener(new c(this));
        if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.f() || com.bytedance.android.live.uikit.a.a.b()) {
            this.i.setVisibility(8);
            if (this.p) {
                this.g.setText(this.r);
            }
        }
        b();
        viewGroup.addView(this.f17969b);
    }

    public b(long j2, int i2, int i3, String str, r rVar) {
        this.j = j2;
        this.k = i2;
        this.l = i3;
        this.m = str;
        this.q = rVar;
    }
}
