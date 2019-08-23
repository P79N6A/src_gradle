package com.facebook.react.views.viewpager;

import android.view.View;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = "AndroidViewPager")
public class ReactViewPagerManager extends ViewGroupManager<ReactViewPager> {
    public String getName() {
        return "AndroidViewPager";
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.of("setPage", 1, "setPageWithoutAnimation", 2);
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("topPageScroll", MapBuilder.of("registrationName", "onPageScroll"), "topPageScrollStateChanged", MapBuilder.of("registrationName", "onPageScrollStateChanged"), "topPageSelected", MapBuilder.of("registrationName", "onPageSelected"));
    }

    /* access modifiers changed from: protected */
    public ReactViewPager createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactViewPager(themedReactContext);
    }

    public int getChildCount(ReactViewPager reactViewPager) {
        return reactViewPager.getViewCountInAdapter();
    }

    public void removeViewAt(ReactViewPager reactViewPager, int i) {
        reactViewPager.removeViewFromAdapter(i);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactViewPager reactViewPager, boolean z) {
        reactViewPager.setScrollEnabled(z);
    }

    @ReactProp(defaultBoolean = false, name = "peekEnabled")
    public void setPeekEnabled(ReactViewPager reactViewPager, boolean z) {
        reactViewPager.setClipToPadding(!z);
    }

    public View getChildAt(ReactViewPager reactViewPager, int i) {
        return reactViewPager.getViewFromAdapter(i);
    }

    @ReactProp(defaultFloat = 0.0f, name = "pageMargin")
    public void setPageMargin(ReactViewPager reactViewPager, float f2) {
        reactViewPager.setPageMargin((int) PixelUtil.toPixelFromDIP(f2));
    }

    public void addView(ReactViewPager reactViewPager, View view, int i) {
        reactViewPager.addViewToAdapter(view, i);
    }

    public void receiveCommand(ReactViewPager reactViewPager, int i, @Nullable ReadableArray readableArray) {
        a.b(reactViewPager);
        a.b(readableArray);
        switch (i) {
            case 1:
                reactViewPager.setCurrentItemFromJs(readableArray.getInt(0), true);
                return;
            case 2:
                reactViewPager.setCurrentItemFromJs(readableArray.getInt(0), false);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", new Object[]{Integer.valueOf(i), getClass().getSimpleName()}));
        }
    }
}
