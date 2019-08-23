package com.ss.android.ugc.aweme.photo.local;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.facebook.common.internal.Preconditions;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class MediaTypeNavigator extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58603a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f58604b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f58605c;

    /* renamed from: d  reason: collision with root package name */
    public int f58606d;

    /* renamed from: e  reason: collision with root package name */
    public View f58607e;

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f58603a, false, 63704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58603a, false, 63704, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.f58604b = (ImageView) findViewById(C0906R.id.au6);
        this.f58605c = (LinearLayout) findViewById(C0906R.id.cyn);
    }

    public MediaTypeNavigator(Context context) {
        super(context);
    }

    public void setupWithViewPager(final ViewPager viewPager) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{viewPager}, this, f58603a, false, 63705, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager}, this, f58603a, false, 63705, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        Preconditions.checkNotNull(viewPager);
        Preconditions.checkNotNull(viewPager.getAdapter());
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter.getCount() == 2) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkNotNull(Boolean.valueOf(z));
        this.f58606d = UIUtils.getScreenWidth(getContext()) / adapter.getCount();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f58604b.getLayoutParams();
        layoutParams.width = this.f58606d;
        this.f58604b.setLayoutParams(layoutParams);
        this.f58605c.removeAllViews();
        int count = adapter.getCount();
        for (final int i = 0; i < count; i++) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0906R.layout.ar6, this.f58605c, false);
            if (i == 0) {
                this.f58607e = textView;
                textView.setSelected(true);
                textView.getPaint().setFakeBoldText(true);
                textView.setText(C0906R.string.dr0);
            } else if (i == 1) {
                textView.setText(C0906R.string.b0s);
            }
            textView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58608a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f58608a, false, 63706, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f58608a, false, 63706, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    viewPager.setCurrentItem(i);
                }
            });
            this.f58605c.addView(textView);
        }
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58612a;

            public void onPageScrollStateChanged(int i) {
            }

            public void onPageSelected(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58612a, false, 63708, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58612a, false, 63708, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                View childAt = MediaTypeNavigator.this.f58605c.getChildAt(i);
                if (MediaTypeNavigator.this.f58607e != null) {
                    MediaTypeNavigator.this.f58607e.setSelected(false);
                    ((TextView) MediaTypeNavigator.this.f58607e).getPaint().setFakeBoldText(false);
                }
                if (childAt != null) {
                    childAt.setSelected(true);
                    ((TextView) childAt).getPaint().setFakeBoldText(true);
                    MediaTypeNavigator.this.f58607e = childAt;
                }
            }

            public void onPageScrolled(int i, float f2, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f58612a, false, 63707, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f58612a, false, 63707, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                MediaTypeNavigator.this.f58604b.setTranslationX(((float) MediaTypeNavigator.this.f58606d) * (((float) i) + f2));
            }
        });
    }

    public MediaTypeNavigator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaTypeNavigator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
