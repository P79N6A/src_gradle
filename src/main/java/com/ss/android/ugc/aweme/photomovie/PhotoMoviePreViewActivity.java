package com.ss.android.ugc.aweme.photomovie;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.ViewCompat;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerPresenter;
import com.ss.android.ugc.aweme.photomovie.transition.a;

public class PhotoMoviePreViewActivity extends AmeActivity implements View.OnClickListener, PhotoMoviePlayerPresenter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58826a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f58827b;

    /* renamed from: c  reason: collision with root package name */
    public TextureView f58828c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f58829d;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f58826a, false, 63978, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58826a, false, 63978, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58826a, false, 63979, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58826a, false, 63979, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f58826a, false, 63974, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58826a, false, 63974, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.f58828c.bringToFront();
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f58826a, false, 63976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58826a, false, 63976, new Class[0], Void.TYPE);
            return;
        }
        ActivityCompat.finishAfterTransition(this);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f58826a, false, 63977, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58826a, false, 63977, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f58827b.removeCallbacksAndMessages(null);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58826a, false, 63972, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58826a, false, 63972, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ActivityCompat.finishAfterTransition(this);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58826a, false, 63971, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58826a, false, 63971, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityCompat.postponeEnterTransition(this);
        setContentView((int) C0906R.layout.ae6);
        if (PatchProxy.isSupport(new Object[0], this, f58826a, false, 63973, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58826a, false, 63973, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 21) {
            AutoTransition autoTransition = new AutoTransition();
            getWindow().setSharedElementEnterTransition(autoTransition);
            AutoTransition autoTransition2 = new AutoTransition();
            getWindow().setSharedElementReturnTransition(autoTransition2);
            autoTransition.addListener(new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58837a;

                public final void onTransitionEnd(Transition transition) {
                    if (PatchProxy.isSupport(new Object[]{transition}, this, f58837a, false, 63984, new Class[]{Transition.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{transition}, this, f58837a, false, 63984, new Class[]{Transition.class}, Void.TYPE);
                        return;
                    }
                    PhotoMoviePreViewActivity.this.f58828c.setAlpha(1.0f);
                }

                public final void onTransitionStart(Transition transition) {
                    if (PatchProxy.isSupport(new Object[]{transition}, this, f58837a, false, 63983, new Class[]{Transition.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{transition}, this, f58837a, false, 63983, new Class[]{Transition.class}, Void.TYPE);
                        return;
                    }
                    PhotoMoviePreViewActivity.this.f58828c.setAlpha(0.0f);
                }
            });
            autoTransition2.addListener(new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58839a;

                public final void onTransitionStart(Transition transition) {
                    if (PatchProxy.isSupport(new Object[]{transition}, this, f58839a, false, 63985, new Class[]{Transition.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{transition}, this, f58839a, false, 63985, new Class[]{Transition.class}, Void.TYPE);
                        return;
                    }
                    PhotoMoviePreViewActivity.this.f58828c.setAlpha(0.0f);
                }
            });
        }
        findViewById(C0906R.id.ix).setOnClickListener(this);
        this.f58828c = (TextureView) findViewById(C0906R.id.c5n);
        this.f58828c.setOnClickListener(this);
        this.f58827b = new Handler();
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) getIntent().getParcelableExtra("photo_movie_context");
        this.f58829d = (ImageView) findViewById(C0906R.id.c5k);
        ViewCompat.setTransitionName(this.f58829d, "transition_img_name");
        if (PatchProxy.isSupport(new Object[]{720, 1080}, this, f58826a, false, 63975, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{720, 1080}, this, f58826a, false, 63975, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            p.b(this);
            int a2 = p.a(this);
            ViewGroup.LayoutParams layoutParams = this.f58829d.getLayoutParams();
            layoutParams.width = (int) (((((float) a2) * 1.0f) * 720.0f) / 1080.0f);
            layoutParams.height = a2;
            this.f58829d.setLayoutParams(layoutParams);
        }
        photoMovieContext.getPhotoMovieCover(new PhotoMovieContext.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58830a;

            public final void a(@Nullable final Bitmap bitmap, int i, int i2) {
                Bitmap bitmap2 = bitmap;
                if (PatchProxy.isSupport(new Object[]{bitmap2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f58830a, false, 63980, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bitmap2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f58830a, false, 63980, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                PhotoMoviePreViewActivity.this.f58827b.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58832a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f58832a, false, 63981, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f58832a, false, 63981, new Class[0], Void.TYPE);
                        } else if (bitmap != null) {
                            PhotoMoviePreViewActivity.this.f58829d.setImageBitmap(bitmap);
                            PhotoMoviePreViewActivity.this.f58829d.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f58835a;

                                public final boolean onPreDraw() {
                                    if (PatchProxy.isSupport(new Object[0], this, f58835a, false, 63982, new Class[0], Boolean.TYPE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58835a, false, 63982, new Class[0], Boolean.TYPE)).booleanValue();
                                    }
                                    PhotoMoviePreViewActivity.this.f58829d.getViewTreeObserver().removeOnPreDrawListener(this);
                                    ActivityCompat.startPostponedEnterTransition(PhotoMoviePreViewActivity.this);
                                    return true;
                                }
                            });
                        } else {
                            ActivityCompat.startPostponedEnterTransition(PhotoMoviePreViewActivity.this);
                        }
                    }
                });
            }
        });
        new PhotoMoviePlayerPresenter(this, this.f58828c, photoMovieContext).f3738d = this;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMoviePreViewActivity", "onCreate", false);
    }
}
