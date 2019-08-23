package com.ss.android.ugc.aweme.poi.rn;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.cm;
import java.util.Map;
import javax.annotation.Nullable;

public class VideoViewManager extends SimpleViewManager<c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a mCallback = e.f60306b;

    public interface a {
        void a(String str, c cVar);
    }

    public String getName() {
        return "AwemeVideoView";
    }

    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65670, new Class[0], Map.class)) {
            return super.getExportedCustomDirectEventTypeConstants();
        }
        return (Map) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65670, new Class[0], Map.class);
    }

    @Nullable
    public Map<String, Integer> getCommandsMap() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65671, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65671, new Class[0], Map.class);
        }
        if (PatchProxy.isSupport(new Object[]{"bindAweme", 1, "play", 2, "pause", 3, "destroy", 4}, null, cm.f75691a, true, 88388, new Class[]{Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{"bindAweme", 1, "play", 2, "pause", 3, "destroy", 4}, null, cm.f75691a, true, 88388, new Class[]{Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class}, Map.class);
        }
        Map<String, Integer> a2 = cm.a();
        a2.put("bindAweme", 1);
        a2.put("play", 2);
        a2.put("pause", 3);
        a2.put("destroy", 4);
        return a2;
    }

    public c createViewInstance(ThemedReactContext themedReactContext) {
        ThemedReactContext themedReactContext2 = themedReactContext;
        if (!PatchProxy.isSupport(new Object[]{themedReactContext2}, this, changeQuickRedirect, false, 65663, new Class[]{ThemedReactContext.class}, c.class)) {
            return new c(themedReactContext2);
        }
        return (c) PatchProxy.accessDispatch(new Object[]{themedReactContext2}, this, changeQuickRedirect, false, 65663, new Class[]{ThemedReactContext.class}, c.class);
    }

    private Aweme parseAweme(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 65673, new Class[]{String.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 65673, new Class[]{String.class}, Aweme.class);
        }
        try {
            return (Aweme) new a.b(Aweme.class).a(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @ReactProp(name = "enableLog")
    public void setHeight(c cVar, boolean z) {
        try {
            cVar.g = z;
        } catch (Exception unused) {
        }
    }

    public void addEventEmitters(ThemedReactContext themedReactContext, c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{themedReactContext, cVar2}, this, changeQuickRedirect, false, 65674, new Class[]{ThemedReactContext.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{themedReactContext, cVar2}, this, changeQuickRedirect, false, 65674, new Class[]{ThemedReactContext.class, c.class}, Void.TYPE);
            return;
        }
        super.addEventEmitters(themedReactContext, cVar);
        cVar2.setStateChangeCallback(this.mCallback);
    }

    @ReactProp(name = "aweme")
    public void setAweme(c cVar, String str) {
        c cVar2 = cVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{cVar2, str2}, this, changeQuickRedirect, false, 65664, new Class[]{c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, str2}, this, changeQuickRedirect, false, 65664, new Class[]{c.class, String.class}, Void.TYPE);
            return;
        }
        try {
            cVar2.a(parseAweme(str2));
        } catch (Exception unused) {
        }
    }

    @ReactProp(name = "wrapperHeight")
    public void setHeight(c cVar, double d2) {
        if (PatchProxy.isSupport(new Object[]{cVar, Double.valueOf(d2)}, this, changeQuickRedirect, false, 65668, new Class[]{c.class, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Double.valueOf(d2)}, this, changeQuickRedirect, false, 65668, new Class[]{c.class, Double.TYPE}, Void.TYPE);
            return;
        }
        try {
            cVar.setDisplayHeight(d2);
        } catch (Exception unused) {
        }
    }

    @ReactProp(name = "isMuted")
    public void setIsMuted(c cVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{cVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 65666, new Class[]{c.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 65666, new Class[]{c.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            cVar.setIsMuted(z);
        } catch (Exception unused) {
        }
    }

    @ReactProp(name = "logEventMap")
    public void setLogParams(c cVar, String str) {
        c cVar2 = cVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{cVar2, str2}, this, changeQuickRedirect, false, 65669, new Class[]{c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, str2}, this, changeQuickRedirect, false, 65669, new Class[]{c.class, String.class}, Void.TYPE);
            return;
        }
        try {
            try {
                cVar2.setLogParams((Map) new Gson().fromJson(str2, new TypeToken<Map<String, String>>() {
                }.getType()));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }

    @ReactProp(name = "ratio")
    public void setRatio(c cVar, double d2) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, Double.valueOf(d2)}, this, changeQuickRedirect, false, 65665, new Class[]{c.class, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, Double.valueOf(d2)}, this, changeQuickRedirect, false, 65665, new Class[]{c.class, Double.TYPE}, Void.TYPE);
            return;
        }
        try {
            cVar2.setRatio((float) d2);
        } catch (Exception unused) {
        }
    }

    @ReactProp(name = "wrapperWidth")
    public void setWidth(c cVar, double d2) {
        if (PatchProxy.isSupport(new Object[]{cVar, Double.valueOf(d2)}, this, changeQuickRedirect, false, 65667, new Class[]{c.class, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Double.valueOf(d2)}, this, changeQuickRedirect, false, 65667, new Class[]{c.class, Double.TYPE}, Void.TYPE);
            return;
        }
        try {
            cVar.setDisplayWidth(d2);
        } catch (Exception unused) {
        }
    }

    public void receiveCommand(c cVar, int i, @Nullable ReadableArray readableArray) {
        c cVar2 = cVar;
        ReadableArray readableArray2 = readableArray;
        if (PatchProxy.isSupport(new Object[]{cVar2, Integer.valueOf(i), readableArray2}, this, changeQuickRedirect, false, 65672, new Class[]{c.class, Integer.TYPE, ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, Integer.valueOf(i), readableArray2}, this, changeQuickRedirect, false, 65672, new Class[]{c.class, Integer.TYPE, ReadableArray.class}, Void.TYPE);
            return;
        }
        switch (i) {
            case 1:
                if (readableArray2 != null) {
                    try {
                        cVar2.a(parseAweme(readableArray2.getString(0)));
                        cVar2.a(false);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 2:
                cVar2.a(true);
                return;
            case 3:
                cVar2.d(true);
                return;
            case 4:
                if (!PatchProxy.isSupport(new Object[0], cVar, c.f60295a, false, 65649, new Class[0], Void.TYPE)) {
                    cVar2.d(false);
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[0], cVar, c.f60295a, false, 65649, new Class[0], Void.TYPE);
                    return;
                }
        }
    }
}
