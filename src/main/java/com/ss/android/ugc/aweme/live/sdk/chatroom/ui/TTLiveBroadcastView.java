package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import a.g;
import a.i;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.model.a.b;
import com.bytedance.android.livesdkapi.depend.model.a.d;
import com.bytedance.common.utility.UIUtils;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.c.e;
import com.ss.android.ugc.aweme.live.c.f;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.a.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.LiveButtonView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class TTLiveBroadcastView implements LifecycleObserver, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3440a;
    private d A = new b.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53504a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f53504a, false, 55915, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53504a, false, 55915, new Class[0], Void.TYPE);
                return;
            }
            if (TTLiveBroadcastView.this.f3442c != null) {
                TTLiveBroadcastView.this.f3442c.closeRecording();
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f53504a, false, 55920, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53504a, false, 55920, new Class[0], Void.TYPE);
                return;
            }
            TTLiveBroadcastView.this.m = true;
            TTLiveBroadcastView.this.f3444e.j();
            if (TTLiveBroadcastView.this.f3444e != null && TTLiveBroadcastView.this.f3444e.n().isEmpty()) {
                i.a(200).a((g<TResult, TContinuationResult>) new i<TResult,TContinuationResult>(TTLiveBroadcastView.this), i.f1052b);
            }
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f53504a, false, 55914, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f53504a, false, 55914, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i != TTLiveBroadcastView.this.f3442c.getCameraPos()) {
                TTLiveBroadcastView.this.f3442c.setCameraPos(i);
            }
            i.a(100).a((g<TResult, TContinuationResult>) new h<TResult,TContinuationResult>(TTLiveBroadcastView.this), i.f1052b);
        }

        public final void c(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f53504a, false, 55917, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f53504a, false, 55917, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            TTLiveBroadcastView.this.f3445f = f2;
            TTLiveBroadcastView.this.a(TTLiveBroadcastView.this.f3445f, TTLiveBroadcastView.this.g);
        }

        public final void d(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f53504a, false, 55918, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f53504a, false, 55918, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            TTLiveBroadcastView.this.g = f2;
            TTLiveBroadcastView.this.a(TTLiveBroadcastView.this.f3445f, TTLiveBroadcastView.this.g);
        }

        public final void a(boolean z) {
            UrlModel urlModel;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53504a, false, 55919, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53504a, false, 55919, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (!z || !TTLiveBroadcastView.this.l) {
                TTLiveBroadcastView.this.f3443d.setVisibility(0);
                TTLiveBroadcastView.this.f3443d.setImageAlpha(0);
            } else {
                TTLiveBroadcastView.this.f3443d.setImageAlpha(255);
                TTLiveBroadcastView.this.f3443d.setVisibility(0);
                float screenWidth = ((float) UIUtils.getScreenWidth(TTLiveBroadcastView.this.f3441b)) / ((float) UIUtils.getScreenHeight(TTLiveBroadcastView.this.f3441b));
                IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
                RemoteImageView remoteImageView = TTLiveBroadcastView.this.f3443d;
                if (iUserService != null) {
                    urlModel = iUserService.getCurrentUser().getAvatarMedium();
                } else {
                    urlModel = null;
                }
                c.a(remoteImageView, urlModel, (Postprocessor) new e(5, screenWidth, null));
            }
        }

        public final void b(float f2) {
            float f3;
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f53504a, false, 55916, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f53504a, false, 55916, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            TTLiveBroadcastView.this.h = f2;
            float f4 = 0.0f;
            if (TTLiveBroadcastView.this.n && TTLiveBroadcastView.this.i != null) {
                com.ss.android.ugc.aweme.shortvideo.j.d dVar = TTLiveBroadcastView.this.i;
                float f5 = TTLiveBroadcastView.this.h;
                if (TTLiveBroadcastView.this.k == 0) {
                    f3 = TTLiveBroadcastView.this.j;
                } else {
                    f3 = 0.0f;
                }
                dVar.a(f5, f3);
                TTLiveBroadcastView.this.n = false;
            }
            TTLiveBroadcastView tTLiveBroadcastView = TTLiveBroadcastView.this;
            float f6 = TTLiveBroadcastView.this.h;
            if (TTLiveBroadcastView.this.k == 0) {
                f4 = TTLiveBroadcastView.this.j;
            }
            tTLiveBroadcastView.b(f6, f4);
        }

        public final void b(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f53504a, false, 55921, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f53504a, false, 55921, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            TTLiveBroadcastView.this.a(i);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public Context f3441b;

    /* renamed from: c  reason: collision with root package name */
    public IRecordingOperationPanel f3442c;

    /* renamed from: d  reason: collision with root package name */
    public RemoteImageView f3443d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.model.a.e f3444e;

    /* renamed from: f  reason: collision with root package name */
    public float f3445f;
    public float g;
    public float h;
    public com.ss.android.ugc.aweme.shortvideo.j.d i;
    public float j = 1.0f;
    public int k = -1;
    public boolean l;
    public boolean m;
    public boolean n = true;
    private FrameLayout o;
    private b p;
    private com.bytedance.android.livesdkapi.depend.model.a.e q;
    private com.ss.android.ugc.aweme.shortvideo.j.b r;
    private a s;
    private int t;
    private List<h> u = new ArrayList();
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
    }

    public final View a() {
        return this.o;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3440a, false, 55897, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3440a, false, 55897, new Class[0], Void.TYPE);
            return;
        }
        if (this.l && this.m) {
            i.a(500).a((g<TResult, TContinuationResult>) new f<TResult,TContinuationResult>(this), i.f1052b);
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3440a, false, 55896, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3440a, false, 55896, new Class[0], Void.TYPE);
            return;
        }
        List n2 = this.f3444e.n();
        if (!n2.isEmpty() && n2.size() != this.u.size()) {
            this.u.clear();
            this.u.addAll(f.a(n2));
        }
    }

    public final void c() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f3440a, false, 55902, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3440a, false, 55902, new Class[0], Void.TYPE);
        } else if (this.l) {
            this.l = false;
            if (this.f3444e != null) {
                this.f3444e.k();
            }
            b bVar = this.p;
            if (PatchProxy.isSupport(new Object[0], bVar, b.f53514a, false, 55886, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, b.f53514a, false, 55886, new Class[0], Void.TYPE);
            } else {
                bVar.f53515b = 2;
                bVar.a();
            }
            this.f3443d.setVisibility(8);
            if (PatchProxy.isSupport(new Object[0], this, f3440a, false, 55903, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3440a, false, 55903, new Class[0], Void.TYPE);
                return;
            }
            if (this.r != null) {
                this.r.g(this.t);
                this.r.b(this.y, this.z);
            }
            if (this.i != null) {
                this.i.a(this.t);
                this.i.b(this.x, this.v);
                com.ss.android.ugc.aweme.shortvideo.j.d dVar = this.i;
                float f3 = this.w;
                if (this.t == 0) {
                    f2 = 0.35f;
                } else {
                    f2 = 0.0f;
                }
                dVar.a(f3, f2);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f3440a, false, 55898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3440a, false, 55898, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null && this.l) {
            this.r.b(this.y, this.z);
        }
        if (this.f3444e != null) {
            this.f3444e.a((d) null);
        }
        this.i = null;
        bg.d(this);
        if (PatchProxy.isSupport(new Object[0], this, f3440a, false, 55904, new Class[0], Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3440a, false, 55904, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f3442c == null) {
            i2 = 1;
        } else {
            i2 = this.f3442c.getCameraPos();
        }
        int i3 = this.t;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f.f53356a, true, 55974, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f.f53356a, true, 55974, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().setDefaultFilterForCamera(i2, i3);
    }

    public final void b() {
        boolean z2;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f3440a, false, 55900, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3440a, false, 55900, new Class[0], Void.TYPE);
        } else if (!this.l) {
            this.l = true;
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.story.live.b.f73120a, true, 84704, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.story.live.b.f73120a, true, 84704, new Class[0], Void.TYPE);
            } else {
                r.a("livesdk_pm_live_takepage_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("event_type", "show").a("event_page", "live_take_page").a("event_belong", "live_take").f34114b);
            }
            if (PatchProxy.isSupport(new Object[0], this, f3440a, false, 55895, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3440a, false, 55895, new Class[0], Void.TYPE);
            } else {
                if (this.f3444e == null) {
                    if (this.q == null) {
                        this.q = com.ss.android.ugc.aweme.live.a.d().b();
                    }
                    this.f3444e = this.q;
                    this.f3444e.a(this.A);
                    FragmentTransaction beginTransaction = this.f3442c.fragmentManager().beginTransaction();
                    beginTransaction.add((int) C0906R.id.bd5, this.f3444e.l());
                    beginTransaction.commitAllowingStateLoss();
                    this.f3444e.c(10);
                    this.s = new a((ViewGroup) this.o.getParent());
                    if (this.f3444e.l() instanceof b.C0135b) {
                        ((b.C0135b) this.f3444e.l()).a(this.s, 0);
                    }
                    com.ss.android.ugc.aweme.live.a.d().i().a(e.f53525b);
                    this.f3443d = this.f3442c.backgroundView();
                    this.f3443d.setVisibility(8);
                    d();
                }
                if (this.f3444e != null) {
                    if (this.f3442c.getCameraPos() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    com.bytedance.android.livesdkapi.depend.model.a.e eVar = this.f3444e;
                    if (z2) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    eVar.a(i2);
                    if (this.f3444e.l() instanceof b.C0135b) {
                        ((b.C0135b) this.f3444e.l()).a(this.s, 0);
                    }
                }
                this.r = this.f3442c.filterModule();
                if (this.i != null) {
                    this.x = this.i.c();
                    this.v = this.i.d();
                    this.w = this.i.e();
                    this.y = this.i.a();
                    this.z = this.i.b();
                }
            }
            b bVar = this.p;
            if (PatchProxy.isSupport(new Object[0], bVar, b.f53514a, false, 55885, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, b.f53514a, false, 55885, new Class[0], Void.TYPE);
            } else {
                bVar.f53515b = 1;
                bVar.a();
            }
            i.a(100).a((g<TResult, TContinuationResult>) new g<TResult,TContinuationResult>(this), i.f1052b);
            this.f3443d.setVisibility(0);
        }
    }

    public final void a(LiveButtonView.a aVar) {
        this.p.f53519f = aVar;
    }

    /* renamed from: a */
    public final i b(i iVar) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f3440a, false, 55901, new Class[]{i.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{iVar}, this, f3440a, false, 55901, new Class[]{i.class}, i.class);
        }
        if (this.i != null) {
            a(this.f3445f, this.g);
            float f3 = this.h;
            if (this.k == 0) {
                f2 = this.j;
            } else {
                f2 = 0.0f;
            }
            b(f3, f2);
            if (this.r != null) {
                this.r.b(0.0f, 0.0f);
            }
            a(this.k);
        }
        return null;
    }

    @Subscribe
    public void onCameraReverse(com.ss.android.ugc.aweme.story.live.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3440a, false, 55909, new Class[]{com.ss.android.ugc.aweme.story.live.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3440a, false, 55909, new Class[]{com.ss.android.ugc.aweme.story.live.a.class}, Void.TYPE);
            return;
        }
        if (this.l && this.m && this.f3444e != null) {
            boolean z2 = aVar.f73119a;
            if (this.f3444e.e() != z2) {
                this.f3444e.a(z2 ? 1 : 0);
            }
        }
    }

    @Subscribe
    public void onFilterChange(com.ss.android.ugc.aweme.live.model.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f3440a, false, 55908, new Class[]{com.ss.android.ugc.aweme.live.model.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3440a, false, 55908, new Class[]{com.ss.android.ugc.aweme.live.model.d.class}, Void.TYPE);
            return;
        }
        int i2 = dVar.f53502a.f47602f;
        if (!this.l) {
            this.t = i2;
        } else if (this.m && this.k != i2) {
            this.k = i2;
            d();
            if (this.f3444e != null) {
                this.f3444e.d(this.k);
            }
            this.r.a(this.u);
            a(this.k);
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onEvnet(com.ss.android.ugc.aweme.live.authentication.model.a aVar) {
        HashMap hashMap;
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3440a, false, 55907, new Class[]{com.ss.android.ugc.aweme.live.authentication.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3440a, false, 55907, new Class[]{com.ss.android.ugc.aweme.live.authentication.model.a.class}, Void.TYPE);
            return;
        }
        if (this.l && this.f3444e != null) {
            if (this.f3444e.l() instanceof b.C0135b) {
                ((b.C0135b) this.f3444e.l()).a(this.s);
            }
            com.ss.android.ugc.aweme.live.authentication.model.b a2 = com.ss.android.ugc.aweme.live.authentication.model.b.a();
            if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.live.authentication.model.b.f53323a, false, 55629, new Class[0], HashMap.class)) {
                hashMap = (HashMap) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.live.authentication.model.b.f53323a, false, 55629, new Class[0], HashMap.class);
            } else {
                HashMap hashMap2 = new HashMap();
                if (a2.f53325b != null) {
                    hashMap2.put("realname_verify", String.valueOf(a2.f53325b.realname_verify));
                    if (a2.f53325b.live_agreement) {
                        str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    } else {
                        str = PushConstants.PUSH_TYPE_NOTIFY;
                    }
                    hashMap2.put("live_agreement", str);
                    if (a2.f53325b.live_answer) {
                        str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    } else {
                        str2 = PushConstants.PUSH_TYPE_NOTIFY;
                    }
                    hashMap2.put("live_answer", str2);
                }
                hashMap = hashMap2;
            }
            if (this.s.f53509b) {
                hashMap.put("has_commerce_goods", "true");
            }
            this.f3444e.a(hashMap);
        }
    }

    public final void a(int i2) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3440a, false, 55910, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3440a, false, 55910, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.l) {
            if (this.r != null) {
                d();
                this.r.a(this.u, i2);
            }
            if (this.m && i2 != -1) {
                this.k = i2;
                a(this.f3445f, this.g);
                float f3 = this.h;
                if (this.k == 0) {
                    f2 = this.j;
                } else {
                    f2 = 0.0f;
                }
                b(f3, f2);
                if (this.f3444e != null) {
                    this.f3444e.d(this.k);
                }
                if (this.i != null && this.u.size() > this.k) {
                    String str = this.u.get(this.k).j;
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                    this.i.a(str);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f3440a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.view.View[]> r3 = android.view.View[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 55899(0xda5b, float:7.8331E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f3440a
            r13 = 0
            r14 = 55899(0xda5b, float:7.8331E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.view.View[]> r0 = android.view.View[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            r2 = r17
            com.ss.android.ugc.aweme.live.sdk.chatroom.ui.b r3 = r2.p
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.live.sdk.chatroom.ui.b.f53514a
            r13 = 0
            r14 = 55884(0xda4c, float:7.831E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.view.View[]> r4 = android.view.View[].class
            r15[r9] = r4
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x006a
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.live.sdk.chatroom.ui.b.f53514a
            r13 = 0
            r14 = 55884(0xda4c, float:7.831E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.view.View[]> r0 = android.view.View[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x006a:
            if (r0 == 0) goto L_0x0079
            int r1 = r0.length
        L_0x006d:
            if (r9 >= r1) goto L_0x0079
            r4 = r0[r9]
            java.util.LinkedList<android.view.View> r5 = r3.f53517d
            r5.add(r4)
            int r9 = r9 + 1
            goto L_0x006d
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView.a(android.view.View[]):void");
    }

    public TTLiveBroadcastView(Context context, Fragment fragment) {
        bg.c(this);
        this.f3441b = context;
        this.f3442c = (IRecordingOperationPanel) fragment;
        if (this.f3442c != null) {
            this.f3442c.getLifecycle().addObserver(this);
        }
        if (PatchProxy.isSupport(new Object[0], this, f3440a, false, 55894, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3440a, false, 55894, new Class[0], Void.TYPE);
            return;
        }
        this.o = new FrameLayout(this.f3441b);
        this.o.setVisibility(4);
        this.o.setId(C0906R.id.bd5);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = (int) UIUtils.dip2Px(this.f3441b, 30.0f);
        this.o.setLayoutParams(layoutParams);
        this.p = new b(this.o);
        this.q = com.ss.android.ugc.aweme.live.a.d().b();
        this.i = this.f3442c.videoRecorder();
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3440a, false, 55905, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3440a, false, 55905, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            if (this.f3444e.c().isEmpty()) {
                this.i.b(f2, f3);
                return;
            }
            this.i.b(this.f3444e.c(), f2, f3);
        }
    }

    public final void b(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3440a, false, 55906, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3440a, false, 55906, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            if (this.f3444e.b().isEmpty()) {
                this.i.a(f2, f3);
            } else {
                this.i.a(this.f3444e.b(), f2, f3);
            }
            if (f2 > 0.0f) {
                this.i.a(0.05f);
                return;
            }
            this.i.a(0.01f);
        }
    }
}
