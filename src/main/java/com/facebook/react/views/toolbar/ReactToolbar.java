package com.facebook.react.views.toolbar;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.DraweeHolder;
import com.facebook.drawee.view.MultiDraweeHolder;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.image.d;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.bytex.a.a.a;
import javax.annotation.Nullable;

public class ReactToolbar extends Toolbar {
    private final MultiDraweeHolder<GenericDraweeHierarchy> mActionsHolder = new MultiDraweeHolder<>();
    private final Runnable mLayoutRunnable = new Runnable() {
        public void run() {
            ReactToolbar.this.measure(View.MeasureSpec.makeMeasureSpec(ReactToolbar.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ReactToolbar.this.getHeight(), 1073741824));
            ReactToolbar.this.layout(ReactToolbar.this.getLeft(), ReactToolbar.this.getTop(), ReactToolbar.this.getRight(), ReactToolbar.this.getBottom());
        }
    };
    private IconControllerListener mLogoControllerListener;
    private final DraweeHolder mLogoHolder;
    private IconControllerListener mNavIconControllerListener;
    private final DraweeHolder mNavIconHolder;
    private IconControllerListener mOverflowIconControllerListener;
    private final DraweeHolder mOverflowIconHolder;

    class ActionIconControllerListener extends IconControllerListener {
        private final MenuItem mItem;

        /* access modifiers changed from: protected */
        public void setDrawable(Drawable drawable) {
            this.mItem.setIcon(drawable);
            ReactToolbar.this.requestLayout();
        }

        ActionIconControllerListener(MenuItem menuItem, DraweeHolder draweeHolder) {
            super(draweeHolder);
            this.mItem = menuItem;
        }
    }

    abstract class IconControllerListener extends BaseControllerListener<ImageInfo> {
        private final DraweeHolder mHolder;
        private IconImageInfo mIconImageInfo;

        /* access modifiers changed from: protected */
        public abstract void setDrawable(Drawable drawable);

        public void setIconImageInfo(IconImageInfo iconImageInfo) {
            this.mIconImageInfo = iconImageInfo;
        }

        public IconControllerListener(DraweeHolder draweeHolder) {
            this.mHolder = draweeHolder;
        }

        public void onFinalImageSet(String str, @Nullable ImageInfo imageInfo, @Nullable Animatable animatable) {
            super.onFinalImageSet(str, imageInfo, animatable);
            if (this.mIconImageInfo != null) {
                imageInfo = this.mIconImageInfo;
            }
            setDrawable(new DrawableWithIntrinsicSize(this.mHolder.getTopLevelDrawable(), imageInfo));
        }
    }

    static class IconImageInfo implements ImageInfo {
        private int mHeight;
        private int mWidth;

        public d getQualityInfo() {
            return null;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public IconImageInfo(int i, int i2) {
            this.mWidth = i;
            this.mHeight = i2;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        attachDraweeHolders();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        detachDraweeHolders();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        attachDraweeHolders();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        detachDraweeHolders();
    }

    public void requestLayout() {
        super.requestLayout();
        post(this.mLayoutRunnable);
    }

    private void attachDraweeHolders() {
        this.mLogoHolder.onAttach();
        this.mNavIconHolder.onAttach();
        this.mOverflowIconHolder.onAttach();
        this.mActionsHolder.onAttach();
    }

    private GenericDraweeHierarchy createDraweeHierarchy() {
        return new GenericDraweeHierarchyBuilder(getResources()).setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER).setFadeDuration(0).build();
    }

    private void detachDraweeHolders() {
        this.mLogoHolder.onDetach();
        this.mNavIconHolder.onDetach();
        this.mOverflowIconHolder.onDetach();
        this.mActionsHolder.onDetach();
    }

    /* access modifiers changed from: package-private */
    public void setLogoSource(@Nullable ReadableMap readableMap) {
        setIconSource(readableMap, this.mLogoControllerListener, this.mLogoHolder);
    }

    /* access modifiers changed from: package-private */
    public void setNavIconSource(@Nullable ReadableMap readableMap) {
        setIconSource(readableMap, this.mNavIconControllerListener, this.mNavIconHolder);
    }

