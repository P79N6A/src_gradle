package com.ss.android.ugc.aweme.shortvideo.ui;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleRegistry;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import dmt.av.video.ad;

public class VEVideoPublishPreviewActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70555a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f70556b;

    /* renamed from: c  reason: collision with root package name */
    ad f70557c;

    /* renamed from: d  reason: collision with root package name */
    public SurfaceView f70558d;

    /* renamed from: e  reason: collision with root package name */
    LifecycleRegistry f70559e = new LifecycleRegistry(this);

    /* renamed from: f  reason: collision with root package name */
    int f70560f;
    int g;
    private cb h;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f70555a, false, 80352, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70555a, false, 80352, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70555a, false, 80353, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70555a, false, 80353, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public Lifecycle getLifecycle() {
        return this.f70559e;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f70555a, false, 80348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70555a, false, 80348, new Class[0], Void.TYPE);
            return;
        }
        this.f70559e.markState(Lifecycle.State.DESTROYED);
        this.f70557c.a();
        super.onDestroy();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f70555a, false, 80344, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70555a, false, 80344, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (isFinishing()) {
            findViewById(C0906R.id.c5r).setVisibility(8);
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f70555a, false, 80351, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70555a, false, 80351, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        VotingStickerView votingStickerView = (VotingStickerView) findViewById(C0906R.id.c5r);
        if (votingStickerView != null) {
            votingStickerView.setVisibility(8);
            if (this.f70558d != null) {
                this.f70558d.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70555a, false, 80345, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70555a, false, 80345, new Class[0], Void.TYPE);
        } else if (fc.a()) {
            int c2 = fc.c(this);
            switch (fb.f67663b) {
                case 1:
                    a(this.f70558d, (int) UIUtils.dip2Px(this, 29.0f));
                    a(this.f70556b, (int) UIUtils.dip2Px(this, 29.0f));
                    return;
                case 2:
                    int i = c2 / 2;
                    a(this.f70558d, ((int) UIUtils.dip2Px(this, 29.0f)) + i);
                    a(this.f70556b, ((int) UIUtils.dip2Px(this, 29.0f)) + i);
                    return;
                case 3:
                    return;
                case 4:
                    a(this.f70558d, (int) UIUtils.dip2Px(this, 29.0f));
                    a(this.f70556b, (int) UIUtils.dip2Px(this, 29.0f));
                    return;
                case 5:
                    int i2 = c2 / 2;
                    a(this.f70558d, ((int) UIUtils.dip2Px(this, 29.0f)) + i2);
                    a(this.f70556b, ((int) UIUtils.dip2Px(this, 29.0f)) + i2);
                    break;
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f70555a, false, 80349, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70555a, false, 80349, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null && !StringUtils.isEmpty(this.h.mainBusinessData)) {
            InteractStickerStruct a2 = b.a(this.h.mainBusinessData, 1, d.TRACK_PAGE_EDIT);
            if (!(a2 == null || a2.getVoteStruct() == null)) {
                VotingStickerView votingStickerView = (VotingStickerView) findViewById(C0906R.id.c5r);
                View findViewById = findViewById(C0906R.id.dtw);
                if (votingStickerView != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
                    int height = ((FrameLayout.LayoutParams) this.f70558d.getLayoutParams()).topMargin + ((this.f70558d.getHeight() - this.f70557c.q.d().f77891b) / 2);
                    if (height > 0) {
                        layoutParams.height = height;
                        findViewById.setLayoutParams(layoutParams);
                        findViewById.setVisibility(0);
                        findViewById.bringToFront();
                    }
                    votingStickerView.a(a2.getVoteStruct());
                    votingStickerView.setTouchEnable(true);
                    votingStickerView.b();
                    votingStickerView.setEditEnable(false);
                    votingStickerView.post(new ac(this, a2, votingStickerView, findViewById));
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0282, code lost:
        if (r11.equals("3") != false) goto L_0x02a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f70555a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 80341(0x139d5, float:1.12582E-40)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f70555a
            r3 = 0
            r4 = 80341(0x139d5, float:1.12582E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            java.lang.String r0 = "com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            super.onCreate(r14)
            android.view.Window r0 = r13.getWindow()
            r1 = 128(0x80, float:1.794E-43)
            r0.addFlags(r1)
            r0 = 2131689667(0x7f0f00c3, float:1.9008356E38)
            r13.setContentView((int) r0)
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.fc.a()
            if (r0 != 0) goto L_0x005a
            boolean r0 = com.ss.android.ugc.aweme.app.a.a.a((android.app.Activity) r13)
            if (r0 != 0) goto L_0x005a
            com.ss.android.ugc.aweme.base.utils.v.a((android.app.Activity) r13)
        L_0x005a:
            com.ss.android.ugc.aweme.shortvideo.hm r0 = new com.ss.android.ugc.aweme.shortvideo.hm
            r0.<init>()
            com.ss.android.vesdk.i r0 = r0.a()
            com.ss.android.ugc.aweme.port.in.a.a((com.ss.android.vesdk.i) r0)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f70555a
            r3 = 0
            r4 = 80343(0x139d7, float:1.12585E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x008a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f70555a
            r3 = 0
            r4 = 80343(0x139d7, float:1.12585E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00c2
        L_0x008a:
            r0 = 2131171381(0x7f071835, float:1.7957147E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r13.f70556b = r0
            android.graphics.Bitmap r0 = com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder.f4018a
            if (r0 == 0) goto L_0x00a0
            android.widget.ImageView r0 = r13.f70556b
            android.graphics.Bitmap r1 = com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder.f4018a
            r0.setImageBitmap(r1)
        L_0x00a0:
            android.widget.ImageView r0 = r13.f70556b
            java.lang.String r1 = "transition_img_name"
            android.support.v4.view.ViewCompat.setTransitionName(r0, r1)
            r0 = 2131169122(0x7f070f62, float:1.7952565E38)
            android.view.View r0 = r13.findViewById(r0)
            android.view.SurfaceView r0 = (android.view.SurfaceView) r0
            r13.f70558d = r0
            android.view.SurfaceView r0 = r13.f70558d
            r1 = 4
            r0.setVisibility(r1)
            android.view.SurfaceView r0 = r13.f70558d
            com.ss.android.ugc.aweme.shortvideo.ui.ab r1 = new com.ss.android.ugc.aweme.shortvideo.ui.ab
            r1.<init>(r13)
            r0.setOnClickListener(r1)
        L_0x00c2:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f70555a
            r3 = 0
            r4 = 80342(0x139d6, float:1.12583E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00e7
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f70555a
            r3 = 0
            r4 = 80342(0x139d6, float:1.12583E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0436
        L_0x00e7:
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r1 = "args"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = (com.ss.android.ugc.aweme.shortvideo.edit.cb) r0
            r13.h = r0
            dmt.av.video.ad r0 = new dmt.av.video.ad
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r13.h
            int r1 = r1.videoEditorType
            r0.<init>(r1)
            r13.f70557c = r0
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            int r0 = r0.mVideoCanvasWidth
            if (r0 <= 0) goto L_0x0119
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            int r0 = r0.mVideoCanvasHeight
            if (r0 <= 0) goto L_0x0119
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            int r0 = r0.mVideoCanvasWidth
            r13.f70560f = r0
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            int r0 = r0.mVideoCanvasHeight
            r13.g = r0
            goto L_0x0153
        L_0x0119:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            int r0 = r0.mVideoWidth
            r13.f70560f = r0
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            int r0 = r0.mVideoHeight
            r13.g = r0
            int r0 = r13.g
            if (r0 == 0) goto L_0x012d
            int r0 = r13.f70560f
            if (r0 != 0) goto L_0x0153
        L_0x012d:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            int r0 = r0.getOriginal()
            if (r0 != 0) goto L_0x0138
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r0 = com.ss.android.ugc.aweme.port.in.a.r
            goto L_0x013a
        L_0x0138:
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r0 = com.ss.android.ugc.aweme.port.in.a.q
        L_0x013a:
            int r0 = r0.getVideoWidth()
            r13.f70560f = r0
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            int r0 = r0.getOriginal()
            if (r0 != 0) goto L_0x014b
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r0 = com.ss.android.ugc.aweme.port.in.a.r
            goto L_0x014d
        L_0x014b:
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r0 = com.ss.android.ugc.aweme.port.in.a.q
        L_0x014d:
            int r0 = r0.getVideoHeight()
            r13.g = r0
        L_0x0153:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r0 = r0.previewConfigure
            r1 = 0
            if (r0 != 0) goto L_0x0180
            dmt.av.video.u r0 = new dmt.av.video.u
            r0.<init>()
            java.lang.String[] r2 = new java.lang.String[r8]
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r13.h
            java.lang.String r3 = r3.mPath
            r2[r9] = r3
            r0.mVideoPaths = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r13.h
            java.lang.String r2 = r2.getWavFile()
            if (r2 != 0) goto L_0x0173
            r2 = r1
            goto L_0x017d
        L_0x0173:
            java.lang.String[] r2 = new java.lang.String[r8]
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r13.h
            java.lang.String r3 = r3.getWavFile()
            r2[r9] = r3
        L_0x017d:
            r0.mAudioPaths = r2
            goto L_0x019f
        L_0x0180:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r0 = r0.previewConfigure
            r0.mAudioPaths = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "init ve_editor in publish preview page using preview configure:"
            r2.<init>(r3)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r13.h
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r3 = r3.previewConfigure
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.ss.android.ugc.aweme.shortvideo.util.ai.a(r2)
        L_0x019f:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r13.h
            int r2 = r2.mVideoCanvasWidth
            r0.canvasWidth = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r13.h
            int r2 = r2.mVideoCanvasHeight
            r0.canvasHeight = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r13.h
            float r2 = r2.voiceVolume
            r0.mVolume = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r13.h
            float r2 = r2.musicVolume
            r0.mMusicVolume = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r13.h
            java.lang.String r2 = r2.mPath
            java.lang.String r2 = com.ss.android.ugc.aweme.shortvideo.a.d.a((java.lang.String) r2)
            r0.mWorkspace = r2
            r2 = 30
            r0.mFps = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r13.h
            int r2 = r2.videoEditorType
            r0.videoEditorType = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r13.h
            java.lang.String r2 = r2.mMusicPath
            r0.mMusicPath = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r13.h
            int r2 = r2.mMusicStart
            r0.mMusicInPoint = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r13.h
            int r2 = r2.mMusicEnd
            r0.mMusicOutPoint = r2
            r2 = 2
            r0.mPageType = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r13.h
            boolean r3 = r3.mIsFromDraft
            r0.mIsFromDraft = r3
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r13.h
            com.ss.android.ugc.aweme.x.a r3 = r3.mvCreateVideoData
            r0.mvCreateVideoData = r3
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r13.h
            com.ss.android.ugc.aweme.shortvideo.ah r3 = r3.veCherEffectParam
            if (r3 == 0) goto L_0x0211
            com.ss.android.vesdk.VECherEffectParam r3 = new com.ss.android.vesdk.VECherEffectParam
            com.ss.android.ugc.aweme.shortvideo.edit.cb r4 = r13.h
            com.ss.android.ugc.aweme.shortvideo.ah r4 = r4.veCherEffectParam
            java.lang.String[] r4 = r4.getMatrix()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r13.h
            com.ss.android.ugc.aweme.shortvideo.ah r5 = r5.veCherEffectParam
            double[] r5 = r5.getDuration()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r6 = r13.h
            com.ss.android.ugc.aweme.shortvideo.ah r6 = r6.veCherEffectParam
            boolean[] r6 = r6.getSegUseCher()
            r3.<init>(r4, r5, r6)
            r0.veCherEffectParam = r3
        L_0x0211:
            android.arch.lifecycle.MutableLiveData r3 = new android.arch.lifecycle.MutableLiveData
            r3.<init>()
            r3.setValue(r0)
            android.arch.lifecycle.MutableLiveData r4 = new android.arch.lifecycle.MutableLiveData
            r4.<init>()
            dmt.av.video.t r5 = new dmt.av.video.t
            r5.<init>()
            r5.g = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r6 = r13.h
            java.lang.String r6 = r6.mMusicPath
            r5.f83064b = r6
            com.ss.android.ugc.aweme.shortvideo.edit.cb r6 = r13.h
            int r6 = r6.mMusicStart
            r5.f83065c = r6
            r6 = -1
            r5.f83066d = r6
            com.ss.android.ugc.aweme.shortvideo.edit.cb r7 = r13.h
            float r7 = r7.musicVolume
            r5.f83067e = r7
            com.ss.android.ugc.aweme.shortvideo.edit.cb r7 = r13.h
            java.lang.String r7 = r7.musicId
            r5.f83068f = r7
            r4.setValue(r5)
            dmt.av.video.f r5 = new dmt.av.video.f
            r5.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r7 = r13.h
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r7 = r7.mEffectList
            if (r7 == 0) goto L_0x0255
            com.ss.android.ugc.aweme.shortvideo.edit.cb r7 = r13.h
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r7 = r7.mEffectList
            dmt.av.video.q.a(r7, r5)
        L_0x0255:
            android.arch.lifecycle.MutableLiveData r7 = new android.arch.lifecycle.MutableLiveData
            r7.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r10 = r13.h
            com.ss.android.ugc.aweme.n.a r10 = r10.infoStickerModel
            r7.setValue(r10)
            dmt.av.video.h r10 = new dmt.av.video.h
            r10.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r11 = r13.h
            com.ss.android.ugc.aweme.effect.EffectPointModel r11 = r11.mTimeEffect
            if (r11 == 0) goto L_0x02d5
            com.ss.android.ugc.aweme.shortvideo.edit.cb r11 = r13.h
            com.ss.android.ugc.aweme.effect.EffectPointModel r11 = r11.mTimeEffect
            java.lang.String r11 = r11.getKey()
            int r12 = r11.hashCode()
            switch(r12) {
                case 48: goto L_0x0299;
                case 49: goto L_0x028f;
                case 50: goto L_0x0285;
                case 51: goto L_0x027c;
                default: goto L_0x027b;
            }
        L_0x027b:
            goto L_0x02a3
        L_0x027c:
            java.lang.String r12 = "3"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x02a3
            goto L_0x02a4
        L_0x0285:
            java.lang.String r2 = "2"
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x02a3
            r2 = 1
            goto L_0x02a4
        L_0x028f:
            java.lang.String r2 = "1"
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x02a3
            r2 = 3
            goto L_0x02a4
        L_0x0299:
            java.lang.String r2 = "0"
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x02a3
            r2 = 0
            goto L_0x02a4
        L_0x02a3:
            r2 = -1
        L_0x02a4:
            switch(r2) {
                case 0: goto L_0x02ce;
                case 1: goto L_0x02c0;
                case 2: goto L_0x02b2;
                case 3: goto L_0x02ad;
                default: goto L_0x02a7;
            }
        L_0x02a7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x02ad:
            dmt.av.video.x r2 = dmt.av.video.x.b()
            goto L_0x02d2
        L_0x02b2:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r13.h
            com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r2.mTimeEffect
            int r2 = r2.getEndPoint()
            long r11 = (long) r2
            dmt.av.video.x r2 = dmt.av.video.x.b(r11)
            goto L_0x02d2
        L_0x02c0:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r13.h
            com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r2.mTimeEffect
            int r2 = r2.getEndPoint()
            long r11 = (long) r2
            dmt.av.video.x r2 = dmt.av.video.x.a(r11)
            goto L_0x02d2
        L_0x02ce:
            dmt.av.video.x r2 = dmt.av.video.x.a()
        L_0x02d2:
            r10.setValue(r2)
        L_0x02d5:
            dmt.av.video.ad r2 = r13.f70557c
            r2.f82859e = r3
            dmt.av.video.ad r2 = r13.f70557c
            r2.f82860f = r4
            dmt.av.video.ad r2 = r13.f70557c
            r2.i = r5
            dmt.av.video.ad r2 = r13.f70557c
            android.arch.lifecycle.MutableLiveData r3 = new android.arch.lifecycle.MutableLiveData
            r3.<init>()
            r2.g = r3
            dmt.av.video.ad r2 = r13.f70557c
            android.arch.lifecycle.MutableLiveData r3 = new android.arch.lifecycle.MutableLiveData
            r3.<init>()
            r2.h = r3
            dmt.av.video.ad r2 = r13.f70557c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.a((java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel>) r3)
            dmt.av.video.ad r2 = r13.f70557c
            r2.j = r10
            dmt.av.video.h r2 = new dmt.av.video.h
            r2.<init>()
            dmt.av.video.ad r3 = r13.f70557c
            r3.k = r2
            dmt.av.video.ad r3 = r13.f70557c
            android.arch.lifecycle.MutableLiveData r4 = new android.arch.lifecycle.MutableLiveData
            r4.<init>()
            r3.l = r4
            dmt.av.video.ad r3 = r13.f70557c
            android.arch.lifecycle.MutableLiveData r4 = new android.arch.lifecycle.MutableLiveData
            r4.<init>()
            r3.m = r4
            dmt.av.video.ad r3 = r13.f70557c
            android.arch.lifecycle.MutableLiveData r4 = new android.arch.lifecycle.MutableLiveData
            r4.<init>()
            r3.a((android.arch.lifecycle.MutableLiveData<java.lang.Boolean>) r4)
            dmt.av.video.ad r3 = r13.f70557c
            r3.n = r7
            android.arch.lifecycle.MutableLiveData r3 = new android.arch.lifecycle.MutableLiveData
            r3.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.a.b r4 = new com.ss.android.ugc.aweme.shortvideo.edit.a.b
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r13.h
            boolean r5 = r5.autoEnhanceOn
            com.ss.android.ugc.aweme.shortvideo.edit.cb r6 = r13.h
            int r6 = r6.autoEnhanceType
            r4.<init>(r5, r6, r8)
            r3.setValue(r4)
            dmt.av.video.ad r4 = r13.f70557c
            r4.o = r3
            android.arch.lifecycle.LifecycleRegistry r3 = r13.f70559e
            android.arch.lifecycle.Lifecycle$State r4 = android.arch.lifecycle.Lifecycle.State.STARTED
            r3.markState(r4)
            dmt.av.video.ad r3 = r13.f70557c
            android.view.SurfaceView r4 = r13.f70558d
            r3.a(r13, r13, r4)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r13.h
            com.ss.android.ugc.aweme.effect.EffectPointModel r3 = r3.mTimeEffect
            if (r3 == 0) goto L_0x0369
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r13.h
            com.ss.android.ugc.aweme.effect.EffectPointModel r3 = r3.mTimeEffect
            java.lang.String r3 = r3.getKey()
            java.lang.String r4 = "1"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0369
            r3 = 1
            goto L_0x036a
        L_0x0369:
            r3 = 0
        L_0x036a:
            if (r3 == 0) goto L_0x03d6
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r13.h
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r3 = r3.previewConfigure
            if (r3 == 0) goto L_0x0399
            dmt.av.video.ad r3 = r13.f70557c
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.q
            com.ss.android.ugc.aweme.shortvideo.edit.cb r4 = r13.h
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r4 = r4.previewConfigure
            java.lang.String[] r4 = r4.getReverseVideoArray()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r13.h
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r5 = r5.previewConfigure
            java.lang.String[] r5 = r5.getReverseAudioArray()
            r3.a((java.lang.String[]) r4, (java.lang.String[]) r5)
            dmt.av.video.ad r3 = r13.f70557c
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.q
            com.ss.android.ugc.aweme.shortvideo.edit.cb r4 = r13.h
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r4 = r4.previewConfigure
            java.lang.String[] r4 = r4.getTempVideoArray()
            r3.b((java.lang.String[]) r4)
            goto L_0x03a8
        L_0x0399:
            dmt.av.video.ad r3 = r13.f70557c
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.q
            java.lang.String[] r4 = new java.lang.String[r8]
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r13.h
            java.lang.String r5 = r5.mReversePath
            r4[r9] = r5
            r3.a((java.lang.String[]) r4)
        L_0x03a8:
            dmt.av.video.ad r3 = r13.f70557c
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.q
            r3.c((boolean) r8)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r13.h
            boolean r3 = r3.isFastImport
            if (r3 == 0) goto L_0x03d6
            dmt.av.video.ad r3 = r13.f70557c
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.q
            com.ss.android.vesdk.runtime.b r3 = r3.f78038b
            if (r3 == 0) goto L_0x03d6
            dmt.av.video.ad r3 = r13.f70557c
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r3.q
            dmt.av.video.ad r4 = r13.f70557c
            com.ss.android.ugc.aweme.shortvideo.b.b r4 = r4.q
            com.ss.android.vesdk.runtime.b r4 = r4.f78038b
            int r4 = r4.h
            dmt.av.video.ad r5 = r13.f70557c
            com.ss.android.ugc.aweme.shortvideo.b.b r5 = r5.q
            com.ss.android.vesdk.runtime.b r5 = r5.f78038b
            int r5 = r5.i
            float r0 = r0.mVolume
            r3.a((int) r4, (int) r5, (float) r0)
        L_0x03d6:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r0.veAudioEffectParam
            if (r0 == 0) goto L_0x03f5
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r0.veAudioEffectParam
            r0.setShowErrorToast(r9)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r0.veAudioEffectParam
            r0.setPreprocessResult(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r13.h
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r0.veAudioEffectParam
            dmt.av.video.j r0 = dmt.av.video.j.a(r8, r0)
            r2.setValue(r0)
        L_0x03f5:
            dmt.av.video.ad r0 = r13.f70557c
            com.ss.android.ugc.aweme.shortvideo.b.b r0 = r0.q
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r13.h
            int r1 = r1.mSelectedId
            com.ss.android.ugc.aweme.filter.h r1 = com.ss.android.ugc.aweme.filter.y.a(r1)
            java.lang.String r1 = r1.j
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.a((java.lang.String) r1, (float) r2)
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.fc.a()
            if (r0 == 0) goto L_0x0424
            android.view.SurfaceView r0 = r13.f70558d
            int r1 = r13.f70560f
            int r2 = r13.g
            com.ss.android.ugc.aweme.shortvideo.fb.a((android.view.View) r0, (android.content.Context) r13, (int) r1, (int) r2)
            android.widget.ImageView r0 = r13.f70556b
            int r1 = r13.f70560f
            int r2 = r13.g
            com.ss.android.ugc.aweme.shortvideo.fb.a((android.view.View) r0, (android.content.Context) r13, (int) r1, (int) r2)
            r13.a()
            goto L_0x0436
        L_0x0424:
            android.view.SurfaceView r0 = r13.f70558d
            int r1 = r13.f70560f
            int r2 = r13.g
            com.ss.android.ugc.aweme.shortvideo.fb.b(r0, r1, r2)
            android.widget.ImageView r0 = r13.f70556b
            int r1 = r13.f70560f
            int r2 = r13.g
            com.ss.android.ugc.aweme.shortvideo.fb.b(r0, r1, r2)
        L_0x0436:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f70555a
            r3 = 0
            r4 = 80347(0x139db, float:1.1259E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r7 = 21
            if (r0 == 0) goto L_0x045c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f70555a
            r3 = 0
            r4 = 80347(0x139db, float:1.1259E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0496
        L_0x045c:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r7) goto L_0x0489
            android.transition.AutoTransition r0 = new android.transition.AutoTransition
            r0.<init>()
            android.view.Window r1 = r13.getWindow()
            r1.setSharedElementEnterTransition(r0)
            com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity$1 r1 = new com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity$1
            r1.<init>()
            r0.addListener(r1)
            android.transition.AutoTransition r0 = new android.transition.AutoTransition
            r0.<init>()
            com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity$2 r1 = new com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity$2
            r1.<init>()
            r0.addListener(r1)
            android.view.Window r1 = r13.getWindow()
            r1.setReturnTransition(r0)
            goto L_0x0496
        L_0x0489:
            android.view.SurfaceView r0 = r13.f70558d
            r0.setVisibility(r9)
            android.view.SurfaceView r0 = r13.f70558d
            r0.bringToFront()
            r13.b()
        L_0x0496:
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.fc.a()
            if (r0 == 0) goto L_0x04cc
            android.view.Window r0 = r13.getWindow()
            r1 = 1024(0x400, float:1.435E-42)
            r0.clearFlags(r1)
            boolean r0 = com.ss.android.common.util.ToolUtils.isFlyme()
            if (r0 == 0) goto L_0x04af
            com.bytedance.ies.uikit.statusbar.StatusBarUtils.setTranslucent(r13)
            goto L_0x04b2
        L_0x04af:
            com.bytedance.ies.uikit.statusbar.StatusBarUtils.setTransparent(r13)
        L_0x04b2:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r7) goto L_0x04bf
            android.view.Window r0 = r13.getWindow()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setNavigationBarColor(r1)
        L_0x04bf:
            com.ss.android.ugc.aweme.shortvideo.cv r0 = new com.ss.android.ugc.aweme.shortvideo.cv
            r0.<init>(r13)
            com.ss.android.ugc.aweme.shortvideo.ui.aa r1 = new com.ss.android.ugc.aweme.shortvideo.ui.aa
            r1.<init>(r13)
            r0.a(r1)
        L_0x04cc:
            java.lang.String r0 = "com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity.onCreate(android.os.Bundle):void");
    }

    private void a(View view, int i) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i)}, this, f70555a, false, 80346, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i)}, this, f70555a, false, 80346, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
        } else if (view2 != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.topMargin += i;
            view2.setLayoutParams(layoutParams);
        }
    }
}
