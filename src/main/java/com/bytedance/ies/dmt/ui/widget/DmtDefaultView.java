package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.TextViewCompat;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.common.e;
import com.bytedance.ies.dmt.ui.e.a;
import com.ss.android.ugc.aweme.C0906R;

public class DmtDefaultView extends ScrollView implements e, e, f {
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    private c f20457a;

    /* renamed from: b  reason: collision with root package name */
    private int f20458b;

    /* renamed from: c  reason: collision with root package name */
    private int f20459c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f20460d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f20461e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f20462f;
    private DmtTextView g;
    private View h;
    private DmtTextView i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private View.OnClickListener v;
    private int w;
    private boolean x;
    private int y;
    private int z;

    private void b() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.height >= 0) {
                this.f20458b = layoutParams.height;
            }
            if (layoutParams.height == -2) {
                throw new IllegalArgumentException("DmtDefaultView doesn't support layout_height set to WRAP_CONTENT!");
            }
        }
    }

    private void d() {
        if (ViewCompat.getLayoutDirection(this) == 1 && Build.VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
            this.f20460d.setLayoutDirection(1);
        }
    }

    private void e() {
        this.f20462f = (DmtTextView) findViewById(C0906R.id.dkk);
        if (this.f20457a.k) {
            this.f20462f.setText(this.f20457a.f20488b);
        }
        if (this.f20457a.n) {
            TextViewCompat.setTextAppearance(this.f20462f, C0906R.style.r5);
        }
        if (this.f20457a.o) {
            this.h = a(this.f20457a, this.f20460d);
        }
        f();
    }

    private void f() {
        this.g = (DmtTextView) findViewById(C0906R.id.dau);
        if (this.f20457a.l) {
            this.g.setText(this.f20457a.f20489c);
            if (this.f20457a.m) {
                this.g.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    private void c() {
        b();
        removeAllViews();
        setScrollY(0);
        if (this.x) {
            this.f20458b = a.a(getContext()) - this.z;
        }
        if (this.f20457a == null || this.f20458b < this.j) {
            this.u = false;
            return;
        }
        if (this.f20457a.j) {
            LayoutInflater.from(getContext()).inflate(C0906R.layout.a36, this, true);
            this.f20460d = (LinearLayout) findViewById(C0906R.id.b9k);
            this.f20461e = (ImageView) findViewById(C0906R.id.b0y);
            this.f20461e.setImageDrawable(this.f20457a.f20487a);
            e();
            if (this.f20457a.q) {
                this.i = b(this.f20457a, this.f20460d);
            }
            a(this.f20460d);
        } else if (this.f20457a.k) {
            LayoutInflater.from(getContext()).inflate(C0906R.layout.a35, this, true);
            this.f20460d = (LinearLayout) findViewById(C0906R.id.b9k);
            e();
            a(this.f20460d);
        } else {
            LayoutInflater.from(getContext()).inflate(C0906R.layout.a34, this, true);
            this.f20460d = (LinearLayout) findViewById(C0906R.id.b9k);
            f();
            a(this.f20460d);
        }
        if (this.v != null) {
            this.f20460d.setOnClickListener(this.v);
        }
        this.t = true;
        h();
        if (this.A) {
            this.f20460d.setVisibility(4);
        }
        d();
        g();
    }

    private void g() {
        b();
        this.u = false;
        if (this.x) {
            this.f20458b = a.a(getContext()) - this.z;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.y = iArr[1];
        }
        if (this.f20457a == null || this.f20458b < this.j) {
            this.u = true;
            return;
        }
        if (this.f20457a.j) {
            int i2 = (int) ((((float) this.f20458b) * 0.2f) + 0.5f);
            if (this.x) {
                i2 -= this.y;
            }
            a((View) this.f20461e, i2);
            if (this.f20457a.o) {
                if (this.f20457a.q) {
                    a(this.h, this.q);
                } else {
                    int a2 = (((((((this.f20458b - i2) - this.s) - this.k) - a((TextView) this.f20462f)) - this.l) - a((TextView) this.g)) - this.n) - this.m;
                    if (this.x) {
                        a2 -= this.y;
                    }
                    setButtonMargin(a2);
                }
            }
        } else if (this.f20457a.k) {
            int i3 = (int) ((((float) this.f20458b) * 0.3f) + 0.5f);
            if (this.x) {
                i3 -= this.y;
            }
            a((View) this.f20462f, i3);
            if (this.f20457a.o) {
                int a3 = (((((this.f20458b - i3) - a((TextView) this.f20462f)) - this.l) - a((TextView) this.g)) - this.n) - this.m;
                if (this.x) {
                    a3 -= this.y;
                }
                setButtonMargin(a3);
            }
        } else {
            int i4 = (int) ((((float) this.f20458b) * 0.3f) + 0.5f);
            if (this.x) {
                i4 -= this.y;
            }
            a((View) this.g, i4);
        }
        this.g.requestLayout();
        if (this.y != 0 && this.A) {
            this.f20460d.setVisibility(0);
        }
        this.u = true;
    }

    private void h() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.f20460d != null && this.f20457a != null) {
            Resources resources = getResources();
            if (this.f20462f != null) {
                if (this.f20457a.n) {
                    DmtTextView dmtTextView = this.f20462f;
                    if (this.w == 0) {
                        i8 = resources.getColor(C0906R.color.anc);
                    } else {
                        i8 = resources.getColor(C0906R.color.anb);
                    }
                    dmtTextView.setTextColor(i8);
                } else {
                    DmtTextView dmtTextView2 = this.f20462f;
                    if (this.w == 0) {
                        i7 = resources.getColor(C0906R.color.an9);
                    } else {
                        i7 = resources.getColor(C0906R.color.an8);
                    }
                    dmtTextView2.setTextColor(i7);
                }
            }
            if (this.g != null) {
                DmtTextView dmtTextView3 = this.g;
                if (this.w == 0) {
                    i6 = resources.getColor(C0906R.color.anc);
                } else {
                    i6 = resources.getColor(C0906R.color.anb);
                }
                dmtTextView3.setTextColor(i6);
            }
            if (this.h != null) {
                if (this.h instanceof d) {
                    ((d) this.h).onColorModeChange(this.w);
                    return;
                }
                DmtTextView dmtTextView4 = (DmtTextView) this.h;
                if (this.f20457a.f20490d == a.SOLID) {
                    if (this.w == 0) {
                        i4 = 2130841605;
                    } else {
                        i4 = 2130841604;
                    }
                    dmtTextView4.setBackgroundResource(i4);
                    if (this.w == 0) {
                        i5 = C0906R.color.an5;
                    } else {
                        i5 = C0906R.color.an4;
                    }
                    dmtTextView4.setTextColor(resources.getColor(i5));
                    return;
                }
                if (this.w == 0) {
                    i2 = 2130841603;
                } else {
                    i2 = 2130841602;
                }
                dmtTextView4.setBackgroundResource(i2);
                if (this.w == 0) {
                    i3 = resources.getColor(C0906R.color.an9);
                } else {
                    i3 = resources.getColor(C0906R.color.an8);
                }
                dmtTextView4.setTextColor(i3);
            }
        }
    }

    public final void a() {
        if (this.f20457a != null) {
            if (this.t) {
                g();
                return;
            }
            c();
        }
    }

    public void setSupportDelayVisible(boolean z2) {
        this.A = z2;
    }

    public DmtDefaultView(Context context) {
        this(context, null);
    }

    public void onColorModeChange(int i2) {
        if (this.w != i2) {
            this.w = i2;
            h();
        }
    }

    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.v = onClickListener;
        if (this.f20460d != null) {
            this.f20460d.setOnClickListener(this.v);
        }
    }

    public void setUseScreenHeight(int i2) {
        this.x = true;
        this.z = i2;
        a();
    }

    private int a(TextView textView) {
        textView.measure(View.MeasureSpec.makeMeasureSpec(this.f20459c - (this.r * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    private DmtTextView a(c cVar) {
        if (!cVar.o) {
            return null;
        }
        if (cVar.f20490d == a.SOLID) {
            return new DmtTextView(new ContextThemeWrapper(getContext(), C0906R.style.r4));
        }
        return new DmtTextView(new ContextThemeWrapper(getContext(), C0906R.style.r3));
    }

    private void setButtonMargin(int i2) {
        if (i2 >= this.m) {
            int i3 = (int) ((((float) this.f20458b) * 0.2f) + 0.5f);
            if (i3 < this.m) {
                a(this.h, i2);
                return;
            }
            int i4 = i2 - (i3 - this.m);
            if (i4 > this.m) {
                a(this.h, i4);
                return;
            }
        }
        a(this.h, this.m);
    }

    private void a(LinearLayout linearLayout) {
        linearLayout.addView(new Space(getContext()), new LinearLayout.LayoutParams(-1, this.m));
    }

    public void setStatus(c cVar) {
        if (cVar != null) {
            this.f20457a = cVar;
            if (!this.f20457a.o || (this.f20457a.k && this.f20457a.l)) {
                if (this.f20457a.q) {
                    if (TextUtils.isEmpty(this.f20457a.h)) {
                        throw new IllegalArgumentException("extra text should not be empty String!");
                    } else if (!this.f20457a.j || !this.f20457a.k || !this.f20457a.l || !this.f20457a.o) {
                        throw new IllegalArgumentException("extra text must with all elements!");
                    }
                }
                if (this.f20457a.k) {
                    if (TextUtils.isEmpty(this.f20457a.f20488b)) {
                        throw new IllegalArgumentException("title text should not be empty String!");
                    }
                } else if (this.f20457a.l) {
                    if (TextUtils.isEmpty(this.f20457a.f20489c)) {
                        throw new IllegalArgumentException("desc text should not be empty String!");
                    } else if (this.f20457a.j) {
                        throw new IllegalArgumentException("desc text should only have itself!");
                    }
                }
                this.t = false;
                this.u = false;
                if (this.f20458b > 0) {
                    c();
                }
                return;
            }
            throw new IllegalArgumentException("button must with title and description!");
        }
    }

    public DmtDefaultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static void a(View view, int i2) {
        ((LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = i2;
    }

    private DmtTextView b(c cVar, LinearLayout linearLayout) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), C0906R.style.r6));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = this.p;
        linearLayout.addView(dmtTextView, layoutParams);
        dmtTextView.setText(cVar.h);
        dmtTextView.setOnClickListener(this.f20457a.i);
        return dmtTextView;
    }

    private View a(c cVar, LinearLayout linearLayout) {
        if (cVar.p) {
            d dVar = new d(getContext());
            dVar.a(cVar.f20490d, cVar.f20491e, cVar.f20492f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.o, this.n);
            layoutParams.gravity = 1;
            linearLayout.addView(dVar, layoutParams);
            dVar.setOnClickListener(this.f20457a.g);
            return dVar;
        }
        DmtTextView a2 = a(cVar);
        if (a2 == null) {
            return null;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.o, this.n);
        layoutParams2.gravity = 1;
        linearLayout.addView(a2, layoutParams2);
        a2.setText(cVar.f20492f);
        a2.setOnClickListener(cVar.g);
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DmtDefaultView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            com.bytedance.ies.dmt.ui.common.b r5 = com.bytedance.ies.dmt.ui.common.b.a()
            int r5 = r5.f20312a
            r4.w = r5
            r4.b()
            if (r6 == 0) goto L_0x008e
            android.content.Context r5 = r4.getContext()
            int[] r7 = com.bytedance.ies.dmt.R$styleable.DmtDefaultView
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r7)
            if (r6 == 0) goto L_0x008e
            com.bytedance.ies.dmt.ui.widget.c r7 = new com.bytedance.ies.dmt.ui.widget.c
            r7.<init>()
            r0 = 4
            boolean r1 = r6.hasValue(r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x003a
            android.content.res.Resources r5 = r5.getResources()
            int r0 = r6.getResourceId(r0, r2)
            android.graphics.drawable.Drawable r5 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r5, (int) r0)
            r7.f20487a = r5
            r7.j = r3
        L_0x003a:
            boolean r5 = r6.hasValue(r3)
            if (r5 == 0) goto L_0x0048
            java.lang.String r5 = r6.getString(r3)
            r7.f20492f = r5
            r7.o = r3
        L_0x0048:
            boolean r5 = r6.hasValue(r2)
            if (r5 == 0) goto L_0x005d
            int r5 = r6.getInt(r2, r3)
            if (r5 != r3) goto L_0x0057
            com.bytedance.ies.dmt.ui.widget.a r5 = com.bytedance.ies.dmt.ui.widget.a.SOLID
            goto L_0x0059
        L_0x0057:
            com.bytedance.ies.dmt.ui.widget.a r5 = com.bytedance.ies.dmt.ui.widget.a.BORDER
        L_0x0059:
            r7.f20490d = r5
            r7.o = r3
        L_0x005d:
            r5 = 5
            boolean r0 = r6.hasValue(r5)
            if (r0 == 0) goto L_0x006c
            java.lang.String r5 = r6.getString(r5)
            r7.f20488b = r5
            r7.k = r3
        L_0x006c:
            r5 = 2
            boolean r0 = r6.hasValue(r5)
            if (r0 == 0) goto L_0x007b
            java.lang.String r5 = r6.getString(r5)
            r7.f20489c = r5
            r7.l = r3
        L_0x007b:
            r5 = 3
            boolean r0 = r6.hasValue(r5)
            if (r0 == 0) goto L_0x008a
            java.lang.String r5 = r6.getString(r5)
            r7.h = r5
            r7.q = r3
        L_0x008a:
            r6.recycle()
            goto L_0x008f
        L_0x008e:
            r7 = 0
        L_0x008f:
            android.content.Context r5 = r4.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131427486(0x7f0b009e, float:1.847659E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.j = r6
            r6 = 2131427489(0x7f0b00a1, float:1.8476596E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.k = r6
            r6 = 2131427479(0x7f0b0097, float:1.8476575E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.l = r6
            r6 = 2131427487(0x7f0b009f, float:1.8476592E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.m = r6
            r6 = 2131427477(0x7f0b0095, float:1.8476571E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.o = r6
            r6 = 2131427475(0x7f0b0093, float:1.8476567E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.n = r6
            r6 = 2131427480(0x7f0b0098, float:1.8476577E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.p = r6
            r6 = 2131427476(0x7f0b0094, float:1.847657E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.q = r6
            r6 = 2131427570(0x7f0b00f2, float:1.847676E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.r = r6
            r6 = 2131427482(0x7f0b009a, float:1.8476581E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r4.s = r5
            if (r7 == 0) goto L_0x010a
            boolean r5 = r7.j
            if (r5 != 0) goto L_0x0107
            boolean r5 = r7.o
            if (r5 != 0) goto L_0x0107
            boolean r5 = r7.k
            if (r5 != 0) goto L_0x0107
            boolean r5 = r7.l
            if (r5 != 0) goto L_0x0107
            boolean r5 = r7.q
            if (r5 == 0) goto L_0x010a
        L_0x0107:
            r4.setStatus(r7)
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.widget.DmtDefaultView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (!(this.f20458b == i3 && this.f20459c == i2)) {
            this.f20459c = i2;
            this.f20458b = i3;
            if (this.f20460d == null) {
                a();
                return;
            }
            this.f20460d.post(new Runnable() {
                public final void run() {
                    DmtDefaultView.this.a();
                }
            });
        }
    }
}
