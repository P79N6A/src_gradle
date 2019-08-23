package com.ss.android.ugc.aweme.shortvideo.guide;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.guide.a.a;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import javax.annotation.Nullable;

public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67990a;

    /* renamed from: b  reason: collision with root package name */
    public View f67991b;

    /* renamed from: c  reason: collision with root package name */
    public View f67992c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f67993d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f67994e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f67995f = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67996a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f67996a, false, 77436, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67996a, false, 77436, new Class[0], Void.TYPE);
                return;
            }
            Animation a2 = a.a(0.0f, 1.0f, 200);
            a2.setAnimationListener(new Animation.AnimationListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67998a;

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f67998a, false, 77437, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f67998a, false, 77437, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    d.this.f67994e = true;
                    d.this.f67992c.postDelayed(d.this.f67995f, 3000);
                }
            });
            d.this.f67993d.startAnimation(a2);
        }
    };
    public Runnable g = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68000a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f68000a, false, 77438, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68000a, false, 77438, new Class[0], Void.TYPE);
                return;
            }
            Animation a2 = a.a(1.0f, 0.0f, 300);
            a2.setAnimationListener(new Animation.AnimationListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68002a;

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                    d.this.f67994e = false;
                }

                public final void onAnimationEnd(Animation animation) {
                    if (PatchProxy.isSupport(new Object[]{animation}, this, f68002a, false, 77439, new Class[]{Animation.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animation}, this, f68002a, false, 77439, new Class[]{Animation.class}, Void.TYPE);
                        return;
                    }
                    d.this.a(true);
                }
            });
            d.this.f67992c.startAnimation(a2);
        }
    };
    private FaceStickerBean h;
    private FrameLayout i;
    private RemoteImageView j;

    public d(FaceStickerBean faceStickerBean) {
        this.h = faceStickerBean;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67990a, false, 77435, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67990a, false, 77435, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.h != null && !TextUtils.isEmpty(this.h.getExtra())) {
            this.f67992c.removeCallbacks(this.g);
            this.f67992c.removeCallbacks(this.f67995f);
            this.i.removeView(this.f67991b);
        }
    }

    public final void a(FrameLayout frameLayout) {
        Context context;
        FrameLayout frameLayout2 = frameLayout;
        if (PatchProxy.isSupport(new Object[]{frameLayout2}, this, f67990a, false, 77434, new Class[]{FrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{frameLayout2}, this, f67990a, false, 77434, new Class[]{FrameLayout.class}, Void.TYPE);
        } else if (this.h != null && !TextUtils.isEmpty(this.h.getExtra())) {
            ExtraParams extraParams = (ExtraParams) com.ss.android.ugc.aweme.port.in.a.f61120c.fromJson(this.h.getExtra(), ExtraParams.class);
            if (extraParams != null && extraParams.isGifValid()) {
                this.i = frameLayout2;
                this.f67991b = LayoutInflater.from(frameLayout.getContext()).inflate(C0906R.layout.a8q, frameLayout2, false);
                this.i.addView(this.f67991b, 0);
                this.f67992c = this.f67991b.findViewById(C0906R.id.af4);
                this.f67993d = (TextView) this.f67991b.findViewById(C0906R.id.cvo);
                this.f67993d.setText(C0906R.string.tt);
                this.j = (RemoteImageView) this.f67991b.findViewById(C0906R.id.cvp);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
                if (2 == extraParams.gifType) {
                    layoutParams.width = (int) UIUtils.dip2Px(frameLayout.getContext(), 192.0f);
                    layoutParams.height = (int) UIUtils.dip2Px(frameLayout.getContext(), 252.0f);
                    this.j.setLayoutParams(layoutParams);
                }
                FrameLayout frameLayout3 = (FrameLayout) this.i.findViewById(C0906R.id.cvg);
                if (frameLayout3 != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f67992c.getLayoutParams();
                    layoutParams2.height = fc.e(frameLayout.getContext()) - frameLayout3.getHeight();
                    this.f67992c.setLayoutParams(layoutParams2);
                }
                this.f67992c.post(this.f67995f);
                this.f67991b.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f68004a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f68004a, false, 77440, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f68004a, false, 77440, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        if (d.this.f67994e) {
                            d.this.f67992c.post(d.this.g);
                        }
                    }
                });
                RemoteImageView remoteImageView = this.j;
                UrlModel hintIcon = this.h.getHintIcon();
                AnonymousClass4 r3 = new BaseControllerListener<ImageInfo>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f68006a;

                    public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                        long j;
                        final Animatable animatable2 = animatable;
                        ImageInfo imageInfo = (ImageInfo) obj;
                        if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable2}, this, f68006a, false, 77441, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable2}, this, f68006a, false, 77441, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                            return;
                        }
                        if (animatable2 instanceof AnimatedDrawable2) {
                            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable2;
                            animatedDrawable2.setLoopCount(2);
                            animatable.start();
                            j = animatedDrawable2.getLoopDurationMs();
                        } else {
                            j = 0;
                        }
                        if (j > 0 && d.this.f67991b != null) {
                            d.this.f67991b.postDelayed(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68008a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f68008a, false, 77442, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f68008a, false, 77442, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (animatable2.isRunning()) {
                                        animatable2.stop();
                                        d.this.f67991b.callOnClick();
                                    }
                                }
                            }, j);
                        }
                    }
                };
                if (PatchProxy.isSupport(new Object[]{remoteImageView, hintIcon, r3}, null, b.f67988b, true, 77425, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{remoteImageView, hintIcon, r3}, null, b.f67988b, true, 77425, new Class[]{RemoteImageView.class, UrlModel.class, ControllerListener.class}, Void.TYPE);
                } else if (remoteImageView != null && hintIcon != null && hintIcon.getUrlList() != null && hintIcon.getUrlList().size() != 0) {
                    if (remoteImageView.getContext() != null) {
                        context = remoteImageView.getContext().getApplicationContext();
                    } else {
                        context = null;
                    }
                    ImageRequest[] a2 = b.a(hintIcon, (ResizeOptions) null, (Postprocessor) null);
                    if (a2 != null && a2.length != 0) {
                        PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(remoteImageView.getController())).setFirstAvailableImageRequests(a2)).setAutoPlayAnimations(false);
                        pipelineDraweeControllerBuilder.setControllerListener(b.a((ControllerListener<ImageInfo>) r3, a2[0].getSourceUri(), context, hintIcon));
                        remoteImageView.setController(pipelineDraweeControllerBuilder.build());
                    }
                }
            }
        }
    }
}
