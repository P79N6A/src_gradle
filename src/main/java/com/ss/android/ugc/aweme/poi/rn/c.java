package com.ss.android.ugc.aweme.poi.rn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.c.d;
import com.ss.android.ugc.aweme.newfollow.util.i;
import com.ss.android.ugc.aweme.newfollow.util.j;
import com.ss.android.ugc.aweme.newfollow.util.n;
import com.ss.android.ugc.aweme.poi.rn.VideoViewManager;
import com.ss.android.ugc.aweme.poi.rn.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.av;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.as;
import com.ss.android.ugc.aweme.u.at;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.a.a;
import com.ss.android.ugc.aweme.video.b.b;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.playerkit.c.c;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public class c extends FrameLayout implements WeakHandler.IHandler, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60295a;

    /* renamed from: b  reason: collision with root package name */
    public KeepSurfaceTextureView f60296b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f60297c;

    /* renamed from: d  reason: collision with root package name */
    boolean f60298d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f60299e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f60300f = false;
    public boolean g = false;
    private RemoteImageView h;
    private i i;
    private com.ss.android.ugc.aweme.feed.b.a j = new com.ss.android.ugc.aweme.feed.b.a();
    private o k;
    private boolean l = false;
    private boolean m = false;
    private float n = 0.72f;
    private double o = 0.0d;
    private double p = 0.0d;
    private Map<String, String> q;
    private VideoViewManager.a r;
    private b s;

    public final void a(float f2) {
    }

    public final void c(boolean z) {
    }

    public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f60295a, false, 65629, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f60295a, false, 65629, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
        } else if (!this.f60298d && f(aVar.f76010a)) {
            this.j.f45077a = 2;
            g("onRenderReady");
            bg.a(new d(this.f60297c));
        }
    }

    public final void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f60295a, false, 65630, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f60295a, false, 65630, new Class[]{e.class}, Void.TYPE);
        } else if (f(eVar.f76049b)) {
            g("onPlayFailed");
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f60295a, false, 65631, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f60295a, false, 65631, new Class[]{String.class}, Void.TYPE);
        } else if (f(str)) {
            g("onPreparePlay");
            this.j.f45077a = 1;
        }
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f60295a, false, 65638, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f60295a, false, 65638, new Class[]{b.class}, Void.TYPE);
            return;
        }
        String str = bVar.f76013a;
        if (f(str)) {
            g("onRenderFirstFrame");
            av.INSTANCE.setVideoId(str);
            d();
            e();
            f();
        }
    }

    @SuppressLint({"LogNotTimber"})
    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60295a, false, 65644, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60295a, false, 65644, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
            com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.bgf).a();
        } else if (!this.f60298d && this.f60297c != null) {
            this.j.f45077a = 4;
            this.f60300f = true;
            c();
            if (z && this.g) {
                b.a(this.f60297c);
            }
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f60295a, false, 65645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60295a, false, 65645, new Class[0], Void.TYPE);
            return;
        }
        this.i.f57422c = getPlayer();
        a();
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f60295a, false, 65651, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60295a, false, 65651, new Class[0], Void.TYPE);
            return;
        }
        this.h.setVisibility(8);
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f60295a, false, 65655, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60295a, false, 65655, new Class[0], Void.TYPE);
            return;
        }
        b shareInfo = getShareInfo();
        if (shareInfo != null && this.g) {
            shareInfo.a(this.q);
        }
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f60295a, false, 65656, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60295a, false, 65656, new Class[0], Void.TYPE);
            return;
        }
        b shareInfo = getShareInfo();
        if (shareInfo != null) {
            shareInfo.a();
        }
    }

    private o getPlayer() {
        if (PatchProxy.isSupport(new Object[0], this, f60295a, false, 65648, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], this, f60295a, false, 65648, new Class[0], o.class);
        }
        if (this.k == null) {
            this.k = j.a().b();
        }
        return this.k;
    }

    public b getShareInfo() {
        if (PatchProxy.isSupport(new Object[0], this, f60295a, false, 65658, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f60295a, false, 65658, new Class[0], b.class);
        }
        if (this.f60297c != null && this.s == null) {
            this.s = new b(this.f60297c);
        }
        return this.s;
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f60295a, false, 65652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60295a, false, 65652, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60295a, false, 65650, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60295a, false, 65650, new Class[0], Void.TYPE);
            return;
        }
        this.h.setVisibility(0);
        if (!(this.f60297c == null || this.f60297c.getVideo() == null)) {
            com.ss.android.ugc.aweme.base.c.a(this.h, this.f60297c.getVideo().getOriginCover(), this.h.getWidth(), this.h.getHeight());
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f60295a, false, 65653, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60295a, false, 65653, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.l = true;
        d(false);
        if (!(this.k == null || this.f60297c == null)) {
            g.f().b(this.f60297c);
        }
        b();
        if (this.k != null) {
            j.a().a(this.k);
            this.i.a();
            this.i.f57422c = null;
            this.k = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60295a, false, 65646, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60295a, false, 65646, new Class[0], Void.TYPE);
        } else if (this.i.k() || this.l) {
            o oVar = this.i.f57422c;
            if (oVar != null) {
                if (this.m) {
                    oVar.k();
                    return;
                }
                oVar.l();
            }
        } else {
            this.f60296b.postDelayed(new d(this), 100);
        }
    }

    public void setDisplayHeight(double d2) {
        this.p = d2;
    }

    public void setDisplayWidth(double d2) {
        this.o = d2;
    }

    public void setIsMuted(boolean z) {
        this.m = z;
    }

    public void setLogParams(Map<String, String> map) {
        this.q = map;
    }

    public void setRatio(float f2) {
        this.n = f2;
    }

    public void setStateChangeCallback(VideoViewManager.a aVar) {
        this.r = aVar;
    }

    private void g(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f60295a, false, 65654, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f60295a, false, 65654, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.a(str, this);
        }
    }

    public final void b(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f60295a, false, 65639, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f60295a, false, 65639, new Class[]{e.class}, Void.TYPE);
            return;
        }
        g("onRetryOnError");
    }

    public c(@NonNull Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[0], this, f60295a, false, 65625, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60295a, false, 65625, new Class[0], Void.TYPE);
            return;
        }
        this.f60296b = new KeepSurfaceTextureView(getContext());
        addView(this.f60296b);
        this.f60296b.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60301a;

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z;
                boolean z2 = true;
                if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f60301a, false, 65662, new Class[]{SurfaceTexture.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f60301a, false, 65662, new Class[]{SurfaceTexture.class}, Boolean.TYPE)).booleanValue();
                }
                c.this.b();
                c cVar = c.this;
                if (PatchProxy.isSupport(new Object[0], cVar, c.f60295a, false, 65626, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], cVar, c.f60295a, false, 65626, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    o b2 = o.b();
                    if (PatchProxy.isSupport(new Object[0], b2, o.f76178a, false, 88999, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], b2, o.f76178a, false, 88999, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (b2.f76182e != null) {
                        z = b2.f76182e.j();
                    } else if (b2.h == c.a.IjkHardware || b2.h == c.a.TT_HARDWARE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || !cVar.f60299e) {
                        z2 = false;
                    }
                }
                return z2 ? false : false;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60301a, false, 65660, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60301a, false, 65660, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                c.this.f60298d = false;
                c.this.f60299e = false;
                if (!(c.this.f60297c == null || c.this.f60297c.getVideo() == null)) {
                    int i3 = i;
                    int i4 = i2;
                    n.a(i, i2, c.this.f60296b, ((float) c.this.f60297c.getVideo().getHeight()) / ((float) c.this.f60297c.getVideo().getWidth()));
                    if (c.this.f60300f) {
                        c.this.a(false);
                    }
                }
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60301a, false, 65661, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60301a, false, 65661, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (!(c.this.f60297c == null || c.this.f60297c.getVideo() == null)) {
                    int i3 = i;
                    int i4 = i2;
                    n.a(i, i2, c.this.f60296b, ((float) c.this.f60297c.getVideo().getHeight()) / ((float) c.this.f60297c.getVideo().getWidth()));
                }
            }
        });
        this.h = new RemoteImageView(getContext());
        addView(this.h);
    }

    private boolean f(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f60295a, false, 65635, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f60295a, false, 65635, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f60297c == null || !TextUtils.equals(str, this.f60297c.getAid())) {
            return false;
        } else {
            return true;
        }
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f60295a, false, 65633, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f60295a, false, 65633, new Class[]{String.class}, Void.TYPE);
        } else if (f(str)) {
            g("onPausePlay");
        }
    }

    public final void e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f60295a, false, 65636, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f60295a, false, 65636, new Class[]{String.class}, Void.TYPE);
        } else if (f(str)) {
            g("onPlayCompleted");
        }
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f60295a, false, 65643, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f60295a, false, 65643, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2.what == 16) {
            a(false);
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f60295a, false, 65632, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f60295a, false, 65632, new Class[]{String.class}, Void.TYPE);
        } else if (f(str)) {
            this.f60299e = false;
            d();
            g("onResumePlay");
            this.j.f45077a = 2;
            e();
            f();
        }
    }

    public final void d(String str) {
        String str2;
        String str3;
        Map<String, String> map;
        if (PatchProxy.isSupport(new Object[]{str}, this, f60295a, false, 65634, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f60295a, false, 65634, new Class[]{String.class}, Void.TYPE);
        } else if (f(str)) {
            g("onPlayCompletedFirstTime");
            if (this.g) {
                Aweme aweme = this.f60297c;
                Map<String, String> map2 = this.q;
                if (PatchProxy.isSupport(new Object[]{aweme, map2}, null, b.f60288a, true, 65617, new Class[]{Aweme.class, Map.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme, map2}, null, b.f60288a, true, 65617, new Class[]{Aweme.class, Map.class}, Void.TYPE);
                    return;
                }
                b.a aVar = b.f60289d;
                if (PatchProxy.isSupport(new Object[]{aweme, map2}, aVar, b.a.f60294a, false, 65621, new Class[]{Aweme.class, Map.class}, Void.TYPE)) {
                    Object[] objArr = {aweme, map2};
                    Object[] objArr2 = objArr;
                    b.a aVar2 = aVar;
                    PatchProxy.accessDispatch(objArr2, aVar2, b.a.f60294a, false, 65621, new Class[]{Aweme.class, Map.class}, Void.TYPE);
                } else if (aweme != null) {
                    b.a aVar3 = aVar;
                    String a2 = aVar3.a("enter_from", map2);
                    as asVar = new as();
                    if (a2 == null) {
                        str2 = "";
                    } else {
                        str2 = a2;
                    }
                    as e2 = asVar.a(str2).f(aweme);
                    if (i.m()) {
                        str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    } else {
                        str3 = "";
                    }
                    com.ss.android.ugc.aweme.u.d a3 = e2.c(str3).a((Map<String, String>) com.ss.android.ugc.aweme.forward.e.a.b(aweme, com.ss.android.ugc.aweme.forward.e.a.a()));
                    if (map2 == null) {
                        map = new HashMap<>();
                    } else {
                        map = map2;
                    }
                    a3.a(map).e();
                    com.ss.android.ugc.aweme.app.d.c a4 = com.ss.android.ugc.aweme.app.d.c.a();
                    com.ss.android.ugc.aweme.forward.e.a.b(a4, aweme, a2);
                    com.ss.android.ugc.aweme.forward.e.a.a(a4, aweme, com.ss.android.ugc.aweme.forward.e.a.a());
                    if (i.m()) {
                        a4.a("is_auto_play", (Integer) 1);
                    }
                    if (StringsKt.equals("poi_page", a2, true)) {
                        String a5 = aVar3.a("poi_id", map2);
                        if (!TextUtils.isEmpty(a5)) {
                            a4.a("poi_id", a5);
                            String a6 = aVar3.a("poi_label_type", map2);
                            if (!TextUtils.isEmpty(a6)) {
                                a4.a("poi_type", a6);
                            }
                        }
                    }
                    a4.a("enter_from", a2);
                    r.onEvent(MobClick.obtain().setEventName("video_play").setLabelName("finish").setValue(aweme.getAid()).setJsonObject(a4.b()));
                }
            }
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60295a, false, 65637, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60295a, false, 65637, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        g("onBuffering");
    }

    public final void d(boolean z) {
        String str;
        String str2;
        Map<String, String> map;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60295a, false, 65647, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60295a, false, 65647, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f60297c != null) {
            this.i.e();
            if (PatchProxy.isSupport(new Object[0], this, f60295a, false, 65657, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60295a, false, 65657, new Class[0], Void.TYPE);
            } else {
                b shareInfo = getShareInfo();
                if (shareInfo != null && this.g) {
                    Map<String, String> map2 = this.q;
                    if (PatchProxy.isSupport(new Object[]{map2}, shareInfo, b.f60288a, false, 65613, new Class[]{Map.class}, Void.TYPE)) {
                        b bVar = shareInfo;
                        PatchProxy.accessDispatch(new Object[]{map2}, bVar, b.f60288a, false, 65613, new Class[]{Map.class}, Void.TYPE);
                    } else if (shareInfo.f60290b != -1) {
                        Aweme aweme = shareInfo.f60291c;
                        long currentTimeMillis = System.currentTimeMillis() - shareInfo.f60290b;
                        long j2 = currentTimeMillis;
                        if (PatchProxy.isSupport(new Object[]{aweme, new Long(currentTimeMillis), map2}, shareInfo, b.f60288a, false, 65615, new Class[]{Aweme.class, Long.TYPE, Map.class}, Void.TYPE)) {
                            b bVar2 = shareInfo;
                            PatchProxy.accessDispatch(new Object[]{aweme, new Long(j2), map2}, bVar2, b.f60288a, false, 65615, new Class[]{Aweme.class, Long.TYPE, Map.class}, Void.TYPE);
                        } else if (aweme != null) {
                            Intrinsics.checkExpressionValueIsNotNull(String.format("sendLeaveAutoVideoPlayPage: aid=%s, playTime=%d", Arrays.copyOf(new Object[]{aweme.getAid(), Long.valueOf(j2)}, 2)), "java.lang.String.format(format, *args)");
                            String a2 = b.f60289d.a("enter_from", map2);
                            at atVar = new at();
                            if (a2 == null) {
                                str = "";
                            } else {
                                str = a2;
                            }
                            at e2 = atVar.a(str).f(aweme);
                            if (i.m()) {
                                str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                            } else {
                                str2 = "";
                            }
                            com.ss.android.ugc.aweme.u.d a3 = e2.c(str2).a(j2).a(false).f(aa.c(aweme)).a((Map<String, String>) com.ss.android.ugc.aweme.forward.e.a.b(aweme, com.ss.android.ugc.aweme.forward.e.a.a()));
                            if (map2 == null) {
                                map = new HashMap<>();
                            } else {
                                map = map2;
                            }
                            a3.a(map).e();
                            com.ss.android.ugc.aweme.app.d.c a4 = com.ss.android.ugc.aweme.app.d.c.a().a("enter_fullscreen", (Integer) 0);
                            com.ss.android.ugc.aweme.forward.e.a.b(a4, aweme, a2);
                            com.ss.android.ugc.aweme.forward.e.a.a(a4, aweme, com.ss.android.ugc.aweme.forward.e.a.a());
                            if (i.m()) {
                                a4.a("is_auto_play", (Integer) 1);
                            }
                            if (StringsKt.equals("poi_page", a2, true)) {
                                String a5 = b.f60289d.a("poi_id", map2);
                                if (!TextUtils.isEmpty(a5)) {
                                    a4.a("poi_id", a5);
                                    String a6 = b.f60289d.a("poi_label_type", map2);
                                    if (!TextUtils.isEmpty(a6)) {
                                        a4.a("poi_type", a6);
                                    }
                                }
                            }
                            r.onEvent(MobClick.obtain().setEventName("play_time").setLabelName(a2).setValue(aweme.getAid()).setExtValueLong(j2).setJsonObject(a4.b()));
                        }
                        shareInfo.f60290b = -1;
                    }
                }
            }
            if (z && this.g) {
                Aweme aweme2 = this.f60297c;
                if (PatchProxy.isSupport(new Object[]{aweme2}, null, b.f60288a, true, 65619, new Class[]{Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme2}, null, b.f60288a, true, 65619, new Class[]{Aweme.class}, Void.TYPE);
                    return;
                }
                b.a aVar = b.f60289d;
                if (PatchProxy.isSupport(new Object[]{aweme2}, aVar, b.a.f60294a, false, 65623, new Class[]{Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme2}, aVar, b.a.f60294a, false, 65623, new Class[]{Aweme.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
                r.onEvent(MobClick.obtain().setEventName("click").setLabelName("video_pause").setValue(aweme2.getAid()));
            }
        }
    }

    public final void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f60295a, false, 65627, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f60295a, false, 65627, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.f60297c = aweme;
        b();
        this.i = new i(this.f60296b, this, null);
        this.i.a(aweme);
        if (aweme != null) {
            if (PatchProxy.isSupport(new Object[0], this, f60295a, false, 65628, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60295a, false, 65628, new Class[0], Void.TYPE);
            } else if (this.f60297c.getVideo() != null) {
                if (this.o <= 0.0d || this.p <= 0.0d) {
                    a(this.f60296b, this.f60297c.getVideo().getWidth(), this.f60297c.getVideo().getHeight());
                    a(this.h, this.f60297c.getVideo().getWidth(), this.f60297c.getVideo().getHeight());
                } else {
                    b(this.f60296b, this.f60297c.getVideo().getWidth(), this.f60297c.getVideo().getHeight());
                    b(this.h, this.f60297c.getVideo().getWidth(), this.f60297c.getVideo().getHeight());
                }
            }
        }
    }

    private void a(View view, int i2, int i3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60295a, false, 65640, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60295a, false, 65640, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int[] iArr = new int[2];
        int screenWidth = UIUtils.getScreenWidth(getContext());
        int screenHeight = UIUtils.getScreenHeight(getContext());
        float dip2Px = UIUtils.dip2Px(getContext(), 16.0f);
        float f2 = ((float) i3) / ((float) i2);
        if (AbTestManager.a().z() == 1) {
            a(i2, i3, screenWidth, screenHeight, dip2Px, f2, iArr);
        } else {
            a(screenWidth, screenHeight, dip2Px, f2, iArr);
        }
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        view2.setLayoutParams(layoutParams);
    }

    private void b(View view, int i2, int i3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60295a, false, 65641, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60295a, false, 65641, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int[] iArr = new int[2];
        float f2 = ((float) i3) / ((float) i2);
        if (AbTestManager.a().z() == 1) {
            a(i2, i3, (int) this.o, (int) this.p, 0.0f, f2, iArr);
        } else {
            a((int) this.o, (int) this.p, 0.0f, f2, iArr);
        }
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        view.setLayoutParams(layoutParams);
    }

    private void a(int i2, int i3, float f2, float f3, int[] iArr) {
        float f4;
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Float.valueOf(f3), iArr}, this, f60295a, false, 65642, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, int[].class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Float.valueOf(f3), iArr};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f60295a, false, 65642, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, int[].class}, Void.TYPE);
            return;
        }
        float f5 = 1.3333334f;
        switch (AbTestManager.a().z()) {
            case 2:
                f4 = ((float) i5) * 0.6f;
                break;
            case 3:
                f4 = ((float) i5) * 0.56f;
                break;
            case 4:
                f5 = 1.25f;
                f4 = ((float) i5) * 0.52f;
                break;
            default:
                f5 = 1.0f;
                f4 = UIUtils.dip2Px(getContext(), 400.0f);
                break;
        }
        if (f3 > f5) {
            iArr[1] = (int) f4;
            iArr[0] = (int) (((float) iArr[1]) / f5);
            int i6 = (int) ((((float) i4) * 0.85f) - f2);
            if (iArr[0] > i6) {
                iArr[0] = i6;
            }
        } else {
            iArr[0] = (int) (((float) i4) - (f2 * 2.0f));
            iArr[1] = (int) (((float) iArr[0]) * f3);
            if (((float) iArr[1]) > f4) {
                iArr[1] = (int) f4;
                iArr[0] = (int) (((float) iArr[1]) / f3);
            }
        }
    }

    private void a(int i2, int i3, int i4, int i5, float f2, float f3, int[] iArr) {
        if (i2 * 4 > i3 * 3) {
            iArr[0] = (int) (((float) i4) - (f2 * 2.0f));
            iArr[1] = (int) (((float) iArr[0]) * f3);
        } else {
            iArr[0] = (int) (((float) i4) * this.n);
            iArr[1] = (int) (((float) iArr[0]) * f3);
        }
        float f4 = (float) i5;
        if (((float) iArr[1]) > this.n * f4) {
            iArr[1] = (int) (f4 * this.n);
            iArr[0] = (int) (((float) iArr[1]) / f3);
        }
    }
}
