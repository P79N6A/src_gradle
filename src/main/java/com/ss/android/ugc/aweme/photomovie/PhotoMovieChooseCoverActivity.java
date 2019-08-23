package com.ss.android.ugc.aweme.photomovie;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.photomovie.edit.a;
import com.ss.android.ugc.aweme.photomovie.edit.b;
import com.ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule;
import com.ss.android.ugc.aweme.photomovie.edit.d;
import com.ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerModule;

public class PhotoMovieChooseCoverActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58795a;

    /* renamed from: b  reason: collision with root package name */
    public PhotoMoviePlayerModule f58796b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f58797c;

    /* renamed from: d  reason: collision with root package name */
    private TextureView f58798d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f58799e;

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f58800f;
    private PhotoMovieCoverModule g;
    private b h;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f58795a, false, 63900, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58795a, false, 63900, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58795a, false, 63901, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58795a, false, 63901, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f58795a, false, 63899, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58795a, false, 63899, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(C0906R.anim.r, C0906R.anim.s);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f58795a, false, 63897, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58795a, false, 63897, new Class[0], Void.TYPE);
            return;
        }
        ActivityCompat.finishAfterTransition(this);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f58795a, false, 63898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58795a, false, 63898, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f58797c.removeCallbacksAndMessages(null);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58795a, false, 63895, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58795a, false, 63895, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityCompat.postponeEnterTransition(this);
        setContentView((int) C0906R.layout.ae8);
        this.f58798d = (TextureView) findViewById(C0906R.id.bxw);
        this.f58799e = (FrameLayout) findViewById(C0906R.id.ba5);
        this.f58800f = (FrameLayout) findViewById(C0906R.id.b81);
        this.f58797c = new Handler();
        if (PatchProxy.isSupport(new Object[0], this, f58795a, false, 63896, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58795a, false, 63896, new Class[0], Void.TYPE);
        } else {
            this.f58796b = new PhotoMoviePlayerModule(this, this.f58799e, (PhotoMovieContext) getIntent().getParcelableExtra("photo_movie_context"));
            this.f58796b.f58981b.f3739e = true;
            this.h = new d(this.f58796b, new a() {
                public final boolean a() {
                    return true;
                }
            });
            PhotoMovieCoverModule photoMovieCoverModule = new PhotoMovieCoverModule(this, this, this.f58800f, this.f58796b, this.h, new PhotoMovieCoverModule.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58802a;

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f58802a, false, 63903, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58802a, false, 63903, new Class[0], Void.TYPE);
                        return;
                    }
                    PhotoMovieChooseCoverActivity.this.finish();
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f58802a, false, 63902, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58802a, false, 63902, new Class[0], Void.TYPE);
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", PhotoMovieChooseCoverActivity.this.f58796b.a());
                    PhotoMovieChooseCoverActivity.this.setResult(-1, intent);
                    PhotoMovieChooseCoverActivity.this.finish();
                }
            });
            this.g = photoMovieCoverModule;
            this.h.a(this.g);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieChooseCoverActivity", "onCreate", false);
    }
}
