package com.ss.android.ugc.aweme.shortvideo.edit;

import a.i;
import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.a.b;
import com.bytedance.ies.dmt.ui.b.a;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ttve.model.MVInfoBean;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.l;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.VEEffectHelper;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import com.ss.android.ugc.aweme.shortvideo.edit.a.c;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.TextStickerCompileResult;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout;
import com.ss.android.ugc.aweme.shortvideo.edit.s;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.helper.MusicDragHelper;
import com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerModule;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.n;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.g;
import com.ss.android.ugc.aweme.shortvideo.upload.a.a;
import com.ss.android.ugc.aweme.shortvideo.upload.a.c;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.shortvideo.util.aa;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PoiStruct;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.h;
import com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.a;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o;
import com.ss.android.ugc.aweme.u.aj;
import com.ss.android.ugc.aweme.u.au;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.EditPreviewViewModel;
import com.ss.android.ugc.gamora.editor.EditToolbarViewModel;
import com.ss.android.ugc.gamora.editor.EditViewModel;
import com.ss.android.ugc.gamora.editor.d;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.ss.android.vesdk.p;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEVideoPublishEditFragment;
import dmt.av.video.VEVideoPublishEditViewModel;
import dmt.av.video.j;
import dmt.av.video.t;
import dmt.av.video.v;
import dmt.av.video.w;
import dmt.av.video.y;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class VEVideoPublishEditActivity extends AmeActivity implements e, VEChooseVideoCoverFragment.a, s.a, g, a.C0031a, VEEditorAutoStartStopArbiter.a, VEVideoPublishEditFragment.a {
    public static ChangeQuickRedirect h;
    c A;
    protected VolumeHelper B;
    protected VEEffectHelper C;
    protected MusicDragHelper D;
    protected b E;
    protected FrameLayout F;
    protected FrameLayout G;
    public h H;
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a I;
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b J;
    public ce K;
    protected int L = 0;
    protected boolean M = false;
    protected EditPreviewViewModel N;
    protected EditViewModel O;
    protected com.ss.android.ugc.gamora.editor.c P;
    protected d Q;
    protected com.ss.android.ugc.gamora.editor.a R;
    protected EditToolbarViewModel S;
    protected Handler T = new ToolSafeHandler(this);
    com.ss.android.ugc.aweme.shortvideo.view.c U = null;
    private boolean V;
    private List<com.ss.android.ugc.aweme.base.activity.a> W = new ArrayList();
    private boolean X;
    private boolean Y = false;
    private Runnable Z = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66897a;

        /* renamed from: c  reason: collision with root package name */
        private long f66899c = -1;

        /* renamed from: d  reason: collision with root package name */
        private Runnable f66900d = new bw(this);

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a() {
            VEVideoPublishEditActivity.this.F.requestLayout();
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f66897a, false, 76530, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66897a, false, 76530, new Class[0], Void.TYPE);
                return;
            }
            if (this.f66900d != null) {
                this.f66900d.run();
                this.f66900d = null;
            }
            VEVideoPublishEditActivity.this.T.postDelayed(this, 16);
            p a2 = VEVideoPublishEditActivity.this.a();
            if (VEVideoPublishEditActivity.this.H != null && a2 != null && VEVideoPublishEditActivity.this.H.e()) {
                long u = (long) VEVideoPublishEditActivity.this.a().u();
                if (u != this.f66899c) {
                    this.f66899c = u;
                    h hVar = VEVideoPublishEditActivity.this.H;
                    if (PatchProxy.isSupport(new Object[]{new Long(u)}, hVar, h.f74197b, false, 86146, new Class[]{Long.TYPE}, Void.TYPE)) {
                        h hVar2 = hVar;
                        PatchProxy.accessDispatch(new Object[]{new Long(u)}, hVar2, h.f74197b, false, 86146, new Class[]{Long.TYPE}, Void.TYPE);
                        return;
                    }
                    for (o next : hVar.f74198c) {
                        next.setPlayPosition(u);
                        next.c();
                    }
                }
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.ies.dmt.ui.a.b f3933a;
    private VEListener.i aa = new aa(this);

    /* renamed from: b  reason: collision with root package name */
    private boolean f3934b = false;

    /* renamed from: c  reason: collision with root package name */
    private LinkedList<InteractStickerStruct> f3935c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f3936d;

    /* renamed from: e  reason: collision with root package name */
    private RelativeLayout f3937e;

    /* renamed from: f  reason: collision with root package name */
    private VideoRecordGestureLayout f3938f;
    private VotingStickerLayout g;
    protected ViewGroup i;
    protected boolean j = true;
    protected AudioEffectModule k;
    protected FrameLayout l;
    public boolean m;
    protected StoryStickerGestureLayout n;
    protected InfoStickerHelper o;
    protected com.ss.android.ugc.aweme.shortvideo.e p;
    protected String q;
    protected boolean r;
    public boolean s;
    protected boolean t;
    protected y u = new b();
    protected VEVideoPublishEditViewModel v;
    protected o w;
    protected a x;
    protected StoryStickerGestureLayout y;
    protected cb z;

    class ChooseVideoCoverFragmentLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66923a;

        ChooseVideoCoverFragmentLifecycleCallbacks() {
        }

        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
            Fragment fragment2 = fragment;
            if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment2}, this, f66923a, false, 76539, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment2}, this, f66923a, false, 76539, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
                return;
            }
            super.onFragmentDetached(fragmentManager, fragment);
            if ((fragment2 instanceof VEChooseVideoCoverFragment) && ((w) VEVideoPublishEditActivity.this.v.f().getValue()) != null) {
                VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) fragment2;
                VEVideoPublishEditActivity.this.v.f().setValue(w.b(VEVideoPublishEditActivity.this.getResources().getColor(C0906R.color.h7), vEChooseVideoCoverFragment.b(), vEChooseVideoCoverFragment.d(), vEChooseVideoCoverFragment.c(), 0, 0));
                VEVideoPublishEditActivity.this.a(true, false);
            }
        }

        public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            Fragment fragment2 = fragment;
            if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment2, bundle}, this, f66923a, false, 76538, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment2, bundle}, this, f66923a, false, 76538, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE);
                return;
            }
            super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
            if (fragment2 instanceof VEChooseVideoCoverFragment) {
                VEVideoPublishEditActivity.this.a(false, false);
                final VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) fragment2;
                vEChooseVideoCoverFragment.getView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f66925a;

                    public final void onGlobalLayout() {
                        int i;
                        if (PatchProxy.isSupport(new Object[0], this, f66925a, false, 76540, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f66925a, false, 76540, new Class[0], Void.TYPE);
                            return;
                        }
                        MutableLiveData<w> f2 = VEVideoPublishEditActivity.this.v.f();
                        Resources resources = VEVideoPublishEditActivity.this.getResources();
                        if (com.ss.android.g.a.b()) {
                            i = C0906R.color.uc;
                        } else {
                            i = C0906R.color.kq;
                        }
                        f2.setValue(w.a(resources.getColor(i), vEChooseVideoCoverFragment.b(), vEChooseVideoCoverFragment.d(), vEChooseVideoCoverFragment.c(), 0, 0));
                        vEChooseVideoCoverFragment.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                });
            }
        }
    }

    public static float b(boolean z2) {
        return z2 ? 1.0f : 0.3137255f;
    }

    /* access modifiers changed from: package-private */
    public final VEVideoPublishEditActivity I() {
        return this;
    }

    public final void N() {
    }

    public final void a(@NonNull com.ss.android.ugc.aweme.base.activity.b bVar) {
    }

    public int d() {
        return -1;
    }

    public void i() {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void j() {
    }

    public final boolean O() {
        return this.t;
    }

    public final cb c() {
        return this.z;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 76327, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 76327, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i.setBackgroundColor(i2);
        this.N.g().setValue(Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(float f2, float f3) {
        if ((this.z.isFastImport || this.z.getWavFile() != null) && !this.z.isMuted) {
            this.v.o().setValue(VEVolumeChangeOp.ofVoice(f2));
            if (this.z.mMusicPath != null) {
                this.v.o().setValue(VEVolumeChangeOp.ofMusic(f3));
            }
            return;
        }
        this.v.o().setValue(VEVolumeChangeOp.ofMusic(f3));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(w wVar) {
        if (wVar != null) {
            k(wVar.g == 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            this.v.b().setValue(j.a(true, this.z.veAudioEffectParam));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(v vVar) {
        if (vVar.f83072b == 1) {
            a(false, false);
        } else {
            a(true, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(w wVar) {
        if (wVar.g == 1) {
            a(false, false);
        } else {
            a(true, false);
        }
    }

    public void a(com.ss.android.ugc.aweme.shortvideo.e eVar, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{eVar, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, h, false, 76377, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Byte.valueOf(z2)}, this, h, false, 76377, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (eVar != null && z2) {
            this.z.musicId = eVar.getMusicId();
            VEMVAudioInfo vEMVAudioInfo = null;
            if (this.O.a().getValue() != null) {
                vEMVAudioInfo = ((p) this.O.a().getValue()).f();
            }
            if (vEMVAudioInfo != null) {
                this.z.mMusicStart = vEMVAudioInfo.trimIn;
                this.z.mMusicEnd = vEMVAudioInfo.trimOut;
            } else {
                this.z.mMusicStart = 0;
                this.z.mMusicEnd = Math.min(eVar.getDuration(), 60000);
            }
            this.z.mMusicOrigin = "edit_page_recommend";
        }
    }

    public final void a(com.ss.android.ugc.aweme.ao.a.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, h, false, 76382, new Class[]{com.ss.android.ugc.aweme.ao.a.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, h, false, 76382, new Class[]{com.ss.android.ugc.aweme.ao.a.e.class}, Void.TYPE);
        } else if (eVar.f33633b.booleanValue()) {
            m();
        } else {
            if (!TextUtils.isEmpty(eVar.f33636e)) {
                a(eVar.f33636e, eVar.f33634c);
                if (eVar.f33635d != null) {
                    this.D.a(f.a().a(eVar.f33635d), eVar.f33635d.getDuration());
                }
            }
        }
    }

    public void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, h, false, 76385, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, h, false, 76385, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        String a2 = com.ss.android.ugc.aweme.imported.e.a(ej.a().b());
        t tVar = new t();
        tVar.f83064b = str;
        tVar.f83065c = 0;
        tVar.f83068f = a2;
        int b2 = com.ss.android.ugc.aweme.port.in.a.i.b(str);
        tVar.f83066d = com.ss.android.g.a.b() ? Math.min(b2, 15000) : b2;
        this.v.d().setValue(tVar);
        this.q = this.z.mMusicPath;
        this.z.mMusicPath = str;
        this.z.musicId = a2;
        this.z.mMusicStart = 0;
        this.z.mMusicEnd = Math.min(tVar.f83066d, 60000);
        this.z.mMusicOrigin = str2;
        a(!J() && !L() && this.z.mMusicPath != null);
        if (this.z.isMvThemeVideoType() && !com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) this.z.mvCreateVideoData.musicIds) && this.z.mvCreateVideoData.musicIds.contains(a2)) {
            a(false);
        }
        c(false);
        this.z.musicVolume = 0.5f;
        this.B.a(50);
        this.v.o().setValue(VEVolumeChangeOp.ofMusic(0.5f));
        if (!this.z.isMvThemeVideoType() || this.z.mvCreateVideoData.mvType != 1) {
            MutableLiveData<dmt.av.video.s> m2 = this.v.m();
            m2.setValue(dmt.av.video.s.b(0));
            m2.setValue(dmt.av.video.s.a());
            return;
        }
        a(str, this.z.mMusicStart, this.z.mMusicEnd, b2, true);
    }

    public final void a(com.ss.android.ugc.aweme.filter.h hVar, com.ss.android.ugc.aweme.filter.h hVar2, float f2) {
        com.ss.android.ugc.aweme.filter.h hVar3 = hVar;
        com.ss.android.ugc.aweme.filter.h hVar4 = hVar2;
        if (PatchProxy.isSupport(new Object[]{hVar3, hVar4, Float.valueOf(f2)}, this, h, false, 76386, new Class[]{com.ss.android.ugc.aweme.filter.h.class, com.ss.android.ugc.aweme.filter.h.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar3, hVar4, Float.valueOf(f2)}, this, h, false, 76386, new Class[]{com.ss.android.ugc.aweme.filter.h.class, com.ss.android.ugc.aweme.filter.h.class, Float.TYPE}, Void.TYPE);
            return;
        }
        p a2 = a();
        if (a2 != null) {
            a2.a(hVar3.j, hVar4.j, f2, 0.8f);
        }
    }

    public final void a(com.ss.android.ugc.aweme.filter.h hVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{hVar}, this, h, false, 76390, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, h, false, 76390, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE);
            return;
        }
        this.v.a(hVar);
        this.w.a(hVar);
        this.z.mSelectedId = hVar.f47602f;
        this.z.mCurFilterLabels = hVar.f47600d;
        this.z.mCurFilterIds = String.valueOf(hVar.f47598b);
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.z.creationId).a("shoot_way", this.z.mShootWay).a("draft_id", this.z.draftId);
        if (hVar == null) {
            str = "";
        } else {
            str = hVar instanceof com.ss.android.ugc.aweme.filter.o ? "filter_box" : "slide";
        }
        r.a("select_filter", (Map) a2.a("enter_method", str).a("enter_from", "video_edit_page").a("filter_name", hVar.f47600d).a("filter_id", hVar.f47598b).f34114b);
        com.ss.android.ugc.aweme.port.in.a.f61121d.a(this.z.getAvetParameter().getContentType(), "mid_page", hVar.f47600d);
        r.onEvent(MobClick.obtain().setEventName("filter_slide").setLabelName("mid_page").setJsonObject(H()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view, RTLImageView rTLImageView) {
        this.S.r().setValue(2130837664);
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).withEndAction(new bn(this, rTLImageView, view)).start();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(RTLImageView rTLImageView, View view) {
        rTLImageView.setVisibility(8);
        if (this.L == 2) {
            this.f3933a.a(view, ey.a((Context) this) ? 5 : 3, true);
        } else {
            this.f3933a.a(view, 80, true);
        }
        this.A.a(true);
        s.a("auto_enhance", true);
    }

    /* JADX WARNING: type inference failed for: r3v98, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(java.lang.Integer r27) {
        /*
            r26 = this;
            r7 = r26
            if (r27 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r27.intValue()
            r8 = 0
            r9 = 2
            r10 = 1
            r11 = 0
            switch(r0) {
                case 1: goto L_0x0b71;
                case 2: goto L_0x041b;
                case 3: goto L_0x03bf;
                case 4: goto L_0x03ad;
                case 5: goto L_0x0331;
                case 6: goto L_0x00d7;
                case 7: goto L_0x00cd;
                case 8: goto L_0x00c3;
                case 9: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0b75
        L_0x0012:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76331(0x12a2b, float:1.06963E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76331(0x12a2b, float:1.06963E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            boolean r0 = r0.autoEnhanceOn
            r0 = r0 ^ r10
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r7.S
            android.arch.lifecycle.MutableLiveData r1 = r1.r()
            if (r0 == 0) goto L_0x0049
            r2 = 2130837664(0x7f0200a0, float:1.7280288E38)
            goto L_0x004c
        L_0x0049:
            r2 = 2130837662(0x7f02009e, float:1.7280284E38)
        L_0x004c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.setValue(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.a.c r1 = r7.A
            r1.a(r0)
            java.lang.String r0 = "click_quality_improve"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            java.lang.String r3 = r3.creationId
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            java.lang.String r3 = r3.mShootWay
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "content_source"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r3 = r3.getAvetParameter()
            java.lang.String r3 = r3.getContentSource()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "content_type"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r3 = r3.getAvetParameter()
            java.lang.String r3 = r3.getContentType()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "video_edit_page"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "to_status"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            boolean r3 = r3.autoEnhanceOn
            if (r3 == 0) goto L_0x00a5
            java.lang.String r3 = "on"
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r3 = "off"
        L_0x00a7:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "improve_method"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            int r3 = r3.autoEnhanceType
            if (r3 != r10) goto L_0x00b6
            java.lang.String r3 = "light"
            goto L_0x00b8
        L_0x00b6:
            java.lang.String r3 = "hdr"
        L_0x00b8:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            goto L_0x0b75
        L_0x00c3:
            r7.d((boolean) r11)
            r26.E()
            r26.ar()
            return
        L_0x00cd:
            r7.d((boolean) r11)
            r26.p()
            r26.ar()
            return
        L_0x00d7:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76347(0x12a3b, float:1.06985E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00fe
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76347(0x12a3b, float:1.06985E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0b75
        L_0x00fe:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule r0 = r7.k
            if (r0 == 0) goto L_0x0330
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule r0 = r7.k
            com.ss.android.vesdk.p r0 = r0.k
            if (r0 != 0) goto L_0x0118
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule r0 = r7.k
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r7.O
            android.arch.lifecycle.MutableLiveData r1 = r1.a()
            java.lang.Object r1 = r1.getValue()
            com.ss.android.vesdk.p r1 = (com.ss.android.vesdk.p) r1
            r0.k = r1
        L_0x0118:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule r0 = r7.k
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule.f3939a
            r15 = 0
            r16 = 76620(0x12b4c, float:1.07367E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0143
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule.f3939a
            r15 = 0
            r16 = 76620(0x12b4c, float:1.07367E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02cd
        L_0x0143:
            android.widget.FrameLayout r1 = r0.n
            r1.removeAllViews()
            android.support.v7.app.AppCompatActivity r1 = r0.l
            android.widget.FrameLayout r2 = r0.n
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule.f3939a
            r15 = 0
            r16 = 76622(0x12b4e, float:1.0737E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.support.v7.app.AppCompatActivity> r4 = android.support.v7.app.AppCompatActivity.class
            r3[r11] = r4
            java.lang.Class<android.widget.FrameLayout> r4 = android.widget.FrameLayout.class
            r3[r10] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x018d
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule.f3939a
            r15 = 0
            r16 = 76622(0x12b4e, float:1.0737E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.support.v7.app.AppCompatActivity> r2 = android.support.v7.app.AppCompatActivity.class
            r1[r11] = r2
            java.lang.Class<android.widget.FrameLayout> r2 = android.widget.FrameLayout.class
            r1[r10] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02b7
        L_0x018d:
            android.view.View r3 = r0.f3941c
            if (r3 != 0) goto L_0x02b4
            android.content.Context r1 = (android.content.Context) r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r3 = 2131689736(0x7f0f0108, float:1.9008496E38)
            r4 = r2
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r1 = r1.inflate(r3, r4, r11)
            r0.f3941c = r1
            android.view.View r1 = r0.f3941c
            if (r1 == 0) goto L_0x01b1
            r3 = 2131170740(0x7f0715b4, float:1.7955847E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x01b2
        L_0x01b1:
            r1 = r8
        L_0x01b2:
            r0.f3942d = r1
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a r1 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a
            android.view.View r3 = r0.f3941c
            if (r3 == 0) goto L_0x01c4
            r4 = 2131167918(0x7f070aae, float:1.7950123E38)
            android.view.View r3 = r3.findViewById(r4)
            r8 = r3
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
        L_0x01c4:
            r1.<init>(r8)
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.d r1 = (com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.d) r1
            r0.j = r1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule.f3939a
            r15 = 0
            r16 = 76624(0x12b50, float:1.07373E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x01f3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule.f3939a
            r15 = 0
            r16 = 76624(0x12b50, float:1.07373E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x023f
        L_0x01f3:
            android.view.View r1 = r0.f3941c
            if (r1 != 0) goto L_0x01fa
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01fa:
            r3 = 2131171472(0x7f071890, float:1.7957332E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f3943e = r1
            android.view.View r1 = r0.f3941c
            if (r1 != 0) goto L_0x020a
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x020a:
            r3 = 2131171477(0x7f071895, float:1.7957342E38)
            android.view.View r1 = r1.findViewById(r3)
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule$d r3 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule$d
            r3.<init>(r0)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r1.setOnClickListener(r3)
            android.view.View r1 = r0.f3941c
            if (r1 != 0) goto L_0x0222
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0222:
            r3 = 2131171475(0x7f071893, float:1.7957338E38)
            android.view.View r1 = r1.findViewById(r3)
            android.support.v7.widget.RecyclerView r1 = (android.support.v7.widget.RecyclerView) r1
            r0.f3944f = r1
            android.support.v7.widget.RecyclerView r1 = r0.f3944f
            if (r1 == 0) goto L_0x023f
            android.support.v7.widget.LinearLayoutManager r3 = new android.support.v7.widget.LinearLayoutManager
            android.support.v7.app.AppCompatActivity r4 = r0.l
            android.content.Context r4 = (android.content.Context) r4
            r3.<init>(r4, r11, r11)
            android.support.v7.widget.RecyclerView$LayoutManager r3 = (android.support.v7.widget.RecyclerView.LayoutManager) r3
            r1.setLayoutManager(r3)
        L_0x023f:
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule.f3939a
            r15 = 0
            r16 = 76623(0x12b4f, float:1.07372E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0267
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule.f3939a
            r15 = 0
            r16 = 76623(0x12b4f, float:1.07372E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x028d
        L_0x0267:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter r1 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter
            android.support.v7.app.AppCompatActivity r3 = r0.l
            com.ss.android.vesdk.p r4 = r0.k
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r0.m
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r6 = r0.o
            r1.<init>(r3, r4, r5, r6)
            r0.i = r1
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter r1 = r0.i
            if (r1 == 0) goto L_0x027f
            r3 = r0
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g r3 = (com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g) r3
            r1.f67008d = r3
        L_0x027f:
            android.support.v7.widget.RecyclerView r1 = r0.f3944f
            if (r1 == 0) goto L_0x028a
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter r3 = r0.i
            android.support.v7.widget.RecyclerView$Adapter r3 = (android.support.v7.widget.RecyclerView.Adapter) r3
            r1.setAdapter(r3)
        L_0x028a:
            r0.a()
        L_0x028d:
            com.ss.android.ugc.aweme.filter.b r1 = new com.ss.android.ugc.aweme.filter.b
            android.view.View r3 = r0.f3941c
            if (r3 != 0) goto L_0x0296
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0296:
            android.view.View r4 = r0.f3943e
            if (r4 != 0) goto L_0x029d
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x029d:
            r1.<init>(r2, r3, r4)
            r0.g = r1
            com.ss.android.ugc.aweme.filter.b r1 = r0.g
            if (r1 != 0) goto L_0x02a9
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x02a9:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule$c r2 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule$c
            r2.<init>(r0)
            com.ss.android.ugc.aweme.photomovie.transition.f r2 = (com.ss.android.ugc.aweme.photomovie.transition.f) r2
            r1.a((com.ss.android.ugc.aweme.photomovie.transition.f) r2)
            goto L_0x02b7
        L_0x02b4:
            r0.a()
        L_0x02b7:
            android.view.View r1 = r0.f3941c
            if (r1 == 0) goto L_0x02bf
            r2 = 4
            r1.setVisibility(r2)
        L_0x02bf:
            com.ss.android.ugc.aweme.filter.b r1 = r0.g
            if (r1 == 0) goto L_0x02cd
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule$e r2 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule$e
            r2.<init>(r0)
            com.ss.android.ugc.aweme.photomovie.transition.ITransition r2 = (com.ss.android.ugc.aweme.photomovie.transition.ITransition) r2
            r1.a((com.ss.android.ugc.aweme.photomovie.transition.ITransition) r2)
        L_0x02cd:
            r7.a((boolean) r11, (boolean) r11)
            java.lang.String r0 = "voice"
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r0, (boolean) r10)
            java.lang.String r0 = "click_voice_modify"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            java.lang.String r3 = r3.creationId
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "video_edit_page"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            java.lang.String r3 = r3.mShootWay
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "content_source"
            java.lang.String r3 = "content_source"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r4 = r7.z
            java.lang.String r3 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e.a(r3, r4)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "shoot_entrance"
            java.lang.String r3 = "shoot_entrance"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r4 = r7.z
            java.lang.String r3 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e.a(r3, r4)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "content_type"
            java.lang.String r3 = "content_type"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r4 = r7.z
            java.lang.String r3 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e.a(r3, r4)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "local_time_ms"
            long r3 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (long) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
        L_0x0330:
            return
        L_0x0331:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76348(0x12a3c, float:1.06986E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0358
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76348(0x12a3c, float:1.06986E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0b75
        L_0x0358:
            com.ss.android.ugc.aweme.shortvideo.edit.o r0 = r7.w
            r0.a()
            java.lang.String r0 = "click_modify_entrance"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            java.lang.String r3 = r3.creationId
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            java.lang.String r3 = r3.mShootWay
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "content_type"
            java.lang.String r3 = r26.e()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "content_source"
            java.lang.String r3 = r26.g()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "video_edit_page"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "scene_id"
            java.lang.String r3 = "1004"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            r7.a((boolean) r11, (boolean) r11)
            java.lang.String r0 = "add_filter"
            com.ss.android.ugc.aweme.common.MobClick r0 = r7.a((java.lang.String) r0)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
            return
        L_0x03ad:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.b r0 = r7.E
            if (r0 == 0) goto L_0x0b75
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.b r0 = r7.E
            r0.a()
            r7.a((boolean) r11, (boolean) r11)
            java.lang.String r0 = "sticker"
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r0, (boolean) r10)
            return
        L_0x03bf:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76334(0x12a2e, float:1.06967E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03e5
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76334(0x12a2e, float:1.06967E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x040f
        L_0x03e5:
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h r0 = r7.H
            if (r0 == 0) goto L_0x040f
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r0 = r7.I
            if (r0 == 0) goto L_0x03fa
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r0 = r7.I
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x03fa
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r0 = r7.I
            r0.f()
        L_0x03fa:
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h r0 = r7.H
            com.ss.android.vesdk.p r1 = r26.a()
            boolean r2 = r26.K()
            r0.a((com.ss.android.vesdk.p) r1, (boolean) r2)
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h r0 = r7.H
            r0.b((com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o) r8)
            r26.aq()
        L_0x040f:
            java.lang.String r0 = "click_text_entrance"
            com.ss.android.ugc.aweme.app.d.d r1 = r26.u()
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            return
        L_0x041b:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76349(0x12a3d, float:1.06988E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0442
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76349(0x12a3d, float:1.06988E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0b6d
        L_0x0442:
            r26.S()
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            if (r0 != 0) goto L_0x0ad6
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = new com.ss.android.ugc.aweme.effect.VEEffectHelper
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            r0.<init>(r1, r7, r7)
            r7.C = r0
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            com.ss.android.ugc.gamora.editor.EditPreviewViewModel r1 = r7.N
            android.arch.lifecycle.MutableLiveData r1 = r1.e()
            r0.Q = r1
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            com.ss.android.ugc.gamora.editor.EditPreviewViewModel r1 = r7.N
            android.arch.lifecycle.MutableLiveData r1 = r1.f()
            r0.P = r1
            android.arch.lifecycle.Lifecycle r0 = r26.getLifecycle()
            com.ss.android.ugc.aweme.effect.VEEffectHelper r1 = r7.C
            r0.addObserver(r1)
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            com.ss.android.vesdk.p r1 = r26.a()
            int r1 = r1.t()
            r0.A = r1
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            r1 = 2131170174(0x7f07137e, float:1.7954699E38)
            android.view.View r2 = r7.findViewById(r1)
            com.ss.android.vesdk.p r3 = r26.a()
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r2
            r12[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38683(0x971b, float:5.4206E-41)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r4[r11] = r5
            java.lang.Class<com.ss.android.vesdk.p> r5 = com.ss.android.vesdk.p.class
            r4[r10] = r5
            java.lang.Class<com.ss.android.ugc.aweme.effect.VEEffectHelper> r18 = com.ss.android.ugc.aweme.effect.VEEffectHelper.class
            r13 = r0
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x04cc
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r2
            r12[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38683(0x971b, float:5.4206E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r1[r11] = r2
            java.lang.Class<com.ss.android.vesdk.p> r2 = com.ss.android.vesdk.p.class
            r1[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.effect.VEEffectHelper> r18 = com.ss.android.ugc.aweme.effect.VEEffectHelper.class
            r13 = r0
            r17 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = (com.ss.android.ugc.aweme.effect.VEEffectHelper) r0
            goto L_0x07d5
        L_0x04cc:
            android.view.View r1 = r2.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            android.view.View r1 = r1.inflate()
            r0.z = r1
            android.view.View r1 = r0.z
            android.view.View$OnTouchListener r4 = com.ss.android.ugc.aweme.effect.aa.f43677b
            r1.setOnTouchListener(r4)
            android.view.View r1 = r0.z
            butterknife.ButterKnife.bind((java.lang.Object) r0, (android.view.View) r1)
            com.ss.android.ugc.aweme.effect.VEEffectHelper$11 r1 = new com.ss.android.ugc.aweme.effect.VEEffectHelper$11
            r1.<init>()
            android.widget.ImageView r4 = r0.mIvPlay
            r4.setOnClickListener(r1)
            android.widget.RelativeLayout r4 = r0.videolayout
            r4.setOnClickListener(r1)
            android.widget.TextView r4 = r0.mTextCancel
            r4.setOnClickListener(r1)
            android.widget.TextView r4 = r0.mTextxSave
            r4.setOnClickListener(r1)
            android.content.Context r1 = r2.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131625157(0x7f0e04c5, float:1.8877514E38)
            int r1 = r1.getColor(r4)
            r0.v = r1
            android.content.Context r1 = r2.getContext()
            int[] r2 = com.ss.android.ugc.aweme.tools.R$styleable.LineStickerLayer1
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2)
            r0.w = r11
            r1.recycle()
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r1 = r0.mEffectSeekLayout
            int r2 = r0.A
            r1.setVideoDuration(r2)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r1 = r0.mEffectSeekLayout
            r1.b(r11)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r1 = r0.mEffectSeekLayout
            r1.setNormalColor(r11)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r1 = r0.mEffectSeekLayout
            int r2 = r0.v
            r1.setOverlayColor(r2)
            r0.r = r3
            android.view.View r1 = r0.z
            android.content.Context r1 = r1.getContext()
            r0.B = r1
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r0.mStatusView
            if (r1 == 0) goto L_0x0552
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r0.mStatusView
            android.content.Context r2 = r0.B
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r2 = com.bytedance.ies.dmt.ui.widget.DmtStatusView.a.a((android.content.Context) r2)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r2 = r2.c((int) r10)
            r1.setBuilder(r2)
        L_0x0552:
            com.ss.android.ugc.aweme.effect.EffectTabPagerAdapter r1 = new com.ss.android.ugc.aweme.effect.EffectTabPagerAdapter
            android.support.v4.app.FragmentActivity r2 = r0.G
            android.support.v4.app.FragmentManager r2 = r2.getSupportFragmentManager()
            android.support.v4.app.FragmentActivity r3 = r0.G
            r1.<init>(r2, r3)
            r0.D = r1
            com.ss.android.ugc.aweme.effect.EffectTabPagerAdapter r1 = r0.D
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r0.f3086b
            boolean r2 = r2.isMvThemeVideoType()
            r1.f43526e = r2
            com.ss.android.ugc.aweme.effect.NoScrollViewPager r1 = r0.mViewPager
            r1.setOffscreenPageLimit(r10)
            com.ss.android.ugc.aweme.effect.NoScrollViewPager r1 = r0.mViewPager
            r1.setNoScroll(r10)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r1 = r0.mTabLayout
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.u
            r15 = 0
            r16 = 86822(0x15326, float:1.21664E-40)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r1
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x059f
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.u
            r15 = 0
            r16 = 86822(0x15326, float:1.21664E-40)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r1
            r17 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x05ae
        L_0x059f:
            boolean r2 = com.ss.android.g.a.a()
            if (r2 == 0) goto L_0x05ab
            r2 = 18
            r1.setTabMargin(r2)
            goto L_0x05ae
        L_0x05ab:
            r1.setTabMargin(r11)
        L_0x05ae:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r1 = r0.mTabLayout
            r1.setDefaultAddTab(r11)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r1 = r0.mTabLayout
            com.ss.android.ugc.aweme.effect.NoScrollViewPager r2 = r0.mViewPager
            r1.setupWithViewPager(r2)
            com.ss.android.ugc.aweme.effect.NoScrollViewPager r1 = r0.mViewPager
            r1.clearOnPageChangeListeners()
            com.ss.android.ugc.aweme.effect.NoScrollViewPager r1 = r0.mViewPager
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$TabLayoutOnPageChangeListenerIndependent r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$TabLayoutOnPageChangeListenerIndependent
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r3 = r0.mTabLayout
            r2.<init>(r3)
            r1.addOnPageChangeListener(r2)
            com.ss.android.ugc.aweme.effect.NoScrollViewPager r1 = r0.mViewPager
            com.ss.android.ugc.aweme.effect.VEEffectHelper$7 r2 = new com.ss.android.ugc.aweme.effect.VEEffectHelper$7
            r2.<init>()
            r1.addOnPageChangeListener(r2)
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.e.f43741a
            r15 = 1
            r16 = 38540(0x968c, float:5.4006E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x05fd
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.e.f43741a
            r15 = 1
            r16 = 38540(0x968c, float:5.4006E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0647
        L_0x05fd:
            android.app.Application r1 = com.ss.android.ugc.aweme.port.in.a.f61119b
            java.lang.Class<com.ss.android.ugc.aweme.effect.b> r2 = com.ss.android.ugc.aweme.effect.b.class
            java.lang.Object r1 = com.ss.android.ugc.aweme.common.g.a.a(r1, r2)
            com.ss.android.ugc.aweme.effect.b r1 = (com.ss.android.ugc.aweme.effect.b) r1
            com.ss.android.ugc.aweme.port.in.m r2 = com.ss.android.ugc.aweme.port.in.a.f61121d
            int r2 = r2.c()
            r3 = -1
            int r3 = r1.a(r3)
            if (r2 == r3) goto L_0x0647
            r1.b(r2)
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.e.f43741a
            r15 = 1
            r16 = 38541(0x968d, float:5.4007E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x063f
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.e.f43741a
            r15 = 1
            r16 = 38541(0x968d, float:5.4007E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0647
        L_0x063f:
            com.ss.android.ugc.aweme.shortvideo.util.ag.a()
            java.util.concurrent.Callable r1 = com.ss.android.ugc.aweme.effect.f.f43743b
            a.i.a((java.util.concurrent.Callable<TResult>) r1)
        L_0x0647:
            r0.a((boolean) r10)
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38691(0x9723, float:5.4218E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0672
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38691(0x9723, float:5.4218E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0697
        L_0x0672:
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r1 = r0.X
            if (r1 != 0) goto L_0x068b
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r1 = new com.ss.android.ugc.aweme.effectplatform.EffectPlatform
            android.content.Context r2 = r0.B
            com.ss.android.ugc.aweme.port.in.y r3 = com.ss.android.ugc.aweme.port.in.a.h
            java.lang.String r3 = r3.c()
            com.ss.android.ugc.aweme.port.in.ab r4 = com.ss.android.ugc.aweme.port.in.a.D
            okhttp3.OkHttpClient r4 = r4.getOKHttpClient()
            r1.<init>(r2, r3, r4)
            r0.X = r1
        L_0x068b:
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r1 = r0.X
            java.lang.String r2 = "editingeffect"
            com.ss.android.ugc.aweme.effect.VEEffectHelper$2 r3 = new com.ss.android.ugc.aweme.effect.VEEffectHelper$2
            r3.<init>()
            r1.a((java.lang.String) r2, (boolean) r11, (com.ss.android.ugc.effectmanager.effect.b.g) r3)
        L_0x0697:
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38693(0x9725, float:5.422E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x06bf
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38693(0x9725, float:5.422E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0727
        L_0x06bf:
            com.ss.android.ugc.aweme.shortvideo.edit.u r1 = r0.f3088d
            if (r1 != 0) goto L_0x0727
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r0.f3086b
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r1 = r1.previewConfigure
            if (r1 == 0) goto L_0x0719
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r0.f3086b
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r1 = r1.previewConfigure
            java.util.List r1 = r1.getVideoSegments()
            int r2 = r1.size()
            if (r2 != r10) goto L_0x06d9
            r2 = 0
            goto L_0x06df
        L_0x06d9:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r0.f3086b
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r2 = r2.previewConfigure
            int r2 = r2.sceneIn
        L_0x06df:
            int r3 = r1.size()
            if (r3 != r10) goto L_0x0704
            java.lang.Object r3 = r1.get(r11)
            com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment r3 = (com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment) r3
            int r3 = r3.getEnd()
            java.lang.Object r4 = r1.get(r11)
            com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment r4 = (com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment) r4
            int r4 = r4.start
            int r3 = r3 - r4
            float r3 = (float) r3
            java.lang.Object r4 = r1.get(r11)
            com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment r4 = (com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment) r4
            float r4 = r4.speed
            float r3 = r3 / r4
            int r3 = (int) r3
            goto L_0x070a
        L_0x0704:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r0.f3086b
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r3 = r3.previewConfigure
            int r3 = r3.sceneOut
        L_0x070a:
            com.ss.android.ugc.aweme.shortvideo.edit.z r4 = new com.ss.android.ugc.aweme.shortvideo.edit.z
            com.ss.android.vesdk.p r5 = r0.r
            r4.<init>(r5, r1, r2, r3)
            r0.f3088d = r4
            java.lang.String r1 = "generate reverse video ,using new api"
            com.ss.android.ugc.aweme.shortvideo.util.ai.a(r1)
            goto L_0x0727
        L_0x0719:
            com.ss.android.ugc.aweme.effect.ai r1 = new com.ss.android.ugc.aweme.effect.ai
            com.ss.android.vesdk.p r2 = r0.r
            r1.<init>(r2)
            r0.f3088d = r1
            java.lang.String r1 = "generate reverse video ,using old api"
            com.ss.android.ugc.aweme.shortvideo.util.ai.a(r1)
        L_0x0727:
            android.widget.ImageView r1 = r0.mIvPlay
            r1.setVisibility(r11)
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38687(0x971f, float:5.4212E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0754
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38687(0x971f, float:5.4212E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x07c0
        L_0x0754:
            com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView r1 = r0.mChooseVideoCoverView
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r11)
            r2[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.f71316a
            r22 = 0
            r23 = 81280(0x13d80, float:1.13898E-40)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r3[r11] = r4
            java.lang.Class r25 = java.lang.Void.TYPE
            r19 = r2
            r20 = r1
            r24 = r3
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
            if (r2 == 0) goto L_0x079a
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r11)
            r2[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.f71316a
            r22 = 0
            r23 = 81280(0x13d80, float:1.13898E-40)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r3[r11] = r4
            java.lang.Class r25 = java.lang.Void.TYPE
            r19 = r2
            r20 = r1
            r24 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x07aa
        L_0x079a:
            com.ss.android.ugc.aweme.shortvideo.widget.VideoCoverFrameView r2 = r1.f71318c
            if (r2 == 0) goto L_0x07aa
            com.ss.android.ugc.aweme.shortvideo.widget.VideoCoverFrameView r2 = r1.f71318c
            r2.setOnTouchListener(r8)
            com.ss.android.ugc.aweme.shortvideo.widget.VideoCoverFrameView r1 = r1.f71318c
            r2 = 8
            r1.setVisibility(r2)
        L_0x07aa:
            com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView r1 = r0.mChooseVideoCoverView
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r2 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            android.support.v4.app.FragmentActivity r3 = r0.G
            r2.<init>(r3, r11, r11)
            r1.setLayoutManager(r2)
            com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView r1 = r0.mChooseVideoCoverView
            com.ss.android.ugc.aweme.effect.u r2 = new com.ss.android.ugc.aweme.effect.u
            r2.<init>(r0)
            r1.post(r2)
        L_0x07c0:
            r0.E = r11
            r0.C = r10
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r1 = r0.mEffectSeekLayout
            com.ss.android.ugc.aweme.effect.VEEffectHelper$12 r2 = new com.ss.android.ugc.aweme.effect.VEEffectHelper$12
            r2.<init>()
            r1.setOnCursorSeekListener(r2)
            com.ss.android.ugc.aweme.effect.VEEffectHelper$13 r1 = new com.ss.android.ugc.aweme.effect.VEEffectHelper$13
            r1.<init>()
            r0.s = r1
        L_0x07d5:
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r1 = r26.I()
            dmt.av.video.VEVideoPublishEditViewModel r2 = r7.v
            dmt.av.video.f r2 = r2.l()
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38677(0x9715, float:5.4198E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r4 = android.arch.lifecycle.LifecycleOwner.class
            r3[r11] = r4
            java.lang.Class<android.arch.lifecycle.MutableLiveData> r4 = android.arch.lifecycle.MutableLiveData.class
            r3[r10] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x0821
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38677(0x9715, float:5.4198E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r2 = android.arch.lifecycle.LifecycleOwner.class
            r1[r11] = r2
            java.lang.Class<android.arch.lifecycle.MutableLiveData> r2 = android.arch.lifecycle.MutableLiveData.class
            r1[r10] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x082a
        L_0x0821:
            r0.f3089e = r2
            android.arch.lifecycle.MutableLiveData<dmt.av.video.p> r2 = r0.f3089e
            android.arch.lifecycle.Observer<dmt.av.video.p> r0 = r0.U
            r2.observe(r1, r0)
        L_0x082a:
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            dmt.av.video.VEVideoPublishEditViewModel r1 = r7.v
            android.arch.lifecycle.MutableLiveData r1 = r1.i()
            r0.l = r1
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r1 = r26.I()
            dmt.av.video.VEVideoPublishEditViewModel r2 = r7.v
            android.arch.lifecycle.MutableLiveData r2 = r2.m()
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38680(0x9718, float:5.4202E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r4 = android.arch.lifecycle.LifecycleOwner.class
            r3[r11] = r4
            java.lang.Class<android.arch.lifecycle.MutableLiveData> r4 = android.arch.lifecycle.MutableLiveData.class
            r3[r10] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x0880
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38680(0x9718, float:5.4202E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r2 = android.arch.lifecycle.LifecycleOwner.class
            r1[r11] = r2
            java.lang.Class<android.arch.lifecycle.MutableLiveData> r2 = android.arch.lifecycle.MutableLiveData.class
            r1[r10] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0890
        L_0x0880:
            com.ss.android.ugc.aweme.shortvideo.SafeHandler r3 = new com.ss.android.ugc.aweme.shortvideo.SafeHandler
            r3.<init>(r1)
            r0.o = r3
            r0.f3090f = r2
            android.arch.lifecycle.MutableLiveData<dmt.av.video.s> r2 = r0.f3090f
            android.arch.lifecycle.Observer<dmt.av.video.s> r0 = r0.T
            r2.observe(r1, r0)
        L_0x0890:
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r1 = r26.I()
            dmt.av.video.VEVideoPublishEditViewModel r2 = r7.v
            dmt.av.video.h r2 = r2.n()
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38675(0x9713, float:5.4195E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r4 = android.arch.lifecycle.LifecycleOwner.class
            r3[r11] = r4
            java.lang.Class<android.arch.lifecycle.MutableLiveData> r4 = android.arch.lifecycle.MutableLiveData.class
            r3[r10] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x08dd
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38675(0x9713, float:5.4195E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r2 = android.arch.lifecycle.LifecycleOwner.class
            r1[r11] = r2
            java.lang.Class<android.arch.lifecycle.MutableLiveData> r2 = android.arch.lifecycle.MutableLiveData.class
            r1[r10] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x096c
        L_0x08dd:
            r0.h = r2
            android.arch.lifecycle.MutableLiveData<dmt.av.video.x> r1 = r0.h
            java.lang.Object r1 = r1.getValue()
            dmt.av.video.x r1 = (dmt.av.video.x) r1
            if (r1 == 0) goto L_0x096c
            java.lang.String r2 = r1.f83082b
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)
            r3 = 3
            if (r2 == 0) goto L_0x08f6
            r3 = 1
            goto L_0x092e
        L_0x08f6:
            java.lang.String r2 = r1.f83082b
            java.lang.String r4 = "2"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0913
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
            android.widget.ImageView r2 = r2.getTvSelelct()
            r0.a((int) r9, (android.widget.ImageView) r2)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
            long r3 = r1.f83083c
            int r3 = (int) r3
            r2.a((int) r3, (int) r9)
            r3 = 2
            goto L_0x092e
        L_0x0913:
            java.lang.String r2 = r1.f83082b
            java.lang.String r4 = "3"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x096c
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
            android.widget.ImageView r2 = r2.getTvSelelct()
            r0.a((int) r3, (android.widget.ImageView) r2)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
            long r4 = r1.f83083c
            int r4 = (int) r4
            r2.a((int) r4, (int) r9)
        L_0x092e:
            com.ss.android.ugc.aweme.effect.EffectPointModel r2 = new com.ss.android.ugc.aweme.effect.EffectPointModel
            r2.<init>()
            r0.H = r2
            com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r0.H
            r2.setType(r9)
            com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r0.H
            long r4 = r1.f83083c
            int r4 = (int) r4
            r2.setStartPoint(r4)
            com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r0.H
            long r4 = r1.f83083c
            int r1 = (int) r4
            r2.setEndPoint(r1)
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r0.H
            java.util.ArrayList r2 = com.ss.android.ugc.aweme.effect.e.a()
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.effect.EffectModel r2 = (com.ss.android.ugc.aweme.effect.EffectModel) r2
            java.lang.String r2 = r2.key
            r1.setKey(r2)
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = r0.H
            java.util.ArrayList r1 = com.ss.android.ugc.aweme.effect.e.a()
            java.lang.Object r1 = r1.get(r3)
            com.ss.android.ugc.aweme.effect.EffectModel r1 = (com.ss.android.ugc.aweme.effect.EffectModel) r1
            java.lang.String r1 = r1.name
            r0.setName(r1)
        L_0x096c:
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r1 = r26.I()
            dmt.av.video.VEVideoPublishEditViewModel r2 = r7.v
            android.arch.lifecycle.MutableLiveData r2 = r2.g()
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38678(0x9716, float:5.42E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r4 = android.arch.lifecycle.LifecycleOwner.class
            r3[r11] = r4
            java.lang.Class<android.arch.lifecycle.MutableLiveData> r4 = android.arch.lifecycle.MutableLiveData.class
            r3[r10] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x09b8
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38678(0x9716, float:5.42E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r2 = android.arch.lifecycle.LifecycleOwner.class
            r1[r11] = r2
            java.lang.Class<android.arch.lifecycle.MutableLiveData> r2 = android.arch.lifecycle.MutableLiveData.class
            r1[r10] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x09c1
        L_0x09b8:
            r0.i = r2
            android.arch.lifecycle.MutableLiveData<com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp> r2 = r0.i
            android.arch.lifecycle.Observer<com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp> r0 = r0.V
            r2.observe(r1, r0)
        L_0x09c1:
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            dmt.av.video.VEVideoPublishEditViewModel r1 = r7.v
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = dmt.av.video.VEVideoPublishEditViewModel.f82807a
            r15 = 0
            r16 = 92113(0x167d1, float:1.29078E-40)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class<android.arch.lifecycle.MutableLiveData> r18 = android.arch.lifecycle.MutableLiveData.class
            r13 = r1
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x09f0
            java.lang.Object[] r12 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r14 = dmt.av.video.VEVideoPublishEditViewModel.f82807a
            r15 = 0
            r16 = 92113(0x167d1, float:1.29078E-40)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class<android.arch.lifecycle.MutableLiveData> r18 = android.arch.lifecycle.MutableLiveData.class
            r13 = r1
            r17 = r2
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            android.arch.lifecycle.MutableLiveData r1 = (android.arch.lifecycle.MutableLiveData) r1
            goto L_0x09fd
        L_0x09f0:
            android.arch.lifecycle.MutableLiveData<dmt.av.video.v> r2 = r1.f82808b
            if (r2 != 0) goto L_0x09fb
            android.arch.lifecycle.MutableLiveData r2 = new android.arch.lifecycle.MutableLiveData
            r2.<init>()
            r1.f82808b = r2
        L_0x09fb:
            android.arch.lifecycle.MutableLiveData<dmt.av.video.v> r1 = r1.f82808b
        L_0x09fd:
            r0.g = r1
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r1 = r26.I()
            dmt.av.video.VEVideoPublishEditViewModel r2 = r7.v
            android.arch.lifecycle.MutableLiveData r2 = r2.j()
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38679(0x9717, float:5.4201E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r4 = android.arch.lifecycle.LifecycleOwner.class
            r3[r11] = r4
            java.lang.Class<android.arch.lifecycle.MutableLiveData> r4 = android.arch.lifecycle.MutableLiveData.class
            r3[r10] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x0a4b
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38679(0x9717, float:5.4201E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r2 = android.arch.lifecycle.LifecycleOwner.class
            r1[r11] = r2
            java.lang.Class<android.arch.lifecycle.MutableLiveData> r2 = android.arch.lifecycle.MutableLiveData.class
            r1[r10] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0a54
        L_0x0a4b:
            r0.j = r2
            android.arch.lifecycle.MutableLiveData<dmt.av.video.o> r2 = r0.j
            android.arch.lifecycle.Observer<dmt.av.video.o> r0 = r0.W
            r2.observe(r1, r0)
        L_0x0a54:
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            dmt.av.video.VEVideoPublishEditViewModel r1 = r7.v
            android.arch.lifecycle.MutableLiveData r1 = r1.h()
            r0.k = r1
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r1 = r26.I()
            dmt.av.video.VEVideoPublishEditViewModel r2 = r7.v
            android.arch.lifecycle.MutableLiveData r2 = r2.q()
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38676(0x9714, float:5.4197E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r4 = android.arch.lifecycle.LifecycleOwner.class
            r3[r11] = r4
            java.lang.Class<android.arch.lifecycle.LiveData> r4 = android.arch.lifecycle.LiveData.class
            r3[r10] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x0aaa
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r11] = r1
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38676(0x9714, float:5.4197E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r2 = android.arch.lifecycle.LifecycleOwner.class
            r1[r11] = r2
            java.lang.Class<android.arch.lifecycle.LiveData> r2 = android.arch.lifecycle.LiveData.class
            r1[r10] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0ab6
        L_0x0aaa:
            r0.m = r2
            android.arch.lifecycle.LiveData<java.lang.Boolean> r2 = r0.m
            com.ss.android.ugc.aweme.effect.y r3 = new com.ss.android.ugc.aweme.effect.y
            r3.<init>(r0)
            r2.observe(r1, r3)
        L_0x0ab6:
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            dmt.av.video.VEVideoPublishEditViewModel r1 = r7.v
            dmt.av.video.h r1 = r1.b()
            r0.n = r1
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            dmt.av.video.VEVideoPublishEditViewModel r1 = r7.v
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r1 = r1.f82809c
            r0.L = r1
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            r0.h()
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            com.ss.android.ugc.aweme.shortvideo.edit.bu r1 = new com.ss.android.ugc.aweme.shortvideo.edit.bu
            r1.<init>(r7)
            r0.Y = r1
        L_0x0ad6:
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.fc.a()
            if (r0 == 0) goto L_0x0adf
            r7.h(r11)
        L_0x0adf:
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            com.ss.android.ugc.aweme.effect.VEEffectHelper r1 = r7.C
            int r1 = r1.e()
            r0.a((boolean) r10, (int) r1)
            dmt.av.video.VEVideoPublishEditViewModel r0 = r7.v
            android.arch.lifecycle.MutableLiveData r0 = r0.f()
            com.ss.android.ugc.aweme.themechange.base.b r1 = com.ss.android.ugc.aweme.themechange.base.b.f74589e
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            int r12 = r1.a(r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.effect.VEEffectHelper r1 = r7.C
            int r1 = r1.d()
            boolean r2 = com.ss.android.ugc.aweme.shortvideo.fc.a()
            if (r2 == 0) goto L_0x0b0c
            int r2 = com.ss.android.ugc.aweme.shortvideo.fc.c(r26)
            goto L_0x0b0d
        L_0x0b0c:
            r2 = 0
        L_0x0b0d:
            int r13 = r1 + r2
            com.ss.android.ugc.aweme.effect.VEEffectHelper r1 = r7.C
            int r14 = r1.e()
            int r15 = r26.k()
            boolean r1 = com.ss.android.ugc.aweme.shortvideo.fc.a()
            if (r1 == 0) goto L_0x0b28
            int r1 = com.ss.android.ugc.aweme.shortvideo.fb.f67663b
            int r1 = com.ss.android.ugc.aweme.shortvideo.fb.b(r7, r1)
            r16 = r1
            goto L_0x0b2a
        L_0x0b28:
            r16 = 0
        L_0x0b2a:
            r17 = 0
            dmt.av.video.w r1 = dmt.av.video.w.a(r12, r13, r14, r15, r16, r17)
            r0.setValue(r1)
            r7.a((boolean) r11, (boolean) r11)
            java.lang.String r0 = "effect"
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r0, (boolean) r10)
            java.lang.String r0 = "add_effect"
            com.ss.android.ugc.aweme.common.MobClick r0 = r7.a((java.lang.String) r0)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
            java.lang.String r0 = "click_effect_entrance"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            java.lang.String r3 = r3.creationId
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            java.lang.String r3 = r3.mShootWay
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "draft_id"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            int r3 = r3.draftId
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (int) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
        L_0x0b6d:
            r26.ar()
            return
        L_0x0b71:
            r26.o()
            return
        L_0x0b75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.a(java.lang.Integer):void");
    }

    public final void a(boolean z2, boolean z3) {
        boolean z4 = false;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, h, false, 76403, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, h, false, 76403, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.o != null && !z3) {
            if (x()) {
                n(z2);
            } else {
                d(z2);
            }
        }
        if (!z2) {
            P();
            if (this.H != null) {
                this.H.c();
            }
        }
        this.S.j().setValue(Boolean.valueOf(z2));
        ar();
        this.x.h = z2;
        this.S.a().setValue(Boolean.valueOf(z2));
        a(!J() && !L() && this.z.mMusicPath != null);
        ((MutableLiveData) this.S.f().get(2)).setValue(Boolean.valueOf(z2));
        ((MutableLiveData) this.S.f().get(4)).setValue(Boolean.valueOf(z2 && l()));
        ((MutableLiveData) this.S.f().get(3)).setValue(Boolean.valueOf(z2 && n()));
        MutableLiveData mutableLiveData = (MutableLiveData) this.S.f().get(9);
        if (z2 && com.ss.android.ugc.aweme.shortvideo.edit.a.a.b()) {
            z4 = true;
        }
        mutableLiveData.setValue(Boolean.valueOf(z4));
        ((MutableLiveData) this.S.f().get(5)).setValue(Boolean.valueOf(z2));
        if (this.z.mIsFromDraft) {
            this.S.b().setValue(Boolean.valueOf(z2));
        }
        ((MutableLiveData) this.S.f().get(1)).setValue(Boolean.valueOf(z2));
        this.S.c().setValue(Boolean.valueOf(z2));
        if ((this.z.mIsFromDraft && (J() || L())) || this.z.isMvThemeVideoType()) {
            this.S.b().setValue(Boolean.FALSE);
        }
        boolean J2 = J();
        if (J2) {
            ((MutableLiveData) this.S.f().get(1)).setValue(Boolean.FALSE);
        }
        boolean L2 = L();
        if (L()) {
            ((MutableLiveData) this.S.f().get(1)).setValue(Boolean.FALSE);
        }
        if (!z2) {
            aq();
        }
        ((MutableLiveData) this.S.f().get(7)).setValue(Boolean.valueOf(z2));
        ((MutableLiveData) this.S.f().get(8)).setValue(Boolean.valueOf(z2));
        if (J2) {
            ((MutableLiveData) this.S.f().get(7)).setValue(Boolean.FALSE);
            ((MutableLiveData) this.S.f().get(8)).setValue(Boolean.FALSE);
        } else if (L2) {
            ((MutableLiveData) this.S.f().get(8)).setValue(Boolean.FALSE);
        }
        if (this.j) {
            ((MutableLiveData) this.S.f().get(6)).setValue(Boolean.valueOf(z2));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, h, false, 76404, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, h, false, 76404, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((MutableLiveData) this.S.g().get(8)).setValue(Boolean.valueOf(z2));
    }

    public final void a(String str, int i2, int i3, int i4, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, h, false, 76418, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z2)}, this, h, false, 76418, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        aw();
        int i5 = i2;
        boolean z3 = z2;
        be beVar = new be(this, str, i5, i3, z3);
        i.a((Callable<TResult>) beVar).a((a.g<TResult, TContinuationResult>) new bf<TResult,TContinuationResult>(this, z3, i4, i5), i.f1052b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Void a(boolean r27, int r28, int r29, a.i r30) throws java.lang.Exception {
        /*
            r26 = this;
            r7 = r26
            r26.ax()
            java.lang.Object r0 = r30.e()
            r8 = r0
            android.util.Pair r8 = (android.util.Pair) r8
            boolean r0 = r30.d()
            r9 = 0
            if (r0 != 0) goto L_0x036e
            boolean r0 = r30.c()
            if (r0 != 0) goto L_0x036e
            if (r8 == 0) goto L_0x036e
            java.lang.Object r0 = r8.first
            if (r0 == 0) goto L_0x036e
            java.lang.Object r0 = r8.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 >= 0) goto L_0x002b
            goto L_0x036e
        L_0x002b:
            r10 = 0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76419(0x12a83, float:1.07086E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r11 = 1
            if (r0 == 0) goto L_0x005b
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76419(0x12a83, float:1.07086E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r26
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x025a
        L_0x005b:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            boolean r0 = r0.hasInfoStickers()
            if (r0 != 0) goto L_0x009a
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = r0.mTimeEffect
            if (r0 != 0) goto L_0x009a
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r0 = r0.mEffectList
            boolean r0 = com.bytedance.common.utility.Lists.isEmpty(r0)
            if (r0 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r0 = r7.J
            if (r0 == 0) goto L_0x007f
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r0 = r7.J
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x009a
        L_0x007f:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r0 = r7.I
            if (r0 == 0) goto L_0x008b
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r0 = r7.I
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x009a
        L_0x008b:
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h r0 = r7.H
            if (r0 == 0) goto L_0x0097
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h r0 = r7.H
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x009a
        L_0x0097:
            r0 = 0
            goto L_0x025a
        L_0x009a:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r0 = r7.I
            if (r0 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r0 = r7.I
            r0.h()
            r0 = 1
            goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r1 = r7.J
            if (r1 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r0 = r7.J
            r0.h()
            r0 = 1
        L_0x00b0:
            if (r0 == 0) goto L_0x00b5
            r26.aB()
        L_0x00b5:
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h r0 = r7.H
            if (r0 == 0) goto L_0x0107
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h r0 = r7.H
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.story.shootvideo.textfont.h.f74197b
            r15 = 0
            r16 = 86148(0x15084, float:1.20719E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x00e3
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.story.shootvideo.textfont.h.f74197b
            r15 = 0
            r16 = 86148(0x15084, float:1.20719E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0107
        L_0x00e3:
            java.util.List<com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o> r1 = r0.f74198c
            java.util.Iterator r1 = r1.iterator()
        L_0x00e9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0107
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o r2 = (com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o) r2
            android.widget.FrameLayout r3 = r0.f74199d
            r3.removeView(r2)
            r1.remove()
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h$a r3 = r0.f74201f
            if (r3 == 0) goto L_0x00e9
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h$a r3 = r0.f74201f
            r3.a(r2)
            goto L_0x00e9
        L_0x0107:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper r0 = r7.o
            if (r0 == 0) goto L_0x01ca
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper r0 = r7.o
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper.f67201a
            r15 = 0
            r16 = 76832(0x12c20, float:1.07665E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0136
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper.f67201a
            r15 = 0
            r16 = 76832(0x12c20, float:1.07665E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x01ca
        L_0x0136:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r1 = r0.mInfoStickerEditView
            if (r1 == 0) goto L_0x01ca
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r0 = r0.mInfoStickerEditView
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.f67184a
            r15 = 0
            r16 = 76771(0x12be3, float:1.07579E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0164
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.f67184a
            r15 = 0
            r16 = 76771(0x12be3, float:1.07579E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x01ca
        L_0x0164:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b r0 = r0.h
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b.f67226a
            r22 = 0
            r23 = 76749(0x12bcd, float:1.07548E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r25 = java.lang.Void.TYPE
            r19 = r1
            r20 = r0
            r24 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
            if (r1 == 0) goto L_0x0196
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b.f67226a
            r22 = 0
            r23 = 76749(0x12bcd, float:1.07548E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r25 = java.lang.Void.TYPE
            r19 = r1
            r20 = r0
            r24 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x01ca
        L_0x0196:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y> r1 = r0.f67227b
            boolean r1 = com.bytedance.common.utility.Lists.isEmpty(r1)
            if (r1 != 0) goto L_0x01ca
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y> r1 = r0.f67227b
            java.util.Iterator r1 = r1.iterator()
        L_0x01a4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01c8
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y r2 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y) r2
            com.ss.android.vesdk.p r3 = r0.f67231f
            com.ss.android.ugc.aweme.n.b r4 = r2.f67432c
            int r4 = r4.id
            r3.f((int) r4)
            r1.remove()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a r3 = r0.g
            if (r3 == 0) goto L_0x01a4
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a r3 = r0.g
            com.ss.android.ugc.aweme.n.b r2 = r2.f67432c
            r3.b(r2)
            goto L_0x01a4
        L_0x01c8:
            r0.f67228c = r9
        L_0x01ca:
            dmt.av.video.VEVideoPublishEditViewModel r0 = r7.v
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r0 = r0.f82809c
            dmt.av.video.VEVideoPublishEditViewModel r1 = r7.v
            dmt.av.video.f r1 = r1.l()
            boolean r2 = com.bytedance.common.utility.Lists.isEmpty(r0)
            if (r2 != 0) goto L_0x0237
            int r2 = r0.size()
            int[] r2 = new int[r2]
            r3 = 0
        L_0x01e1:
            int r4 = r2.length
            if (r3 >= r4) goto L_0x01f3
            java.lang.Object r4 = r0.get(r3)
            com.ss.android.ugc.aweme.effect.EffectPointModel r4 = (com.ss.android.ugc.aweme.effect.EffectPointModel) r4
            int r4 = r4.getIndex()
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x01e1
        L_0x01f3:
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = dmt.av.video.p.f83050a
            r15 = 1
            r16 = 92008(0x16768, float:1.2893E-40)
            java.lang.Class[] r0 = new java.lang.Class[r11]
            java.lang.Class<int[]> r3 = int[].class
            r0[r10] = r3
            java.lang.Class<dmt.av.video.p> r18 = dmt.av.video.p.class
            r17 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x022a
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = dmt.av.video.p.f83050a
            r15 = 1
            r16 = 92008(0x16768, float:1.2893E-40)
            java.lang.Class[] r0 = new java.lang.Class[r11]
            java.lang.Class<int[]> r2 = int[].class
            r0[r10] = r2
            java.lang.Class<dmt.av.video.p> r18 = dmt.av.video.p.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            dmt.av.video.p r0 = (dmt.av.video.p) r0
            goto L_0x0234
        L_0x022a:
            dmt.av.video.p r0 = new dmt.av.video.p
            r0.<init>()
            r3 = 3
            r0.f83054e = r3
            r0.f83051b = r2
        L_0x0234:
            r1.setValue(r0)
        L_0x0237:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            boolean r0 = r0.hasInfoStickers()
            if (r0 == 0) goto L_0x0248
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            com.ss.android.ugc.aweme.n.a r0 = r0.infoStickerModel
            java.util.List<com.ss.android.ugc.aweme.n.b> r0 = r0.stickers
            r0.clear()
        L_0x0248:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r0 = r0.mEffectList
            boolean r0 = com.bytedance.common.utility.Lists.isEmpty(r0)
            if (r0 != 0) goto L_0x0259
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r0 = r0.mEffectList
            r0.clear()
        L_0x0259:
            r0 = 1
        L_0x025a:
            if (r0 == 0) goto L_0x026e
            android.content.Context r0 = r26.getApplicationContext()
            r1 = 2131561393(0x7f0d0bb1, float:1.8748185E38)
            java.lang.String r1 = r7.getString(r1)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r0, (java.lang.String) r1)
            r0.a()
        L_0x026e:
            java.lang.Object r0 = r8.second
            com.ss.android.ugc.aweme.shortvideo.f r0 = (com.ss.android.ugc.aweme.shortvideo.f) r0
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r7.O
            android.arch.lifecycle.MutableLiveData r1 = r1.a()
            java.lang.Object r1 = r1.getValue()
            if (r1 != 0) goto L_0x027f
            return r9
        L_0x027f:
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r7.O
            android.arch.lifecycle.MutableLiveData r1 = r1.a()
            java.lang.Object r1 = r1.getValue()
            com.ss.android.vesdk.p r1 = (com.ss.android.vesdk.p) r1
            int r1 = r1.t()
            com.ss.android.ugc.aweme.shortvideo.helper.MusicDragHelper r2 = r7.D
            r2.a((int) r1)
            if (r27 == 0) goto L_0x029d
            com.ss.android.ugc.aweme.shortvideo.helper.MusicDragHelper r2 = r7.D
            r3 = r28
            r2.a(r0, r3, r10)
        L_0x029d:
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            if (r0 == 0) goto L_0x02ed
            com.ss.android.ugc.aweme.effect.VEEffectHelper r0 = r7.C
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38681(0x9719, float:5.4204E-41)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r10] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x02df
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.VEEffectHelper.f3085a
            r15 = 0
            r16 = 38681(0x9719, float:5.4204E-41)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r10] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02ed
        L_0x02df:
            r0.A = r1
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r2 = r0.mEffectSeekLayout
            int r3 = r0.A
            r2.setVideoDuration(r3)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r0 = r0.mEffectSeekLayout
            r0.b(r10)
        L_0x02ed:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper r0 = r7.o
            if (r0 == 0) goto L_0x034a
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper r0 = r7.o
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper.f67201a
            r15 = 0
            r16 = 76833(0x12c21, float:1.07666E-40)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r10] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x032f
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper.f67201a
            r15 = 0
            r16 = 76833(0x12c21, float:1.07666E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r10] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x034a
        L_0x032f:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r2 = r0.mInfoStickerEditView
            if (r2 == 0) goto L_0x0339
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r2 = r0.mInfoStickerEditView
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b r2 = r2.h
            r2.f67229d = r1
        L_0x0339:
            boolean r2 = r0.k
            if (r2 == 0) goto L_0x034a
            com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel r2 = r0.f67205e
            if (r2 == 0) goto L_0x0345
            com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel r2 = r0.f67205e
            r2.n = r1
        L_0x0345:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView r0 = r0.mVideoEditView
            r0.a((int) r1)
        L_0x034a:
            android.arch.lifecycle.Lifecycle r0 = r26.getLifecycle()
            android.arch.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            android.arch.lifecycle.Lifecycle$State r1 = android.arch.lifecycle.Lifecycle.State.RESUMED
            if (r0 != r1) goto L_0x036d
            dmt.av.video.VEVideoPublishEditViewModel r0 = r7.v
            android.arch.lifecycle.MutableLiveData r0 = r0.m()
            r1 = r29
            long r1 = (long) r1
            dmt.av.video.s r1 = dmt.av.video.s.b(r1)
            r0.setValue(r1)
            dmt.av.video.s r1 = dmt.av.video.s.a()
            r0.setValue(r1)
        L_0x036d:
            return r9
        L_0x036e:
            android.content.Context r0 = r26.getApplicationContext()
            r1 = 2131561392(0x7f0d0bb0, float:1.8748183E38)
            java.lang.String r1 = r7.getString(r1)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
            r0.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.a(boolean, int, int, a.i):java.lang.Void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(i iVar) throws Exception {
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.d dVar = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.d) iVar.e();
        if (dVar != null) {
            com.ss.android.ugc.aweme.n.b bVar = new com.ss.android.ugc.aweme.n.b(this.I.v, dVar.stickerPath, "", dVar.index, false, 0, a().t());
            bVar.type = 1;
            bVar.isImageStickerLayer = true;
            a(bVar);
        }
        return null;
    }

    public final MobClick a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, h, false, 76432, new Class[]{String.class}, MobClick.class)) {
            return MobClick.obtain().setLabelName("mid_page").setEventName(str2).setJsonObject(H());
        }
        return (MobClick) PatchProxy.accessDispatch(new Object[]{str2}, this, h, false, 76432, new Class[]{String.class}, MobClick.class);
    }

    public final void a(@NonNull com.ss.android.ugc.aweme.base.activity.a aVar) {
        com.ss.android.ugc.aweme.base.activity.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, h, false, 76436, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, h, false, 76436, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE);
            return;
        }
        this.W.add(aVar2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void V() {
        l(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void W() throws Exception {
        aB();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Y() {
        l(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit ak() {
        F();
        return null;
    }

    public final boolean y() {
        if (this.L > 0) {
            return true;
        }
        return false;
    }

    public final boolean K() {
        if (this.z == null || this.z.videoType != 5) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void af() {
        this.J.a(a(), K());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void ag() {
        this.I.a(a(), K());
    }

    private void az() {
        this.z.mOutPutWavFile = this.z.mvCreateVideoData.contactVideoPath;
        this.z.mPath = this.z.mOutPutWavFile;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void ab() {
        com.ss.android.ugc.aweme.port.in.a.p.a();
        ej.a().a(this.p);
        finish();
    }

    private boolean am() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76358, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 76358, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.RecommentMusicByAIPolicy) != 0) {
            z2 = true;
        }
        return z2;
    }

    private VEEditorAutoStartStopArbiter ao() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 76375, new Class[0], VEEditorAutoStartStopArbiter.class)) {
            return this.P.d();
        }
        return (VEEditorAutoStartStopArbiter) PatchProxy.accessDispatch(new Object[0], this, h, false, 76375, new Class[0], VEEditorAutoStartStopArbiter.class);
    }

    private void aq() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76400, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76400, new Class[0], Void.TYPE);
            return;
        }
        ((MutableLiveData) this.S.h().get(2)).postValue(Boolean.FALSE);
    }

    private void ar() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76401, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76401, new Class[0], Void.TYPE);
            return;
        }
        this.S.i().setValue(null);
    }

    private boolean as() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76406, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 76406, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.z != null && this.z.isMvThemeVideoType()) {
            z2 = true;
        }
        return z2;
    }

    private boolean at() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76407, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 76407, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.z == null || this.z.isMusic() != 1) {
            return false;
        } else {
            return true;
        }
    }

    private void ax() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76425, new Class[0], Void.TYPE);
            return;
        }
        if (this.U != null) {
            this.U.dismiss();
            this.U = null;
        }
    }

    private Gson ay() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 76426, new Class[0], Gson.class)) {
            return com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson();
        }
        return (Gson) PatchProxy.accessDispatch(new Object[0], this, h, false, 76426, new Class[0], Gson.class);
    }

    private boolean l() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 76356, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableInfoSticker);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 76356, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private boolean n() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 76357, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableTextStickerInMain);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 76357, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void A() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76369, new Class[0], Void.TYPE);
            return;
        }
        if (this.H != null) {
            this.H.c();
        }
    }

    public final void F() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76383, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76383, new Class[0], Void.TYPE);
            return;
        }
        this.v.m().setValue(dmt.av.video.s.a());
    }

    public final boolean J() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76405, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 76405, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!StringUtils.isEmpty(this.z.getDuetFrom())) {
            z2 = true;
        }
        return z2;
    }

    public final void P() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76440, new Class[0], Void.TYPE);
            return;
        }
        if (this.I != null) {
            this.I.f();
        }
        if (this.J != null) {
            this.J.f();
        }
    }

    public final Map Q() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76444, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, h, false, 76444, new Class[0], Map.class);
        }
        HashMap hashMap = new HashMap();
        if (this.z != null) {
            hashMap.put("creation_id", this.z.creationId);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Z() {
        if (this.z.recordMode == 1) {
            r.a("back_to_shoot_confirm", (Map) new com.ss.android.ugc.aweme.app.d.d().a("to_status", "confirm").a("prop_id", this.z.mStickerID).a("shoot_way", this.z.mShootWay).a("creation_id", this.z.creationId).f34114b);
        }
        finish();
    }

    @Nullable
    public final p a() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 76387, new Class[0], p.class)) {
            return (p) this.O.a().getValue();
        }
        return (p) PatchProxy.accessDispatch(new Object[0], this, h, false, 76387, new Class[0], p.class);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void aa() {
        if (this.z.recordMode == 1) {
            r.a("back_to_shoot_confirm", (Map) new com.ss.android.ugc.aweme.app.d.d().a("to_status", "cancel").a("prop_id", this.z.mStickerID).a("shoot_way", this.z.mShootWay).a("creation_id", this.z.creationId).f34114b);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void al() {
        this.z.voiceVolume = ((float) this.B.f68104c) / 100.0f;
        this.z.musicVolume = ((float) this.B.f68103b) / 100.0f;
        this.B.c(false);
        a(true, false);
        d(true);
    }

    public final MutableLiveData<dmt.av.video.s> b() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 76388, new Class[0], MutableLiveData.class)) {
            return this.v.m();
        }
        return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, h, false, 76388, new Class[0], MutableLiveData.class);
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76397, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76397, new Class[0], Void.TYPE);
            return;
        }
        ((MutableLiveData) this.S.h().get(1)).postValue(Boolean.TRUE);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76366, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76366, new Class[0], Void.TYPE);
            return;
        }
        m(false);
        overridePendingTransition(0, C0906R.anim.s);
        super.finish();
    }

    public int getStatusBarColor() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 76325, new Class[0], Integer.TYPE)) {
            return getResources().getColor(C0906R.color.ano);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 76325, new Class[0], Integer.TYPE)).intValue();
    }

    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76339, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76339, new Class[0], Void.TYPE);
            return;
        }
        this.B = new VolumeHelper(this.z.isMuted);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76364, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76364, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (n()) {
            this.T.removeCallbacks(this.Z);
        }
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76396, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76396, new Class[0], Void.TYPE);
            return;
        }
        ((MutableLiveData) this.S.h().get(2)).postValue(Boolean.TRUE);
    }

    public final void s() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76399, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76399, new Class[0], Void.TYPE);
            return;
        }
        if (this.j) {
            ((MutableLiveData) this.S.h().get(6)).postValue(Boolean.TRUE);
        }
    }

    public final boolean x() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 76355, new Class[0], Boolean.TYPE)) {
            return ((Boolean) this.v.s().getValue()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 76355, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private RecordScene aA() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76431, new Class[0], RecordScene.class)) {
            return (RecordScene) PatchProxy.accessDispatch(new Object[0], this, h, false, 76431, new Class[0], RecordScene.class);
        }
        RecordScene audioTrack = new RecordScene().musicPath(this.z.mMusicPath).musicStart(this.z.mMusicStart).faceBeauty(this.z.mFaceBeauty).videoSegment(this.z.mVideoSegmentsDesc).hardEncode(this.z.mHardEncode).mp4Path(this.z.mPath).maxDuration(this.z.maxDuration).audioTrack(this.z.audioTrack);
        ej.a().f67533f = audioTrack;
        return audioTrack;
    }

    private void aC() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76441, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76441, new Class[0], Void.TYPE);
            return;
        }
        if (this.z.infoStickerModel != null && !CollectionUtils.isEmpty(this.z.infoStickerModel.stickers)) {
            Iterator<com.ss.android.ugc.aweme.n.b> it2 = this.z.infoStickerModel.stickers.iterator();
            while (it2.hasNext()) {
                com.ss.android.ugc.aweme.n.b next = it2.next();
                if (next.type == 1 && this.I != null) {
                    this.I.a(next.path);
                    this.I.v = next.stickerId;
                    it2.remove();
                }
            }
        }
    }

    private boolean an() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76359, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 76359, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableVoiceConversion) || J() || L() || K() || as() || at()) {
            return false;
        } else {
            return true;
        }
    }

    private void au() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76415, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76415, new Class[0], Void.TYPE);
            return;
        }
        new a.C0185a(this).b((int) C0906R.string.j9).b(getString(C0906R.string.pm), (DialogInterface.OnClickListener) new bb(this)).a(getString(C0906R.string.p0), (DialogInterface.OnClickListener) new bc(this)).a().a();
    }

    private void aw() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76424, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76424, new Class[0], Void.TYPE);
            return;
        }
        if (this.U == null) {
            this.U = com.ss.android.ugc.aweme.shortvideo.view.c.a(this, getResources().getString(C0906R.string.brl));
            if (this.U != null) {
                this.U.setIndeterminate(true);
            }
        }
    }

    /* access modifiers changed from: private */
    public String e() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76328, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, h, false, 76328, new Class[0], String.class);
        } else if (this.z.getAvetParameter() != null) {
            return this.z.getAvetParameter().getContentType();
        } else {
            if (this.z.isMvThemeVideoType()) {
                return "mv";
            }
            return "video";
        }
    }

    /* access modifiers changed from: private */
    public String g() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76329, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, h, false, 76329, new Class[0], String.class);
        } else if (this.z.getAvetParameter() != null) {
            return this.z.getAvetParameter().getContentSource();
        } else {
            if (this.z.mFromCut || this.z.mFromMultiCut || this.z.isMvThemeVideoType()) {
                return "upload";
            }
            return "shoot";
        }
    }

    private int k() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76350, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 76350, new Class[0], Integer.TYPE)).intValue();
        } else if (fc.a()) {
            return (((fc.e(this) - this.C.d()) - this.C.e()) - fc.c(this)) - fc.d(this);
        } else {
            return (findViewById(C0906R.id.cga).getHeight() - this.C.d()) - this.C.e();
        }
    }

    public final void B() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76373, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76373, new Class[0], Void.TYPE);
            return;
        }
        if (ao() != null) {
            ao().a(true);
        }
        if (this.O.a().getValue() != null) {
            ((p) this.O.a().getValue()).r();
        }
    }

    public final void C() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76374, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76374, new Class[0], Void.TYPE);
            return;
        }
        if (ao() != null) {
            ao().a(false);
        }
        if (this.O.a().getValue() != null) {
            ((p) this.O.a().getValue()).q();
        }
    }

    public final boolean G() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76389, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 76389, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.X || (this.z.isMvThemeVideoType() && !com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEditPageMVMemoryOpt))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final JSONObject H() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 76391, new Class[0], JSONObject.class)) {
            return com.ss.android.ugc.aweme.app.d.c.a().a("shoot_way", this.z.mShootWay).a("route", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a("is_photo", (Integer) 0).a("position", "mid_page").b();
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, h, false, 76391, new Class[0], JSONObject.class);
    }

    public final boolean L() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76408, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 76408, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.z.getReactionParams() == null || StringUtils.isEmpty(this.z.getReactionParams().reactionFromId)) {
            return false;
        } else {
            return true;
        }
    }

    public final void R() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76445, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76445, new Class[0], Void.TYPE);
            return;
        }
        if (this.z.isMvThemeVideoType()) {
            p a2 = a();
            if (a2 != null) {
                if (!p.B) {
                    throw new com.ss.android.vesdk.r(-1, "The MV resource has not been initialized yet, please call the init2 method");
                } else if (a2.A != null) {
                    MVInfoBean mVInfoBean = a2.A;
                    if (mVInfoBean != null && mVInfoBean.width > 0 && mVInfoBean.height > 0) {
                        this.z.mVideoWidth = mVInfoBean.width;
                        this.z.mVideoHeight = mVInfoBean.height;
                    }
                } else {
                    throw new com.ss.android.vesdk.r(-1, "MV资源信息构建失败");
                }
            }
        }
    }

    public final void S() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76448, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76448, new Class[0], Void.TYPE);
            return;
        }
        this.P.a(this.G);
        this.P.a(this.F);
        this.P.a(this.f3938f);
        if (!(this.o == null || this.o.mInfoStickerEditView == null)) {
            this.P.a(this.o.mInfoStickerEditView);
        }
    }

    public final void T() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76449, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76449, new Class[0], Void.TYPE);
            return;
        }
        if (this.J != null) {
            r.a("poll_edit", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.z.creationId).a("shoot_way", this.z.mShootWay).a("content_type", e()).a("content_source", g()).a("enter_from", "video_edit_page").a("prop_id", this.J.w).f34114b);
        }
    }

    public final void U() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76450, new Class[0], Void.TYPE);
            return;
        }
        if (this.J != null) {
            r.a("poll_edit_complete", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.z.creationId).a("shoot_way", this.z.mShootWay).a("content_type", e()).a("content_source", g()).a("enter_from", "video_edit_page").a("prop_id", this.J.w).f34114b);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void ad() {
        int i2;
        if (com.ss.android.g.a.b()) {
            i2 = Math.min(15000, a().t());
        } else {
            i2 = a().t();
        }
        this.v.p().setValue(dmt.av.video.r.a(this.D.f68086e, i2));
        int a2 = a().a(0, p.d.EDITOR_SEEK_FLAG_LastSeek, this.aa);
        if (a2 != 0) {
            throw VEVideoPublishEditFragment.a(a2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void ai() {
        com.ss.android.ugc.aweme.video.b.b(new File(ff.g));
        String md5Hex = DigestUtils.md5Hex(this.z.mPath);
        com.ss.android.ugc.aweme.video.b.b(ff.o + md5Hex + File.separator, ff.g);
        com.ss.android.ugc.aweme.video.b.b(ff.h + md5Hex + File.separator, ff.g);
        com.ss.android.b.a.a.a.b(new bp(this));
    }

    public void m() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76384, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76384, new Class[0], Void.TYPE);
            return;
        }
        this.v.d().setValue(new t());
        this.q = this.z.mMusicPath;
        this.z.mMusicPath = "";
        this.z.musicId = "";
        this.z.mMusicStart = 0;
        this.z.mMusicOrigin = "";
        a(false);
        c(true);
        this.z.musicVolume = 0.5f;
        MutableLiveData<dmt.av.video.s> m2 = this.v.m();
        m2.setValue(dmt.av.video.s.b(0));
        m2.setValue(dmt.av.video.s.a());
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76361, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76361, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        r.a("av_memory_log", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.z.creationId).a("enter_from", "video_edit_page").a("dalvikPss", aa.a().g).a("nativePss", aa.a().h).a("otherPss", aa.a().j).a("totalPss", aa.a().i).f34114b);
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76398, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76398, new Class[0], Void.TYPE);
            return;
        }
        View a2 = this.R.a();
        if (a2 == null) {
            a2 = this.Q.b();
        }
        if (a2 != null) {
            if (a2.getVisibility() != 0) {
                this.Y = true;
                return;
            }
            this.Y = false;
            ((MutableLiveData) this.S.h().get(4)).postValue(Boolean.TRUE);
        }
    }

    public final com.ss.android.ugc.aweme.app.d.d u() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 76330, new Class[0], com.ss.android.ugc.aweme.app.d.d.class)) {
            return com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.z.creationId).a("shoot_way", this.z.mShootWay).a("content_type", e()).a("content_source", g()).a("enter_from", "video_edit_page");
        }
        return (com.ss.android.ugc.aweme.app.d.d) PatchProxy.accessDispatch(new Object[0], this, h, false, 76330, new Class[0], com.ss.android.ugc.aweme.app.d.d.class);
    }

    private void aB() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76439, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76439, new Class[0], Void.TYPE);
            return;
        }
        if (this.I != null) {
            if (this.f3935c == null) {
                this.f3935c = new LinkedList<>();
            }
            this.f3935c.clear();
            if (this.O.a().getValue() != null) {
                this.I.o = ((p) this.O.a().getValue()).d();
                this.J.o = ((p) this.O.a().getValue()).d();
            }
            InteractStickerStruct i2 = this.I.i();
            if (i2 != null) {
                this.f3935c.add(i2);
            }
            InteractStickerStruct i3 = this.J.i();
            if (i3 != null) {
                this.f3935c.add(i3);
            }
            this.z.mainBusinessData = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.z.mainBusinessData, (List<InteractStickerStruct>) this.f3935c, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT);
        }
    }

    private void aD() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76443, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76443, new Class[0], Void.TYPE);
        } else if (this.H != null) {
            boolean z3 = !this.H.e();
            if (this.z.infoStickerModel != null && !CollectionUtils.isEmpty(this.z.infoStickerModel.stickers)) {
                Iterator<com.ss.android.ugc.aweme.n.b> it2 = this.z.infoStickerModel.stickers.iterator();
                while (it2.hasNext()) {
                    com.ss.android.ugc.aweme.n.b next = it2.next();
                    if (next.type == 2) {
                        if (z3) {
                            if (!z2) {
                                this.H.a(a(), K());
                                z2 = true;
                            }
                            TextStickerData textStickerData = (TextStickerData) ay().fromJson(next.extra, TextStickerData.class);
                            if (textStickerData != null) {
                                this.H.a(textStickerData);
                            }
                        }
                        it2.remove();
                    }
                }
            }
        }
    }

    private void ap() {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76380, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76380, new Class[0], Void.TYPE);
            return;
        }
        if (fc.a()) {
            h(true);
        }
        this.C.a(false, this.C.e());
        MutableLiveData<w> f2 = this.v.f();
        int color = getResources().getColor(C0906R.color.h7);
        int d2 = this.C.d();
        if (fc.a()) {
            i2 = fc.c(this);
        } else {
            i2 = 0;
        }
        int i4 = d2 + i2;
        int e2 = this.C.e();
        int k2 = k();
        if (fc.a()) {
            i3 = fb.b(this, fb.f67663b);
        } else {
            i3 = 0;
        }
        f2.setValue(w.b(color, i4, e2, k2, i3, 0));
        a(true, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void ac() {
        String str;
        P();
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76427, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76427, new Class[0], Void.TYPE);
        } else if (this.z.isMvThemeVideoType()) {
            az();
            if (!this.V) {
                this.V = true;
                if (PatchProxy.isSupport(new Object[0], this, h, false, 76428, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, h, false, 76428, new Class[0], Void.TYPE);
                } else if (TextUtils.isEmpty(this.z.mvCreateVideoData.videoCoverImgPath)) {
                    com.ss.android.ugc.aweme.x.a aVar = this.z.mvCreateVideoData;
                    if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.f68504a, true, 78105, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.f68504a, true, 78105, new Class[0], String.class);
                    } else {
                        String str2 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.a("cover_tmp") + File.separator;
                        str = str2 + com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.b(".png");
                    }
                    aVar.videoCoverImgPath = str;
                }
                new com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.a(a(), this.z.mvCreateVideoData.videoCoverImgPath, this.z.mvCreateVideoData.videoCoverStartTime, new bl(this));
                return;
            }
            l(false);
        } else {
            l(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void ae() {
        int i2;
        this.z.mMusicStart = this.D.f68086e;
        if (com.ss.android.g.a.b()) {
            i2 = Math.min(15000, a().t());
        } else {
            i2 = a().t();
        }
        this.z.mMusicEnd = this.D.f68086e + i2;
        a(true, false);
        this.D.a(false);
        d(true);
        ao().a(false);
        this.v.p().setValue(dmt.av.video.r.a(this.z.mMusicStart, i2));
        if (this.z.getWavFile() != null) {
            this.v.o().setValue(VEVolumeChangeOp.ofVoice(this.z.voiceVolume));
        }
        i();
        if (this.z.isMvThemeVideoType() && this.z.mvCreateVideoData.mvType == 1) {
            a(this.z.mMusicPath, this.z.mMusicStart, this.z.mMusicEnd, -1, false);
        }
    }

    public void o() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76352, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76352, new Class[0], Void.TYPE);
            return;
        }
        P();
        ar();
        this.v.m().setValue(dmt.av.video.s.b());
        String str3 = this.z.mStickerID;
        if (str3 != null) {
            str3 = str3.split(",")[0];
        }
        String str4 = str3;
        if (this.z == null || CollectionUtils.isEmpty(this.z.challenges)) {
            str = null;
        } else {
            str = ((com.ss.android.ugc.aweme.shortvideo.c) this.z.challenges.get(0)).cid;
        }
        y yVar = this.u;
        VEVideoPublishEditActivity I2 = I();
        if (this.z == null) {
            str2 = null;
        } else {
            str2 = this.z.mFirstStickerMusicIdsJson;
        }
        yVar.a(I2, 110, str2, str4, str, this.z.isAllowClearMusic(), this.z.mShootWay, this.z.creationId, new ac(this), new ad(this));
        r.a("change_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.z.creationId).a("shoot_way", this.z.mShootWay).a("draft_id", this.z.draftId).a("enter_from", "video_edit_page").f34114b);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r23 = this;
            r7 = r23
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 76365(0x12a4d, float:1.0701E-40)
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76365(0x12a4d, float:1.0701E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            com.ss.android.ugc.aweme.shortvideo.util.aa r0 = com.ss.android.ugc.aweme.shortvideo.util.aa.a()
            r0.c()
            super.onDestroy()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r0 = r7.J
            if (r0 == 0) goto L_0x00b3
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r0 = r7.J
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b.u
            r12 = 0
            r13 = 77132(0x12d4c, float:1.08085E-40)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x005d
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b.u
            r12 = 0
            r13 = 77132(0x12d4c, float:1.08085E-40)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00b3
        L_0x005d:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout r0 = r0.x
            if (r0 == 0) goto L_0x00b3
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
            r19 = 0
            r20 = 77152(0x12d60, float:1.08113E-40)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x0091
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
            r19 = 0
            r20 = 77152(0x12d60, float:1.08113E-40)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00b3
        L_0x0091:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x00b3
            android.widget.FrameLayout r1 = r0.f67341c
            if (r1 != 0) goto L_0x00a0
            java.lang.String r2 = "root"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00a0:
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.f67342d
            if (r0 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f r2 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f
            r2.<init>(r0)
            r0 = r2
        L_0x00ae:
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r0
            r1.removeOnGlobalLayoutListener(r0)
        L_0x00b3:
            com.ss.android.ugc.aweme.ao.a r0 = com.ss.android.ugc.aweme.port.in.a.i
            r1 = 0
            r0.a((com.ss.android.ugc.aweme.ao.a.g) r1)
            com.ss.android.ugc.aweme.port.in.ae r0 = com.ss.android.ugc.aweme.port.in.a.m
            r2 = 1
            r0.a((com.ss.android.ugc.aweme.port.in.ae.b) r1, (android.support.v4.app.FragmentActivity) r1, (boolean) r2)
            r7.m(r8)
            com.ss.android.ugc.aweme.story.shootvideo.textfont.d r0 = com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a()
            r0.g()
            r7.V = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.onDestroy():void");
    }

    public final void t() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76394, new Class[0], Void.TYPE);
            return;
        }
        this.f3933a = new b.a(I()).b((int) C0906R.string.i1).a(3000).a(true).a();
        this.f3933a.update();
        RTLImageView rTLImageView = new RTLImageView(this);
        rTLImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        rTLImageView.setImageResource(2130837629);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, -1200, 0, 0);
        rTLImageView.setLayoutParams(layoutParams);
        this.i.addView(rTLImageView);
        View view = this.Q.l.get(9);
        if (view != null) {
            this.T.post(new av(this, view, rTLImageView));
        }
    }

    public final void w() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76335, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76335, new Class[0], Void.TYPE);
        } else if (fc.a()) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y.a(this.z.mVideoWidth, this.z.mVideoHeight);
            if (this.I != null) {
                this.I.a(K());
            }
            if (this.H != null) {
                this.H.a(K());
            }
            if (this.o != null) {
                ViewGroup.MarginLayoutParams a2 = this.P.a();
                this.o.a(this.P.b(), this.P.c(), new int[]{a2.leftMargin, a2.topMargin, a2.rightMargin, a2.bottomMargin});
            }
            switch (fb.f67663b) {
                case 1:
                    i(true);
                    j(true);
                    return;
                case 2:
                    i(false);
                    j(true);
                    return;
                case 3:
                    i(true);
                    j(false);
                    return;
                case 4:
                    i(true);
                    j(true);
                    return;
                case 5:
                    i(false);
                    j(true);
                    return;
                case 6:
                    i(true);
                    j(false);
                    return;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                    i(false);
                    j(false);
                    return;
                default:
                    i(false);
                    j(false);
                    return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: av */
    public void X() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76420, new Class[0], Void.TYPE);
            return;
        }
        if (this.I != null) {
            this.I.h();
            z2 = true;
        }
        if (this.J != null) {
            this.J.h();
            z2 = true;
        }
        if (z2) {
            aB();
        }
        ej.a().a(this.p);
        if (!this.z.mIsFromDraft) {
            r.a("enter_video_shoot_page", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.z.creationId).a("shoot_way", this.z.mShootWay).a("draft_id", this.z.draftId).a("filter_list", this.z.mCurFilterLabels).a("filter_id_list", this.z.mCurFilterIds).a("content_type", e()).a("content_source", g()).f34114b);
            ej.a().c();
            ej.a().a((Collection<com.ss.android.ugc.aweme.shortvideo.c>) this.z.challenges);
            finish();
            return;
        }
        this.z.mMusicPath = this.q;
        if (!this.s) {
            com.bytedance.ies.dmt.ui.d.a.c(getApplicationContext(), (int) C0906R.string.aeo).a();
            return;
        }
        if (!com.ss.android.ugc.aweme.video.b.b(this.z.mStickerPath)) {
            this.z.mStickerPath = null;
            this.z.mStickerID = "";
        }
        if (aA().isSegmentsNotValid()) {
            a((int) C0906R.string.dry, (int) C0906R.string.pm, (int) C0906R.string.aja);
            return;
        }
        Intent intent = new Intent(this, VideoRecordPermissionActivity.class);
        intent.putExtra("shoot_way", this.z.mShootWay);
        intent.putExtra("name", new File(this.z.mPath).getName());
        if (this.z.mWavFile != null) {
            intent.putExtra("wav", this.z.mWavFile);
        }
        if (this.z.veCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", this.z.veCherEffectParam);
        }
        intent.putExtra("restore", 1);
        intent.putExtra("workspace", this.z.mWorkspace);
        intent.putExtra("translation_type", 3);
        intent.putExtra("video_edit_model", this.z);
        intent.putExtra("path", this.z.mMusicPath);
        intent.putExtra("creation_id", this.z.creationId);
        intent.putExtra("draft_id", this.z.draftId);
        aj.a("video_post_page");
        intent.putExtra("video_title", this.z.title);
        intent.putExtra("struct_list", (Serializable) this.z.structList);
        intent.putExtra("is_rivate", this.z.isPrivate);
        intent.putExtra("comment_setting", this.z.commentSetting);
        startActivity(intent);
        ej.a().c();
        ej.a().a((Collection<com.ss.android.ugc.aweme.shortvideo.c>) this.z.challenges);
        com.ss.android.common.lib.a.a(this, "edit", "draft", 0, 0, H());
        finish();
    }

    /* access modifiers changed from: package-private */
    public final void D() {
        int i2;
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76378, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76378, new Class[0], Void.TYPE);
            return;
        }
        if (!this.D.f68085d) {
            if (com.ss.android.g.a.b()) {
                i2 = Math.min(15000, a().t());
            } else {
                i2 = a().t();
            }
            MusicDragHelper a2 = this.D.a(i2);
            View findViewById = findViewById(C0906R.id.cga);
            if (PatchProxy.isSupport(new Object[]{findViewById}, a2, MusicDragHelper.f68082a, false, 77461, new Class[]{View.class}, MusicDragHelper.class)) {
                MusicDragHelper musicDragHelper = a2;
                a2 = (MusicDragHelper) PatchProxy.accessDispatch(new Object[]{findViewById}, musicDragHelper, MusicDragHelper.f68082a, false, 77461, new Class[]{View.class}, MusicDragHelper.class);
            } else if (!a2.f68085d) {
                a2.f68084c = ((ViewStub) findViewById.findViewById(C0906R.id.cwx)).inflate();
                ButterKnife.bind((Object) a2, a2.f68084c);
                if (PatchProxy.isSupport(new Object[0], a2, MusicDragHelper.f68082a, false, 77466, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], a2, MusicDragHelper.f68082a, false, 77466, new Class[0], Void.TYPE);
                } else {
                    a2.mTextViewTotalTime.setText(ey.a(a2.f68087f));
                    a2.mTextViewTimeStart.setText(a2.f68084c.getContext().getString(C0906R.string.cnl));
                    a2.f68083b = new ImageView(a2.f68084c.getContext());
                    a2.f68083b.setImageResource(2130838816);
                    a2.f68083b.setScaleType(ImageView.ScaleType.FIT_XY);
                    a2.f68084c.postDelayed(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f68090a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f68090a, false, 77480, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f68090a, false, 77480, new Class[0], Void.TYPE);
                                return;
                            }
                            MusicDragHelper.this.slideContainer.addView(MusicDragHelper.this.f68083b);
                            MusicDragHelper.this.f68083b.post(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68092a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f68092a, false, 77481, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f68092a, false, 77481, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    MusicDragHelper.this.f68083b.setX(MusicDragHelper.this.mKTVView.getX() - ((float) (MusicDragHelper.this.f68083b.getWidth() / 2)));
                                    MusicDragHelper.this.mKTVView.setLength(MusicDragHelper.this.a());
                                    MusicDragHelper.this.f68083b.setOnTouchListener(MusicDragHelper.this);
                                }
                            });
                        }
                    }, 10);
                    a2.cutMusicLayout.setBubbleTextViewAttrite(f.c(a2.cutMusicLayout.getContext()));
                    a2.cutMusicLayout.setScrollListener(new DmtCutMusicScrollView.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f68094a;

                        public final void a(float f2) {
                            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f68094a, false, 77482, new Class[]{Float.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f68094a, false, 77482, new Class[]{Float.TYPE}, Void.TYPE);
                                return;
                            }
                            MusicDragHelper.this.f68086e = (int) (((float) MusicDragHelper.this.f68087f) * f2);
                            if (MusicDragHelper.this.n != null) {
                                MusicDragHelper.this.n.a();
                            }
                        }

                        public final void b(float f2) {
                            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f68094a, false, 77483, new Class[]{Float.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f68094a, false, 77483, new Class[]{Float.TYPE}, Void.TYPE);
                                return;
                            }
                            MusicDragHelper.this.cutMusicLayout.setTimeBubble((int) (((float) MusicDragHelper.this.f68087f) * f2));
                        }
                    });
                    a2.cutMusicLayout.a((((float) a2.f68086e) * 1.0f) / ((float) a2.f68087f));
                    a2.cutMusicLayout.setTimeBubble(a2.f68086e);
                }
                a2.f68084c.bringToFront();
                a2.f68085d = true;
                a2.i.post(a2.j);
            }
            a2.m = new ar(this);
            a2.n = new as(this);
            this.D.a(false);
            f.a().a((Context) this);
            f.a().f66699f = i2;
            com.ss.android.ugc.aweme.shortvideo.e b2 = ej.a().b();
            StringBuilder sb = new StringBuilder("OLD_DRAFT avMusicIsNull:");
            if (b2 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sb.append(z2);
            ai.a(sb.toString());
            if (b2 != null) {
                com.ss.android.ugc.aweme.shortvideo.f a3 = com.ss.android.ugc.aweme.port.in.a.i.a(getIntent().getSerializableExtra("music_wave_data"));
                StringBuilder sb2 = new StringBuilder("OLD_DRAFT musicWaveBeanIsNull:");
                if (a3 == null) {
                    z3 = true;
                }
                sb2.append(z3);
                ai.a(sb2.toString());
                if (a3 != null) {
                    this.D.a(a3, b2.getDuration(), this.z.mMusicStart);
                    return;
                }
                f.a().a(b2.path, (f.a) new at(this, b2));
            }
        }
    }

    public final void E() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76379, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76379, new Class[0], Void.TYPE);
            return;
        }
        if (this.z.mMusicPath != null) {
            a(false, false);
            if (this.z.getWavFile() != null) {
                this.v.o().setValue(VEVolumeChangeOp.ofVoice(0.0f));
            }
            MusicDragHelper musicDragHelper = this.D;
            musicDragHelper.f68087f = com.ss.android.ugc.aweme.port.in.a.i.b(this.z.mMusicPath);
            if (PatchProxy.isSupport(new Object[0], musicDragHelper, MusicDragHelper.f68082a, false, 77469, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], musicDragHelper, MusicDragHelper.f68082a, false, 77469, new Class[0], Void.TYPE);
            } else if (musicDragHelper.f68085d) {
                musicDragHelper.mTextViewTotalTime.setText(ey.a(musicDragHelper.f68087f));
            }
            this.D.f68086e = this.z.mMusicStart;
            MusicDragHelper musicDragHelper2 = this.D;
            if (PatchProxy.isSupport(new Object[0], musicDragHelper2, MusicDragHelper.f68082a, false, 77465, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], musicDragHelper2, MusicDragHelper.f68082a, false, 77465, new Class[0], Void.TYPE);
            } else if (!(!musicDragHelper2.f68085d || musicDragHelper2.f68083b == null || musicDragHelper2.mKTVView == null)) {
                double d2 = (double) musicDragHelper2.f68086e;
                Double.isNaN(d2);
                double width = (double) musicDragHelper2.mKTVView.getWidth();
                Double.isNaN(width);
                double d3 = d2 * 1.0d * width;
                double d4 = (double) musicDragHelper2.f68087f;
                Double.isNaN(d4);
                int i2 = (int) (d3 / d4);
                musicDragHelper2.f68083b.setX((musicDragHelper2.mKTVView.getX() + ((float) i2)) - ((float) (musicDragHelper2.f68083b.getWidth() / 2)));
                musicDragHelper2.mKTVView.setStart(i2);
                musicDragHelper2.mKTVView.setLength(musicDragHelper2.a());
                musicDragHelper2.mTextViewTimeStart.setText(ey.a(musicDragHelper2.f68086e));
            }
            this.D.a(true);
            int a2 = a().a(0, p.d.EDITOR_SEEK_FLAG_LastSeek, this.aa);
            if (a2 == 0) {
                MusicDragHelper musicDragHelper3 = this.D;
                if (PatchProxy.isSupport(new Object[0], musicDragHelper3, MusicDragHelper.f68082a, false, 77477, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], musicDragHelper3, MusicDragHelper.f68082a, false, 77477, new Class[0], Void.TYPE);
                } else {
                    musicDragHelper3.k.a(musicDragHelper3.l);
                }
                r.onEvent(a("music_edit"));
            } else {
                throw VEVideoPublishEditFragment.a(a2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void ah() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = h
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 76372(0x12a54, float:1.0702E-40)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = h
            r5 = 0
            r6 = 76372(0x12a54, float:1.0702E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r1 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a
            r1.<init>()
            r12.I = r1
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r1 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b
            r1.<init>()
            r12.J = r1
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r1 = r12.I
            com.ss.android.ugc.aweme.shortvideo.edit.ce r2 = r12.K
            r1.t = r2
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r1 = r12.J
            com.ss.android.ugc.aweme.shortvideo.edit.ce r2 = r12.K
            r1.t = r2
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r1 = r12.I
            r1.p = r0
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r12.O
            android.arch.lifecycle.MutableLiveData r1 = r1.a()
            java.lang.Object r1 = r1.getValue()
            if (r1 == 0) goto L_0x008d
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r1 = r12.J
            com.ss.android.ugc.gamora.editor.EditViewModel r2 = r12.O
            android.arch.lifecycle.MutableLiveData r2 = r2.a()
            java.lang.Object r2 = r2.getValue()
            com.ss.android.vesdk.p r2 = (com.ss.android.vesdk.p) r2
            com.ss.android.vesdk.aj r2 = r2.d()
            r1.o = r2
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r1 = r12.J
            android.view.ViewGroup r2 = r12.i
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout r3 = r12.n
            android.widget.FrameLayout r4 = r12.G
            r1.b(r12, r2, r3, r4)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r1 = r12.I
            com.ss.android.ugc.gamora.editor.EditViewModel r2 = r12.O
            android.arch.lifecycle.MutableLiveData r2 = r2.a()
            java.lang.Object r2 = r2.getValue()
            com.ss.android.vesdk.p r2 = (com.ss.android.vesdk.p) r2
            com.ss.android.vesdk.aj r2 = r2.d()
            r1.o = r2
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r1 = r12.I
            android.view.ViewGroup r2 = r12.i
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout r3 = r12.n
            android.widget.FrameLayout r4 = r12.F
            r1.a(r12, r2, r3, r4)
        L_0x008d:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r1 = r12.J
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout r2 = r12.g
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b.u
            r8 = 0
            r9 = 77121(0x12d41, float:1.0807E-40)
            java.lang.Class[] r10 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout> r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.class
            r10[r0] = r4
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = r1
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x00c3
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b.u
            r8 = 0
            r9 = 77121(0x12d41, float:1.0807E-40)
            java.lang.Class[] r10 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout> r2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.class
            r10[r0] = r2
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x014b
        L_0x00c3:
            java.lang.String r4 = "votingStickerLayout"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r4)
            r1.x = r2
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout r4 = r1.x
            if (r4 == 0) goto L_0x012f
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
            r8 = 0
            r9 = 77151(0x12d5f, float:1.08112E-40)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = r4
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x00f2
            java.lang.Object[] r5 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.f67339a
            r8 = 0
            r9 = 77151(0x12d5f, float:1.08112E-40)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x012f
        L_0x00f2:
            android.content.Context r5 = r4.getContext()
            if (r5 == 0) goto L_0x0127
            android.app.Activity r5 = (android.app.Activity) r5
            r6 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r5 = r5.findViewById(r6)
            java.lang.String r6 = "(context as Activity).fi…ut>(android.R.id.content)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r4.f67341c = r5
            android.widget.FrameLayout r5 = r4.f67341c
            if (r5 != 0) goto L_0x0113
            java.lang.String r6 = "root"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
        L_0x0113:
            android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
            kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r4.f67342d
            if (r4 == 0) goto L_0x0121
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f r6 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f
            r6.<init>(r4)
            r4 = r6
        L_0x0121:
            android.view.ViewTreeObserver$OnGlobalLayoutListener r4 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r4
            r5.addOnGlobalLayoutListener(r4)
            goto L_0x012f
        L_0x0127:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            r0.<init>(r1)
            throw r0
        L_0x012f:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout r4 = r1.x
            if (r4 == 0) goto L_0x013d
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$b r5 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$b
            r5.<init>(r1)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r4.setOnCompleteListener(r5)
        L_0x013d:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout r4 = r1.x
            if (r4 == 0) goto L_0x014b
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$c r5 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$c
            r5.<init>(r1, r2)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r4.setBeforeChangeListener(r5)
        L_0x014b:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r1 = r12.J
            com.ss.android.vesdk.p r2 = r12.a()
            boolean r4 = r12.K()
            r1.a((com.ss.android.vesdk.p) r2, (boolean) r4)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r1 = r12.J
            r1.p = r0
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r1 = r12.J
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$7 r2 = new com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$7
            r2.<init>()
            r1.l = r2
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout r1 = r12.n
            com.ss.android.ugc.aweme.shortvideo.edit.ao r2 = new com.ss.android.ugc.aweme.shortvideo.edit.ao
            r2.<init>(r12)
            r1.post(r2)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout r1 = r12.n
            com.ss.android.ugc.aweme.shortvideo.edit.ap r2 = new com.ss.android.ugc.aweme.shortvideo.edit.ap
            r2.<init>(r12)
            r1.post(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r1 = r12.I
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$9 r2 = new com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$9
            r2.<init>()
            r1.l = r2
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout r1 = r12.n
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$10 r2 = new com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$10
            r2.<init>()
            r1.b(r2)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = h
            r7 = 0
            r8 = 76442(0x12a9a, float:1.07118E-40)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x01b0
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = h
            r7 = 0
            r8 = 76442(0x12a9a, float:1.07118E-40)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x01b0:
            r12.aC()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r1 = r12.I
            com.ss.android.vesdk.p r2 = r12.a()
            boolean r4 = r12.K()
            r1.a(r2, r4)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r12.z
            java.lang.String r1 = r1.mainBusinessData
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d r2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a((java.lang.String) r1, (int) r0, (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d) r2)
            if (r0 == 0) goto L_0x01d7
            com.ss.android.ugc.aweme.sticker.data.PoiStruct r1 = r0.getPoiStruct()
            if (r1 == 0) goto L_0x01d7
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r1 = r12.I
            r1.a((com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r0)
        L_0x01d7:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r12.z
            java.lang.String r0 = r0.mainBusinessData
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a((java.lang.String) r0, (int) r3, (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d) r1)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r1 = r12.J
            com.ss.android.vesdk.p r2 = r12.a()
            boolean r3 = r12.K()
            r1.a((com.ss.android.vesdk.p) r2, (boolean) r3)
            if (r0 == 0) goto L_0x01fb
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r1 = r0.getVoteStruct()
            if (r1 == 0) goto L_0x01fb
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b r1 = r12.J
            r1.a((com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r0)
        L_0x01fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.ah():void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void aj() {
        boolean z2;
        com.ss.android.ugc.aweme.framework.a.a.a("receive prepare done event in edit page");
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76370, new Class[0], Void.TYPE);
        } else {
            this.n.post(new an(this));
            if (l()) {
                if (PatchProxy.isSupport(new Object[0], this, h, false, 76371, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, h, false, 76371, new Class[0], Void.TYPE);
                } else if (this.E == null) {
                    this.E = new InfoStickerModule(this, this, this.l, this.z);
                    this.E.a(new b.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f66911a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f66911a, false, 76507, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f66911a, false, 76507, new Class[0], Void.TYPE);
                                return;
                            }
                            if (VEVideoPublishEditActivity.this.J != null && !VEVideoPublishEditActivity.this.J.y) {
                                VEVideoPublishEditActivity.this.a(true, false);
                            }
                        }

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f66911a, false, 76508, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f66911a, false, 76508, new Class[0], Void.TYPE);
                                return;
                            }
                            VEVideoPublishEditActivity.this.a(false, false);
                        }

                        /* access modifiers changed from: package-private */
                        public final /* synthetic */ void a(Effect effect, PoiStruct poiStruct) {
                            if (VEVideoPublishEditActivity.this.E != null) {
                                VEVideoPublishEditActivity.this.E.b();
                            }
                            if ("NULL".equalsIgnoreCase(poiStruct.getPoiId())) {
                                poiStruct = null;
                            }
                            VEVideoPublishEditActivity.this.I.a(VEVideoPublishEditActivity.this.a(), VEVideoPublishEditActivity.this.K());
                            if (VEVideoPublishEditActivity.this.I instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a) {
                                VEVideoPublishEditActivity.this.I.a(poiStruct);
                                VEVideoPublishEditActivity.this.I.a(effect.unzipPath);
                                VEVideoPublishEditActivity.this.I.v = effect.effect_id;
                            }
                        }

                        public final void a(Effect effect, String str) {
                            boolean z;
                            int i;
                            Effect effect2 = effect;
                            String str2 = str;
                            if (PatchProxy.isSupport(new Object[]{effect2, str2}, this, f66911a, false, 76506, new Class[]{Effect.class, String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{effect2, str2}, this, f66911a, false, 76506, new Class[]{Effect.class, String.class}, Void.TYPE);
                                return;
                            }
                            VEVideoPublishEditActivity.this.z();
                            if (!(VEVideoPublishEditActivity.this.J == null || VEVideoPublishEditActivity.this.I == null)) {
                                InfoStickerHelper infoStickerHelper = VEVideoPublishEditActivity.this.o;
                                boolean g = VEVideoPublishEditActivity.this.J.g();
                                boolean g2 = VEVideoPublishEditActivity.this.I.g();
                                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(g ? (byte) 1 : 0), Byte.valueOf(g2 ? (byte) 1 : 0)}, infoStickerHelper, InfoStickerHelper.f67201a, false, 76817, new Class[]{Boolean.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
                                    InfoStickerHelper infoStickerHelper2 = infoStickerHelper;
                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(g), Byte.valueOf(g2)}, infoStickerHelper2, InfoStickerHelper.f67201a, false, 76817, new Class[]{Boolean.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
                                } else {
                                    if (g) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    if (g2) {
                                        i++;
                                    }
                                    if (infoStickerHelper.mInfoStickerEditView.getStickNumber() + i >= infoStickerHelper.f67206f) {
                                        com.bytedance.ies.dmt.ui.d.a.b(infoStickerHelper.mInfoStickerEditView.getContext(), (int) C0906R.string.b1e, 0).a();
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                }
                                if (z) {
                                    return;
                                }
                            }
                            if (n.a(effect)) {
                                com.ss.android.ugc.aweme.port.in.a.m.a((ae.b) new bv(this, effect2), (FragmentActivity) VEVideoPublishEditActivity.this, false);
                            } else if (n.b(effect)) {
                                VEVideoPublishEditActivity.this.J.j();
                                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b bVar = VEVideoPublishEditActivity.this.J;
                                String str3 = effect2.effect_id;
                                if (PatchProxy.isSupport(new Object[]{str3}, bVar, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b.u, false, 77118, new Class[]{String.class}, Void.TYPE)) {
                                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b bVar2 = bVar;
                                    PatchProxy.accessDispatch(new Object[]{str3}, bVar2, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b.u, false, 77118, new Class[]{String.class}, Void.TYPE);
                                } else {
                                    Intrinsics.checkParameterIsNotNull(str3, "stickerId");
                                    bVar.w = str3;
                                }
                                VEVideoPublishEditActivity.this.T();
                            } else {
                                VEVideoPublishEditActivity.this.o.a(effect2.effect_id, effect2.unzipPath, str2, effect2.effect_type);
                            }
                        }
                    });
                }
                ((MutableLiveData) this.S.f().get(4)).setValue(Boolean.TRUE);
                if (this.Y) {
                    r();
                }
            } else {
                ((MutableLiveData) this.S.f().get(4)).setValue(Boolean.FALSE);
            }
            if (n()) {
                ((MutableLiveData) this.S.f().get(3)).setValue(Boolean.TRUE);
                if (PatchProxy.isSupport(new Object[0], this, h, false, 76333, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, h, false, 76333, new Class[0], Void.TYPE);
                } else {
                    this.H = new h(this, (ViewGroup) findViewById(C0906R.id.cga), this.F, true);
                    this.H.w = this.K;
                    this.H.a(this.n);
                    h hVar = this.H;
                    String str = this.z.mShootWay;
                    String str2 = this.z.creationId;
                    if (this.z.mFromCut || this.z.mFromMultiCut) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hVar.a(str, str2, z2, K());
                    this.H.k = new SafeHandler(this);
                    this.H.p = true;
                    aD();
                    this.H.a((com.ss.android.ugc.aweme.story.shootvideo.a.b) new com.ss.android.ugc.aweme.story.shootvideo.a.b() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f66891a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f66891a, false, 76522, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f66891a, false, 76522, new Class[0], Void.TYPE);
                                return;
                            }
                            VEVideoPublishEditActivity.this.a(false, false);
                        }

                        public final void dismiss() {
                            if (PatchProxy.isSupport(new Object[0], this, f66891a, false, 76523, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f66891a, false, 76523, new Class[0], Void.TYPE);
                                return;
                            }
                            VEVideoPublishEditActivity.this.a(true, false);
                        }
                    });
                    this.H.f74201f = new h.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f66893a;

                        public final void a(o oVar) {
                        }

                        public final void b(o oVar) {
                        }

                        public final void a(o oVar, int i, int i2, boolean z, boolean z2, boolean z3) {
                            if (PatchProxy.isSupport(new Object[]{oVar, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f66893a, false, 76524, new Class[]{o.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{oVar, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f66893a, false, 76524, new Class[]{o.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                            } else if (z) {
                                if (!z3) {
                                    VEVideoPublishEditActivity.this.a(true, true);
                                }
                                VEVideoPublishEditActivity.this.m = false;
                            } else {
                                if (!VEVideoPublishEditActivity.this.m) {
                                    VEVideoPublishEditActivity.this.a(false, true);
                                    if (VEVideoPublishEditActivity.this.o != null) {
                                        VEVideoPublishEditActivity.this.o.f();
                                    }
                                    if (VEVideoPublishEditActivity.this.H != null) {
                                        VEVideoPublishEditActivity.this.H.c();
                                    }
                                    if (VEVideoPublishEditActivity.this.I != null) {
                                        VEVideoPublishEditActivity.this.I.f();
                                    }
                                    VEVideoPublishEditActivity.this.z();
                                    if (VEVideoPublishEditActivity.this.o.y != null) {
                                        VEVideoPublishEditActivity.this.o.e();
                                    }
                                }
                                VEVideoPublishEditActivity.this.m = true;
                            }
                        }
                    };
                    this.H.i = new bi(this);
                    this.H.u = new bq(this);
                    this.H.x = new br(this);
                    h hVar2 = this.H;
                    AnonymousClass17 r2 = new com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f66895a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f66895a, false, 76525, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f66895a, false, 76525, new Class[0], Void.TYPE);
                                return;
                            }
                            r.a("text_complete", (Map) VEVideoPublishEditActivity.this.u().f34114b);
                        }

                        public final void a(int i) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66895a, false, 76526, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66895a, false, 76526, new Class[]{Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            com.ss.android.ugc.aweme.app.d.d u = VEVideoPublishEditActivity.this.u();
                            r.a("select_text_color", (Map) u.a("color", Integer.toHexString(i)).f34114b);
                        }

                        public final void b(int i) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66895a, false, 76528, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66895a, false, 76528, new Class[]{Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            com.ss.android.ugc.aweme.app.d.d u = VEVideoPublishEditActivity.this.u();
                            r.a("select_text_style", (Map) u.a("text_style", i).f34114b);
                        }

                        public final void a(@NotNull com.ss.android.ugc.aweme.story.shootvideo.textfont.c cVar) {
                            com.ss.android.ugc.aweme.story.shootvideo.textfont.c cVar2 = cVar;
                            if (PatchProxy.isSupport(new Object[]{cVar2}, this, f66895a, false, 76529, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textfont.c.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{cVar2}, this, f66895a, false, 76529, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textfont.c.class}, Void.TYPE);
                                return;
                            }
                            r.a("select_text_font", (Map) VEVideoPublishEditActivity.this.u().a("font", cVar2.f74166c).f34114b);
                        }

                        public final void a(@NotNull String str) {
                            String str2 = str;
                            if (PatchProxy.isSupport(new Object[]{str2}, this, f66895a, false, 76527, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str2}, this, f66895a, false, 76527, new Class[]{String.class}, Void.TYPE);
                                return;
                            }
                            r.a("select_text_paragraph", (Map) VEVideoPublishEditActivity.this.u().a("paragraph_style", str2).f34114b);
                        }
                    };
                    if (PatchProxy.isSupport(new Object[]{r2}, hVar2, h.f74197b, false, 86157, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b.a.class}, Void.TYPE)) {
                        h hVar3 = hVar2;
                        PatchProxy.accessDispatch(new Object[]{r2}, hVar3, h.f74197b, false, 86157, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.b.a.class}, Void.TYPE);
                    } else {
                        hVar2.o.setTextStickerInputMobListener(r2);
                    }
                    this.H.f().f74163b = this.v.s();
                }
            } else {
                ((MutableLiveData) this.S.f().get(3)).setValue(Boolean.FALSE);
            }
        }
        this.D.h = a();
    }

    public void p() {
        boolean z2;
        int i2;
        VolumeHelper volumeHelper;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76341, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76341, new Class[0], Void.TYPE);
            return;
        }
        if (!this.B.f68105d) {
            VolumeHelper volumeHelper2 = this.B;
            View findViewById = findViewById(C0906R.id.cga);
            if (L()) {
                i2 = C0906R.string.bvr;
            } else {
                i2 = C0906R.string.b9x;
            }
            if (PatchProxy.isSupport(new Object[]{findViewById, Integer.valueOf(C0906R.string.bf), Integer.valueOf(i2), this}, volumeHelper2, VolumeHelper.f68102a, false, 77487, new Class[]{View.class, Integer.TYPE, Integer.TYPE, e.class}, VolumeHelper.class)) {
                VolumeHelper volumeHelper3 = volumeHelper2;
                volumeHelper = (VolumeHelper) PatchProxy.accessDispatch(new Object[]{findViewById, Integer.valueOf(C0906R.string.bf), Integer.valueOf(i2), this}, volumeHelper3, VolumeHelper.f68102a, false, 77487, new Class[]{View.class, Integer.TYPE, Integer.TYPE, e.class}, VolumeHelper.class);
            } else {
                volumeHelper2.g = this;
                volumeHelper = volumeHelper2.a(findViewById, C0906R.string.bf, i2);
            }
            volumeHelper.a((VolumeHelper.a) new bs(this));
            this.B.f68107f = new bt(this);
        }
        if ((this.z.isFastImport || this.z.getWavFile() != null) && !this.z.isMuted) {
            VolumeHelper volumeHelper4 = this.B;
            if (this.z.mMusicPath != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            volumeHelper4.b(z2).a(true);
        } else {
            this.B.b(true).a(false);
        }
        this.B.a((int) (this.z.musicVolume * 100.0f));
        this.B.b((int) (this.z.voiceVolume * 100.0f));
        this.B.c(true);
        r.onEvent(a("volumn_edit"));
        a(false, false);
    }

    public final void v() {
        boolean z2;
        MutableLiveData<Boolean> mutableLiveData;
        Observer observer;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76332, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76332, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.shortvideo.edit.a.a.b()) {
            if (this.z.autoEnhanceType != 0 || !com.ss.android.ugc.aweme.shortvideo.edit.a.a.a()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.LightEnhanceBlackList) == 1) {
                this.z.autoEnhanceType = 2;
            }
            this.A = new c(this, this.z, z2);
            c cVar = this.A;
            MutableLiveData<com.ss.android.ugc.aweme.shortvideo.edit.a.b> t2 = this.v.t();
            if (PatchProxy.isSupport(new Object[]{t2}, cVar, c.f66940a, false, 76709, new Class[]{MutableLiveData.class}, Void.TYPE)) {
                c cVar2 = cVar;
                PatchProxy.accessDispatch(new Object[]{t2}, cVar2, c.f66940a, false, 76709, new Class[]{MutableLiveData.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(t2, "autoEnhanceData");
                cVar.f66941b = t2;
            }
            c cVar3 = this.A;
            com.ss.android.ugc.gamora.editor.b bVar = this.P.k;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewScene");
            }
            Activity activity = bVar.f22093a;
            if (activity != null) {
                Fragment findFragmentById = ((FragmentActivity) activity).getSupportFragmentManager().findFragmentById(C0906R.id.bg2);
                if (findFragmentById == null) {
                    mutableLiveData = new MutableLiveData<>();
                } else if (findFragmentById != null) {
                    mutableLiveData = ((VEVideoPublishEditFragment) findFragmentById).f82763d.w;
                    Intrinsics.checkExpressionValueIsNotNull(mutableLiveData, "(it as VEVideoPublishEdi…gment).lightDetectionDone");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type dmt.av.video.VEVideoPublishEditFragment");
                }
                if (PatchProxy.isSupport(new Object[]{mutableLiveData}, cVar3, c.f66940a, false, 76708, new Class[]{MutableLiveData.class}, Void.TYPE)) {
                    c cVar4 = cVar3;
                    PatchProxy.accessDispatch(new Object[]{mutableLiveData}, cVar4, c.f66940a, false, 76708, new Class[]{MutableLiveData.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(mutableLiveData, "lightDetectData");
                    cVar3.f66942c = mutableLiveData;
                }
                c cVar5 = this.A;
                if (PatchProxy.isSupport(new Object[0], cVar5, c.f66940a, false, 76707, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], cVar5, c.f66940a, false, 76707, new Class[0], Void.TYPE);
                    return;
                }
                if (cVar5.f66945f) {
                    MutableLiveData<Boolean> mutableLiveData2 = cVar5.f66942c;
                    if (mutableLiveData2 != null) {
                        LifecycleOwner lifecycleOwner = cVar5.f66943d;
                        if (PatchProxy.isSupport(new Object[0], cVar5, c.f66940a, false, 76711, new Class[0], Observer.class)) {
                            observer = (Observer) PatchProxy.accessDispatch(new Object[0], cVar5, c.f66940a, false, 76711, new Class[0], Observer.class);
                        } else {
                            observer = new c.b(cVar5);
                        }
                        mutableLiveData2.observe(lifecycleOwner, observer);
                    } else {
                        return;
                    }
                } else {
                    MutableLiveData<com.ss.android.ugc.aweme.shortvideo.edit.a.b> mutableLiveData3 = cVar5.f66941b;
                    if (mutableLiveData3 != null) {
                        mutableLiveData3.postValue(new com.ss.android.ugc.aweme.shortvideo.edit.a.b(cVar5.f66944e.autoEnhanceOn, cVar5.f66944e.autoEnhanceType, false, 4));
                        return;
                    }
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76368, new Class[0], Void.TYPE);
            return;
        }
        if (this.o == null) {
            this.o = new InfoStickerHelper(a(), this.y, this.z);
            this.o.q = this.N.e();
            this.o.p = this.N.f();
            this.o.f67203c = K();
            InfoStickerHelper infoStickerHelper = this.o;
            ViewGroup viewGroup = this.i;
            List<com.ss.android.ugc.aweme.music.b.a.a> mediaModelList = this.z.getMediaModelList();
            if (PatchProxy.isSupport(new Object[]{this, viewGroup, mediaModelList, (byte) 0}, infoStickerHelper, InfoStickerHelper.f67201a, false, 76795, new Class[]{FragmentActivity.class, View.class, List.class, Boolean.TYPE}, Void.TYPE)) {
                InfoStickerHelper infoStickerHelper2 = infoStickerHelper;
                PatchProxy.accessDispatch(new Object[]{this, viewGroup, mediaModelList, (byte) 0}, infoStickerHelper2, InfoStickerHelper.f67201a, false, 76795, new Class[]{FragmentActivity.class, View.class, List.class, Boolean.TYPE}, Void.TYPE);
            } else {
                infoStickerHelper.l = mediaModelList;
                infoStickerHelper.a((FragmentActivity) this, (View) viewGroup, mediaModelList.get(0).f56315e, false);
            }
            this.o.a(a(), this.F);
            getLifecycle().addObserver(this.o);
            this.o.i.f67219d = this.v.s();
            this.o.i.f67217b = this.v.m();
            this.o.i.f67218c = this.v.f();
            this.o.a((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a) new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f66905a;

                public final void a(com.ss.android.ugc.aweme.n.b bVar) {
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f66905a, false, 76499, new Class[]{com.ss.android.ugc.aweme.n.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f66905a, false, 76499, new Class[]{com.ss.android.ugc.aweme.n.b.class}, Void.TYPE);
                        return;
                    }
                    if (VEVideoPublishEditActivity.this.z.infoStickerModel == null) {
                        VEVideoPublishEditActivity.this.z.infoStickerModel = new com.ss.android.ugc.aweme.n.a(com.ss.android.ugc.aweme.shortvideo.a.d.a(VEVideoPublishEditActivity.this.z.mPath));
                    }
                    ai.d("add infoSticker " + bVar.id);
                    VEVideoPublishEditActivity.this.z.infoStickerModel.addSticker(bVar);
                }

                public final void b(com.ss.android.ugc.aweme.n.b bVar) {
                    com.ss.android.ugc.aweme.n.b bVar2 = bVar;
                    if (PatchProxy.isSupport(new Object[]{bVar2}, this, f66905a, false, 76500, new Class[]{com.ss.android.ugc.aweme.n.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar2}, this, f66905a, false, 76500, new Class[]{com.ss.android.ugc.aweme.n.b.class}, Void.TYPE);
                        return;
                    }
                    VEVideoPublishEditActivity.this.z.infoStickerModel.removeSticker(bVar2);
                }
            });
            this.v.e().observe(this, new aj(this));
            this.v.f().observe(this, new ak(this));
            this.o.w = new InfoStickerHelper.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f66907a;

                public final int a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y yVar, boolean z, boolean z2) {
                    return 0;
                }

                public final Float a(float f2) {
                    if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66907a, false, 76503, new Class[]{Float.TYPE}, Float.class)) {
                        return Float.valueOf(f2);
                    }
                    return (Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66907a, false, 76503, new Class[]{Float.TYPE}, Float.class);
                }

                public final PointF a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y yVar, float f2, float f3) {
                    if (!PatchProxy.isSupport(new Object[]{yVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f66907a, false, 76502, new Class[]{com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y.class, Float.TYPE, Float.TYPE}, PointF.class)) {
                        return new PointF();
                    }
                    return (PointF) PatchProxy.accessDispatch(new Object[]{yVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f66907a, false, 76502, new Class[]{com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y.class, Float.TYPE, Float.TYPE}, PointF.class);
                }

                public final void a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y yVar, int i, int i2, boolean z, boolean z2) {
                    if (PatchProxy.isSupport(new Object[]{yVar, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f66907a, false, 76501, new Class[]{com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{yVar, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Byte.valueOf(z2)}, this, f66907a, false, 76501, new Class[]{com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                    } else if (VEVideoPublishEditActivity.this.x()) {
                        if (VEVideoPublishEditActivity.this.o.y != null) {
                            VEVideoPublishEditActivity.this.o.e();
                        }
                    } else if (z) {
                        VEVideoPublishEditActivity.this.a(true, true);
                    } else {
                        VEVideoPublishEditActivity.this.a(false, true);
                        VEVideoPublishEditActivity.this.o.f();
                        VEVideoPublishEditActivity.this.P();
                        VEVideoPublishEditActivity.this.A();
                    }
                }
            };
            this.o.x = new InfoStickerHelper.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f66909a;

                public final void a(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66909a, false, 76504, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66909a, false, 76504, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (z) {
                        VEVideoPublishEditActivity.this.S();
                    }
                    if (VEVideoPublishEditActivity.this.I != null) {
                        VEVideoPublishEditActivity.this.I.d(VEVideoPublishEditActivity.b(!z));
                    }
                    if (VEVideoPublishEditActivity.this.J != null) {
                        VEVideoPublishEditActivity.this.J.d(VEVideoPublishEditActivity.b(!z));
                        VEVideoPublishEditActivity.this.J.f67255d = !z;
                    }
                    if (VEVideoPublishEditActivity.this.H != null) {
                        VEVideoPublishEditActivity.this.H.a(VEVideoPublishEditActivity.b(!z), false);
                    }
                    if (z) {
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.c cVar = VEVideoPublishEditActivity.this.o.y;
                        if (cVar != null && (cVar instanceof o)) {
                            ((o) cVar).b(VEVideoPublishEditActivity.b(true), false);
                        }
                    }
                }

                public final void b(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66909a, false, 76505, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66909a, false, 76505, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (VEVideoPublishEditActivity.this.I != null) {
                        VEVideoPublishEditActivity.this.I.d(VEVideoPublishEditActivity.b(z));
                    }
                    if (VEVideoPublishEditActivity.this.J != null) {
                        VEVideoPublishEditActivity.this.J.d(VEVideoPublishEditActivity.b(z));
                    }
                    if (VEVideoPublishEditActivity.this.H != null) {
                        VEVideoPublishEditActivity.this.H.a(VEVideoPublishEditActivity.b(z), false);
                    }
                    if (!z) {
                        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.c cVar = VEVideoPublishEditActivity.this.o.y;
                        if (cVar != null && (cVar instanceof o)) {
                            ((o) cVar).b(VEVideoPublishEditActivity.b(true), false);
                        }
                    }
                }
            };
            this.o.a((com.ss.android.ugc.aweme.story.shootvideo.a.a) new al(this));
        }
    }

    public final boolean M() {
        eu euVar;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76411, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 76411, new Class[0], Boolean.TYPE)).booleanValue();
        }
        r.onEvent(a("back_to_shoot"));
        if (this.z.recordMode != 1 && (!StringUtils.isEmpty(this.z.getDuetFrom()) || L())) {
            finish();
            return true;
        } else if (this.z.recordMode == 1) {
            if (this.z.mIsFromDraft) {
                eu a2 = eu.a(Integer.valueOf(C0906R.string.bux), Integer.valueOf(C0906R.string.pm), Integer.valueOf(C0906R.string.aja));
                a(((Integer) a2.f75849b).intValue(), ((Integer) a2.f75850c).intValue(), ((Integer) a2.f75851d).intValue());
                return false;
            }
            if (PatchProxy.isSupport(new Object[0], this, h, false, 76414, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 76414, new Class[0], Void.TYPE);
            } else {
                new a.C0185a(this).a((int) C0906R.string.kv).b((int) C0906R.string.ku).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) new az(this)).a((int) C0906R.string.kk, (DialogInterface.OnClickListener) new ba(this)).a().a();
            }
            return false;
        } else if (this.z.mOrigin == 0 && this.z.mIsFromDraft) {
            au();
            return false;
        } else if (this.z.isMvThemeVideoType() && this.z.mIsFromDraft) {
            au();
            return false;
        } else if (this.z.mFromCut || this.z.mOrigin == 0 || this.z.mIsHuaweiSuperSlow || this.z.mFromMultiCut) {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 76412, new Class[0], eu.class)) {
                euVar = (eu) PatchProxy.accessDispatch(new Object[0], this, h, false, 76412, new Class[0], eu.class);
            } else if (this.z.mIsHuaweiSuperSlow || (this.z.mIsFromDraft && this.z.mFromMultiCut)) {
                euVar = eu.a(Integer.valueOf(C0906R.string.bux), Integer.valueOf(C0906R.string.pm), Integer.valueOf(C0906R.string.aja));
            } else if (this.z.mFromMultiCut) {
                euVar = eu.a(Integer.valueOf(C0906R.string.ds0), Integer.valueOf(C0906R.string.oy), Integer.valueOf(C0906R.string.p0));
            } else {
                euVar = eu.a(Integer.valueOf(C0906R.string.dry), Integer.valueOf(C0906R.string.pm), Integer.valueOf(C0906R.string.aja));
            }
            a(((Integer) euVar.f75849b).intValue(), ((Integer) euVar.f75850c).intValue(), ((Integer) euVar.f75851d).intValue());
            return false;
        } else {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 76417, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 76417, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (Lists.notEmpty(this.z.mEffectList) || this.z.mTimeEffect != null || this.z.hasInfoStickers() || ((this.I != null && this.I.g()) || ((this.H != null && this.H.e()) || (this.J != null && this.J.g())))) {
                new a.C0185a(this).a((int) C0906R.string.c09).b((int) C0906R.string.c08).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.a1y, (DialogInterface.OnClickListener) new bd(this)).a().a().show();
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                X();
            }
            return false;
        }
    }

    public void onResume() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76362, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76362, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onResume", true);
        super.onResume();
        aC();
        if (this.J != null) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b bVar = this.J;
            VotingStickerLayout votingStickerLayout = bVar.x;
            if (votingStickerLayout != null) {
                votingStickerLayout.q = bVar.y;
            }
        }
        aD();
        com.ss.android.ugc.aweme.shortvideo.util.b.a().c();
        com.ss.android.ugc.aweme.shortvideo.util.b.a().a("av_video_edit");
        this.m = false;
        this.X = false;
        if (n()) {
            this.T.post(this.Z);
        }
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 76363, new Class[0], Void.TYPE)) {
            if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().isEnableVideoEditActivityUploadSpeedProbe() && (com.ss.android.ugc.aweme.framework.d.a.a(this) || (com.ss.android.ugc.aweme.framework.d.a.b(this) && com.ss.android.ugc.aweme.port.in.a.t.a()))) {
                Context applicationContext = getApplicationContext();
                if (!PatchProxy.isSupport(new Object[]{applicationContext}, null, com.ss.android.ugc.aweme.shortvideo.upload.a.c.f70970a, true, 80801, new Class[]{Context.class}, Void.TYPE)) {
                    Intrinsics.checkParameterIsNotNull(applicationContext, "applicationContext");
                    com.ss.android.ugc.aweme.shortvideo.upload.a.c cVar = com.ss.android.ugc.aweme.shortvideo.upload.a.c.g;
                    if (PatchProxy.isSupport(new Object[]{applicationContext}, cVar, com.ss.android.ugc.aweme.shortvideo.upload.a.c.f70970a, false, 80803, new Class[]{Context.class}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.shortvideo.upload.a.c cVar2 = cVar;
                        PatchProxy.accessDispatch(new Object[]{applicationContext}, cVar2, com.ss.android.ugc.aweme.shortvideo.upload.a.c.f70970a, false, 80803, new Class[]{Context.class}, Void.TYPE);
                    } else {
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        objectRef.element = null;
                        new c.j(new c.h(objectRef, new c.g(applicationContext)), new c.i(objectRef)).invoke();
                    }
                    c.C0738c cVar3 = com.ss.android.ugc.aweme.shortvideo.upload.a.c.f70972c;
                    if (cVar3 != null) {
                        if (!PatchProxy.isSupport(new Object[0], cVar3, c.C0738c.f70976a, false, 80808, new Class[0], Void.TYPE)) {
                            c.C0738c.a aVar = new c.C0738c.a(cVar3);
                            switch (com.ss.android.ugc.aweme.shortvideo.upload.a.d.f70996a[cVar3.f70977b.ordinal()]) {
                                case 2:
                                    com.ss.android.ugc.aweme.shortvideo.upload.a.a aVar2 = cVar3.f70978c;
                                    int a2 = cVar3.a();
                                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(a2)}, aVar2, com.ss.android.ugc.aweme.shortvideo.upload.a.a.f70964a, false, 80795, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
                                        com.ss.android.ugc.aweme.shortvideo.upload.a.a aVar3 = aVar2;
                                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(a2)}, aVar3, com.ss.android.ugc.aweme.shortvideo.upload.a.a.f70964a, false, 80795, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
                                    } else {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        a.b bVar2 = new a.b(aVar2, a2, currentTimeMillis);
                                        a.c cVar4 = new a.c(aVar2, currentTimeMillis);
                                        a.d dVar = a.d.INSTANCE;
                                        a.e eVar = new a.e(aVar2, currentTimeMillis, a2);
                                        boolean invoke = bVar2.invoke();
                                        eVar.invoke(invoke);
                                        if (invoke) {
                                            z2 = cVar4.invoke();
                                        } else {
                                            z2 = dVar.invoke();
                                        }
                                    }
                                    if (z2) {
                                        aVar.invoke();
                                        break;
                                    }
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    aVar.invoke();
                                    break;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[0], cVar3, c.C0738c.f70976a, false, 80808, new Class[0], Void.TYPE);
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(new Object[]{applicationContext}, null, com.ss.android.ugc.aweme.shortvideo.upload.a.c.f70970a, true, 80801, new Class[]{Context.class}, Void.TYPE);
                }
            }
        } else {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 76363, new Class[0], Void.TYPE);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onResume", false);
    }

    private void m(boolean z2) {
        this.t = z2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(o oVar) {
        if (this.H.b()) {
            this.o.a((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.c) oVar);
            this.o.e();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ com.bytedance.scene.e b(String str) {
        if (str.equals(com.ss.android.ugc.gamora.editor.a.class.getName())) {
            return this.R;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ com.bytedance.scene.e c(String str) {
        if (str.equals(d.class.getName())) {
            return this.Q;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ com.bytedance.scene.e d(String str) {
        if (str.equals(com.ss.android.ugc.gamora.editor.c.class.getName())) {
            return this.P;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(boolean z2) {
        if (this.I != null && !z2) {
            P();
        }
        if (this.H != null && !z2) {
            this.H.c();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(boolean z2) {
        if (this.o != null && !z2) {
            this.o.f();
        }
        if (this.I != null && !z2) {
            this.I.f();
        }
    }

    private void h(boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, h, false, 76336, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, h, false, 76336, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.b()) {
            RelativeLayout relativeLayout = this.f3936d;
            int i3 = 4;
            if (z2) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            relativeLayout.setVisibility(i2);
            RelativeLayout relativeLayout2 = this.f3937e;
            if (z2) {
                i3 = 0;
            }
            relativeLayout2.setVisibility(i3);
        }
    }

    private void n(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, h, false, 76446, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, h, false, 76446, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.H != null && !this.H.v) {
            this.H.b(z2);
        }
        if (this.o != null && !this.o.h()) {
            this.o.a(z2);
        }
        if (this.I != null) {
            this.I.f67255d = z2;
        }
        if (this.J != null) {
            this.J.f67255d = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void b(i iVar) throws Exception {
        int i2;
        int t2;
        for (TextStickerCompileResult textStickerCompileResult : (List) iVar.e()) {
            if (textStickerCompileResult != null) {
                TextStickerData textStickerData = textStickerCompileResult.textStickerData;
                String json = ay().toJson((Object) textStickerData);
                if (textStickerData.hasTimeData()) {
                    i2 = textStickerData.mStartTime;
                } else {
                    i2 = 0;
                }
                if (textStickerData.hasTimeData()) {
                    t2 = textStickerData.mEndTime;
                } else {
                    t2 = a().t();
                }
                int i3 = t2;
                com.ss.android.ugc.aweme.n.b bVar = new com.ss.android.ugc.aweme.n.b("text_sticker_" + textStickerCompileResult.index, textStickerCompileResult.stickerPath, json, textStickerCompileResult.index, false, i2, i3);
                bVar.type = 2;
                bVar.isImageStickerLayer = true;
                a(bVar);
            }
        }
        return null;
    }

    public final void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, h, false, 76447, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, h, false, 76447, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.I != null) {
            this.I.f67255d = z2;
        }
        if (this.J != null) {
            this.J.f67255d = z2;
        }
        if (this.H != null) {
            this.H.b(z2);
        }
        if (this.o != null) {
            this.o.a(z2);
        }
    }

    public void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, h, false, 76360, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, h, false, 76360, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
        if (z2) {
            if (!this.M) {
                q();
                return;
            }
            s.a((s.a) this, (Set<String>) null);
        }
    }

    private void i(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, h, false, 76337, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, h, false, 76337, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int c2 = fc.c(this);
        if (this.f3936d != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f3936d.getLayoutParams();
            if (z2) {
                i2 = c2;
            }
            layoutParams.topMargin = i2;
            this.f3936d.setLayoutParams(layoutParams);
        }
        this.S.o().setValue(Integer.valueOf(c2));
        FrameLayout frameLayout = (FrameLayout) findViewById(C0906R.id.bah);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams2.topMargin = c2;
        frameLayout.setLayoutParams(layoutParams2);
        View findViewById = findViewById(C0906R.id.ddj);
        if (findViewById != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams3.topMargin = c2;
            findViewById.setLayoutParams(layoutParams3);
        }
    }

    private void j(boolean z2) {
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, h, false, 76338, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, h, false, 76338, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0906R.dimen.cf);
        if (this.f3937e != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f3937e.getLayoutParams();
            if (z2) {
                i2 = dimensionPixelSize;
            } else {
                i2 = 0;
            }
            layoutParams.bottomMargin = i2;
            this.f3937e.setLayoutParams(layoutParams);
        }
        MutableLiveData p2 = this.S.p();
        if (!z2) {
            i3 = (int) UIUtils.dip2Px(this, 20.0f);
        }
        p2.setValue(Integer.valueOf(i3));
        this.S.q().setValue(Integer.valueOf(dimensionPixelSize));
    }

    private void k(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, h, false, 76354, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, h, false, 76354, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        n(z2);
        if (z2) {
            this.v.s().setValue(Boolean.FALSE);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit b(com.ss.android.ugc.aweme.ao.a.e eVar) {
        a(eVar);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, h, false, 76410, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, h, false, 76410, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.e b2 = ej.a().b();
        if (z2) {
            b2 = null;
        }
        if (!com.ss.android.g.a.a() || y()) {
            a(b2);
            return;
        }
        if (b2 == null || TextUtils.isEmpty(b2.getName())) {
            com.ss.android.ugc.aweme.account.model.e e2 = com.ss.android.ugc.aweme.port.in.a.x.e();
            if (e2 != null) {
                this.S.m().postValue(new Pair(e2.f(), Boolean.TRUE));
            }
            this.S.l().setValue(2130839026);
        } else {
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(new ArrayList());
            if (!StringUtils.isEmpty(b2.getPicSmall())) {
                urlModel.getUrlList().add(b2.getPicSmall());
                this.S.m().postValue(new Pair(urlModel, Boolean.FALSE));
            } else if (!StringUtils.isEmpty(b2.getPicBig())) {
                urlModel.getUrlList().add(b2.getPicBig());
                this.S.m().postValue(new Pair(urlModel, Boolean.FALSE));
            } else {
                this.S.l().setValue(2130839026);
            }
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.shortvideo.f.g gVar) {
        com.ss.android.ugc.aweme.shortvideo.f.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, h, false, 76438, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, h, false, 76438, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.g.class}, Void.TYPE);
            return;
        }
        this.z.title = gVar2.f67652a;
        this.z.structList = gVar2.f67653b;
        this.z.isPrivate = gVar2.f67654c;
        this.z.poiId = gVar2.f67655d;
        this.z.challenges = gVar2.f67657f;
        this.z.commentSetting = gVar2.g;
        this.z.defaultSelectStickerPoi = gVar2.f67656e;
        com.ss.android.ugc.aweme.shortvideo.f.b bVar = gVar2.h;
        cb cbVar = this.z;
        if (PatchProxy.isSupport(new Object[]{cbVar}, bVar, com.ss.android.ugc.aweme.shortvideo.f.b.f67633a, false, 77205, new Class[]{cb.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.shortvideo.f.b bVar2 = bVar;
            PatchProxy.accessDispatch(new Object[]{cbVar}, bVar2, com.ss.android.ugc.aweme.shortvideo.f.b.f67633a, false, 77205, new Class[]{cb.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cbVar, "model");
        if (!cbVar.isMvThemeVideoType() || cbVar.mvCreateVideoData == null) {
            cbVar.mVideoCoverStartTm = ((float) bVar.f67635b) / 1000.0f;
            return;
        }
        com.ss.android.ugc.aweme.x.a aVar = cbVar.mvCreateVideoData;
        aVar.videoCoverStartTime = bVar.f67635b;
        aVar.videoCoverImgPath = bVar.f67636c;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(int i2) {
        if (i2 == 0) {
            a().q();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(int i2) {
        if (i2 == 1) {
            ap();
            this.z.mEffectList = new ArrayList<>(this.v.f82809c);
            this.z.mTimeEffect = this.C.H;
            if (this.z.mTimeEffect != null) {
                this.z.mEffectList.add(this.z.mTimeEffect);
            }
        } else if (i2 == 2) {
            ap();
            this.z.mEffectList = new ArrayList<>(this.v.f82809c);
            this.z.mTimeEffect = this.C.H;
            if (!(this.z.mTimeEffect == null || !this.z.mTimeEffect.getKey().equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE) || a() == null)) {
                String[] c2 = this.C.f3088d.c();
                String[] e2 = this.C.f3088d.e();
                if (c2 != null && c2.length > 0) {
                    this.z.mReversePath = c2[0];
                }
                if (this.z.previewConfigure != null) {
                    this.z.previewConfigure.updateReverseVideoContent(c2, e2, this.C.f3088d.d());
                }
            }
            if (this.z.mTimeEffect != null) {
                this.z.mEffectList.add(this.z.mTimeEffect);
            }
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.z.creationId).a("shoot_way", this.z.mShootWay).a("draft_id", this.z.draftId);
            if (this.z.mEffectList != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<EffectPointModel> it2 = this.z.mEffectList.iterator();
                while (it2.hasNext()) {
                    EffectPointModel next = it2.next();
                    if (!TextUtils.isEmpty(next.getName())) {
                        sb.append(next.getName());
                        sb.append(",");
                    }
                }
                if (sb.length() > 0) {
                    a2.a("effect_name", sb.substring(0, sb.length() - 1));
                }
            }
            r.a("effect_confirm", (Map) a2.f34114b);
        }
    }

    private void a(com.ss.android.ugc.aweme.n.b bVar) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, h, false, 76430, new Class[]{com.ss.android.ugc.aweme.n.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, h, false, 76430, new Class[]{com.ss.android.ugc.aweme.n.b.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.video.b.b(bVar.path)) {
            if (!this.z.hasInfoStickers()) {
                this.z.infoStickerModel = new com.ss.android.ugc.aweme.n.a(com.ss.android.ugc.aweme.shortvideo.a.d.a(this.z.mPath));
            }
            if (this.z.infoStickerModel.stickers.size() > 0) {
                for (com.ss.android.ugc.aweme.n.b next : this.z.infoStickerModel.stickers) {
                    if (next.isInfoSticker() && next.layerWeight > i2) {
                        i2 = next.layerWeight;
                    }
                }
            }
            bVar.layerWeight += i2;
            this.z.infoStickerModel.stickers.add(bVar);
        }
    }

    private void l(boolean z2) {
        i a2;
        String str;
        i iVar;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, h, false, 76421, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, h, false, 76421, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.K.a(w.a(a(), this.K, this.o, this.H, this.I, this.J));
        long currentTimeMillis = System.currentTimeMillis();
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76423, new Class[0], i.class)) {
            a2 = (i) PatchProxy.accessDispatch(new Object[0], this, h, false, 76423, new Class[0], i.class);
        } else if (this.I == null || !this.I.g()) {
            a2 = i.a(null);
            if (this.J != null) {
                aB();
            }
        } else {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a aVar = this.I;
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.f67252a, false, 76936, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.f67252a, false, 76936, new Class[0], String.class);
            } else if (aVar.n != null) {
                str = aVar.n.replace("interact_sticker.png", "");
            } else {
                str = "";
            }
            a2 = this.I.a(str, this.K.d(), this.K.e(), a().d().f77890a, a().d().f77891b).c(new bj(this), i.f1052b).a((a.g<TResult, TContinuationResult>) new bk<TResult,TContinuationResult>(this), i.f1052b);
        }
        i iVar2 = a2;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 76422, new Class[0], i.class)) {
            iVar = (i) PatchProxy.accessDispatch(new Object[0], this, h, false, 76422, new Class[0], i.class);
        } else if (this.H == null || !this.H.e()) {
            iVar = i.a(null);
        } else {
            iVar = this.H.a(com.ss.android.ugc.aweme.port.in.a.f61119b.getFilesDir() + File.separator + "effect" + File.separator + "text_stickers" + File.separator + System.currentTimeMillis() + File.separator + new File(this.z.mPath).getName(), this.K.d(), this.K.e(), a().d().f77890a, a().d().f77891b).c(new bh(this), i.f1052b);
        }
        i<Void> b2 = i.b((Collection<? extends i<?>>) Arrays.asList(new i[]{iVar2, iVar}));
        if (!b2.b()) {
            aw();
            b2 = i.b((Collection<? extends i<?>>) Arrays.asList(new i[]{b2, i.a(Math.max(0, 500 - (System.currentTimeMillis() - currentTimeMillis)))}));
        }
        b2.a((a.g<TResult, TContinuationResult>) new bg<TResult,TContinuationResult>(this, z2), i.f1052b);
    }

    public final void b(@NonNull com.ss.android.ugc.aweme.base.activity.a aVar) {
        com.ss.android.ugc.aweme.base.activity.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, h, false, 76437, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, h, false, 76437, new Class[]{com.ss.android.ugc.aweme.base.activity.a.class}, Void.TYPE);
            return;
        }
        this.W.remove(aVar2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object e(boolean z2) throws Exception {
        com.ss.android.ugc.aweme.shortvideo.upload.a.b bVar;
        c.b bVar2;
        ax();
        boolean z3 = false;
        if (z2) {
            cb cbVar = this.z;
            if (PatchProxy.isSupport(new Object[]{cbVar}, this, h, false, 76416, new Class[]{cb.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cbVar}, this, h, false, 76416, new Class[]{cb.class}, Void.TYPE);
            } else {
                if (cbVar.isMvThemeVideoType()) {
                    az();
                }
                com.ss.android.ugc.aweme.draft.a.c a2 = new cc("VEVideoPublishEditActivity").a(cbVar);
                a2.f43438f = ej.a().b();
                a2.D = System.currentTimeMillis();
                l.a().c(a2);
            }
            finish();
        } else {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 76429, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 76429, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.port.in.a.h.b();
                r.onEvent(MobClick.obtain().setEventName("next").setLabelName("mid_page"));
                String stringExtra = getIntent().getStringExtra("shoot_way");
                au.b("click_next_button");
                au.a(stringExtra);
                Intent intent = new Intent(this, VideoPublishActivity.class);
                intent.putExtras(getIntent().getExtras());
                cb clone = this.z.clone();
                ArrayList<EffectPointModel> arrayList = clone.mEffectList;
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        EffectPointModel effectPointModel = arrayList.get(i2);
                        if (effectPointModel.isFromEnd()) {
                            int endPoint = effectPointModel.getEndPoint();
                            int startPoint = effectPointModel.getStartPoint();
                            effectPointModel.setStartPoint(endPoint);
                            effectPointModel.setEndPoint(startPoint);
                            effectPointModel.setFromEnd(false);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (this.z.challenges != null) {
                    arrayList2.addAll(this.z.challenges);
                }
                if (ej.a().b() != null) {
                    com.ss.android.ugc.aweme.shortvideo.c cVar = ej.a().b().challenge;
                    if (cVar != null && !arrayList2.contains(cVar)) {
                        arrayList2.add(cVar);
                    }
                }
                if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().isEnableVideoEditActivityUploadSpeedProbe()) {
                    if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.shortvideo.upload.a.c.f70970a, true, 80802, new Class[0], com.ss.android.ugc.aweme.shortvideo.upload.a.b.class)) {
                        bVar = (com.ss.android.ugc.aweme.shortvideo.upload.a.b) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.shortvideo.upload.a.c.f70970a, true, 80802, new Class[0], com.ss.android.ugc.aweme.shortvideo.upload.a.b.class);
                    } else {
                        c.e eVar = c.e.INSTANCE;
                        c.C0738c cVar2 = com.ss.android.ugc.aweme.shortvideo.upload.a.c.f70972c;
                        if (cVar2 != null) {
                            if (PatchProxy.isSupport(new Object[0], cVar2, c.C0738c.f70976a, false, 80809, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], cVar2, c.C0738c.f70976a, false, 80809, new Class[0], Void.TYPE);
                            } else {
                                if (com.ss.android.ugc.aweme.shortvideo.upload.a.d.f70997b[cVar2.f70977b.ordinal()] == 1) {
                                    cVar2.f70980e.invoke();
                                }
                            }
                        }
                        c.C0738c cVar3 = com.ss.android.ugc.aweme.shortvideo.upload.a.c.f70972c;
                        if (cVar3 != null) {
                            bVar2 = cVar3.f70977b;
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 != null) {
                            switch (com.ss.android.ugc.aweme.shortvideo.upload.a.e.f70999a[bVar2.ordinal()]) {
                                case 1:
                                    bVar = eVar.invoke(com.ss.android.ugc.aweme.shortvideo.upload.a.c.f70973d);
                                    break;
                                case 2:
                                    bVar = eVar.invoke(-6);
                                    break;
                                case 3:
                                    bVar = eVar.invoke(-5);
                                    break;
                            }
                        }
                        bVar = eVar.invoke(-4);
                        com.ss.android.ugc.aweme.shortvideo.upload.a.c.g.a("getSpeed:" + bVar, false);
                    }
                    clone.uploadSpeedInfo = bVar;
                }
                com.ss.android.ugc.aweme.tools.a.g.a(com.ss.android.ugc.aweme.shortvideo.r.a((BaseShortVideoContext) clone), com.ss.android.ugc.aweme.shortvideo.r.b((BaseShortVideoContext) clone), com.ss.android.ugc.aweme.tools.a.e.EDIT, com.ss.android.ugc.aweme.tools.a.e.PUBLISH);
                intent.putExtra("args", clone);
                StringBuilder sb = new StringBuilder("GoPublishActivity from new edit page");
                if (clone == null) {
                    z3 = true;
                }
                sb.append(z3);
                com.ss.android.ugc.aweme.util.c.a(sb.toString());
                intent.putExtra("is_from_sys_share", this.r);
                intent.putExtra("challenge", arrayList2);
                intent.putExtra("enter_record_from_other_platform", this.f3934b);
                int d2 = d();
                if (d2 >= 0) {
                    intent.putExtra("music_rec_type", d2);
                }
                this.X = true;
                if (this.f3934b) {
                    startActivityForResult(intent, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
                } else {
                    startActivity(intent);
                }
            }
        }
        return null;
    }

    private void a(com.ss.android.ugc.aweme.shortvideo.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, h, false, 76409, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, h, false, 76409, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            this.S.k().setValue(Integer.valueOf(C0906R.string.c3p));
        } else {
            this.S.k().setValue(Integer.valueOf(C0906R.string.bev));
        }
        ((MutableLiveData) this.S.f().get(1)).setValue(Boolean.TRUE);
        if (eVar == null) {
            this.S.l().setValue(2130839142);
        } else {
            this.S.l().setValue(2130839517);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(o oVar) {
        z();
        this.o.b((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.c) oVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(v vVar) {
        boolean z2;
        if (vVar != null) {
            if (vVar.f83072b == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            k(z2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0b35, code lost:
        if (r7.z.isMvThemeVideoType() == false) goto L_0x0b42;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r30) {
        /*
            r29 = this;
            r7 = r29
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r30
            com.meituan.robust.ChangeQuickRedirect r2 = h
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 76326(0x12a26, float:1.06956E-40)
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r30
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76326(0x12a26, float:1.06956E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            java.lang.String r0 = "com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            super.onCreate(r30)
            com.ss.android.ugc.aweme.shortvideo.util.b r0 = com.ss.android.ugc.aweme.shortvideo.util.b.a()
            r0.c()
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r0 < r8) goto L_0x0065
            android.transition.AutoTransition r0 = new android.transition.AutoTransition
            r0.<init>()
            android.view.Window r1 = r29.getWindow()
            r1.setSharedElementReenterTransition(r0)
            android.view.Window r0 = r29.getWindow()
            android.transition.AutoTransition r1 = new android.transition.AutoTransition
            r1.<init>()
            r0.setSharedElementExitTransition(r1)
        L_0x0065:
            com.ss.android.ugc.aweme.property.a r0 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r1 = com.ss.android.ugc.aweme.property.a.C0682a.NewEditPage
            int r0 = r0.b(r1)
            r7.L = r0
            com.ss.android.ugc.aweme.property.a r0 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r1 = com.ss.android.ugc.aweme.property.a.C0682a.EditPagePrompt
            boolean r0 = r0.a(r1)
            r7.M = r0
            r0 = 2131689672(0x7f0f00c8, float:1.9008366E38)
            r7.setContentView((int) r0)
            r7.m(r9)
            android.content.Intent r0 = r29.getIntent()
            if (r0 != 0) goto L_0x008b
            r29.finish()
        L_0x008b:
            r0 = 2131167971(0x7f070ae3, float:1.795023E38)
            android.view.View r0 = r7.findViewById(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout r0 = (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout) r0
            r7.g = r0
            android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r29)
            java.lang.Class<dmt.av.video.VEVideoPublishEditViewModel> r1 = dmt.av.video.VEVideoPublishEditViewModel.class
            android.arch.lifecycle.ViewModel r0 = r0.get(r1)
            dmt.av.video.VEVideoPublishEditViewModel r0 = (dmt.av.video.VEVideoPublishEditViewModel) r0
            r7.v = r0
            android.content.Intent r11 = r29.getIntent()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76367(0x12a4f, float:1.07013E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.cb> r6 = com.ss.android.ugc.aweme.shortvideo.edit.cb.class
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r12 = 0
            r13 = 3
            if (r0 == 0) goto L_0x00e0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76367(0x12a4f, float:1.07013E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.cb> r6 = com.ss.android.ugc.aweme.shortvideo.edit.cb.class
            r1 = r29
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = (com.ss.android.ugc.aweme.shortvideo.edit.cb) r0
            goto L_0x0169
        L_0x00e0:
            com.ss.android.ugc.aweme.shortvideo.edit.cc r0 = new com.ss.android.ugc.aweme.shortvideo.edit.cc
            java.lang.String r1 = "VEVideoPublishEditActivity"
            r0.<init>(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r0.a((android.content.Intent) r11)
            r7.z = r0
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            r0.setNewVersion(r13)
            java.lang.String r0 = "is_from_sys_share"
            boolean r0 = r11.getBooleanExtra(r0, r10)
            r7.r = r0
            dmt.av.video.VEVideoPublishEditViewModel r0 = r7.v
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            int r1 = r1.getFilterIndex()
            com.ss.android.ugc.aweme.filter.h r1 = com.ss.android.ugc.aweme.filter.w.a((int) r1)
            r0.a(r1)
            com.ss.android.ugc.aweme.shortvideo.ej r0 = com.ss.android.ugc.aweme.shortvideo.ej.a()
            com.ss.android.ugc.aweme.shortvideo.e r0 = r0.b()
            r7.p = r0
            if (r0 == 0) goto L_0x0143
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r2 = r0.getMusicId()
            r1.musicId = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r2 = r0.getAlbum()
            r1.mId3Album = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r2 = r0.getName()
            r1.mId3Title = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r2 = r0.getSinger()
            r1.mId3Author = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            com.ss.android.ugc.aweme.ao.a r2 = com.ss.android.ugc.aweme.port.in.a.i
            int r0 = r0.getMusicType()
            boolean r0 = r2.a((int) r0)
            r1.mMusicType = r0
        L_0x0143:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            boolean r0 = r0.mIsFromDraft
            if (r0 == 0) goto L_0x0157
            r7.s = r10
            java.util.concurrent.ExecutorService r0 = com.ss.android.ugc.aweme.tools.a.a()
            com.ss.android.ugc.aweme.shortvideo.edit.ai r1 = new com.ss.android.ugc.aweme.shortvideo.edit.ai
            r1.<init>(r7)
            r0.execute(r1)
        L_0x0157:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            int r0 = r0.recordMode
            if (r0 != r9) goto L_0x0167
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            boolean r0 = r0.mIsFromDraft
            if (r0 != 0) goto L_0x0167
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            r0.mMusicPath = r12
        L_0x0167:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
        L_0x0169:
            r7.z = r0
            android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r29)
            java.lang.Class<com.ss.android.ugc.gamora.editor.EditPreviewViewModel> r1 = com.ss.android.ugc.gamora.editor.EditPreviewViewModel.class
            android.arch.lifecycle.ViewModel r0 = r0.get(r1)
            com.ss.android.ugc.gamora.editor.EditPreviewViewModel r0 = (com.ss.android.ugc.gamora.editor.EditPreviewViewModel) r0
            r7.N = r0
            android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r29)
            java.lang.Class<com.ss.android.ugc.gamora.editor.EditViewModel> r1 = com.ss.android.ugc.gamora.editor.EditViewModel.class
            android.arch.lifecycle.ViewModel r0 = r0.get(r1)
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = (com.ss.android.ugc.gamora.editor.EditViewModel) r0
            r7.O = r0
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r7.O
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r2 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            r0.f77550b = r1
            android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r29)
            java.lang.Class<com.ss.android.ugc.gamora.editor.EditToolbarViewModel> r1 = com.ss.android.ugc.gamora.editor.EditToolbarViewModel.class
            android.arch.lifecycle.ViewModel r0 = r0.get(r1)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = (com.ss.android.ugc.gamora.editor.EditToolbarViewModel) r0
            r7.S = r0
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            r11 = 2
            java.lang.Object[] r14 = new java.lang.Object[r11]
            r14[r10] = r0
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r14[r9] = r1
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.shortvideo.edit.cf.f67166a
            r17 = 1
            r18 = 76585(0x12b29, float:1.07318E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.cb> r2 = com.ss.android.ugc.aweme.shortvideo.edit.cb.class
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.ce> r20 = com.ss.android.ugc.aweme.shortvideo.edit.ce.class
            r19 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r1 == 0) goto L_0x01ee
            java.lang.Object[] r14 = new java.lang.Object[r11]
            r14[r10] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r10)
            r14[r9] = r0
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.shortvideo.edit.cf.f67166a
            r17 = 1
            r18 = 76585(0x12b29, float:1.07318E-40)
            java.lang.Class[] r0 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.cb> r1 = com.ss.android.ugc.aweme.shortvideo.edit.cb.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.ce> r20 = com.ss.android.ugc.aweme.shortvideo.edit.ce.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0208
        L_0x01ee:
            java.lang.String r1 = "model"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r1 = r0.previewConfigure
            if (r1 == 0) goto L_0x0200
            com.ss.android.ugc.aweme.shortvideo.edit.l r1 = new com.ss.android.ugc.aweme.shortvideo.edit.l
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.shortvideo.edit.a r0 = (com.ss.android.ugc.aweme.shortvideo.edit.a) r0
            goto L_0x0208
        L_0x0200:
            com.ss.android.ugc.aweme.shortvideo.edit.c r1 = new com.ss.android.ugc.aweme.shortvideo.edit.c
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.shortvideo.edit.a r0 = (com.ss.android.ugc.aweme.shortvideo.edit.a) r0
        L_0x0208:
            com.ss.android.ugc.aweme.shortvideo.edit.ce r0 = (com.ss.android.ugc.aweme.shortvideo.edit.ce) r0
            r7.K = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VEVideoPublishEditActivity filter_id_list:"
            r0.<init>(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r1 = r1.mCurFilterIds
            r0.append(r1)
            java.lang.String r1 = " prop_list:"
            r0.append(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r1 = r1.mStickerID
            r0.append(r1)
            java.lang.String r1 = " effect_list:"
            r0.append(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r1 = r1.getEditEffectList()
            r0.append(r1)
            java.lang.String r1 = " info_sticker_list:"
            r0.append(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r1 = r1.getInfoStickerList()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ss.android.ugc.aweme.shortvideo.util.ai.d(r0)
            android.content.Intent r0 = r29.getIntent()
            java.lang.String r1 = "enter_record_from_other_platform"
            boolean r0 = r0.getBooleanExtra(r1, r10)
            r7.f3934b = r0
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r0 = r0.mEffectList
            if (r0 == 0) goto L_0x0268
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r0 = r0.mEffectList
            dmt.av.video.VEVideoPublishEditViewModel r1 = r7.v
            dmt.av.video.f r1 = r1.l()
            dmt.av.video.q.a(r0, r1)
        L_0x0268:
            com.ss.android.ugc.aweme.shortvideo.hm r0 = new com.ss.android.ugc.aweme.shortvideo.hm
            r0.<init>()
            com.ss.android.vesdk.i r0 = r0.a()
            com.ss.android.ugc.aweme.port.in.a.a((com.ss.android.vesdk.i) r0)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            boolean r0 = r0.isMvThemeVideoType()
            if (r0 != 0) goto L_0x02a9
            com.ss.android.ugc.aweme.shortvideo.edit.ce r0 = r7.K
            int r0 = r0.a()
            if (r0 == 0) goto L_0x02a9
            android.content.Context r1 = r29.getApplicationContext()
            r2 = 2131561413(0x7f0d0bc5, float:1.8748226E38)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r10] = r0
            java.lang.String r0 = r7.getString(r2, r3)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r1, (java.lang.String) r0)
            r0.a()
            r29.finish()
            java.lang.String r0 = "com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r10)
            return
        L_0x02a9:
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.fc.a()
            if (r0 == 0) goto L_0x02d2
            android.view.Window r0 = r29.getWindow()
            r1 = 1024(0x400, float:1.435E-42)
            r0.clearFlags(r1)
            boolean r0 = com.ss.android.common.util.ToolUtils.isFlyme()
            if (r0 == 0) goto L_0x02c2
            com.bytedance.ies.uikit.statusbar.StatusBarUtils.setTranslucent(r29)
            goto L_0x02c5
        L_0x02c2:
            com.bytedance.ies.uikit.statusbar.StatusBarUtils.setTransparent(r29)
        L_0x02c5:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r8) goto L_0x02d2
            android.view.Window r0 = r29.getWindow()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setNavigationBarColor(r1)
        L_0x02d2:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76353(0x12a41, float:1.06993E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02f8
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76353(0x12a41, float:1.06993E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0342
        L_0x02f8:
            com.ss.android.ugc.gamora.editor.EditPreviewViewModel r0 = r7.N
            android.arch.lifecycle.MutableLiveData r0 = r0.a()
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$2 r1 = new com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$2
            r1.<init>()
            r0.observe(r7, r1)
            com.ss.android.ugc.gamora.editor.EditPreviewViewModel r0 = r7.N
            android.arch.lifecycle.MutableLiveData r0 = r0.b()
            com.ss.android.ugc.aweme.shortvideo.edit.ae r1 = new com.ss.android.ugc.aweme.shortvideo.edit.ae
            r1.<init>(r7)
            r0.observe(r7, r1)
            com.ss.android.ugc.gamora.editor.EditPreviewViewModel r0 = r7.N
            android.arch.lifecycle.MutableLiveData r0 = r0.c()
            com.ss.android.ugc.aweme.shortvideo.edit.af r1 = new com.ss.android.ugc.aweme.shortvideo.edit.af
            r1.<init>(r7)
            r0.observe(r7, r1)
            dmt.av.video.VEVideoPublishEditViewModel r0 = r7.v
            android.arch.lifecycle.MutableLiveData r0 = r0.q()
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r1 = r29.I()
            com.ss.android.ugc.aweme.shortvideo.edit.ag r2 = new com.ss.android.ugc.aweme.shortvideo.edit.ag
            r2.<init>(r7)
            r0.observe(r1, r2)
            com.ss.android.ugc.gamora.editor.EditPreviewViewModel r0 = r7.N
            android.arch.lifecycle.MutableLiveData r0 = r0.d()
            com.ss.android.ugc.aweme.shortvideo.edit.ah r1 = new com.ss.android.ugc.aweme.shortvideo.edit.ah
            r1.<init>(r7)
            r0.observe(r7, r1)
        L_0x0342:
            com.ss.android.ugc.gamora.editor.c r0 = new com.ss.android.ugc.gamora.editor.c
            r0.<init>()
            r7.P = r0
            java.util.Set<java.lang.String> r0 = com.bytedance.scene.d.f22088a
            r0.clear()
            r1 = 2131166506(0x7f07052a, float:1.794726E38)
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$1 r2 = new com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$1
            java.lang.Class<com.ss.android.ugc.gamora.editor.c> r0 = com.ss.android.ugc.gamora.editor.c.class
            r2.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.ab r3 = new com.ss.android.ugc.aweme.shortvideo.edit.ab
            r3.<init>(r7)
            r4 = 0
            java.lang.String r5 = "EditRootScene"
            r0 = r29
            com.bytedance.scene.d.a((android.app.Activity) r0, (int) r1, (com.bytedance.scene.navigation.g) r2, (com.bytedance.scene.f) r3, (boolean) r4, (java.lang.String) r5)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76351(0x12a3f, float:1.0699E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r8 = -1
            if (r0 == 0) goto L_0x038d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76351(0x12a3f, float:1.0699E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x04cc
        L_0x038d:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r0 = r0.previewConfigure
            if (r0 != 0) goto L_0x03b9
            dmt.av.video.u r0 = new dmt.av.video.u
            r0.<init>()
            java.lang.String[] r1 = new java.lang.String[r9]
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.z
            java.lang.String r2 = r2.mPath
            r1[r10] = r2
            r0.mVideoPaths = r1
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r1 = r1.getWavFile()
            if (r1 != 0) goto L_0x03ac
            r1 = r12
            goto L_0x03b6
        L_0x03ac:
            java.lang.String[] r1 = new java.lang.String[r9]
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.z
            java.lang.String r2 = r2.getWavFile()
            r1[r10] = r2
        L_0x03b6:
            r0.mAudioPaths = r1
            goto L_0x03d8
        L_0x03b9:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r0 = r0.previewConfigure
            r0.mAudioPaths = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "init ve_editor in edit page using preview configure:"
            r1.<init>(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.z
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r2 = r2.previewConfigure
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.ugc.aweme.shortvideo.util.ai.a(r1)
        L_0x03d8:
            android.content.Intent r1 = r29.getIntent()
            java.lang.String r2 = "extra_editor_model"
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)
            com.ss.android.vesdk.q r1 = (com.ss.android.vesdk.q) r1
            r0.editorModel = r1
            android.content.Intent r1 = r29.getIntent()
            java.lang.String r2 = "extra_editor_extra"
            r3 = -1
            long r1 = r1.getLongExtra(r2, r3)
            r0.editorHandler = r1
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            float r1 = r1.voiceVolume
            r0.mVolume = r1
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            float r1 = r1.musicVolume
            r0.mMusicVolume = r1
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r1 = r1.mPath
            java.lang.String r1 = com.ss.android.ugc.aweme.shortvideo.a.d.a((java.lang.String) r1)
            r0.mWorkspace = r1
            r1 = 30
            r0.mFps = r1
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            int r1 = r1.videoEditorType
            r0.videoEditorType = r1
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r1 = r1.mMusicPath
            r0.mMusicPath = r1
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            int r1 = r1.mMusicStart
            r0.mMusicInPoint = r1
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            int r1 = r1.mMusicEnd
            r0.mMusicOutPoint = r1
            r0.mPageType = r9
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            boolean r1 = r1.mIsFromDraft
            r0.mIsFromDraft = r1
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            com.ss.android.ugc.aweme.x.a r1 = r1.mvCreateVideoData
            r0.mvCreateVideoData = r1
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            com.ss.android.ugc.aweme.shortvideo.ah r1 = r1.veCherEffectParam
            if (r1 == 0) goto L_0x0459
            com.ss.android.vesdk.VECherEffectParam r1 = new com.ss.android.vesdk.VECherEffectParam
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.z
            com.ss.android.ugc.aweme.shortvideo.ah r2 = r2.veCherEffectParam
            java.lang.String[] r2 = r2.getMatrix()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            com.ss.android.ugc.aweme.shortvideo.ah r3 = r3.veCherEffectParam
            double[] r3 = r3.getDuration()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r4 = r7.z
            com.ss.android.ugc.aweme.shortvideo.ah r4 = r4.veCherEffectParam
            boolean[] r4 = r4.getSegUseCher()
            r1.<init>(r2, r3, r4)
            r0.veCherEffectParam = r1
        L_0x0459:
            com.ss.android.ugc.aweme.shortvideo.edit.ce r1 = r7.K
            int r1 = r1.d()
            r0.canvasWidth = r1
            com.ss.android.ugc.aweme.shortvideo.edit.ce r1 = r7.K
            int r1 = r1.e()
            r0.canvasHeight = r1
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r1 = r1.veAudioEffectParam
            if (r1 == 0) goto L_0x0475
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r1 = r1.veAudioEffectParam
            r0.veAudioEffectParam = r1
        L_0x0475:
            dmt.av.video.VEVideoPublishEditViewModel r1 = r7.v
            android.arch.lifecycle.MutableLiveData r1 = r1.a()
            r1.setValue(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            int r0 = r0.isMusic()
            if (r0 != r9) goto L_0x04ba
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            int r0 = r0.recordMode
            if (r0 == 0) goto L_0x0492
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            boolean r0 = r0.mIsFromDraft
            if (r0 == 0) goto L_0x04ba
        L_0x0492:
            dmt.av.video.t r0 = new dmt.av.video.t
            r0.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r1 = r1.mMusicPath
            r0.f83064b = r1
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            int r1 = r1.mMusicStart
            r0.f83065c = r1
            r0.f83066d = r8
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            float r1 = r1.musicVolume
            r0.f83067e = r1
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            java.lang.String r1 = r1.musicId
            r0.f83068f = r1
            dmt.av.video.VEVideoPublishEditViewModel r1 = r7.v
            android.arch.lifecycle.MutableLiveData r1 = r1.d()
            r1.setValue(r0)
        L_0x04ba:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            int r0 = r0.isMusic()
            if (r0 != r9) goto L_0x04cc
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            int r0 = r0.recordMode
            if (r0 != r9) goto L_0x04cc
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            r0.mMusicPath = r12
        L_0x04cc:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76346(0x12a3a, float:1.06984E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x04f2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76346(0x12a3a, float:1.06984E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0529
        L_0x04f2:
            boolean r0 = com.ss.android.ugc.aweme.g.a.a()
            if (r0 == 0) goto L_0x0529
            com.ss.android.ugc.aweme.property.a r0 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r1 = com.ss.android.ugc.aweme.property.a.C0682a.ShowVideoInfo
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L_0x0529
            r0 = 2131171360(0x7f071820, float:1.7957104E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r10)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "fps: %d"
            java.lang.Object[] r3 = new java.lang.Object[r9]
            com.ss.android.ugc.aweme.shortvideo.edit.cb r4 = r7.z
            java.lang.String r4 = r4.mPath
            int r4 = dmt.av.video.ah.b(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r10] = r4
            java.lang.String r1 = java.lang.String.format(r1, r2, r3)
            r0.setText(r1)
        L_0x0529:
            com.ss.android.ugc.gamora.editor.d r0 = new com.ss.android.ugc.gamora.editor.d
            r0.<init>()
            r7.Q = r0
            r1 = 2131166511(0x7f07052f, float:1.794727E38)
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$13 r2 = new com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$13
            java.lang.Class<com.ss.android.ugc.gamora.editor.d> r0 = com.ss.android.ugc.gamora.editor.d.class
            r2.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.am r3 = new com.ss.android.ugc.aweme.shortvideo.edit.am
            r3.<init>(r7)
            r4 = 0
            java.lang.String r5 = "EditTitlebarScene"
            r0 = r29
            com.bytedance.scene.d.a((android.app.Activity) r0, (int) r1, (com.bytedance.scene.navigation.g) r2, (com.bytedance.scene.f) r3, (boolean) r4, (java.lang.String) r5)
            com.ss.android.ugc.gamora.editor.a r0 = new com.ss.android.ugc.gamora.editor.a
            r0.<init>()
            r7.R = r0
            r1 = 2131166493(0x7f07051d, float:1.7947233E38)
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$14 r2 = new com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$14
            java.lang.Class<com.ss.android.ugc.gamora.editor.a> r0 = com.ss.android.ugc.gamora.editor.a.class
            r2.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.ax r3 = new com.ss.android.ugc.aweme.shortvideo.edit.ax
            r3.<init>(r7)
            java.lang.String r5 = "EditBottomBarScene"
            r0 = r29
            com.bytedance.scene.d.a((android.app.Activity) r0, (int) r1, (com.bytedance.scene.navigation.g) r2, (com.bytedance.scene.f) r3, (boolean) r4, (java.lang.String) r5)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76392(0x12a68, float:1.07048E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r12 = 8
            r14 = 7
            if (r0 == 0) goto L_0x058f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76392(0x12a68, float:1.07048E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x058c:
            r8 = 0
            goto L_0x0bce
        L_0x058f:
            r15 = 2131169554(0x7f071112, float:1.7953441E38)
            android.view.View r0 = r7.findViewById(r15)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7.i = r0
            com.ss.android.ugc.aweme.shortvideo.util.aa r0 = com.ss.android.ugc.aweme.shortvideo.util.aa.a()
            android.view.ViewGroup r1 = r7.i
            r0.a(r7, r1)
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.fc.a()
            if (r0 == 0) goto L_0x05b8
            r0 = 2131170167(0x7f071377, float:1.7954685E38)
            android.view.View r0 = r7.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r1 = 2131691050(0x7f0f062a, float:1.901116E38)
            r0.setLayoutResource(r1)
        L_0x05b8:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76395(0x12a6b, float:1.07052E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x05de
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76395(0x12a6b, float:1.07052E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x05ec
        L_0x05de:
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r7.O
            android.arch.lifecycle.MutableLiveData r0 = r0.e()
            com.ss.android.ugc.aweme.shortvideo.edit.aw r1 = new com.ss.android.ugc.aweme.shortvideo.edit.aw
            r1.<init>(r7)
            r0.observe(r7, r1)
        L_0x05ec:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = r29.y()
            r6 = 5
            r5 = 2130837662(0x7f02009e, float:1.7280284E38)
            r4 = 9
            r3 = 6
            r15 = 4
            if (r2 == 0) goto L_0x06cc
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r10 = 2130839142(0x7f020666, float:1.7283286E38)
            r8 = 2131561372(0x7f0d0b9c, float:1.8748143E38)
            r2.<init>(r9, r10, r8)
            r1.add(r2)
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839520(0x7f0207e0, float:1.7284053E38)
            r10 = 2131559824(0x7f0d0590, float:1.8745003E38)
            r2.<init>(r11, r8, r10)
            r1.add(r2)
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839538(0x7f0207f2, float:1.728409E38)
            r10 = 2131564671(0x7f0d187f, float:1.8754834E38)
            r2.<init>(r13, r8, r10)
            r1.add(r2)
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839537(0x7f0207f1, float:1.7284087E38)
            r10 = 2131562700(0x7f0d10cc, float:1.8750836E38)
            r2.<init>(r15, r8, r10)
            r1.add(r2)
            boolean r2 = r29.J()
            if (r2 != 0) goto L_0x0648
            boolean r2 = r29.L()
            if (r2 == 0) goto L_0x065d
        L_0x0648:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r2 = r7.S
            java.util.Map r2 = r2.f()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            java.lang.Object r2 = r2.get(r8)
            android.arch.lifecycle.MutableLiveData r2 = (android.arch.lifecycle.MutableLiveData) r2
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r2.setValue(r8)
        L_0x065d:
            boolean r2 = com.ss.android.ugc.aweme.shortvideo.edit.a.a.b()
            if (r2 == 0) goto L_0x066e
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2131558756(0x7f0d0164, float:1.8742837E38)
            r2.<init>(r4, r5, r8)
            r0.add(r2)
        L_0x066e:
            boolean r2 = r29.an()
            if (r2 == 0) goto L_0x0682
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839542(0x7f0207f6, float:1.7284098E38)
            r10 = 2131558805(0x7f0d0195, float:1.8742936E38)
            r2.<init>(r3, r8, r10)
            r0.add(r2)
        L_0x0682:
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839521(0x7f0207e1, float:1.7284055E38)
            r10 = 2131560003(0x7f0d0643, float:1.8745366E38)
            r2.<init>(r6, r8, r10)
            r0.add(r2)
            boolean r2 = r29.am()
            if (r2 != 0) goto L_0x06b0
            boolean r2 = r29.J()
            if (r2 != 0) goto L_0x06b0
            boolean r2 = r29.L()
            if (r2 != 0) goto L_0x06b0
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839511(0x7f0207d7, float:1.7284035E38)
            r10 = 2131559571(0x7f0d0493, float:1.874449E38)
            r2.<init>(r12, r8, r10)
            r0.add(r2)
        L_0x06b0:
            boolean r2 = r29.am()
            if (r2 != 0) goto L_0x0793
            boolean r2 = r29.J()
            if (r2 != 0) goto L_0x0793
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839543(0x7f0207f7, float:1.72841E38)
            r10 = 2131562498(0x7f0d1002, float:1.8750426E38)
            r2.<init>(r14, r8, r10)
            r0.add(r2)
            goto L_0x0793
        L_0x06cc:
            boolean r2 = com.ss.android.ugc.aweme.shortvideo.edit.a.a.b()
            if (r2 == 0) goto L_0x06dd
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2131558756(0x7f0d0164, float:1.8742837E38)
            r2.<init>(r4, r5, r8)
            r0.add(r2)
        L_0x06dd:
            boolean r2 = r7 instanceof com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity
            if (r2 != 0) goto L_0x06fd
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839511(0x7f0207d7, float:1.7284035E38)
            r10 = 2131559571(0x7f0d0493, float:1.874449E38)
            r2.<init>(r12, r8, r10)
            r0.add(r2)
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839543(0x7f0207f7, float:1.72841E38)
            r10 = 2131562498(0x7f0d1002, float:1.8750426E38)
            r2.<init>(r14, r8, r10)
            r0.add(r2)
        L_0x06fd:
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839542(0x7f0207f6, float:1.7284098E38)
            r10 = 2131558805(0x7f0d0195, float:1.8742936E38)
            r2.<init>(r3, r8, r10)
            r0.add(r2)
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839142(0x7f020666, float:1.7283286E38)
            r10 = 2131561372(0x7f0d0b9c, float:1.8748143E38)
            r2.<init>(r9, r8, r10)
            r0.add(r2)
            com.ss.android.ugc.aweme.shortvideo.ej r2 = com.ss.android.ugc.aweme.shortvideo.ej.a()
            com.ss.android.ugc.aweme.shortvideo.e r2 = r2.b()
            if (r2 != 0) goto L_0x073f
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.z
            boolean r2 = r2.isMvThemeVideoType()
            if (r2 == 0) goto L_0x0738
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.z
            com.ss.android.ugc.aweme.x.a r2 = r2.mvCreateVideoData
            java.util.List<java.lang.String> r2 = r2.musicIds
            boolean r2 = com.ss.android.ugc.aweme.base.utils.j.a((java.util.Collection<T>) r2)
            if (r2 != 0) goto L_0x0738
            goto L_0x073f
        L_0x0738:
            java.lang.String r2 = "music"
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r2, (int) r9)
            r8 = -1
            goto L_0x0745
        L_0x073f:
            java.lang.String r2 = "music"
            r8 = -1
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r2, (int) r8)
        L_0x0745:
            java.lang.String r2 = "effect"
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r2, (int) r15)
            boolean r2 = r29.l()
            if (r2 != 0) goto L_0x0756
            java.lang.String r2 = "sticker"
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r2, (int) r8)
            goto L_0x075b
        L_0x0756:
            java.lang.String r2 = "sticker"
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r2, (int) r11)
        L_0x075b:
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839520(0x7f0207e0, float:1.7284053E38)
            r10 = 2131559824(0x7f0d0590, float:1.8745003E38)
            r2.<init>(r11, r8, r10)
            r1.add(r2)
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839538(0x7f0207f2, float:1.728409E38)
            r10 = 2131564671(0x7f0d187f, float:1.8754834E38)
            r2.<init>(r13, r8, r10)
            r1.add(r2)
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839521(0x7f0207e1, float:1.7284055E38)
            r10 = 2131560003(0x7f0d0643, float:1.8745366E38)
            r2.<init>(r6, r8, r10)
            r1.add(r2)
            com.ss.android.ugc.gamora.editor.f r2 = new com.ss.android.ugc.gamora.editor.f
            r8 = 2130839537(0x7f0207f1, float:1.7284087E38)
            r10 = 2131562700(0x7f0d10cc, float:1.8750836E38)
            r2.<init>(r15, r8, r10)
            r1.add(r2)
        L_0x0793:
            com.ss.android.ugc.aweme.shortvideo.ej r2 = com.ss.android.ugc.aweme.shortvideo.ej.a()
            com.ss.android.ugc.aweme.shortvideo.e r2 = r2.b()
            if (r2 != 0) goto L_0x07b9
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.z
            boolean r2 = r2.isMvThemeVideoType()
            if (r2 == 0) goto L_0x07b2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.z
            com.ss.android.ugc.aweme.x.a r2 = r2.mvCreateVideoData
            java.util.List<java.lang.String> r2 = r2.musicIds
            boolean r2 = com.ss.android.ugc.aweme.base.utils.j.a((java.util.Collection<T>) r2)
            if (r2 != 0) goto L_0x07b2
            goto L_0x07b9
        L_0x07b2:
            java.lang.String r2 = "music"
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r2, (int) r9)
            r8 = -1
            goto L_0x07bf
        L_0x07b9:
            java.lang.String r2 = "music"
            r8 = -1
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r2, (int) r8)
        L_0x07bf:
            java.lang.String r2 = "effect"
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r2, (int) r15)
            boolean r2 = r29.l()
            if (r2 != 0) goto L_0x07d0
            java.lang.String r2 = "sticker"
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r2, (int) r8)
            goto L_0x07d5
        L_0x07d0:
            java.lang.String r2 = "sticker"
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r2, (int) r11)
        L_0x07d5:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r2 = r7.S
            android.arch.lifecycle.MutableLiveData r2 = r2.d()
            r2.setValue(r0)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            android.arch.lifecycle.MutableLiveData r0 = r0.e()
            r0.setValue(r1)
            r0 = 2131170114(0x7f071342, float:1.7954577E38)
            android.view.View r0 = r7.findViewById(r0)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout r0 = (com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout) r0
            r7.n = r0
            r0 = 2131167858(0x7f070a72, float:1.7950001E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.l = r0
            r0 = 2131170114(0x7f071342, float:1.7954577E38)
            android.view.View r0 = r7.findViewById(r0)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout r0 = (com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout) r0
            r7.y = r0
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r10 = 0
            r11 = 76342(0x12a36, float:1.06978E-40)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class r16 = java.lang.Void.TYPE
            r17 = r1
            r1 = r29
            r22 = 6
            r3 = r10
            r10 = 9
            r4 = r11
            r11 = 2130837662(0x7f02009e, float:1.7280284E38)
            r5 = r17
            r17 = 5
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0841
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76342(0x12a36, float:1.06978E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08f7
        L_0x0841:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.a r0 = new com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.a
            r1 = 2131169554(0x7f071112, float:1.7953441E38)
            android.view.View r1 = r7.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            dmt.av.video.VEVideoPublishEditViewModel r2 = r7.v
            android.arch.lifecycle.LiveData r2 = r2.k()
            java.lang.Object r2 = r2.getValue()
            com.ss.android.ugc.aweme.filter.h r2 = (com.ss.android.ugc.aweme.filter.h) r2
            r0.<init>(r1, r7, r7, r2)
            r7.x = r0
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.a r0 = r7.x
            r0.a((int) r9)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.a r0 = r7.x
            r0.f74293d = r7
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.a r0 = r7.x
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout r0 = r0.f74292c
            r7.f3938f = r0
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout r8 = r7.f3938f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r1 = 0
            r0[r1] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76343(0x12a37, float:1.0698E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout> r6 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout.class
            r5[r1] = r6
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x08a2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r1 = 0
            r0[r1] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76343(0x12a37, float:1.0698E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout> r6 = com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout.class
            r5[r1] = r6
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08f7
        L_0x08a2:
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r1 = r29.I()
            int r1 = com.ss.android.ugc.aweme.shortvideo.fc.b(r1)
            float r1 = (float) r1
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r2 = r29.I()
            boolean r2 = com.ss.android.ugc.aweme.tools.b.a(r2)
            if (r2 == 0) goto L_0x08bb
            r2 = 0
            goto L_0x08c5
        L_0x08bb:
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r2 = r29.I()
            r3 = 1112014848(0x42480000, float:50.0)
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r3)
        L_0x08c5:
            float r1 = r1 + r2
            int r1 = (int) r1
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r2 = r29.I()
            int r2 = com.ss.android.ugc.aweme.shortvideo.fc.e(r2)
            float r2 = (float) r2
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r3 = r29.I()
            r4 = 1112014848(0x42480000, float:50.0)
            float r3 = com.bytedance.common.utility.UIUtils.dip2Px(r3, r4)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r0 != 0) goto L_0x08e4
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r2)
            goto L_0x08e8
        L_0x08e4:
            r0.width = r1
            r0.height = r2
        L_0x08e8:
            r8.setLayoutParams(r0)
            r0 = 4639481672377565184(0x4062c00000000000, double:150.0)
            int r0 = com.ss.android.ugc.aweme.base.utils.u.a((double) r0)
            r8.setSloppyExtra(r0)
        L_0x08f7:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout r0 = r7.y
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.a r1 = r7.x
            r0.setGestureModule(r1)
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r7.O
            android.arch.lifecycle.MutableLiveData r0 = r0.c()
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$11 r1 = new com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$11
            r1.<init>()
            r0.observe(r7, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            boolean r0 = r0.mIsFromDraft
            if (r0 == 0) goto L_0x091d
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            android.arch.lifecycle.MutableLiveData r0 = r0.b()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
        L_0x091d:
            r29.j()
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76402(0x12a72, float:1.07062E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0949
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76402(0x12a72, float:1.07062E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x0946:
            r8 = 0
            goto L_0x0a2c
        L_0x0949:
            boolean r0 = r29.y()
            if (r0 != 0) goto L_0x0955
            boolean r0 = r29.am()
            if (r0 == 0) goto L_0x095b
        L_0x0955:
            boolean r0 = r29.an()
            if (r0 != 0) goto L_0x097a
        L_0x095b:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            java.util.Map r0 = r0.f()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            java.lang.Object r0 = r0.get(r1)
            android.arch.lifecycle.MutableLiveData r0 = (android.arch.lifecycle.MutableLiveData) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            r0 = 0
            r7.j = r0
            java.lang.String r0 = "voice"
            r1 = -1
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r0, (int) r1)
            goto L_0x0946
        L_0x097a:
            java.lang.String r0 = "voice"
            r1 = 6
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r0, (int) r1)
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule r0 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            android.widget.FrameLayout r2 = r7.l
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r7.z
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r3 = r3.veAudioEffectParam
            r0.<init>(r7, r1, r2, r3)
            r7.k = r0
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule r0 = r7.k
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r2 = 0
            r1[r2] = r7
            com.meituan.robust.ChangeQuickRedirect r24 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule.f3939a
            r25 = 0
            r26 = 76617(0x12b49, float:1.07363E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r4 = android.arch.lifecycle.LifecycleOwner.class
            r3[r2] = r4
            java.lang.Class r28 = java.lang.Void.TYPE
            r22 = r1
            r23 = r0
            r27 = r3
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r22, r23, r24, r25, r26, r27, r28)
            if (r1 == 0) goto L_0x09cf
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r2 = 0
            r1[r2] = r7
            com.meituan.robust.ChangeQuickRedirect r24 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule.f3939a
            r25 = 0
            r26 = 76617(0x12b49, float:1.07363E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r4 = android.arch.lifecycle.LifecycleOwner.class
            r3[r2] = r4
            java.lang.Class r28 = java.lang.Void.TYPE
            r22 = r1
            r23 = r0
            r27 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x09dd
        L_0x09cf:
            java.lang.String r1 = "owner"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r1)
            android.arch.lifecycle.Lifecycle r1 = r29.getLifecycle()
            android.arch.lifecycle.LifecycleObserver r0 = (android.arch.lifecycle.LifecycleObserver) r0
            r1.addObserver(r0)
        L_0x09dd:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule r0 = r7.k
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$12 r1 = new com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$12
            r1.<init>()
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r3 = 0
            r2[r3] = r1
            com.meituan.robust.ChangeQuickRedirect r24 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule.f3939a
            r25 = 0
            r26 = 76619(0x12b4b, float:1.07366E-40)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.photomovie.transition.f> r5 = com.ss.android.ugc.aweme.photomovie.transition.f.class
            r4[r3] = r5
            java.lang.Class r28 = java.lang.Void.TYPE
            r22 = r2
            r23 = r0
            r27 = r4
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r22, r23, r24, r25, r26, r27, r28)
            if (r2 == 0) goto L_0x0a23
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r3 = 0
            r2[r3] = r1
            com.meituan.robust.ChangeQuickRedirect r24 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectModule.f3939a
            r25 = 0
            r26 = 76619(0x12b4b, float:1.07366E-40)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.photomovie.transition.f> r4 = com.ss.android.ugc.aweme.photomovie.transition.f.class
            r1[r3] = r4
            java.lang.Class r28 = java.lang.Void.TYPE
            r22 = r2
            r23 = r0
            r27 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0946
        L_0x0a23:
            java.lang.String r2 = "transitionListener"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            r0.h = r1
            goto L_0x0946
        L_0x0a2c:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76393(0x12a69, float:1.0705E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0a52
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76393(0x12a69, float:1.0705E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0a94
        L_0x0a52:
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.edit.a.a.b()
            if (r0 != 0) goto L_0x0a74
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            java.util.Map r0 = r0.f()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Object r0 = r0.get(r1)
            android.arch.lifecycle.MutableLiveData r0 = (android.arch.lifecycle.MutableLiveData) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            java.lang.String r0 = "auto_enhance"
            r1 = -1
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r0, (int) r1)
            goto L_0x0a94
        L_0x0a74:
            java.lang.String r0 = "auto_enhance"
            r1 = 0
            com.ss.android.ugc.aweme.shortvideo.edit.s.a((java.lang.String) r0, (int) r1)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            android.arch.lifecycle.MutableLiveData r0 = r0.r()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            boolean r1 = r1.autoEnhanceOn
            if (r1 == 0) goto L_0x0a8a
            r5 = 2130837664(0x7f0200a0, float:1.7280288E38)
            goto L_0x0a8d
        L_0x0a8a:
            r5 = 2130837662(0x7f02009e, float:1.7280284E38)
        L_0x0a8d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.setValue(r1)
        L_0x0a94:
            boolean r0 = r29.J()
            if (r0 != 0) goto L_0x0aa8
            boolean r0 = r29.L()
            if (r0 != 0) goto L_0x0aa8
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            java.lang.String r0 = r0.mMusicPath
            if (r0 == 0) goto L_0x0aa8
            r0 = 1
            goto L_0x0aa9
        L_0x0aa8:
            r0 = 0
        L_0x0aa9:
            r7.a((boolean) r0)
            com.ss.android.ugc.aweme.shortvideo.ej r0 = com.ss.android.ugc.aweme.shortvideo.ej.a()
            com.ss.android.ugc.aweme.shortvideo.e r0 = r0.b()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            boolean r1 = r1.isMvThemeVideoType()
            if (r1 == 0) goto L_0x0ade
            if (r0 == 0) goto L_0x0ade
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            com.ss.android.ugc.aweme.x.a r1 = r1.mvCreateVideoData
            java.util.List<java.lang.String> r1 = r1.musicIds
            boolean r1 = com.ss.android.ugc.aweme.base.utils.j.a((java.util.Collection<T>) r1)
            if (r1 != 0) goto L_0x0ade
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            com.ss.android.ugc.aweme.x.a r1 = r1.mvCreateVideoData
            java.util.List<java.lang.String> r1 = r1.musicIds
            java.lang.String r0 = r0.getMusicId()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0ade
            r0 = 0
            r7.a((boolean) r0)
        L_0x0ade:
            boolean r0 = r29.J()
            if (r0 == 0) goto L_0x0b0e
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            java.util.Map r0 = r0.g()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Object r0 = r0.get(r1)
            android.arch.lifecycle.MutableLiveData r0 = (android.arch.lifecycle.MutableLiveData) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            java.util.Map r0 = r0.g()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r0.get(r1)
            android.arch.lifecycle.MutableLiveData r0 = (android.arch.lifecycle.MutableLiveData) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
        L_0x0b0e:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            boolean r0 = r0.mIsFromDraft
            if (r0 == 0) goto L_0x0b42
            boolean r0 = r29.J()
            if (r0 != 0) goto L_0x0b37
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            if (r0 == 0) goto L_0x0b26
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            int r0 = r0.mOrigin
            if (r0 != 0) goto L_0x0b26
            r0 = 1
            goto L_0x0b27
        L_0x0b26:
            r0 = 0
        L_0x0b27:
            if (r0 != 0) goto L_0x0b37
            boolean r0 = r29.L()
            if (r0 != 0) goto L_0x0b37
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            boolean r0 = r0.isMvThemeVideoType()
            if (r0 == 0) goto L_0x0b42
        L_0x0b37:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            android.arch.lifecycle.MutableLiveData r0 = r0.b()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
        L_0x0b42:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            java.util.Map r0 = r0.f()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r0 = r0.get(r1)
            android.arch.lifecycle.MutableLiveData r0 = (android.arch.lifecycle.MutableLiveData) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r7.O
            android.arch.lifecycle.MutableLiveData r0 = r0.d()
            com.ss.android.ugc.aweme.shortvideo.edit.au r1 = new com.ss.android.ugc.aweme.shortvideo.edit.au
            r1.<init>(r7)
            r0.observe(r7, r1)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            java.util.Map r0 = r0.f()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            java.lang.Object r0 = r0.get(r1)
            android.arch.lifecycle.MutableLiveData r0 = (android.arch.lifecycle.MutableLiveData) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.fc.a()
            if (r0 == 0) goto L_0x0ba1
            r0 = 2131166186(0x7f0703ea, float:1.794661E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r7.f3936d = r0
            r0 = 2131166185(0x7f0703e9, float:1.7946608E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r7.f3937e = r0
            android.widget.RelativeLayout r0 = r7.f3936d
            r1 = 0
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r7.f3937e
            r0.setVisibility(r1)
        L_0x0ba1:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            java.util.Map r0 = r0.f()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r0.get(r1)
            android.arch.lifecycle.MutableLiveData r0 = (android.arch.lifecycle.MutableLiveData) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            r0 = 2131170354(0x7f071432, float:1.7955064E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.F = r0
            r0 = 2131170355(0x7f071433, float:1.7955066E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r7.G = r0
            goto L_0x058c
        L_0x0bce:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76344(0x12a38, float:1.06981E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0bf5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76344(0x12a38, float:1.06981E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x0bf3:
            r8 = 0
            goto L_0x0c27
        L_0x0bf5:
            dmt.av.video.VEVideoPublishEditViewModel r0 = r7.v
            android.arch.lifecycle.LiveData r0 = r0.k()
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            com.ss.android.ugc.aweme.filter.h r4 = (com.ss.android.ugc.aweme.filter.h) r4
            com.ss.android.ugc.aweme.shortvideo.edit.k r6 = new com.ss.android.ugc.aweme.shortvideo.edit.k
            android.widget.FrameLayout r3 = r7.l
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r7.z
            r0 = r6
            r1 = r29
            r2 = r29
            r0.<init>(r1, r2, r3, r4, r5)
            r7.w = r6
            com.ss.android.ugc.aweme.shortvideo.edit.o r0 = r7.w
            r0.a((boolean) r9)
            com.ss.android.ugc.aweme.shortvideo.edit.o r0 = r7.w
            r0.b(r9)
            com.ss.android.ugc.aweme.shortvideo.edit.o r0 = r7.w
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$19 r1 = new com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$19
            r1.<init>()
            r0.a((com.ss.android.ugc.aweme.shortvideo.edit.o.a) r1)
            goto L_0x0bf3
        L_0x0c27:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76345(0x12a39, float:1.06982E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0c4f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76345(0x12a39, float:1.06982E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x0c4c:
            r8 = 0
            goto L_0x0cdd
        L_0x0c4f:
            boolean r0 = r29.an()
            if (r0 == 0) goto L_0x0c4c
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b r0 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b.f67057c
            r1 = 0
            java.lang.Object[] r15 = new java.lang.Object[r1]
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b.f67055a
            r18 = 0
            r19 = 76594(0x12b32, float:1.07331E-40)
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r2 == 0) goto L_0x0c84
            java.lang.Object[] r15 = new java.lang.Object[r1]
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b.f67055a
            r18 = 0
            r19 = 76594(0x12b32, float:1.07331E-40)
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0c4c
        L_0x0c84:
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d> r2 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d.class
            java.lang.Object r1 = com.ss.android.ugc.aweme.common.g.a.a(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d r1 = (com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d) r1
            com.ss.android.ugc.aweme.port.in.m r2 = com.ss.android.ugc.aweme.port.in.a.f61121d
            java.lang.String r3 = "AVEnv.APPLICATION_SERVICE"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            int r2 = r2.c()
            r3 = 0
            int r4 = r1.a(r3)
            if (r2 == r4) goto L_0x0c4c
            java.lang.Object[] r15 = new java.lang.Object[r3]
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b.f67055a
            r18 = 0
            r19 = 76595(0x12b33, float:1.07332E-40)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r4 == 0) goto L_0x0cce
            java.lang.Object[] r15 = new java.lang.Object[r3]
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b.f67055a
            r18 = 0
            r19 = 76595(0x12b33, float:1.07332E-40)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0cd8
        L_0x0cce:
            com.ss.android.ugc.aweme.shortvideo.util.ag.a()
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b$a r0 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b.a.f67059b
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            a.i.a((java.util.concurrent.Callable<TResult>) r0)
        L_0x0cd8:
            r1.b(r2)
            goto L_0x0c4c
        L_0x0cdd:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76340(0x12a34, float:1.06975E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0d04
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76340(0x12a34, float:1.06975E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r8 = 0
            goto L_0x0d1d
        L_0x0d04:
            android.support.v4.app.FragmentManager r0 = r29.getSupportFragmentManager()
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$8 r1 = new com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$8
            r1.<init>()
            r8 = 0
            r0.registerFragmentLifecycleCallbacks(r1, r8)
            android.support.v4.app.FragmentManager r0 = r29.getSupportFragmentManager()
            com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$ChooseVideoCoverFragmentLifecycleCallbacks r1 = new com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity$ChooseVideoCoverFragmentLifecycleCallbacks
            r1.<init>()
            r0.registerFragmentLifecycleCallbacks(r1, r8)
        L_0x0d1d:
            r29.h()
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76376(0x12a58, float:1.07026E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0d46
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76376(0x12a58, float:1.07026E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0d76
        L_0x0d46:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            boolean r0 = r0.isMvThemeVideoType()
            if (r0 == 0) goto L_0x0d76
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            com.ss.android.ugc.aweme.x.a r0 = r0.mvCreateVideoData
            java.util.List<java.lang.String> r0 = r0.musicIds
            boolean r0 = com.ss.android.ugc.aweme.base.utils.j.a((java.util.Collection<T>) r0)
            if (r0 != 0) goto L_0x0d76
            com.ss.android.ugc.aweme.ao.a r0 = com.ss.android.ugc.aweme.port.in.a.i
            com.ss.android.ugc.aweme.shortvideo.ej r1 = com.ss.android.ugc.aweme.shortvideo.ej.a()
            com.ss.android.ugc.aweme.ao.a$g r0 = r0.a((com.ss.android.ugc.aweme.ao.a.g) r1)
            com.ss.android.ugc.aweme.shortvideo.edit.aq r1 = new com.ss.android.ugc.aweme.shortvideo.edit.aq
            r1.<init>(r7)
            com.ss.android.ugc.aweme.ao.a$g r0 = r0.a((com.ss.android.ugc.aweme.ao.a.c) r1)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.z
            com.ss.android.ugc.aweme.x.a r1 = r1.mvCreateVideoData
            java.util.List<java.lang.String> r1 = r1.musicIds
            r0.a((java.util.List<java.lang.String>) r1)
        L_0x0d76:
            com.ss.android.ugc.aweme.shortvideo.helper.MusicDragHelper r0 = new com.ss.android.ugc.aweme.shortvideo.helper.MusicDragHelper
            r0.<init>(r7)
            r7.D = r0
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            int r0 = r0.recordMode
            if (r0 != r9) goto L_0x0d8b
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            boolean r0 = r0.mIsFromDraft
            if (r0 != 0) goto L_0x0d8b
            r0 = 1
            goto L_0x0d8c
        L_0x0d8b:
            r0 = 0
        L_0x0d8c:
            r7.c((boolean) r0)
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76433(0x12a91, float:1.07105E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0db7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76433(0x12a91, float:1.07105E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x0db5:
            r8 = 0
            goto L_0x0dfd
        L_0x0db7:
            boolean r0 = r29.J()
            if (r0 == 0) goto L_0x0db5
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            java.util.Map r0 = r0.f()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r0.get(r1)
            android.arch.lifecycle.MutableLiveData r0 = (android.arch.lifecycle.MutableLiveData) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            java.util.Map r0 = r0.f()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Object r0 = r0.get(r1)
            android.arch.lifecycle.MutableLiveData r0 = (android.arch.lifecycle.MutableLiveData) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            java.util.Map r0 = r0.f()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.Object r0 = r0.get(r1)
            android.arch.lifecycle.MutableLiveData r0 = (android.arch.lifecycle.MutableLiveData) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            goto L_0x0db5
        L_0x0dfd:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76434(0x12a92, float:1.07107E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0e23
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 76434(0x12a92, float:1.07107E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0e3e
        L_0x0e23:
            boolean r0 = r29.L()
            if (r0 == 0) goto L_0x0e3e
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r7.S
            java.util.Map r0 = r0.f()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r0.get(r1)
            android.arch.lifecycle.MutableLiveData r0 = (android.arch.lifecycle.MutableLiveData) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
        L_0x0e3e:
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.fc.a()
            if (r0 == 0) goto L_0x0e55
            r29.w()
            android.content.res.Resources r0 = r29.getResources()
            r1 = 2131624092(0x7f0e009c, float:1.8875354E38)
            int r0 = r0.getColor(r1)
            r7.a((int) r0)
        L_0x0e55:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            boolean r0 = r0.mIsFromDraft
            if (r0 == 0) goto L_0x0e68
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            int r0 = r0.getNewVersion()
            if (r0 == r13) goto L_0x0e68
            java.lang.String r0 = "enter ve_edit_page with old version draft"
            com.ss.android.ugc.aweme.shortvideo.util.ai.c(r0)
        L_0x0e68:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.z
            android.content.Intent r1 = r29.getIntent()
            com.ss.android.ugc.aweme.shortvideo.edit.bz.a(r0, r1)
            android.arch.lifecycle.Lifecycle r0 = r29.getLifecycle()
            com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager r1 = com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager.a(r29)
            r0.addObserver(r1)
            java.lang.String r0 = "com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity"
            java.lang.String r1 = "onCreate"
            r2 = 0
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.shortvideo.e eVar, com.ss.android.ugc.aweme.shortvideo.f fVar) {
        this.D.a(fVar, eVar.getDuration(), this.z.mMusicStart);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        int i3 = i2;
        KeyEvent keyEvent2 = keyEvent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), keyEvent2}, this, h, false, 76435, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), keyEvent2}, this, h, false, 76435, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        for (com.ss.android.ugc.aweme.base.activity.a a2 : this.W) {
            if (a2.a(i3, keyEvent2)) {
                return true;
            }
        }
        if (i3 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(C0906R.id.cga);
        if (findFragmentById != null) {
            getSupportFragmentManager().beginTransaction().remove(findFragmentById).commit();
            return true;
        }
        M();
        return true;
    }

    public static void a(Activity activity, Intent intent, int i2) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{activity2, intent2, 1}, null, h, true, 76323, new Class[]{Activity.class, Intent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, intent2, 1}, null, h, true, 76323, new Class[]{Activity.class, Intent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.RecommentMusicByAIPolicy) != 0) {
            intent2.setClass(activity2, AIMusicVEVideoPublishEditActivity.class);
        } else {
            intent2.setClass(activity2, VEVideoPublishEditActivity.class);
        }
        activity2.startActivityForResult(intent2, intent2.getIntExtra("extra_request_code", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR));
    }

    private void a(@StringRes int i2, @StringRes int i3, @StringRes int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, h, false, 76413, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, h, false, 76413, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        new a.C0185a(this).b(i2).b(i3, (DialogInterface.OnClickListener) null).a(i4, (DialogInterface.OnClickListener) new ay(this)).a().a();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, h, false, 76381, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, h, false, 76381, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1002) {
            Intent intent2 = new Intent();
            if (!(intent == null || intent.getExtras() == null)) {
                String string = intent.getExtras().getString("publish result");
                intent2.putExtra("edit result", "PublishEditActivity success" + string);
                intent2.putExtras(intent.getExtras());
            }
            setResult(i4, intent2);
            if (i4 == -1) {
                finish();
            }
            return;
        }
    }

    public static void a(Context context, Intent intent, int i2) {
        Context context2 = context;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2, Integer.valueOf(i2)}, null, h, true, 76324, new Class[]{Context.class, Intent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent2, Integer.valueOf(i2)}, null, h, true, 76324, new Class[]{Context.class, Intent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.RecommentMusicByAIPolicy) != 0) {
            intent2.setClass(context2, AIMusicVEVideoPublishEditActivity.class);
        } else {
            intent2.setClass(context2, VEVideoPublishEditActivity.class);
        }
        context.startActivity(intent);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ android.util.Pair a(String str, int i2, int i3, boolean z2) throws Exception {
        if (this.O.a().getValue() == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(((p) this.O.a().getValue()).a(str, i2, i3));
        if (valueOf.intValue() < 0 || !z2) {
            return new android.util.Pair(valueOf, null);
        }
        return new android.util.Pair(valueOf, ((IAVService) ServiceManager.get().getService(IAVService.class)).getAvMusicWaveBean(str, true, null));
    }
}
