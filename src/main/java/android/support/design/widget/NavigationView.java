package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.DimenRes;
import android.support.annotation.Dimension;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleRes;
import android.support.design.R$styleable;
import android.support.design.internal.NavigationMenu;
import android.support.design.internal.NavigationMenuPresenter;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.design.internal.ThemeEnforcement;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.ss.android.ugc.aweme.C0906R;

public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private final NavigationMenuPresenter presenter;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        public Bundle menuState;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }
    }

    public Menu getMenu() {
        return this.menu;
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.menuState = new Bundle();
        this.menu.savePresenterStates(savedState.menuState);
        return savedState;
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public void addHeaderView(@NonNull View view) {
        this.presenter.addHeaderView(view);
    }

    public View getHeaderView(int i) {
        return this.presenter.getHeaderView(i);
    }

    public View inflateHeaderView(@LayoutRes int i) {
        return this.presenter.inflateHeaderView(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onInsetsChanged(WindowInsetsCompat windowInsetsCompat) {
        this.presenter.dispatchApplyWindowInsets(windowInsetsCompat);
    }

    public void removeHeaderView(@NonNull View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemHorizontalPadding(@Dimension int i) {
        this.presenter.setItemHorizontalPadding(i);
    }

    public void setItemIconPadding(@Dimension int i) {
        this.presenter.setItemIconPadding(i);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        this.presenter.setItemTextAppearance(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setCheckedItem(@IdRes int i) {
        MenuItem findItem = this.menu.findItem(i);
        if (findItem != null) {
            this.presenter.setCheckedItem((MenuItemImpl) findItem);
        }
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPaddingResource(int i) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i));
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem findItem = this.menu.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.presenter.setCheckedItem((MenuItemImpl) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0906R.attr.fq, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        return new ColorStateList(new int[][]{DISABLED_STATE_SET, CHECKED_STATE_SET, EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(DISABLED_STATE_SET, defaultColor), i2, defaultColor});
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0906R.attr.vc);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList colorStateList;
        int i2;
        boolean z;
        this.presenter = new NavigationMenuPresenter();
        this.menu = new NavigationMenu(context);
        TintTypedArray obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context, attributeSet, R$styleable.NavigationView, i, C0906R.style.p1, new int[0]);
        ViewCompat.setBackground(this, obtainTintedStyledAttributes.getDrawable(0));
        if (obtainTintedStyledAttributes.hasValue(3)) {
            ViewCompat.setElevation(this, (float) obtainTintedStyledAttributes.getDimensionPixelSize(3, 0));
        }
        ViewCompat.setFitsSystemWindows(this, obtainTintedStyledAttributes.getBoolean(1, false));
        this.maxWidth = obtainTintedStyledAttributes.getDimensionPixelSize(2, 0);
        if (obtainTintedStyledAttributes.hasValue(8)) {
            colorStateList = obtainTintedStyledAttributes.getColorStateList(8);
        } else {
            colorStateList = createDefaultColorStateList(16842808);
        }
        if (obtainTintedStyledAttributes.hasValue(9)) {
            i2 = obtainTintedStyledAttributes.getResourceId(9, 0);
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        ColorStateList colorStateList2 = null;
        colorStateList2 = obtainTintedStyledAttributes.hasValue(10) ? obtainTintedStyledAttributes.getColorStateList(10) : colorStateList2;
        if (!z && colorStateList2 == null) {
            colorStateList2 = createDefaultColorStateList(16842806);
        }
        Drawable drawable = obtainTintedStyledAttributes.getDrawable(5);
        if (obtainTintedStyledAttributes.hasValue(6)) {
            this.presenter.setItemHorizontalPadding(obtainTintedStyledAttributes.getDimensionPixelSize(6, 0));
        }
        int dimensionPixelSize = obtainTintedStyledAttributes.getDimensionPixelSize(7, 0);
        this.menu.setCallback(new MenuBuilder.Callback() {
            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }

            public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
                if (NavigationView.this.listener == null || !NavigationView.this.listener.onNavigationItemSelected(menuItem)) {
                    return false;
                }
                return true;
            }
        });
        this.presenter.setId(1);
        this.presenter.initForMenu(context, this.menu);
        this.presenter.setItemIconTintList(colorStateList);
        if (z) {
            this.presenter.setItemTextAppearance(i2);
        }
        this.presenter.setItemTextColor(colorStateList2);
        this.presenter.setItemBackground(drawable);
        this.presenter.setItemIconPadding(dimensionPixelSize);
        this.menu.addMenuPresenter(this.presenter);
        addView((View) this.presenter.getMenuView(this));
        if (obtainTintedStyledAttributes.hasValue(11)) {
            inflateMenu(obtainTintedStyledAttributes.getResourceId(11, 0));
        }
        if (obtainTintedStyledAttributes.hasValue(4)) {
            inflateHeaderView(obtainTintedStyledAttributes.getResourceId(4, 0));
        }
        obtainTintedStyledAttributes.recycle();
    }
}
