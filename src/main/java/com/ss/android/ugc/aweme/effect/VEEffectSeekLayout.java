package com.ss.android.ugc.aweme.effect;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.google.common.a.n;
import com.google.common.collect.av;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.shortvideo.ui.o;
import com.ss.android.ugc.aweme.shortvideo.ui.p;
import com.ss.android.ugc.aweme.themechange.base.b;
import com.ss.android.ugc.aweme.tools.R$styleable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class VEEffectSeekLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43611a;

    /* renamed from: b  reason: collision with root package name */
    VEEffectSeekBar f43612b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<EffectPointModel> f43613c;

    /* renamed from: d  reason: collision with root package name */
    public o f43614d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f43615e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f43616f;
    private TextView g;
    private ImageView h;
    private RelativeLayout.LayoutParams i;
    private int j;
    private RelativeLayout k;
    private RelativeLayout l;
    private int m;
    private int n;
    private int o;
    private int p;

    class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43620a;

        /* renamed from: c  reason: collision with root package name */
        private RelativeLayout f43622c;

        /* renamed from: d  reason: collision with root package name */
        private RelativeLayout.LayoutParams f43623d = ((RelativeLayout.LayoutParams) this.f43622c.getLayoutParams());

        /* renamed from: e  reason: collision with root package name */
        private int f43624e;

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f43620a, false, 38790, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f43620a, false, 38790, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            switch (motionEvent.getAction()) {
                case 0:
                    this.f43623d.setMargins(Math.round(VEEffectSeekLayout.this.a(motionEvent.getRawX(), this.f43624e)), 0, 0, 0);
                    this.f43622c.setLayoutParams(this.f43623d);
                    if (VEEffectSeekLayout.this.f43614d != null) {
                        VEEffectSeekLayout.this.f43614d.a(VEEffectSeekLayout.this.a(this.f43622c, this.f43624e), this.f43624e, 1);
                        break;
                    }
                    break;
                case 1:
                case 3:
                    if (VEEffectSeekLayout.this.f43614d != null) {
                        VEEffectSeekLayout.this.f43614d.a(VEEffectSeekLayout.this.a(this.f43622c, this.f43624e), this.f43624e, 2);
                        break;
                    }
                    break;
                case 2:
                    this.f43623d.setMargins(Math.round(VEEffectSeekLayout.this.a(motionEvent.getRawX(), this.f43624e)), 0, 0, 0);
                    this.f43622c.setLayoutParams(this.f43623d);
                    if (this.f43624e == 1) {
                        VEEffectSeekLayout.this.setStartTime(VEEffectSeekLayout.this.getCursorPosition());
                    }
                    if (VEEffectSeekLayout.this.f43614d != null) {
                        VEEffectSeekLayout.this.f43614d.a(VEEffectSeekLayout.this.a(this.f43622c, this.f43624e), this.f43624e, 3);
                        break;
                    }
                    break;
            }
            return true;
        }

        a(RelativeLayout relativeLayout, int i) {
            this.f43622c = relativeLayout;
            this.f43624e = i;
        }
    }

    public void setOnPalyComplateListener(p pVar) {
    }

    public ArrayList<EffectPointModel> getEffectPointModels() {
        return this.f43613c;
    }

    public RelativeLayout getSelelctLayout() {
        return this.l;
    }

    public ImageView getTvSelelct() {
        return this.h;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43611a, false, 38772, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43611a, false, 38772, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f43612b.a(z);
    }

    public int getCursorPosition() {
        if (!PatchProxy.isSupport(new Object[0], this, f43611a, false, 38782, new Class[0], Integer.TYPE)) {
            return a(this.k, 1);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43611a, false, 38782, new Class[0], Integer.TYPE)).intValue();
    }

    public int getSelectPosition() {
        if (!PatchProxy.isSupport(new Object[0], this, f43611a, false, 38783, new Class[0], Integer.TYPE)) {
            return a(this.l, 2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43611a, false, 38783, new Class[0], Integer.TYPE)).intValue();
    }

    public int getCursorOffsetTime() {
        if (!PatchProxy.isSupport(new Object[0], this, f43611a, false, 38786, new Class[0], Integer.TYPE)) {
            return (int) ((((float) ((int) UIUtils.dip2Px(getContext(), 21.0f))) / ((float) c.f43714c)) * ((float) this.n));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43611a, false, 38786, new Class[0], Integer.TYPE)).intValue();
    }

    public void setOnCursorSeekListener(o oVar) {
        this.f43614d = oVar;
    }

    public VEEffectSeekLayout(Context context) {
        this(context, null);
    }

    private String c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38767, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38767, new Class[]{Integer.TYPE}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        double d2 = (double) i2;
        Double.isNaN(d2);
        sb.append((int) Math.floor(d2 / 1000.0d));
        String sb2 = sb.toString();
        if (sb2.length() < 2) {
            sb2 = PushConstants.PUSH_TYPE_NOTIFY + sb2;
        }
        return "00:" + sb2;
    }

    private int d(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38776, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38776, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (i2 == 1) {
            i3 = (int) UIUtils.dip2Px(getContext(), 4.0f);
        } else {
            i3 = (int) UIUtils.dip2Px(getContext(), 30.0f);
        }
        return i3;
    }

    private void setPadding(RelativeLayout relativeLayout) {
        RelativeLayout relativeLayout2 = relativeLayout;
        if (PatchProxy.isSupport(new Object[]{relativeLayout2}, this, f43611a, false, 38788, new Class[]{RelativeLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{relativeLayout2}, this, f43611a, false, 38788, new Class[]{RelativeLayout.class}, Void.TYPE);
            return;
        }
        int i2 = this.p;
        if (relativeLayout2.getChildAt(0) != null) {
            View childAt = relativeLayout2.getChildAt(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getLeft() <= i2) {
                layoutParams.addRule(9);
            } else if (childAt.getRight() > UIUtils.getScreenWidth(getContext()) - i2) {
                layoutParams.addRule(11);
            } else {
                layoutParams.addRule(14);
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38778, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38778, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.o = i2;
        a(this.o, 1);
    }

    public void setEffectPointModels(List<EffectPointModel> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f43611a, false, 38777, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f43611a, false, 38777, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f43613c.clear();
        this.f43613c.addAll(list);
        this.f43612b.setEffectPointModels(this.f43613c);
    }

    public void setNormalColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38774, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38774, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f43612b.setNormalColor(i2);
    }

    public void setOverlayColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38773, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38773, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f43612b.setOverlayColor(i2);
    }

    public void setStartTime(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38764, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38764, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 > this.n - getCursorOffsetTime()) {
            i3 = this.n;
        } else {
            i3 = i2;
        }
        this.g.setText(c(i3));
    }

    public void setVideoDuration(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38766, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38766, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f43612b != null) {
            this.n = i2;
            this.f43612b.setTime(i2);
            this.f43616f.setText(c(i2));
        }
    }

    /* access modifiers changed from: package-private */
    public EffectPointModel a(final int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38770, new Class[]{Integer.TYPE}, EffectPointModel.class)) {
            return (EffectPointModel) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f43611a, false, 38770, new Class[]{Integer.TYPE}, EffectPointModel.class);
        }
        try {
            return (EffectPointModel) av.b(this.f43613c, new n<EffectPointModel>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43617a;

                public final /* synthetic */ boolean apply(Object obj) {
                    EffectPointModel effectPointModel = (EffectPointModel) obj;
                    if (PatchProxy.isSupport(new Object[]{effectPointModel}, this, f43617a, false, 38789, new Class[]{EffectPointModel.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{effectPointModel}, this, f43617a, false, 38789, new Class[]{EffectPointModel.class}, Boolean.TYPE)).booleanValue();
                    } else if (effectPointModel.getIndex() == i2) {
                        return true;
                    } else {
                        return false;
                    }
                }
            });
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public VEEffectSeekLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int a(RelativeLayout relativeLayout, int i2) {
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{relativeLayout, Integer.valueOf(i2)}, this, f43611a, false, 38784, new Class[]{RelativeLayout.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{relativeLayout, Integer.valueOf(i2)}, this, f43611a, false, 38784, new Class[]{RelativeLayout.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (relativeLayout == null) {
            return 0;
        } else {
            int left = (int) ((((float) (relativeLayout.getLeft() - this.p)) / ((float) c.f43714c)) * ((float) this.n));
            int d2 = (int) ((((float) d(i2)) / ((float) c.f43714c)) * ((float) this.n));
            if (left >= 0) {
                if (left > this.n - d2) {
                    i3 = this.n;
                } else {
                    i3 = left;
                }
            }
            return i3;
        }
    }

    public final float a(float f2, int i2) {
        float f3;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i2)}, this, f43611a, false, 38775, new Class[]{Float.TYPE, Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i2)}, this, f43611a, false, 38775, new Class[]{Float.TYPE, Integer.TYPE}, Float.TYPE)).floatValue();
        }
        int d2 = d(i2);
        if (f2 < ((float) this.p)) {
            f3 = (float) (-this.j);
        } else if (f2 > ((float) (((int) UIUtils.dip2Px(getContext(), (float) (this.m - 16))) - d2))) {
            f3 = ((float) this.j) + ((UIUtils.dip2Px(getContext(), (float) this.m) - ((float) (this.p * 2))) - ((float) d2));
        } else {
            float f4 = f2 - ((float) this.p);
            f3 = f4 + (((float) this.j) * (((2.0f * f4) / ((UIUtils.dip2Px(getContext(), (float) this.m) - ((float) (this.p * 2))) - ((float) d2))) - 4.0f));
        }
        return f3;
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f43611a, false, 38787, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f43611a, false, 38787, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int d2 = c.f43714c - d(i3);
        int i4 = (int) ((((float) i2) / ((float) this.n)) * ((float) d2));
        if (i4 >= d2) {
            i4 = this.j + d2;
        }
        if (i4 <= 0) {
            i4 = -this.j;
        }
        if (i3 == 2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
            if (i2 >= this.n) {
                i4 = d2;
            }
            layoutParams.setMargins(i4, 0, 0, 0);
            this.l.setLayoutParams(layoutParams);
        } else if (i3 == 1) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.k.getLayoutParams();
            layoutParams2.setMargins(i4, 0, 0, 0);
            this.k.setLayoutParams(layoutParams2);
        }
        setStartTime(i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VEEffectSeekLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.m = UIUtils.px2dip(context, (float) UIUtils.getScreenWidth(context));
        this.j = (int) UIUtils.dip2Px(context, 0.0f);
        if (attributeSet2 != null) {
            this.p = Math.round(context.obtainStyledAttributes(attributeSet, R$styleable.VideoEditView).getDimension(6, 0.0f));
        }
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f43611a, false, 38765, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f43611a, false, 38765, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.gb, this, true);
        this.f43613c = new ArrayList<>();
        this.f43612b = (VEEffectSeekBar) inflate.findViewById(C0906R.id.a97);
        this.f43615e = (ImageView) inflate.findViewById(C0906R.id.da_);
        this.f43616f = (TextView) inflate.findViewById(C0906R.id.dbe);
        this.g = (TextView) inflate.findViewById(C0906R.id.djk);
        this.h = (ImageView) inflate.findViewById(C0906R.id.die);
        this.k = (RelativeLayout) inflate.findViewById(C0906R.id.cfs);
        this.l = (RelativeLayout) inflate.findViewById(C0906R.id.cgg);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EffectSeekLayout);
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        this.f43612b.setNormalColor(color);
        this.k.setOnTouchListener(new a(this.k, 1));
        this.l.setOnTouchListener(new a(this.l, 2));
        this.i = (RelativeLayout.LayoutParams) this.k.getLayoutParams();
        this.i.setMargins(-this.j, 0, 0, 0);
        this.k.setLayoutParams(this.i);
        this.f43615e.setImageDrawable(bc.a(b.f74589e.a(), -1, 1, (int) UIUtils.dip2Px(getContext(), 2.0f)));
        inflate.findViewById(C0906R.id.lz).setBackground(bc.a(b.f74589e.b(false), 0, (int) UIUtils.dip2Px(getContext(), 1.0f), 0));
        View findViewById = inflate.findViewById(C0906R.id.a98);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        int i3 = this.p;
        layoutParams.rightMargin = i3;
        layoutParams.leftMargin = i3;
        findViewById.setLayoutParams(layoutParams);
    }

    public final void a(int i2, long j2, int i3, boolean z) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j3), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f43611a, false, 38768, new Class[]{Integer.TYPE, Long.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j3), Integer.valueOf(i3), Byte.valueOf(z)}, this, f43611a, false, 38768, new Class[]{Integer.TYPE, Long.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setIndex(i2);
        int i4 = (int) j3;
        effectPointModel.setStartPoint(i4);
        effectPointModel.setEndPoint(i4);
        effectPointModel.setSelectColor(i3);
        effectPointModel.setFromEnd(z);
        this.f43613c.add(effectPointModel);
        this.f43612b.setEffectPointModels(this.f43613c);
    }
}
