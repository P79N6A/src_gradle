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
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.qrcode.c.a;
import com.ss.android.ugc.aweme.qrcode.d;

public class b extends com.ss.android.ugc.aweme.qrcode.f.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63535a;

    /* renamed from: b  reason: collision with root package name */
    private Context f63536b;
    private DmtTextView k;
    private DmtTextView l;
    private DmtTextView m;
    private View n;
    private ImageView o;
    private ImageView p;
    private a q;

    public void setData(String str) {
    }

    public void setQRCodeCardSubtitleColor(int i) {
    }

    public void setQRCodeCardTitleColor(int i) {
    }

    public a getQrCodeInfo() {
        return this.q;
    }

    public b(Context context) {
        this(context, null);
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f63535a, false, 70543, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f63535a, false, 70543, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.q = aVar2;
        b(aVar);
    }

    public void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f63535a, false, 70544, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f63535a, false, 70544, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(this.f63536b, (Throwable) exc2);
        c();
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f63535a, false, 70541, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f63535a, false, 70541, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.a(context);
        this.f63536b = context;
        LayoutInflater.from(context).inflate(C0906R.layout.arh, this, true);
        this.n = findViewById(C0906R.id.c9p);
        this.p = (ImageView) findViewById(C0906R.id.qo);
        this.f63472e = (RemoteImageView) findViewById(C0906R.id.c9n);
        this.k = (DmtTextView) findViewById(C0906R.id.title);
        this.l = (DmtTextView) findViewById(C0906R.id.a3m);
        this.m = (DmtTextView) findViewById(C0906R.id.c88);
        this.o = (ImageView) findViewById(C0906R.id.bkk);
        if (!com.ss.android.g.a.a()) {
            this.o.setImageResource(2130840196);
        }
    }

    public void setData(d dVar) {
        String str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f63535a, false, 70542, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f63535a, false, 70542, new Class[]{d.class}, Void.TYPE);
            return;
        }
        super.setData(dVar);
        this.f63471d.b(dVar2.type, dVar2.objectId);
        this.k.setText(d.a(dVar));
        this.l.setText(d.a(this.f63536b, dVar2));
        DmtTextView dmtTextView = this.m;
        Context context = this.f63536b;
        if (PatchProxy.isSupport(new Object[]{context, dVar2}, null, d.f63539a, true, 70551, new Class[]{Context.class, d.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{context, dVar2}, null, d.f63539a, true, 70551, new Class[]{Context.class, d.class}, String.class);
        } else {
            int i = dVar2.type;
            if (i == 11) {
                str = "";
            } else if (i != 17) {
                if (i != 23) {
                    switch (i) {
                        case 1:
                            str = context.getString(C0906R.string.buq);
                            break;
                        case 2:
                            break;
                        case 3:
                            str = context.getString(C0906R.string.buh);
                            break;
                        case 4:
                            if (!dVar2.isEnterpriseUser) {
                                str = context.getString(C0906R.string.buo);
                                break;
                            } else {
                                str = context.getString(C0906R.string.bue, new Object[]{dVar2.title});
                                break;
                            }
                        case 5:
                            str = "";
                            break;
                        default:
                            switch (i) {
                                case e.l:
                                    str = context.getString(C0906R.string.buj);
                                    break;
                                case 8:
                                    str = "";
                                    break;
                                case 9:
                                    str = "";
                                    break;
                                default:
                                    str = "";
                                    break;
                            }
                    }
                }
                str = context.getString(C0906R.string.buc);
            } else {
                str = context.getString(C0906R.string.bul);
            }
        }
        dmtTextView.setText(str);
        this.p.setImageResource(d.b(dVar));
    }

    private b(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private b(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        a(context);
    }
}
