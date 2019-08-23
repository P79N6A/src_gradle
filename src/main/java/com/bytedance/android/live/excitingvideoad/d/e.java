package com.bytedance.android.live.excitingvideoad.d;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.android.live.excitingvideoad.c.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineListener;
import com.ss.ttvideoengine.VideoInfoListener;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Iterator;

public final class e implements d.a, d, VideoEngineListener, VideoInfoListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8400a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f8401b;

    /* renamed from: c  reason: collision with root package name */
    protected TTVideoEngine f8402c;

    /* renamed from: d  reason: collision with root package name */
    protected c f8403d;

    /* renamed from: e  reason: collision with root package name */
    protected long f8404e = -1;

    /* renamed from: f  reason: collision with root package name */
    protected d f8405f = new d(this);
    public f g;
    private AudioManager h;
    private AudioManager.OnAudioFocusChangeListener i = new AudioManager.OnAudioFocusChangeListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8406a;

        public final void onAudioFocusChange(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8406a, false, 1688, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8406a, false, 1688, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if ((i == -2 || i == -1) && e.this.f()) {
                if (e.this.f8402c != null) {
                    e.this.f8402c.pauseByInterruption();
                    e.this.a();
                }
                e.this.b();
            }
        }
    };
    private long j;
    private int k;
    private boolean l;
    private ArrayList<Runnable> m = new ArrayList<>();
    private boolean n;

    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i2) {
    }

    public final boolean onFetchedVideoInfo(VideoModel videoModel) {
        return false;
    }

    public final void onPrepare(TTVideoEngine tTVideoEngine) {
    }

    public final void onPrepared(TTVideoEngine tTVideoEngine) {
    }

    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i2, int i3) {
    }

    public final void onVideoStatusException(int i2) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f8400a, false, 1666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8400a, false, 1666, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.h == null || this.i == null)) {
            this.h.abandonAudioFocus(this.i);
            this.h = null;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f8400a, false, 1669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8400a, false, 1669, new Class[0], Void.TYPE);
            return;
        }
        if (this.f8402c != null && f()) {
            this.f8402c.pause();
            this.f8405f.removeMessages(BaseLoginOrRegisterActivity.o);
            a();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f8400a, false, 1671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8400a, false, 1671, new Class[0], Void.TYPE);
            return;
        }
        if (this.f8403d != null) {
            this.f8403d.a(false);
        }
        if (this.f8402c != null) {
            this.f8402c.release();
            this.f8402c = null;
        }
    }

    public final int e() {
        if (PatchProxy.isSupport(new Object[0], this, f8400a, false, 1672, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8400a, false, 1672, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f8402c != null) {
            return this.f8402c.getCurrentPlaybackTime() / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        } else {
            return 0;
        }
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f8400a, false, 1674, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8400a, false, 1674, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f8402c == null || this.f8402c.getPlaybackState() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean g() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f8400a, false, 1676, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8400a, false, 1676, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f8402c == null) {
            return false;
        } else {
            if (this.f8402c.getPlaybackState() == 0) {
                z = true;
            }
            return z;
        }
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f8400a, false, 1686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8400a, false, 1686, new Class[0], Void.TYPE);
        } else if (!this.n && !this.m.isEmpty()) {
            this.n = true;
            Iterator it2 = new ArrayList(this.m).iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
            this.m.clear();
            this.n = false;
        }
    }

    public final void c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f8400a, false, 1670, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8400a, false, 1670, new Class[0], Void.TYPE);
            return;
        }
        if (this.f8402c != null) {
            if (PatchProxy.isSupport(new Object[0], this, f8400a, false, 1675, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8400a, false, 1675, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.f8402c != null && this.f8402c.getPlaybackState() == 2) {
                z = true;
            }
            if (z) {
                this.f8402c.play();
            }
        }
    }

    public e(c cVar) {
        if (cVar != null) {
            this.f8403d = cVar;
            this.f8403d.setVideoViewCallback(this);
            this.f8401b = this.f8403d.getApplicationContext();
            TTVideoEngineLog.turnOn(1, 1);
            return;
        }
        throw new IllegalArgumentException("IVideoView 不能为空");
    }

    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        if (PatchProxy.isSupport(new Object[]{tTVideoEngine}, this, f8400a, false, 1683, new Class[]{TTVideoEngine.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoEngine}, this, f8400a, false, 1683, new Class[]{TTVideoEngine.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.b();
        }
    }

    public final void onError(Error error) {
        if (PatchProxy.isSupport(new Object[]{error}, this, f8400a, false, 1684, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error}, this, f8400a, false, 1684, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.a(error.code, error.description);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f8400a, false, 1679, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f8400a, false, 1679, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f8402c != null) {
            this.f8402c.setIsMute(z);
        }
    }

    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        if (PatchProxy.isSupport(new Object[]{tTVideoEngine}, this, f8400a, false, 1682, new Class[]{TTVideoEngine.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoEngine}, this, f8400a, false, 1682, new Class[]{TTVideoEngine.class}, Void.TYPE);
            return;
        }
        if (this.f8403d != null) {
            this.f8403d.b();
        }
        if (this.g != null) {
            this.g.a();
        }
    }

    public final void a(Message message) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{message}, this, f8400a, false, 1664, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f8400a, false, 1664, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 101) {
            if (this.f8402c != null) {
                if (message.obj == null || !((Boolean) message.obj).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                int currentPlaybackTime = this.f8402c.getCurrentPlaybackTime();
                int duration = this.f8402c.getDuration();
                if (duration > 0 && (!z || currentPlaybackTime < 500)) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(currentPlaybackTime), Integer.valueOf(duration)}, this, f8400a, false, 1665, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(currentPlaybackTime), Integer.valueOf(duration)}, this, f8400a, false, 1665, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else if (this.g != null) {
                        this.g.a(currentPlaybackTime / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, duration / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                    }
                }
                if (f()) {
                    if (this.j == 0) {
                        this.j = System.currentTimeMillis();
                        this.k = currentPlaybackTime;
                    } else if (System.currentTimeMillis() - this.j >= 5000) {
                        this.k = currentPlaybackTime;
                        this.j = System.currentTimeMillis();
                    }
                }
            }
            if (f()) {
                this.f8405f.sendMessageDelayed(this.f8405f.obtainMessage(BaseLoginOrRegisterActivity.o), 500);
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f8400a, false, 1668, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f8400a, false, 1668, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            this.f8402c.setIsMute(true);
            if (z) {
                this.f8402c.setIntOption(4, 1);
            } else {
                this.f8402c.setIntOption(4, 0);
            }
            this.f8402c.setLooping(false);
            this.f8402c.play();
        } catch (Exception unused) {
        }
    }

    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i2) {
        if (PatchProxy.isSupport(new Object[]{tTVideoEngine, Integer.valueOf(i2)}, this, f8400a, false, 1681, new Class[]{TTVideoEngine.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoEngine, Integer.valueOf(i2)}, this, f8400a, false, 1681, new Class[]{TTVideoEngine.class, Integer.TYPE}, Void.TYPE);
        } else if (i2 == 2) {
            this.f8403d.a();
        } else {
            if (i2 == 1) {
                this.f8403d.b();
            }
        }
    }

    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i2) {
        if (PatchProxy.isSupport(new Object[]{tTVideoEngine, Integer.valueOf(i2)}, this, f8400a, false, 1680, new Class[]{TTVideoEngine.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tTVideoEngine, Integer.valueOf(i2)}, this, f8400a, false, 1680, new Class[]{TTVideoEngine.class, Integer.TYPE}, Void.TYPE);
        } else if (i2 != 3) {
            switch (i2) {
                case 0:
                    this.m.clear();
                    break;
                case 1:
                    if (this.f8405f != null) {
                        this.f8405f.sendEmptyMessage(BaseLoginOrRegisterActivity.o);
                        return;
                    }
                    break;
            }
        }
    }

    public final void a(String str, final boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f8400a, false, 1667, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f8400a, false, 1667, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            if (this.f8403d != null) {
                this.f8403d.a();
            }
            if (PatchProxy.isSupport(new Object[0], this, f8400a, false, 1677, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8400a, false, 1677, new Class[0], Void.TYPE);
            } else {
                if (this.f8402c != null) {
                    this.f8402c.release();
                }
                this.f8402c = new TTVideoEngine(this.f8401b, 0);
                this.f8402c.setListener(this);
                this.f8402c.setVideoInfoListener(this);
            }
            this.f8402c.setVideoID(str);
            this.f8402c.setDataSource(new b(str));
            this.f8402c.setStartTime(0);
            Surface surface = this.f8403d.getSurface();
            if (surface == null || !surface.isValid()) {
                this.f8403d.setSurfaceViewVisibility(8);
                this.f8403d.setSurfaceViewVisibility(0);
                AnonymousClass2 r7 = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f8408a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f8408a, false, 1689, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f8408a, false, 1689, new Class[0], Void.TYPE);
                            return;
                        }
                        e.this.a(z);
                    }
                };
                if (PatchProxy.isSupport(new Object[]{r7}, this, f8400a, false, 1687, new Class[]{Runnable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{r7}, this, f8400a, false, 1687, new Class[]{Runnable.class}, Void.TYPE);
                } else if (this.l) {
                    r7.run();
                } else {
                    this.m.add(r7);
                }
            } else {
                this.f8402c.setSurface(surface);
                a(z);
            }
        }
    }

    public final void a(SurfaceTexture surfaceTexture, int i2, int i3) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f8400a, false, 1685, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f8400a, false, 1685, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.l = true;
        Surface surface = this.f8403d.getSurface();
        if (surface == null) {
            surface = new Surface(surfaceTexture);
        }
        if (this.f8402c != null) {
            this.f8402c.setSurface(surface);
            h();
        }
    }
}
