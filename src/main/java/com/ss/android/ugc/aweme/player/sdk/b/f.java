package com.ss.android.ugc.aweme.player.sdk.b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.ss.android.ugc.aweme.player.sdk.api.a;
import com.ss.android.ugc.aweme.player.sdk.api.d;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoBufferListener;
import com.ss.ttvideoengine.VideoEngineListener;
import com.ss.ttvideoengine.log.ExternVideoLoggerListener;
import com.ss.ttvideoengine.log.VideoEventListener;
import com.ss.ttvideoengine.log.VideoEventManager;
import com.ss.ttvideoengine.utils.Error;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class f extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f59178b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f59179c;

    /* renamed from: d  reason: collision with root package name */
    public long f59180d;

    /* renamed from: e  reason: collision with root package name */
    public TTVideoEngine f59181e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f59182f;
    public volatile String g;
    public d h;
    public IPlayer.c i;
    public a j;
    public com.ss.android.ugc.playerkit.a.a k;
    private Context l;
    private int m;
    private int n;
    private AtomicReference<TTVideoEngine> o;
    private boolean p;
    private int q;
    private SparseIntArray r;
    private ExternVideoLoggerListener s;
    private boolean t;
    private IPlayer.b u;
    private VideoEngineListener v;

    public final void i() {
    }

    public final boolean g() {
        return this.p;
    }

    public final boolean h() {
        return this.t;
    }

    public final String n() {
        return this.g;
    }

    public final void a(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, f59178b, false, 64441, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, f59178b, false, 64441, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        try {
            if ((this.u == null || !this.u.a(surface)) && this.f59181e != null) {
                this.f59181e.setSurface(surface);
            }
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "setSurface");
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f59178b, false, 64454, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f59178b, false, 64454, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            if (this.f59181e != null) {
                this.f59181e.setLooping(true);
            }
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "setLooping");
        }
    }

    public final void a(String str, Map<String, Object> map) throws IOException {
        boolean z;
        String str2 = str;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, this, f59178b, false, 64456, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map2}, this, f59178b, false, 64456, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        this.g = null;
        int i2 = -1;
        boolean booleanValue = ((Boolean) map2.get("vr")).booleanValue();
        boolean booleanValue2 = ((Boolean) map2.get("h265")).booleanValue();
        int intValue = ((Integer) map2.get("render_type")).intValue();
        int intValue2 = map2.get("decoder_type") != null ? ((Integer) map2.get("decoder_type")).intValue() : 0;
        int intValue3 = map2.get("bitrate") != null ? ((Integer) map2.get("bitrate")).intValue() : 0;
        if (map2.get("ratio") != null) {
            i2 = ((Integer) map2.get("ratio")).intValue();
        }
        boolean booleanValue3 = (map2.get("async_init") == null || !(map2.get("async_init") instanceof Boolean)) ? false : ((Boolean) map2.get("async_init")).booleanValue();
        if (map2.get("frames_wait") != null && (map2.get("frames_wait") instanceof Integer)) {
            this.f59181e.setIntOption(103, ((Integer) map2.get("frames_wait")).intValue());
        }
        String obj = map2.get("key") != null ? map2.get("key").toString() : null;
        if (map2.get("init_start_time_ms") != null) {
            this.f59181e.setStartTime(((Integer) map2.get("init_start_time_ms")).intValue());
        }
        this.t = false;
        if (this.r != null && this.r.get(7) == 1) {
            int i3 = this.r.get(10);
            int i4 = this.r.get(11);
            boolean z2 = this.r.get(12) == 1;
            int i5 = this.r.get(13);
            int i6 = this.r.get(14);
            if (i3 > 0 && i2 >= i3 && intValue3 > 0 && intValue3 <= i4 && ((!booleanValue2 || z2) && this.m > i5 && this.n > i6)) {
                this.t = true;
            }
        }
        boolean z3 = this.r != null && this.r.get(15) == 1;
        if (TextUtils.isEmpty(str) || str2.startsWith("http")) {
            z = true;
            this.f59181e.setIntOption(16, 1);
            if (z3) {
                this.f59181e.setIntOption(104, 1);
                this.f59181e.setDirectUrlUseDataLoader(str2, obj);
            } else {
                this.f59181e.setDirectURL(str2);
            }
        } else {
            this.f59181e.setIntOption(16, 0);
            this.f59181e.setLocalURL(str2);
            z = true;
        }
        this.g = str2;
        this.f59181e.setIntOption(6, z ? 1 : 0);
        if (intValue2 == 0) {
            this.f59181e.setIntOption(9, z);
        } else {
            this.f59181e.setIntOption(9, 2);
        }
        this.p = b(booleanValue2);
        if (this.p) {
            this.f59181e.setIntOption(7, z);
        } else {
            this.f59181e.setIntOption(7, 0);
        }
        if (booleanValue3 && this.p) {
            this.f59181e.setAsyncInit(z, booleanValue2 ? 1 : 0);
        }
        int i7 = 3;
        this.f59181e.setIntOption(3, z);
        if (this.r != null && this.r.indexOfKey(20) >= 0) {
            this.f59181e.setIntOption(118, this.r.get(20));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f59181e.setIntOption(5, booleanValue);
        } else if (intValue == 0) {
            this.f59181e.setIntOption(5, booleanValue ? 1 : 0);
        } else {
            TTVideoEngine tTVideoEngine = this.f59181e;
            if (booleanValue) {
                i7 = 1;
            }
            tTVideoEngine.setIntOption(5, i7);
        }
        if (this.r != null && this.r.indexOfKey(19) >= 0) {
            this.f59181e.setIntOption(115, this.r.get(19));
        }
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64457, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64457, new Class[0], Void.TYPE);
            return;
        }
        this.f59181e.setCacheControlEnabled(true);
        this.f59181e.setIntOption(0, 15);
        this.f59181e.setLooping(true);
        this.f59181e.play();
    }

    public final void a(IPlayer.c cVar) {
        IPlayer.a aVar;
        f fVar;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f59178b, false, 64462, new Class[]{IPlayer.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f59178b, false, 64462, new Class[]{IPlayer.c.class}, Void.TYPE);
            return;
        }
        if (cVar == null) {
            aVar = new IPlayer.a();
            fVar = this;
        } else {
            fVar = this;
            aVar = cVar;
        }
        fVar.i = aVar;
    }

    public final void a(String str, a aVar) {
        ExternVideoLoggerListener externVideoLoggerListener;
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f59178b, false, 64463, new Class[]{String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f59178b, false, 64463, new Class[]{String.class, a.class}, Void.TYPE);
            return;
        }
        try {
            this.j = aVar;
            TTVideoEngine tTVideoEngine = this.f59181e;
            if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64465, new Class[0], ExternVideoLoggerListener.class)) {
                externVideoLoggerListener = (ExternVideoLoggerListener) PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64465, new Class[0], ExternVideoLoggerListener.class);
            } else {
                if (this.s == null) {
                    this.s = new ExternVideoLoggerListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f59187a;

                        public final String getLog(String str) {
                            if (PatchProxy.isSupport(new Object[]{str}, this, f59187a, false, 64481, new Class[]{String.class}, String.class)) {
                                return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f59187a, false, 64481, new Class[]{String.class}, String.class);
                            } else if (f.this.j != null) {
                                return f.this.j.a(str);
                            } else {
                                return "";
                            }
                        }
                    };
                }
                externVideoLoggerListener = this.s;
            }
            tTVideoEngine.setExternLogListener(externVideoLoggerListener, str);
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "setLogListener");
        }
    }

    public final void a(com.ss.android.ugc.playerkit.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f59178b, false, 64464, new Class[]{com.ss.android.ugc.playerkit.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f59178b, false, 64464, new Class[]{com.ss.android.ugc.playerkit.a.a.class}, Void.TYPE);
            return;
        }
        if (aVar != this.k) {
            this.k = aVar;
            VideoEventManager.instance.setListener(new VideoEventListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59185a;

                public final void onEvent() {
                    if (PatchProxy.isSupport(new Object[0], this, f59185a, false, 64480, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f59185a, false, 64480, new Class[0], Void.TYPE);
                        return;
                    }
                    if (f.this.k != null) {
                        f.this.k.onEvent(VideoEventManager.instance.popAllEvents());
                    }
                }
            });
        }
    }

    public final void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f59178b, false, 64466, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f59178b, false, 64466, new Class[]{d.class}, Void.TYPE);
            return;
        }
        this.h = dVar;
        if (this.f59181e != null) {
            this.f59181e.setVideoBufferListener(new VideoBufferListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59189a;

                public final void onBufferEnd(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59189a, false, 64483, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59189a, false, 64483, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (f.this.h != null && i == 1) {
                        f.this.h.b();
                    }
                }

                public final void onBufferStart(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59189a, false, 64482, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59189a, false, 64482, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (f.this.h != null && i == 1) {
                        f.this.h.a();
                    }
                }
            });
        }
    }

    public final boolean f() {
        if (Build.VERSION.SDK_INT >= 26 || !this.p) {
            return false;
        }
        return true;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64447, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64447, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (this.f59181e != null) {
                this.f59181e.pause();
            }
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "pause");
        }
        this.f59182f = false;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64446, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (this.f59181e != null) {
                this.f59181e.stop();
            }
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "stop");
        }
    }

    public final boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64461, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64461, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if (this.f59181e != null) {
                return this.f59181e.supportHevcPlayback();
            }
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "supportHevcPlayback");
        }
        return true;
    }

    public final String o() {
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64473, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64473, new Class[0], String.class);
        }
        TTVideoEngine tTVideoEngine = this.o.get();
        if (tTVideoEngine != null) {
            return tTVideoEngine.getStringOption(BaseLoginOrRegisterActivity.o);
        }
        return "";
    }

    private boolean s() {
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64468, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64468, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("sony")) {
            return true;
        }
        return false;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64448, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64448, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f59181e.setListener(null);
            this.f59181e.release();
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "release");
        }
        if (Thread.currentThread().getId() != this.f59180d) {
            ExceptionMonitor.ensureNotReachHere((Throwable) new Exception(), "release thread not match");
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64449, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64449, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f59181e.setListener(null);
            this.f59181e.release();
            this.f59181e.setSurface(null);
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "reset");
        }
        this.f59181e = null;
        this.g = null;
        this.o.set(null);
        if (Thread.currentThread().getId() != this.f59180d) {
            ExceptionMonitor.ensureNotReachHere((Throwable) new Exception(), "reset thread not match");
        }
        r();
        this.q = 0;
    }

    public final boolean k() {
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64453, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64453, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if (this.f59181e == null || this.f59181e.getPlaybackState() != 1) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "isPlaying");
        }
        return false;
    }

    public final long l() {
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64444, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64444, new Class[0], Long.TYPE)).longValue();
        }
        try {
            if (this.f59181e != null) {
                return (long) this.f59181e.getCurrentPlaybackTime();
            }
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "getCurrentPosition");
        }
        return 0;
    }

    public final long m() {
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64445, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64445, new Class[0], Long.TYPE)).longValue();
        }
        try {
            if (this.f59181e != null) {
                return (long) this.f59181e.getDuration();
            }
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "getDuration");
        }
        return 1073741823;
    }

    public final IPlayer.e p() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64472, new Class[0], IPlayer.e.class)) {
            return (IPlayer.e) PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64472, new Class[0], IPlayer.e.class);
        }
        IPlayer.e eVar = new IPlayer.e();
        TTVideoEngine tTVideoEngine = this.o.get();
        if (tTVideoEngine != null) {
            str = tTVideoEngine.getStringOption(80);
        } else {
            str = null;
        }
        eVar.f59117a = str;
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f59178b
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 64467(0xfbd3, float:9.0338E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f59178b
            r5 = 0
            r6 = 64467(0xfbd3, float:9.0338E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.ttvideoengine.TTVideoEngine r1 = r12.f59181e
            if (r1 != 0) goto L_0x012e
            r1 = 1000(0x3e8, float:1.401E-42)
            r2 = 5000(0x1388, float:7.006E-42)
            android.util.SparseIntArray r3 = r12.r
            r4 = 4
            r5 = 1
            if (r3 == 0) goto L_0x0072
            android.util.SparseIntArray r1 = r12.r
            int r1 = r1.get(r5)
            if (r1 != r5) goto L_0x003d
            r1 = 1
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            android.util.SparseIntArray r2 = r12.r
            int r2 = r2.get(r0)
            android.util.SparseIntArray r3 = r12.r
            r6 = 2
            int r3 = r3.get(r6)
            android.util.SparseIntArray r6 = r12.r
            r7 = 3
            int r6 = r6.get(r7)
            android.util.SparseIntArray r7 = r12.r
            int r7 = r7.get(r4)
            android.util.SparseIntArray r8 = r12.r
            r9 = 5
            int r8 = r8.get(r9)
            android.util.SparseIntArray r9 = r12.r
            r10 = 6
            int r9 = r9.get(r10)
            android.util.SparseIntArray r10 = r12.r
            r11 = 18
            int r10 = r10.get(r11)
            if (r10 != r5) goto L_0x007b
            r10 = 1
            goto L_0x007c
        L_0x0072:
            r1 = 0
            r2 = 0
            r3 = 1
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 5000(0x1388, float:7.006E-42)
            r8 = 0
            r9 = 0
        L_0x007b:
            r10 = 0
        L_0x007c:
            com.ss.ttvideoengine.utils.TTVideoEngineLog.turnOn(r5, r9)
            if (r9 != r5) goto L_0x0083
            r9 = 1
            goto L_0x0084
        L_0x0083:
            r9 = 0
        L_0x0084:
            f59179c = r9
            com.ss.ttvideoengine.TTVideoEngine r9 = new com.ss.ttvideoengine.TTVideoEngine
            android.content.Context r11 = r12.l
            r9.<init>(r11, r2)
            r12.f59181e = r9
            java.util.concurrent.atomic.AtomicReference<com.ss.ttvideoengine.TTVideoEngine> r9 = r12.o
            com.ss.ttvideoengine.TTVideoEngine r11 = r12.f59181e
            r9.set(r11)
            if (r2 != r5) goto L_0x009f
            com.ss.ttvideoengine.TTVideoEngine r2 = r12.f59181e
            r9 = 117(0x75, float:1.64E-43)
            r2.setIntOption(r9, r5)
        L_0x009f:
            if (r10 == 0) goto L_0x00a8
            com.ss.ttvideoengine.TTVideoEngine r2 = r12.f59181e
            r9 = 116(0x74, float:1.63E-43)
            r2.setIntOption(r9, r5)
        L_0x00a8:
            com.ss.ttvideoengine.TTVideoEngine r2 = r12.f59181e
            r9 = 114(0x72, float:1.6E-43)
            r2.setIntOption(r9, r5)
            com.ss.ttvideoengine.TTVideoEngine r2 = r12.f59181e
            r9 = 13
            r2.setIntOption(r9, r5)
            com.ss.ttvideoengine.TTVideoEngine r2 = r12.f59181e
            r2.setIntOption(r4, r3)
            boolean r2 = r12.s()
            if (r2 == 0) goto L_0x00cd
            int[] r2 = new int[r5]
            r3 = 44100(0xac44, float:6.1797E-41)
            r2[r0] = r3
            com.ss.ttvideoengine.TTVideoEngine r3 = r12.f59181e
            r3.setUnSupportSampleRates(r2)
        L_0x00cd:
            com.ss.ttvideoengine.TTVideoEngine r2 = r12.f59181e
            com.ss.ttvideoengine.VideoEngineListener r3 = r12.v
            r2.setListener(r3)
            if (r1 == 0) goto L_0x00d7
            return
        L_0x00d7:
            boolean r1 = r12.f()
            if (r1 == 0) goto L_0x00ec
            boolean r1 = r12.f59182f
            if (r1 == 0) goto L_0x00ec
            int r1 = r12.q
            if (r1 <= 0) goto L_0x00ec
            com.ss.ttvideoengine.TTVideoEngine r1 = r12.f59181e
            int r2 = r12.q
            r1.setStartTime(r2)
        L_0x00ec:
            boolean r1 = r12.p
            if (r1 == 0) goto L_0x00f6
            com.ss.ttvideoengine.TTVideoEngine r1 = r12.f59181e
            r2 = 7
            r1.setIntOption(r2, r5)
        L_0x00f6:
            com.ss.ttvideoengine.TTVideoEngine r1 = r12.f59181e
            r2 = 10
            r1.setIntOption(r2, r6)
            com.ss.ttvideoengine.TTVideoEngine r1 = r12.f59181e
            r2 = 15
            r1.setIntOption(r2, r7)
            com.ss.ttvideoengine.TTVideoEngine r1 = r12.f59181e
            r2 = 101(0x65, float:1.42E-43)
            r1.setIntOption(r2, r8)
            com.ss.ttvideoengine.TTVideoEngine r1 = r12.f59181e
            r2 = 100
            r1.setIntOption(r2, r0)
            com.ss.ttvideoengine.TTVideoEngine r1 = r12.f59181e
            r2 = 11
            r1.setIntOption(r2, r0)
            com.ss.ttvideoengine.TTVideoEngine r1 = r12.f59181e
            r2 = 17
            r1.setIntOption(r2, r5)
            com.ss.ttvideoengine.TTVideoEngine r1 = r12.f59181e
            r2 = 12
            r1.setIntOption(r2, r0)
            com.ss.ttvideoengine.TTVideoEngine r0 = r12.f59181e
            r1 = 113(0x71, float:1.58E-43)
            r0.setIntOption(r1, r5)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.b.f.r():void");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64450, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f59178b, false, 64451, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59178b, false, 64451, new Class[0], Void.TYPE);
        } else if (this.r != null && this.r.indexOfKey(7) >= 0) {
            if (this.t) {
                this.f59181e.setIntOption(110, 1);
                this.f59181e.setIntOption(111, this.r.get(9));
                this.f59181e.setIntOption(SearchJediMixFeedAdapter.f42516e, this.r.get(8));
            } else {
                this.f59181e.setIntOption(110, 0);
            }
        }
        this.f59181e.play();
    }

    public final void a(IPlayer.b bVar) {
        this.u = bVar;
    }

    public f(Context context) {
        this(context, false);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f59178b, false, 64455, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f59178b, false, 64455, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        try {
            if (this.f59181e != null) {
                TTVideoEngine tTVideoEngine = this.f59181e;
                double d2 = (double) f2;
                Double.isNaN(d2);
                double d3 = d2 * 0.01d;
                double duration = (double) this.f59181e.getDuration();
                Double.isNaN(duration);
                tTVideoEngine.seekTo((int) (d3 * duration), null);
            }
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "seekTo");
        }
    }

    public final void b(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, f59178b, false, 64442, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, f59178b, false, 64442, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        try {
            if (this.f59181e != null) {
                this.f59181e.setSurface(surface);
            }
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "setSurfaceWithoutHook");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r10) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f59178b
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r8] = r2
            java.lang.Class r7 = java.lang.Float.TYPE
            r4 = 0
            r5 = 64469(0xfbd5, float:9.034E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0041
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f59178b
            r4 = 0
            r5 = 64469(0xfbd5, float:9.034E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r8] = r0
            java.lang.Class r7 = java.lang.Float.TYPE
            r2 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
        L_0x0041:
            com.ss.ttvideoengine.TTVideoEngine r0 = r9.f59181e
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L_0x0048
            return r1
        L_0x0048:
            switch(r10) {
                case 0: goto L_0x0078;
                case 1: goto L_0x0070;
                case 2: goto L_0x0066;
                case 3: goto L_0x0086;
                case 4: goto L_0x0086;
                case 5: goto L_0x0086;
                case 6: goto L_0x0086;
                case 7: goto L_0x0086;
                case 8: goto L_0x005f;
                case 9: goto L_0x0055;
                case 10: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0086
        L_0x004c:
            com.ss.ttvideoengine.TTVideoEngine r0 = r9.f59181e     // Catch:{ Exception -> 0x0080 }
            r2 = 70
            float r0 = r0.getFloatOption(r2)     // Catch:{ Exception -> 0x0080 }
            goto L_0x006e
        L_0x0055:
            com.ss.ttvideoengine.TTVideoEngine r0 = r9.f59181e     // Catch:{ Exception -> 0x0080 }
            r2 = 42
            int r0 = r0.getIntOption(r2)     // Catch:{ Exception -> 0x0080 }
            float r1 = (float) r0     // Catch:{ Exception -> 0x0080 }
            goto L_0x0086
        L_0x005f:
            com.ss.ttvideoengine.TTVideoEngine r0 = r9.f59181e     // Catch:{ Exception -> 0x0080 }
            float r0 = r0.getBitrate()     // Catch:{ Exception -> 0x0080 }
            goto L_0x006e
        L_0x0066:
            com.ss.ttvideoengine.TTVideoEngine r0 = r9.f59181e     // Catch:{ Exception -> 0x0080 }
            r2 = 71
            float r0 = r0.getFloatOption(r2)     // Catch:{ Exception -> 0x0080 }
        L_0x006e:
            r1 = r0
            goto L_0x0086
        L_0x0070:
            com.ss.ttvideoengine.TTVideoEngine r0 = r9.f59181e     // Catch:{ Exception -> 0x0080 }
            int r0 = r0.getDuration()     // Catch:{ Exception -> 0x0080 }
            float r1 = (float) r0     // Catch:{ Exception -> 0x0080 }
            goto L_0x0086
        L_0x0078:
            com.ss.ttvideoengine.TTVideoEngine r0 = r9.f59181e     // Catch:{ Exception -> 0x0080 }
            int r0 = r0.getCurrentPlaybackTime()     // Catch:{ Exception -> 0x0080 }
            float r1 = (float) r0
            goto L_0x0086
        L_0x0080:
            r0 = move-exception
            java.lang.String r2 = "getInfo"
            com.bytedance.article.common.monitor.stack.ExceptionMonitor.ensureNotReachHere((java.lang.Throwable) r0, (java.lang.String) r2)
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.b.f.a(int):float");
    }

    public final boolean b(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f59178b, false, 64458, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f59178b, false, 64458, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (this.r == null || (this.r.indexOfKey(17) < 0 && this.r.indexOfKey(16) < 0)) {
            z4 = this.p;
        } else {
            if (this.r.get(17, 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.r.get(16, 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((!z || !z2) && (z || !z3)) {
                z4 = false;
            }
        }
        return z4;
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f59178b, false, 64452, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f59178b, false, 64452, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (f()) {
            this.f59182f = true;
            this.q = (int) j2;
        }
    }

    private f(Context context, boolean z) {
        this(context, false, null);
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f59178b, false, 64443, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f59178b, false, 64443, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        try {
            if (this.f59181e != null) {
                this.f59181e.setVolume(f2, f3);
            }
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2, "setVolume");
        }
    }

    public f(Context context, boolean z, SparseIntArray sparseIntArray) {
        this.v = new VideoEngineListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59183a;

            public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
            }

            public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
            }

            public final void onPrepare(TTVideoEngine tTVideoEngine) {
            }

            public final void onCompletion(TTVideoEngine tTVideoEngine) {
                if (PatchProxy.isSupport(new Object[]{tTVideoEngine}, this, f59183a, false, 64477, new Class[]{TTVideoEngine.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{tTVideoEngine}, this, f59183a, false, 64477, new Class[]{TTVideoEngine.class}, Void.TYPE);
                    return;
                }
                f.this.i.c();
            }

            public final void onError(Error error) {
                if (PatchProxy.isSupport(new Object[]{error}, this, f59183a, false, 64478, new Class[]{Error.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{error}, this, f59183a, false, 64478, new Class[]{Error.class}, Void.TYPE);
                    return;
                }
                if (Thread.currentThread().getId() != f.this.f59180d) {
                    Exception exc = new Exception();
                    ExceptionMonitor.ensureNotReachHere((Throwable) exc, "onError thread not match, error:" + error);
                }
                f.this.i.a(error.code, error.internalCode, error);
            }

            public final void onPrepared(TTVideoEngine tTVideoEngine) {
                if (PatchProxy.isSupport(new Object[]{tTVideoEngine}, this, f59183a, false, 64475, new Class[]{TTVideoEngine.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{tTVideoEngine}, this, f59183a, false, 64475, new Class[]{TTVideoEngine.class}, Void.TYPE);
                    return;
                }
                f.this.i.a();
                if (TextUtils.isEmpty(f.this.g) && f.this.f59181e != null) {
                    f.this.g = f.this.f59181e.getCurrentPlayPath();
                }
            }

            public final void onRenderStart(TTVideoEngine tTVideoEngine) {
                if (PatchProxy.isSupport(new Object[]{tTVideoEngine}, this, f59183a, false, 64476, new Class[]{TTVideoEngine.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{tTVideoEngine}, this, f59183a, false, 64476, new Class[]{TTVideoEngine.class}, Void.TYPE);
                } else if (!f.this.f59182f) {
                    if (f.this.f59181e != null) {
                        f.this.f59119a.f59113a = f.this.f59181e.getIntOption(43);
                        f.this.f59119a.f59114b = f.this.f59181e.getIntOption(45);
                    }
                    f.this.i.b();
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onVideoStatusException(int r10) {
                /*
                    r9 = this;
                    r7 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r7]
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                    r8 = 0
                    r0[r8] = r1
                    com.meituan.robust.ChangeQuickRedirect r2 = f59183a
                    java.lang.Class[] r5 = new java.lang.Class[r7]
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r5[r8] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 64479(0xfbdf, float:9.0354E-41)
                    r1 = r9
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x003a
                    java.lang.Object[] r0 = new java.lang.Object[r7]
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                    r0[r8] = r1
                    com.meituan.robust.ChangeQuickRedirect r2 = f59183a
                    r3 = 0
                    r4 = 64479(0xfbdf, float:9.0354E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r7]
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r5[r8] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r9
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x003a:
                    r0 = 0
                    r1 = 20
                    if (r10 == r1) goto L_0x0056
                    r1 = 30
                    if (r10 == r1) goto L_0x0056
                    r1 = 40
                    if (r10 == r1) goto L_0x0053
                    r1 = 1000(0x3e8, float:1.401E-42)
                    if (r10 == r1) goto L_0x0056
                    r1 = 1002(0x3ea, float:1.404E-42)
                    if (r10 == r1) goto L_0x0053
                    switch(r10) {
                        case 3: goto L_0x0056;
                        case 4: goto L_0x0056;
                        default: goto L_0x0052;
                    }
                L_0x0052:
                    goto L_0x0058
                L_0x0053:
                    java.lang.String r0 = "视频已删除，无法播放"
                    goto L_0x0058
                L_0x0056:
                    java.lang.String r0 = "转码中，视频暂时无法播放"
                L_0x0058:
                    java.lang.Thread r1 = java.lang.Thread.currentThread()
                    long r1 = r1.getId()
                    com.ss.android.ugc.aweme.player.sdk.b.f r3 = com.ss.android.ugc.aweme.player.sdk.b.f.this
                    long r3 = r3.f59180d
                    int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r5 == 0) goto L_0x007e
                    java.lang.Exception r1 = new java.lang.Exception
                    r1.<init>()
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "onVideoStatusException thread not match, status:"
                    r2.<init>(r3)
                    r2.append(r10)
                    java.lang.String r2 = r2.toString()
                    com.bytedance.article.common.monitor.stack.ExceptionMonitor.ensureNotReachHere((java.lang.Throwable) r1, (java.lang.String) r2)
                L_0x007e:
                    com.ss.android.ugc.aweme.player.sdk.b.f r1 = com.ss.android.ugc.aweme.player.sdk.b.f.this
                    com.ss.android.ugc.aweme.player.sdk.api.IPlayer$c r1 = r1.i
                    r1.a(r8, r8, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.b.f.AnonymousClass1.onVideoStatusException(int):void");
            }

            public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
                if (PatchProxy.isSupport(new Object[]{tTVideoEngine, Integer.valueOf(i)}, this, f59183a, false, 64474, new Class[]{TTVideoEngine.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{tTVideoEngine, Integer.valueOf(i)}, this, f59183a, false, 64474, new Class[]{TTVideoEngine.class, Integer.TYPE}, Void.TYPE);
                } else if (i == 2) {
                    f.this.i.a(true);
                } else {
                    if (i == 1) {
                        f.this.i.a(false);
                    }
                }
            }

            public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
                f.this.f59119a.f59115c = i;
                f.this.f59119a.f59116d = i2;
            }
        };
        this.i = new IPlayer.a();
        this.l = context;
        this.p = z;
        this.r = sparseIntArray;
        this.m = com.ss.android.ugc.aweme.player.sdk.c.a.a();
        this.n = com.ss.android.ugc.aweme.player.sdk.c.a.b();
        this.f59180d = Thread.currentThread().getId();
        this.o = new AtomicReference<>(null);
        r();
    }
}
