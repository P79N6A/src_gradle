package com.bytedance.android.livesdk;

import android.content.Context;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.android.livesdkapi.j.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14622a;

    /* renamed from: c  reason: collision with root package name */
    private static g f14623c;

    /* renamed from: b  reason: collision with root package name */
    public Context f14624b = ac.e();

    /* renamed from: d  reason: collision with root package name */
    private boolean f14625d;

    private g() {
    }

    public static g a() {
        if (PatchProxy.isSupport(new Object[0], null, f14622a, true, 2530, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], null, f14622a, true, 2530, new Class[0], g.class);
        }
        if (f14623c == null) {
            synchronized (g.class) {
                if (f14623c == null) {
                    f14623c = new g();
                }
            }
        }
        return f14623c;
    }

    public final Observable<Integer> c() {
        if (!PatchProxy.isSupport(new Object[0], this, f14622a, false, 2532, new Class[0], Observable.class)) {
            return Observable.just(1);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[0], this, f14622a, false, 2532, new Class[0], Observable.class);
    }

    public final void b() {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f14622a, false, 2531, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14622a, false, 2531, new Class[0], Void.TYPE);
        } else if (!this.f14625d) {
            if (TTLiveSDKContext.getHostService().e() != null) {
                TTLiveSDKContext.getHostService().e();
                TTLiveSDKContext.getHostService().e().b(a.LiveResource.getPackageName());
            }
            if (PatchProxy.isSupport(new Object[0], this, f14622a, false, 2533, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14622a, false, 2533, new Class[0], Void.TYPE);
            } else {
                s.INST.loadResources();
                String[] strArr = {"yuv", "NailSLAM_jni", "ttffmpeg", "effect", "avframework", "ies_render", "agora-crypto", "zegoliveroom", "agora-rtc-sdk-jni"};
                i e2 = TTLiveSDKContext.getHostService().e();
                for (int i = 0; i < 9; i++) {
                    try {
                        String a2 = e2.a();
                        e2.a(2, this.f14624b, a2, strArr[i], getClass().getClassLoader());
                    } catch (Throwable unused) {
                    }
                }
            }
            c();
            try {
                a aVar = a.LiveResource;
                Context context = this.f14624b;
                if (com.bytedance.android.live.uikit.a.a.f() || com.bytedance.android.live.uikit.a.a.j()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                aVar.load(context, z2);
            } catch (Throwable unused2) {
            }
            if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.f()) {
                if (PatchProxy.isSupport(new Object[0], this, f14622a, false, 2534, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14622a, false, 2534, new Class[0], Void.TYPE);
                } else {
                    try {
                        Class<?> cls = Class.forName("io.agora.rtc.internal.RtcEngineImpl");
                        Method declaredMethod = cls.getDeclaredMethod("nativeClassInit", new Class[0]);
                        declaredMethod.setAccessible(true);
                        Field declaredField = cls.getDeclaredField("sLibLoaded");
                        declaredField.setAccessible(true);
                        if (!declaredField.getBoolean(cls)) {
                            if (((Integer) declaredMethod.invoke(null, new Object[0])).intValue() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            declaredField.set(null, Boolean.valueOf(z));
                            declaredMethod.setAccessible(false);
                            declaredField.setAccessible(false);
                        }
                    } catch (Exception unused3) {
                    }
                }
            }
            this.f14625d = true;
        }
    }
}
