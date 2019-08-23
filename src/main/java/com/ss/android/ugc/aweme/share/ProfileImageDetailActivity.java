package com.ss.android.ugc.aweme.share;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.UIUtils;
import com.douyin.share.profile.share.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.a.f;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;

public class ProfileImageDetailActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64494a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f64495b = (Environment.getExternalStorageDirectory() + "/DCIM/Camera/");

    /* renamed from: c  reason: collision with root package name */
    View f64496c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f64497d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f64498e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f64499f;
    public Bitmap g;
    public Context h;
    public User i;
    private fe.a j;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64494a, false, 73134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64494a, false, 73134, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.ProfileImageDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.ProfileImageDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64494a, false, 73135, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64494a, false, 73135, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.ProfileImageDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f64494a, false, 73130, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64494a, false, 73130, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f64494a, false, 73129, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64494a, false, 73129, new Class[0], Void.TYPE);
            return;
        }
        this.f64498e.setVisibility(8);
        this.f64499f.setVisibility(8);
        if (PatchProxy.isSupport(new Object[0], this, f64494a, false, 73128, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64494a, false, 73128, new Class[0], Void.TYPE);
            return;
        }
        fe.b(this.j, this.f64497d, new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64506a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f64506a, false, 73139, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f64506a, false, 73139, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                ProfileImageDetailActivity.this.finish();
            }

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f64506a, false, 73140, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f64506a, false, 73140, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                ProfileImageDetailActivity.this.f64496c.setBackgroundColor(ProfileImageDetailActivity.this.getResources().getColor(C0906R.color.a7l));
            }
        });
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f64494a, false, 73133, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f64494a, false, 73133, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            File file = new File(str2);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            sendBroadcast(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64494a, false, 73122, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64494a, false, 73122, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.ProfileImageDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        supportRequestWindowFeature(1);
        setContentView((int) C0906R.layout.ih);
        this.h = this;
        if (PatchProxy.isSupport(new Object[0], this, f64494a, false, 73126, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64494a, false, 73126, new Class[0], Void.TYPE);
        } else {
            this.j = (fe.a) getIntent().getParcelableExtra("extra_zoom_info");
            this.i = (User) getIntent().getSerializableExtra("share_info");
        }
        if (PatchProxy.isSupport(new Object[0], this, f64494a, false, 73123, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64494a, false, 73123, new Class[0], Void.TYPE);
        } else {
            this.f64496c = findViewById(C0906R.id.ail);
            this.f64497d = (ImageView) findViewById(C0906R.id.cpv);
            this.f64498e = (ImageView) findViewById(C0906R.id.a75);
            this.f64499f = (ImageView) findViewById(C0906R.id.bwz);
            this.g = BitmapUtils.getBitmapFromSD(a.a());
            if (this.g != null) {
                this.f64497d.setImageBitmap(this.g);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f64494a, false, 73124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64494a, false, 73124, new Class[0], Void.TYPE);
        } else {
            this.f64497d.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64504a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f64504a, false, 73138, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f64504a, false, 73138, new Class[0], Void.TYPE);
                        return;
                    }
                    ProfileImageDetailActivity.this.f64497d.setScaleType(ImageView.ScaleType.FIT_XY);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ProfileImageDetailActivity.this.f64497d.getLayoutParams();
                    int screenWidth = UIUtils.getScreenWidth(ProfileImageDetailActivity.this);
                    int screenHeight = UIUtils.getScreenHeight(ProfileImageDetailActivity.this);
                    float f2 = (float) screenWidth;
                    float f3 = (float) screenHeight;
                    if (0.625f >= f2 / f3) {
                        layoutParams.width = screenWidth;
                        layoutParams.height = (int) (f2 / 0.625f);
                    } else {
                        layoutParams.height = screenHeight;
                        layoutParams.width = (int) (f3 * 0.625f);
                    }
                    ProfileImageDetailActivity.this.f64497d.setLayoutParams(layoutParams);
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f64494a, false, 73127, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64494a, false, 73127, new Class[0], Void.TYPE);
        } else {
            fe.a(this.j, (View) this.f64497d, (Animator.AnimatorListener) null);
        }
        this.f64496c.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64500a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64500a, false, 73136, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64500a, false, 73136, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                ProfileImageDetailActivity.this.onBackPressed();
            }
        });
        this.f64498e.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64502a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64502a, false, 73137, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64502a, false, 73137, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                ProfileImageDetailActivity profileImageDetailActivity = ProfileImageDetailActivity.this;
                if (PatchProxy.isSupport(new Object[0], profileImageDetailActivity, ProfileImageDetailActivity.f64494a, false, 73131, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], profileImageDetailActivity, ProfileImageDetailActivity.f64494a, false, 73131, new Class[0], Void.TYPE);
                    return;
                }
                profileImageDetailActivity.f64499f.setVisibility(0);
                profileImageDetailActivity.f64498e.setVisibility(8);
                com.douyin.share.e.a.a.a(profileImageDetailActivity.f64499f);
                r.onEvent(MobClick.obtain().setEventName("download_share_person").setLabelName("click_download"));
                com.ss.android.b.a.a.a.a(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64508a;

                    public final void run() {
                        String str;
                        if (PatchProxy.isSupport(new Object[0], this, f64508a, false, 73141, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f64508a, false, 73141, new Class[0], Void.TYPE);
                            return;
                        }
                        if (ProfileImageDetailActivity.this.i != null) {
                            str = ProfileImageDetailActivity.this.i.getUid() + ".png";
                        } else {
                            str = "profile.png";
                        }
                        if (BitmapUtils.saveBitmapToSD(ProfileImageDetailActivity.this.g, ProfileImageDetailActivity.f64495b, str)) {
                            f.b(ProfileImageDetailActivity.this, ProfileImageDetailActivity.f64495b + str);
                            ProfileImageDetailActivity.this.a(ProfileImageDetailActivity.f64495b + str);
                            ProfileImageDetailActivity profileImageDetailActivity = ProfileImageDetailActivity.this;
                            String str2 = ProfileImageDetailActivity.f64495b + str;
                            if (PatchProxy.isSupport(new Object[]{str2}, profileImageDetailActivity, ProfileImageDetailActivity.f64494a, false, 73132, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str2}, profileImageDetailActivity, ProfileImageDetailActivity.f64494a, false, 73132, new Class[]{String.class}, Void.TYPE);
                            } else {
                                String str3 = Build.BRAND;
                                if (!TextUtils.isEmpty(str3) && str3.toLowerCase().equals("vivo")) {
                                    String str4 = Environment.getExternalStorageDirectory() + "/相机/" + new File(str2).getName();
                                    b.c(str2, str4);
                                    com.ss.android.ugc.aweme.framework.a.a.a("vivo: " + str4);
                                    profileImageDetailActivity.a(str4);
                                }
                            }
                            com.ss.android.b.a.a.a.b(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f64510a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f64510a, false, 73142, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f64510a, false, 73142, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    com.bytedance.ies.dmt.ui.d.a.a(ProfileImageDetailActivity.this.h, (int) C0906R.string.c1f).a();
                                    ProfileImageDetailActivity.this.f64499f.clearAnimation();
                                    ProfileImageDetailActivity.this.f64499f.setVisibility(8);
                                    ProfileImageDetailActivity.this.f64498e.setVisibility(0);
                                }
                            });
                            return;
                        }
                        com.ss.android.b.a.a.a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f64512a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f64512a, false, 73143, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f64512a, false, 73143, new Class[0], Void.TYPE);
                                    return;
                                }
                                com.bytedance.ies.dmt.ui.d.a.b(ProfileImageDetailActivity.this.h, (int) C0906R.string.c17).a();
                                ProfileImageDetailActivity.this.f64499f.clearAnimation();
                                ProfileImageDetailActivity.this.f64499f.setVisibility(8);
                                ProfileImageDetailActivity.this.f64498e.setVisibility(0);
                            }
                        });
                    }
                });
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.share.ProfileImageDetailActivity", "onCreate", false);
    }
}
