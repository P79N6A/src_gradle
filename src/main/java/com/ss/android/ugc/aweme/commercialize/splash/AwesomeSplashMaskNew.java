package com.ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.tt.miniapphost.util.UIUtils;

public final class AwesomeSplashMaskNew extends RelativeLayout implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39427a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f39428b;

    /* renamed from: c  reason: collision with root package name */
    public float f39429c;

    /* renamed from: d  reason: collision with root package name */
    private int f39430d = 4;

    public final void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f39427a, false, 31957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39427a, false, 31957, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        View findViewById = findViewById(C0906R.id.ir);
        if (findViewById != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.topMargin += p.c();
            findViewById.setLayoutParams(marginLayoutParams);
        }
        setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39431a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f39431a, false, 31963, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f39431a, false, 31963, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (c.Q(AwesomeSplashMaskNew.this.f39428b)) {
                    g.e(view.getContext(), AwesomeSplashMaskNew.this.f39428b);
                }
            }
        });
        View findViewById2 = findViewById(C0906R.id.f4426it);
        if (a.a()) {
            findViewById2.setVisibility(8);
        }
    }

    public AwesomeSplashMaskNew(Context context) {
        super(context);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f39427a, false, 31961, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f39427a, false, 31961, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        requestDisallowInterceptTouchEvent(true);
        if (this.f39430d != 2 || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f39427a, false, 31962, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f39427a, false, 31962, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f39430d == 4 || !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public final void onEvent(AwesomeSplashEvent awesomeSplashEvent) {
        if (PatchProxy.isSupport(new Object[]{awesomeSplashEvent}, this, f39427a, false, 31960, new Class[]{AwesomeSplashEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awesomeSplashEvent}, this, f39427a, false, 31960, new Class[]{AwesomeSplashEvent.class}, Void.TYPE);
            return;
        }
        this.f39430d = awesomeSplashEvent.f39420b;
        this.f39428b = awesomeSplashEvent.f39421c;
        if (this.f39430d == 3) {
            animate().alpha(0.0f).setDuration(260).start();
            return;
        }
        if (this.f39430d == 2) {
            if (PatchProxy.isSupport(new Object[0], this, f39427a, false, 31958, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39427a, false, 31958, new Class[0], Void.TYPE);
            } else if (this.f39428b != null && this.f39428b.getAwemeRawAd() != null && this.f39428b.getAwemeRawAd().getSplashInfo() != null) {
                AwemeSplashInfo splashInfo = this.f39428b.getAwemeRawAd().getSplashInfo();
                ((TextView) findViewById(C0906R.id.f4426it)).setText(splashInfo.getPredownloadText());
                final AwemeSplashInfo.SkipInfo skipInfo = splashInfo.getSkipInfo();
                final TextView textView = (TextView) findViewById(C0906R.id.is);
                if (skipInfo != null) {
                    ((GradientDrawable) textView.getBackground()).setColor(Color.parseColor(skipInfo.getBackgroundColor()));
                    textView.setTextColor(Color.parseColor(skipInfo.getTextColor()));
                    this.f39429c = splashInfo.getSplashShowTime();
                    if (skipInfo.isCountdown_enable()) {
                        textView.setText(a(this.f39429c, skipInfo.getCountdownUnit(), skipInfo.getText()));
                        textView.postDelayed(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f39433a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f39433a, false, 31964, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f39433a, false, 31964, new Class[0], Void.TYPE);
                                    return;
                                }
                                AwesomeSplashMaskNew.this.f39429c -= 1000.0f;
                                if (AwesomeSplashMaskNew.this.f39429c > 0.0f) {
                                    textView.setText(AwesomeSplashMaskNew.this.a(AwesomeSplashMaskNew.this.f39429c, skipInfo.getCountdownUnit(), skipInfo.getText()));
                                    textView.postDelayed(this, 1000);
                                }
                            }
                        }, 1000);
                    } else {
                        textView.setText(skipInfo.getText());
                    }
                    Rect rect = new Rect();
                    textView.getHitRect(rect);
                    rect.top = (int) (((float) rect.top) - UIUtils.dip2Px(getContext(), (float) skipInfo.getHeightExtraSize()));
                    rect.bottom = (int) (((float) rect.bottom) + UIUtils.dip2Px(getContext(), (float) skipInfo.getHeightExtraSize()));
                    rect.left = (int) (((float) rect.left) - UIUtils.dip2Px(getContext(), (float) skipInfo.getWidthExtraSize()));
                    rect.right = (int) (((float) rect.right) + UIUtils.dip2Px(getContext(), (float) skipInfo.getWidthExtraSize()));
                    ((View) textView.getParent()).setTouchDelegate(new TouchDelegate(rect, textView));
                } else {
                    textView.setVisibility(8);
                }
                AwemeSplashInfo.LabelInfo labelInfo = splashInfo.getLabelInfo();
                TextView textView2 = (TextView) findViewById(C0906R.id.d8w);
                if (labelInfo != null) {
                    textView2.setText(labelInfo.getText());
                    ((GradientDrawable) textView2.getBackground()).setColor(Color.parseColor(labelInfo.getBackgroundColor()));
                    textView2.setTextColor(Color.parseColor(labelInfo.getTextColor()));
                    return;
                }
                textView2.setVisibility(8);
            }
        }
    }

    public AwesomeSplashMaskNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AwesomeSplashMaskNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final String a(float f2, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), str3, str4}, this, f39427a, false, 31959, new Class[]{Float.TYPE, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), str3, str4}, this, f39427a, false, 31959, new Class[]{Float.TYPE, String.class, String.class}, String.class);
        }
        return ((int) (f2 / 1000.0f)) + str3 + " " + str4;
    }
}
