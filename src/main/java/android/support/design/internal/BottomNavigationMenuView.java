package android.support.design.internal;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.Dimension;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleRes;
import android.support.transition.AutoTransition;
import android.support.transition.TransitionManager;
import android.support.transition.TransitionSet;
import android.support.v4.util.Pools;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.C0906R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationMenuView extends ViewGroup implements MenuView {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private BottomNavigationItemView[] buttons;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private Drawable itemBackground;
    private int itemBackgroundRes;
    private final int itemHeight;
    private boolean itemHorizontalTranslationEnabled;
    @Dimension
    private int itemIconSize;
    private ColorStateList itemIconTint;
    private final Pools.Pool<BottomNavigationItemView> itemPool;
    @StyleRes
    private int itemTextAppearanceActive;
    @StyleRes
    private int itemTextAppearanceInactive;
    private final ColorStateList itemTextColorDefault;
    private ColorStateList itemTextColorFromUser;
    private int labelVisibilityMode;
    public MenuBuilder menu;
    private final View.OnClickListener onClickListener;
    public BottomNavigationPresenter presenter;
    private int selectedItemId;
    private int selectedItemPosition;
    private final TransitionSet set;
    private int[] tempChildWidths;

    private boolean isShifting(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.itemIconTint;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.itemBackgroundRes;
    }

    @Dimension
    public int getItemIconSize() {
        return this.itemIconSize;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.itemTextAppearanceActive;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.itemTextAppearanceInactive;
    }

    public ColorStateList getItemTextColor() {
        return this.itemTextColorFromUser;
    }

    public int getLabelVisibilityMode() {
        return this.labelVisibilityMode;
    }

    public int getSelectedItemId() {
        return this.selectedItemId;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) this.itemPool.acquire();
        if (bottomNavigationItemView == null) {
            return new BottomNavigationItemView(getContext());
        }
        return bottomNavigationItemView;
    }

    @Nullable
    public Drawable getItemBackground() {
        if (this.buttons == null || this.buttons.length <= 0) {
            return this.itemBackground;
        }
        return this.buttons[0].getBackground();
    }

    public void buildMenuView() {
        removeAllViews();
        if (this.buttons != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.buttons) {
                if (bottomNavigationItemView != null) {
                    this.itemPool.release(bottomNavigationItemView);
                }
            }
        }
        if (this.menu.size() == 0) {
            this.selectedItemId = 0;
            this.selectedItemPosition = 0;
            this.buttons = null;
            return;
        }
        this.buttons = new BottomNavigationItemView[this.menu.size()];
        boolean isShifting = isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
        for (int i = 0; i < this.menu.size(); i++) {
            this.presenter.setUpdateSuspended(true);
            this.menu.getItem(i).setCheckable(true);
            this.presenter.setUpdateSuspended(false);
            BottomNavigationItemView newItem = getNewItem();
            this.buttons[i] = newItem;
            newItem.setIconTintList(this.itemIconTint);
            newItem.setIconSize(this.itemIconSize);
            newItem.setTextColor(this.itemTextColorDefault);
            newItem.setTextAppearanceInactive(this.itemTextAppearanceInactive);
            newItem.setTextAppearanceActive(this.itemTextAppearanceActive);
            newItem.setTextColor(this.itemTextColorFromUser);
            if (this.itemBackground != null) {
                newItem.setItemBackground(this.itemBackground);
            } else {
                newItem.setItemBackground(this.itemBackgroundRes);
            }
            newItem.setShifting(isShifting);
            newItem.setLabelVisibilityMode(this.labelVisibilityMode);
            newItem.initialize((MenuItemImpl) this.menu.getItem(i), 0);
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.onClickListener);
            addView(newItem);
        }
        this.selectedItemPosition = Math.min(this.menu.size() - 1, this.selectedItemPosition);
        this.menu.getItem(this.selectedItemPosition).setChecked(true);
    }

    public void updateMenuView() {
        if (this.menu != null && this.buttons != null) {
            int size = this.menu.size();
            if (size != this.buttons.length) {
                buildMenuView();
                return;
            }
            int i = this.selectedItemId;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.menu.getItem(i2);
                if (item.isChecked()) {
                    this.selectedItemId = item.getItemId();
                    this.selectedItemPosition = i2;
                }
            }
            if (i != this.selectedItemId) {
                TransitionManager.beginDelayedTransition(this, this.set);
            }
            boolean isShifting = isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.presenter.setUpdateSuspended(true);
                this.buttons[i3].setLabelVisibilityMode(this.labelVisibilityMode);
                this.buttons[i3].setShifting(isShifting);
                this.buttons[i3].initialize((MenuItemImpl) this.menu.getItem(i3), 0);
                this.presenter.setUpdateSuspended(false);
            }
        }
    }

    public void initialize(MenuBuilder menuBuilder) {
        this.menu = menuBuilder;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.itemHorizontalTranslationEnabled = z;
    }

    public void setLabelVisibilityMode(int i) {
        this.labelVisibilityMode = i;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.presenter = bottomNavigationPresenter;
    }

    public BottomNavigationMenuView(Context context) {
        this(context, null);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.itemIconTint = colorStateList;
        if (this.buttons != null) {
            for (BottomNavigationItemView iconTintList : this.buttons) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.itemBackground = drawable;
        if (this.buttons != null) {
            for (BottomNavigationItemView itemBackground2 : this.buttons) {
                itemBackground2.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.itemBackgroundRes = i;
        if (this.buttons != null) {
            for (BottomNavigationItemView itemBackground2 : this.buttons) {
                itemBackground2.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(@Dimension int i) {
        this.itemIconSize = i;
        if (this.buttons != null) {
            for (BottomNavigationItemView iconSize : this.buttons) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i) {
        this.itemTextAppearanceActive = i;
        if (this.buttons != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.buttons) {
                bottomNavigationItemView.setTextAppearanceActive(i);
                if (this.itemTextColorFromUser != null) {
                    bottomNavigationItemView.setTextColor(this.itemTextColorFromUser);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) {
        this.itemTextAppearanceInactive = i;
        if (this.buttons != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.buttons) {
                bottomNavigationItemView.setTextAppearanceInactive(i);
                if (this.itemTextColorFromUser != null) {
                    bottomNavigationItemView.setTextColor(this.itemTextColorFromUser);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.itemTextColorFromUser = colorStateList;
        if (this.buttons != null) {
            for (BottomNavigationItemView textColor : this.buttons) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void tryRestoreSelectedItemId(int i) {
        int size = this.menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.menu.getItem(i2);
            if (i == item.getItemId()) {
                this.selectedItemId = i;
                this.selectedItemPosition = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    public ColorStateList createDefaultColorStateList(int i) {
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

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.itemPool = new Pools.SynchronizedPool(5);
        this.selectedItemId = 0;
        this.selectedItemPosition = 0;
        Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(C0906R.dimen.dv);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(C0906R.dimen.dw);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(C0906R.dimen.dp);
        this.activeItemMinWidth = resources.getDimensionPixelSize(C0906R.dimen.dq);
        this.itemHeight = resources.getDimensionPixelSize(C0906R.dimen.dt);
        this.itemTextColorDefault = createDefaultColorStateList(16842808);
        this.set = new AutoTransition();
        this.set.setOrdering(0);
        this.set.setDuration(115);
        this.set.setInterpolator((TimeInterpolator) new FastOutSlowInInterpolator());
        this.set.addTransition(new TextScale());
        this.onClickListener = new View.OnClickListener() {
            public void onClick(View view) {
                MenuItemImpl itemData = ((BottomNavigationItemView) view).getItemData();
                if (!BottomNavigationMenuView.this.menu.performItemAction(itemData, BottomNavigationMenuView.this.presenter, 0)) {
                    itemData.setChecked(true);
                }
            }
        };
        this.tempChildWidths = new int[5];
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.menu.getVisibleItems().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.itemHeight, 1073741824);
        if (!isShifting(this.labelVisibilityMode, size2) || !this.itemHorizontalTranslationEnabled) {
            if (size2 == 0) {
                i3 = 1;
            } else {
                i3 = size2;
            }
            int min = Math.min(size / i3, this.activeItemMaxWidth);
            int i7 = size - (size2 * min);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    this.tempChildWidths[i8] = min;
                    if (i7 > 0) {
                        int[] iArr = this.tempChildWidths;
                        iArr[i8] = iArr[i8] + 1;
                        i7--;
                    }
                } else {
                    this.tempChildWidths[i8] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.selectedItemPosition);
            int i9 = this.activeItemMinWidth;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), makeMeasureSpec);
                i9 = Math.max(i9, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i10 = size2 - i4;
            int min2 = Math.min(size - (this.inactiveItemMinWidth * i10), Math.min(i9, this.activeItemMaxWidth));
            int i11 = size - min2;
            if (i10 == 0) {
                i5 = 1;
            } else {
                i5 = i10;
            }
            int min3 = Math.min(i11 / i5, this.inactiveItemMaxWidth);
            int i12 = i11 - (i10 * min3);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    int[] iArr2 = this.tempChildWidths;
                    if (i13 == this.selectedItemPosition) {
                        i6 = min2;
                    } else {
                        i6 = min3;
                    }
                    iArr2[i13] = i6;
                    if (i12 > 0) {
                        int[] iArr3 = this.tempChildWidths;
                        iArr3[i13] = iArr3[i13] + 1;
                        i12--;
                    }
                } else {
                    this.tempChildWidths[i13] = 0;
                }
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.tempChildWidths[i15], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i14 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i14, View.MeasureSpec.makeMeasureSpec(i14, 1073741824), 0), View.resolveSizeAndState(this.itemHeight, makeMeasureSpec, 0));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }
}
