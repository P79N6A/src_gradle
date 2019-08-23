package com.bytedance.android.livesdk.player;

import android.graphics.Point;
import android.media.AudioManager;
import android.net.Uri;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.player.ITTLivePlayer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.c.a.b.d;
import com.ss.c.a.c;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

public final class j implements ITTLivePlayer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16825a;

    /* renamed from: e  reason: collision with root package name */
    private static final SparseIntArray f16826e;

    /* renamed from: b  reason: collision with root package name */
    c f16827b;

    /* renamed from: c  reason: collision with root package name */
    l f16828c;

    /* renamed from: d  reason: collision with root package name */
    ITTLivePlayer.a f16829d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f16826e = sparseIntArray;
        sparseIntArray.put(0, 0);
        f16826e.put(1, 1);
        f16826e.put(2, 2);
        f16826e.put(3, 3);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16825a, false, 12731, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16825a, false, 12731, new Class[0], Void.TYPE);
            return;
        }
        this.f16827b.e();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f16825a, false, 12736, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16825a, false, 12736, new Class[0], Void.TYPE);
            return;
        }
        this.f16827b.c();
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f16825a, false, 12743, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16825a, false, 12743, new Class[0], Boolean.TYPE)).booleanValue();
        }
        c cVar = this.f16827b;
        if (cVar.i == null || !cVar.i.isPlaying()) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f16825a, false, 12744, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16825a, false, 12744, new Class[0], Boolean.TYPE)).booleanValue();
        }
        c cVar = this.f16827b;
        if (cVar.i == null || !cVar.i.isOSPlayer()) {
            return false;
        }
        return true;
    }

    public final JSONObject i() {
        if (PatchProxy.isSupport(new Object[0], this, f16825a, false, 12748, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f16825a, false, 12748, new Class[0], JSONObject.class);
        }
        c cVar = this.f16827b;
        if (cVar.f78306c == null) {
            return null;
        }
        return cVar.f78306c.e();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f16825a, false, 12738, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16825a, false, 12738, new Class[0], Void.TYPE);
            return;
        }
        c cVar = this.f16827b;
        cVar.e("release");
        if (cVar.n != c.b.STOPPED) {
            cVar.c();
            cVar.f78306c.c("release");
        }
        cVar.f78304a.shutdown();
        cVar.f78305b.removeCallbacksAndMessages(null);
        if (cVar.i != null) {
            cVar.i.prevClose();
            cVar.i.release();
            cVar.i = null;
            cVar.f78306c.d();
            cVar.m = c.l.IDLE;
            cVar.n = c.b.IDLE;
        }
    }

    public final Point h() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f16825a, false, 12745, new Class[0], Point.class)) {
            return (Point) PatchProxy.accessDispatch(new Object[0], this, f16825a, false, 12745, new Class[0], Point.class);
        }
        c cVar = this.f16827b;
        if (cVar.i != null) {
            i = cVar.i.getVideoWidth();
        } else {
            i = 0;
        }
        c cVar2 = this.f16827b;
        if (cVar2.i != null) {
            i2 = cVar2.i.getVideoHeight();
        }
        return new Point(i, i2);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f16825a, false, 12733, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16825a, false, 12733, new Class[0], Void.TYPE);
            return;
        }
        this.f16827b.a(2, 0);
        this.f16827b.b();
        if (((Boolean) LiveSettingKeys.LIVE_NET_ADAPTIVE_ENABLE.a()).booleanValue()) {
            this.f16827b.a(18, 0);
            this.f16827b.a(19, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_SPEED.a()).floatValue());
            this.f16827b.a(17, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_TIME.a()).intValue());
            this.f16827b.a(20, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_SPEED.a()).floatValue());
            this.f16827b.a(21, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_TIME.a()).intValue());
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H264_ENABLE.a()).intValue() == 1) {
            this.f16827b.a(35, 1);
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H265_ENABLE.a()).intValue() == 1) {
            this.f16827b.a(36, 1);
        }
        this.f16827b.a(9, 2);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f16825a, false, 12734, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16825a, false, 12734, new Class[0], Void.TYPE);
            return;
        }
        this.f16827b.b();
        if (((Boolean) LiveSettingKeys.LIVE_NET_ADAPTIVE_ENABLE.a()).booleanValue()) {
            this.f16827b.a(18, 0);
            this.f16827b.a(19, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_SPEED.a()).floatValue());
            this.f16827b.a(17, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_TIME.a()).intValue());
            this.f16827b.a(20, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_SPEED.a()).floatValue());
            this.f16827b.a(21, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_TIME.a()).intValue());
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H264_ENABLE.a()).intValue() == 1) {
            this.f16827b.a(35, 1);
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H265_ENABLE.a()).intValue() == 1) {
            this.f16827b.a(36, 1);
        }
        this.f16827b.a(9, 2);
    }

    public final void a(ITTLivePlayer.a aVar) {
        if (this.f16828c != null) {
            this.f16828c.f16837b = aVar;
        } else {
            this.f16829d = aVar;
        }
    }

    public j(k kVar) {
        this.f16827b = kVar.f16835f;
        this.f16828c = kVar.g;
        if (this.f16829d != null) {
            this.f16828c.f16837b = this.f16829d;
            this.f16829d = null;
        }
    }

    public final void a(Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, f16825a, false, 12740, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, f16825a, false, 12740, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        c cVar = this.f16827b;
        cVar.e("setSurface");
        cVar.l = surface2;
        if (cVar.i != null) {
            cVar.i.setSurface(surface2);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f16825a, false, 12750, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f16825a, false, 12750, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f16827b.a(z);
    }

    public final void a(SurfaceHolder surfaceHolder) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f16825a, false, 12741, new Class[]{SurfaceHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f16825a, false, 12741, new Class[]{SurfaceHolder.class}, Void.TYPE);
            return;
        }
        c cVar = this.f16827b;
        cVar.e("setSurfaceHolder");
        cVar.k = null;
        if (cVar.i != null) {
            cVar.i.setDisplay(null);
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f16825a, false, 12751, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f16825a, false, 12751, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f16827b.b(str2);
    }

    public final void a(boolean z) {
        float f2;
        float f3;
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f16825a, false, 12739, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f16825a, false, 12739, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        c cVar = this.f16827b;
        Boolean valueOf = Boolean.valueOf(z);
        com.ss.c.a.d.c cVar2 = cVar.g;
        boolean booleanValue = valueOf.booleanValue();
        if (cVar2.f78376b != null) {
            if (cVar2.f78376b.isOSPlayer()) {
                if (cVar2.f78375a == null) {
                    f2 = 0.0f;
                } else {
                    AudioManager audioManager = (AudioManager) cVar2.f78375a.getSystemService("audio");
                    if (audioManager != null) {
                        i2 = audioManager.getStreamMaxVolume(3);
                    } else {
                        i2 = 0;
                    }
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    f2 = (float) i2;
                }
                if (f2 > 0.0f) {
                    if (cVar2.f78375a == null) {
                        f3 = 0.0f;
                    } else {
                        AudioManager audioManager2 = (AudioManager) cVar2.f78375a.getSystemService("audio");
                        if (audioManager2 != null) {
                            i = audioManager2.getStreamVolume(3);
                        } else {
                            i = 0;
                        }
                        if (i < 0) {
                            i = 0;
                        }
                        f3 = (float) i;
                    }
                    cVar2.f78377c = f3 / f2;
                }
                if (booleanValue) {
                    cVar2.f78376b.setVolume(0.0f, 0.0f);
                } else {
                    cVar2.f78376b.setVolume(cVar2.f78377c, cVar2.f78377c);
                }
            } else {
                cVar2.f78376b.setIsMute(booleanValue);
            }
        }
    }

    public final void a(String str, Map<String, String> map, ITTLivePlayer.c cVar) throws IOException {
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2, cVar}, this, f16825a, false, 12732, new Class[]{String.class, Map.class, ITTLivePlayer.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map2, cVar}, this, f16825a, false, 12732, new Class[]{String.class, Map.class, ITTLivePlayer.c.class}, Void.TYPE);
        } else if (str.indexOf("://") <= 0) {
            this.f16827b.a(Uri.parse("file://" + str).toString());
        } else {
            c cVar2 = this.f16827b;
            cVar2.e("setPlayURLS");
            cVar2.h.a(new d[]{new d(Uri.parse(str).toString(), null, map2.get("sdk_params"))});
            if (!(cVar2.u == null || cVar2.h.a().f78301a == cVar2.u)) {
                cVar2.c("setPlayURLs");
            }
        }
    }
}
