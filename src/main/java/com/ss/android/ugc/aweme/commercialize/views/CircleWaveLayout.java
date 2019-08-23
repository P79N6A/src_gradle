package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public class CircleWaveLayout extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39883a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f39884b = "CircleWaveLayout";

    /* renamed from: c  reason: collision with root package name */
    ScaleFadeCircleView f39885c;

    /* renamed from: d  reason: collision with root package name */
    public ScaleFadeCircleView f39886d;

    /* renamed from: e  reason: collision with root package name */
    public Aweme f39887e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f39888f;
    public boolean g;
    protected ControllerListener<ImageInfo> h;
    private CircleImageView i;

    public CircleWaveLayout(@NonNull Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39883a, false, 32837, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39883a, false, 32837, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.st) {
            g.c(getContext(), this.f39887e);
            if (PatchProxy.isSupport(new Object[0], this, f39883a, false, 32838, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39883a, false, 32838, new Class[0], Void.TYPE);
                return;
            }
            Context context = getContext();
            Aweme aweme = this.f39887e;
            if (PatchProxy.isSupport(new Object[]{context, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31532, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31532, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.commercialize.log.g.b(context, "logo_click", aweme, com.ss.android.ugc.aweme.commercialize.log.g.f(context, aweme, "raw ad logo click"));
                com.ss.android.ugc.aweme.commercialize.log.g.b(aweme);
            }
            com.ss.android.ugc.aweme.commercialize.log.g.d(getContext(), this.f39887e);
        }
    }

    public CircleWaveLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleWaveLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = new BaseControllerListener<ImageInfo>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39891a;

            public final void onRelease(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f39891a, false, 32843, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f39891a, false, 32843, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                super.onRelease(str);
            }

            public final void onFailure(String str, Throwable th) {
                if (PatchProxy.isSupport(new Object[]{str, th}, this, f39891a, false, 32842, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, th}, this, f39891a, false, 32842, new Class[]{String.class, Throwable.class}, Void.TYPE);
                    return;
                }
                super.onFailure(str, th);
                CircleWaveLayout.this.g = false;
            }

            public final /* synthetic */ void onIntermediateImageSet(String str, @javax.annotation.Nullable Object obj) {
                String str2 = str;
                ImageInfo imageInfo = (ImageInfo) obj;
                if (PatchProxy.isSupport(new Object[]{str2, imageInfo}, this, f39891a, false, 32844, new Class[]{String.class, ImageInfo.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2, imageInfo}, this, f39891a, false, 32844, new Class[]{String.class, ImageInfo.class}, Void.TYPE);
                    return;
                }
                super.onIntermediateImageSet(str2, imageInfo);
            }

            public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                ImageInfo imageInfo = (ImageInfo) obj;
                if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f39891a, false, 32841, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f39891a, false, 32841, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                    return;
                }
                if (CircleWaveLayout.this.f39888f) {
                    CircleWaveLayout.this.setVisibility(0);
                    CircleWaveLayout circleWaveLayout = CircleWaveLayout.this;
                    if (PatchProxy.isSupport(new Object[0], circleWaveLayout, CircleWaveLayout.f39883a, false, 32836, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], circleWaveLayout, CircleWaveLayout.f39883a, false, 32836, new Class[0], Void.TYPE);
                    } else {
                        circleWaveLayout.f39885c.a();
                        circleWaveLayout.postDelayed(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f39889a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f39889a, false, 32840, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f39889a, false, 32840, new Class[0], Void.TYPE);
                                    return;
                                }
                                CircleWaveLayout.this.f39886d.a();
                            }
                        }, 750);
                    }
                    CircleWaveLayout.this.g = true;
                }
            }
        };
        LayoutInflater.from(context).inflate(C0906R.layout.hb, this);
        if (PatchProxy.isSupport(new Object[0], this, f39883a, false, 32834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39883a, false, 32834, new Class[0], Void.TYPE);
            return;
        }
        this.f39885c = (ScaleFadeCircleView) findViewById(C0906R.id.aeo);
        this.f39886d = (ScaleFadeCircleView) findViewById(C0906R.id.cmf);
        this.i = (CircleImageView) findViewById(C0906R.id.st);
        this.i.setOnClickListener(this);
        setOnClickListener(this);
    }
}
