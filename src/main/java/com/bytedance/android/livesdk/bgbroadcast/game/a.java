package com.bytedance.android.livesdk.bgbroadcast.game;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.ugc.live.c.a.b;
import com.ss.ugc.live.c.a.d;
import com.ss.ugc.live.c.a.e;

public final class a extends com.bytedance.android.livesdk.bgbroadcast.a implements d {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f9193b;
    private static final int[][] h = {new int[]{200, 500, 800, 1}, new int[]{200, 800, 1200, 3}};

    /* renamed from: c  reason: collision with root package name */
    final Context f9194c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f9195d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    private com.ss.ugc.live.c.a.a f9196e;

    /* renamed from: f  reason: collision with root package name */
    private final Room f9197f;
    private int g = 0;

    public final void a(float f2) {
    }

    public final void d() {
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f9193b, false, 3290, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f9193b, false, 3290, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f9196e == null) {
            return false;
        } else {
            this.f9196e.a();
            return true;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9193b, false, 3291, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9193b, false, 3291, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9196e != null) {
            this.f9196e.a(false);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f9193b, false, 3292, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9193b, false, 3292, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9196e != null) {
            this.f9196e.a(true);
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f9193b, false, 3294, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9193b, false, 3294, new Class[0], Void.TYPE);
            return;
        }
        this.f9195d.post(new b(this));
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f9193b, false, 3295, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9193b, false, 3295, new Class[0], Void.TYPE);
            return;
        }
        this.f9195d.post(new c(this));
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f9193b, false, 3293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9193b, false, 3293, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9196e != null) {
            this.f9196e.d();
        }
    }

    public final void a(int i) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f9193b, false, 3296, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f9193b, false, 3296, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        String str = "";
        int i3 = BaseLoginOrRegisterActivity.o;
        switch (i) {
            case 1:
                str = "stream push failed";
                i2 = 6;
                break;
            case 2:
                str = "enter background timeout";
                i3 = 104;
                break;
            case 3:
                this.f9195d.post(new d(this));
                str = "broadcast error";
                break;
            default:
                i3 = 0;
                break;
        }
        if (i > 0) {
            this.f9195d.post(new e(this));
            com.bytedance.android.livesdk.live.a.a(false, i3, str);
            if (this.f9164a != null) {
                this.f9164a.a(i2);
            }
        }
    }

    public final boolean a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f9193b, false, 3289, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f9193b, false, 3289, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f9197f.getStreamUrl() == null || this.f9197f.getStreamUrl().a() == null || this.f9196e == null) {
            return false;
        } else {
            this.f9196e.a(this.f9197f.getStreamUrl().a());
            return true;
        }
    }

    public a(Context context, Room room) {
        this.f9194c = context;
        this.f9197f = room;
    }

    public final void a(Intent intent, boolean z) {
        int[] iArr;
        boolean z2;
        String str;
        float f2;
        Intent intent2 = intent;
        int i = 2;
        if (PatchProxy.isSupport(new Object[]{intent2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f9193b, false, 3287, new Class[]{Intent.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2, Byte.valueOf(z)}, this, f9193b, false, 3287, new Class[]{Intent.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(intent, z);
        if (this.f9196e == null) {
            f streamUrlExtraSafely = this.f9197f.getStreamUrlExtraSafely();
            if (PatchProxy.isSupport(new Object[]{streamUrlExtraSafely}, this, f9193b, false, 3288, new Class[]{f.class}, int[].class)) {
                iArr = (int[]) PatchProxy.accessDispatch(new Object[]{streamUrlExtraSafely}, this, f9193b, false, 3288, new Class[]{f.class}, int[].class);
            } else {
                int intValue = ((Integer) LiveSettingKeys.STREAM_DEFINITION_LEVEL.a()).intValue();
                iArr = (intValue <= 0 || intValue > h.length) ? new int[]{streamUrlExtraSafely.c(), streamUrlExtraSafely.d(), streamUrlExtraSafely.e(), streamUrlExtraSafely.i} : h[intValue - 1];
            }
            int intValue2 = ((Integer) LiveSettingKeys.STREAM_HARDWARE_ENCODE.a()).intValue();
            if (intValue2 <= 0) {
                z2 = streamUrlExtraSafely.j;
            } else if (intValue2 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            int b2 = streamUrlExtraSafely.b();
            int a2 = streamUrlExtraSafely.a();
            if (((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.a()).length == 2) {
                b2 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.a())[0].intValue();
                a2 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.a())[1].intValue();
            }
            if (((Boolean) LiveConfigSettingKeys.LIVE_GAME_STREAM_PROPORTION_ADAPT.a()).booleanValue()) {
                float a3 = ((float) streamUrlExtraSafely.a()) / ((float) streamUrlExtraSafely.b());
                if (ac.c() > ac.b()) {
                    f2 = ((float) ac.c()) / ((float) ac.b());
                } else {
                    f2 = ((float) ac.b()) / ((float) ac.c());
                }
                if (a3 > f2) {
                    a2 = (int) (((float) b2) * f2);
                } else if (a3 < f2) {
                    b2 = (int) (((float) a2) / f2);
                }
            }
            int i2 = a2;
            int i3 = b2;
            if (z) {
                int i4 = i2;
                i2 = i3;
                i3 = i4;
            }
            int i5 = iArr[0];
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            if (((Integer) LiveConfigSettingKeys.LIVE_STREAM_PROFILE.a()).intValue() >= 0) {
                i8 = ((Integer) LiveConfigSettingKeys.LIVE_STREAM_PROFILE.a()).intValue();
            }
            if (((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.a()).length == 3) {
                i6 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.a())[0].intValue();
                i5 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.a())[1].intValue();
                i7 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.a())[2].intValue();
            }
            e.a a4 = new e.a(this.f9194c).a(0).f(i3).g(i2).c(i5).b(i6).d(i7).h(i8).e(streamUrlExtraSafely.f()).a(z2);
            if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_ENABLE_SDK_PARAMS.a()).booleanValue()) {
                str = this.f9197f.getStreamUrl().k;
            } else {
                str = "";
            }
            e.a a5 = a4.b(str).a(2).a(ac.a((int) C0906R.string.dkc)).a((com.ss.ugc.live.c.a.a.a) new com.bytedance.android.livesdk.live.a.a.a()).a((com.ss.ugc.live.c.a.b.a) new com.bytedance.android.livesdk.live.a.b.a());
            a5.p = intent2;
            e.a j = a5.j(3);
            if (((Integer) LiveSettingKeys.LIVE_USE_NEW_AUDIO_CODEC.a()).intValue() != 1) {
                i = 1;
            }
            this.f9196e = new b(j.i(i).a());
            this.f9196e.a((d) this);
        }
    }
}
