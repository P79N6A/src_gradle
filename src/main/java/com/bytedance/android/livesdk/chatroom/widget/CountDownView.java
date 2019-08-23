package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class CountDownView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13358a;

    /* renamed from: b  reason: collision with root package name */
    public Animation f13359b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f13360c;

    /* renamed from: d  reason: collision with root package name */
    public a f13361d;

    /* renamed from: e  reason: collision with root package name */
    public int f13362e;

    public interface a {
        void a();
    }

    public void setCountDownListener(a aVar) {
        this.f13361d = aVar;
    }

    public CountDownView(Context context) {
        super(context);
        a(null, 0);
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    private void a(AttributeSet attributeSet, int i) {
        if (PatchProxy.isSupport(new Object[]{attributeSet, Integer.valueOf(i)}, this, f13358a, false, 7805, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet, Integer.valueOf(i)}, this, f13358a, false, 7805, new Class[]{AttributeSet.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CountDownView, i, 0);
        this.f13362e = obtainStyledAttributes.getInteger(0, 4000);
        obtainStyledAttributes.recycle();
        Context context = getContext();
        this.f13360c = new TextView(getContext());
        this.f13360c.setTextColor(getResources().getColor(C0906R.color.a_i));
        this.f13360c.setTextSize(60.0f);
        this.f13360c.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.f13360c, layoutParams);
        this.f13359b = AnimationUtils.loadAnimation(context, C0906R.anim.ds);
    }

    public CountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i);
    }
}
