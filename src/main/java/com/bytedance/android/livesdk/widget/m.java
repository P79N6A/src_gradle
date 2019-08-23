package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.widget.n;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class m extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18498a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f18499b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f18500c;

    /* renamed from: d  reason: collision with root package name */
    public Button f18501d;

    /* renamed from: e  reason: collision with root package name */
    public View f18502e;

    /* renamed from: f  reason: collision with root package name */
    public Animation f18503f;
    private HSImageView g;
    private Button h;
    private Button i;

    public static class a implements n.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18514a;

        /* renamed from: b  reason: collision with root package name */
        public c f18515b;

        public final m a() {
            if (!PatchProxy.isSupport(new Object[0], this, f18514a, false, 14444, new Class[0], m.class)) {
                return new m(this.f18515b.f18520b, this.f18515b, (byte) 0);
            }
            return (m) PatchProxy.accessDispatch(new Object[0], this, f18514a, false, 14444, new Class[0], m.class);
        }

        /* renamed from: b */
        public final m c() {
            if (PatchProxy.isSupport(new Object[0], this, f18514a, false, 14445, new Class[0], m.class)) {
                return (m) PatchProxy.accessDispatch(new Object[0], this, f18514a, false, 14445, new Class[0], m.class);
            }
            m a2 = a();
            a2.show();
            return a2;
        }

        public a(Context context) {
            this(context, 0);
        }

        public final a a(DialogInterface.OnDismissListener onDismissListener) {
            this.f18515b.j = onDismissListener;
            return this;
        }

        /* renamed from: b */
        public final a c(CharSequence charSequence) {
            this.f18515b.f18523e = charSequence;
            return this;
        }

        public final a a(CharSequence charSequence) {
            this.f18515b.f18522d = charSequence;
            return this;
        }

        public final a a(boolean z) {
            this.f18515b.l = z;
            return this;
        }

        /* renamed from: a */
        public final a d(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18514a, false, 14438, new Class[]{Integer.TYPE}, a.class)) {
                return a(this.f18515b.f18520b.getText(i));
            }
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18514a, false, 14438, new Class[]{Integer.TYPE}, a.class);
        }

        /* renamed from: b */
        public final a c(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18514a, false, 14439, new Class[]{Integer.TYPE}, a.class)) {
                return c(this.f18515b.f18520b.getText(i));
            }
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18514a, false, 14439, new Class[]{Integer.TYPE}, a.class);
        }

        public final m b(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f18514a, false, 14446, new Class[]{Boolean.TYPE}, m.class)) {
                return (m) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f18514a, false, 14446, new Class[]{Boolean.TYPE}, m.class);
            } else if (!z) {
                return c();
            } else {
                m a2 = a();
                if (Build.VERSION.SDK_INT >= 26) {
                    a2.getWindow().setType(2038);
                } else {
                    a2.getWindow().setType(2002);
                }
                a2.show();
                return a2;
            }
        }

        public a(Context context, int i) {
            this.f18515b = new c((byte) 0);
            this.f18515b.f18520b = context;
            this.f18515b.f18519a = i;
        }

        /* renamed from: a */
        public final a b(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            DialogInterface.OnClickListener onClickListener2 = onClickListener;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), onClickListener2}, this, f18514a, false, 14440, new Class[]{Integer.TYPE, Integer.TYPE, DialogInterface.OnClickListener.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), onClickListener2}, this, f18514a, false, 14440, new Class[]{Integer.TYPE, Integer.TYPE, DialogInterface.OnClickListener.class}, a.class);
            }
            int i3 = i2;
            int i4 = i;
            return a(i, this.f18515b.f18520b.getText(i2), onClickListener2);
        }

        public final a a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            int i2 = i;
            CharSequence charSequence2 = charSequence;
            DialogInterface.OnClickListener onClickListener2 = onClickListener;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), charSequence2, onClickListener2}, this, f18514a, false, 14441, new Class[]{Integer.TYPE, CharSequence.class, DialogInterface.OnClickListener.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), charSequence2, onClickListener2}, this, f18514a, false, 14441, new Class[]{Integer.TYPE, CharSequence.class, DialogInterface.OnClickListener.class}, a.class);
            } else if (i2 > 4) {
                return this;
            } else {
                b bVar = this.f18515b.h[i2];
                if (bVar == null) {
                    bVar = new b((byte) 0);
                    this.f18515b.h[i2] = bVar;
                }
                bVar.f18516a = i2;
                bVar.f18517b = charSequence2;
                bVar.f18518c = onClickListener2;
                return this;
            }
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        int f18516a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f18517b;

        /* renamed from: c  reason: collision with root package name */
        DialogInterface.OnClickListener f18518c;

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        int f18519a;

        /* renamed from: b  reason: collision with root package name */
        Context f18520b;

        /* renamed from: c  reason: collision with root package name */
        Uri f18521c;

        /* renamed from: d  reason: collision with root package name */
        CharSequence f18522d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f18523e;

        /* renamed from: f  reason: collision with root package name */
        public View f18524f;
        View g;
        b[] h;
        DialogInterface.OnCancelListener i;
        DialogInterface.OnDismissListener j;
        DialogInterface.OnShowListener k;
        boolean l;

        private c() {
            this.h = new b[5];
            this.l = true;
        }

        /* synthetic */ c(byte b2) {
            this();
        }
    }

    private void a(Uri uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, this, f18498a, false, 14430, new Class[]{Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri}, this, f18498a, false, 14430, new Class[]{Uri.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.setImageURI(uri);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f18498a, false, 14432, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f18498a, false, 14432, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        if (this.f18499b != null) {
            this.f18499b.setText(charSequence);
        }
    }

    public final void a(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f18498a, false, 14434, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f18498a, false, 14434, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        if (this.f18500c != null) {
            this.f18500c.setText(charSequence);
        }
    }

    public void setTitle(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18498a, false, 14431, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18498a, false, 14431, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setTitle(getContext().getText(i2));
    }

    private void a(c cVar) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f18498a, false, 14427, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f18498a, false, 14427, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.g = (HSImageView) findViewById(C0906R.id.bdw);
        this.f18499b = (TextView) findViewById(C0906R.id.be0);
        this.f18500c = (TextView) findViewById(C0906R.id.bdz);
        if (cVar.g != null) {
            this.g.setVisibility(8);
            this.f18499b.setVisibility(8);
            this.f18500c.setVisibility(8);
            findViewById(C0906R.id.be2).setVisibility(8);
            findViewById(C0906R.id.be1).setVisibility(8);
            findViewById(C0906R.id.bdn).setVisibility(8);
            FrameLayout frameLayout = (FrameLayout) findViewById(C0906R.id.bdv);
            frameLayout.addView(cVar.g);
            frameLayout.setVisibility(0);
        } else {
            if (cVar.f18521c == null) {
                this.g.setVisibility(8);
                findViewById(C0906R.id.bdx).setVisibility(8);
            } else {
                a(cVar.f18521c);
            }
            if (cVar.f18522d != null) {
                this.f18499b.setText(cVar.f18522d);
            } else {
                this.f18499b.setVisibility(8);
                findViewById(C0906R.id.be1).setVisibility(8);
            }
            if (cVar.f18523e != null) {
                this.f18500c.setText(cVar.f18523e);
            } else {
                this.f18500c.setVisibility(8);
                findViewById(C0906R.id.be1).setVisibility(8);
            }
        }
        if (cVar.f18519a != 0 ? 1 != cVar.f18519a ? 3 != cVar.f18519a : cVar.h[2] == null && cVar.h[3] == null && cVar.h[4] == null : cVar.h[0] == null && cVar.h[1] == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            findViewById(C0906R.id.bdr).setVisibility(8);
        } else if (cVar.f18519a == 0 || 3 == cVar.f18519a) {
            this.f18501d = (Button) findViewById(C0906R.id.bdo);
            a(this.f18501d, 0, null, cVar);
            this.h = (Button) findViewById(C0906R.id.bdp);
            a(this.h, 1, null, cVar);
            this.f18502e = findViewById(C0906R.id.be1);
        } else {
            this.f18501d = (Button) findViewById(C0906R.id.bdo);
            a(this.f18501d, 2, findViewById(C0906R.id.bds), cVar);
            this.h = (Button) findViewById(C0906R.id.bdp);
            a(this.h, 3, findViewById(C0906R.id.bdt), cVar);
            this.i = (Button) findViewById(C0906R.id.bdq);
            a(this.i, 4, findViewById(C0906R.id.bdu), cVar);
        }
        setCancelable(cVar.l);
        setOnCancelListener(cVar.i);
        setOnDismissListener(cVar.j);
        setOnShowListener(cVar.k);
    }

    private m(@NonNull Context context, final c cVar) {
        super(context, C0906R.style.vz);
        if (cVar.f18524f != null) {
            setContentView(cVar.f18524f);
        } else if (2 == cVar.f18519a) {
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.afq, null);
            setContentView(inflate);
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f18498a, false, 14428, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f18498a, false, 14428, new Class[]{c.class}, Void.TYPE);
            } else {
                this.f18500c = (TextView) findViewById(C0906R.id.bdz);
                if (!(this.f18500c == null || cVar.f18523e == null)) {
                    this.f18500c.setText(cVar.f18523e);
                }
                setCancelable(cVar.l);
                setOnCancelListener(cVar.i);
                setOnDismissListener(new DialogInterface.OnDismissListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f18504a;

                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f18504a, false, 14435, new Class[]{DialogInterface.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f18504a, false, 14435, new Class[]{DialogInterface.class}, Void.TYPE);
                            return;
                        }
                        if (cVar.j != null) {
                            cVar.j.onDismiss(dialogInterface);
                        }
                        if (m.this.f18503f != null && !m.this.f18503f.hasEnded()) {
                            m.this.f18503f.cancel();
                        }
                    }
                });
                setOnShowListener(new DialogInterface.OnShowListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f18507a;

                    public final void onShow(DialogInterface dialogInterface) {
                        DialogInterface dialogInterface2 = dialogInterface;
                        if (PatchProxy.isSupport(new Object[]{dialogInterface2}, this, f18507a, false, 14436, new Class[]{DialogInterface.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface2}, this, f18507a, false, 14436, new Class[]{DialogInterface.class}, Void.TYPE);
                            return;
                        }
                        if (cVar.k != null) {
                            cVar.k.onShow(dialogInterface2);
                        }
                        View findViewById = m.this.findViewById(C0906R.id.bdy);
                        if (findViewById != null) {
                            m mVar = m.this;
                            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                            mVar.f18503f = rotateAnimation;
                            m.this.f18503f.setInterpolator(new LinearInterpolator());
                            m.this.f18503f.setRepeatMode(1);
                            m.this.f18503f.setRepeatCount(-1);
                            m.this.f18503f.setDuration(1000);
                            findViewById.startAnimation(m.this.f18503f);
                        }
                    }
                });
            }
            int dip2Px = (int) UIUtils.dip2Px(getContext(), 80.0f);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            layoutParams.width = dip2Px;
            layoutParams.height = dip2Px;
            inflate.setLayoutParams(layoutParams);
        } else if (1 == cVar.f18519a) {
            setContentView(LayoutInflater.from(getContext()).inflate(C0906R.layout.afr, null));
            a(cVar);
        } else if (3 == cVar.f18519a) {
            View inflate2 = LayoutInflater.from(getContext()).inflate(C0906R.layout.ah4, null);
            setContentView(inflate2);
            ViewGroup.LayoutParams layoutParams2 = inflate2.getLayoutParams();
            layoutParams2.width = (int) UIUtils.dip2Px(getContext(), 280.0f);
            inflate2.setLayoutParams(layoutParams2);
            a(cVar);
        } else {
            setContentView(LayoutInflater.from(getContext()).inflate(C0906R.layout.afp, null));
            a(cVar);
        }
    }

    /* synthetic */ m(Context context, c cVar, byte b2) {
        this(context, cVar);
    }

    private void a(Button button, int i2, View view, c cVar) {
        Button button2 = button;
        final int i3 = i2;
        View view2 = view;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{button2, Integer.valueOf(i2), view2, cVar2}, this, f18498a, false, 14429, new Class[]{Button.class, Integer.TYPE, View.class, c.class}, Void.TYPE)) {
            Object[] objArr = {button2, Integer.valueOf(i2), view2, cVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f18498a, false, 14429, new Class[]{Button.class, Integer.TYPE, View.class, c.class}, Void.TYPE);
            return;
        }
        final b bVar = cVar2.h[i3];
        if (bVar != null) {
            button2.setText(bVar.f18517b);
            button2.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18510a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f18510a, false, 14437, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f18510a, false, 14437, new Class[]{View.class}, Void.TYPE);
                    } else if (bVar.f18518c != null) {
                        bVar.f18518c.onClick(m.this, i3);
                    }
                }
            });
            return;
        }
        button2.setVisibility(8);
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }
}
