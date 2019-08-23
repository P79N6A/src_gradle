package com.douyin.share.profile.share;

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
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.UIUtils;
import com.douyin.share.e.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;

public class ProfileImageDetailActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static final String f23238a = (Environment.getExternalStorageDirectory() + "/DCIM/Camera/");

    /* renamed from: b  reason: collision with root package name */
    View f23239b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f23240c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f23241d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f23242e;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f23243f;
    public Context g;
    public User h;
    private fe.a i;

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onBackPressed() {
        this.f23241d.setVisibility(8);
        this.f23242e.setVisibility(8);
        fe.b(this.i, this.f23240c, new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ProfileImageDetailActivity.this.finish();
            }

            public final void onAnimationStart(Animator animator) {
                ProfileImageDetailActivity.this.f23239b.setBackgroundColor(ProfileImageDetailActivity.this.getResources().getColor(C0906R.color.a7l));
            }
        });
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            sendBroadcast(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        supportRequestWindowFeature(1);
        setContentView((int) C0906R.layout.ih);
        this.g = this;
        this.i = (fe.a) getIntent().getParcelableExtra("extra_zoom_info");
        this.h = (User) getIntent().getSerializableExtra("share_info");
        this.f23239b = findViewById(C0906R.id.ail);
        this.f23240c = (ImageView) findViewById(C0906R.id.cpv);
        this.f23241d = (ImageView) findViewById(C0906R.id.a75);
        this.f23242e = (ImageView) findViewById(C0906R.id.bwz);
        this.f23243f = BitmapUtils.getBitmapFromSD(a.a());
        if (this.f23243f != null) {
            this.f23240c.setImageBitmap(this.f23243f);
        }
        this.f23240c.post(new Runnable() {
            public final void run() {
                ProfileImageDetailActivity.this.f23240c.setScaleType(ImageView.ScaleType.FIT_XY);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ProfileImageDetailActivity.this.f23240c.getLayoutParams();
                layoutParams.width = (ProfileImageDetailActivity.this.f23240c.getHeight() * 90) / 139;
                ProfileImageDetailActivity.this.f23240c.setLayoutParams(layoutParams);
            }
        });
        fe.a(this.i, (View) this.f23240c, (Animator.AnimatorListener) null);
        this.f23239b.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ProfileImageDetailActivity.this.onBackPressed();
            }
        });
        this.f23241d.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ProfileImageDetailActivity profileImageDetailActivity = ProfileImageDetailActivity.this;
                profileImageDetailActivity.f23242e.setVisibility(0);
                profileImageDetailActivity.f23241d.setVisibility(8);
                a.a(profileImageDetailActivity.f23242e);
                r.onEvent(MobClick.obtain().setEventName("download_share_person").setLabelName("click_download"));
                com.ss.android.b.a.a.a.a(new Runnable() {
                    public final void run() {
                        String str;
                        if (ProfileImageDetailActivity.this.h != null) {
                            str = ProfileImageDetailActivity.this.h.getUid() + ".png";
                        } else {
                            str = "profile.png";
                        }
                        if (BitmapUtils.saveBitmapToSD(ProfileImageDetailActivity.this.f23243f, ProfileImageDetailActivity.f23238a, str)) {
                            ProfileImageDetailActivity.this.a(ProfileImageDetailActivity.f23238a + str);
                            ProfileImageDetailActivity profileImageDetailActivity = ProfileImageDetailActivity.this;
                            String str2 = ProfileImageDetailActivity.f23238a + str;
                            String str3 = Build.BRAND;
                            if (!TextUtils.isEmpty(str3) && str3.toLowerCase().equals("vivo")) {
                                String str4 = Environment.getExternalStorageDirectory() + "/相机/" + new File(str2).getName();
                                b.c(str2, str4);
                                com.ss.android.ugc.aweme.framework.a.a.a("vivo: " + str4);
                                profileImageDetailActivity.a(str4);
                            }
                            com.ss.android.b.a.a.a.b(new Runnable() {
                                public final void run() {
                                    UIUtils.displayToast(ProfileImageDetailActivity.this.g, (int) C0906R.string.c1f);
                                    ProfileImageDetailActivity.this.f23242e.clearAnimation();
                                    ProfileImageDetailActivity.this.f23242e.setVisibility(8);
                                    ProfileImageDetailActivity.this.f23241d.setVisibility(0);
                                }
                            });
                            return;
                        }
                        com.ss.android.b.a.a.a.b(new Runnable() {
                            public final void run() {
                                UIUtils.displayToast(ProfileImageDetailActivity.this.g, (int) C0906R.string.c17);
                                ProfileImageDetailActivity.this.f23242e.clearAnimation();
                                ProfileImageDetailActivity.this.f23242e.setVisibility(8);
                                ProfileImageDetailActivity.this.f23241d.setVisibility(0);
                            }
                        });
                    }
                });
            }
        });
    }
}
