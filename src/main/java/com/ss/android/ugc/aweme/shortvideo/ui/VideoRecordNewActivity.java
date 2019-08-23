package com.ss.android.ugc.aweme.shortvideo.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.LogWriter;
import android.support.v4.view.AsyncLayoutInflater;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.medialib.FaceBeautyInvoker;
import com.ss.android.medialib.VideoSdkCore;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ttve.nativePort.TELogcat;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform;
import com.ss.android.ugc.aweme.filter.CircleViewPager;
import com.ss.android.ugc.aweme.filter.FilterViewModel;
import com.ss.android.ugc.aweme.filter.ac;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.photo.PhotoModule;
import com.ss.android.ugc.aweme.port.internal.c;
import com.ss.android.ugc.aweme.port.internal.m;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.ss.android.ugc.aweme.shortvideo.PlanC;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment;
import com.ss.android.ugc.aweme.shortvideo.ag;
import com.ss.android.ugc.aweme.shortvideo.av;
import com.ss.android.ugc.aweme.shortvideo.aw;
import com.ss.android.ugc.aweme.shortvideo.az;
import com.ss.android.ugc.aweme.shortvideo.bb;
import com.ss.android.ugc.aweme.shortvideo.bo;
import com.ss.android.ugc.aweme.shortvideo.bt;
import com.ss.android.ugc.aweme.shortvideo.bz;
import com.ss.android.ugc.aweme.shortvideo.c.i;
import com.ss.android.ugc.aweme.shortvideo.ca;
import com.ss.android.ugc.aweme.shortvideo.cb;
import com.ss.android.ugc.aweme.shortvideo.ce;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.CutMusicModule;
import com.ss.android.ugc.aweme.shortvideo.cv;
import com.ss.android.ugc.aweme.shortvideo.eg;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.ev;
import com.ss.android.ugc.aweme.shortvideo.f;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.fe;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.fi;
import com.ss.android.ugc.aweme.shortvideo.filter.d;
import com.ss.android.ugc.aweme.shortvideo.fu;
import com.ss.android.ugc.aweme.shortvideo.fv;
import com.ss.android.ugc.aweme.shortvideo.fy;
import com.ss.android.ugc.aweme.shortvideo.fz;
import com.ss.android.ugc.aweme.shortvideo.game.g;
import com.ss.android.ugc.aweme.shortvideo.gd;
import com.ss.android.ugc.aweme.shortvideo.gg;
import com.ss.android.ugc.aweme.shortvideo.gm;
import com.ss.android.ugc.aweme.shortvideo.guide.ExtraParams;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.shortvideo.record.h;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule;
import com.ss.android.ugc.aweme.shortvideo.sticker.aj;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.PixaloopARPresenter;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.adapter.PixaloopMattingAdapter;
import com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerModule;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerRepository;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurVideoRecordModel;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.shortvideo.util.aa;
import com.ss.android.ugc.aweme.shortvideo.util.af;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.shortvideo.util.z;
import com.ss.android.ugc.aweme.shortvideo.widget.ScreenSizeAspectFrameLayout;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.ae;
import com.ss.android.ugc.aweme.tools.ah;
import com.ss.android.ugc.aweme.tools.am;
import com.ss.android.ugc.aweme.tools.aq;
import com.ss.android.ugc.aweme.tools.ax;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.be;
import com.ss.android.ugc.aweme.tools.bf;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.u;
import com.ss.android.ugc.aweme.tools.x;
import com.ss.android.ugc.aweme.tools.y;
import com.ss.android.ugc.aweme.utils.dh;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.RecordViewModel;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import dmt.av.video.b.k;
import java.io.File;
import java.io.PrintWriter;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONObject;

public class VideoRecordNewActivity extends RecordSessionActivity implements e, c, ce, bf {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f4033b;
    public bd A;
    public boolean B;
    public ca C;
    List<String> D;
    public Effect E;
    public Serializable F;
    public boolean G;
    public boolean H;
    public g I;
    volatile boolean J;
    public com.ss.android.ugc.aweme.tools.extract.e K;
    public boolean L;
    public String M;
    public boolean N;
    public boolean O;
    public ShortVideoRecordingOperationPanelFragment P;
    public com.ss.android.ugc.aweme.shortvideo.c.c Q;
    public i R;
    public boolean S;
    public boolean T;
    public boolean U;
    Effect V;
    public int W;
    public List<String> X;
    int Y;
    public FrameLayout Z;
    public SurfaceHolder aa;
    public boolean ab;
    public boolean ac;
    public volatile boolean ad;
    public boolean ae;
    public dmt.av.video.b.a af;
    ac.b ag;
    ac.a ah;
    ac.c ai;
    public ac.d aj;
    public com.ss.android.medialib.c.b ak;
    public boolean al;
    public List<String> am;
    private List<com.ss.android.ugc.aweme.base.activity.b> an = new ArrayList();
    private List<com.ss.android.ugc.aweme.base.activity.a> ao = new ArrayList();
    private aj ap;
    private boolean aq;
    private boolean ar;
    private int as;
    private boolean at;

    /* renamed from: c  reason: collision with root package name */
    public fh f4034c;

    /* renamed from: d  reason: collision with root package name */
    public double f4035d = 1.0d;

    /* renamed from: e  reason: collision with root package name */
    public int f4036e = 1280;

    /* renamed from: f  reason: collision with root package name */
    public int f4037f = 720;
    public boolean g;
    public SafeHandler h = new SafeHandler(this);
    public com.ss.android.ugc.aweme.shortvideo.e.a i;
    public com.ss.android.ugc.aweme.shortvideo.record.a j;
    public StickerModule k;
    public d l;
    public CameraModule m;
    public PhotoModule n;
    public CutMusicModule o;
    public FaceStickerBean p;
    public com.ss.android.ugc.aweme.shortvideo.record.a.b q;
    public h r;
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a s;
    public MediaRecordPresenter t;
    public com.ss.android.ugc.aweme.shortvideo.j.e u;
    public FrameLayout v;
    public ScreenSizeAspectFrameLayout w;
    public SurfaceView x;
    public FrameLayout y;
    public bd z;

    public interface a {
        void a();
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70688a;

        /* renamed from: b  reason: collision with root package name */
        ShortVideoContextViewModel f70689b = VideoRecordNewActivity.this.g();

