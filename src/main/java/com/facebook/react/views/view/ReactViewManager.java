package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.yoga.a;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = "RCTView")
public class ReactViewManager extends ViewGroupManager<ReactViewGroup> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};

    public String getName() {
        return "RCTView";
    }

    @ReactProp(name = "collapsable")
    public void setCollapsable(ReactViewGroup reactViewGroup, boolean z) {
    }

    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.of("hotspotUpdate", 1, "setPressed", 2);
    }

    public ReactViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactViewGroup(themedReactContext);
    }

    public int getUnmarkedChildCount(ReactViewGroup reactViewGroup) {
        if (reactViewGroup.getRemoveClippedSubviews()) {
            return reactViewGroup.getAllChildrenCount();
        }
        return reactViewGroup.getChildCount();
    }

    public int getChildCount(ReactViewGroup reactViewGroup) {
        if (reactViewGroup.getRemoveClippedSubviews()) {
            return reactViewGroup.getAllChildrenCount();
        }
        if (reactViewGroup.mMarkedChildCount == -1) {
            return reactViewGroup.getChildCount();
        }
        return reactViewGroup.getChildCount() - reactViewGroup.mMarkedChildCount;
    }

    public void removeAllViews(ReactViewGroup reactViewGroup) {
        if (reactViewGroup.getRemoveClippedSubviews()) {
            reactViewGroup.removeAllViewsWithSubviewClippingEnabled();
            return;
        }
        if (reactViewGroup.mMarkedChildCount != -1) {
            reactViewGroup.mMarkedChildCount = 0;
            reactViewGroup.mDeleteMark.clear();
        }
        reactViewGroup.removeAllViews();
    }

    @ReactProp(name = "accessible")
    public void setAccessible(ReactViewGroup reactViewGroup, boolean z) {
        reactViewGroup.setFocusable(z);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(ReactViewGroup reactViewGroup, @Nullable String str) {
        reactViewGroup.setBorderStyle(str);
    }

    @ReactProp(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(ReactViewGroup reactViewGroup, boolean z) {
        reactViewGroup.setNeedsOffscreenAlphaCompositing(z);
    }

    @ReactProp(name = "overflow")
    public void setOverflow(ReactViewGroup reactViewGroup, String str) {
        reactViewGroup.setOverflow(str);
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(ReactViewGroup reactViewGroup, boolean z) {
        reactViewGroup.setRemoveClippedSubviews(z);
    }

    public View getUnmarkedChildAt(ReactViewGroup reactViewGroup, int i) {
        if (reactViewGroup.getRemoveClippedSubviews()) {
            return reactViewGroup.getChildAtWithSubviewClippingEnabled(i);
        }
        return reactViewGroup.getChildAt(i);
    }

    @ReactProp(name = "nativeBackgroundAndroid")
    public void setNativeBackground(ReactViewGroup reactViewGroup, @Nullable ReadableMap readableMap) {
        Drawable drawable;
        if (readableMap == null) {
            drawable = null;
        } else {
            drawable = ReactDrawableHelper.createDrawableFromJSDescription(reactViewGroup.getContext(), readableMap);
        }
        reactViewGroup.setTranslucentBackgroundDrawable(drawable);
    }

    @ReactProp(name = "nativeForegroundAndroid")
    @TargetApi(23)
    public void setNativeForeground(ReactViewGroup reactViewGroup, @Nullable ReadableMap readableMap) {
        Drawable drawable;
        if (readableMap == null) {
            drawable = null;
        } else {
            drawable = ReactDrawableHelper.createDrawableFromJSDescription(reactViewGroup.getContext(), readableMap);
        }
        reactViewGroup.setForeground(drawable);
    }

    @ReactProp(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(ReactViewGroup reactViewGroup, boolean z) {
        if (z) {
            reactViewGroup.setFocusable(true);
            reactViewGroup.setFocusableInTouchMode(true);
            reactViewGroup.requestFocus();
        }
    }

    public View getChildAt(ReactViewGroup reactViewGroup, int i) {
        if (reactViewGroup.getRemoveClippedSubviews()) {
            return reactViewGroup.getChildAtWithSubviewClippingEnabled(i);
        }
        if (reactViewGroup.mMarkedChildCount == -1) {
            return reactViewGroup.getChildAt(i);
        }
        return reactViewGroup.getChildAt(i + getPrefixMarkedViewCount(reactViewGroup, i));
    }

    @ReactProp(name = "pointerEvents")
    public void setPointerEvents(ReactViewGroup reactViewGroup, @Nullable String str) {
        if (str == null) {
            reactViewGroup.setPointerEvents(PointerEvents.AUTO);
        } else {
            reactViewGroup.setPointerEvents(PointerEvents.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
        }
    }

    private int getPrefixMarkedViewCount(ReactViewGroup reactViewGroup, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < reactViewGroup.mDeleteMark.size() && i2 <= i + i3) {
            if (reactViewGroup.mDeleteMark.get(i2).equals(1)) {
                i3++;
            }
            i2++;
        }
        return i3;
    }

    public void markView(ReactViewGroup reactViewGroup, int i) {
        if (reactViewGroup.mMarkedChildCount == -1) {
            reactViewGroup.mMarkedChildCount = 0;
            reactViewGroup.mDeleteMark = new ArrayList<>();
            for (int i2 = 0; i2 < reactViewGroup.getChildCount(); i2++) {
                reactViewGroup.mDeleteMark.add(i2, 0);
            }
        }
        reactViewGroup.mMarkedChildCount++;
        reactViewGroup.mDeleteMark.set(i + getPrefixMarkedViewCount(reactViewGroup, i), 1);
    }

    public void removeViewAt(ReactViewGroup reactViewGroup, int i) {
        if (reactViewGroup.getRemoveClippedSubviews()) {
            View childAt = getChildAt(reactViewGroup, i);
            if (childAt.getParent() != null) {
                reactViewGroup.removeView(childAt);
            }
            reactViewGroup.removeViewWithSubviewClippingEnabled(childAt);
            return;
        }
        if (reactViewGroup.mMarkedChildCount != -1) {
            if (reactViewGroup.mDeleteMark.get(i).equals(1)) {
                reactViewGroup.mMarkedChildCount--;
            }
            reactViewGroup.mDeleteMark.remove(i);
        }
        reactViewGroup.removeViewAt(i);
    }

    @ReactProp(name = "hitSlop")
    public void setHitSlop(ReactViewGroup reactViewGroup, @Nullable ReadableMap readableMap) {
        int i;
        int i2;
        int i3;
        if (readableMap == null) {
            reactViewGroup.setHitSlopRect(null);
            return;
        }
        int i4 = 0;
        if (readableMap.hasKey("left")) {
            i = (int) PixelUtil.toPixelFromDIP(readableMap.getDouble("left"));
        } else {
            i = 0;
        }
        if (readableMap.hasKey("top")) {
            i2 = (int) PixelUtil.toPixelFromDIP(readableMap.getDouble("top"));
        } else {
            i2 = 0;
        }
        if (readableMap.hasKey("right")) {
            i3 = (int) PixelUtil.toPixelFromDIP(readableMap.getDouble("right"));
        } else {
            i3 = 0;
        }
        if (readableMap.hasKey("bottom")) {
            i4 = (int) PixelUtil.toPixelFromDIP(readableMap.getDouble("bottom"));
        }
        reactViewGroup.setHitSlopRect(new Rect(i, i2, i3, i4));
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(ReactViewGroup reactViewGroup, int i, float f2) {
        if (!a.a(f2) && f2 < 0.0f) {
            f2 = 1.0E21f;
        }
        if (!a.a(f2)) {
            f2 = PixelUtil.toPixelFromDIP(f2);
        }
        reactViewGroup.setBorderWidth(SPACING_TYPES[i], f2);
    }

    public void addView(ReactViewGroup reactViewGroup, View view, int i) {
        if (reactViewGroup.getRemoveClippedSubviews()) {
            reactViewGroup.addViewWithSubviewClippingEnabled(view, i);
        } else if (reactViewGroup.mMarkedChildCount == -1) {
            reactViewGroup.addView(view, i);
        } else {
            int prefixMarkedViewCount = i + getPrefixMarkedViewCount(reactViewGroup, i);
            reactViewGroup.mDeleteMark.add(prefixMarkedViewCount, 0);
            reactViewGroup.addView(view, prefixMarkedViewCount);
        }
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor"})
    public void setBorderColor(ReactViewGroup reactViewGroup, int i, Integer num) {
        float f2;
        float f3 = 1.0E21f;
        if (num == null) {
            f2 = 1.0E21f;
        } else {
            f2 = (float) (num.intValue() & 16777215);
        }
        if (num != null) {
            f3 = (float) (num.intValue() >>> 24);
        }
        reactViewGroup.setBorderColor(SPACING_TYPES[i], f2, f3);
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius"})
    public void setBorderRadius(ReactViewGroup reactViewGroup, int i, float f2) {
        if (!a.a(f2) && f2 < 0.0f) {
            f2 = 1.0E21f;
        }
        if (!a.a(f2)) {
            f2 = PixelUtil.toPixelFromDIP(f2);
        }
        if (i == 0) {
            reactViewGroup.setBorderRadius(f2);
        } else {
            reactViewGroup.setBorderRadius(f2, i - 1);
        }
    }

    public void receiveCommand(ReactViewGroup reactViewGroup, int i, @Nullable ReadableArray readableArray) {
        switch (i) {
            case 1:
                if (readableArray == null || readableArray.size() != 2) {
                    throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
                } else if (Build.VERSION.SDK_INT >= 21) {
                    reactViewGroup.drawableHotspotChanged(PixelUtil.toPixelFromDIP(readableArray.getDouble(0)), PixelUtil.toPixelFromDIP(readableArray.getDouble(1)));
                    return;
                }
                break;
            case 2:
                if (readableArray != null && readableArray.size() == 1) {
                    reactViewGroup.setPressed(readableArray.getBoolean(0));
                    break;
                } else {
                    throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
                }
                break;
        }
    }
}
