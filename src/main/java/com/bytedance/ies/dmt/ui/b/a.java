package com.bytedance.ies.dmt.ui.b;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.support.annotation.StringRes;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.c.c;
import com.ss.android.ugc.aweme.C0906R;

public class a {

    /* renamed from: f  reason: collision with root package name */
    public static float f20279f = 0.5f;
    private int A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f20280a;

    /* renamed from: b  reason: collision with root package name */
    public DialogInterface.OnClickListener f20281b;

    /* renamed from: c  reason: collision with root package name */
    public DialogInterface.OnClickListener f20282c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20283d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20284e;
    private Context g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private ImageView n;
    private View o;
    private View p;
    private View q;
    private View r;
    private View s;
    private FrameLayout t;
    private RelativeLayout u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    /* renamed from: com.bytedance.ies.dmt.ui.b.a$a  reason: collision with other inner class name */
    public static class C0185a {

        /* renamed from: a  reason: collision with root package name */
        public String f20300a;

        /* renamed from: b  reason: collision with root package name */
        public String f20301b;

        /* renamed from: c  reason: collision with root package name */
        public String f20302c;

        /* renamed from: d  reason: collision with root package name */
        public String f20303d;

        /* renamed from: e  reason: collision with root package name */
        public String f20304e;

        /* renamed from: f  reason: collision with root package name */
        public int f20305f;
        public DialogInterface.OnClickListener g;
        public DialogInterface.OnClickListener h;
        public Context i;
        public View j;
        public View k;
        public int l;
        public int m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;

        public final a a() {
            return new a(this, (byte) 0);
        }

        public final C0185a a(View view) {
            this.j = view;
            return this;
        }

        public final C0185a b(View view) {
            this.k = view;
            return this;
        }

        public final C0185a c(int i2) {
            this.f20305f = i2;
            return this;
        }

        public C0185a(Context context) {
            this.i = context;
        }

        public final C0185a d(int i2) {
            this.l = -3476230;
            return this;
        }

        public final C0185a e(int i2) {
            this.m = C0906R.style.kx;
            return this;
        }

        public final C0185a a(@StringRes int i2) {
            this.f20300a = this.i.getString(i2);
            return this;
        }

        public final C0185a b(@StringRes int i2) {
            this.f20301b = this.i.getString(i2);
            return this;
        }

        public final C0185a a(String str) {
            this.f20300a = str;
            return this;
        }

        public final C0185a b(String str) {
            this.f20301b = str;
            return this;
        }

        public final C0185a a(boolean z) {
            this.o = true;
            return this;
        }

        public final C0185a a(@StringRes int i2, DialogInterface.OnClickListener onClickListener) {
            return a(i2, onClickListener, false);
        }

        public final C0185a b(@StringRes int i2, DialogInterface.OnClickListener onClickListener) {
            return b(i2, onClickListener, false);
        }

        public final C0185a a(String str, DialogInterface.OnClickListener onClickListener) {
            return a(str, onClickListener, false);
        }

        public final C0185a b(String str, DialogInterface.OnClickListener onClickListener) {
            return b(str, onClickListener, false);
        }

        private C0185a a(String str, DialogInterface.OnClickListener onClickListener, boolean z) {
            this.f20303d = str;
            this.g = onClickListener;
            this.p = z;
            return this;
        }

        private C0185a b(String str, DialogInterface.OnClickListener onClickListener, boolean z) {
            this.f20304e = str;
            this.h = onClickListener;
            this.q = z;
            return this;
        }

        public final C0185a a(@StringRes int i2, DialogInterface.OnClickListener onClickListener, boolean z) {
            return a(this.i.getString(i2), onClickListener, z);
        }

        public final C0185a b(@StringRes int i2, DialogInterface.OnClickListener onClickListener, boolean z) {
            return b(this.i.getString(i2), onClickListener, z);
        }
    }

