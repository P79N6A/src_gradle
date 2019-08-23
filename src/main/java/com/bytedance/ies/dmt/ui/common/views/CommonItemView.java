package com.bytedance.ies.dmt.ui.common.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.ies.dmt.ui.common.views.a;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.setting.checkable.a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CommonItemView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f20327a;

    /* renamed from: b  reason: collision with root package name */
    public SimpleDraweeView f20328b;

    /* renamed from: c  reason: collision with root package name */
    public BadgeView f20329c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20330d;

    /* renamed from: e  reason: collision with root package name */
    public int f20331e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20332f;
    private boolean g;
    private TextView h;
    private TextView i;
    private ImageView j;
    private ViewGroup k;
    private ViewGroup l;
    private a m;
    private CharSequence n;
    private CharSequence o;
    private CharSequence p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    @DrawableRes
    private int u;
    @DrawableRes
    private int v;
    @DrawableRes
    private int w;
    @DrawableRes
    private int x;
    @DrawableRes
    private int y;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public SimpleDraweeView getIvwLeft() {
        return this.f20328b;
    }

    public ImageView getIvwRight() {
        return this.j;
    }

    public int getResLeft() {
        return this.u;
    }

    public int getResRight() {
        return this.v;
    }

    public CharSequence getTextDesc() {
        return this.p;
    }

    public CharSequence getTextLeft() {
        return this.n;
    }

    public CharSequence getTextRight() {
        return this.o;
    }

    public TextView getTvwDesc() {
        return this.i;
    }

    public TextView getTvwLeft() {
        return this.f20327a;
    }

    public TextView getTvwRight() {
        return this.h;
    }

    public final boolean c() {
        if (this.m == null) {
            return false;
        }
        return this.m.f20521b;
    }

    public final void b() {
        this.f20330d = false;
        if (this.f20329c != null) {
            this.f20329c.setVisibility(8);
            if ((this.f20331e == 3 || this.f20331e == 2) && this.h != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
                marginLayoutParams.rightMargin = 0;
                if (Build.VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
                }
                this.f20332f = true;
            }
        }
    }

    private void d() {
        if (this.p == null) {
            if (this.i != null) {
                this.i.setVisibility(8);
            }
            return;
        }
        if (this.i == null) {
            this.i = new DmtTextView(getContext());
            this.i.setLineSpacing(UIUtils.dip2Px(getContext(), 2.0f), 1.0f);
            this.i.setTextSize(1, 13.0f);
            this.i.setTextColor(this.y);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = (int) UIUtils.dip2Px(getContext(), 6.0f);
            layoutParams.addRule(3, C0906R.id.bip);
            addView(this.i, layoutParams);
            if (Build.VERSION.SDK_INT >= 23) {
                this.i.setBreakStrategy(0);
            }
        }
        this.i.setText(this.p);
        this.i.setVisibility(0);
        this.g = true;
    }

    private void e() {
        if (this.m != null) {
            this.m.setVisibility(8);
        }
        if (this.o == null && this.v == 0) {
            this.k.setVisibility(8);
            return;
        }
        if (!this.s && this.j == null) {
            this.j = new AutoRTLImageView(getContext());
            this.j.setId(C0906R.id.b6o);
            int dip2Px = (int) UIUtils.dip2Px(getContext(), 20.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dip2Px, dip2Px);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.addRule(21);
            } else {
                layoutParams.addRule(11);
            }
            this.k.addView(this.j, layoutParams);
        }
        if (!this.s && this.j != null) {
            if (this.v != 0) {
                this.j.setImageResource(this.v);
                this.j.setVisibility(0);
            } else {
                this.j.setVisibility(8);
            }
        }
        if (this.o != null && this.h == null) {
            this.h = new DmtTextView(getContext());
            this.h.setId(C0906R.id.dlv);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(15);
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams2.addRule(16, C0906R.id.b6o);
            } else {
                layoutParams2.addRule(0, C0906R.id.b6o);
            }
            this.h.setTextColor(this.x);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setMaxLines(1);
            this.h.setTextSize(1, 15.0f);
            this.k.addView(this.h, layoutParams2);
        }
        if (this.o != null) {
            this.h.setText(this.o);
            this.h.setVisibility(0);
        } else if (this.h != null) {
            this.h.setVisibility(8);
        }
        this.k.setVisibility(0);
    }

    public final void a() {
        if (this.f20329c == null) {
            this.f20329c = new BadgeView(getContext());
            addView(this.f20329c, new RelativeLayout.LayoutParams(-2, -2));
        }
        if (this.f20331e == 3 || this.f20331e == 2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f20329c.getLayoutParams();
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.addRule(21);
            } else {
                layoutParams.addRule(11);
            }
            layoutParams.addRule(10);
            int measuredHeight = this.k.getMeasuredHeight();
            if (measuredHeight == 0) {
                measuredHeight = this.f20327a.getLineHeight();
            }
            if (this.f20331e == 3) {
                layoutParams.topMargin = (measuredHeight - this.f20329c.getMeasuredHeight()) / 2;
            } else {
                layoutParams.topMargin = 0;
            }
            if (this.t == 1) {
                layoutParams.rightMargin = (int) (((float) a(this.k)) + UIUtils.dip2Px(getContext(), 8.0f));
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginEnd(layoutParams.rightMargin);
                }
            } else {
                if (this.j == null || this.j.getVisibility() != 0) {
                    layoutParams.rightMargin = 0;
                } else {
                    layoutParams.rightMargin = this.j.getMeasuredWidth();
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginEnd(layoutParams.rightMargin);
                }
                if (this.h != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
                    marginLayoutParams.rightMargin = (int) UIUtils.dip2Px(getContext(), 10.0f);
                    if (Build.VERSION.SDK_INT >= 17) {
                        marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
                    }
                    this.f20332f = true;
                }
            }
        } else if (!this.n.equals(this.f20327a.getText())) {
            this.f20329c.setVisibility(0);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.n);
            spannableStringBuilder.append(" ");
            a aVar = new a();
            aVar.f20334a = new a.C0187a() {
                public final void a(int i, int i2) {
                    int i3;
                    if (CommonItemView.this.f20330d) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) CommonItemView.this.f20329c.getLayoutParams();
                        int dip2Px = (int) UIUtils.dip2Px(CommonItemView.this.getContext(), 1.0f);
                        Layout layout = CommonItemView.this.f20327a.getLayout();
                        if (layout != null && layout.getLineCount() > 0) {
                            i = (int) layout.getLineWidth(layout.getLineCount() - 1);
                        }
                        if (CommonItemView.this.f20331e == 1) {
                            i2 += (CommonItemView.this.f20327a.getLineHeight() - CommonItemView.this.f20329c.getMeasuredHeight()) / 2;
                            i = (int) (((float) i) + UIUtils.dip2Px(CommonItemView.this.getContext(), 4.0f));
                        }
                        if (CommonItemView.this.f20328b.getVisibility() == 0) {
                            if (Build.VERSION.SDK_INT >= 17) {
                                i3 = i + ((ViewGroup.MarginLayoutParams) CommonItemView.this.f20328b.getLayoutParams()).getMarginEnd();
                            } else {
                                i3 = i + ((ViewGroup.MarginLayoutParams) CommonItemView.this.f20328b.getLayoutParams()).rightMargin;
                            }
                            i = i3 + CommonItemView.this.f20328b.getMeasuredWidth();
                        }
                        marginLayoutParams.leftMargin = i + dip2Px;
                        if (Build.VERSION.SDK_INT >= 17) {
                            marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
                        }
                        marginLayoutParams.topMargin = (int) (CommonItemView.this.f20327a.getY() + ((float) i2));
                        CommonItemView.this.f20329c.requestLayout();
                    }
                }
            };
            spannableStringBuilder.setSpan(aVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            this.f20327a.setText(spannableStringBuilder);
        }
        this.f20330d = true;
    }

    public CommonItemView(Context context) {
        this(context, null);
    }

    public void setDesc(CharSequence charSequence) {
        this.p = charSequence;
        d();
    }

    public void setLeftIcon(@DrawableRes int i2) {
        a(this.n, i2);
    }

    public void setLeftText(CharSequence charSequence) {
        a(charSequence, this.u);
    }

    public void setOnCheckedChangeListener(a.C0188a aVar) {
        this.m.setOnCheckedChangeListener(aVar);
    }

    public void setRightIconRes(@DrawableRes int i2) {
        b(this.o, i2);
    }

    public void setRightText(CharSequence charSequence) {
        b(charSequence, this.v);
    }

    public void setChecked(boolean z) {
        if (this.m != null) {
            this.m.setChecked(z);
        }
    }

    public void setLeftIconImageUrl(String str) {
        this.f20328b.setVisibility(0);
        this.f20328b.setImageURI(str);
        this.f20332f = true;
    }

    private static int a(ViewGroup viewGroup) {
        int i2;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            View childAt = viewGroup.getChildAt(i5);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = i4 + childAt.getMeasuredWidth();
            if (Build.VERSION.SDK_INT >= 17) {
                i3 = marginLayoutParams.getMarginStart();
                i2 = marginLayoutParams.getMarginEnd();
            } else {
                i3 = marginLayoutParams.leftMargin;
                i2 = marginLayoutParams.rightMargin;
            }
            i4 = measuredWidth + i3 + i2;
        }
        return i4;
    }

    public CommonItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @ColorInt
    private static int a(Context context, int i2) {
        return context.getResources().getColor(i2);
    }

    private void b(CharSequence charSequence, @DrawableRes int i2) {
        this.o = charSequence;
        this.v = i2;
        if (this.t != 1) {
            e();
            this.f20332f = true;
        }
    }

    private void a(CharSequence charSequence, @DrawableRes int i2) {
        this.u = i2;
        this.f20328b.setImageResource(this.u);
        this.n = charSequence;
        this.f20327a.setText(this.n);
        if (this.f20330d) {
            a();
        }
        this.f20332f = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f20332f || this.g) {
            if (this.f20332f) {
                if (this.k.getVisibility() == 8) {
                    this.l.getLayoutParams().width = -1;
                } else {
                    int size = (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight();
                    if (this.t == 1) {
                        this.k.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i3);
                        this.l.getLayoutParams().width = size - a(this.k);
                    } else {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                        this.l.measure(makeMeasureSpec, i3);
                        this.k.measure(makeMeasureSpec, i3);
                        int measuredWidth = this.l.getMeasuredWidth();
                        int a2 = a(this.k);
                        if (measuredWidth + a2 <= size) {
                            this.l.getLayoutParams().width = measuredWidth;
                            this.k.getLayoutParams().width = size - measuredWidth;
                        } else {
                            double d2 = (double) size;
                            Double.isNaN(d2);
                            int i4 = (int) (0.204d * d2);
                            if (a2 <= i4) {
                                this.k.getLayoutParams().width = i4;
                                this.l.getLayoutParams().width = size - i4;
                            } else if (measuredWidth <= i4) {
                                this.k.getLayoutParams().width = size - i4;
                                this.l.getLayoutParams().width = i4;
                            } else {
                                Double.isNaN(d2);
                                int i5 = (int) (0.372d * d2);
                                if (measuredWidth <= i5) {
                                    this.l.getLayoutParams().width = i5;
                                    this.k.getLayoutParams().width = size - i5;
                                } else if (a2 <= i5) {
                                    this.l.getLayoutParams().width = size - i5;
                                    this.k.getLayoutParams().width = i5;
                                } else {
                                    Double.isNaN(d2);
                                    int i6 = (int) (d2 * 0.29d);
                                    this.l.getLayoutParams().width = size - i6;
                                    this.k.getLayoutParams().width = i6;
                                }
                            }
                        }
                    }
                }
                this.f20332f = false;
            }
            if (!(!this.g || this.i == null || this.i.getVisibility() == 8)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
                if (this.f20328b.getVisibility() != 0) {
                    marginLayoutParams.leftMargin = 0;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f20328b.getLayoutParams();
                    marginLayoutParams.leftMargin = marginLayoutParams2.rightMargin + marginLayoutParams2.width;
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
                }
                this.g = false;
            }
            if (this.f20330d) {
                a();
            }
        } else if (this.f20330d) {
            a();
        }
        super.onMeasure(i2, i3);
    }

    public CommonItemView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        int i4;
        int i5;
        int i6;
        this.f20332f = true;
        this.g = true;
        this.q = true;
        this.r = true;
        this.t = -1;
        LayoutInflater.from(context).inflate(C0906R.layout.aoz, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CommonItemView);
        this.n = obtainStyledAttributes.getString(4);
        this.o = obtainStyledAttributes.getString(7);
        this.p = obtainStyledAttributes.getString(0);
        this.u = obtainStyledAttributes.getResourceId(3, 0);
        if (b.a(context)) {
            i3 = 2130841630;
        } else {
            i3 = 2130841631;
        }
        this.v = obtainStyledAttributes.getResourceId(6, i3);
        Context context2 = getContext();
        if (b.a(context2)) {
            i4 = C0906R.color.ak8;
        } else {
            i4 = C0906R.color.ak7;
        }
        this.w = obtainStyledAttributes.getColor(5, a(context2, i4));
        Context context3 = getContext();
        boolean a2 = b.a(context3);
        int i7 = C0906R.color.i4;
        if (a2) {
            i5 = C0906R.color.ak_;
        } else {
            i5 = C0906R.color.i4;
        }
        this.x = obtainStyledAttributes.getColor(8, a(context3, i5));
        Context context4 = getContext();
        this.y = obtainStyledAttributes.getColor(1, a(context4, b.a(context4) ? C0906R.color.ak_ : i7));
        this.q = obtainStyledAttributes.getBoolean(12, true);
        this.r = obtainStyledAttributes.getBoolean(11, true);
        this.f20330d = obtainStyledAttributes.getBoolean(10, false);
        this.s = obtainStyledAttributes.getBoolean(2, false);
        this.t = obtainStyledAttributes.getInt(9, 0);
        this.f20331e = obtainStyledAttributes.getInt(13, 0);
        obtainStyledAttributes.recycle();
        if (this.q) {
            int dip2Px = (int) UIUtils.dip2Px(context, 16.0f);
            setPadding(dip2Px, dip2Px, dip2Px, dip2Px);
        }
        if (this.r) {
            setBackground(c.e(context));
        }
        this.l = (ViewGroup) findViewById(C0906R.id.bip);
        this.k = (ViewGroup) findViewById(C0906R.id.bir);
        this.f20327a = (TextView) this.l.findViewById(C0906R.id.dlw);
        this.f20328b = (SimpleDraweeView) this.l.findViewById(C0906R.id.b6n);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f20327a.setBreakStrategy(0);
        }
        if (this.t == 1) {
            if (this.j != null) {
                this.j.setVisibility(8);
            }
            if (this.h != null) {
                this.h.setVisibility(8);
            }
            if (this.m == null) {
                this.m = new com.bytedance.ies.dmt.ui.widget.setting.checkable.a(getContext());
                this.m.setId(C0906R.id.cxx);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) UIUtils.dip2Px(getContext(), 36.0f), -2);
                layoutParams.addRule(15);
                this.m.setTrackRadius((int) UIUtils.dip2Px(getContext(), 42.0f));
                this.m.setEnableTouch(false);
                this.m.setTrackPadding((int) UIUtils.dip2Px(getContext(), 3.0f));
                this.m.setThumbDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130841681));
                com.bytedance.ies.dmt.ui.widget.setting.checkable.a aVar = this.m;
                Context context5 = getContext();
                Resources resources = context5.getResources();
                if (b.a(context5)) {
                    i6 = C0906R.color.gh;
                } else {
                    i6 = C0906R.color.gg;
                }
                aVar.setTrackTintList(resources.getColorStateList(i6));
                this.k.addView(this.m, layoutParams);
            }
            this.k.setVisibility(0);
            this.m.setVisibility(0);
        } else {
            e();
        }
        if (this.u == 0) {
            this.f20328b.setVisibility(8);
        } else {
            this.f20328b.setVisibility(0);
            this.f20328b.setImageResource(this.u);
        }
        this.f20327a.setText(this.n);
        this.f20327a.setTextColor(this.w);
        d();
    }
}
