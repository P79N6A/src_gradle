package com.ss.android.ugc.aweme.lineargradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LinearGradientManager extends SimpleViewManager<b> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getName() {
        return "BVLinearGradient";
    }

    public b createViewInstance(ThemedReactContext themedReactContext) {
        ThemedReactContext themedReactContext2 = themedReactContext;
        if (!PatchProxy.isSupport(new Object[]{themedReactContext2}, this, changeQuickRedirect, false, 55332, new Class[]{ThemedReactContext.class}, b.class)) {
            return new b(themedReactContext2);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{themedReactContext2}, this, changeQuickRedirect, false, 55332, new Class[]{ThemedReactContext.class}, b.class);
    }

    @ReactProp(name = "borderRadii")
    public void setBorderRadii(b bVar, ReadableArray readableArray) {
        if (PatchProxy.isSupport(new Object[]{bVar, readableArray}, this, changeQuickRedirect, false, 55337, new Class[]{b.class, ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, readableArray}, this, changeQuickRedirect, false, 55337, new Class[]{b.class, ReadableArray.class}, Void.TYPE);
            return;
        }
        bVar.setBorderRadii(readableArray);
    }

    @ReactProp(name = "colors")
    public void setColors(b bVar, ReadableArray readableArray) {
        if (PatchProxy.isSupport(new Object[]{bVar, readableArray}, this, changeQuickRedirect, false, 55333, new Class[]{b.class, ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, readableArray}, this, changeQuickRedirect, false, 55333, new Class[]{b.class, ReadableArray.class}, Void.TYPE);
            return;
        }
        bVar.setColors(readableArray);
    }

    @ReactProp(name = "endPoint")
    public void setEndPosition(b bVar, ReadableArray readableArray) {
        if (PatchProxy.isSupport(new Object[]{bVar, readableArray}, this, changeQuickRedirect, false, 55336, new Class[]{b.class, ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, readableArray}, this, changeQuickRedirect, false, 55336, new Class[]{b.class, ReadableArray.class}, Void.TYPE);
            return;
        }
        bVar.setEndPosition(readableArray);
    }

    @ReactProp(name = "locations")
    public void setLocations(b bVar, ReadableArray readableArray) {
        if (PatchProxy.isSupport(new Object[]{bVar, readableArray}, this, changeQuickRedirect, false, 55334, new Class[]{b.class, ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, readableArray}, this, changeQuickRedirect, false, 55334, new Class[]{b.class, ReadableArray.class}, Void.TYPE);
            return;
        }
        if (readableArray != null) {
            bVar.setLocations(readableArray);
        }
    }

    @ReactProp(name = "startPoint")
    public void setStartPosition(b bVar, ReadableArray readableArray) {
        if (PatchProxy.isSupport(new Object[]{bVar, readableArray}, this, changeQuickRedirect, false, 55335, new Class[]{b.class, ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, readableArray}, this, changeQuickRedirect, false, 55335, new Class[]{b.class, ReadableArray.class}, Void.TYPE);
            return;
        }
        bVar.setStartPosition(readableArray);
    }
}