    @SuppressLint({"NewApi"})
    public final Dialog a() {
        AlertDialog.Builder builder;
        if (this.C == 0) {
            builder = new AlertDialog.Builder(this.g, C0906R.style.rf);
        } else {
            builder = new AlertDialog.Builder(this.g, this.C);
        }
        if (!TextUtils.isEmpty(this.v)) {
            builder.setTitle(this.v);
        }
        if (!TextUtils.isEmpty(this.w)) {
            builder.setMessage(this.w);
        }
        builder.setPositiveButton(this.y, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (!a.this.f20283d) {
                    a.a(dialogInterface);
                }
                if (a.this.f20281b != null) {
                    a.this.f20281b.onClick(dialogInterface, i);
                }
            }
        });
        if (!TextUtils.isEmpty(this.z)) {
            builder.setNegativeButton(this.z, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (!a.this.f20284e) {
                        a.a(dialogInterface);
                    }
                    if (a.this.f20282c != null) {
                        a.this.f20282c.onClick(dialogInterface, i);
                    }
                }
            });
        }
        AlertDialog create = builder.create();
        try {
            create.show();
        } catch (Exception unused) {
        }
        return create;
    }

    public final Dialog b() {
        AlertDialog.Builder builder;
        this.f20280a.setAlpha(0.0f);
        if (this.C == 0) {
            builder = new AlertDialog.Builder(this.g);
        } else {
            builder = new AlertDialog.Builder(this.g, this.C);
        }
        builder.setView(this.o);
        this.h.setText(this.v);
        this.i.setText(this.w);
        if (this.x != null) {
            this.j.setVisibility(0);
            this.j.setText(this.x);
        }
        this.l.setText(this.y);
        this.t.setBackgroundColor(this.B);
        if (this.E) {
            this.s.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.z)) {
            this.k.setVisibility(8);
            this.m.setVisibility(8);
            this.l.setBackgroundResource(2130841597);
        } else {
            this.k.setText(this.z);
        }
        if (this.p != null) {
            this.i.setVisibility(8);
            this.h.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.r.getLayoutParams()).topMargin = 0;
            this.u.removeAllViews();
            this.u.addView(this.p);
        }
        if (TextUtils.isEmpty(this.v)) {
            this.h.setVisibility(8);
            if (TextUtils.isEmpty(this.x)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
                layoutParams.topMargin = (int) UIUtils.dip2Px(this.g, 32.0f);
                layoutParams.bottomMargin = (int) UIUtils.dip2Px(this.g, 8.0f);
                this.i.setLayoutParams(layoutParams);
            }
        }
        if (this.q != null) {
            this.t.removeView(this.n);
            this.t.addView(this.q, 0, new FrameLayout.LayoutParams(-1, -1));
        } else if (this.A > 0) {
            this.n.setImageResource(this.A);
        } else {
            this.t.setVisibility(8);
        }
        final AlertDialog create = builder.create();
        this.k.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (!a.this.f20284e) {
                    a.a(false, a.this.f20280a);
                    new Handler().postDelayed(new Runnable() {
                        public final void run() {
                            a.a(create);
                        }
                    }, 100);
                }
                if (a.this.f20282c != null) {
                    a.this.f20282c.onClick(create, 0);
                }
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (!a.this.f20283d) {
                    a.a(false, a.this.f20280a);
                    new Handler().postDelayed(new Runnable() {
                        public final void run() {
                            a.a(create);
                        }
                    }, 100);
                }
                if (a.this.f20281b != null) {
                    a.this.f20281b.onClick(create, 1);
                }
            }
        });
        this.s.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                a.a(false, a.this.f20280a);
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        a.a(create);
                    }
                }, 100);
            }
        });
        try {
            a(true, this.f20280a);
            create.show();
            Window window = create.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(17170445);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = f20279f;
                window.addFlags(2);
                attributes.gravity = 1;
                if (this.D) {
                    attributes.width = (int) (((float) UIUtils.getScreenWidth(this.g)) - (UIUtils.dip2Px(this.g, 40.0f) * 2.0f));
                } else {
                    attributes.width = (int) UIUtils.dip2Px(create.getContext(), 280.0f);
                }
                window.setAttributes(attributes);
            }
        } catch (Exception unused) {
        }
        return create;
    }

    public static void a(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception unused) {
        }
    }

    private a(C0185a aVar) {
        int i2;
        this.g = aVar.i;
        this.A = aVar.f20305f;
        this.v = aVar.f20300a;
        this.w = aVar.f20301b;
        this.x = aVar.f20302c;
        this.z = aVar.f20304e;
        this.y = aVar.f20303d;
        this.f20281b = aVar.g;
        this.f20282c = aVar.h;
        this.p = aVar.j;
        this.q = aVar.k;
        this.B = aVar.l;
        this.C = aVar.m;
        this.D = aVar.n;
        this.E = aVar.o;
        this.f20284e = aVar.q;
        this.f20283d = aVar.p;
        LayoutInflater from = LayoutInflater.from(this.g);
        if (this.D) {
            i2 = C0906R.layout.a3b;
        } else {
            i2 = C0906R.layout.a3a;
        }
        this.o = from.inflate(i2, null);
        this.h = (TextView) this.o.findViewById(C0906R.id.dkk);
        this.i = (TextView) this.o.findViewById(C0906R.id.da0);
        this.j = (TextView) this.o.findViewById(C0906R.id.di_);
        this.n = (ImageView) this.o.findViewById(C0906R.id.aq5);
        this.k = (TextView) this.o.findViewById(C0906R.id.ddk);
        this.l = (TextView) this.o.findViewById(C0906R.id.dhn);
        this.m = (TextView) this.o.findViewById(C0906R.id.dds);
        this.f20280a = (RelativeLayout) this.o.findViewById(C0906R.id.ci6);
        this.u = (RelativeLayout) this.o.findViewById(C0906R.id.cft);
        this.t = (FrameLayout) this.o.findViewById(C0906R.id.cgq);
        this.r = this.o.findViewById(C0906R.id.a5x);
        this.s = this.o.findViewById(C0906R.id.ts);
    }

    /* synthetic */ a(C0185a aVar, byte b2) {
        this(aVar);
    }

    public static void a(final boolean z2, final View view) {
        if (view != null) {
            view.post(new Runnable() {
                public final void run() {
                    long j;
                    float f2;
                    final int height = (int) (((float) view.getHeight()) * 0.075f);
                    if (z2) {
                        j = 300;
                    } else {
                        j = 100;
                    }
                    View view = view;
                    float[] fArr = new float[2];
                    float f3 = 1.0f;
                    if (z2) {
                        f2 = 0.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    fArr[0] = f2;
                    if (!z2) {
                        f3 = 0.0f;
                    }
                    fArr[1] = f3;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
                    ofFloat.setDuration(j);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float f2;
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            int i = (int) (((float) height) - (((float) height) * animatedFraction));
                            View view = view;
                            if (z2) {
                                f2 = (float) i;
                            } else {
                                f2 = animatedFraction * ((float) (-height));
                            }
                            view.setTranslationY(f2);
                        }
                    });
                    ofFloat.setInterpolator(new c());
                    ofFloat.start();
                }
            });
        }
    }
}
