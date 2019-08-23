package com.ss.android.ugc.aweme.feedback;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.a.a;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.common.util.h;
import com.ss.android.image.b;
import com.ss.android.image.j;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.app.LargeImageDialog;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.utils.eb;

public class FeedbackActivity extends AmeBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47077a;
    private boolean A;
    private View B;
    private SwipeOverlayFrameLayout C;
    private View D;
    private FragmentManager E;
    private MyFeedbackFragment F;

    /* renamed from: b  reason: collision with root package name */
    boolean f47078b;

    /* renamed from: c  reason: collision with root package name */
    LargeImageDialog f47079c;

    /* renamed from: d  reason: collision with root package name */
    j f47080d;

    /* renamed from: e  reason: collision with root package name */
    b f47081e;

    /* renamed from: f  reason: collision with root package name */
    h f47082f;
    boolean g;
    private BaseAppData u;
    private boolean v;
    private View w;
    private TextView x;
    private TextView y;
    private boolean z = true;

    public final int a() {
        return C0906R.layout.m7;
    }

    public void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f47077a, false, 43752, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f47077a, false, 43752, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f47077a, false, 43743, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47077a, false, 43743, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.f47080d != null) {
            this.f47080d.b();
        }
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f47077a, false, 43746, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47077a, false, 43746, new Class[0], Void.TYPE);
            return;
        }
        eb.a(this, getResources().getColor(C0906R.color.yx));
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f47077a, false, 43751, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47077a, false, 43751, new Class[0], Void.TYPE);
        } else if (!isFinishing()) {
            Intent intent = null;
            if (isTaskRoot()) {
                intent = ToolUtils.getLaunchIntentForPackage(this, getPackageName());
            }
            finish();
            if (intent != null) {
                startActivity(intent);
            }
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f47077a, false, 43744, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47077a, false, 43744, new Class[0], Void.TYPE);
            return;
        }
        if (this.f47079c != null) {
            this.f47079c.dismiss();
            this.f47079c = null;
        }
        super.onDestroy();
        if (this.f47080d != null) {
            this.f47080d.c();
        }
        if (this.f47082f != null) {
            this.f47082f.a();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f47077a, false, 43742, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47077a, false, 43742, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onResume", true);
        super.onResume();
        if (this.f47080d != null) {
            this.f47080d.a();
        }
        if (this.z) {
            g();
        } else if (a.a()) {
            this.B.setVisibility(0);
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onResume", false);
        }
        this.B.setVisibility(8);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onResume", false);
    }

    public final void g() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[0], this, f47077a, false, 43745, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47077a, false, 43745, new Class[0], Void.TYPE);
        } else if (this.v != a.a()) {
            this.v = a.a();
            Resources resources = getResources();
            if (this.v) {
                i = 2130838254;
            } else {
                i = 2130838252;
            }
            int i6 = 2130838305;
            if (this.v) {
                i2 = 2130838306;
            } else {
                i2 = 2130838305;
            }
            if (this.v) {
                i3 = 2130838300;
            } else {
                i3 = 2130838299;
            }
            if (this.v) {
                i4 = C0906R.color.a7a;
            } else {
                i4 = C0906R.color.a7_;
            }
            if (this.v) {
                i6 = C0906R.color.ds;
            }
            ColorStateList colorStateList = resources.getColorStateList(i6);
            this.w.setBackgroundResource(i);
            this.q.setTextColor(resources.getColor(i4));
            UIUtils.setViewBackgroundWithPadding((View) this.x, i2);
            this.x.setTextColor(colorStateList);
            this.x.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.x.setCompoundDrawablesWithIntrinsicBounds(i3, 0, 0, 0);
            if (this.v) {
                i5 = C0906R.color.mi;
            } else {
                i5 = C0906R.color.mh;
            }
            this.C.setBackgroundColor(resources.getColor(i5));
            this.u.a(this.D, resources, this.v, (Activity) this);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f47077a, false, 43741, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f47077a, false, 43741, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onCreate", true);
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f47077a, false, 43747, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47077a, false, 43747, new Class[0], Void.TYPE);
        } else {
            this.w = findViewById(C0906R.id.d3m);
            this.y = (TextView) findViewById(C0906R.id.au8);
            this.x = (TextView) findViewById(C0906R.id.iu);
            this.x.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47083a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f47083a, false, 43754, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f47083a, false, 43754, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    FeedbackActivity.this.onBackPressed();
                }
            });
            this.D = findViewById(C0906R.id.dxy);
            this.D.setVisibility(0);
            this.D.setOnClickListener(new a(this));
            this.B = findViewById(C0906R.id.bqt);
            View findViewById = findViewById(C0906R.id.cxy);
            if (findViewById instanceof SwipeOverlayFrameLayout) {
                this.C = (SwipeOverlayFrameLayout) findViewById;
            }
            if (this.A && this.C != null) {
                this.C.setOnSwipeListener(new SwipeOverlayFrameLayout.OnSwipeListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f47085a;

                    public final boolean onSwipeLeft() {
                        if (PatchProxy.isSupport(new Object[0], this, f47085a, false, 43756, new Class[0], Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47085a, false, 43756, new Class[0], Boolean.TYPE)).booleanValue();
                        } else if (!FeedbackActivity.this.g) {
                            return false;
                        } else {
                            FeedbackActivity.this.onBackPressed();
                            return true;
                        }
                    }

                    public final boolean onSwipeRight() {
                        if (PatchProxy.isSupport(new Object[0], this, f47085a, false, 43755, new Class[0], Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47085a, false, 43755, new Class[0], Boolean.TYPE)).booleanValue();
                        } else if (FeedbackActivity.this.g) {
                            return false;
                        } else {
                            FeedbackActivity.this.onBackPressed();
                            return true;
                        }
                    }
                });
            }
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f47078b = intent.getBooleanExtra("use_anim", false);
            this.A = intent.getBooleanExtra("use_swipe", false);
            this.g = intent.getBooleanExtra("slide_out_left", false);
            if (!TextUtils.isEmpty(intent.getStringExtra("feedback_id"))) {
                com.bytedance.ies.dmt.ui.d.a.a((Context) this, (int) C0906R.string.aef).a();
            }
        }
        this.z = getResources().getBoolean(C0906R.bool.h);
        this.f47081e = new b(this);
        this.f47082f = new h();
        Bundle bundle2 = new Bundle();
        this.F = new MyFeedbackFragment();
        this.F.setArguments(bundle2);
        this.E = getSupportFragmentManager();
        FragmentTransaction beginTransaction = this.E.beginTransaction();
        beginTransaction.add(C0906R.id.aic, this.F, "_my_");
        beginTransaction.commit();
        this.u = BaseAppData.a();
        this.u.f2501f = false;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f47077a, false, 43749, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f47077a, false, 43749, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i != 1001) {
            int i3 = i2;
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("_my_");
            if (findFragmentByTag instanceof MyFeedbackFragment) {
                ((MyFeedbackFragment) findFragmentByTag).f47094b = true;
            }
        }
    }
}