        public final void run() {
            long j;
            boolean z;
            boolean z2 = false;
            if (PatchProxy.isSupport(new Object[0], this, f70688a, false, 80700, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70688a, false, 80700, new Class[0], Void.TYPE);
            } else if (!VideoRecordNewActivity.this.g().f()) {
                long b2 = VideoRecordNewActivity.this.af.b().b() / 1000;
                if (b2 <= 0) {
                    ai.b("VideoNewActivity UpdateProgressSegment duration = " + b2);
                }
                if (VideoRecordNewActivity.this.f4034c.ab == 1) {
                    j = TimeSpeedModelExtension.calculateRealTime(b2, (double) am.NORMAL.value()) + VideoRecordNewActivity.this.f4034c.n;
                } else {
                    j = TimeSpeedModelExtension.calculateRealTime(b2, VideoRecordNewActivity.this.f4035d) + VideoRecordNewActivity.this.f4034c.n;
                }
                long a2 = this.f70689b.a();
                VideoRecordNewActivity.this.b((int) j);
                if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.DuetFixNewPlan) || com.ss.android.g.a.c() ? j <= VideoRecordNewActivity.this.f4034c.f67720c : (VideoRecordNewActivity.this.f4034c.c() || VideoRecordNewActivity.this.f4034c.b()) && VideoRecordNewActivity.this.O ? !VideoRecordNewActivity.this.N || j <= VideoRecordNewActivity.this.f4034c.f67720c : j <= VideoRecordNewActivity.this.f4034c.f67720c) {
                    z = false;
                } else {
                    z = true;
                }
                if (a2 > 0 && a2 < VideoRecordNewActivity.this.f4034c.f67720c && j > a2) {
                    z2 = true;
                }
                if (z2 || z) {
                    ax axVar = new ax();
                    VideoRecordNewActivity.this.A.a((Object) VideoRecordNewActivity.this, (bc) axVar);
                    VideoRecordNewActivity.this.z.a((Object) VideoRecordNewActivity.this, (bc) axVar);
                    if (z2) {
                        this.f70689b.a(0);
                    }
                    if (z) {
                        VideoRecordNewActivity.this.f4034c.aa = System.currentTimeMillis();
                        VideoRecordNewActivity.this.K.a(true);
                        VideoRecordNewActivity.this.z.a((Object) VideoRecordNewActivity.this, (bc) new y("record_full"));
                        VideoRecordNewActivity.this.l();
                    }
                    return;
                }
                VideoRecordNewActivity.this.a(b2);
                VideoRecordNewActivity.this.h.post(this);
            }
        }

        public b() {
        }
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f4033b, false, 80617, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f4033b, false, 80617, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final com.ss.android.ugc.aweme.shortvideo.j.d a() {
        return this.u;
    }

    public final bd k() {
        return this.A;
    }

    public void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f4033b, false, 80547, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f4033b, false, 80547, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.P != null) {
            this.P.a(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f4033b, false, 80558, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f4033b, false, 80558, new Class[]{f.class}, Void.TYPE);
            return;
        }
        if (!(this.P == null || fVar == null)) {
            this.P.Z = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().a(fVar);
            this.o.f66618e = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().a(fVar);
        }
    }

    public final void a(@NonNull com.ss.android.ugc.aweme.base.activity.b bVar) {
        com.ss.android.ugc.aweme.base.activity.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f4033b, false, 80583, new Class[]{com.ss.android.ugc.aweme.base.activity.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f4033b, false, 80583, new Class[]{com.ss.android.ugc.aweme.base.activity.b.class}, Void.TYPE);
            return;
        }
        this.an.add(bVar2);
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80527, new Class[0], Void.TYPE);
            return;
        }
        getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70658a;

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: com.ss.android.ugc.aweme.shortvideo.f} */
            /* JADX WARNING: Code restructure failed: missing block: B:157:0x07bb, code lost:
                if (com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a(r1.getMusicWavePointArray()) != false) goto L_0x07bd;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:159:0x07bf  */
            /* JADX WARNING: Removed duplicated region for block: B:160:0x07c3  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onFragmentActivityCreated(android.support.v4.app.FragmentManager r30, android.support.v4.app.Fragment r31, android.os.Bundle r32) {
                /*
                    r29 = this;
                    r7 = r29
                    r9 = r31
                    r11 = 3
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r12 = 0
                    r0[r12] = r30
                    r13 = 1
                    r0[r13] = r9
                    r14 = 2
                    r0[r14] = r32
                    com.meituan.robust.ChangeQuickRedirect r2 = f70658a
                    java.lang.Class[] r5 = new java.lang.Class[r11]
                    java.lang.Class<android.support.v4.app.FragmentManager> r1 = android.support.v4.app.FragmentManager.class
                    r5[r12] = r1
                    java.lang.Class<android.support.v4.app.Fragment> r1 = android.support.v4.app.Fragment.class
                    r5[r13] = r1
                    java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
                    r5[r14] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 80677(0x13b25, float:1.13053E-40)
                    r1 = r29
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0052
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r0[r12] = r30
                    r0[r13] = r9
                    r0[r14] = r32
                    com.meituan.robust.ChangeQuickRedirect r2 = f70658a
                    r3 = 0
                    r4 = 80677(0x13b25, float:1.13053E-40)
                    java.lang.Class[] r5 = new java.lang.Class[r11]
                    java.lang.Class<android.support.v4.app.FragmentManager> r1 = android.support.v4.app.FragmentManager.class
                    r5[r12] = r1
                    java.lang.Class<android.support.v4.app.Fragment> r1 = android.support.v4.app.Fragment.class
                    r5[r13] = r1
                    java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
                    r5[r14] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r29
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0052:
                    super.onFragmentActivityCreated(r30, r31, r32)
                    java.lang.String r0 = "addFragment onFragmentActivityCreated PlanC"
                    com.ss.android.ugc.aweme.shortvideo.util.ai.a(r0)
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    android.widget.FrameLayout r0 = r0.Z
                    java.lang.Object[] r15 = new java.lang.Object[r13]
                    r15[r12] = r0
                    r16 = 0
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.b.f70796a
                    r18 = 1
                    r19 = 80130(0x13902, float:1.12286E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r13]
                    java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
                    r1[r12] = r2
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r20 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r1 == 0) goto L_0x0096
                    java.lang.Object[] r15 = new java.lang.Object[r13]
                    r15[r12] = r0
                    r16 = 0
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.b.f70796a
                    r18 = 1
                    r19 = 80130(0x13902, float:1.12286E-40)
                    java.lang.Class[] r0 = new java.lang.Class[r13]
                    java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
                    r0[r12] = r1
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r20 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x00d5
                L_0x0096:
                    java.lang.Object[] r1 = new java.lang.Object[r13]
                    r1[r12] = r0
                    r23 = 0
                    com.meituan.robust.ChangeQuickRedirect r24 = com.ss.android.ugc.aweme.shortvideo.ui.c.f70851a
                    r25 = 1
                    r26 = 80132(0x13904, float:1.12289E-40)
                    java.lang.Class[] r2 = new java.lang.Class[r13]
                    java.lang.Class<android.view.ViewGroup> r3 = android.view.ViewGroup.class
                    r2[r12] = r3
                    java.lang.Class r28 = java.lang.Void.TYPE
                    r22 = r1
                    r27 = r2
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r22, r23, r24, r25, r26, r27, r28)
                    if (r1 == 0) goto L_0x00d0
                    java.lang.Object[] r15 = new java.lang.Object[r13]
                    r15[r12] = r0
                    r16 = 0
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.c.f70851a
                    r18 = 1
                    r19 = 80132(0x13904, float:1.12289E-40)
                    java.lang.Class[] r0 = new java.lang.Class[r13]
                    java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
                    r0[r12] = r1
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r20 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x00d5
                L_0x00d0:
                    if (r0 == 0) goto L_0x00d5
                    r0.removeAllViews()
                L_0x00d5:
                    boolean r0 = r9 instanceof com.ss.android.ugc.aweme.tools.bf
                    if (r0 == 0) goto L_0x00e4
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    r1 = r9
                    com.ss.android.ugc.aweme.tools.bf r1 = (com.ss.android.ugc.aweme.tools.bf) r1
                    com.ss.android.ugc.aweme.tools.bd r1 = r1.k()
                    r0.z = r1
                L_0x00e4:
                    boolean r0 = r9 instanceof com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment
                    if (r0 == 0) goto L_0x0933
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r1 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    r2 = 2131167916(0x7f070aac, float:1.795012E38)
                    android.view.View r1 = r1.findViewById(r2)
                    android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
                    r0.y = r1
                    java.lang.String r0 = "addFragment onFragmentActivityCreated initFilterModule"
                    com.ss.android.ugc.aweme.shortvideo.util.ai.a(r0)
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80543(0x13a9f, float:1.12865E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r1 == 0) goto L_0x012b
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80543(0x13a9f, float:1.12865E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x01be
                L_0x012b:
                    com.ss.android.ugc.aweme.shortvideo.filter.func.RecordFilterModuleImpl r1 = new com.ss.android.ugc.aweme.shortvideo.filter.func.RecordFilterModuleImpl
                    com.ss.android.medialib.presenter.MediaRecordPresenter r2 = r0.t
                    com.ss.android.ugc.aweme.shortvideo.j.e r3 = r0.u
                    android.widget.FrameLayout r4 = r0.v
                    com.ss.android.ugc.aweme.filter.ac$a r5 = r0.ah
                    com.ss.android.ugc.aweme.filter.ac$c r6 = r0.ai
                    com.ss.android.ugc.aweme.filter.ac$b r8 = r0.ag
                    com.ss.android.ugc.aweme.shortvideo.ui.bp r9 = new com.ss.android.ugc.aweme.shortvideo.ui.bp
                    r9.<init>(r0)
                    com.ss.android.ugc.aweme.filter.ac$d r10 = r0.aj
                    r15 = r1
                    r16 = r0
                    r17 = r0
                    r18 = r2
                    r19 = r3
                    r20 = r4
                    r21 = r5
                    r22 = r6
                    r23 = r8
                    r24 = r9
                    r25 = r10
                    r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                    r0.l = r1
                    com.ss.android.ugc.aweme.shortvideo.filter.d r1 = r0.l
                    com.ss.android.ugc.aweme.shortvideo.filter.func.RecordFilterModuleImpl r1 = (com.ss.android.ugc.aweme.shortvideo.filter.func.RecordFilterModuleImpl) r1
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.filter.func.RecordFilterModuleImpl.f3945a
                    r18 = 0
                    r19 = 77252(0x12dc4, float:1.08253E-40)
                    java.lang.Class[] r2 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r1
                    r20 = r2
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r2 == 0) goto L_0x018a
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.filter.func.RecordFilterModuleImpl.f3945a
                    r18 = 0
                    r19 = 77252(0x12dc4, float:1.08253E-40)
                    java.lang.Class[] r2 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r1
                    r20 = r2
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x01a6
                L_0x018a:
                    com.bytedance.ies.uikit.base.AbsActivity r2 = r1.f3946b
                    android.arch.lifecycle.ViewModelProvider r2 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r2)
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r3 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                    android.arch.lifecycle.ViewModel r2 = r2.get(r3)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r2 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r2
                    android.arch.lifecycle.LiveData r2 = r2.j()
                    com.bytedance.ies.uikit.base.AbsActivity r3 = r1.f3946b
                    com.ss.android.ugc.aweme.shortvideo.filter.func.f r4 = new com.ss.android.ugc.aweme.shortvideo.filter.func.f
                    r4.<init>(r1)
                    r2.observe(r3, r4)
                L_0x01a6:
                    android.arch.lifecycle.ViewModelProvider r1 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0)
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r2 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                    android.arch.lifecycle.ViewModel r1 = r1.get(r2)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r1
                    android.arch.lifecycle.LiveData r1 = r1.j()
                    com.ss.android.ugc.aweme.shortvideo.ui.bq r2 = new com.ss.android.ugc.aweme.shortvideo.ui.bq
                    r2.<init>(r0)
                    r1.observe(r0, r2)
                L_0x01be:
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.shortvideo.fh r0 = r0.f4034c
                    com.ss.android.ugc.aweme.property.e r1 = com.ss.android.ugc.aweme.port.in.a.L
                    com.ss.android.ugc.aweme.property.e$a r2 = com.ss.android.ugc.aweme.property.e.a.BeautyModel
                    int r1 = r1.b(r2)
                    if (r1 <= 0) goto L_0x01ce
                    r1 = 1
                    goto L_0x01cf
                L_0x01ce:
                    r1 = 0
                L_0x01cf:
                    r0.p = r1
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    android.view.Window r0 = r0.getWindow()
                    android.view.View r0 = r0.getDecorView()
                    android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$2$1 r1 = new com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$2$1
                    r1.<init>()
                    r0.addOnGlobalLayoutListener(r1)
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80554(0x13aaa, float:1.1288E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r1 == 0) goto L_0x0215
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80554(0x13aaa, float:1.1288E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x0223
                L_0x0215:
                    com.ss.android.ugc.aweme.photo.PhotoModule r1 = new com.ss.android.ugc.aweme.photo.PhotoModule
                    com.ss.android.medialib.presenter.MediaRecordPresenter r2 = r0.t
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$6 r3 = new com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$6
                    r3.<init>()
                    r1.<init>(r0, r2, r3)
                    r0.n = r1
                L_0x0223:
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80544(0x13aa0, float:1.12866E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r1 == 0) goto L_0x0251
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80544(0x13aa0, float:1.12866E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x02b3
                L_0x0251:
                    boolean r1 = r0.S
                    if (r1 == 0) goto L_0x02b3
                    com.ss.android.ugc.aweme.shortvideo.c.c r1 = new com.ss.android.ugc.aweme.shortvideo.c.c
                    com.ss.android.ugc.aweme.shortvideo.j.e r2 = r0.u
                    android.widget.FrameLayout r3 = r0.y
                    r1.<init>(r0, r0, r2, r3)
                    r0.Q = r1
                    com.ss.android.ugc.aweme.shortvideo.c.c r1 = r0.Q
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$17 r2 = new com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$17
                    r2.<init>()
                    r1.j = r2
                    com.ss.android.ugc.aweme.shortvideo.c.c r0 = r0.Q
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.c.c.f65864a
                    r18 = 0
                    r19 = 75198(0x125be, float:1.05375E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r1 == 0) goto L_0x0297
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.c.c.f65864a
                    r18 = 0
                    r19 = 75198(0x125be, float:1.05375E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x02b3
                L_0x0297:
                    android.support.v7.app.AppCompatActivity r1 = r0.i
                    android.arch.lifecycle.ViewModelProvider r1 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r1)
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r2 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                    android.arch.lifecycle.ViewModel r1 = r1.get(r2)
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r1
                    android.arch.lifecycle.LiveData r1 = r1.j()
                    android.support.v7.app.AppCompatActivity r2 = r0.i
                    com.ss.android.ugc.aweme.shortvideo.c.e r3 = new com.ss.android.ugc.aweme.shortvideo.c.e
                    r3.<init>(r0)
                    r1.observe(r2, r3)
                L_0x02b3:
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80534(0x13a96, float:1.12852E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r1 == 0) goto L_0x02e1
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80534(0x13a96, float:1.12852E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x02f8
                L_0x02e1:
                    r1 = 2131167872(0x7f070a80, float:1.795003E38)
                    android.view.View r1 = r0.findViewById(r1)
                    android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
                    com.ss.android.ugc.aweme.shortvideo.game.a r2 = new com.ss.android.ugc.aweme.shortvideo.game.a
                    dmt.av.video.b.a r3 = r0.af
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$12 r4 = new com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$12
                    r4.<init>()
                    r2.<init>(r0, r3, r1, r4)
                    r0.I = r2
                L_0x02f8:
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80548(0x13aa4, float:1.12872E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    r2 = 0
                    if (r1 == 0) goto L_0x0328
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80548(0x13aa4, float:1.12872E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x04ec
                L_0x0328:
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule
                    java.lang.String r19 = "default"
                    r3 = 2131167918(0x7f070aae, float:1.7950123E38)
                    android.view.View r3 = r0.findViewById(r3)
                    r20 = r3
                    android.widget.FrameLayout r20 = (android.widget.FrameLayout) r20
                    com.ss.android.ugc.aweme.shortvideo.ui.i r3 = new com.ss.android.ugc.aweme.shortvideo.ui.i
                    android.widget.FrameLayout r4 = r0.v
                    r5 = 2131166931(0x7f0706d3, float:1.7948121E38)
                    android.view.View r4 = r4.findViewById(r5)
                    android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
                    r3.<init>(r4)
                    android.widget.FrameLayout r4 = r0.y
                    com.ss.android.medialib.presenter.MediaRecordPresenter r5 = r0.t
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment r6 = r0.P
                    com.ss.android.ugc.aweme.shortvideo.ar.text.r[] r6 = r6.V
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$18 r8 = new com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$18
                    r8.<init>()
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$3 r9 = new com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$3
                    r9.<init>()
                    com.ss.android.ugc.aweme.shortvideo.ui.br r10 = new com.ss.android.ugc.aweme.shortvideo.ui.br
                    r10.<init>(r0)
                    r15 = r1
                    r16 = r0
                    r17 = r0
                    r18 = r0
                    r21 = r3
                    r22 = r4
                    r23 = r5
                    r24 = r6
                    r25 = r8
                    r26 = r9
                    r27 = r10
                    r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                    r0.k = r1
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r1 = r0.k
                    com.ss.android.ugc.aweme.shortvideo.ui.bs r3 = new com.ss.android.ugc.aweme.shortvideo.ui.bs
                    r3.<init>(r0)
                    r1.v = r3
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r1 = r0.k
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.f3976a
                    r18 = 0
                    r19 = 78698(0x1336a, float:1.1028E-40)
                    java.lang.Class[] r3 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r1
                    r20 = r3
                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r3 == 0) goto L_0x03af
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.f3976a
                    r18 = 0
                    r19 = 78698(0x1336a, float:1.1028E-40)
                    java.lang.Class[] r3 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r1
                    r20 = r3
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x03c1
                L_0x03af:
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r3 = r1.a()
                    android.arch.lifecycle.LiveData r3 = r3.j()
                    com.bytedance.ies.uikit.base.AbsActivity r4 = r1.f3977b
                    com.ss.android.ugc.aweme.shortvideo.sticker.u r5 = new com.ss.android.ugc.aweme.shortvideo.sticker.u
                    r5.<init>(r1)
                    r3.observe(r4, r5)
                L_0x03c1:
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r1 = r0.k
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.f3976a
                    r18 = 0
                    r19 = 78699(0x1336b, float:1.10281E-40)
                    java.lang.Class[] r3 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r1
                    r20 = r3
                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r3 == 0) goto L_0x03ef
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.f3976a
                    r18 = 0
                    r19 = 78699(0x1336b, float:1.10281E-40)
                    java.lang.Class[] r3 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r1
                    r20 = r3
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x043d
                L_0x03ef:
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r3 = r1.a()
                    java.lang.Object[] r4 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r24 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.f65400a
                    r25 = 0
                    r26 = 74621(0x1237d, float:1.04566E-40)
                    java.lang.Class[] r5 = new java.lang.Class[r12]
                    java.lang.Class<android.arch.lifecycle.LiveData> r28 = android.arch.lifecycle.LiveData.class
                    r22 = r4
                    r23 = r3
                    r27 = r5
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r22, r23, r24, r25, r26, r27, r28)
                    if (r4 == 0) goto L_0x0426
                    java.lang.Object[] r4 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r24 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.f65400a
                    r25 = 0
                    r26 = 74621(0x1237d, float:1.04566E-40)
                    java.lang.Class[] r5 = new java.lang.Class[r12]
                    java.lang.Class<android.arch.lifecycle.LiveData> r28 = android.arch.lifecycle.LiveData.class
                    r22 = r4
                    r23 = r3
                    r27 = r5
                    java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r22, r23, r24, r25, r26, r27, r28)
                    android.arch.lifecycle.LiveData r3 = (android.arch.lifecycle.LiveData) r3
                    goto L_0x0433
                L_0x0426:
                    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r4 = r3.f65402c
                    if (r4 != 0) goto L_0x0431
                    android.arch.lifecycle.MutableLiveData r4 = new android.arch.lifecycle.MutableLiveData
                    r4.<init>()
                    r3.f65402c = r4
                L_0x0431:
                    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r3 = r3.f65402c
                L_0x0433:
                    com.bytedance.ies.uikit.base.AbsActivity r4 = r1.f3977b
                    com.ss.android.ugc.aweme.shortvideo.sticker.v r5 = new com.ss.android.ugc.aweme.shortvideo.sticker.v
                    r5.<init>(r1)
                    r3.observe(r4, r5)
                L_0x043d:
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r1 = r0.k
                    r1.a((boolean) r13)
                    com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                    java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r3 = com.ss.android.ugc.aweme.services.IAVService.class
                    java.lang.Object r1 = r1.getService(r3)
                    com.ss.android.ugc.aweme.services.IAVService r1 = (com.ss.android.ugc.aweme.services.IAVService) r1
                    com.ss.android.ugc.aweme.services.sticker.IUnLockStickerManagerService r1 = r1.unLockStickerManagerService()
                    r1.updateUnlockedIdsFromNet(r2)
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r1 = r0.k
                    com.ss.android.ugc.aweme.shortvideo.game.g r3 = r0.I
                    r1.s = r3
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r1 = r0.k
                    com.ss.android.ugc.aweme.tools.extract.e r3 = r0.K
                    java.lang.Object[] r15 = new java.lang.Object[r13]
                    r15[r12] = r3
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.f3976a
                    r18 = 0
                    r19 = 78705(0x13371, float:1.10289E-40)
                    java.lang.Class[] r4 = new java.lang.Class[r13]
                    java.lang.Class<com.ss.android.ugc.aweme.tools.extract.e> r5 = com.ss.android.ugc.aweme.tools.extract.e.class
                    r4[r12] = r5
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r1
                    r20 = r4
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r4 == 0) goto L_0x0497
                    java.lang.Object[] r15 = new java.lang.Object[r13]
                    r15[r12] = r3
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.f3976a
                    r18 = 0
                    r19 = 78705(0x13371, float:1.10289E-40)
                    java.lang.Class[] r3 = new java.lang.Class[r13]
                    java.lang.Class<com.ss.android.ugc.aweme.tools.extract.e> r4 = com.ss.android.ugc.aweme.tools.extract.e.class
                    r3[r12] = r4
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r1
                    r20 = r3
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x04a9
                L_0x0497:
                    r1.u = r3
                    com.bytedance.ies.uikit.base.AbsActivity r1 = r1.f3977b
                    android.arch.lifecycle.ViewModelProvider r1 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r1)
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.ar.MediaRecordPresenterViewModel> r4 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.MediaRecordPresenterViewModel.class
                    android.arch.lifecycle.ViewModel r1 = r1.get(r4)
                    com.ss.android.ugc.aweme.shortvideo.sticker.ar.MediaRecordPresenterViewModel r1 = (com.ss.android.ugc.aweme.shortvideo.sticker.ar.MediaRecordPresenterViewModel) r1
                    r1.f69326c = r3
                L_0x04a9:
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r1 = r0.k
                    com.ss.android.ugc.aweme.shortvideo.ui.bt r3 = new com.ss.android.ugc.aweme.shortvideo.ui.bt
                    r3.<init>(r0)
                    r1.a((android.view.View.OnClickListener) r3)
                    android.support.v4.app.FragmentManager r1 = r0.getSupportFragmentManager()
                    java.util.List r1 = r1.getFragments()
                    boolean r3 = com.bytedance.common.utility.Lists.notEmpty(r1)
                    if (r3 == 0) goto L_0x04ec
                    com.google.common.a.f r3 = com.ss.android.ugc.aweme.shortvideo.ui.aw.f70789b
                    java.util.List r1 = com.ss.android.ugc.aweme.shortvideo.util.z.a(r1, r3)
                    boolean r3 = com.bytedance.common.utility.Lists.notEmpty(r1)
                    if (r3 == 0) goto L_0x04ec
                    android.support.v4.app.FragmentManager r0 = r0.getSupportFragmentManager()
                    android.support.v4.app.FragmentTransaction r0 = r0.beginTransaction()
                    java.util.Iterator r1 = r1.iterator()
                L_0x04d9:
                    boolean r3 = r1.hasNext()
                    if (r3 == 0) goto L_0x04e9
                    java.lang.Object r3 = r1.next()
                    android.support.v4.app.Fragment r3 = (android.support.v4.app.Fragment) r3
                    r0.remove(r3)
                    goto L_0x04d9
                L_0x04e9:
                    r0.commitAllowingStateLoss()
                L_0x04ec:
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80566(0x13ab6, float:1.12897E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r1 == 0) goto L_0x051b
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80566(0x13ab6, float:1.12897E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x06b1
                L_0x051b:
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a r1 = r0.s
                    if (r1 != 0) goto L_0x06b1
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a r1 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a
                    r1.<init>()
                    r0.s = r1
                    com.ss.android.ugc.aweme.shortvideo.fh r1 = r0.f4034c
                    if (r1 == 0) goto L_0x053e
                    com.ss.android.ugc.aweme.shortvideo.fh r1 = r0.f4034c
                    boolean r1 = r1.b()
                    if (r1 != 0) goto L_0x053a
                    com.ss.android.ugc.aweme.shortvideo.fh r1 = r0.f4034c
                    boolean r1 = r1.c()
                    if (r1 == 0) goto L_0x053e
                L_0x053a:
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a r1 = r0.s
                    r1.f67299d = r12
                L_0x053e:
                    com.ss.android.ugc.aweme.shortvideo.fh r1 = r0.f4034c
                    java.lang.String r1 = r1.ae
                    boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)
                    if (r1 != 0) goto L_0x06b1
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a r1 = r0.s
                    com.ss.android.ugc.aweme.shortvideo.fh r3 = r0.f4034c
                    java.lang.String r3 = r3.ae
                    com.ss.android.ugc.aweme.shortvideo.fh r0 = r0.f4034c
                    long r4 = r0.n
                    int r0 = (int) r4
                    java.lang.Object[] r15 = new java.lang.Object[r14]
                    r15[r12] = r3
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                    r15[r13] = r4
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a.f67296a
                    r18 = 0
                    r19 = 77005(0x12ccd, float:1.07907E-40)
                    java.lang.Class[] r4 = new java.lang.Class[r14]
                    java.lang.Class<java.lang.String> r5 = java.lang.String.class
                    r4[r12] = r5
                    java.lang.Class r5 = java.lang.Integer.TYPE
                    r4[r13] = r5
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r1
                    r20 = r4
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r4 == 0) goto L_0x05a0
                    java.lang.Object[] r15 = new java.lang.Object[r14]
                    r15[r12] = r3
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r15[r13] = r0
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a.f67296a
                    r18 = 0
                    r19 = 77005(0x12ccd, float:1.07907E-40)
                    java.lang.Class[] r0 = new java.lang.Class[r14]
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r0[r12] = r3
                    java.lang.Class r3 = java.lang.Integer.TYPE
                    r0[r13] = r3
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r1
                    r20 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x06b1
                L_0x05a0:
                    boolean r4 = r1.f67299d
                    if (r4 == 0) goto L_0x06b1
                    r1.g = r0
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_RECORD
                    java.lang.Object[] r15 = new java.lang.Object[r14]
                    r15[r12] = r3
                    r15[r13] = r0
                    r16 = 0
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.f67249a
                    r18 = 1
                    r19 = 76892(0x12c5c, float:1.07749E-40)
                    java.lang.Class[] r4 = new java.lang.Class[r14]
                    java.lang.Class<java.lang.String> r5 = java.lang.String.class
                    r4[r12] = r5
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d> r5 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.class
                    r4[r13] = r5
                    java.lang.Class<java.util.List> r21 = java.util.List.class
                    r20 = r4
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r4 == 0) goto L_0x05ef
                    java.lang.Object[] r15 = new java.lang.Object[r14]
                    r15[r12] = r3
                    r15[r13] = r0
                    r16 = 0
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.f67249a
                    r18 = 1
                    r19 = 76892(0x12c5c, float:1.07749E-40)
                    java.lang.Class[] r0 = new java.lang.Class[r14]
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r0[r12] = r3
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d> r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.class
                    r0[r13] = r3
                    java.lang.Class<java.util.List> r21 = java.util.List.class
                    r20 = r0
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    java.util.List r0 = (java.util.List) r0
                    goto L_0x05ff
                L_0x05ef:
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a((java.lang.String) r3)
                    if (r3 != 0) goto L_0x05f7
                    r0 = r2
                    goto L_0x05ff
                L_0x05f7:
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[] r4 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[r13]
                    r4[r12] = r0
                    java.util.List r0 = r3.getStickerStructsByPage(r4)
                L_0x05ff:
                    boolean r3 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
                    if (r3 != 0) goto L_0x06b1
                    java.util.Iterator r0 = r0.iterator()
                L_0x0609:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L_0x06b1
                    java.lang.Object r3 = r0.next()
                    com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r3
                    int r4 = r3.getType()
                    if (r4 != r14) goto L_0x0609
                    java.lang.String r4 = r3.getAttr()
                    boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r4)
                    if (r4 != 0) goto L_0x0609
                    java.lang.String r4 = r3.getTrackList()
                    boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r4)
                    if (r4 != 0) goto L_0x0609
                    com.ss.android.ugc.aweme.port.in.ab r4 = com.ss.android.ugc.aweme.port.in.a.D
                    com.google.gson.Gson r4 = r4.getRetrofitFactoryGson()
                    java.lang.String r5 = r3.getAttr()
                    java.lang.Class<java.util.Map> r6 = java.util.Map.class
                    java.lang.Object r4 = r4.fromJson((java.lang.String) r5, (java.lang.Class<T>) r6)
                    java.util.Map r4 = (java.util.Map) r4
                    if (r4 == 0) goto L_0x0609
                    java.lang.String r5 = "interaction_extra"
                    boolean r5 = r4.containsKey(r5)
                    if (r5 == 0) goto L_0x0609
                    org.json.JSONObject r5 = new org.json.JSONObject
                    java.lang.String r6 = "interaction_extra"
                    java.lang.Object r4 = r4.get(r6)
                    java.util.Map r4 = (java.util.Map) r4
                    r5.<init>(r4)
                    java.lang.String r4 = r5.toString()
                    com.ss.android.ugc.aweme.port.in.ab r5 = com.ss.android.ugc.aweme.port.in.a.D     // Catch:{ Exception -> 0x06ae }
                    com.google.gson.Gson r5 = r5.getRetrofitFactoryGson()     // Catch:{ Exception -> 0x06ae }
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.RecordInteractExtra> r6 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.RecordInteractExtra.class
                    java.lang.Object r4 = r5.fromJson((java.lang.String) r4, (java.lang.Class<T>) r6)     // Catch:{ Exception -> 0x06ae }
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.RecordInteractExtra r4 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.RecordInteractExtra) r4     // Catch:{ Exception -> 0x06ae }
                    if (r4 == 0) goto L_0x0609
                    java.lang.String r5 = r4.getStickerId()
                    boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r5)
                    if (r5 != 0) goto L_0x0609
                    com.ss.android.ugc.aweme.port.in.ab r5 = com.ss.android.ugc.aweme.port.in.a.D
                    com.google.gson.Gson r5 = r5.getRetrofitFactoryGson()
                    java.lang.String r3 = r3.getTrackList()
                    java.lang.Class<com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp[]> r6 = com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp[].class
                    java.lang.Object r3 = r5.fromJson((java.lang.String) r3, (java.lang.Class<T>) r6)
                    com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp[] r3 = (com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp[]) r3
                    if (r3 == 0) goto L_0x0609
                    int r5 = r3.length
                    if (r5 == 0) goto L_0x0609
                    java.util.List r3 = java.util.Arrays.asList(r3)
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>(r3)
                    java.util.LinkedHashMap<java.lang.String, java.util.List<com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp>> r3 = r1.f67300e
                    java.lang.String r6 = r4.getStickerId()
                    r3.put(r6, r5)
                    java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.guide.ExtraParams> r3 = r1.f67301f
                    java.lang.String r5 = r4.getStickerId()
                    com.ss.android.ugc.aweme.shortvideo.guide.ExtraParams r4 = r4.toExtraParams()
                    r3.put(r5, r4)
                    goto L_0x0609
                L_0x06ae:
                    goto L_0x0609
                L_0x06b1:
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80556(0x13aac, float:1.12883E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r1 == 0) goto L_0x06e0
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80556(0x13aac, float:1.12883E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r21 = java.lang.Void.TYPE
                    r16 = r0
                    r20 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x07d9
                L_0x06e0:
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80557(0x13aad, float:1.12884E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.f> r21 = com.ss.android.ugc.aweme.shortvideo.f.class
                    r16 = r0
                    r20 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                    if (r1 == 0) goto L_0x0712
                    java.lang.Object[] r15 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r18 = 0
                    r19 = 80557(0x13aad, float:1.12884E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.f> r21 = com.ss.android.ugc.aweme.shortvideo.f.class
                    r16 = r0
                    r20 = r1
                    java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                    r2 = r1
                    com.ss.android.ugc.aweme.shortvideo.f r2 = (com.ss.android.ugc.aweme.shortvideo.f) r2
                L_0x070f:
                    r1 = r2
                    goto L_0x07bd
                L_0x0712:
                    android.content.Intent r1 = r0.getIntent()
                    if (r1 == 0) goto L_0x070f
                    com.ss.android.ugc.aweme.ao.a r1 = com.ss.android.ugc.aweme.port.in.a.i
                    android.content.Intent r3 = r0.getIntent()
                    java.lang.String r4 = "music_wave_data"
                    java.io.Serializable r3 = r3.getSerializableExtra(r4)
                    com.ss.android.ugc.aweme.shortvideo.f r1 = r1.a((java.io.Serializable) r3)
                    if (r1 == 0) goto L_0x0736
                    float[] r3 = r1.getMusicWavePointArray()
                    boolean r3 = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a((float[]) r3)
                    if (r3 == 0) goto L_0x0736
                    goto L_0x07bd
                L_0x0736:
                    com.ss.android.ugc.aweme.shortvideo.ej r1 = com.ss.android.ugc.aweme.shortvideo.ej.a()
                    com.ss.android.ugc.aweme.shortvideo.e r1 = r1.b()
                    if (r1 == 0) goto L_0x070f
                    float[] r3 = r1.getMusicWaveData()
                    boolean r3 = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a((float[]) r3)
                    if (r3 == 0) goto L_0x070f
                    com.ss.android.ugc.aweme.shortvideo.cutmusic.f r3 = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a()
                    java.lang.Object[] r14 = new java.lang.Object[r13]
                    r14[r12] = r1
                    com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.f66694a
                    r17 = 0
                    r18 = 76118(0x12956, float:1.06664E-40)
                    java.lang.Class[] r4 = new java.lang.Class[r13]
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.e> r5 = com.ss.android.ugc.aweme.shortvideo.e.class
                    r4[r12] = r5
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.f> r20 = com.ss.android.ugc.aweme.shortvideo.f.class
                    r15 = r3
                    r19 = r4
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
                    if (r4 == 0) goto L_0x0787
                    java.lang.Object[] r14 = new java.lang.Object[r13]
                    r14[r12] = r1
                    com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.f66694a
                    r17 = 0
                    r18 = 76118(0x12956, float:1.06664E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r13]
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.e> r4 = com.ss.android.ugc.aweme.shortvideo.e.class
                    r1[r12] = r4
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.f> r20 = com.ss.android.ugc.aweme.shortvideo.f.class
                    r15 = r3
                    r19 = r1
                    java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                    com.ss.android.ugc.aweme.shortvideo.f r1 = (com.ss.android.ugc.aweme.shortvideo.f) r1
                    goto L_0x07b1
                L_0x0787:
                    if (r1 == 0) goto L_0x07b0
                    float[] r3 = r1.getMusicWaveData()
                    boolean r3 = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.b.a((float[]) r3)
                    if (r3 == 0) goto L_0x07b0
                    com.ss.android.ugc.aweme.shortvideo.f r3 = new com.ss.android.ugc.aweme.shortvideo.f
                    r3.<init>()
                    float[] r1 = r1.getMusicWaveData()
                    java.lang.String r4 = "music.musicWaveData"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                    int r4 = r1.length
                    float[] r1 = java.util.Arrays.copyOf(r1, r4)
                    java.lang.String r4 = "java.util.Arrays.copyOf(this, size)"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                    r3.setMusicWavePointArray(r1)
                    r1 = r3
                    goto L_0x07b1
                L_0x07b0:
                    r1 = r2
                L_0x07b1:
                    if (r1 == 0) goto L_0x070f
                    float[] r3 = r1.getMusicWavePointArray()
                    boolean r3 = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a((float[]) r3)
                    if (r3 == 0) goto L_0x070f
                L_0x07bd:
                    if (r1 == 0) goto L_0x07c3
                    r0.a((com.ss.android.ugc.aweme.shortvideo.f) r1)
                    goto L_0x07d9
                L_0x07c3:
                    com.ss.android.ugc.aweme.shortvideo.fh r1 = r0.f4034c
                    java.lang.String r1 = r1.f67723f
                    if (r1 == 0) goto L_0x07d9
                    com.ss.android.ugc.aweme.shortvideo.cutmusic.f r1 = com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a()
                    com.ss.android.ugc.aweme.shortvideo.fh r2 = r0.f4034c
                    java.lang.String r2 = r2.f67723f
                    com.ss.android.ugc.aweme.shortvideo.ui.bd r3 = new com.ss.android.ugc.aweme.shortvideo.ui.bd
                    r3.<init>(r0)
                    r1.a((java.lang.String) r2, (com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a) r3)
                L_0x07d9:
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.shortvideo.record.h r1 = new com.ss.android.ugc.aweme.shortvideo.record.h
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r2 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r3 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    dmt.av.video.b.a r3 = r3.af
                    dmt.av.video.b.a.c r3 = r3.g()
                    r1.<init>(r2, r3)
                    r0.r = r1
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r1 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    java.lang.Object[] r14 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r17 = 0
                    r18 = 80545(0x13aa1, float:1.12868E-40)
                    java.lang.Class[] r2 = new java.lang.Class[r12]
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.c.i> r20 = com.ss.android.ugc.aweme.shortvideo.c.i.class
                    r15 = r1
                    r19 = r2
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
                    if (r2 == 0) goto L_0x081d
                    java.lang.Object[] r14 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r17 = 0
                    r18 = 80545(0x13aa1, float:1.12868E-40)
                    java.lang.Class[] r2 = new java.lang.Class[r12]
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.c.i> r20 = com.ss.android.ugc.aweme.shortvideo.c.i.class
                    r15 = r1
                    r19 = r2
                    java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                    com.ss.android.ugc.aweme.shortvideo.c.i r1 = (com.ss.android.ugc.aweme.shortvideo.c.i) r1
                    goto L_0x082c
                L_0x081d:
                    boolean r2 = r1.S
                    if (r2 == 0) goto L_0x0826
                    com.ss.android.ugc.aweme.shortvideo.c.c r1 = r1.Q
                    com.ss.android.ugc.aweme.shortvideo.c.i r1 = r1.f65866c
                    goto L_0x082c
                L_0x0826:
                    com.ss.android.ugc.aweme.shortvideo.filter.d r1 = r1.l
                    com.ss.android.ugc.aweme.shortvideo.c.i r1 = r1.f()
                L_0x082c:
                    r0.R = r1
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    java.lang.Object[] r14 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r17 = 0
                    r18 = 80602(0x13ada, float:1.12947E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r20 = java.lang.Void.TYPE
                    r15 = r0
                    r19 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
                    if (r1 == 0) goto L_0x085a
                    java.lang.Object[] r14 = new java.lang.Object[r12]
                    com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.f4033b
                    r17 = 0
                    r18 = 80602(0x13ada, float:1.12947E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r12]
                    java.lang.Class r20 = java.lang.Void.TYPE
                    r15 = r0
                    r19 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                    goto L_0x0870
                L_0x085a:
                    android.arch.lifecycle.ViewModelProvider r1 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0)
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel> r2 = com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel.class
                    android.arch.lifecycle.ViewModel r1 = r1.get(r2)
                    com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel r1 = (com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel) r1
                    android.arch.lifecycle.MutableLiveData<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r1.f70249b
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$11 r2 = new com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$11
                    r2.<init>()
                    r1.observe(r0, r2)
                L_0x0870:
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.shortvideo.record.CameraModule r0 = r0.m
                    r0.c()
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.shortvideo.fh r0 = r0.f4034c
                    com.ss.android.ugc.aweme.shortvideo.ft r0 = r0.m
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r1 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.shortvideo.fh r1 = r1.f4034c
                    long r1 = r1.n
                    com.ss.android.ugc.aweme.tools.ai r0 = com.ss.android.ugc.aweme.tools.ai.a(r0, r1)
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r1 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.tools.bd r1 = r1.z
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r2 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    r1.a((java.lang.Object) r2, (com.ss.android.ugc.aweme.tools.bc) r0)
                    r0.a()
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.tools.bd r0 = r0.z
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r1 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.tools.ac r2 = new com.ss.android.ugc.aweme.tools.ac
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r3 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.shortvideo.fh r3 = r3.f4034c
                    long r3 = r3.f67720c
                    r2.<init>(r3)
                    r0.a((java.lang.Object) r1, (com.ss.android.ugc.aweme.tools.bc) r2)
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.shortvideo.fh r0 = r0.f4034c
                    boolean r0 = r0.b()
                    if (r0 != 0) goto L_0x08bb
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.shortvideo.fh r0 = r0.f4034c
                    boolean r0 = r0.c()
                    if (r0 == 0) goto L_0x08d0
                L_0x08bb:
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0)
                    java.lang.Class<com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel> r1 = com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel.class
                    android.arch.lifecycle.ViewModel r0 = r0.get(r1)
                    com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel r0 = (com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel) r0
                    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.k
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    r0.setValue(r1)
                L_0x08d0:
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    boolean r0 = r0.L
                    if (r0 == 0) goto L_0x08dd
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r0 = r0.k
                    r0.c()
                L_0x08dd:
                    com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.this
                    com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = r0.g()
                    java.lang.Object[] r14 = new java.lang.Object[r13]
                    java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
                    r14[r12] = r1
                    com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.f65400a
                    r17 = 0
                    r18 = 74622(0x1237e, float:1.04568E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r13]
                    java.lang.Class r2 = java.lang.Boolean.TYPE
                    r1[r12] = r2
                    java.lang.Class r20 = java.lang.Void.TYPE
                    r15 = r0
                    r19 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
                    if (r1 == 0) goto L_0x0921
                    java.lang.Object[] r14 = new java.lang.Object[r13]
                    java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
                    r14[r12] = r1
                    com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.f65400a
                    r17 = 0
                    r18 = 74622(0x1237e, float:1.04568E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r13]
                    java.lang.Class r2 = java.lang.Boolean.TYPE
                    r1[r12] = r2
                    java.lang.Class r20 = java.lang.Void.TYPE
                    r15 = r0
                    r19 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                    return
                L_0x0921:
                    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r0.f65403d
                    if (r1 != 0) goto L_0x092c
                    android.arch.lifecycle.MutableLiveData r1 = new android.arch.lifecycle.MutableLiveData
                    r1.<init>()
                    r0.f65403d = r1
                L_0x092c:
                    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.f65403d
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    r0.setValue(r1)
                L_0x0933:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.AnonymousClass2.onFragmentActivityCreated(android.support.v4.app.FragmentManager, android.support.v4.app.Fragment, android.os.Bundle):void");
            }
        }, false);
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80553, new Class[0], Void.TYPE);
            return;
        }
        this.j = new com.ss.android.ugc.aweme.shortvideo.record.a(this, bb.f70800b);
    }

    private void w() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80610, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80610, new Class[0], Void.TYPE);
            return;
        }
        m mVar = (m) com.ss.android.ugc.aweme.common.g.a.a(this, m.class);
        if (mVar != null && mVar.d(true)) {
            mVar.e(false);
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final ShortVideoContextViewModel g() {
        if (!PatchProxy.isSupport(new Object[0], this, f4033b, false, 80562, new Class[0], ShortVideoContextViewModel.class)) {
            return (ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) this).get(ShortVideoContextViewModel.class);
        }
        return (ShortVideoContextViewModel) PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80562, new Class[0], ShortVideoContextViewModel.class);
    }

    public int getStatusBarColor() {
        if (!PatchProxy.isSupport(new Object[0], this, f4033b, false, 80520, new Class[0], Integer.TYPE)) {
            return getResources().getColor(C0906R.color.ano);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80520, new Class[0], Integer.TYPE)).intValue();
    }

    public final String j() {
        if (!PatchProxy.isSupport(new Object[0], this, f4033b, false, 80581, new Class[0], String.class)) {
            return getIntent().getStringExtra("shoot_way");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80581, new Class[0], String.class);
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80596, new Class[0], Void.TYPE);
            return;
        }
        if (this.z != null) {
            this.z.a((Object) this, (bc) new ah());
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80607, new Class[0], Void.TYPE);
            return;
        }
        if (this.ap != null) {
            this.ap.a();
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80539, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80539, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29088b, com.ss.android.experiencekit.c.d.END);
        super.onBackPressed();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80538, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        f();
        this.ar = false;
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80540, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.x != null) {
            this.x.setVisibility(8);
        }
        l();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80519, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, Integer.MIN_VALUE);
        }
    }

    public VideoRecordNewActivity() {
        com.ss.android.ugc.aweme.shortvideo.e.a aVar;
        if (com.ss.android.g.a.b()) {
            aVar = new com.ss.android.ugc.aweme.shortvideo.e.g();
        } else {
            aVar = new com.ss.android.ugc.aweme.shortvideo.e.b();
        }
        this.i = aVar;
        this.B = true;
        this.J = true;
        this.N = false;
        this.O = false;
        this.aq = false;
        this.ar = false;
        this.W = 0;
        this.Y = 0;
        this.ac = true;
        this.ad = true;
        this.ae = false;
        this.ag = new ac.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70644a;

            public final void a(float f2) {
                int i = 0;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f70644a, false, 80684, new Class[]{Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f70644a, false, 80684, new Class[]{Float.TYPE}, Void.TYPE);
                    return;
                }
                if (VideoRecordNewActivity.this.u != null) {
                    if (((com.ss.android.ugc.aweme.shortvideo.filter.e) VideoRecordNewActivity.this.l.c()).e() != null) {
                        i = ((com.ss.android.ugc.aweme.shortvideo.filter.e) VideoRecordNewActivity.this.l.c()).e().f47602f;
                    }
                    VideoRecordNewActivity.this.u.a(new com.ss.android.ugc.aweme.shortvideo.j.a(i), f2);
                }
                com.ss.android.ugc.aweme.port.in.a.u.a(((com.ss.android.ugc.aweme.shortvideo.filter.e) VideoRecordNewActivity.this.l.c()).e().f47602f);
            }

            public final void a(com.ss.android.ugc.aweme.filter.h hVar) {
                x xVar;
                com.ss.android.ugc.aweme.filter.h hVar2 = hVar;
                if (PatchProxy.isSupport(new Object[]{hVar2}, this, f70644a, false, 80683, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{hVar2}, this, f70644a, false, 80683, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE);
                    return;
                }
                if (!VideoRecordNewActivity.this.g().f()) {
                    VideoRecordNewActivity.this.f4034c.O.add(hVar2.f47600d);
                    VideoRecordNewActivity.this.f4034c.P.add(String.valueOf(hVar2.f47598b));
                }
                VideoRecordNewActivity.this.i.a(VideoRecordNewActivity.this.m.h(), hVar2.f47602f);
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(0.0f)}, null, x.f74948a, true, 86965, new Class[]{Float.TYPE}, x.class)) {
                    xVar = (x) PatchProxy.accessDispatch(new Object[]{Float.valueOf(0.0f)}, null, x.f74948a, true, 86965, new Class[]{Float.TYPE}, x.class);
                } else {
                    x xVar2 = new x();
                    xVar2.f74949b = 0.0f;
                    xVar2.f74952e = 1;
                    xVar = xVar2;
                }
                VideoRecordNewActivity.this.z.a((Object) this, (bc) xVar);
                com.ss.android.ugc.aweme.port.in.a.u.a(hVar2);
            }

            public final void b(com.ss.android.ugc.aweme.filter.h hVar) {
                float f2;
                com.ss.android.ugc.aweme.filter.h hVar2 = hVar;
                if (PatchProxy.isSupport(new Object[]{hVar2}, this, f70644a, false, 80685, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{hVar2}, this, f70644a, false, 80685, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE);
                    return;
                }
                if (!com.ss.android.g.a.b() || !hVar.a().contains("normal")) {
                    VideoRecordNewActivity.this.u.a(hVar2.j);
                } else {
                    VideoRecordNewActivity.this.u.a("");
                }
                if (VideoRecordNewActivity.this.f4034c.p) {
                    if (hVar2.f47602f == 0) {
                        f2 = 0.35f;
                    } else {
                        f2 = 0.0f;
                    }
                    com.ss.android.ugc.aweme.shortvideo.j.e eVar = VideoRecordNewActivity.this.u;
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, eVar, com.ss.android.ugc.aweme.shortvideo.j.e.f68244a, false, 78449, new Class[]{Float.TYPE}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.shortvideo.j.e eVar2 = eVar;
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, eVar2, com.ss.android.ugc.aweme.shortvideo.j.e.f68244a, false, 78449, new Class[]{Float.TYPE}, Void.TYPE);
                    } else {
                        MediaRecordPresenter mediaRecordPresenter = eVar.f68246c;
                        Object[] objArr = {Float.valueOf(f2)};
                        if (PatchProxy.isSupport(objArr, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17632, new Class[]{Float.TYPE}, Void.TYPE)) {
                            Object[] objArr2 = {Float.valueOf(f2)};
                            Object[] objArr3 = objArr2;
                            MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
                            PatchProxy.accessDispatch(objArr3, mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17632, new Class[]{Float.TYPE}, Void.TYPE);
                        } else {
                            mediaRecordPresenter.b(1, f2);
                        }
                    }
                }
                com.ss.android.ugc.aweme.port.in.a.u.a(((com.ss.android.ugc.aweme.shortvideo.filter.e) VideoRecordNewActivity.this.l.c()).e().f47602f);
            }
        };
        this.ah = new ac.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70646a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f70646a, false, 80686, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f70646a, false, 80686, new Class[0], Void.TYPE);
                    return;
                }
                VideoRecordNewActivity.this.z.a((Object) VideoRecordNewActivity.this, (bc) x.a(true));
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f70646a, false, 80687, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f70646a, false, 80687, new Class[0], Void.TYPE);
                    return;
                }
                VideoRecordNewActivity.this.z.a((Object) VideoRecordNewActivity.this, (bc) x.a(false));
            }
        };
        this.ai = new ac.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70648a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f70648a, false, 80688, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f70648a, false, 80688, new Class[0], Void.TYPE);
                    return;
                }
                VideoRecordNewActivity.this.z.a((Object) VideoRecordNewActivity.this, (bc) new ae(VideoRecordNewActivity.this.l, 0));
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f70648a, false, 80689, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f70648a, false, 80689, new Class[0], Void.TYPE);
                    return;
                }
                r.a((Context) VideoRecordNewActivity.this, "filter_confirm", "shoot_page", PushConstants.PUSH_TYPE_NOTIFY, 0, VideoRecordNewActivity.this.i());
                VideoRecordNewActivity.this.z.a((Object) VideoRecordNewActivity.this, (bc) new ae(VideoRecordNewActivity.this.l, 4));
            }
        };
        this.aj = new ac.d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70650a;

            /* renamed from: c  reason: collision with root package name */
            private CircleViewPager f70652c;

            @Nullable
            public final CircleViewPager a() {
                if (PatchProxy.isSupport(new Object[0], this, f70650a, false, 80690, new Class[0], CircleViewPager.class)) {
                    return (CircleViewPager) PatchProxy.accessDispatch(new Object[0], this, f70650a, false, 80690, new Class[0], CircleViewPager.class);
                }
                if (this.f70652c == null) {
                    this.f70652c = (CircleViewPager) ((RecyclerView) VideoRecordNewActivity.this.findViewById(C0906R.id.cca)).findViewById(C0906R.id.aq6);
                }
                return this.f70652c;
            }
        };
        this.ak = new l(this.h, new com.ss.android.medialib.c.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70675a;

            @TargetApi(23)
            public final void a(int i) {
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70675a, false, 80666, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70675a, false, 80666, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.util.c.a("onNativeInitCallBack() called with: ret = [" + i2 + "]");
                if (i2 < 0) {
                    com.bytedance.ies.dmt.ui.d.a.b(VideoRecordNewActivity.this.getApplicationContext(), VideoRecordNewActivity.this.getString(C0906R.string.bfz, new Object[]{Integer.valueOf(i)})).a();
                    com.ss.android.ugc.aweme.shortvideo.d.a.a();
                    String str = "currentWidth:" + VideoRecordNewActivity.this.f4036e + "    currentHeight:" + VideoRecordNewActivity.this.f4037f + "      availableMem:";
                    try {
                        str = str + com.ss.android.ugc.aweme.utils.b.a(com.ss.android.ugc.aweme.port.in.a.f61119b) + " currentPIDMem:" + com.ss.android.ugc.aweme.utils.b.b(com.ss.android.ugc.aweme.port.in.a.f61119b.getApplicationContext()) + "hasUsedMem:" + com.ss.android.ugc.aweme.utils.b.c(com.ss.android.ugc.aweme.port.in.a.f61119b.getApplicationContext());
                    } catch (Exception unused) {
                    }
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("init failed detail: " + str));
                    n.a("aweme_sensetime_init_fail", 1, com.ss.android.ugc.aweme.app.d.c.a().a("errorCode", Integer.valueOf(i)).a("errorDesc", "").a("exception", str).b());
                    VideoRecordNewActivity.this.finish();
                    return;
                }
                n.a("aweme_sensetime_init_fail", 0, (JSONObject) null);
                VideoRecordNewActivity.this.g().c(true);
                VideoRecordNewActivity.this.g().g(true);
                MediaRecordPresenter mediaRecordPresenter = VideoRecordNewActivity.this.t;
                cd cdVar = new cd(this);
                if (PatchProxy.isSupport(new Object[]{(byte) 1, cdVar}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17699, new Class[]{Boolean.TYPE, FaceBeautyInvoker.FaceInfoCallback.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{(byte) 1, cdVar}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17699, new Class[]{Boolean.TYPE, FaceBeautyInvoker.FaceInfoCallback.class}, Void.TYPE);
                } else {
                    mediaRecordPresenter.j.registerFaceInfoUpload(true, cdVar);
                }
                try {
                    VideoRecordNewActivity.this.af.b().a((((float) VideoRecordNewActivity.this.m.k()) * 1.0f) / ((float) VideoRecordNewActivity.this.m.l()));
                } catch (Exception unused2) {
                }
                VideoRecordNewActivity.this.t.k(com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UseLargeMattingModel));
                VideoRecordNewActivity.this.t.j(!com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UseLargeGestureDetectModel));
            }

            public final void a(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70675a, false, 80667, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70675a, false, 80667, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.util.c.a("onNativeInitHardEncoderRetCallback() called with: isCPUEncode = [" + i + "]");
                com.ss.android.ugc.aweme.port.in.a.L.a(e.a.RecordUseSuccessRecordProfile, i2);
                if (VideoRecordNewActivity.this.f4034c.f67719b == 0) {
                    VideoRecordNewActivity.this.f4034c.o = i ^ 1;
                    com.ss.android.ugc.aweme.shortvideo.d.a.a(VideoRecordNewActivity.this.f4034c.o);
                }
            }
        });
        this.al = false;
        this.am = null;
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80551, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80551, new Class[0], Void.TYPE);
            return;
        }
        this.m = new CameraModule((AbsActivity) this, this.af, (CameraModule.a) new CameraModule.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70669a;

            public final void b(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70669a, false, 80656, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70669a, false, 80656, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (VideoRecordNewActivity.this.x == null || VideoRecordNewActivity.this.x.getVisibility() != 8) {
                    VideoRecordNewActivity.this.ab = true;
                    if (VideoRecordNewActivity.this.aa != null) {
                        VideoRecordNewActivity.this.d();
                    }
                    VideoRecordNewActivity.this.h.postDelayed(new bz(this), 500);
                    VideoRecordNewActivity.this.af.a((MediaRecordPresenter.a) new MediaRecordPresenter.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f70671a;

                        public final boolean as_() {
                            return true;
                        }

                        public final void a(com.ss.android.medialib.model.a aVar) {
                            if (PatchProxy.isSupport(new Object[]{aVar}, this, f70671a, false, 80663, new Class[]{com.ss.android.medialib.model.a.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{aVar}, this, f70671a, false, 80663, new Class[]{com.ss.android.medialib.model.a.class}, Void.TYPE);
                                return;
                            }
                            ai.a("VideoRecordNewActivity => OnFrameAvailable");
                            com.ss.android.ugc.aweme.shortvideo.util.b.a().c();
                            if (PatchProxy.isSupport(new Object[0], null, dh.f75749a, true, 88515, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], null, dh.f75749a, true, 88515, new Class[0], Void.TYPE);
                            } else {
                                long currentTimeMillis = System.currentTimeMillis() - dh.f75750b;
                                ai.d("open camera to first frame cost = " + currentTimeMillis);
                            }
                            com.ss.android.ugc.aweme.shortvideo.util.b.a().a("av_video_record_init");
                            VideoRecordNewActivity.this.t.a((MediaRecordPresenter.a) null);
                            if (VideoRecordNewActivity.this.ae && VideoRecordNewActivity.this.ad) {
                                VideoRecordNewActivity.this.ad = false;
                                ai.a("VideoRecordNewActivity => addFragment Open Camera Frame Optimize");
                                VideoRecordNewActivity.this.h.post(new cc(VideoRecordNewActivity.this));
                            }
                            VideoRecordNewActivity.this.n();
                        }
                    });
                }
            }

            public final void c(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70669a, false, 80659, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70669a, false, 80659, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                VideoRecordNewActivity.this.m.e();
                MutableLiveData<Boolean> c2 = ((FilterViewModel) ViewModelProviders.of((FragmentActivity) VideoRecordNewActivity.this).get(FilterViewModel.class)).c();
                ((com.ss.android.ugc.aweme.shortvideo.filter.e) VideoRecordNewActivity.this.l.c()).c(w.a(VideoRecordNewActivity.this.i.a(VideoRecordNewActivity.this.m.h())));
                if (!((Boolean) c2.getValue()).booleanValue()) {
                    ((com.ss.android.ugc.aweme.shortvideo.filter.e) VideoRecordNewActivity.this.l.c()).a(true);
                }
            }

            public final void b(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70669a, false, 80658, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f70669a, false, 80658, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (!VideoRecordNewActivity.this.g) {
                    com.ss.android.ugc.aweme.app.d.c cVar = new com.ss.android.ugc.aweme.app.d.c();
                    n.a("zoom_info_log", cVar.a("camera_preview_size", "w = " + i + "   h = " + i2).b());
                    VideoRecordNewActivity.this.f4036e = i;
                    VideoRecordNewActivity.this.f4037f = i2;
                    if (!dmt.av.video.b.n.a()) {
                        VideoRecordNewActivity.this.h();
                    }
                    VideoRecordNewActivity.this.g = true;
                }
            }

            public final void a(int i, int i2, String str) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f70669a, false, 80657, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f70669a, false, 80657, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                    return;
                }
                if (VideoRecordNewActivity.this.T) {
                    VideoRecordNewActivity videoRecordNewActivity = VideoRecordNewActivity.this;
                    if (PatchProxy.isSupport(new Object[0], videoRecordNewActivity, VideoRecordNewActivity.f4033b, false, 80552, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], videoRecordNewActivity, VideoRecordNewActivity.f4033b, false, 80552, new Class[0], Void.TYPE);
                    } else {
                        Dialog a2 = new a.C0185a(videoRecordNewActivity).a((int) C0906R.string.pc).b((int) C0906R.string.pb).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) new az(videoRecordNewActivity)).a().a();
                        if (Build.VERSION.SDK_INT >= 17) {
                            a2.setOnDismissListener(new ba(videoRecordNewActivity));
                        }
                    }
                } else {
                    af.f71095c.a(VideoRecordNewActivity.this, new ca(this), new cb(this));
                }
            }
        }, (com.ss.android.ugc.aweme.base.b.a.d<JSONObject>) new ay<JSONObject>(this));
        getLifecycle().addObserver(this.m);
    }

    private Effect x() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80614, new Class[0], Effect.class)) {
            return (Effect) PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80614, new Class[0], Effect.class);
        } else if (getIntent().getBooleanExtra("reuse_mvtheme_enter", false)) {
            return (Effect) getIntent().getParcelableExtra("first_sticker");
        } else {
            return null;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80529, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80529, new Class[0], Void.TYPE);
            return;
        }
        this.af.g().k();
        this.o.b();
        this.af.b().e();
        if (new bz(this).a()) {
            this.C.b();
        }
        this.af.a((com.ss.android.medialib.c.b) null);
        this.g = false;
        g().c(false);
        g().g(false);
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80560, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80560, new Class[0], Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.util.c.a("forceStopRecord() called");
        if (!g().f() || g().b()) {
            ax axVar = new ax();
            this.A.a((Object) this, (bc) axVar);
            this.z.a((Object) this, (bc) axVar);
        }
        return true;
    }

    public final JSONObject i() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80580, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80580, new Class[0], JSONObject.class);
        }
        com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a().a("creation_id", this.f4034c.q).a("shoot_way", j()).a("route", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        if (g().c()) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        return a2.a("is_photo", str).a("position", "shoot_page").b();
    }

    public final Point o() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80612, new Class[0], Point.class)) {
            return (Point) PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80612, new Class[0], Point.class);
        }
        Point point = new Point();
        if (!(this.x == null || this.x.getLayoutParams() == null || !(this.x.getLayoutParams() instanceof FrameLayout.LayoutParams))) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.getLayoutParams();
            point.x = layoutParams.width;
            point.y = layoutParams.height;
        }
        return point;
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80537, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.x.setVisibility(0);
        w.a();
        if (this.z != null) {
            this.z.a((Object) this, (bc) new u(this.m.m));
        }
    }

    private void p() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80523, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80523, new Class[0], Void.TYPE);
            return;
        }
        Integer valueOf = Integer.valueOf(this.f4034c.j);
        if (this.f4034c.b()) {
            i2 = this.f4034c.k / 2;
        } else {
            i2 = this.f4034c.k;
        }
        this.af = k.a(this, new dmt.av.video.b.m(true, new Pair(valueOf, Integer.valueOf(i2)), this.f4034c.l));
        this.u = com.ss.android.ugc.aweme.shortvideo.j.e.a(this.af);
        this.t = this.af.f();
        j.a(this.af.g(), getApplicationContext());
        t();
        u();
        s();
        if (this.ae) {
            this.m.b();
        }
    }

    private void r() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80542, new Class[0], Void.TYPE);
            return;
        }
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("tag_ui_fragment");
        StringBuilder sb = new StringBuilder("removeUIFragment findFragmentByTag");
        if (findFragmentByTag == null) {
            z2 = true;
        }
        sb.append(z2);
        ai.a(sb.toString());
        if (findFragmentByTag != null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.remove(findFragmentByTag);
            beginTransaction.commitNowAllowingStateLoss();
        }
        if (this.ae) {
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            if (Lists.notEmpty(fragments)) {
                List<Fragment> a2 = z.a(fragments, bo.f70828b);
                if (Lists.notEmpty(a2)) {
                    FragmentTransaction beginTransaction2 = getSupportFragmentManager().beginTransaction();
                    for (Fragment fragment : a2) {
                        String tag = fragment.getTag();
                        StringBuilder sb2 = new StringBuilder("removeUIFragment getFragments ");
                        if (TextUtils.isEmpty(tag)) {
                            tag = "";
                        }
                        sb2.append(tag);
                        ai.a(sb2.toString());
                        beginTransaction2.remove(fragment);
                    }
                    beginTransaction2.commitNowAllowingStateLoss();
                }
            }
        }
    }

    private void u() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80555, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80555, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().a((Context) this);
        if (!TextUtils.isEmpty(this.f4034c.f67723f)) {
            i2 = com.ss.android.ugc.aweme.port.in.a.i.b(this.f4034c.f67723f);
        } else {
            i2 = (int) this.f4034c.f67720c;
        }
        this.o = new CutMusicModule(this, this.f4034c.f67723f, i2, new bc(this));
        com.ss.android.ugc.aweme.shortvideo.e b2 = ej.a().b();
        if (b2 != null && b2.getDuration() > 0 && b2.getDuration() <= 60000) {
            this.o.f66616c = b2.getDuration();
        }
        if (!TextUtils.isEmpty(this.f4034c.f67723f)) {
            int i3 = this.f4034c.g;
            if (i3 > 0) {
                this.o.f66617d = i3;
            }
        }
    }

    private void v() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80570, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.util.c.a("resetAllPlayStatus() called");
        this.f4034c.l.f();
        this.f4034c.l.h();
        com.ss.android.ugc.aweme.shortvideo.d.a.a();
        for (int i2 = 0; i2 < this.f4034c.m.size(); i2++) {
            this.af.b().d();
        }
        this.f4034c.m.clear();
        this.f4034c.n = 0;
        MutableLiveData<Boolean> mutableLiveData = ((RecordViewModel) ViewModelProviders.of((FragmentActivity) this).get(RecordViewModel.class)).f77635e;
        if (mutableLiveData.getValue() != null && ((Boolean) mutableLiveData.getValue()).booleanValue()) {
            mutableLiveData.setValue(Boolean.FALSE);
        }
        if (this.o != null) {
            this.o.b();
        }
        a(-1);
        this.N = false;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80528, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80528, new Class[0], Void.TYPE);
        } else if (!isFinishing()) {
            ai.a("addFragment PlanC");
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (this.P == null) {
                this.P = a(getIntent());
                Fragment findFragmentById = supportFragmentManager.findFragmentById(C0906R.id.chu);
                if (findFragmentById instanceof ShortVideoRecordingOperationPanelFragment) {
                    ((ShortVideoRecordingOperationPanelFragment) findFragmentById).Y = this.m.o;
                }
                ai.a("addFragment commitAllowingStateLoss PlanC");
                if (this.ae) {
                    supportFragmentManager.beginTransaction().replace(C0906R.id.chu, this.P, "tag_ui_fragment").commitNowAllowingStateLoss();
                } else {
                    supportFragmentManager.beginTransaction().replace(C0906R.id.chu, this.P, "tag_ui_fragment").commitAllowingStateLoss();
                }
            }
            if (!this.ae) {
                q();
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80559, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.util.c.a("clearEdit() called");
        this.f4034c.l.h();
        com.ss.android.ugc.aweme.shortvideo.d.a.a();
        for (int i2 = 0; i2 < this.f4034c.m.size(); i2++) {
            this.af.b().d();
        }
        com.ss.android.ugc.aweme.video.b.b(new File(this.f4034c.l.g().getPath()));
        this.f4034c.m.clear();
        this.f4034c.n = 0;
        if (!(this.K.e() == null || this.f4034c.f67719b == 1)) {
            com.ss.android.ugc.aweme.video.b.e(this.K.e().extractFramesDir);
            com.ss.android.ugc.aweme.video.b.c(this.K.e().extractFramesDir);
            this.K.a();
        }
        this.N = false;
    }

    public void finish() {
        boolean z2;
        Class cls;
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80593, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29088b, com.ss.android.experiencekit.c.d.END);
        Intent intent = getIntent();
        if (PatchProxy.isSupport(new Object[]{intent}, this, f4033b, false, 80594, new Class[]{Intent.class}, Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{intent}, this, f4033b, false, 80594, new Class[]{Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (intent == null || intent.getSerializableExtra("micro_app_info") == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            Intent intent2 = getIntent();
            if (PatchProxy.isSupport(new Object[]{intent2}, this, f4033b, false, 80595, new Class[]{Intent.class}, Class.class)) {
                cls = (Class) PatchProxy.accessDispatch(new Object[]{intent2}, this, f4033b, false, 80595, new Class[]{Intent.class}, Class.class);
            } else {
                cls = (Class) intent2.getSerializableExtra("micro_app_class");
            }
            startActivity(new Intent(this, cls));
        }
        super.finish();
        if (this.z != null) {
            l();
        }
        com.ss.android.ugc.aweme.base.activity.c.b(this, 3);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80591, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80591, new Class[0], Void.TYPE);
            return;
        }
        r();
        super.onDestroy();
        w();
        if (this.P != null) {
            this.P.g();
        }
        if (this.t != null) {
            this.O = false;
            this.t.a((Runnable) null);
        }
        if (this.af != null) {
            this.af.e();
        }
        com.ss.android.ugc.aweme.port.in.a.i.f().f();
        this.P = null;
        org.greenrobot.eventbus.c.a().c(this);
        aa a2 = aa.a();
        if (PatchProxy.isSupport(new Object[0], a2, aa.f71067a, false, 80987, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, aa.f71067a, false, 80987, new Class[0], Void.TYPE);
            return;
        }
        if (a2.f71072f != null) {
            a2.f71072f.interrupt();
            a2.f71068b = null;
            a2.f71072f = null;
            a2.f71070d = null;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80590, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80590, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", true);
        ai.a("VideoRecordNewActivity => onResume start");
        if (isFinishing()) {
            com.ss.android.ugc.aweme.shortvideo.util.f.a(this);
            ExceptionMonitor.ensureNotReachHere();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", false);
            return;
        }
        super.onResume();
        this.ar = true;
        if (this.aq) {
            com.ss.android.ugc.aweme.port.in.a.J.a(this, com.ss.android.ugc.aweme.port.in.a.J.a(), this.V);
            this.aq = false;
        }
        r.a("av_memory_log", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f4034c.q).a("enter_from", this.f4034c.s).a("dalvikPss", aa.a().g).a("nativePss", aa.a().h).a("otherPss", aa.a().j).a("totalPss", aa.a().i).f34114b);
        ai.a("VideoRecordNewActivity => onResume end");
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", false);
    }

    @TargetApi(23)
    public final void d() {
        a.i<TResult> iVar;
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80549, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80549, new Class[0], Void.TYPE);
            return;
        }
        ai.a("VideoRecordNewActivity => previewCamera");
        if (new bz(this).a() && this.af.g().i()) {
            this.t.i(false);
            this.C.a(this);
            ca caVar = this.C;
            if (PatchProxy.isSupport(new Object[0], caVar, ca.f65949a, false, 74174, new Class[0], a.i.class)) {
                iVar = (a.i) PatchProxy.accessDispatch(new Object[0], caVar, ca.f65949a, false, 74174, new Class[0], a.i.class);
            } else {
                a.j jVar = new a.j();
                caVar.a(jVar, 1);
                iVar = jVar.f1091a;
            }
            iVar.a((a.g<TResult, TContinuationResult>) new a.g<Void, Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70667a;

                public final /* synthetic */ Object then(a.i iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f70667a, false, 80655, new Class[]{a.i.class}, Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f70667a, false, 80655, new Class[]{a.i.class}, Void.class);
                    }
                    VideoRecordNewActivity.this.z.a((Object) this, (bc) new com.ss.android.ugc.aweme.tools.aj());
                    return null;
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80550, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80550, new Class[0], Void.TYPE);
        } else if (!this.f4034c.a()) {
            this.af.b().a((Context) this, 5, this.j.a());
        } else {
            this.af.c().a(this.f4034c.l.e().getPath());
            this.af.c().a(this.f4034c.l.e().getPath(), (long) this.o.f66617d, this.f4034c.n);
            this.af.b().a((Context) this, 5, this.j.a());
        }
        this.t.c(com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEffectParallelFwk));
        this.af.b().b(this.x.getHolder().getSurface(), Build.DEVICE, ax.f70791b);
        ShortVideoContextViewModel g2 = g();
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, g2, ShortVideoContextViewModel.f65400a, false, 74620, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            ShortVideoContextViewModel shortVideoContextViewModel = g2;
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, shortVideoContextViewModel, ShortVideoContextViewModel.f65400a, false, 74620, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            if (g2.f65402c == null) {
                g2.f65402c = new MutableLiveData<>();
            }
            g2.f65402c.setValue(Boolean.TRUE);
        }
        this.T = true;
    }

    public final void n() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80611, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80611, new Class[0], Void.TYPE);
        } else if (!this.at) {
            this.at = true;
            com.ss.android.ugc.aweme.filter.h a2 = w.a(this.i.a(this.m.h()));
            String str2 = "";
            String str3 = "";
            Effect x2 = x();
            if (x2 != null) {
                str2 = x2.effect_id;
                str3 = x2.name;
            }
            com.ss.android.ugc.aweme.app.d.d a3 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f4034c.q).a("shoot_way", this.f4034c.r).a("draft_id", this.f4034c.v).a("filter_list", a2.f47600d).a("filter_id_list", a2.f47598b).a("enter_from", this.f4034c.s);
            if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80532, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80532, new Class[0], String.class);
            } else if (this.D == null || this.D.isEmpty()) {
                str = "";
            } else {
                Iterator<String> it2 = this.D.iterator();
                StringBuilder sb = new StringBuilder();
                while (it2.hasNext()) {
                    sb.append(it2.next());
                    if (it2.hasNext()) {
                        sb.append(",");
                    }
                }
                str = sb.toString();
            }
            com.ss.android.ugc.aweme.app.d.d a4 = a3.a("prop_id", str).a("mv_id", str2).a("mv_name", str3).a("camera_type", j.a(this.af.g().e()));
            long longExtra = getIntent().getLongExtra("extra_start_record_time", 0);
            long currentTimeMillis = System.currentTimeMillis() - longExtra;
            if (longExtra > 0 && currentTimeMillis > 0) {
                a4.a("duration", currentTimeMillis);
            }
            r.a("enter_video_shoot_page", (Map) a4.f34114b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r25 = this;
            r7 = r25
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4033b
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 80563(0x13ab3, float:1.12893E-40)
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4033b
            r3 = 0
            r4 = 80563(0x13ab3, float:1.12893E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            java.lang.String r0 = "initMediaProcess() called"
            com.ss.android.ugc.aweme.util.c.a(r0)
            dmt.av.video.b.a r0 = r7.af
            r0.d()
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4033b
            r3 = 0
            r4 = 80564(0x13ab4, float:1.12894E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0059
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4033b
            r3 = 0
            r4 = 80564(0x13ab4, float:1.12894E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0059:
            java.lang.String r0 = "initFaceBeauty() called"
            com.ss.android.ugc.aweme.util.c.a(r0)
            dmt.av.video.b.a r0 = r7.af
            r0.a((android.content.Context) r7)
            com.ss.android.ugc.aweme.shortvideo.j.e r0 = r7.u
            com.ss.android.ugc.aweme.shortvideo.j.e$a r0 = r0.f()
            com.ss.android.ugc.aweme.shortvideo.j.e$a r0 = r0.a((android.content.Context) r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ss.android.ugc.aweme.shortvideo.fh r2 = r7.f4034c
            com.ss.android.ugc.aweme.shortvideo.a.d r2 = r2.l
            java.io.File r2 = r2.g()
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.ugc.aweme.shortvideo.j.e$a r0 = r0.a((java.lang.String) r1)
            com.ss.android.ugc.aweme.shortvideo.record.CameraModule r1 = r7.m
            int r1 = r1.k()
            com.ss.android.ugc.aweme.shortvideo.j.e$a r0 = r0.a((int) r1)
            com.ss.android.ugc.aweme.shortvideo.record.CameraModule r1 = r7.m
            int r1 = r1.l()
            com.ss.android.ugc.aweme.shortvideo.j.e$a r0 = r0.b(r1)
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r7.f4034c
            boolean r1 = r1.b()
            r9 = 2
            if (r1 == 0) goto L_0x00b1
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r7.f4034c
            int r1 = r1.k
            int r1 = r1 / r9
            goto L_0x00b5
        L_0x00b1:
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r7.f4034c
            int r1 = r1.k
        L_0x00b5:
            com.ss.android.ugc.aweme.shortvideo.j.e$a r0 = r0.d(r1)
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r7.f4034c
            int r1 = r1.j
            com.ss.android.ugc.aweme.shortvideo.j.e$a r0 = r0.c(r1)
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r7.f4034c
            boolean r1 = r1.a()
            com.ss.android.ugc.aweme.shortvideo.j.e$a r0 = r0.e(r1)
            r0.a()
            dmt.av.video.b.a r0 = r7.af
            com.ss.android.ugc.aweme.shortvideo.ui.be r1 = new com.ss.android.ugc.aweme.shortvideo.ui.be
            r1.<init>(r7)
            r0.a((kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>) r1)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4033b
            r3 = 0
            r4 = 80565(0x13ab5, float:1.12896E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r10 = 3
            r11 = 1
            if (r0 == 0) goto L_0x0101
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4033b
            r3 = 0
            r4 = 80565(0x13ab5, float:1.12896E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ae
        L_0x0101:
            com.ss.android.medialib.presenter.MediaRecordPresenter r0 = r7.t
            com.ss.android.ugc.aweme.shortvideo.ui.bf r1 = new com.ss.android.ugc.aweme.shortvideo.ui.bf
            r1.<init>(r7)
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a
            r15 = 0
            r16 = 17707(0x452b, float:2.4813E-41)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.medialib.FaceBeautyInvoker$OnCherEffectParmaCallback> r3 = com.ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback.class
            r2[r8] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x013a
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a
            r15 = 0
            r16 = 17707(0x452b, float:2.4813E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.medialib.FaceBeautyInvoker$OnCherEffectParmaCallback> r2 = com.ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback.class
            r1[r8] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x013f
        L_0x013a:
            com.ss.android.medialib.FaceBeautyInvoker r0 = r0.j
            r0.registerCherEffectParamCallback(r1)
        L_0x013f:
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f4034c
            com.ss.android.ugc.aweme.shortvideo.ah r0 = r0.aw
            if (r0 == 0) goto L_0x01ae
            com.ss.android.medialib.presenter.MediaRecordPresenter r0 = r7.t
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r7.f4034c
            com.ss.android.ugc.aweme.shortvideo.ah r1 = r1.aw
            java.lang.String[] r1 = r1.getMatrix()
            com.ss.android.ugc.aweme.shortvideo.fh r2 = r7.f4034c
            com.ss.android.ugc.aweme.shortvideo.ah r2 = r2.aw
            double[] r2 = r2.getDuration()
            com.ss.android.ugc.aweme.shortvideo.fh r3 = r7.f4034c
            com.ss.android.ugc.aweme.shortvideo.ah r3 = r3.aw
            boolean[] r3 = r3.getSegUseCher()
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r12[r8] = r1
            r12[r11] = r2
            r12[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a
            r15 = 0
            r16 = 17708(0x452c, float:2.4814E-41)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r4[r8] = r5
            java.lang.Class<double[]> r5 = double[].class
            r4[r11] = r5
            java.lang.Class<boolean[]> r5 = boolean[].class
            r4[r9] = r5
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x01a9
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r12[r8] = r1
            r12[r11] = r2
            r12[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a
            r15 = 0
            r16 = 17708(0x452c, float:2.4814E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r1[r8] = r2
            java.lang.Class<double[]> r2 = double[].class
            r1[r11] = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            r1[r9] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x01ae
        L_0x01a9:
            com.ss.android.medialib.FaceBeautyInvoker r0 = r0.j
            r0.recoverCherEffect(r1, r2, r3)
        L_0x01ae:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4033b
            r3 = 0
            r4 = 80572(0x13abc, float:1.12905E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01d5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4033b
            r3 = 0
            r4 = 80572(0x13abc, float:1.12905E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x039a
        L_0x01d5:
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f4034c
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x039a
            java.lang.String r0 = "initDuet() called"
            com.ss.android.ugc.aweme.util.c.a(r0)
            r0 = 4608683618675807573(0x3ff5555555555555, double:1.3333333333333333)
            com.ss.android.ugc.aweme.shortvideo.fh r2 = r7.f4034c
            int r2 = r2.B
            double r2 = (double) r2
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r0
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f4034c
            int r0 = r0.C
            double r0 = (double) r0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x01fc
            r0 = 0
            goto L_0x01fd
        L_0x01fc:
            r0 = 1
        L_0x01fd:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = r25.g()
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r1.f65401b
            com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource r1 = r1.ad
            if (r1 == 0) goto L_0x020d
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r1 = r1.gameSticker
            if (r1 == 0) goto L_0x020d
            r1 = 1
            goto L_0x020e
        L_0x020d:
            r1 = 0
        L_0x020e:
            dmt.av.video.b.a r2 = r7.af
            dmt.av.video.b.b r12 = r2.c()
            r2 = 0
            if (r1 == 0) goto L_0x0219
            r13 = r2
            goto L_0x021e
        L_0x0219:
            com.ss.android.ugc.aweme.shortvideo.fh r3 = r7.f4034c
            java.lang.String r3 = r3.A
            r13 = r3
        L_0x021e:
            r14 = 0
            r16 = 0
            r12.a(r13, r14, r16)
            com.ss.android.ugc.aweme.shortvideo.j.e r3 = r7.u
            java.lang.Object[] r4 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.shortvideo.j.e.f68244a
            r21 = 0
            r22 = 78464(0x13280, float:1.09951E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.j.e$b> r24 = com.ss.android.ugc.aweme.shortvideo.j.e.b.class
            r18 = r4
            r19 = r3
            r23 = r5
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r4 == 0) goto L_0x025a
            java.lang.Object[] r4 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.shortvideo.j.e.f68244a
            r21 = 0
            r22 = 78464(0x13280, float:1.09951E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.j.e$b> r24 = com.ss.android.ugc.aweme.shortvideo.j.e.b.class
            r18 = r4
            r19 = r3
            r23 = r5
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            com.ss.android.ugc.aweme.shortvideo.j.e$b r3 = (com.ss.android.ugc.aweme.shortvideo.j.e.b) r3
            goto L_0x0260
        L_0x025a:
            com.ss.android.ugc.aweme.shortvideo.j.e$b r4 = new com.ss.android.ugc.aweme.shortvideo.j.e$b
            r4.<init>()
            r3 = r4
        L_0x0260:
            r3.f68257b = r7
            com.ss.android.ugc.aweme.shortvideo.fh r4 = r7.f4034c
            java.lang.String r4 = r4.z
            r3.f68258c = r4
            if (r1 == 0) goto L_0x026b
            goto L_0x026f
        L_0x026b:
            com.ss.android.ugc.aweme.shortvideo.fh r1 = r7.f4034c
            java.lang.String r2 = r1.A
        L_0x026f:
            r3.f68259d = r2
            r1 = 0
            r3.f68261f = r1
            r1 = 1042536202(0x3e23d70a, float:0.16)
            r3.g = r1
            r1 = 1058642330(0x3f19999a, float:0.6)
            r3.h = r1
            r3.f68260e = r0
            java.lang.Object[] r12 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.j.e.b.f68256a
            r15 = 0
            r16 = 78473(0x13289, float:1.09964E-40)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r3
            r17 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x02a8
            java.lang.Object[] r12 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.j.e.b.f68256a
            r15 = 0
            r16 = 78473(0x13289, float:1.09964E-40)
            java.lang.Class[] r0 = new java.lang.Class[r8]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r3
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x030e
        L_0x02a8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sdk initDuet() "
            r0.<init>(r1)
            java.lang.String[] r1 = new java.lang.String[r10]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "duetVideoPath="
            r2.<init>(r4)
            java.lang.String r4 = r3.f68258c
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1[r8] = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = " duetAudioPath="
            r2.<init>(r4)
            java.lang.String r4 = r3.f68259d
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1[r11] = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = " fitMode="
            r2.<init>(r4)
            boolean r4 = r3.f68260e
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1[r9] = r2
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ss.android.ugc.aweme.util.c.a(r0)
            com.ss.android.ugc.aweme.shortvideo.j.e r0 = com.ss.android.ugc.aweme.shortvideo.j.e.this
            com.ss.android.medialib.presenter.MediaRecordPresenter r12 = r0.f68246c
            java.lang.String r13 = r3.f68258c
            java.lang.String r14 = r3.f68259d
            float r15 = r3.f68261f
            float r0 = r3.g
            float r1 = r3.h
            boolean r2 = r3.f68260e
            r16 = r0
            r17 = r1
            r18 = r2
            r12.a((java.lang.String) r13, (java.lang.String) r14, (float) r15, (float) r16, (float) r17, (boolean) r18)
        L_0x030e:
            r7.O = r11
            com.ss.android.medialib.presenter.MediaRecordPresenter r0 = r7.t
            com.ss.android.ugc.aweme.shortvideo.ui.bh r1 = new com.ss.android.ugc.aweme.shortvideo.ui.bh
            r1.<init>(r7)
            r0.a((java.lang.Runnable) r1)
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f4034c
            com.ss.android.ugc.aweme.shortvideo.ui.f$a r1 = com.ss.android.ugc.aweme.shortvideo.ui.f.CREATOR
            com.ss.android.ugc.aweme.shortvideo.fh r2 = r7.f4034c
            int r2 = r2.B
            com.ss.android.ugc.aweme.shortvideo.fh r3 = r7.f4034c
            int r3 = r3.C
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r12[r8] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r12[r11] = r4
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.ui.f.a.f70893a
            r15 = 0
            r16 = 80200(0x13948, float:1.12384E-40)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r8] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r11] = r5
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r13 = r1
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x0379
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r12[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.ui.f.a.f70893a
            r15 = 0
            r16 = 80200(0x13948, float:1.12384E-40)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r8] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r11] = r3
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r13 = r1
            r17 = r2
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.util.List r1 = (java.util.List) r1
            goto L_0x0398
        L_0x0379:
            com.ss.android.ugc.aweme.shortvideo.ui.f r1 = new com.ss.android.ugc.aweme.shortvideo.ui.f
            r1.<init>()
            r1.f70890d = r8
            r1.f70891e = r8
            r1.f70888b = r2
            r1.f70889c = r3
            r1.f70892f = r8
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.g = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r1)
            r1 = r2
            java.util.List r1 = (java.util.List) r1
        L_0x0398:
            r0.F = r1
        L_0x039a:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4033b
            r3 = 0
            r4 = 80573(0x13abd, float:1.12907E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03c1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f4033b
            r3 = 0
            r4 = 80573(0x13abd, float:1.12907E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0587
        L_0x03c1:
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f4034c
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0587
            java.lang.String r0 = "initReaction() called"
            com.ss.android.ugc.aweme.util.c.a(r0)
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.DefaultMicrophoneState
            int r0 = r0.b(r1)
            if (r0 == r10) goto L_0x03da
            if (r0 != r9) goto L_0x03de
        L_0x03da:
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f4034c
            r0.G = r11
        L_0x03de:
            com.ss.android.ugc.aweme.shortvideo.record.a.b r0 = r7.q
            if (r0 != 0) goto L_0x03fa
            com.ss.android.ugc.aweme.shortvideo.record.a.b r6 = new com.ss.android.ugc.aweme.shortvideo.record.a.b
            com.ss.android.medialib.presenter.MediaRecordPresenter r2 = r7.t
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f4034c
            com.ss.android.ugc.aweme.shortvideo.i.i r3 = r0.E
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f4034c
            int r4 = r0.j
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f4034c
            int r5 = r0.k
            r0 = r6
            r1 = r25
            r0.<init>(r1, r2, r3, r4, r5)
            r7.q = r6
        L_0x03fa:
            dmt.av.video.b.a r0 = r7.af
            dmt.av.video.b.b r1 = r0.c()
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f4034c
            com.ss.android.ugc.aweme.shortvideo.i.i r0 = r0.E
            java.lang.String r2 = r0.wavPath
            r3 = 0
            r5 = 0
            r1.a(r2, r3, r5)
            com.ss.android.ugc.aweme.shortvideo.record.a.b r0 = r7.q
            java.lang.Object[] r12 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.record.a.b.f69060a
            r15 = 0
            r16 = 78408(0x13248, float:1.09873E-40)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0438
            java.lang.Object[] r12 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.record.a.b.f69060a
            r15 = 0
            r16 = 78408(0x13248, float:1.09873E-40)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0501
        L_0x0438:
            com.ss.android.medialib.presenter.MediaRecordPresenter r1 = r0.f69062c
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r2 = r0.f69061b
            com.ss.android.ugc.aweme.shortvideo.i.i r3 = r0.f69063d
            java.lang.String r3 = r3.videoPath
            com.ss.android.ugc.aweme.shortvideo.i.i r4 = r0.f69063d
            java.lang.String r4 = r4.wavPath
            r1.a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r4)
            r1 = 4591149604126578442(0x3fb70a3d70a3d70a, double:0.09)
            int r3 = r0.f69064e
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r1
            int r1 = (int) r3
            r2 = 4591581949690806010(0x3fb89374bc6a7efa, double:0.096)
            int r4 = r0.f69065f
            double r4 = (double) r4
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r2
            int r2 = (int) r4
            r3 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r5 = r0.f69065f
            double r5 = (double) r5
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r3
            int r3 = (int) r5
            r0.n = r1
            r0.o = r2
            r4 = 1001308990(0x3baec33e, float:0.0053333333)
            int r5 = r0.f69064e
            float r5 = (float) r5
            float r5 = r5 * r4
            int r4 = (int) r5
            com.ss.android.medialib.presenter.MediaRecordPresenter r5 = r0.f69062c
            r5.b(r2, r3, r1, r1)
            com.ss.android.medialib.presenter.MediaRecordPresenter r1 = r0.f69062c
            r2 = -1
            r1.b((int) r4, (int) r2)
            com.ss.android.medialib.f r1 = com.ss.android.medialib.f.a()
            r2 = 1059648963(0x3f28f5c3, float:0.66)
            r1.a(r2)
            int r1 = r0.h
            if (r1 != 0) goto L_0x0501
            int r1 = r0.h
            if (r1 != 0) goto L_0x0501
            com.ss.android.ugc.aweme.shortvideo.i.i r1 = r0.f69063d
            boolean r1 = r1.nonReacted
            if (r1 != 0) goto L_0x0501
            r1 = 4605561122934164029(0x3fea3d70a3d70a3d, double:0.82)
            int r3 = r0.f69064e
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r1
            int r1 = (int) r3
            r2 = 4605417007746088174(0x3fe9ba5e353f7cee, double:0.804)
            int r4 = r0.f69065f
            double r4 = (double) r4
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r2
            int r2 = (int) r4
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            double r3 = r3.nextDouble()
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 * r5
            r9 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r3 = r3 / r9
            double r12 = (double) r1
            java.lang.Double.isNaN(r12)
            double r3 = r3 * r12
            int r1 = (int) r3
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r3 = r0.f69061b
            int r3 = com.ss.android.ugc.aweme.shortvideo.fc.b(r3)
            int r1 = r1 * r3
            int r3 = r0.f69064e
            int r1 = r1 / r3
            r0.g = r1
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            double r3 = r1.nextDouble()
            double r3 = r3 * r5
            double r3 = r3 / r9
            double r1 = (double) r2
            java.lang.Double.isNaN(r1)
            double r3 = r3 * r1
            int r1 = (int) r3
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r2 = r0.f69061b
            int r2 = com.ss.android.ugc.aweme.shortvideo.fc.e(r2)
            int r1 = r1 * r2
            int r2 = r0.f69065f
            int r1 = r1 / r2
            r0.h = r1
        L_0x0501:
            com.ss.android.ugc.aweme.shortvideo.record.a.b r0 = r7.q
            java.lang.Object[] r12 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.record.a.b.f69060a
            r15 = 0
            r16 = 78407(0x13247, float:1.09872E-40)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x052b
            java.lang.Object[] r12 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.record.a.b.f69060a
            r15 = 0
            r16 = 78407(0x13247, float:1.09872E-40)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x057b
        L_0x052b:
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r1 = r0.f69061b
            android.arch.lifecycle.ViewModelProvider r1 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r1)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r2 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
            android.arch.lifecycle.ViewModel r1 = r1.get(r2)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r1
            java.lang.Object[] r12 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.f65400a
            r15 = 0
            r16 = 74623(0x1237f, float:1.04569E-40)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.arch.lifecycle.LiveData> r18 = android.arch.lifecycle.LiveData.class
            r13 = r1
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x0564
            java.lang.Object[] r12 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.f65400a
            r15 = 0
            r16 = 74623(0x1237f, float:1.04569E-40)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.arch.lifecycle.LiveData> r18 = android.arch.lifecycle.LiveData.class
            r13 = r1
            r17 = r2
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            android.arch.lifecycle.LiveData r1 = (android.arch.lifecycle.LiveData) r1
            goto L_0x0571
        L_0x0564:
            android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r2 = r1.f65403d
            if (r2 != 0) goto L_0x056f
            android.arch.lifecycle.MutableLiveData r2 = new android.arch.lifecycle.MutableLiveData
            r2.<init>()
            r1.f65403d = r2
        L_0x056f:
            android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r1.f65403d
        L_0x0571:
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r2 = r0.f69061b
            com.ss.android.ugc.aweme.shortvideo.record.a.d r3 = new com.ss.android.ugc.aweme.shortvideo.record.a.d
            r3.<init>(r0)
            r1.observe(r2, r3)
        L_0x057b:
            r7.O = r11
            com.ss.android.medialib.presenter.MediaRecordPresenter r0 = r7.t
            com.ss.android.ugc.aweme.shortvideo.ui.bi r1 = new com.ss.android.ugc.aweme.shortvideo.ui.bi
            r1.<init>(r7)
            r0.a((java.lang.Runnable) r1)
        L_0x0587:
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f4034c
            com.ss.android.ugc.aweme.shortvideo.ft r0 = r0.m
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0666
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f4034c
            com.ss.android.ugc.aweme.shortvideo.a.d r0 = r0.l
            java.io.File r0 = r0.g()
            dmt.av.video.b.a r1 = r7.af
            dmt.av.video.b.y r1 = r1.b()
            com.ss.android.ugc.aweme.shortvideo.fh r2 = r7.f4034c
            com.ss.android.ugc.aweme.shortvideo.ft r2 = r2.m
            java.lang.String r3 = r0.getPath()
            com.ss.android.ugc.aweme.shortvideo.fh r4 = r7.f4034c
            java.lang.String r4 = r4.e()
            com.ss.android.ugc.aweme.shortvideo.cutmusic.CutMusicModule r5 = r7.o
            int r5 = r5.f66617d
            int r1 = r1.a(r2, r3, r4, r5)
            if (r1 == 0) goto L_0x0666
            com.ss.android.ugc.aweme.app.d.c r2 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r3 = "error_code"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.ss.android.ugc.aweme.app.d.c r1 = r2.a((java.lang.String) r3, (java.lang.Integer) r1)
            java.lang.String r2 = "segment_count"
            com.ss.android.ugc.aweme.shortvideo.fh r3 = r7.f4034c
            com.ss.android.ugc.aweme.shortvideo.ft r3 = r3.m
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.a((java.lang.String) r2, (java.lang.Integer) r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.ss.android.ugc.aweme.shortvideo.fh r3 = r7.f4034c
            com.ss.android.ugc.aweme.shortvideo.ft r3 = r3.m
            java.util.Iterator r3 = r3.iterator()
        L_0x05e3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x05fc
            java.lang.Object r4 = r3.next()
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r4 = (com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension) r4
            int r4 = r4.getDuration()
            r2.append(r4)
            java.lang.String r4 = ","
            r2.append(r4)
            goto L_0x05e3
        L_0x05fc:
            java.lang.String r3 = "video_durations"
            int r4 = r2.length()
            int r4 = r4 - r11
            java.lang.String r2 = r2.substring(r8, r4)
            r1.a((java.lang.String) r3, (java.lang.String) r2)
            java.lang.String r2 = "path"
            java.lang.String r3 = r0.getPath()
            r1.a((java.lang.String) r2, (java.lang.String) r3)
            boolean r2 = r0.isDirectory()
            if (r2 == 0) goto L_0x0628
            java.lang.String r2 = "file_path"
            java.lang.String[] r0 = r0.list()
            java.lang.String r3 = ","
            java.lang.String r0 = com.ss.android.ugc.aweme.shortvideo.util.aj.a(r0, r3)
            r1.a((java.lang.String) r2, (java.lang.String) r0)
        L_0x0628:
            java.lang.String r0 = "enter_from"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Intent r3 = r25.getIntent()
            java.lang.String r4 = "record_from"
            int r3 = r3.getIntExtra(r4, r8)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.a((java.lang.String) r0, (java.lang.String) r2)
            java.lang.String r0 = "aweme_draft_edit_error"
            org.json.JSONObject r1 = r1.b()
            com.ss.android.ugc.aweme.base.n.a((java.lang.String) r0, (org.json.JSONObject) r1)
            r25.v()
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r7.f4034c
            int r0 = r0.f67719b
            if (r0 != r11) goto L_0x0666
            android.content.Context r0 = r25.getApplicationContext()
            r1 = 2131564571(0x7f0d181b, float:1.8754631E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
            r0.a()
            r25.finish()
        L_0x0666:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.h():void");
    }

    public final void a(@NonNull com.ss.android.ugc.aweme.base.activity.a aVar) {
        com.ss.android.ugc.aweme.base.activity.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f4033b, false, 80585, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f4033b, false, 80585, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE);
            return;
        }
        this.ao.add(aVar2);
    }

    public final void b(@NonNull com.ss.android.ugc.aweme.base.activity.a aVar) {
        com.ss.android.ugc.aweme.base.activity.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f4033b, false, 80586, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f4033b, false, 80586, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE);
            return;
        }
        this.ao.remove(aVar2);
    }

    @NonNull
    private ShortVideoRecordingOperationPanelFragment a(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f4033b, false, 80535, new Class[]{Intent.class}, ShortVideoRecordingOperationPanelFragment.class)) {
            return (ShortVideoRecordingOperationPanelFragment) PatchProxy.accessDispatch(new Object[]{intent}, this, f4033b, false, 80535, new Class[]{Intent.class}, ShortVideoRecordingOperationPanelFragment.class);
        } else if (intent == null) {
            return new PlanC(this.f4034c, getIntent(), this.af.g());
        } else {
            PlanC planC = new PlanC(this.f4034c, intent, this.af.g());
            planC.a(this, this.t);
            planC.Y = this.m.o;
            if (getIntent() != null) {
                Effect x2 = x();
                if (x2 != null) {
                    planC.W = x2;
                }
            }
            return planC;
        }
    }

    public final void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f4033b, false, 80603, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f4033b, false, 80603, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.R.a(z2);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, f4033b, false, 80616, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, f4033b, false, 80616, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
        if (PatchProxy.isSupport(new Object[]{configuration}, this, f4033b, false, 80615, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, f4033b, false, 80615, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        if (this.as != configuration.screenWidthDp) {
            this.as = configuration.screenWidthDp;
            fb.a((View) this.x, (Context) this, this.f4034c.j, this.f4034c.k);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f4033b, false, 80541, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f4033b, false, 80541, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle2.putParcelable("save_state_short_video_context", this.f4034c);
    }

    @Subscribe(b = true)
    public void receiveToast(com.ss.android.ugc.aweme.shortvideo.sticker.unlock.m mVar) {
        if (PatchProxy.isSupport(new Object[]{mVar}, this, f4033b, false, 80589, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.unlock.m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar}, this, f4033b, false, 80589, new Class[]{com.ss.android.ugc.aweme.shortvideo.sticker.unlock.m.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(mVar.f70227a, UnLockSticker.STICKER_UNLOCKED)) {
            this.aq = true;
            this.V = mVar.f70228b;
            if (this.ar && !mVar.f70230d) {
                com.ss.android.ugc.aweme.port.in.a.J.a(this, com.ss.android.ugc.aweme.port.in.a.J.a(), mVar.f70228b);
                this.aq = false;
                this.aq = false;
            }
            org.greenrobot.eventbus.c.a().f(mVar);
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4033b, false, 80526, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4033b, false, 80526, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        n.a("record", com.ss.android.ugc.aweme.app.d.c.a().a("error", String.valueOf(i2)).b());
        if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.EnableAutoRetryRecord)) {
            this.h.post(new bg(this));
        }
    }

    public final void c(boolean z2) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f4033b, false, 80577, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f4033b, false, 80577, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        CurVideoRecordModel curVideoRecordModel = (CurVideoRecordModel) ViewModelProviders.of((FragmentActivity) this).get(CurVideoRecordModel.class);
        if (!z2) {
            i2 = 2;
        }
        curVideoRecordModel.f70250a = i2;
    }

    private void a(Bundle bundle) {
        boolean z2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f4033b, false, 80530, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f4033b, false, 80530, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (bundle != null) {
            this.f4034c = (fh) bundle.getParcelable("save_state_short_video_context");
            StringBuilder sb = new StringBuilder("initData with outState,shortVideoContext is NULL:");
            if (this.f4034c == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sb.append(z2);
            ai.a(sb.toString());
        }
        if (this.f4034c == null) {
            this.f4034c = fi.a(getIntent());
            StringBuilder sb2 = new StringBuilder("initData with intent,shortVideoContext is NULL:");
            if (this.f4034c != null) {
                z3 = false;
            }
            sb2.append(z3);
            ai.a(sb2.toString());
        }
        this.M = getIntent().getStringExtra("extra_sticker_from");
        this.H = getIntent().getBooleanExtra("navigate_back_to_main", false);
        if ("challenge".equals(this.f4034c.r)) {
            FaceStickerBean.sCurPropSource = "challenge";
        } else if ("scan".equals(this.f4034c.r)) {
            FaceStickerBean.sCurPropSource = "qr_code";
        } else if ("prop".equals(this.f4034c.r)) {
            FaceStickerBean.sCurPropSource = "homepage_prop_maker";
        }
        ej.a().f67531d = this.f4034c.r;
        com.ss.android.ugc.aweme.shortvideo.d.a.a(this.f4034c.q);
        ShortVideoContextViewModel g2 = g();
        g2.f65401b = this.f4034c;
        g2.a(this.f4034c.N);
        this.L = getIntent().getBooleanExtra("sticker_pannel_show", false);
        this.D = getIntent().getStringArrayListExtra("reuse_sticker_ids");
        this.E = (Effect) getIntent().getParcelableExtra("first_sticker");
        this.F = getIntent().getSerializableExtra("sticker_music");
        if (com.ss.android.g.a.a()) {
            boolean booleanExtra = getIntent().getBooleanExtra("is_star_atlas", false);
            this.f4034c.ah = com.ss.android.ugc.aweme.port.in.a.n.a(this.f4034c.ah, booleanExtra);
        } else {
            long longExtra = getIntent().getLongExtra("star_atlas_id", 0);
            if (longExtra != 0) {
                this.f4034c.ah = com.ss.android.ugc.aweme.port.in.a.n.a(this.f4034c.ah, longExtra);
            }
        }
        String stringExtra = getIntent().getStringExtra("music_origin");
        if (stringExtra != null) {
            this.f4034c.i = stringExtra;
        }
        this.ae = com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.OpenCameraFrameOptimize);
    }

    public final void b(int i2) {
        boolean z2;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4033b, false, 80567, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4033b, false, 80567, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.s != null && this.k != null && this.k.g != null) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a aVar = this.s;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, aVar, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a.f67296a, false, 77007, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a aVar2 = aVar;
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, aVar2, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a.f67296a, false, 77007, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else {
                if (aVar.f67299d) {
                    if (i3 - aVar.g < -10) {
                        aVar.a(i3);
                        aVar.g = i3;
                    } else if (!StringUtils.isEmpty(aVar.f67297b) && (aVar.g == -1 || i3 - aVar.g > 300)) {
                        aVar.g = i3;
                        z2 = true;
                    }
                }
                z2 = false;
            }
            if (z2) {
                FaceStickerBean faceStickerBean = this.k.g;
                if (faceStickerBean != null) {
                    ExtraParams extraParams = (ExtraParams) com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson().fromJson(faceStickerBean.getExtra(), ExtraParams.class);
                    if (extraParams != null && extraParams.isUrlInteractionStickerValid()) {
                        if (PatchProxy.isSupport(new Object[]{extraParams}, this, f4033b, false, 80568, new Class[]{ExtraParams.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{extraParams}, this, f4033b, false, 80568, new Class[]{ExtraParams.class}, Void.TYPE);
                        } else if ((extraParams.getInteractionIcon() == null || !extraParams.getInteractionIcon().startsWith("http")) && !CollectionUtils.isEmpty(this.X)) {
                            extraParams.setInteractionIcon(this.X.get(0) + extraParams.getInteractionIcon());
                        }
                        this.s.f67298c = String.valueOf(faceStickerBean.getStickerId());
                        this.s.a(i3, extraParams);
                    }
                }
            }
        }
    }

    public void onNewIntent(Intent intent) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{intent}, this, f4033b, false, 80521, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f4033b, false, 80521, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        super.onNewIntent(intent);
        ai.a("VideoRecordNewActivity onNewIntent");
        if (this.f4034c == null) {
            ai.a("close record page because of null shortVideoContext instance when invoking onNewIntent method");
            finish();
            return;
        }
        w();
        boolean booleanExtra = intent.getBooleanExtra("recreate_record_and_clear", false);
        this.H = getIntent().getBooleanExtra("navigate_back_to_main", false);
        this.L = intent.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enter_record_from_other_platform", false);
        if (booleanExtra) {
            ai.a("VideoRecordNewActivity isClear");
            setIntent(intent);
            if (getIntent().getIntExtra("translation_type", 0) == 3) {
                com.ss.android.ugc.aweme.base.activity.c.a(this, 3);
            }
            if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80533, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80533, new Class[0], Void.TYPE);
            } else {
                this.f4035d = 1.0d;
                e();
                com.ss.android.vesdk.ai.a();
                if (this.k != null) {
                    this.k.e(false);
                    this.k.d();
                }
                this.o.b();
            }
            w.a();
            a((Bundle) null);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            this.P = a(intent);
            supportFragmentManager.beginTransaction().replace(C0906R.id.chu, this.P).commit();
        } else if (this.f4034c == null) {
            a((Bundle) null);
        }
        fh fhVar = this.f4034c;
        if (!booleanExtra2 && this.f4034c.am == null) {
            z2 = false;
        }
        fhVar.an = z2;
        if (this.L && this.k != null) {
            this.k.c();
        }
    }

    public final void b(boolean z2) {
        String str;
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f4033b, false, 80574, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f4033b, false, 80574, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!this.B) {
            com.bytedance.ies.dmt.ui.d.a.b(getApplicationContext(), (int) C0906R.string.q4).a();
        } else {
            this.f4034c.p = z2;
            this.u.b(z2);
            if (z2) {
                float d2 = com.ss.android.ugc.aweme.port.in.a.L.d(e.a.UlikeSmoothDefaultValue);
                if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UlikeBeautyDownloadEnable)) {
                    float a2 = com.ss.android.ugc.aweme.shortvideo.c.b.a(5, PushConstants.PUSH_TYPE_NOTIFY);
                    if (a2 != -1.0f) {
                        this.u.a(a2);
                    }
                    float a3 = com.ss.android.ugc.aweme.shortvideo.c.b.a(0, PushConstants.PUSH_TYPE_NOTIFY);
                    if (a3 != -1.0f) {
                        d2 = a3;
                    }
                }
                if (((com.ss.android.ugc.aweme.shortvideo.filter.e) this.l.c()).e().f47602f == 0) {
                    f2 = 0.35f;
                } else {
                    f2 = 0.0f;
                }
                if (com.ss.android.g.a.b()) {
                    f2 = 0.0f;
                }
                this.u.a(d2, f2);
            }
            ((com.ss.android.ugc.aweme.shortvideo.filter.e) this.l.c()).d(w.a(this.i.a(this.m.h())));
            com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
            MobClick obtain = MobClick.obtain();
            if (z2) {
                str = "prettify_on";
            } else {
                str = "prettify_off";
            }
            aVar.onEvent(obtain.setEventName(str).setLabelName("shoot_page").setJsonObject(i()));
        }
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f4033b, false, 80571, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f4033b, false, 80571, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        long j3 = this.f4034c.n;
        if (j2 > 0) {
            j3 += TimeSpeedModelExtension.calculateRealTime(j2, this.f4035d);
        }
        com.ss.android.ugc.aweme.tools.ai a2 = com.ss.android.ugc.aweme.tools.ai.a(this.f4034c.m, j3);
        if (this.z != null) {
            this.z.a((Object) this, (bc) a2);
        }
        a2.a();
    }

    @TargetApi(23)
    @MeasureFunction
    public void onCreate(Bundle bundle) {
        int i2;
        boolean z2;
        boolean z3;
        bd bdVar;
        bh bhVar;
        s sVar;
        boolean z4;
        boolean z5;
        byte b2;
        byte b3;
        boolean z6;
        LiveData<com.ss.android.ugc.aweme.w.b.a<CategoryPageModel>> liveData;
        LiveData<com.ss.android.ugc.aweme.w.b.a<CategoryPageModel>> liveData2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f4033b, false, 80522, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f4033b, false, 80522, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", true);
        a(bundle);
        if (dmt.av.video.b.n.a()) {
            p();
        }
        com.ss.android.ugc.aweme.utils.af.a(getIntent().getSerializableExtra("challenge"));
        ai.a("VideoRecordNewActivity => onCreate start");
        ej.a().g = false;
        com.ss.android.ugc.aweme.shortvideo.util.b.a().c();
        w.a();
        com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a().a((Context) this);
        int i3 = 4;
        if (PatchProxy.isSupport(new Object[]{this}, null, UlikeBeautyPlatform.f43796a, true, 39018, new Class[]{FragmentActivity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, UlikeBeautyPlatform.f43796a, true, 39018, new Class[]{FragmentActivity.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(this, PushConstants.INTENT_ACTIVITY_NAME);
            if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UlikeBeautyDownloadEnable)) {
                InfoStickerViewModel a2 = InfoStickerModule.a((FragmentActivity) this);
                Intrinsics.checkExpressionValueIsNotNull(a2, "InfoStickerModule.obtainViewModel(activity)");
                if (PatchProxy.isSupport(new Object[]{"beautify", "all", 75, 0, 0, ""}, a2, InfoStickerViewModel.f69782a, false, 79386, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, LiveData.class)) {
                    liveData = (LiveData) PatchProxy.accessDispatch(new Object[]{"beautify", "all", 75, 0, 0, ""}, a2, InfoStickerViewModel.f69782a, false, 79386, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, LiveData.class);
                } else {
                    if (a2.f69786e == null || ((com.ss.android.ugc.aweme.w.b.a) a2.f69786e.getValue()).f76550c == a.C0799a.ERROR) {
                        InfoStickerRepository infoStickerRepository = a2.f69783b;
                        if (PatchProxy.isSupport(new Object[]{"beautify", "all", 75, 0, 0, ""}, infoStickerRepository, InfoStickerRepository.f69728a, false, 79317, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, LiveData.class)) {
                            liveData2 = (LiveData) PatchProxy.accessDispatch(new Object[]{"beautify", "all", 75, 0, 0, ""}, infoStickerRepository, InfoStickerRepository.f69728a, false, 79317, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, LiveData.class);
                        } else {
                            MutableLiveData mutableLiveData = new MutableLiveData();
                            mutableLiveData.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.LOADING, null));
                            infoStickerRepository.f69729b.a("beautify", "all", 75, 0, 0, "", new com.ss.android.ugc.effectmanager.effect.b.f(mutableLiveData) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f69761a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ MutableLiveData f69762b;

                                public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f69761a, false, 79349, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f69761a, false, 79349, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                                        return;
                                    }
                                    this.f69762b.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.ERROR, null));
                                }

                                public final void a(CategoryPageModel categoryPageModel) {
                                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                                    if (PatchProxy.isSupport(new Object[]{categoryPageModel2}, this, f69761a, false, 79348, new Class[]{CategoryPageModel.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{categoryPageModel2}, this, f69761a, false, 79348, new Class[]{CategoryPageModel.class}, Void.TYPE);
                                        return;
                                    }
                                    this.f69762b.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.SUCCESS, categoryPageModel2));
                                }

                                {
                                    this.f69762b = r2;
                                }
                            });
                            liveData2 = mutableLiveData;
                        }
                        a2.f69786e = liveData2;
                    }
                    liveData = a2.f69786e;
                }
                liveData.observe(this, new UlikeBeautyPlatform.a(this, a2));
            }
        }
        super.onCreate(bundle);
        if (getIntent().getIntExtra("translation_type", 0) == 3) {
            com.ss.android.ugc.aweme.base.activity.c.a(this, 3);
        }
        getWindow().addFlags(SearchJediMixFeedAdapter.f42517f);
        setContentView((int) C0906R.layout.ep);
        if (getResources().getConfiguration() != null) {
            i2 = getResources().getConfiguration().screenWidthDp;
        } else {
            i2 = 0;
        }
        this.as = i2;
        if (PatchProxy.isSupport(new Object[]{this}, null, dmt.av.video.b.i.f82936a, true, 92222, new Class[]{Activity.class}, Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{this}, null, dmt.av.video.b.i.f82936a, true, 92222, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
        } else {
            if (PatchProxy.isSupport(new Object[]{this}, null, dmt.av.video.b.j.f82937a, true, 92223, new Class[]{Activity.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{this}, null, dmt.av.video.b.j.f82937a, true, 92223, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
            } else {
                Intrinsics.checkParameterIsNotNull(this, PushConstants.INTENT_ACTIVITY_NAME);
                if (!com.ss.android.ugc.aweme.video.b.h()) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.c1x).a();
                    finish();
                } else {
                    if (com.ss.android.ugc.aweme.video.b.i() < 20971520) {
                        if (PatchProxy.isSupport(new Object[0], null, dmt.av.video.b.j.f82937a, true, 92224, new Class[0], Boolean.TYPE)) {
                            z6 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, dmt.av.video.b.j.f82937a, true, 92224, new Class[0], Boolean.TYPE)).booleanValue();
                        } else {
                            long i4 = 36700160 - com.ss.android.ugc.aweme.video.b.i();
                            if (i4 > 0) {
                                z6 = com.ss.android.ugc.aweme.port.in.a.f61121d.a(i4);
                            } else {
                                z6 = true;
                            }
                        }
                        if (!z6) {
                            com.bytedance.ies.dmt.ui.d.a.b(getApplicationContext(), (int) C0906R.string.a63).a();
                            finish();
                        }
                    }
                    z2 = true;
                }
                z2 = false;
            }
        }
        if (!z2) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", false);
            return;
        }
        com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29088b, com.ss.android.experiencekit.c.d.BEGIN);
        com.ss.android.vesdk.ai.a();
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80604, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80604, new Class[0], Void.TYPE);
        } else {
            if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.EnableSdkLog)) {
                b2 = 15;
            } else {
                b2 = 7;
            }
            if (!TextUtils.isEmpty(null)) {
                com.ss.android.vesdk.y.f78139a += null + "-";
            }
            com.ss.android.vesdk.y.f78140b = b2;
            if (b2 == 1) {
                b3 = 1;
            } else if (b2 == 3) {
                b3 = 2;
            } else if (b2 == 7) {
                b3 = 4;
            } else if (b2 == 15) {
                b3 = 8;
            } else if (b2 != 31) {
                b3 = 0;
            } else {
                b3 = 16;
            }
            TELogcat.setLogLevel(b3);
            if (b2 == 1) {
                i3 = 6;
            } else if (b2 == 3) {
                i3 = 5;
            } else if (b2 != 7) {
                if (b2 == 15) {
                    i3 = 3;
                } else if (b2 != 31) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
            }
            VideoSdkCore.setLogLevel(i3);
        }
        if (PatchProxy.isSupport(new Object[0], null, az.f65760a, true, 74062, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, az.f65760a, true, 74062, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, az.f65760a, true, 74060, new Class[0], Boolean.TYPE)) {
                z5 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, az.f65760a, true, 74060, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z5 = com.ss.android.ugc.aweme.port.in.a.o.a("key_first_use_camera", true);
            }
            if (z5) {
                if (PatchProxy.isSupport(new Object[0], null, az.f65760a, true, 74061, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, az.f65760a, true, 74061, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.port.in.a.o.b("key_first_use_camera", false);
                }
                if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.RearCamera)) {
                    com.ss.android.ugc.aweme.port.in.a.L.a(e.a.CameraPosition, 0);
                } else {
                    com.ss.android.ugc.aweme.port.in.a.L.a(e.a.CameraPosition, 1);
                }
            }
        }
        this.v = (FrameLayout) findViewById(C0906R.id.chu);
        aa.a().a(this, this.v);
        this.w = (ScreenSizeAspectFrameLayout) findViewById(C0906R.id.ba5);
        this.x = (SurfaceView) findViewById(C0906R.id.cxe);
        if (!com.ss.android.ugc.aweme.i18n.c.a()) {
            if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.EnableOpenGl3) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            VideoSdkCore.enableGLES3(z4);
        }
        if (!dmt.av.video.b.n.a()) {
            p();
        }
        if (new bz(this).a()) {
            this.C = new ca(this.af.g());
            this.af.g().c(0);
        }
        dmt.av.video.b.a aVar = this.af;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f4033b, false, 80531, new Class[]{dmt.av.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f4033b, false, 80531, new Class[]{dmt.av.video.b.a.class}, Void.TYPE);
        } else {
            aVar.getClass();
            if (PatchProxy.isSupport(new Object[]{aVar}, null, bn.f70825a, true, 80637, new Class[]{dmt.av.video.b.a.class}, s.class)) {
                sVar = (s) PatchProxy.accessDispatch(new Object[]{aVar}, null, bn.f70825a, true, 80637, new Class[]{dmt.av.video.b.a.class}, s.class);
            } else {
                sVar = new bn(aVar);
            }
            this.K = new com.ss.android.ugc.aweme.tools.extract.h(sVar);
            if (this.f4034c != null) {
                this.K.a(this.f4034c.Y);
            }
            this.K.d();
        }
        dmt.av.video.b.a aVar2 = this.af;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f4033b, false, 80606, new Class[]{dmt.av.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f4033b, false, 80606, new Class[]{dmt.av.video.b.a.class}, Void.TYPE);
        } else {
            this.ap = new aj(this, aVar2.a());
            this.ap.b();
        }
        this.w.setAdjustEnable(!this.f4034c.b());
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80525, new Class[0], Void.TYPE);
        } else if (fc.a()) {
            if (ToolUtils.isFlyme()) {
                StatusBarUtils.setTranslucent(this);
            } else {
                StatusBarUtils.setTransparent(this);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
            getWindow().getDecorView().setBackgroundColor(-16777216);
            this.W = getIntent().getIntExtra("extra_av_navigation_bar_height", fc.d(this));
            fb.a(this.x, this, this.f4034c.j, this.f4034c.k, this.W);
            new cv(this, this.W).a(new av(this));
        } else {
            fb.a((View) this.x, this.f4034c.j, this.f4034c.k);
        }
        this.x.getHolder().addCallback(new SurfaceHolder.Callback() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70634a;

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, f70634a, false, 80645, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, f70634a, false, 80645, new Class[]{SurfaceHolder.class}, Void.TYPE);
                    return;
                }
                ai.a("VideoRecordNewActivity => surfaceCreated");
                com.ss.android.ugc.aweme.app.d.c cVar = new com.ss.android.ugc.aweme.app.d.c();
                n.a("zoom_info_log", cVar.a("camera_surface_view_size", "w = " + VideoRecordNewActivity.this.x.getWidth() + "   h = " + VideoRecordNewActivity.this.x.getHeight()).b());
                VideoRecordNewActivity.this.af.a(VideoRecordNewActivity.this.ak);
                if (dmt.av.video.b.n.a()) {
                    VideoRecordNewActivity.this.h();
                }
                VideoRecordNewActivity.this.af.b().a(surfaceHolder.getSurface(), Build.DEVICE, bu.f70840b);
                VideoRecordNewActivity.this.aa = surfaceHolder;
                if (!VideoRecordNewActivity.this.ae || !VideoRecordNewActivity.this.ac) {
                    VideoRecordNewActivity.this.m.b();
                } else {
                    VideoRecordNewActivity.this.ac = false;
                    if (VideoRecordNewActivity.this.ab) {
                        VideoRecordNewActivity.this.d();
                    }
                }
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (PatchProxy.isSupport(new Object[]{surfaceHolder}, this, f70634a, false, 80647, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceHolder}, this, f70634a, false, 80647, new Class[]{SurfaceHolder.class}, Void.TYPE);
                    return;
                }
                CameraModule cameraModule = VideoRecordNewActivity.this.m;
                if (PatchProxy.isSupport(new Object[0], cameraModule, CameraModule.f3959a, false, 78357, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], cameraModule, CameraModule.f3959a, false, 78357, new Class[0], Void.TYPE);
                } else {
                    cameraModule.b((Handler) null);
                }
                VideoRecordNewActivity.this.f();
                if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoStopPlayOpt)) {
                    ThreadPlus.submitRunnable(new bv(this));
                    return;
                }
                VideoRecordNewActivity.this.af.b().b(bw.f70844b);
                VideoRecordNewActivity.this.c();
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                if (PatchProxy.isSupport(new Object[]{surfaceHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70634a, false, 80646, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70634a, false, 80646, new Class[]{SurfaceHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                ai.a("VideoRecordNewActivity => surfaceChanged");
                if (fc.a()) {
                    VideoRecordNewActivity.this.af.b().a(surfaceHolder.getSurface());
                }
            }
        });
        if (!com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SplitFilterBeauty) || com.ss.android.g.a.b()) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.S = z3;
        this.G = !com.ss.android.g.a.b();
        if (PatchProxy.isSupport(new Object[0], this, f4033b, false, 80536, new Class[0], bd.class)) {
            bdVar = (bd) PatchProxy.accessDispatch(new Object[0], this, f4033b, false, 80536, new Class[0], bd.class);
        } else {
            cb cbVar = new cb(this, this.C);
            be a3 = new be().a((bh) new fz(this, this.af)).a((bh) new gd(this, this.af.g())).a((bh) new gg(this, this.af)).a((bh) new ev(this)).a((bh) new bb(this, this.af)).a((bh) new fu(this)).a((bh) new bo(this)).a((bh) new bt(this)).a((bh) new com.ss.android.ugc.aweme.shortvideo.ae(this, this.af)).a((bh) new com.ss.android.ugc.aweme.shortvideo.u(this, this.af)).a((bh) new com.ss.android.ugc.aweme.shortvideo.ai(this)).a((bh) new fy(this, this.af)).a((bh) new aw(this)).a((bh) new com.ss.android.ugc.aweme.shortvideo.m(this)).a((bh) new ag(this)).a((bh) new gm(this));
            if (PatchProxy.isSupport(new Object[0], cbVar, cb.f65966a, false, 74185, new Class[0], bh.class)) {
                bhVar = (bh) PatchProxy.accessDispatch(new Object[0], cbVar, cb.f65966a, false, 74185, new Class[0], bh.class);
            } else {
                bhVar = new bh() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f65969a;

                    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
                        Type type2 = type;
                        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65969a, false, 74187, new Class[]{bd.class, Type.class}, bg.class)) {
                            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65969a, false, 74187, new Class[]{bd.class, Type.class}, bg.class);
                        } else if (type2 != com.ss.android.ugc.aweme.tools.aw.class) {
                            return null;
                        } else {
                            return new cc(this);
                        }
                    }
                };
            }
            bdVar = a3.a(bhVar).a((bh) new fe(this)).a((bh) new eg(this, this.af.g())).a((bh) new fv(this)).a(com.ss.android.ugc.aweme.g.a.a()).a(new PrintWriter(new LogWriter("VideoRecordNewActivity"))).a();
        }
        this.A = bdVar;
        if (!this.ae) {
            ai.a("VideoRecordNewActivity addFragment not Open Camera Frame Optimize");
            b();
        }
        com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29088b, com.ss.android.experiencekit.c.d.END);
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f4033b, false, 80524, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f4033b, false, 80524, new Class[]{Bundle.class}, Void.TYPE);
        } else {
            if (bundle == null && this.f4034c.f67719b != 1 && "direct_shoot".equals(j())) {
                r.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("direct_shoot").setJsonObject(new t().a("record_mode", "direct").a("group_id", av.INSTANCE.getVideoId()).a()));
            }
            if ("push".equals(this.f4034c.r)) {
                r.a("shoot", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f4034c.q).a("shoot_way", this.f4034c.r).a("enter_from", this.f4034c.r).a("enter_method", "").a("prop_id", this.f4034c.L).f34114b);
            }
        }
        com.ss.android.ugc.aweme.port.in.a.f61121d.a("SHOOT");
        new ToolSafeHandler(this).post(new au(this));
        getLifecycle().addObserver(AudioFocusManager.a(this));
        if (this.ae) {
            this.Z = (FrameLayout) findViewById(C0906R.id.b8u);
            FrameLayout frameLayout = this.Z;
            if (PatchProxy.isSupport(new Object[]{this, frameLayout}, null, b.f70796a, true, 80129, new Class[]{Context.class, ViewGroup.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this, frameLayout}, null, b.f70796a, true, 80129, new Class[]{Context.class, ViewGroup.class}, Void.TYPE);
            } else {
                if (PatchProxy.isSupport(new Object[]{this, frameLayout}, null, c.f70851a, true, 80131, new Class[]{Context.class, ViewGroup.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{this, frameLayout}, null, c.f70851a, true, 80131, new Class[]{Context.class, ViewGroup.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(this, "context");
                    Intrinsics.checkParameterIsNotNull(frameLayout, "parent");
                    new AsyncLayoutInflater(this).inflate(C0906R.layout.gd, frameLayout, new CameraOptimize__CamereOptimizeKt$addPlaceHolderView$1(this, frameLayout));
                }
            }
        }
        r();
        if (this.ae) {
            q();
        }
        com.ss.android.ugc.aweme.shortvideo.edit.s.a(true);
        ai.a("VideoRecordNewActivity => onCreate end");
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", false);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), keyEvent}, this, f4033b, false, 80582, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), keyEvent}, this, f4033b, false, 80582, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        for (com.ss.android.ugc.aweme.base.activity.a a2 : this.ao) {
            if (a2.a(i2, keyEvent)) {
                return true;
            }
        }
        if (i2 != 4 || this.z == null) {
            switch (i2) {
                case 24:
                case 25:
                    if (g().c() && (this.I == null || !this.I.b())) {
                        this.A.a((Object) this, (bc) new aq());
                        return true;
                    }
            }
            return super.onKeyDown(i2, keyEvent);
        } else if (!g().f()) {
            return true;
        } else {
            Boolean bool = (Boolean) ((RecordViewModel) ViewModelProviders.of((FragmentActivity) this).get(RecordViewModel.class)).f77635e.getValue();
            if (bool != null && bool.booleanValue()) {
                ((RecordViewModel) ViewModelProviders.of((FragmentActivity) this).get(RecordViewModel.class)).f77635e.setValue(Boolean.FALSE);
                this.o.b();
                this.z.a((Object) this, (bc) new ae(this.o, 4));
                return true;
            } else if (this.P != null && this.P.o()) {
                return true;
            } else {
                this.z.a((Object) this, (bc) new com.ss.android.ugc.aweme.tools.j("back_key"));
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, int i3) {
        this.af.c().a(this.f4034c.f67723f, (long) i2, this.f4034c.n);
        if (i2 != this.f4034c.g) {
            this.z.a((Object) this, (bc) new com.ss.android.ugc.aweme.tools.az(this.f4034c.V, true));
            this.A.a((Object) this, (bc) new com.ss.android.ugc.aweme.tools.az(this.f4034c.V, true));
        }
        this.f4034c.g = i2;
        this.f4034c.f67720c = (long) i3;
        com.ss.android.ugc.aweme.shortvideo.d.a.a(this.f4034c.f67723f, ej.a().b(), i2);
        ((RecordViewModel) ViewModelProviders.of((FragmentActivity) this).get(RecordViewModel.class)).f77635e.setValue(Boolean.FALSE);
        this.z.a((Object) this, (bc) new com.ss.android.ugc.aweme.tools.ac(this.f4034c.f67720c));
        this.z.a((Object) this, (bc) new ae(this.o, 4));
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = i2;
        int i5 = i3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f4033b, false, 80587, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f4033b, false, 80587, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            StickerModule stickerModule = this.k;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, stickerModule, StickerModule.f3976a, false, 78743, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
                StickerModule stickerModule2 = stickerModule;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, stickerModule2, StickerModule.f3976a, false, 78743, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            } else if (stickerModule.h != null) {
                EffectStickerViewImpl effectStickerViewImpl = stickerModule.h;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, effectStickerViewImpl, EffectStickerViewImpl.f3994a, false, 79132, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
                    EffectStickerViewImpl effectStickerViewImpl2 = effectStickerViewImpl;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, effectStickerViewImpl2, EffectStickerViewImpl.f3994a, false, 79132, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
                } else if (effectStickerViewImpl.f3998e != null) {
                    PixaloopARPresenter pixaloopARPresenter = effectStickerViewImpl.f3998e;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, pixaloopARPresenter, PixaloopARPresenter.f3988a, false, 78873, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
                        PixaloopARPresenter pixaloopARPresenter2 = pixaloopARPresenter;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, pixaloopARPresenter2, PixaloopARPresenter.f3988a, false, 78873, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
                    } else if (i4 == com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.a() && intent2 != null && i5 == -1) {
                        ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("key_choose_media_data");
                        Intrinsics.checkExpressionValueIsNotNull(parcelableArrayListExtra, "selectMediaList");
                        if (!parcelableArrayListExtra.isEmpty()) {
                            com.ss.android.ugc.aweme.music.b.a.a aVar = (com.ss.android.ugc.aweme.music.b.a.a) parcelableArrayListExtra.get(0);
                            Intrinsics.checkExpressionValueIsNotNull(aVar, "mediaModel");
                            String str = aVar.f56315e;
                            pixaloopARPresenter.a(str);
                            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar = pixaloopARPresenter.f3990c;
                            if (cVar != null) {
                                cVar.d();
                            }
                            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar2 = pixaloopARPresenter.f3990c;
                            if (cVar2 != null) {
                                if (PatchProxy.isSupport(new Object[]{str}, cVar2, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69427a, false, 78988, new Class[]{String.class}, Void.TYPE)) {
                                    com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c cVar3 = cVar2;
                                    PatchProxy.accessDispatch(new Object[]{str}, cVar3, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69427a, false, 78988, new Class[]{String.class}, Void.TYPE);
                                } else {
                                    PixaloopMattingAdapter pixaloopMattingAdapter = cVar2.f69429b;
                                    if (pixaloopMattingAdapter == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    pixaloopMattingAdapter.a(str);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (com.ss.android.ugc.aweme.base.activity.b a2 : this.an) {
            if (a2.a(i4, i5, intent2)) {
                return;
            }
        }
        super.onActivityResult(i2, i3, intent);
        if (i4 == 1002 && i5 == -1) {
            if (!(intent2 == null || intent.getExtras() == null)) {
                Intent intent3 = new Intent();
                intent3.setClass(this, com.ss.android.ugc.aweme.port.in.a.f61121d.b());
                intent3.addFlags(67108864);
                intent3.putExtras(intent.getExtras());
                startActivity(intent3);
            }
            finish();
        }
    }

    public final void a(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{1, -1, intent2}, this, f4033b, false, 80588, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{1, -1, intent2}, this, f4033b, false, 80588, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        onActivityResult(1, -1, intent2);
    }
}
