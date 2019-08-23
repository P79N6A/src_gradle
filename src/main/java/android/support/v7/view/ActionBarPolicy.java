package android.support.v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.RestrictTo;
import android.support.v7.appcompat.R$styleable;
import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.C0906R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ActionBarPolicy {
    private Context mContext;

    public boolean enableHomeButtonByDefault() {
        if (this.mContext.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    public int getEmbeddedMenuWidthLimit() {
        return this.mContext.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int getStackedTabMaxWidth() {
        return this.mContext.getResources().getDimensionPixelSize(C0906R.dimen.n);
    }

    public boolean hasEmbeddedTabs() {
        return this.mContext.getResources().getBoolean(C0906R.bool.f4412a);
    }

    public boolean showsOverflowMenuButton() {
        if (Build.VERSION.SDK_INT < 19 && ViewConfiguration.get(this.mContext).hasPermanentMenuKey()) {
            return false;
        }
        return true;
    }

    public int getMaxActionButtons() {
        Configuration configuration = this.mContext.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        if (i >= 360) {
            return 3;
        }
        return 2;
    }

    public int getTabContainerHeight() {
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(null, R$styleable.ActionBar, C0906R.attr.f4374f, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = this.mContext.getResources();
        if (!hasEmbeddedTabs()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0906R.dimen.m));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    private ActionBarPolicy(Context context) {
        this.mContext = context;
    }

    public static ActionBarPolicy get(Context context) {
        return new ActionBarPolicy(context);
    }
}
