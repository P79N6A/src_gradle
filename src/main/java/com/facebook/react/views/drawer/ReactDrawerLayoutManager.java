package com.facebook.react.views.drawer;

import android.os.Build;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.drawer.events.DrawerClosedEvent;
import com.facebook.react.views.drawer.events.DrawerOpenedEvent;
import com.facebook.react.views.drawer.events.DrawerSlideEvent;
import com.facebook.react.views.drawer.events.DrawerStateChangedEvent;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = "AndroidDrawerLayout")
public class ReactDrawerLayoutManager extends ViewGroupManager<ReactDrawerLayout> {

    public static class DrawerEventEmitter implements DrawerLayout.DrawerListener {
        private final DrawerLayout mDrawerLayout;
        private final EventDispatcher mEventDispatcher;

        public void onDrawerClosed(View view) {
            this.mEventDispatcher.dispatchEvent(new DrawerClosedEvent(this.mDrawerLayout.getId()));
        }

        public void onDrawerOpened(View view) {
            this.mEventDispatcher.dispatchEvent(new DrawerOpenedEvent(this.mDrawerLayout.getId()));
        }

        public void onDrawerStateChanged(int i) {
            this.mEventDispatcher.dispatchEvent(new DrawerStateChangedEvent(this.mDrawerLayout.getId(), i));
        }

        public DrawerEventEmitter(DrawerLayout drawerLayout, EventDispatcher eventDispatcher) {
            this.mDrawerLayout = drawerLayout;
            this.mEventDispatcher = eventDispatcher;
        }

        public void onDrawerSlide(View view, float f2) {
            this.mEventDispatcher.dispatchEvent(new DrawerSlideEvent(this.mDrawerLayout.getId(), f2));
        }
    }

    public String getName() {
        return "AndroidDrawerLayout";
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.of("openDrawer", 1, "closeDrawer", 2);
    }

    @Nullable
    public Map getExportedViewConstants() {
        return MapBuilder.of("DrawerPosition", MapBuilder.of("Left", 8388611, "Right", 8388613));
    }

    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("topDrawerSlide", MapBuilder.of("registrationName", "onDrawerSlide"), "topDrawerOpened", MapBuilder.of("registrationName", "onDrawerOpen"), "topDrawerClosed", MapBuilder.of("registrationName", "onDrawerClose"), "topDrawerStateChanged", MapBuilder.of("registrationName", "onDrawerStateChanged"));
    }

    /* access modifiers changed from: protected */
    public ReactDrawerLayout createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactDrawerLayout(themedReactContext);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(ThemedReactContext themedReactContext, ReactDrawerLayout reactDrawerLayout) {
        reactDrawerLayout.setDrawerListener(new DrawerEventEmitter(reactDrawerLayout, ((UIManagerModule) themedReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    @ReactProp(defaultFloat = Float.NaN, name = "drawerWidth")
    public void getDrawerWidth(ReactDrawerLayout reactDrawerLayout, float f2) {
        int i;
        if (Float.isNaN(f2)) {
            i = -1;
        } else {
            i = Math.round(PixelUtil.toPixelFromDIP(f2));
        }
        reactDrawerLayout.setDrawerWidth(i);
    }

    @ReactProp(name = "drawerLockMode")
    public void setDrawerLockMode(ReactDrawerLayout reactDrawerLayout, @Nullable String str) {
        if (str == null || "unlocked".equals(str)) {
            reactDrawerLayout.setDrawerLockMode(0);
        } else if ("locked-closed".equals(str)) {
            reactDrawerLayout.setDrawerLockMode(1);
        } else if ("locked-open".equals(str)) {
            reactDrawerLayout.setDrawerLockMode(2);
        } else {
            throw new JSApplicationIllegalArgumentException("Unknown drawerLockMode " + str);
        }
    }

    @ReactProp(defaultInt = 8388611, name = "drawerPosition")
    public void setDrawerPosition(ReactDrawerLayout reactDrawerLayout, int i) {
        if (8388611 == i || 8388613 == i) {
            reactDrawerLayout.setDrawerPosition(i);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Unknown drawerPosition " + i);
    }

    public void setElevation(ReactDrawerLayout reactDrawerLayout, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            Class<ReactDrawerLayout> cls = ReactDrawerLayout.class;
            try {
                cls.getMethod("setDrawerElevation", new Class[]{Float.TYPE}).invoke(reactDrawerLayout, new Object[]{Float.valueOf(PixelUtil.toPixelFromDIP(f2))});
            } catch (Exception e2) {
                FLog.w("ReactNative", "setDrawerElevation is not available in this version of the support lib.", (Throwable) e2);
            }
        }
    }

    public void receiveCommand(ReactDrawerLayout reactDrawerLayout, int i, @Nullable ReadableArray readableArray) {
        switch (i) {
            case 1:
                reactDrawerLayout.openDrawer();
                return;
            case 2:
                reactDrawerLayout.closeDrawer();
                break;
        }
    }

    public void addView(ReactDrawerLayout reactDrawerLayout, View view, int i) {
        if (getChildCount(reactDrawerLayout) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        } else if (i == 0 || i == 1) {
            reactDrawerLayout.addView(view, i);
            reactDrawerLayout.setDrawerProperties();
        } else {
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + i + " instead.");
        }
    }
}
