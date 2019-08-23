package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.annotation.SuppressLint;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.medialib.FaceBeautyInvoker;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ar.senor.ARSenorPresenter;
import com.ss.android.ugc.aweme.shortvideo.ar.text.ARTextResultModule;
import com.ss.android.ugc.aweme.shortvideo.ar.text.q;
import com.ss.android.ugc.aweme.shortvideo.ar.text.r;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.game.GameResultViewModel;
import com.ss.android.ugc.aweme.shortvideo.game.g;
import com.ss.android.ugc.aweme.shortvideo.guide.DefaultStickerGuidePresenter;
import com.ss.android.ugc.aweme.shortvideo.guide.IStickerGuidePresenter;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.senor.ISenorPresenter;
import com.ss.android.ugc.aweme.shortvideo.senor.defult.DefaultSenorPresenter;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.FaceMattingPresenter;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.MediaRecordPresenterViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.PixaloopMessageModule;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.m;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurParentStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FaceStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.utils.de;
import com.ss.android.ugc.effectmanager.effect.b.h;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public class StickerModule implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3976a;
    private FrameLayout A;
    private long B;
    private Handler C;
    private String D;
    private FaceStickerViewModel E;
    private LifecycleOwner F;
    private int G;
    private Random H;
    private boolean I;
    private MessageCenter.a J;
    private com.ss.android.medialib.c.c K = new com.ss.android.medialib.c.c() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69242a;

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69242a, false, 78763, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69242a, false, 78763, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (z && (StickerModule.this.i instanceof DefaultSenorPresenter)) {
                StickerModule.this.i.unRegister();
                StickerModule.this.i = new ARSenorPresenter(StickerModule.this.f3977b, StickerModule.this.f3977b, StickerModule.this.f3979d, StickerModule.this.k);
                StickerModule.this.i.a();
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final AbsActivity f3977b;

    /* renamed from: c  reason: collision with root package name */
    public final e f3978c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaRecordPresenter f3979d;

    /* renamed from: e  reason: collision with root package name */
    public c f3980e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.b.a.d<JSONObject> f3981f;
    public FaceStickerBean g;
    public EffectStickerViewImpl h;
    public ISenorPresenter i;
    public IStickerGuidePresenter j;
    public boolean k;
    public EffectPlatform l;
    public d m;
    public boolean n = true;
    public List<Effect> o;
    public Effect p;
    public Effect q;
    public fh r;
    public g s;
    public r t;
    public com.ss.android.ugc.aweme.tools.extract.e u;
    public a v;
    public com.ss.android.ugc.aweme.base.activity.a w = new com.ss.android.ugc.aweme.base.activity.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69232a;

        public final boolean a(int i, KeyEvent keyEvent) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f69232a, false, 78752, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f69232a, false, 78752, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (i != 4 || StickerModule.this.h == null || !StickerModule.this.h.b() || StickerModule.this.j == null) {
                return false;
            } else {
                StickerModule.this.h.a();
                StickerModule.this.j.hide();
                return true;
            }
        }
    };
    public com.ss.android.ugc.aweme.shortvideo.c x;
    private final b y;
    private r[] z;

    public interface a {
        void a();
    }

    public interface b {
        void a(@NonNull FaceStickerBean faceStickerBean);

        void b(@NonNull FaceStickerBean faceStickerBean);

        void c(@NonNull FaceStickerBean faceStickerBean);

        void d(@NonNull FaceStickerBean faceStickerBean);

        void e(@NonNull FaceStickerBean faceStickerBean);

        void f(@NonNull FaceStickerBean faceStickerBean);

        void g(@NonNull FaceStickerBean faceStickerBean);
    }

    public interface c {
        void a();

        void b();
    }

    public interface d {
        @Nullable
        RemoteImageView a();

        @Nullable
        RemoteImageView b();
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f3976a, false, 78702, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f3976a, false, 78702, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(true, false);
    }

    public final void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f3976a, false, 78703, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f3976a, false, 78703, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((EffectStickerViewModel) ViewModelProviders.of((FragmentActivity) this.f3977b).get(EffectStickerViewModel.class)).a(this.l, this.D).observe(this.f3977b, new Observer<com.ss.android.ugc.aweme.w.b.a<PanelInfoModel>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69236a;

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: com.ss.android.ugc.effectmanager.effect.model.Effect} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r19) {
                /*
                    r18 = this;
                    r7 = r18
                    r8 = r19
                    com.ss.android.ugc.aweme.w.b.a r8 = (com.ss.android.ugc.aweme.w.b.a) r8
                    r9 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r10 = 0
                    r0[r10] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f69236a
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<com.ss.android.ugc.aweme.w.b.a> r1 = com.ss.android.ugc.aweme.w.b.a.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 78754(0x133a2, float:1.10358E-40)
                    r1 = r18
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x003a
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r0[r10] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f69236a
                    r3 = 0
                    r4 = 78754(0x133a2, float:1.10358E-40)
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<com.ss.android.ugc.aweme.w.b.a> r1 = com.ss.android.ugc.aweme.w.b.a.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r18
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x003a:
                    if (r8 == 0) goto L_0x01da
                    com.ss.android.ugc.aweme.w.b.a$a r0 = r8.f76550c
                    com.ss.android.ugc.aweme.w.b.a$a r1 = com.ss.android.ugc.aweme.w.b.a.C0799a.SUCCESS
                    if (r0 != r1) goto L_0x01da
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r0 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.this
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule$d r0 = r0.m
                    com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r0.a()
                    M r1 = r8.f76549b
                    com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r1 = (com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel) r1
                    com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r1 = r1.category_effects
                    r2 = 0
                    r3 = 2
                    if (r0 == 0) goto L_0x00f8
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r4 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.this
                    boolean r4 = r4.n
                    if (r4 == 0) goto L_0x00f8
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r4 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.this
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r4 = r4.o
                    boolean r4 = com.bytedance.common.utility.Lists.isEmpty(r4)
                    if (r4 == 0) goto L_0x00f8
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r4 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.this
                    com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r4.q
                    if (r4 != 0) goto L_0x00f8
                    if (r1 == 0) goto L_0x00f8
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r4 = r1.effects
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r5 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.this
                    com.ss.android.ugc.aweme.shortvideo.sticker.r r5 = r5.t
                    java.lang.Object[] r11 = new java.lang.Object[r3]
                    r11[r10] = r4
                    r11[r9] = r5
                    r12 = 0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.sticker.q.f70183a
                    r14 = 1
                    r15 = 78669(0x1334d, float:1.10239E-40)
                    java.lang.Class[] r6 = new java.lang.Class[r3]
                    java.lang.Class<java.util.List> r8 = java.util.List.class
                    r6[r10] = r8
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.r> r8 = com.ss.android.ugc.aweme.shortvideo.sticker.r.class
                    r6[r9] = r8
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r16 = r6
                    boolean r6 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r6 == 0) goto L_0x00b5
                    java.lang.Object[] r11 = new java.lang.Object[r3]
                    r11[r10] = r4
                    r11[r9] = r5
                    r12 = 0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.sticker.q.f70183a
                    r14 = 1
                    r15 = 78669(0x1334d, float:1.10239E-40)
                    java.lang.Class[] r4 = new java.lang.Class[r3]
                    java.lang.Class<java.util.List> r5 = java.util.List.class
                    r4[r10] = r5
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.r> r5 = com.ss.android.ugc.aweme.shortvideo.sticker.r.class
                    r4[r9] = r5
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r16 = r4
                    java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    java.lang.String r4 = (java.lang.String) r4
                    goto L_0x00f5
                L_0x00b5:
                    boolean r6 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r4)
                    if (r6 == 0) goto L_0x00bd
                L_0x00bb:
                    r4 = r2
                    goto L_0x00f5
                L_0x00bd:
                    java.lang.Object r6 = r4.get(r10)
                    com.ss.android.ugc.effectmanager.effect.model.Effect r6 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r6
                    java.util.Iterator r4 = r4.iterator()
                L_0x00c7:
                    boolean r8 = r4.hasNext()
                    if (r8 == 0) goto L_0x00e0
                    java.lang.Object r8 = r4.next()
                    com.ss.android.ugc.effectmanager.effect.model.Effect r8 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r8
                    boolean r11 = com.ss.android.ugc.aweme.shortvideo.sticker.q.a(r5, r8)
                    if (r11 == 0) goto L_0x00c7
                    boolean r11 = com.ss.android.ugc.aweme.shortvideo.sticker.ae.a((com.ss.android.ugc.effectmanager.effect.model.Effect) r8)
                    if (r11 != 0) goto L_0x00c7
                    r6 = r8
                L_0x00e0:
                    com.ss.android.ugc.effectmanager.common.model.UrlModel r4 = r6.icon_url
                    if (r4 == 0) goto L_0x00bb
                    java.util.List<java.lang.String> r5 = r4.url_list
                    boolean r5 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r5)
                    if (r5 == 0) goto L_0x00ed
                    goto L_0x00bb
                L_0x00ed:
                    java.util.List<java.lang.String> r4 = r4.url_list
                    java.lang.Object r4 = r4.get(r10)
                    java.lang.String r4 = (java.lang.String) r4
                L_0x00f5:
                    com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (java.lang.String) r4)
                L_0x00f8:
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r0 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.this
                    com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.p
                    if (r0 != 0) goto L_0x017a
                    if (r1 == 0) goto L_0x017a
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r0 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.this
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r1.effects
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r4 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.this
                    com.ss.android.ugc.aweme.shortvideo.sticker.r r4 = r4.t
                    java.lang.Object[] r11 = new java.lang.Object[r3]
                    r11[r10] = r1
                    r11[r9] = r4
                    r12 = 0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.sticker.q.f70183a
                    r14 = 1
                    r15 = 78671(0x1334f, float:1.10242E-40)
                    java.lang.Class[] r5 = new java.lang.Class[r3]
                    java.lang.Class<java.util.List> r6 = java.util.List.class
                    r5[r10] = r6
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.r> r6 = com.ss.android.ugc.aweme.shortvideo.sticker.r.class
                    r5[r9] = r6
                    java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r17 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                    r16 = r5
                    boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r5 == 0) goto L_0x014c
                    java.lang.Object[] r11 = new java.lang.Object[r3]
                    r11[r10] = r1
                    r11[r9] = r4
                    r12 = 0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.sticker.q.f70183a
                    r14 = 1
                    r15 = 78671(0x1334f, float:1.10242E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r3]
                    java.lang.Class<java.util.List> r2 = java.util.List.class
                    r1[r10] = r2
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.r> r2 = com.ss.android.ugc.aweme.shortvideo.sticker.r.class
                    r1[r9] = r2
                    java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r17 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                    r16 = r1
                    java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    r2 = r1
                    com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2
                    goto L_0x0178
                L_0x014c:
                    boolean r3 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
                    if (r3 == 0) goto L_0x0153
                    goto L_0x0178
                L_0x0153:
                    java.util.Iterator r2 = r1.iterator()
                L_0x0157:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x0171
                    java.lang.Object r3 = r2.next()
                    com.ss.android.ugc.effectmanager.effect.model.Effect r3 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r3
                    boolean r5 = com.ss.android.ugc.aweme.shortvideo.sticker.q.a(r4, r3)
                    if (r5 == 0) goto L_0x0157
                    boolean r5 = com.ss.android.ugc.aweme.shortvideo.sticker.ae.a((com.ss.android.ugc.effectmanager.effect.model.Effect) r3)
                    if (r5 != 0) goto L_0x0157
                    r2 = r3
                    goto L_0x0178
                L_0x0171:
                    java.lang.Object r1 = r1.get(r10)
                    r2 = r1
                    com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2
                L_0x0178:
                    r0.p = r2
                L_0x017a:
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r0 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.this
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r1 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.this
                    com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.p
                    java.lang.Object[] r11 = new java.lang.Object[r9]
                    r11[r10] = r1
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.f3976a
                    r14 = 0
                    r15 = 78739(0x13393, float:1.10337E-40)
                    java.lang.Class[] r2 = new java.lang.Class[r9]
                    java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r3 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                    r2[r10] = r3
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r0
                    r16 = r2
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r2 == 0) goto L_0x01b4
                    java.lang.Object[] r11 = new java.lang.Object[r9]
                    r11[r10] = r1
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.f3976a
                    r14 = 0
                    r15 = 78739(0x13393, float:1.10337E-40)
                    java.lang.Class[] r1 = new java.lang.Class[r9]
                    java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r2 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                    r1[r10] = r2
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r0
                    r16 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    return
                L_0x01b4:
                    com.ss.android.ugc.aweme.effectplatform.EffectPlatform r2 = r0.l
                    boolean r2 = com.ss.android.ugc.aweme.shortvideo.sticker.ah.a((com.ss.android.ugc.effectmanager.effect.model.Effect) r1, (com.ss.android.ugc.aweme.effectplatform.g) r2)
                    if (r2 != 0) goto L_0x01da
                    com.bytedance.ies.uikit.base.AbsActivity r2 = r0.f3977b
                    android.arch.lifecycle.ViewModelProvider r2 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r2)
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.StickerFetchViewModel> r3 = com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.StickerFetchViewModel.class
                    android.arch.lifecycle.ViewModel r2 = r2.get(r3)
                    com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.StickerFetchViewModel r2 = (com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.StickerFetchViewModel) r2
                    com.ss.android.ugc.aweme.effectplatform.EffectPlatform r3 = r0.l
                    android.arch.lifecycle.LiveData r2 = r2.a(r3)
                    com.bytedance.ies.uikit.base.AbsActivity r3 = r0.f3977b
                    com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule$7 r4 = new com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule$7
                    r4.<init>(r1)
                    r2.observe(r3, r4)
                L_0x01da:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule.AnonymousClass3.onChanged(java.lang.Object):void");
            }
        });
    }

    public final void a(List<Effect> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3976a, false, 78710, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, f3976a, false, 78710, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.o = list;
        if (!(this.o == null || this.o.size() <= 0 || this.o.get(0) == null)) {
            this.p = this.o.get(0);
            com.ss.android.ugc.aweme.base.c.a(this.m.a(), this.o.get(0).icon_url.url_list.get(0));
        }
        EffectStickerViewImpl effectStickerViewImpl = this.h;
        effectStickerViewImpl.i = this.o;
        effectStickerViewImpl.j = z2;
    }

    public final void a(@NonNull String str, @Nullable String str2, boolean z2, h hVar) {
        String str3 = str;
        String str4 = str2;
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, (byte) 0, hVar2}, this, f3976a, false, 78723, new Class[]{String.class, String.class, Boolean.TYPE, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, (byte) 0, hVar2}, this, f3976a, false, 78723, new Class[]{String.class, String.class, Boolean.TYPE, h.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str3);
        a((List<String>) arrayList, str4, false, hVar2);
    }

    public final void a(@NonNull List<String> list, @Nullable String str, boolean z2, h hVar) {
        List<String> list2 = list;
        String str2 = str;
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{list2, str2, Byte.valueOf(z2 ? (byte) 1 : 0), hVar2}, this, f3976a, false, 78724, new Class[]{List.class, String.class, Boolean.TYPE, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, str2, Byte.valueOf(z2), hVar2}, this, f3976a, false, 78724, new Class[]{List.class, String.class, Boolean.TYPE, h.class}, Void.TYPE);
            return;
        }
        this.l.a(list2, str2, z2, hVar2);
    }

    private boolean j() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3976a, false, 78704, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78704, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.s != null && this.s.b()) {
            z2 = true;
        }
        return z2;
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3976a, false, 78730, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78730, new Class[0], Void.TYPE);
            return;
        }
        this.i.unRegister();
        this.i = new DefaultSenorPresenter(this.f3977b, this.f3977b, this.f3979d, this.k);
        this.i.a();
    }

    @NonNull
    public final ShortVideoContextViewModel a() {
        if (!PatchProxy.isSupport(new Object[0], this, f3976a, false, 78701, new Class[0], ShortVideoContextViewModel.class)) {
            return (ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) this.f3977b).get(ShortVideoContextViewModel.class);
        }
        return (ShortVideoContextViewModel) PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78701, new Class[0], ShortVideoContextViewModel.class);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3976a, false, 78711, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78711, new Class[0], Void.TYPE);
            return;
        }
        g();
        if (this.h != null) {
            this.h.a();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3976a, false, 78719, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78719, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.a(false);
            this.i.unRegister();
        }
    }

    public final boolean f() {
        if (!PatchProxy.isSupport(new Object[0], this, f3976a, false, 78726, new Class[0], Boolean.TYPE)) {
            return this.h.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78726, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f3976a, false, 78728, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78728, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            this.E.b(this.g);
            this.g = null;
            b(FaceStickerBean.NONE);
        }
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3976a, false, 78707, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78707, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.unRegister();
        }
        this.C.removeCallbacksAndMessages(null);
        FaceBeautyInvoker.removeSlamDetectListener(this.K);
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3976a, false, 78706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78706, new Class[0], Void.TYPE);
            return;
        }
        b(false);
        if (this.g != null && !TextUtils.isEmpty(this.g.getAdRawData())) {
            de.a();
        }
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3976a, false, 78708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78708, new Class[0], Void.TYPE);
            return;
        }
        b(true);
    }

    public final void g() {
        Effect effect;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3976a, false, 78727, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78727, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            z2 = this.h.g();
        }
        if (!z2) {
            CurParentStickerViewModel curParentStickerViewModel = (CurParentStickerViewModel) ViewModelProviders.of((FragmentActivity) this.f3977b).get(CurParentStickerViewModel.class);
            if (curParentStickerViewModel.f70247b.getValue() == null) {
                effect = null;
            } else {
                effect = (Effect) ((Pair) curParentStickerViewModel.f70247b.getValue()).second;
            }
            curParentStickerViewModel.a(new Pair(effect, null));
            h();
        }
    }

    @WorkerThread
    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3976a, false, 78725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78725, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.g == null || this.g == FaceStickerBean.NONE)) {
            this.C.post(new y(this, this.g));
        }
        if (this.z != null) {
            for (r a2 : this.z) {
                a2.a();
            }
        }
        e(true);
    }

    @NonNull
    public final JSONObject i() {
        if (PatchProxy.isSupport(new Object[0], this, f3976a, false, 78742, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78742, new Class[0], JSONObject.class);
        } else if (this.f3981f == null) {
            return new JSONObject();
        } else {
            JSONObject jSONObject = (JSONObject) this.f3981f.a();
            try {
                jSONObject.put("position", "shoot_page");
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public final void c() {
        boolean z2;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f3976a, false, 78713, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78713, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.f3977b, (int) C0906R.string.bnl).a();
            return;
        }
        com.ss.android.ugc.aweme.utils.a.f75468b.a("click_prop_entrance", com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.r.q).a("shoot_way", this.r.r).a("draft_id", this.r.v).a("enter_from", "video_shoot_page").a("content_type", this.r.d().getContentType()).a("content_source", this.r.d().getContentSource()).f34114b);
        EffectStickerViewImpl effectStickerViewImpl = this.h;
        AbsActivity absActivity = this.f3977b;
        LifecycleOwner lifecycleOwner = this.F;
        String str = this.D;
        FrameLayout frameLayout = this.A;
        AnonymousClass5 r6 = new m.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69240a;

            public final void a(@NonNull FaceStickerBean faceStickerBean) {
                if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f69240a, false, 78758, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f69240a, false, 78758, new Class[]{FaceStickerBean.class}, Void.TYPE);
                } else if (StickerModule.this.f3977b.isViewValid()) {
                    StickerModule.this.b(faceStickerBean);
                }
            }

            public final void b(@NonNull FaceStickerBean faceStickerBean) {
                if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f69240a, false, 78759, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f69240a, false, 78759, new Class[]{FaceStickerBean.class}, Void.TYPE);
                    return;
                }
                if (StickerModule.this.g != null) {
                    com.ss.android.ugc.aweme.utils.a.f75468b.onEvent(MobClick.obtain().setEventName("remove_prop").setLabelName("shoot_page").setValue(String.valueOf(StickerModule.this.g.getStickerId())).setJsonObject(StickerModule.this.i()));
                }
                StickerModule.this.h();
            }

            public final void c(@NonNull FaceStickerBean faceStickerBean) {
                if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f69240a, false, 78760, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f69240a, false, 78760, new Class[]{FaceStickerBean.class}, Void.TYPE);
                    return;
                }
                if (StickerModule.this.h.b()) {
                    if (StickerModule.this.r == null || StickerModule.this.r.m.isEmpty()) {
                        StickerModule.this.b(faceStickerBean);
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("prop_id", String.valueOf(faceStickerBean.getStickerId()));
                        hashMap.put("creation_id", StickerModule.this.r.q);
                        hashMap.put("shoot_way", StickerModule.this.r.r);
                        new a.C0185a(StickerModule.this.f3977b).a((int) C0906R.string.dpp).b((int) C0906R.string.dpo).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) new aa(this, hashMap)).a((int) C0906R.string.a19, (DialogInterface.OnClickListener) new ab(this, hashMap, faceStickerBean)).a().a();
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void a(Map map, @NonNull FaceStickerBean faceStickerBean) {
                map.put("to_status", "confirm");
                com.ss.android.ugc.aweme.utils.a.f75468b.a("shoot_video_delete_confirm", map);
                StickerModule.this.b(faceStickerBean);
            }

            public final void a(@Nullable FaceStickerBean faceStickerBean, @Nullable String str) {
                if (PatchProxy.isSupport(new Object[]{faceStickerBean, str}, this, f69240a, false, 78756, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{faceStickerBean, str}, this, f69240a, false, 78756, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE);
                    return;
                }
                StickerModule.this.f3980e.a();
                StickerModule.this.f3978c.a(StickerModule.this.w);
            }

            public final void b(@Nullable FaceStickerBean faceStickerBean, @Nullable String str) {
                Object obj;
                if (PatchProxy.isSupport(new Object[]{faceStickerBean, str}, this, f69240a, false, 78757, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{faceStickerBean, str}, this, f69240a, false, 78757, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE);
                    return;
                }
                StickerModule.this.f3980e.b();
                StickerModule.this.f3978c.b(StickerModule.this.w);
                com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                MobClick labelName = MobClick.obtain().setEventName("confirm_prop_setting").setLabelName("shoot_page");
                if (StickerModule.this.g == null) {
                    obj = "";
                } else {
                    obj = Long.valueOf(StickerModule.this.g.getStickerId());
                }
                aVar.onEvent(labelName.setValue(String.valueOf(obj)).setJsonObject((JSONObject) StickerModule.this.f3981f.a()));
            }
        };
        if (PatchProxy.isSupport(new Object[]{absActivity, lifecycleOwner, str, frameLayout, r6}, effectStickerViewImpl, EffectStickerViewImpl.f3994a, false, 79109, new Class[]{AppCompatActivity.class, LifecycleOwner.class, String.class, FrameLayout.class, m.a.class}, Void.TYPE)) {
            EffectStickerViewImpl effectStickerViewImpl2 = effectStickerViewImpl;
            PatchProxy.accessDispatch(new Object[]{absActivity, lifecycleOwner, str, frameLayout, r6}, effectStickerViewImpl2, EffectStickerViewImpl.f3994a, false, 79109, new Class[]{AppCompatActivity.class, LifecycleOwner.class, String.class, FrameLayout.class, m.a.class}, Void.TYPE);
            i2 = 2;
        } else {
            i2 = 2;
            FragmentManager supportFragmentManager = absActivity.getSupportFragmentManager();
            if (lifecycleOwner instanceof Fragment) {
                supportFragmentManager = ((Fragment) lifecycleOwner).getChildFragmentManager();
            }
            effectStickerViewImpl.a((AppCompatActivity) absActivity, lifecycleOwner, supportFragmentManager, str, frameLayout, (m.a) r6);
        }
        RemoteImageView b2 = this.m.b();
        if (b2 != null && b2.getVisibility() == 0) {
            b2.setVisibility(8);
            Object[] objArr = new Object[i2];
            objArr[0] = "sticker_mark_show";
            objArr[1] = (byte) 0;
            ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.sticker.b.a.f71625a;
            Class[] clsArr = new Class[i2];
            clsArr[0] = String.class;
            clsArr[1] = Boolean.TYPE;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, 82087, clsArr, Void.TYPE)) {
                Object[] objArr2 = new Object[i2];
                objArr2[0] = "sticker_mark_show";
                objArr2[1] = (byte) 0;
                ChangeQuickRedirect changeQuickRedirect2 = com.ss.android.ugc.aweme.sticker.b.a.f71625a;
                Class[] clsArr2 = new Class[i2];
                clsArr2[0] = String.class;
                clsArr2[1] = Boolean.TYPE;
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, 82087, clsArr2, Void.TYPE);
            } else {
                SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(GlobalContext.getContext(), "sticker_sp", 0).edit();
                edit.putBoolean("sticker_mark_show", false);
                edit.apply();
            }
        }
        com.ss.android.ugc.aweme.utils.a.f75468b.a(this.f3977b, "click_prop", "shoot_page", 0, 0, (JSONObject) this.f3981f.a());
    }

    public final void a(int i2) {
        if (this.h != null) {
            this.h.t = i2;
        }
    }

    public final void a(View.OnClickListener onClickListener) {
        if (this.h != null) {
            this.h.r = onClickListener;
        }
    }

    private void a(int... iArr) {
        if (PatchProxy.isSupport(new Object[]{iArr}, this, f3976a, false, 78731, new Class[]{int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iArr}, this, f3976a, false, 78731, new Class[]{int[].class}, Void.TYPE);
            return;
        }
        this.i.unRegister();
        this.i = new DefaultSenorPresenter(this.f3977b, this.f3977b, this.f3979d, this.k);
        for (int i2 = 0; i2 < 2; i2++) {
            this.i.a(iArr[i2], 0);
        }
        this.i.a();
    }

    private void e(FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f3976a, false, 78736, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f3976a, false, 78736, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        g(faceStickerBean);
        this.y.f(faceStickerBean2);
    }

    private void f(FaceStickerBean faceStickerBean) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f3976a, false, 78737, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f3976a, false, 78737, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        MediaRecordPresenter mediaRecordPresenter = this.f3979d;
        int stickerId = (int) faceStickerBean.getStickerId();
        if (!com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEffectNewEngine) || !ae.a(faceStickerBean)) {
            z2 = false;
        }
        mediaRecordPresenter.a("", stickerId, 0, z2);
        this.y.g(faceStickerBean);
    }

    private void h(@NonNull FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f3976a, false, 78740, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f3976a, false, 78740, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        this.x = null;
        String i2 = i(faceStickerBean);
        if (i2 != null) {
            com.ss.android.ugc.aweme.port.in.a.f61122e.a(i2, null, 0, 0, new z(this));
        }
    }

    @Nullable
    private String i(@NonNull FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f3976a, false, 78741, new Class[]{FaceStickerBean.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f3976a, false, 78741, new Class[]{FaceStickerBean.class}, String.class);
        }
        List<String> tags = faceStickerBean.getTags();
        if (Lists.isEmpty(tags)) {
            return null;
        }
        for (String next : tags) {
            if (next.startsWith("challenge:")) {
                return next.substring(10);
            }
        }
        return null;
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3976a, false, 78709, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3976a, false, 78709, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            if (this.J == null) {
                this.J = new w(this);
            }
            FaceBeautyInvoker.setMessageListener(this.J);
        } else {
            FaceBeautyInvoker.setMessageListener(null);
        }
    }

    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f3976a, false, 78716, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f3976a, false, 78716, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.p = false;
        }
    }

    public final void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3976a, false, 78717, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3976a, false, 78717, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.i = new DefaultSenorPresenter(this.f3977b, this.f3977b, this.f3979d, z2);
        this.i.a();
    }

    private void c(FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f3976a, false, 78732, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f3976a, false, 78732, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        this.B = System.currentTimeMillis();
        int g2 = g(faceStickerBean);
        if (faceStickerBean2 != FaceStickerBean.NONE) {
            com.ss.android.ugc.aweme.utils.a.f75468b.a(this.f3977b, "prop", "click", faceStickerBean.getStickerId(), (long) g2, i());
        }
        if (this.i instanceof ARSenorPresenter) {
            this.i.unRegister();
            this.i = new DefaultSenorPresenter(this.f3977b, this.f3977b, this.f3979d, this.k);
            this.i.a();
            FaceBeautyInvoker.removeSlamDetectListener(this.K);
            this.f3979d.m = false;
        }
        f(false);
        if (faceStickerBean2 != FaceStickerBean.NONE && faceStickerBean.getTypes().contains("Game2DV2")) {
            this.y.e(faceStickerBean2);
        } else if (faceStickerBean2 == FaceStickerBean.NONE || !faceStickerBean.getTypes().contains("FaceReplace3D")) {
            this.y.c(faceStickerBean2);
        } else {
            this.y.d(faceStickerBean2);
        }
    }

    private void d(FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f3976a, false, 78735, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f3976a, false, 78735, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        this.f3979d.m = true;
        this.f3979d.a((Bitmap) null);
        int g2 = g(faceStickerBean);
        this.y.b(faceStickerBean2);
        FaceBeautyInvoker.addSlamDetectListener(this.K);
        com.ss.android.ugc.aweme.utils.a.f75468b.a(this.f3977b, "prop", "click", faceStickerBean.getStickerId(), (long) g2, i());
        com.ss.android.ugc.aweme.utils.a.f75468b.onEvent(MobClick.obtain().setEventName("ar_prop_rear").setLabelName("shoot_page").setExtValueLong(faceStickerBean.getStickerId()));
    }

    private int g(FaceStickerBean faceStickerBean) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f3976a, false, 78738, new Class[]{FaceStickerBean.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f3976a, false, 78738, new Class[]{FaceStickerBean.class}, Integer.TYPE)).intValue();
        }
        ai.a("sdk setStickerPath = " + faceStickerBean.getName() + " fileUrl " + UrlModel.toJsonString(faceStickerBean.getFileUrl()));
        this.G = this.H.nextInt();
        MediaRecordPresenter mediaRecordPresenter = this.f3979d;
        String localPath = faceStickerBean.getLocalPath();
        int stickerId = (int) faceStickerBean.getStickerId();
        int i2 = this.G;
        if (!com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEffectNewEngine) || !ae.a(faceStickerBean)) {
            z2 = false;
        }
        return mediaRecordPresenter.a(localPath, stickerId, i2, z2);
    }

    public final void a(r rVar) {
        this.t = rVar;
        if (this.h != null) {
            this.h.q = rVar;
        }
    }

    public final void f(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3976a, false, 78733, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3976a, false, 78733, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.g != null && this.g.getTags() != null && !TextUtils.isEmpty(this.r.f67723f)) {
            String str = "";
            if (this.g.getTags().contains("strong_beat")) {
                String a2 = com.ss.android.ugc.aweme.port.in.a.i.a(this.r.f67723f);
                if (new File(a2).exists()) {
                    str = a2;
                }
                this.f3979d.e(str);
                if (z2) {
                    this.j.a(this.g);
                }
            }
        }
    }

    public final void a(@Nullable FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f3976a, false, 78720, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f3976a, false, 78720, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        this.C.post(new x(this, faceStickerBean));
    }

    @MainThread
    public final void b(@Nullable FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f3976a, false, 78729, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f3976a, false, 78729, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        if (faceStickerBean == null) {
            faceStickerBean2 = FaceStickerBean.NONE;
            this.h.a((Effect) null);
        } else {
            faceStickerBean2 = faceStickerBean;
        }
        if (faceStickerBean2 != FaceStickerBean.NONE) {
            this.E.a(faceStickerBean2);
        }
        this.y.a(faceStickerBean2);
        if (!j() || faceStickerBean2.getTypes().contains("Game2DV2")) {
            this.g = faceStickerBean2;
            if (faceStickerBean2 == FaceStickerBean.NONE || faceStickerBean2.getEffectType() == 0) {
                if (faceStickerBean2.getTags().contains("instrument")) {
                    this.f3979d.b((Context) this.f3977b);
                } else {
                    this.f3979d.o();
                }
                if (faceStickerBean2.getTypes().contains("highRotationFreq")) {
                    this.I = true;
                    a(11, 15);
                } else if (this.I) {
                    this.I = false;
                    k();
                }
                if (faceStickerBean2 != FaceStickerBean.NONE && faceStickerBean2.getTypes().contains("AR")) {
                    d(faceStickerBean2);
                } else if (faceStickerBean2.getTags().contains("transfer_touch")) {
                    e(faceStickerBean2);
                } else if (faceStickerBean2.getTags().contains("hw_beauty")) {
                    f(faceStickerBean2);
                } else {
                    c(faceStickerBean2);
                }
                this.j.a(faceStickerBean2);
                h(faceStickerBean2);
                if (!FaceMattingPresenter.d(faceStickerBean2) && this.u != null) {
                    this.u.d();
                }
                if (faceStickerBean2 == FaceStickerBean.NONE || !faceStickerBean2.getTypes().contains("AR")) {
                    this.h.a(true);
                } else {
                    d(faceStickerBean2);
                    this.h.a(false);
                }
                com.ss.android.ugc.aweme.util.c.a("sticker_name: " + faceStickerBean2.getName() + ", + sticker_id: " + faceStickerBean2.getStickerId());
                if (this.r != null && !TextUtils.isEmpty(faceStickerBean2.getAdRawData())) {
                    String str = this.r.q;
                    String str2 = this.r.r;
                    de.a(str, str2, faceStickerBean2.getStickerId());
                }
                return;
            }
            return;
        }
        this.h.a((Effect) null);
    }

    public final void e(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3976a, false, 78718, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3976a, false, 78718, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.k = z2;
        if (this.i != null) {
            this.i.a(z2);
        }
    }

    public final void a(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f3976a, false, 78721, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f3976a, false, 78721, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        this.h.a(effect);
        if (effect != null) {
            this.q = effect;
            com.ss.android.ugc.aweme.base.c.a(this.m.a(), effect.icon_url.url_list.get(0));
        }
        b(q.a(effect));
    }

    public final void a(@NonNull String str, @Nullable String str2, i iVar) {
        String str3 = str;
        String str4 = str2;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, iVar2}, this, f3976a, false, 78722, new Class[]{String.class, String.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, iVar2}, this, f3976a, false, 78722, new Class[]{String.class, String.class, i.class}, Void.TYPE);
            return;
        }
        this.l.a(str3, str4, iVar2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, int i3, int i4, String str) {
        int i5;
        int i6;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        String str2 = str;
        FaceStickerViewModel faceStickerViewModel = this.E;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2}, faceStickerViewModel, FaceStickerViewModel.f70287a, false, 79928, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2}, faceStickerViewModel, FaceStickerViewModel.f70287a, false, 79928, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            i6 = 1;
            i5 = 0;
        } else {
            i6 = 1;
            i5 = 0;
            FaceStickerViewModel.a aVar = new FaceStickerViewModel.a(faceStickerViewModel, i2, i3, i4, str);
            a.i.a((Callable<TResult>) aVar, a.i.f1052b);
        }
        if (i7 == 4099) {
            ((GameResultViewModel) ViewModelProviders.of((FragmentActivity) this.f3977b).get(GameResultViewModel.class)).a().postValue(new android.util.Pair(Boolean.TRUE, Integer.valueOf(i3)));
        }
        if (i7 == 4104) {
            ((GameResultViewModel) ViewModelProviders.of((FragmentActivity) this.f3977b).get(GameResultViewModel.class)).b().postValue(Integer.valueOf(i2));
        }
        if (i7 == 32 || i7 == 33) {
            ((ARTextResultModule) ViewModelProviders.of((FragmentActivity) this.f3977b).get(ARTextResultModule.class)).a().postValue(new q(i7, i8, i9, str2));
        }
        c.a aVar2 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c.g;
        Object[] objArr = new Object[i6];
        objArr[i5] = Integer.valueOf(i2);
        ChangeQuickRedirect changeQuickRedirect = c.a.f69372a;
        Class[] clsArr = new Class[i6];
        clsArr[i5] = Integer.TYPE;
        if (PatchProxy.isSupport(objArr, aVar2, changeQuickRedirect, false, 78945, clsArr, Boolean.TYPE)) {
            Object[] objArr2 = new Object[i6];
            objArr2[i5] = Integer.valueOf(i2);
            ChangeQuickRedirect changeQuickRedirect2 = c.a.f69372a;
            Class[] clsArr2 = new Class[i6];
            clsArr2[i5] = Integer.TYPE;
            i6 = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, 78945, clsArr2, Boolean.TYPE)).booleanValue();
        } else if (!(i7 == c.a.b() || i7 == c.a.a())) {
            i6 = 0;
        }
        if (i6 != 0) {
            ((PixaloopMessageModule) ViewModelProviders.of((FragmentActivity) this.f3977b).get(PixaloopMessageModule.class)).a().postValue(new com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c(i7, i8, i9, str2));
        }
        if (i7 == 17) {
            if (this.z != null) {
                for (r rVar : this.z) {
                    if (rVar != null && rVar.n) {
                        rVar.b();
                    }
                }
            }
            switch (i8) {
                case 3:
                    if (this.g != null && this.g.getType() == 10) {
                        com.ss.android.ugc.aweme.utils.a.f75468b.onEvent(MobClick.obtain().setEventName("ar_prop_success").setLabelName("shoot_page").setExtValueLong(this.g.getStickerId()));
                    }
                    if (this.g != null) {
                        com.ss.android.ugc.aweme.util.c.a("sticker_id: " + this.g.getStickerId());
                    }
                    n.a("type_3d_sticker", "3d_sticker_show_time", (float) (System.currentTimeMillis() - this.B));
                    n.a("3d_sticker_show_rate", i5, (JSONObject) null);
                    this.B = 0;
                    return;
                case 4:
                    if (this.g != null && !TextUtils.isEmpty(this.g.mLocalPath)) {
                        com.ss.android.b.a.a.a.a(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f69238a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f69238a, false, 78755, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f69238a, false, 78755, new Class[0], Void.TYPE);
                                    return;
                                }
                                try {
                                    if (StickerModule.this.g != null && !TextUtils.isEmpty(StickerModule.this.g.mLocalPath)) {
                                        com.ss.android.ugc.aweme.sticker.c.a.a(new File(StickerModule.this.g.mLocalPath));
                                    }
                                } catch (Exception unused) {
                                    com.ss.android.ugc.aweme.util.c.a("delete failed");
                                }
                            }
                        });
                        break;
                    }
            }
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.f3977b, (int) C0906R.string.b22).a();
            n.a("3d_sticker_show_rate", i8, new t().a("resource_name", str2).a());
            this.B = 0;
        }
    }

    @SuppressLint({"ClickableViewAccessibility", "TooManyMethodParam"})
    public StickerModule(AbsActivity absActivity, LifecycleOwner lifecycleOwner, e eVar, String str, FrameLayout frameLayout, d dVar, FrameLayout frameLayout2, MediaRecordPresenter mediaRecordPresenter, @Nullable r[] rVarArr, @NonNull b bVar, @NonNull c cVar, @NonNull com.ss.android.ugc.aweme.base.b.a.d<JSONObject> dVar2) {
        FrameLayout frameLayout3 = frameLayout2;
        boolean z2 = true;
        this.f3977b = absActivity;
        this.f3978c = eVar;
        this.A = frameLayout3;
        this.D = str;
        this.F = lifecycleOwner;
        this.f3979d = mediaRecordPresenter;
        this.y = bVar;
        this.f3981f = dVar2;
        this.f3980e = cVar;
        this.z = rVarArr;
        this.m = dVar;
        if (this.m.a() != null) {
            this.m.a().setOnClickListener(new s(this));
            this.m.a().setOnTouchListener(new com.ss.android.ugc.aweme.h.b(1.2f, 150, null));
        }
        this.r = ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) absActivity).get(ShortVideoContextViewModel.class)).f65401b;
        this.m.a();
        this.j = new DefaultStickerGuidePresenter(frameLayout);
        this.j.a((LifecycleOwner) absActivity);
        this.h = new EffectStickerViewImpl();
        this.h.f3999f = this.f3979d;
        this.h.m = this.r;
        this.E = (FaceStickerViewModel) ViewModelProviders.of((FragmentActivity) absActivity).get(FaceStickerViewModel.class);
        lifecycleOwner.getLifecycle().addObserver(this);
        this.C = new SafeHandler(absActivity);
        this.H = new Random();
        this.l = new EffectPlatform(absActivity, com.ss.android.ugc.aweme.port.in.a.h.c(), com.ss.android.ugc.aweme.port.in.a.D.getOKHttpClient());
        this.l.a((LifecycleOwner) absActivity);
        if (PatchProxy.isSupport(new Object[0], this, f3976a, false, 78700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3976a, false, 78700, new Class[0], Void.TYPE);
        } else {
            GameDuetResource gameDuetResource = a().f65401b.ad;
            if ((gameDuetResource == null || gameDuetResource.gameSticker == null) ? false : z2) {
                a(gameDuetResource.gameSticker);
            }
        }
        ((CurUseStickerViewModel) ViewModelProviders.of((FragmentActivity) absActivity).get(CurUseStickerViewModel.class)).f70249b.observe(absActivity, new Observer<Effect>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69234a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                Effect effect = (Effect) obj;
                if (PatchProxy.isSupport(new Object[]{effect}, this, f69234a, false, 78753, new Class[]{Effect.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{effect}, this, f69234a, false, 78753, new Class[]{Effect.class}, Void.TYPE);
                } else if (effect != null) {
                    com.ss.android.ugc.aweme.base.c.a(StickerModule.this.m.a(), effect.icon_url.url_list.get(0));
                } else {
                    if (StickerModule.this.p != null) {
                        com.ss.android.ugc.aweme.base.c.a(StickerModule.this.m.a(), StickerModule.this.p.icon_url.url_list.get(0));
                    }
                }
            }
        });
        ((MediaRecordPresenterViewModel) ViewModelProviders.of((FragmentActivity) absActivity).get(MediaRecordPresenterViewModel.class)).f69325b = this.f3979d;
        frameLayout3.setOnTouchListener(new t(this));
    }
}
