package com.ss.android.ugc.aweme.qrcode.v2;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.qrcode.c.a;
import com.ss.android.ugc.aweme.qrcode.d;
import com.ss.android.ugc.aweme.qrcode.f.b;

public class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63537a;

    /* renamed from: b  reason: collision with root package name */
    private Context f63538b;
    private DmtTextView k;
    private DmtTextView l;
    private DmtTextView m;
    private View n;
    private ImageView o;
    private ImageView p;

    public void setData(String str) {
    }

    public void setQRCodeCardSubtitleColor(int i) {
    }

    public void setQRCodeCardTitleColor(int i) {
    }

    public c(Context context) {
        this(context, null);
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63537a, false, 70548, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f63537a, false, 70548, new Class[]{a.class}, Void.TYPE);
            return;
        }
        b(aVar);
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f63537a, false, 70549, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f63537a, false, 70549, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(this.f63538b, (Throwable) exc2);
        c();
    }

    public void setData(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f63537a, false, 70546, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f63537a, false, 70546, new Class[]{d.class}, Void.TYPE);
            return;
        }
        super.setData(dVar);
        this.f63471d.b(dVar.type, dVar.objectId);
        this.k.setText(d.a(dVar));
        this.l.setText(d.a(this.f63538b, dVar));
        this.m.setText(d.b(this.f63538b, dVar));
        this.p.setImageResource(d.b(dVar));
    }

    public void setParams(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f63537a, false, 70547, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f63537a, false, 70547, new Class[]{d.class}, Void.TYPE);
            return;
        }
        this.g = dVar;
        this.k.setText(d.a(dVar));
        this.l.setText(d.a(this.f63538b, dVar));
        this.m.setText(d.b(this.f63538b, dVar));
        this.p.setImageResource(d.b(dVar));
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f63537a, false, 70545, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f63537a, false, 70545, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.a(context);
        this.f63538b = context;
        LayoutInflater.from(context).inflate(C0906R.layout.ari, this, true);
        this.n = findViewById(C0906R.id.c9p);
        this.p = (ImageView) findViewById(C0906R.id.qo);
        this.f63472e = (RemoteImageView) findViewById(C0906R.id.c9n);
        this.k = (DmtTextView) findViewById(C0906R.id.title);
        this.l = (DmtTextView) findViewById(C0906R.id.a3m);
        this.m = (DmtTextView) findViewById(C0906R.id.c88);
        this.o = (ImageView) findViewById(C0906R.id.bkk);
        if (!com.ss.android.g.a.a()) {
            this.o.setImageResource(2130840186);
        }
    }

    private c(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private c(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        a(context);
    }
}
