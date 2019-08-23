package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.widget.ScreenSizeAspectFrameLayout;
import com.ss.android.ugc.aweme.util.c;
import com.ss.android.ugc.aweme.utils.fe;
import java.util.Timer;
import java.util.TimerTask;

public class VideoPreviewActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70573a = null;

    /* renamed from: b  reason: collision with root package name */
    static int f70574b = 250;

    /* renamed from: c  reason: collision with root package name */
    long f70575c;

    /* renamed from: d  reason: collision with root package name */
    Timer f70576d;

    /* renamed from: e  reason: collision with root package name */
    public MediaPlayer f70577e;

    /* renamed from: f  reason: collision with root package name */
    public String f70578f;
    ScreenSizeAspectFrameLayout g;
    private fe.a h;
    private int i;
    private int j;
    private TextureView k;
    private View l;
    private float m;

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70573a, false, 80393, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70573a, false, 80393, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70573a, false, 80384, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70573a, false, 80384, new Class[0], Void.TYPE);
            return;
        }
        if (this.f70577e != null) {
            if (this.f70577e.isPlaying()) {
                this.f70577e.stop();
            }
            this.f70577e.release();
            this.f70577e = null;
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f70573a, false, 80389, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70573a, false, 80389, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        a();
        if (this.f70576d != null) {
            this.f70576d.cancel();
            this.f70576d = null;
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f70573a, false, 80386, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70573a, false, 80386, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.f70577e != null && this.f70577e.isPlaying()) {
            this.f70577e.pause();
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f70573a, false, 80390, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70573a, false, 80390, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f70573a, false, 80388, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70573a, false, 80388, new Class[0], Void.TYPE);
            return;
        }
        fe.a(this.l, new ColorDrawable(getResources().getColor(17170444)), 255, 0);
        fe.b(this.h, this.k, new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70588a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f70588a, false, 80399, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f70588a, false, 80399, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                VideoPreviewActivity videoPreviewActivity = VideoPreviewActivity.this;
                if (PatchProxy.isSupport(new Object[0], videoPreviewActivity, VideoPreviewActivity.f70573a, false, 80391, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], videoPreviewActivity, VideoPreviewActivity.f70573a, false, 80391, new Class[0], Void.TYPE);
                    return;
                }
                if (videoPreviewActivity.f70577e != null && videoPreviewActivity.f70577e.isPlaying()) {
                    videoPreviewActivity.f70577e.pause();
                }
                videoPreviewActivity.finish();
            }
        });
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f70573a, false, 80385, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70573a, false, 80385, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onResume", true);
        super.onResume();
        if (this.f70577e != null && !this.f70577e.isPlaying()) {
            this.f70577e.start();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onResume", false);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f70573a, false, 80379, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f70573a, false, 80379, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.d_);
        if (PatchProxy.isSupport(new Object[0], this, f70573a, false, 80381, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70573a, false, 80381, new Class[0], Void.TYPE);
        } else {
            this.f70578f = getIntent().getStringExtra("file_path");
            this.h = (fe.a) getIntent().getParcelableExtra("extra_zoom_info");
            this.m = getIntent().getFloatExtra("wh_ratio", 1.0f);
            this.f70576d = new Timer("video_preview_player_timer");
        }
        if (PatchProxy.isSupport(new Object[0], this, f70573a, false, 80380, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70573a, false, 80380, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f70573a, false, 80383, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70573a, false, 80383, new Class[0], Void.TYPE);
            } else {
                int[] a2 = FFMpegManager.a().a(this.f70578f);
                if (a2[0] == 0) {
                    this.f70575c = (long) a2[1];
                    this.i = a2[2];
                    this.j = a2[3];
                    FFMpegManager.a().b();
                } else {
                    UIUtils.displayToast((Context) this, (int) C0906R.string.bld);
                    FFMpegManager.a().b();
                    finish();
                }
                this.k = (TextureView) findViewById(C0906R.id.cxe);
                this.k.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f70583a;

                    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    }

                    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    }

                    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f70583a, false, 80397, new Class[]{SurfaceTexture.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f70583a, false, 80397, new Class[]{SurfaceTexture.class}, Boolean.TYPE)).booleanValue();
                        }
                        VideoPreviewActivity.this.a();
                        return true;
                    }

                    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f70583a, false, 80396, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f70583a, false, 80396, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        Uri parse = Uri.parse(VideoPreviewActivity.this.f70578f);
                        VideoPreviewActivity.this.f70577e = MediaPlayer.create(VideoPreviewActivity.this, parse);
                        if (VideoPreviewActivity.this.f70577e == null) {
                            UIUtils.displayToast((Context) VideoPreviewActivity.this, (int) C0906R.string.bn3);
                            VideoPreviewActivity.this.finish();
                            return;
                        }
                        VideoPreviewActivity videoPreviewActivity = VideoPreviewActivity.this;
                        if (PatchProxy.isSupport(new Object[0], videoPreviewActivity, VideoPreviewActivity.f70573a, false, 80382, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], videoPreviewActivity, VideoPreviewActivity.f70573a, false, 80382, new Class[0], Void.TYPE);
                        } else if (((long) videoPreviewActivity.f70577e.getDuration()) - videoPreviewActivity.f70575c > ((long) VideoPreviewActivity.f70574b)) {
                            videoPreviewActivity.f70577e.setLooping(false);
                            videoPreviewActivity.f70576d.schedule(new TimerTask() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f70581a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f70581a, false, 80395, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f70581a, false, 80395, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (VideoPreviewActivity.this.f70577e != null) {
                                        try {
                                            VideoPreviewActivity.this.f70577e.seekTo(0);
                                        } catch (IllegalStateException e2) {
                                            c.a(e2.toString());
                                        }
                                    }
                                }
                            }, videoPreviewActivity.f70575c, videoPreviewActivity.f70575c);
                        } else {
                            videoPreviewActivity.f70577e.setLooping(true);
                        }
                        VideoPreviewActivity.this.f70577e.setAudioStreamType(3);
                        VideoPreviewActivity.this.f70577e.setSurface(new Surface(surfaceTexture2));
                        VideoPreviewActivity.this.f70577e.start();
                        VideoPreviewActivity.this.f70577e.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public final void onCompletion(MediaPlayer mediaPlayer) {
                            }
                        });
                        VideoPreviewActivity.this.f70577e.setOnErrorListener(new MediaPlayer.OnErrorListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f70586a;

                            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                                if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f70586a, false, 80398, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f70586a, false, 80398, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                                }
                                if (VideoPreviewActivity.this.f70577e != null) {
                                    VideoPreviewActivity.this.f70577e.release();
                                    VideoPreviewActivity.this.f70577e = null;
                                }
                                return false;
                            }
                        });
                    }
                });
                if (fc.a()) {
                    fb.a((View) this.k, (Context) this, this.i, this.j);
                } else if (!(this.j == 0 || this.i == 0)) {
                    fb.a((View) this.k, this.i, this.j);
                }
            }
            this.g = (ScreenSizeAspectFrameLayout) findViewById(C0906R.id.ail);
            this.g.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70579a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f70579a, false, 80394, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f70579a, false, 80394, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    VideoPreviewActivity.this.onBackPressed();
                }
            });
            this.l = findViewById(16908290);
        }
        if (PatchProxy.isSupport(new Object[0], this, f70573a, false, 80387, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70573a, false, 80387, new Class[0], Void.TYPE);
        } else {
            fe.a(this.h, (View) this.k, (Animator.AnimatorListener) null);
            fe.a(this.l, new ColorDrawable(getResources().getColor(17170444)), 0, 255);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity", "onCreate", false);
    }

    public static void a(Activity activity, View view, String str, float f2) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, view, str2, Float.valueOf(f2)}, null, f70573a, true, 80392, new Class[]{Activity.class, View.class, String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, view, str2, Float.valueOf(f2)}, null, f70573a, true, 80392, new Class[]{Activity.class, View.class, String.class, Float.TYPE}, Void.TYPE);
            return;
        }
        if (activity2 != null) {
            Intent intent = new Intent(activity2, VideoPreviewActivity.class);
            intent.putExtra("extra_zoom_info", fe.a(view));
            intent.putExtra("file_path", str2);
            intent.putExtra("wh_ratio", f2);
            activity2.startActivity(intent);
            activity2.overridePendingTransition(0, 0);
        }
    }
}
