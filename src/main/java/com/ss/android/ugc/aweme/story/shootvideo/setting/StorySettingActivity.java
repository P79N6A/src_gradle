package com.ss.android.ugc.aweme.story.shootvideo.setting;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.base.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.story.shootvideo.c;
import com.ss.android.ugc.aweme.story.shootvideo.setting.e;

public class StorySettingActivity extends AmeActivity implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74088a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f74089b = 1;

    /* renamed from: d  reason: collision with root package name */
    private static int f74090d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f74091e = false;

    /* renamed from: f  reason: collision with root package name */
    private static int f74092f = 0;
    private static boolean k = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f74093c;
    private boolean g;
    private ViewGroup h;
    private ViewGroup i;
    private a j;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f74088a, false, 86003, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74088a, false, 86003, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.setting.StorySettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.setting.StorySettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74088a, false, 86004, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74088a, false, 86004, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.setting.StorySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static void a(Activity activity, int i2, int i3, boolean z, boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, null, f74088a, true, 85996, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, null, f74088a, true, 85996, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        b(activity, i2, i3, z, 0, z2, z3);
    }

    public final int a() {
        if (f74089b == 1) {
            return 0;
        }
        return 1;
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f74088a, false, 86000, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74088a, false, 86000, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (this.f74093c) {
            overridePendingTransition(0, 0);
        } else if (f74090d == 2) {
            overridePendingTransition(0, C0906R.anim.s);
        } else {
            overridePendingTransition(0, C0906R.anim.da);
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f74088a, false, 85998, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f74088a, false, 85998, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.setting.StorySettingActivity", "onCreate", true);
        if (f74091e) {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
        }
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.setting.StorySettingActivity", "onCreate", false);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f74088a, false, 85999, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74088a, false, 85999, new Class[0], Void.TYPE);
        } else {
            if (k) {
                i2 = C0906R.layout.e3;
            } else {
                i2 = C0906R.layout.e4;
            }
            setContentView(i2);
            v.b((Activity) this);
            f74090d = getIntent().getIntExtra("enter_type", 2);
            f74092f = getIntent().getIntExtra("top_margin", 0);
            this.g = getIntent().getBooleanExtra("sub_page", false);
            if (PatchProxy.isSupport(new Object[0], this, f74088a, false, 86001, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74088a, false, 86001, new Class[0], Void.TYPE);
            } else {
                this.i = (ViewGroup) findViewById(C0906R.id.ci6);
                this.h = (ViewGroup) findViewById(C0906R.id.bwg);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i.getLayoutParams();
                f74092f = 0;
                layoutParams.topMargin = f74092f + p.c();
                this.i.setLayoutParams(layoutParams);
                if (k) {
                    if (PatchProxy.isSupport(new Object[0], this, f74088a, false, 86002, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f74088a, false, 86002, new Class[0], Void.TYPE);
                    } else {
                        ViewPagerBottomSheetBehavior a2 = ViewPagerBottomSheetBehavior.a(findViewById(C0906R.id.mr));
                        a2.l = new ViewPagerBottomSheetBehavior.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f74105a;

                            public final void a(@NonNull View view, float f2) {
                            }

                            public final void a(@NonNull View view, int i) {
                                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f74105a, false, 86010, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f74105a, false, 86010, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                if (i == 5) {
                                    StorySettingActivity.this.f74093c = true;
                                    StorySettingActivity.this.finish();
                                }
                            }
                        };
                        a2.f34776e = true;
                        a2.a(p.a(this) + p.d(this));
                    }
                }
            }
            this.j = new a();
            this.j.a(this, this.h);
            this.j.j = new e.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74103a;

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74103a, false, 86008, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74103a, false, 86008, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == 4) {
                        com.ss.android.ugc.aweme.port.in.a.f61121d.a((Context) StorySettingActivity.this, StorySettingActivity.f74089b);
                    }
                }

                public final void a(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74103a, false, 86009, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74103a, false, 86009, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    StorySettingActivity.this.f74093c = z;
                    if (!z) {
                        StorySettingActivity.this.finish();
                    }
                }
            };
            if (f74089b == 1) {
                this.j.a(this.g);
                this.h.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838333));
            } else {
                this.j.b(this.g);
                this.h.setBackgroundColor(getResources().getColor(C0906R.color.p9));
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.setting.StorySettingActivity", "onCreate", false);
    }

    public static void a(Activity activity, int i2, int i3, int i4, boolean z) {
        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0)}, null, f74088a, true, 85995, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)}, null, f74088a, true, 85995, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        b(activity, i2, i3, true, i4, z, true);
    }

    public static void a(Activity activity, int i2, int i3, boolean z, int i4) {
        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i4)}, null, f74088a, true, 85994, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z), Integer.valueOf(i4)}, null, f74088a, true, 85994, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        b(activity, i2, i3, z, i4, true, true);
    }

    public static void a(Activity activity, int i2, int i3, boolean z, int i4, ViewGroup viewGroup) {
        final Activity activity2 = activity;
        int i5 = i3;
        boolean z2 = z;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i4), viewGroup2}, null, f74088a, true, 85997, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, ViewGroup.class}, Void.TYPE)) {
            Object[] objArr = {activity2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z), Integer.valueOf(i4), viewGroup2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f74088a, true, 85997, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, ViewGroup.class}, Void.TYPE);
            return;
        }
        final a aVar = new a();
        aVar.a(activity2, viewGroup2);
        f74089b = i5;
        f74090d = i2;
        f74092f = i4;
        if (i5 == 1) {
            aVar.a(z2);
        } else {
            aVar.b(z2);
        }
        aVar.j = new e.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74100a;

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74100a, false, 86006, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74100a, false, 86006, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == 4) {
                    com.ss.android.ugc.aweme.port.in.a.f61121d.a((Context) activity2, StorySettingActivity.f74089b);
                }
            }

            public final void a(boolean z) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74100a, false, 86007, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74100a, false, 86007, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (!z) {
                    aVar.dismiss();
                }
            }
        };
        if (PatchProxy.isSupport(new Object[0], aVar, a.f74107a, false, 86020, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f74107a, false, 86020, new Class[0], Void.TYPE);
            return;
        }
        aVar.g.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar.g, "translationX", new float[]{(float) fc.b(aVar.f74112f), 0.0f});
        ofFloat.setDuration(300);
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74116a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f74116a, false, 86027, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f74116a, false, 86027, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.start();
    }

    private static void b(Activity activity, int i2, int i3, boolean z, int i4, boolean z2, boolean z3) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i4), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, null, f74088a, true, 85992, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z), Integer.valueOf(i4), Byte.valueOf(z2), Byte.valueOf(z3)}, null, f74088a, true, 85992, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (activity2 != null) {
            final Activity activity3 = activity;
            final int i5 = i2;
            final int i6 = i3;
            final boolean z4 = z;
            final int i7 = i4;
            final boolean z5 = z2;
            final boolean z6 = z3;
            AnonymousClass1 r0 = new f.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74094a;

                public final void b() {
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f74094a, false, 86005, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f74094a, false, 86005, new Class[0], Void.TYPE);
                        return;
                    }
                    StorySettingActivity.a(activity3, i5, i6, z4, i7, z5, z6);
                }
            };
            if (c.a(activity2, "story_setting", (f.a) r0)) {
                a(activity, i2, i3, z, i4, z2, z3);
            }
        }
    }

    public static void a(Activity activity, int i2, int i3, boolean z, int i4, boolean z2, boolean z3) {
        Activity activity2 = activity;
        int i5 = i2;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i4), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, null, f74088a, true, 85993, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z), Integer.valueOf(i4), Byte.valueOf(z2), Byte.valueOf(z3)}, null, f74088a, true, 85993, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        f74089b = i3;
        f74091e = z;
        k = z3;
        Intent intent = new Intent(activity2, StorySettingActivity.class);
        intent.putExtra("enter_type", i5);
        intent.putExtra("top_margin", i4);
        intent.putExtra("sub_page", z2);
        activity2.startActivity(intent);
        if (i5 == 2) {
            activity2.overridePendingTransition(C0906R.anim.r, 0);
        } else {
            activity2.overridePendingTransition(C0906R.anim.cz, 0);
        }
    }
}
