package com.ss.android.ugc.aweme.poi.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.R$styleable;

public class ExpandableTextView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60988a = null;
    private static final String k = "ExpandableTextView";

    /* renamed from: b  reason: collision with root package name */
    protected TextView f60989b;

    /* renamed from: c  reason: collision with root package name */
    protected TextView f60990c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f60991d;

    /* renamed from: e  reason: collision with root package name */
    public int f60992e;

    /* renamed from: f  reason: collision with root package name */
    public int f60993f;
    public int g;
    public float h;
    public boolean i;
    public c j;
    private boolean l;
    private int m;
    private int n;
    private b o;
    @IdRes
    private int p;
    @IdRes
    private int q;
    private boolean r;
    private SparseBooleanArray s;
    private int t;
    private boolean u;

    class a extends Animation {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60998a;

        /* renamed from: c  reason: collision with root package name */
        private final View f61000c;

        /* renamed from: d  reason: collision with root package name */
        private final int f61001d;

        /* renamed from: e  reason: collision with root package name */
        private final int f61002e;

        public final boolean willChangeBounds() {
            return true;
        }

        public final void applyTransformation(float f2, Transformation transformation) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), transformation}, this, f60998a, false, 66993, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), transformation}, this, f60998a, false, 66993, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE);
                return;
            }
            int i = (int) ((((float) (this.f61002e - this.f61001d)) * f2) + ((float) this.f61001d));
            ExpandableTextView.this.f60989b.setMaxHeight(i - ExpandableTextView.this.f60993f);
            Float.compare(ExpandableTextView.this.h, 1.0f);
            this.f61000c.getLayoutParams().height = i;
            this.f61000c.requestLayout();
        }

        public a(View view, int i, int i2) {
            this.f61000c = view;
            this.f61001d = i;
            this.f61002e = i2;
            setDuration((long) ExpandableTextView.this.g);
        }

        public final void initialize(int i, int i2, int i3, int i4) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f60998a, false, 66994, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f60998a, false, 66994, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.initialize(i, i2, i3, i4);
        }
    }

    interface b {
        void a(View view);

        void a(boolean z);
    }

    public interface c {
        void a(TextView textView, boolean z);
    }

    static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61003a;

        /* renamed from: b  reason: collision with root package name */
        private final String f61004b;

        /* renamed from: c  reason: collision with root package name */
        private final String f61005c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f61006d;

        public final void a(View view) {
            this.f61006d = (TextView) view;
        }

        public final void a(boolean z) {
            String str;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61003a, false, 66996, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61003a, false, 66996, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            TextView textView = this.f61006d;
            if (z) {
                str = this.f61004b;
            } else {
                str = this.f61005c;
            }
            textView.setText(str);
        }

        public d(String str, String str2) {
            this.f61004b = str;
            this.f61005c = str2;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60988a, false, 66985, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60988a, false, 66985, new Class[0], Void.TYPE);
            return;
        }
        this.u = false;
        this.f60991d = false;
        this.f60989b.setMaxLines(Integer.MAX_VALUE);
        this.f60989b.setOnClickListener(this);
        this.f60990c.setVisibility(8);
    }

    @Nullable
    public CharSequence getText() {
        if (PatchProxy.isSupport(new Object[0], this, f60988a, false, 66980, new Class[0], CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[0], this, f60988a, false, 66980, new Class[0], CharSequence.class);
        } else if (this.f60989b == null) {
            return "";
        } else {
            return this.f60989b.getText();
        }
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f60988a, false, 66976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60988a, false, 66976, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        if (PatchProxy.isSupport(new Object[0], this, f60988a, false, 66982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60988a, false, 66982, new Class[0], Void.TYPE);
            return;
        }
        this.f60989b = (TextView) findViewById(this.p);
        if (this.r) {
            this.f60989b.setOnClickListener(this);
        } else {
            this.f60989b.setOnClickListener(null);
        }
        this.f60990c = (TextView) findViewById(this.q);
        this.o.a((View) this.f60990c);
        this.o.a(this.f60991d);
        this.f60990c.setOnClickListener(this);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60988a, false, 66984, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60988a, false, 66984, new Class[0], Void.TYPE);
            return;
        }
        this.u = false;
        this.f60989b.setEllipsize(TextUtils.TruncateAt.END);
        this.f60989b.setMaxLines(4);
        this.f60989b.setOnClickListener(null);
        this.f60990c.setVisibility(8);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.i;
    }

    public void setOnExpandStateChangeListener(@Nullable c cVar) {
        this.j = cVar;
    }

    public ExpandableTextView(Context context) {
        this(context, null);
    }

    public final void a(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, this, f60988a, false, 66986, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2}, this, f60988a, false, 66986, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        this.f60989b.setOnClickListener(onClickListener2);
    }

    public void setOrientation(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60988a, false, 66974, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60988a, false, 66974, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != 0) {
            super.setOrientation(i2);
        } else {
            throw new IllegalArgumentException("ExpandableTextView only supports Vertical Orientation.");
        }
    }

    public void setText(@Nullable String str) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, f60988a, false, 66978, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f60988a, false, 66978, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.l = true;
        this.f60989b.setText(Html.fromHtml(str));
        if (TextUtils.isEmpty(str)) {
            i2 = 8;
        }
        setVisibility(i2);
        clearAnimation();
        getLayoutParams().height = -2;
        requestLayout();
    }

    private void a(AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{attributeSet}, this, f60988a, false, 66981, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f60988a, false, 66981, new Class[]{AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ExpandableTextView);
        this.f60992e = obtainStyledAttributes.getInt(8, 8);
        this.g = obtainStyledAttributes.getInt(1, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
        this.h = obtainStyledAttributes.getFloat(0, 0.7f);
        this.p = obtainStyledAttributes.getResourceId(7, -1);
        this.q = obtainStyledAttributes.getResourceId(3, -1);
        if (this.p == -1 || this.q == -1) {
            throw new IllegalArgumentException("mExpandableTextId and mExpandCollapseToggleId should be set!");
        }
        this.r = obtainStyledAttributes.getBoolean(5, true);
        this.o = a(getContext(), obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        setOrientation(1);
        setVisibility(8);
    }

    public void onClick(View view) {
        a aVar;
        if (PatchProxy.isSupport(new Object[]{view}, this, f60988a, false, 66975, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60988a, false, 66975, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (this.f60990c.getVisibility() == 0) {
            this.f60991d = !this.f60991d;
            this.o.a(this.f60991d);
            if (this.s != null) {
                this.s.put(this.t, this.f60991d);
            }
            this.i = true;
            if (this.f60991d) {
                aVar = new a(this, getHeight(), this.m);
            } else {
                aVar = new a(this, getHeight(), (getHeight() + this.n) - this.f60989b.getHeight());
            }
            aVar.setFillAfter(true);
            aVar.setAnimationListener(new Animation.AnimationListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60994a;

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f60994a, false, 66990, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f60994a, false, 66990, new Class[]{Animation.class}, Void.TYPE);
                    }
                }

                public final void onAnimationEnd(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f60994a, false, 66991, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f60994a, false, 66991, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    ExpandableTextView.this.clearAnimation();
                    ExpandableTextView.this.i = false;
                    if (ExpandableTextView.this.j != null) {
                        ExpandableTextView.this.j.a(ExpandableTextView.this.f60989b, !ExpandableTextView.this.f60991d);
                    }
                    if (ExpandableTextView.this.f60991d) {
                        ExpandableTextView.this.f60989b.setEllipsize(TextUtils.TruncateAt.END);
                        ExpandableTextView.this.f60989b.setMaxLines(ExpandableTextView.this.f60992e);
                    }
                }
            });
            clearAnimation();
            startAnimation(aVar);
        }
    }

    public final void a(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60988a, false, 66983, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60988a, false, 66983, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.u = true;
        this.f60991d = !z;
        this.o.a(this.f60991d);
        this.f60989b.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView = this.f60989b;
        if (z) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = 4;
        }
        textView.setMaxLines(i2);
        this.f60989b.setOnClickListener(this);
        this.f60990c.setVisibility(0);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60991d = true;
        this.p = C0906R.id.bzn;
        this.q = C0906R.id.bzv;
        this.u = true;
        a(attributeSet);
    }

    private static b a(@NonNull Context context, TypedArray typedArray) {
        TypedArray typedArray2 = typedArray;
        if (!PatchProxy.isSupport(new Object[]{context, typedArray2}, null, f60988a, true, 66989, new Class[]{Context.class, TypedArray.class}, b.class)) {
            return new d(typedArray2.getString(4), typedArray2.getString(2));
        }
        return (b) PatchProxy.accessDispatch(new Object[]{context, typedArray2}, null, f60988a, true, 66989, new Class[]{Context.class, TypedArray.class}, b.class);
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60988a, false, 66977, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60988a, false, 66977, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!this.l || getVisibility() == 8) {
            super.onMeasure(i2, i3);
        } else {
            this.l = false;
            this.f60990c.setVisibility(8);
            this.f60989b.setMaxLines(Integer.MAX_VALUE);
            super.onMeasure(i2, i3);
            if (this.f60989b.getLineCount() > this.f60992e) {
                TextView textView = this.f60989b;
                if (PatchProxy.isSupport(new Object[]{textView}, null, f60988a, true, 66988, new Class[]{TextView.class}, Integer.TYPE)) {
                    i4 = ((Integer) PatchProxy.accessDispatch(new Object[]{textView}, null, f60988a, true, 66988, new Class[]{TextView.class}, Integer.TYPE)).intValue();
                } else {
                    i4 = textView.getLayout().getLineTop(textView.getLineCount()) + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
                }
                this.n = i4;
                if (this.f60991d) {
                    this.f60989b.setMaxLines(this.f60992e);
                }
                if (this.u) {
                    this.f60990c.setVisibility(0);
                }
                super.onMeasure(i2, i3);
                if (this.f60991d) {
                    this.f60989b.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f60996a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f60996a, false, 66992, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f60996a, false, 66992, new Class[0], Void.TYPE);
                                return;
                            }
                            ExpandableTextView.this.f60993f = ExpandableTextView.this.getHeight() - ExpandableTextView.this.f60989b.getHeight();
                        }
                    });
                    this.m = getMeasuredHeight();
                }
            }
        }
    }

    @TargetApi(11)
    public ExpandableTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f60991d = true;
        this.p = C0906R.id.bzn;
        this.q = C0906R.id.bzv;
        this.u = true;
        a(attributeSet);
    }
}
