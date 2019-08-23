package com.ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;

public final class AwesomeSplashMask extends RelativeLayout implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39422a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f39423b;

    /* renamed from: c  reason: collision with root package name */
    private int f39424c = 4;

    public final void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f39422a, false, 31952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39422a, false, 31952, new Class[0], Void.TYPE);
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
            public static ChangeQuickRedirect f39425a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f39425a, false, 31956, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f39425a, false, 31956, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (c.Q(AwesomeSplashMask.this.f39423b)) {
                    g.e(view.getContext(), AwesomeSplashMask.this.f39423b);
                }
            }
        });
        View findViewById2 = findViewById(C0906R.id.f4426it);
        if (a.a()) {
            findViewById2.setVisibility(8);
        }
    }

    public AwesomeSplashMask(Context context) {
        super(context);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f39422a, false, 31954, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f39422a, false, 31954, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        requestDisallowInterceptTouchEvent(true);
        if (this.f39424c != 2 || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f39422a, false, 31955, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f39422a, false, 31955, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f39424c == 4 || !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public final void onEvent(AwesomeSplashEvent awesomeSplashEvent) {
        AwesomeSplashEvent awesomeSplashEvent2 = awesomeSplashEvent;
        if (PatchProxy.isSupport(new Object[]{awesomeSplashEvent2}, this, f39422a, false, 31953, new Class[]{AwesomeSplashEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awesomeSplashEvent2}, this, f39422a, false, 31953, new Class[]{AwesomeSplashEvent.class}, Void.TYPE);
            return;
        }
        this.f39424c = awesomeSplashEvent2.f39420b;
        this.f39423b = awesomeSplashEvent2.f39421c;
        if (this.f39424c == 3) {
            animate().alpha(0.0f).setDuration(260).start();
            Context context = getContext();
            Aweme aweme = this.f39423b;
            int i = 2;
            if (PatchProxy.isSupport(new Object[]{context, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31672, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31672, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            } else if (c.Q(aweme) && h.a() != 0) {
                if (h.d()) {
                    i = 1;
                }
                h.f2933c = 0;
                HashMap hashMap = new HashMap();
                hashMap.put("feedduration", String.valueOf(System.currentTimeMillis() - h.a()));
                hashMap.put("awemelaunch", String.valueOf(i));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ad_extra_data", new Gson().toJson((Object) hashMap));
                com.ss.android.ugc.aweme.commercialize.log.g.b(context, "feed_show", aweme, com.ss.android.ugc.aweme.commercialize.log.g.a(context, aweme, "awesome splash feed show", false, (Map<String, String>) hashMap2));
            }
        }
    }

    public AwesomeSplashMask(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AwesomeSplashMask(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