    /* access modifiers changed from: package-private */
    public void setOverflowIconSource(@Nullable ReadableMap readableMap) {
        setIconSource(readableMap, this.mOverflowIconControllerListener, this.mOverflowIconHolder);
    }

    private Drawable getDrawableByName(String str) {
        if (getDrawableResourceByName(str) != 0) {
            return a.a(getResources(), getDrawableResourceByName(str));
        }
        return null;
    }

    private int getDrawableResourceByName(String str) {
        return getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    private IconImageInfo getIconImageInfo(ReadableMap readableMap) {
        if (!readableMap.hasKey("width") || !readableMap.hasKey("height")) {
            return null;
        }
        return new IconImageInfo(Math.round(PixelUtil.toPixelFromDIP((float) readableMap.getInt("width"))), Math.round(PixelUtil.toPixelFromDIP((float) readableMap.getInt("height"))));
    }

    public ReactToolbar(Context context) {
        super(context);
        this.mLogoHolder = DraweeHolder.create(createDraweeHierarchy(), context);
        this.mNavIconHolder = DraweeHolder.create(createDraweeHierarchy(), context);
        this.mOverflowIconHolder = DraweeHolder.create(createDraweeHierarchy(), context);
        this.mLogoControllerListener = new IconControllerListener(this.mLogoHolder) {
            /* access modifiers changed from: protected */
            public void setDrawable(Drawable drawable) {
                ReactToolbar.this.setLogo(drawable);
            }
        };
        this.mNavIconControllerListener = new IconControllerListener(this.mNavIconHolder) {
            /* access modifiers changed from: protected */
            public void setDrawable(Drawable drawable) {
                ReactToolbar.this.setNavigationIcon(drawable);
            }
        };
        this.mOverflowIconControllerListener = new IconControllerListener(this.mOverflowIconHolder) {
            /* access modifiers changed from: protected */
            public void setDrawable(Drawable drawable) {
                ReactToolbar.this.setOverflowIcon(drawable);
            }
        };
    }

    /* access modifiers changed from: package-private */
    public void setActions(@Nullable ReadableArray readableArray) {
        int i;
        Menu menu = getMenu();
        menu.clear();
        this.mActionsHolder.clear();
        if (readableArray != null) {
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                ReadableMap map = readableArray.getMap(i2);
                MenuItem add = menu.add(0, 0, i2, map.getString(PushConstants.TITLE));
                if (map.hasKey("icon")) {
                    setMenuItemIcon(add, map.getMap("icon"));
                }
                if (map.hasKey("show")) {
                    i = map.getInt("show");
                } else {
                    i = 0;
                }
                if (map.hasKey("showWithText") && map.getBoolean("showWithText")) {
                    i |= 4;
                }
                add.setShowAsAction(i);
            }
        }
    }

    private void setMenuItemIcon(MenuItem menuItem, ReadableMap readableMap) {
        DraweeHolder create = DraweeHolder.create(createDraweeHierarchy(), getContext());
        ActionIconControllerListener actionIconControllerListener = new ActionIconControllerListener(menuItem, create);
        actionIconControllerListener.setIconImageInfo(getIconImageInfo(readableMap));
        setIconSource(readableMap, actionIconControllerListener, create);
        this.mActionsHolder.add(create);
    }

    private void setIconSource(ReadableMap readableMap, IconControllerListener iconControllerListener, DraweeHolder draweeHolder) {
        String str;
        if (readableMap != null) {
            str = readableMap.getString("uri");
        } else {
            str = null;
        }
        if (str == null) {
            iconControllerListener.setIconImageInfo(null);
            iconControllerListener.setDrawable(null);
        } else if (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("file://")) {
            iconControllerListener.setIconImageInfo(getIconImageInfo(readableMap));
            draweeHolder.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri(Uri.parse(str)).setControllerListener(iconControllerListener)).setOldController(draweeHolder.getController())).build());
            draweeHolder.getTopLevelDrawable().setVisible(true, true);
        } else {
            iconControllerListener.setDrawable(getDrawableByName(str));
        }
    }
}
