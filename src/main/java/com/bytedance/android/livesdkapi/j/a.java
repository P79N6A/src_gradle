package com.bytedance.android.livesdkapi.j;

import android.content.Context;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdkapi.host.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public enum a {
    LiveResource("live_engine", true, "com.ss.android.ies.live.liveresource") {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final void load(Context context, boolean z) {
            if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 15080, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, changeQuickRedirect, false, 15080, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            try {
                i iVar = (i) b.a(i.class);
                if (z) {
                    try {
                        iVar.a(0, context, a.LiveResource.getPackageName(), "agora-crypto", getClass().getClassLoader());
                        iVar.a(0, context, a.LiveResource.getPackageName(), "agora-rtc-sdk-jni", getClass().getClassLoader());
                    } catch (Throwable unused) {
                    }
                    try {
                        iVar.a(0, context, a.LiveResource.getPackageName(), "zegoliveroom", getClass().getClassLoader());
                    } catch (Throwable unused2) {
                    }
                    try {
                        iVar.a(0, context, a.LiveResource.getPackageName(), "bytertc", getClass().getClassLoader());
                    } catch (Throwable unused3) {
                    }
                    iVar.a(0, context, a.LiveResource.getPackageName(), "avframework", getClass().getClassLoader());
                    iVar.a(0, context, a.LiveResource.getPackageName(), "ies_render", getClass().getClassLoader());
                }
            } catch (Throwable unused4) {
            }
        }
    },
    LiveSDK("live_sdk", true, "com.ss.android.ies.live.sdk"),
    Player("player", false, "com.ss.android.ugc.live.player"),
    XGPlayer("player", false, "com.ss.ttm"),
    Live("liveplugin", false, "com.bytedance.android.liveplugin");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean mNeedPreload;
    private final String mPackageName;
    private final String mType;

    public void load(Context context, boolean z) {
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getType() {
        return this.mType;
    }

    public boolean isNeedPreload() {
        return this.mNeedPreload;
    }

    public boolean isInstalled() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15076, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15076, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (((i) b.a(i.class)).a(getPackageName())) {
            z = true;
        }
        return z;
    }

    public void preload() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15079, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15079, new Class[0], Void.TYPE);
            return;
        }
        ((i) b.a(i.class)).b(getPackageName());
    }

    public void checkInstall(Context context, i.a aVar) {
        Context context2 = context;
        i.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, aVar2}, this, changeQuickRedirect, false, 15077, new Class[]{Context.class, i.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aVar2}, this, changeQuickRedirect, false, 15077, new Class[]{Context.class, i.a.class}, Void.TYPE);
            return;
        }
        checkInstall(context2, "", aVar2);
    }

    public void checkInstall(Context context, String str, i.a aVar) {
        Context context2 = context;
        String str2 = str;
        i.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, str2, aVar2}, this, changeQuickRedirect, false, 15078, new Class[]{Context.class, String.class, i.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, aVar2}, this, changeQuickRedirect, false, 15078, new Class[]{Context.class, String.class, i.a.class}, Void.TYPE);
        } else if (isInstalled()) {
            if (aVar2 != null) {
                aVar2.a(getPackageName());
            }
        } else {
            ((i) b.a(i.class)).a(context2, this, str2, aVar2);
        }
    }

    private a(String str, boolean z, String str2) {
        this.mType = str;
        this.mNeedPreload = z;
        this.mPackageName = str2;
    }
}
