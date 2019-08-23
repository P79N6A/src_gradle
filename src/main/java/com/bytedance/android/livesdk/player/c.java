package com.bytedance.android.livesdk.player;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.player.ITTLivePlayer;
import com.bytedance.android.livesdk.player.f;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.e.b;
import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public class c implements ITTLivePlayer.a, a, a.C0132a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16791a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f16792b = "c";
    private static final g.d g = g.d.a().a();

    /* renamed from: c  reason: collision with root package name */
    public ITTLivePlayer f16793c;

    /* renamed from: d  reason: collision with root package name */
    public TextureView f16794d;

    /* renamed from: e  reason: collision with root package name */
    public Surface f16795e;

    /* renamed from: f  reason: collision with root package name */
    f f16796f;
    private int h;
    private String i;
    private String j;
    private g.d k;
    private boolean l;
    private com.bytedance.android.livesdkapi.depend.c.a m;
    private g.c n;
    private volatile int o;
    private int p;
    private com.bytedance.android.livesdkapi.depend.model.live.a q;
    private final Context r;
    private final i s;
    private final b t;
    private String u;
    private boolean v;
    private boolean w;
    private boolean x;
    private final TextureView.SurfaceTextureListener y;
    private long z;

    /* renamed from: com.bytedance.android.livesdk.player.c$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f16800b = new int[ITTLivePlayer.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007f */
        static {
            /*
                com.bytedance.android.livesdk.player.ITTLivePlayer$b[] r0 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16800b = r0
                r0 = 1
                int[] r1 = f16800b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdk.player.ITTLivePlayer$b r2 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.RENDERING_START     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f16800b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdk.player.ITTLivePlayer$b r3 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.MEDIA_ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f16800b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdk.player.ITTLivePlayer$b r4 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.PLAY_COMPLETED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r3 = f16800b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.livesdk.player.ITTLivePlayer$b r4 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.PREPARED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r3 = f16800b     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.android.livesdk.player.ITTLivePlayer$b r4 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.VIDEO_SIZE_CHANGED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r3 = f16800b     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bytedance.android.livesdk.player.ITTLivePlayer$b r4 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.SEI_UPDATE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r3 = f16800b     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.bytedance.android.livesdk.player.ITTLivePlayer$b r4 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.BUFFERING_START     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r5 = 7
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r3 = f16800b     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.bytedance.android.livesdk.player.ITTLivePlayer$b r4 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.BUFFERING_END     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r5 = 8
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                com.bytedance.android.livesdkapi.depend.model.live.a[] r3 = com.bytedance.android.livesdkapi.depend.model.live.a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f16799a = r3
                int[] r3 = f16799a     // Catch:{ NoSuchFieldError -> 0x0075 }
                com.bytedance.android.livesdkapi.depend.model.live.a r4 = com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO     // Catch:{ NoSuchFieldError -> 0x0075 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0075 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                int[] r0 = f16799a     // Catch:{ NoSuchFieldError -> 0x007f }
                com.bytedance.android.livesdkapi.depend.model.live.a r3 = com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY     // Catch:{ NoSuchFieldError -> 0x007f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                int[] r0 = f16799a     // Catch:{ NoSuchFieldError -> 0x0089 }
                com.bytedance.android.livesdkapi.depend.model.live.a r1 = com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.player.c.AnonymousClass2.<clinit>():void");
        }
    }

    public static final class a implements h.b<a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16801a;

        @NotNull
        public final h.b.a<a> a(h.b.a<a> aVar) {
            h.b.a<a> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f16801a, false, 12713, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new c(TTLiveSDKContext.getHostService().a().a(), TTLiveSDKContext.getHostService().e(), new e(), (byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f16801a, false, 12713, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    public final int e() {
        return this.o;
    }

    public final String h() {
        return this.i;
    }

    @RequiresApi(api = 14)
    public final void a(String str, TextureView textureView, int i2, g.d dVar, g.c cVar, String str2) throws Exception {
        String str3 = str;
        TextureView textureView2 = textureView;
        g.c cVar2 = cVar;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, textureView2, Integer.valueOf(i2), dVar, cVar2, str4}, this, f16791a, false, 12677, new Class[]{String.class, TextureView.class, Integer.TYPE, g.d.class, g.c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, textureView2, Integer.valueOf(i2), dVar, cVar2, str4}, this, f16791a, false, 12677, new Class[]{String.class, TextureView.class, Integer.TYPE, g.d.class, g.c.class, String.class}, Void.TYPE);
        } else if (str3 == null || textureView2 == null) {
            i();
            if (this.f16793c != null) {
                this.f16793c.a();
            }
        } else {
            this.u = g.a.a(textureView.getContext());
            this.q = com.bytedance.android.livesdkapi.depend.model.live.a.valueOf(i2);
            if (PatchProxy.isSupport(new Object[]{textureView2}, this, f16791a, false, 12686, new Class[]{TextureView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textureView2}, this, f16791a, false, 12686, new Class[]{TextureView.class}, Void.TYPE);
            } else if (textureView2 == null) {
                if (this.f16793c != null) {
                    this.f16793c.d();
                }
                if (this.f16794d != null) {
                    this.f16794d.setSurfaceTextureListener(null);
                    this.f16794d = null;
                }
                if (this.f16795e != null) {
                    this.f16795e.release();
                    this.f16795e = null;
                }
                if (n()) {
                    d(false);
                }
            } else if (this.f16794d != textureView2) {
                if (this.f16794d != null) {
                    this.f16794d.setSurfaceTextureListener(null);
                    this.f16794d = null;
                }
                if (this.f16795e != null) {
                    this.f16795e.release();
                    this.f16795e = null;
                }
                this.f16794d = textureView2;
                this.f16794d.setSurfaceTextureListener(this.y);
                if (this.f16794d.getSurfaceTexture() != null) {
                    this.f16795e = new Surface(this.f16794d.getSurfaceTexture());
                    d(true);
                } else {
                    d(false);
                }
            }
            this.n = cVar2;
            this.l = true;
            boolean a2 = a(str);
            this.i = str3;
            this.j = str4;
            this.k = dVar == null ? g : dVar;
            if (this.f16793c == null) {
                j();
            } else if (this.f16793c.g()) {
                j();
            }
            this.f16793c.a((ITTLivePlayer.a) this);
            q();
            if (a2 || !o()) {
                if (a2) {
                    this.p = 0;
                }
                l();
            } else if (n()) {
                this.f16793c.a(this.f16795e);
                this.f16793c.c();
                if (p()) {
                    this.m.obtainMessage(g.b.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
                }
            }
        }
    }

    public final void a(boolean z2, Context context) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), context}, this, f16791a, false, 12687, new Class[]{Boolean.TYPE, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), context}, this, f16791a, false, 12687, new Class[]{Boolean.TYPE, Context.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(g.a.a(context), this.u) && this.f16793c != null) {
            this.f16793c.a(z2);
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f16791a, false, 12689, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f16791a, false, 12689, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.w = z2;
        m();
    }

    public final void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f16791a, false, 12696, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f16791a, false, 12696, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        if (jSONObject2 != null && jSONObject2.has("player_type")) {
            if (this.f16793c instanceof j) {
                try {
                    jSONObject2.put("new_sdk", true);
                } catch (JSONException e2) {
                    com.bytedance.android.live.core.c.a.a(f16792b, (Throwable) e2);
                }
            } else {
                try {
                    jSONObject2.put("new_sdk", false);
                } catch (JSONException e3) {
                    com.bytedance.android.live.core.c.a.a(f16792b, (Throwable) e3);
                }
            }
        }
        f fVar = this.f16796f;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, fVar, f.f16805a, false, 12716, new Class[]{JSONObject.class}, Void.TYPE)) {
            f fVar2 = fVar;
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, fVar2, f.f16805a, false, 12716, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        b.a().a((Callable) new f.a(fVar.f16807c, jSONObject2, (byte) 0));
    }

    private boolean n() {
        if ((this.h & 2) > 0) {
            return true;
        }
        return false;
    }

    private boolean o() {
        if ((this.h & 1) > 0) {
            return true;
        }
        return false;
    }

    private boolean p() {
        if ((this.h & 4) > 0) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f16791a, false, 12688, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16791a, false, 12688, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f16793c != null) {
            Point h2 = this.f16793c.h();
            if (h2 != null) {
                if (h2.x > h2.y) {
                    z2 = true;
                }
                return z2;
            }
        }
        return false;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f16791a, false, 12695, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16791a, false, 12695, new Class[0], Void.TYPE);
            return;
        }
        f fVar = this.f16796f;
        fVar.f16806b = false;
        fVar.f16807c = 0.0f;
    }

    public final JSONObject d() {
        if (!PatchProxy.isSupport(new Object[0], this, f16791a, false, 12698, new Class[0], JSONObject.class)) {
            return this.f16793c.i();
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f16791a, false, 12698, new Class[0], JSONObject.class);
    }

    public final boolean f() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f16791a, false, 12692, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16791a, false, 12692, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f16793c != null && this.f16793c.f()) {
            z2 = true;
        }
        return z2;
    }

    public final boolean g() {
        if (!PatchProxy.isSupport(new Object[0], this, f16791a, false, 12693, new Class[0], Boolean.TYPE)) {
            return p();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16791a, false, 12693, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @RequiresApi(api = 14)
    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f16791a, false, 12674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16791a, false, 12674, new Class[0], Void.TYPE);
            return;
        }
        this.n = null;
        this.l = false;
        this.i = "";
        this.k = g;
        if (this.f16794d != null) {
            this.f16794d.setSurfaceTextureListener(null);
            this.f16794d = null;
        }
        if (this.f16795e != null) {
            this.f16795e.release();
            this.f16795e = null;
        }
        this.o = 0;
        this.p = 0;
        f(false);
        e(false);
        d(false);
    }

    private void j() throws Exception {
        if (PatchProxy.isSupport(new Object[0], this, f16791a, false, 12675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16791a, false, 12675, new Class[0], Void.TYPE);
            return;
        }
        if (this.f16793c != null) {
            this.f16793c.d();
            this.f16793c.e();
            this.f16793c.a((ITTLivePlayer.a) null);
            e(false);
            f(false);
        }
        this.f16793c = this.t.a(this.r, new d(this));
        this.f16793c.a((ITTLivePlayer.a) this);
        if (this.f16793c instanceof j) {
            ((j) this.f16793c).b(this.x);
        }
        q();
        if (this.x) {
            com.bytedance.android.live.uikit.a.a.f();
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f16791a, false, 12676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16791a, false, 12676, new Class[0], Void.TYPE);
            return;
        }
        if (n() && this.f16793c != null) {
            this.f16793c.a(this.f16795e);
            if (o() && this.l && !this.f16793c.f()) {
                this.f16793c.c();
            }
        }
        if (this.h == 7 && this.l) {
            this.m.obtainMessage(g.b.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
        }
    }

    private void l() throws Exception {
        ITTLivePlayer.c cVar;
        if (PatchProxy.isSupport(new Object[0], this, f16791a, false, 12680, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16791a, false, 12680, new Class[0], Void.TYPE);
        } else if (this.f16793c != null) {
            if (this.f16793c.g()) {
                j();
            }
            q();
            this.o = 0;
            e(false);
            f(false);
            switch (this.q) {
                case AUDIO:
                    cVar = ITTLivePlayer.c.AUDIO;
                    break;
                case THIRD_PARTY:
                    cVar = ITTLivePlayer.c.OBS;
                    break;
                case SCREEN_RECORD:
                    cVar = ITTLivePlayer.c.SCREENSHOT;
                    break;
                default:
                    cVar = ITTLivePlayer.c.VIDEO;
                    break;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_params", this.j);
            this.f16793c.a(this.i, hashMap, cVar);
            this.z = SystemClock.currentThreadTimeMillis();
            this.f16793c.b();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f16791a, false, 12694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16791a, false, 12694, new Class[0], Void.TYPE);
            return;
        }
        f fVar = this.f16796f;
        if (PatchProxy.isSupport(new Object[0], fVar, f.f16805a, false, 12715, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], fVar, f.f16805a, false, 12715, new Class[0], Void.TYPE);
            return;
        }
        fVar.f16806b = true;
        b.a().a((Callable) new g(fVar));
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f16791a, false, 12691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16791a, false, 12691, new Class[0], Void.TYPE);
        } else if (this.f16793c != null) {
            if (!this.x || !com.bytedance.android.live.uikit.a.a.f()) {
                if ((!this.x || !com.bytedance.android.live.uikit.a.a.a()) && (this.f16794d instanceof com.bytedance.android.livesdkapi.view.b)) {
                    int i2 = this.o & 65535;
                    int i3 = this.o >> 16;
                    if (i2 > 0 && i3 > 0) {
                        ((com.bytedance.android.livesdkapi.view.b) this.f16794d).a(i2, i3);
                        if (this.v) {
                            if (this.w) {
                                if (this.f16794d.getWidth() <= 0 || this.f16794d.getHeight() <= 0 || (this.f16794d.getHeight() * i2) / this.f16794d.getWidth() >= i3) {
                                    ((com.bytedance.android.livesdkapi.view.b) this.f16794d).setScaleType(0);
                                    return;
                                } else {
                                    ((com.bytedance.android.livesdkapi.view.b) this.f16794d).setScaleType(2);
                                    return;
                                }
                            } else if (i2 <= i3) {
                                ((com.bytedance.android.livesdkapi.view.b) this.f16794d).setScaleType(2);
                                return;
                            }
                        }
                        ((com.bytedance.android.livesdkapi.view.b) this.f16794d).setScaleType(0);
                    }
                }
            }
        }
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, f16791a, false, 12708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16791a, false, 12708, new Class[0], Void.TYPE);
            return;
        }
        if (this.f16793c instanceof j) {
            if (this.q == com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD || this.q == com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY) {
                if (com.bytedance.android.live.uikit.a.a.a()) {
                    ((j) this.f16793c).a("douyin_game_live");
                } else if (com.bytedance.android.live.uikit.a.a.b()) {
                    ((j) this.f16793c).a("pipixia_game_live");
                } else if (com.bytedance.android.live.uikit.a.a.d()) {
                    ((j) this.f16793c).a("hotsoon_game_live");
                } else if (com.bytedance.android.live.uikit.a.a.g()) {
                    ((j) this.f16793c).a("vigo_game_live");
                } else if (com.bytedance.android.live.uikit.a.a.f()) {
                    ((j) this.f16793c).a("xigua_game_live");
                } else if (com.bytedance.android.live.uikit.a.a.h()) {
                    ((j) this.f16793c).a("musically_game_live");
                } else if (com.bytedance.android.live.uikit.a.a.i()) {
                    ((j) this.f16793c).a("tiktok_game_live");
                }
            } else if (com.bytedance.android.live.uikit.a.a.a()) {
                ((j) this.f16793c).a("douyin_live");
            } else if (com.bytedance.android.live.uikit.a.a.b()) {
                ((j) this.f16793c).a("pipixia_live");
            } else if (com.bytedance.android.live.uikit.a.a.d()) {
                ((j) this.f16793c).a("hotsoon_live");
            } else if (com.bytedance.android.live.uikit.a.a.g()) {
                ((j) this.f16793c).a("vigo_live");
            } else if (com.bytedance.android.live.uikit.a.a.f()) {
                ((j) this.f16793c).a("xigua_live");
            } else if (com.bytedance.android.live.uikit.a.a.h()) {
                ((j) this.f16793c).a("musically_live");
            } else if (com.bytedance.android.live.uikit.a.a.i()) {
                ((j) this.f16793c).a("tiktok_live");
            }
        }
    }

    private void e(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f16791a, false, 12702, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f16791a, false, 12702, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            this.h |= 1;
            if (this.q == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                this.h |= 2;
                this.h |= 4;
            }
        } else {
            this.h &= -2;
        }
        k();
    }

    private void f(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f16791a, false, 12703, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f16791a, false, 12703, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            this.h |= 4;
        } else {
            this.h &= -5;
        }
        k();
    }

    public final void c(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16791a, false, 12679, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16791a, false, 12679, new Class[]{Context.class}, Void.TYPE);
        } else if (TextUtils.equals(g.a.a(context), this.u)) {
            new com.bytedance.android.livesdk.chatroom.detail.a(this).b(context);
            d(context);
            e(context);
        }
    }

    public final void d(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16791a, false, 12681, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16791a, false, 12681, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.socialbase.downloader.b.a.a(f16792b, "stop");
        if (TextUtils.equals(g.a.a(context), this.u)) {
            this.l = false;
            if (this.f16793c != null) {
                this.f16793c.d();
            }
        }
    }

    private boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f16791a, false, 12678, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f16791a, false, 12678, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            Uri parse = Uri.parse(this.i);
            Uri parse2 = Uri.parse(str);
            if (!StringUtils.equal(parse.getHost() + parse.getPath(), parse2.getHost() + parse2.getPath())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public final void b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16791a, false, 12683, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16791a, false, 12683, new Class[]{Context.class}, Void.TYPE);
        } else if (TextUtils.equals(g.a.a(context), this.u)) {
            if (this.n != null) {
                this.n.a(g.b.STOP_WHEN_JOIN_INTERACT, null);
            }
            e(context);
        }
    }

    public final void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f16791a, false, 12700, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f16791a, false, 12700, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.x = z2;
        if (this.f16793c instanceof j) {
            ((j) this.f16793c).b(z2);
        }
    }

    public final void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f16791a, false, 12701, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f16791a, false, 12701, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            this.h |= 2;
        } else {
            this.h &= -3;
        }
        k();
    }

    public final void e(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16791a, false, 12684, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16791a, false, 12684, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.socialbase.downloader.b.a.a(f16792b, "destroy");
        if (TextUtils.equals(g.a.a(context), this.u)) {
            if (this.f16793c != null) {
                this.f16793c.a((ITTLivePlayer.a) null);
                this.f16793c.e();
                this.f16793c = null;
            }
            i();
        }
    }

    public final void f(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16791a, false, 12685, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16791a, false, 12685, new Class[]{Context.class}, Void.TYPE);
        } else if (TextUtils.equals(g.a.a(context), this.u)) {
            if (this.n != null) {
                this.n.a(g.b.STOP_WHEN_PLAYING_OTHER, null);
            }
            e(context);
        }
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16791a, false, 12682, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16791a, false, 12682, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.socialbase.downloader.b.a.a(f16792b, "stopWhenSlideSwitch");
        if (TextUtils.equals(g.a.a(context), this.u)) {
            this.l = false;
            if (this.f16793c != null) {
                this.f16793c.d();
            }
            this.n = null;
        }
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f16791a, false, 12690, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f16791a, false, 12690, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.v = z2;
        m();
    }

    public final void a(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f16791a, false, 12706, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f16791a, false, 12706, new Class[]{Message.class}, Void.TYPE);
        } else if (message.what == 9) {
            com.ss.android.socialbase.downloader.b.a.a(f16792b, "restart live player");
            try {
                l();
            } catch (Exception e2) {
                Exception exc = e2;
                String str = f16792b;
                if (!(exc.toString() == null || com.ss.android.socialbase.downloader.b.a.f30846a == null)) {
                    com.ss.android.socialbase.downloader.b.a.a(str);
                }
            }
        } else {
            g.b valueOf = g.b.valueOf(message.what);
            if (!(valueOf == g.b.UNKNOWN || this.n == null)) {
                this.n.a(valueOf, message.obj);
            }
        }
    }

    private void a(g.b bVar, Object obj) {
        if (PatchProxy.isSupport(new Object[]{bVar, obj}, this, f16791a, false, 12707, new Class[]{g.b.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, obj}, this, f16791a, false, 12707, new Class[]{g.b.class, Object.class}, Void.TYPE);
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            this.m.obtainMessage(bVar.ordinal(), obj).sendToTarget();
        } else if (this.n != null) {
            this.n.a(bVar, obj);
        }
    }

    private c(@NonNull Context context, @NonNull i iVar, @NonNull b bVar) {
        this.i = "";
        this.k = g;
        this.u = "";
        this.v = true;
        this.y = new TextureView.SurfaceTextureListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16797a;

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f16797a, false, 12712, new Class[]{SurfaceTexture.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f16797a, false, 12712, new Class[]{SurfaceTexture.class}, Boolean.TYPE)).booleanValue();
                }
                com.ss.android.socialbase.downloader.b.a.a(c.f16792b, "onSurfaceTextureDestroyed");
                if (c.this.f16793c != null) {
                    c.this.f16793c.a((SurfaceHolder) null);
                }
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, f16797a, false, 12711, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, f16797a, false, 12711, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.socialbase.downloader.b.a.a(c.f16792b, "onSurfaceTextureSizeChanged");
            }

            @RequiresApi(api = 14)
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                SurfaceTexture surfaceTexture2 = surfaceTexture;
                if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f16797a, false, 12710, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f16797a, false, 12710, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.socialbase.downloader.b.a.a(c.f16792b, "onSurfaceTextureAvailable");
                if (c.this.f16794d != null) {
                    if (c.this.f16795e != null) {
                        c.this.f16795e.release();
                    }
                    c.this.f16795e = new Surface(surfaceTexture);
                    c.this.d(true);
                }
            }
        };
        this.r = context;
        this.s = iVar;
        this.t = bVar;
        this.m = new com.bytedance.android.livesdkapi.depend.c.a(this);
        this.f16796f = new f();
        i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0171, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.livesdk.player.ITTLivePlayer.b r15, int r16, java.lang.String r17) {
        /*
            r14 = this;
            r8 = r14
            r0 = r15
            r9 = r17
            r10 = 3
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r11 = 0
            r1[r11] = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r12 = 1
            r1[r12] = r2
            r13 = 2
            r1[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = f16791a
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.android.livesdk.player.ITTLivePlayer$b> r2 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.class
            r6[r11] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r12] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r13] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 12704(0x31a0, float:1.7802E-41)
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0056
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1[r12] = r0
            r1[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = f16791a
            r4 = 0
            r5 = 12704(0x31a0, float:1.7802E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.android.livesdk.player.ITTLivePlayer$b> r0 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.class
            r6[r11] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r12] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r13] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0056:
            int[] r1 = com.bytedance.android.livesdk.player.c.AnonymousClass2.f16800b
            int r2 = r15.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L_0x00c2;
                case 2: goto L_0x00ac;
                case 3: goto L_0x00ac;
                case 4: goto L_0x0085;
                case 5: goto L_0x0074;
                case 6: goto L_0x006e;
                case 7: goto L_0x0068;
                case 8: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x00c5
        L_0x0062:
            com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.BUFFERING_END
            r14.a((com.bytedance.android.livesdkapi.depend.d.g.b) r1, (java.lang.Object) r9)
            goto L_0x00c5
        L_0x0068:
            com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.BUFFERING_START
            r14.a((com.bytedance.android.livesdkapi.depend.d.g.b) r1, (java.lang.Object) r9)
            goto L_0x00c5
        L_0x006e:
            com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.INTERACT_SEI
            r14.a((com.bytedance.android.livesdkapi.depend.d.g.b) r1, (java.lang.Object) r9)
            goto L_0x00c5
        L_0x0074:
            r1 = r16
            r8.o = r1
            r14.m()
            com.bytedance.android.livesdkapi.depend.d.g$b r2 = com.bytedance.android.livesdkapi.depend.d.g.b.VIDEO_SIZE_CHANGED
            java.lang.String r1 = java.lang.String.valueOf(r16)
            r14.a((com.bytedance.android.livesdkapi.depend.d.g.b) r2, (java.lang.Object) r1)
            goto L_0x00c5
        L_0x0085:
            java.lang.String r1 = f16792b
            java.lang.String r2 = "player prepared"
            com.ss.android.socialbase.downloader.b.a.a(r1, r2)
            com.bytedance.android.livesdk.player.ITTLivePlayer r1 = r8.f16793c
            if (r1 == 0) goto L_0x00a1
            com.bytedance.android.livesdk.player.ITTLivePlayer r1 = r8.f16793c
            android.graphics.Point r1 = r1.h()
            if (r1 == 0) goto L_0x00a1
            int r2 = r1.x
            int r1 = r1.y
            int r1 = r1 << 16
            r1 = r1 | r2
            r8.o = r1
        L_0x00a1:
            r8.p = r11
            r14.e((boolean) r12)
            com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.PLAYER_PREPARED
            r14.a((com.bytedance.android.livesdkapi.depend.d.g.b) r1, (java.lang.Object) r9)
            goto L_0x00c5
        L_0x00ac:
            r14.e((boolean) r11)
            r14.f((boolean) r11)
            com.bytedance.android.livesdk.player.ITTLivePlayer$b r1 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.MEDIA_ERROR
            if (r0 != r1) goto L_0x00bc
            com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.MEDIA_ERROR
            r14.a((com.bytedance.android.livesdkapi.depend.d.g.b) r1, (java.lang.Object) r9)
            goto L_0x00c5
        L_0x00bc:
            com.bytedance.android.livesdkapi.depend.d.g$b r1 = com.bytedance.android.livesdkapi.depend.d.g.b.COMPLETE_PLAY
            r14.a((com.bytedance.android.livesdkapi.depend.d.g.b) r1, (java.lang.Object) r9)
            goto L_0x00c5
        L_0x00c2:
            r14.f((boolean) r12)
        L_0x00c5:
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f16791a
            r4 = 0
            r5 = 12705(0x31a1, float:1.7803E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<com.bytedance.android.livesdk.player.ITTLivePlayer$b> r2 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.class
            r6[r11] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x00f3
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f16791a
            r4 = 0
            r5 = 12705(0x31a1, float:1.7803E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<com.bytedance.android.livesdk.player.ITTLivePlayer$b> r0 = com.bytedance.android.livesdk.player.ITTLivePlayer.b.class
            r6[r11] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x00f3:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Throwable -> 0x0172 }
            r1.<init>()     // Catch:{ Throwable -> 0x0172 }
            java.lang.String r2 = "event_page"
            java.lang.String r3 = "live_detail"
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x0172 }
            java.lang.String r2 = "time"
            long r3 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ Throwable -> 0x0172 }
            long r5 = r8.z     // Catch:{ Throwable -> 0x0172 }
            r7 = 0
            long r3 = r3 - r5
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x0172 }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x0172 }
            java.lang.String r2 = "url"
            java.lang.String r3 = r8.i     // Catch:{ Throwable -> 0x0172 }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x0172 }
            int[] r2 = com.bytedance.android.livesdk.player.c.AnonymousClass2.f16800b     // Catch:{ Throwable -> 0x0172 }
            int r0 = r15.ordinal()     // Catch:{ Throwable -> 0x0172 }
            r0 = r2[r0]     // Catch:{ Throwable -> 0x0172 }
            switch(r0) {
                case 1: goto L_0x015a;
                case 2: goto L_0x0143;
                case 7: goto L_0x0133;
                case 8: goto L_0x0123;
                default: goto L_0x0122;
            }     // Catch:{ Throwable -> 0x0172 }
        L_0x0122:
            goto L_0x0171
        L_0x0123:
            com.bytedance.android.livesdk.j.a r0 = com.bytedance.android.livesdk.j.a.a()     // Catch:{ Throwable -> 0x0172 }
            java.lang.String r2 = "live_block_end"
            java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0172 }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r3[r11] = r4     // Catch:{ Throwable -> 0x0172 }
            r0.a(r2, r1, r3)     // Catch:{ Throwable -> 0x0172 }
            goto L_0x0171
        L_0x0133:
            com.bytedance.android.livesdk.j.a r0 = com.bytedance.android.livesdk.j.a.a()     // Catch:{ Throwable -> 0x0172 }
            java.lang.String r2 = "live_block_start"
            java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0172 }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r3[r11] = r4     // Catch:{ Throwable -> 0x0172 }
            r0.a(r2, r1, r3)     // Catch:{ Throwable -> 0x0172 }
            goto L_0x0178
        L_0x0143:
            java.lang.String r0 = "is_success"
            java.lang.String r2 = "0"
            r1.put(r0, r2)     // Catch:{ Throwable -> 0x0172 }
            com.bytedance.android.livesdk.j.a r0 = com.bytedance.android.livesdk.j.a.a()     // Catch:{ Throwable -> 0x0172 }
            java.lang.String r2 = "live_first_play"
            java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0172 }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r3[r11] = r4     // Catch:{ Throwable -> 0x0172 }
            r0.a(r2, r1, r3)     // Catch:{ Throwable -> 0x0172 }
            goto L_0x0178
        L_0x015a:
            java.lang.String r0 = "is_success"
            java.lang.String r2 = "1"
            r1.put(r0, r2)     // Catch:{ Throwable -> 0x0172 }
            com.bytedance.android.livesdk.j.a r0 = com.bytedance.android.livesdk.j.a.a()     // Catch:{ Throwable -> 0x0172 }
            java.lang.String r2 = "live_first_play"
            java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0172 }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r3[r11] = r4     // Catch:{ Throwable -> 0x0172 }
            r0.a(r2, r1, r3)     // Catch:{ Throwable -> 0x0172 }
            goto L_0x0178
        L_0x0171:
            return
        L_0x0172:
            r0 = move-exception
            java.lang.String r1 = "LivePlayController"
            com.bytedance.android.live.core.c.a.a((java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.player.c.a(com.bytedance.android.livesdk.player.ITTLivePlayer$b, int, java.lang.String):void");
    }

    /* synthetic */ c(Context context, i iVar, b bVar, byte b2) {
        this(context, iVar, bVar);
    }
}
