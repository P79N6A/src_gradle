package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleRes;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.TooltipCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationItemView extends FrameLayout implements MenuView.ItemView {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private final int defaultMargin;
    private ImageView icon;
    private ColorStateList iconTint;
    private boolean isShifting;
    private MenuItemImpl itemData;
    private int itemPosition;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final TextView smallLabel;

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setShortcut(boolean z, char c2) {
    }

    public boolean showsIcon() {
        return true;
    }

    public MenuItemImpl getItemData() {
        return this.itemData;
    }

    public int getItemPosition() {
        return this.itemPosition;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        ViewCompat.setBackground(this, drawable);
    }

    public void setItemPosition(int i) {
        this.itemPosition = i;
    }

    public BottomNavigationItemView(@NonNull Context context) {
        this(context, null);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTint = colorStateList;
        if (this.itemData != null) {
            setIcon(this.itemData.getIcon());
        }
    }

    public void setItemBackground(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = ContextCompat.getDrawable(getContext(), i);
        }
        setItemBackground(drawable);
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.itemData != null && this.itemData.isCheckable() && this.itemData.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = DrawableCompat.wrap(drawable).mutate();
            DrawableCompat.setTintList(drawable, this.iconTint);
        }
        this.icon.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.icon.setLayoutParams(layoutParams);
    }

    public void setLabelVisibilityMode(int i) {
        boolean z;
        if (this.labelVisibilityMode != i) {
            this.labelVisibilityMode = i;
            if (this.itemData != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                setChecked(this.itemData.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        boolean z2;
        if (this.isShifting != z) {
            this.isShifting = z;
            if (this.itemData != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setChecked(this.itemData.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(@StyleRes int i) {
        TextViewCompat.setTextAppearance(this.largeLabel, i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextAppearanceInactive(@StyleRes int i) {
        TextViewCompat.setTextAppearance(this.smallLabel, i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTitle(CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        if (this.itemData == null || TextUtils.isEmpty(this.itemData.getContentDescription())) {
            setContentDescription(charSequence);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.smallLabel.setEnabled(z);
        this.largeLabel.setEnabled(z);
        this.icon.setEnabled(z);
        if (z) {
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR));
        } else {
            ViewCompat.setPointerIcon(this, null);
        }
    }

    public void setChecked(boolean z) {
        this.largeLabel.setPivotX((float) (this.largeLabel.getWidth() / 2));
        this.largeLabel.setPivotY((float) this.largeLabel.getBaseline());
        this.smallLabel.setPivotX((float) (this.smallLabel.getWidth() / 2));
        this.smallLabel.setPivotY((float) this.smallLabel.getBaseline());
        switch (this.labelVisibilityMode) {
            case -1:
                if (!this.isShifting) {
                    if (!z) {
                        setViewLayoutParams(this.icon, this.defaultMargin, 49);
                        setViewValues(this.largeLabel, this.scaleDownFactor, this.scaleDownFactor, 4);
                        setViewValues(this.smallLabel, 1.0f, 1.0f, 0);
                        break;
                    } else {
                        setViewLayoutParams(this.icon, (int) (((float) this.defaultMargin) + this.shiftAmount), 49);
                        setViewValues(this.largeLabel, 1.0f, 1.0f, 0);
                        setViewValues(this.smallLabel, this.scaleUpFactor, this.scaleUpFactor, 4);
                        break;
                    }
                } else {
                    if (z) {
                        setViewLayoutParams(this.icon, this.defaultMargin, 49);
                        setViewValues(this.largeLabel, 1.0f, 1.0f, 0);
                    } else {
                        setViewLayoutParams(this.icon, this.defaultMargin, 17);
                        setViewValues(this.largeLabel, 0.5f, 0.5f, 4);
                    }
                    this.smallLabel.setVisibility(4);
                    break;
                }
            case 0:
                if (z) {
                    setViewLayoutParams(this.icon, this.defaultMargin, 49);
                    setViewValues(this.largeLabel, 1.0f, 1.0f, 0);
                } else {
                    setViewLayoutParams(this.icon, this.defaultMargin, 17);
                    setViewValues(this.largeLabel, 0.5f, 0.5f, 4);
                }
                this.smallLabel.setVisibility(4);
                break;
            case 1:
                if (!z) {
                    setViewLayoutParams(this.icon, this.defaultMargin, 49);
                    setViewValues(this.largeLabel, this.scaleDownFactor, this.scaleDownFactor, 4);
                    setViewValues(this.smallLabel, 1.0f, 1.0f, 0);
                    break;
                } else {
                    setViewLayoutParams(this.icon, (int) (((float) this.defaultMargin) + this.shiftAmount), 49);
                    setViewValues(this.largeLabel, 1.0f, 1.0f, 0);
                    setViewValues(this.smallLabel, this.scaleUpFactor, this.scaleUpFactor, 4);
                    break;
                }
            case 2:
                setViewLayoutParams(this.icon, this.defaultMargin, 17);
                this.largeLabel.setVisibility(8);
                this.smallLabel.setVisibility(8);
                break;
        }
        refreshDrawableState();
        setSelected(z);
    }

    public BottomNavigationItemView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void calculateTextScaleFactors(float f2, float f3) {
        this.shiftAmount = f2 - f3;
        this.scaleUpFactor = (f3 * 1.0f) / f2;
        this.scaleDownFactor = (f2 * 1.0f) / f3;
    }

    public void initialize(MenuItemImpl menuItemImpl, int i) {
        int i2;
        this.itemData = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
        if (menuItemImpl.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
    }

    private void setViewLayoutParams(@NonNull View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.itemPosition = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(C0906R.layout.i3, this, true);
        setBackgroundResource(2130838563);
        this.defaultMargin = resources.getDimensionPixelSize(C0906R.dimen.dx);
        this.icon = (ImageView) findViewById(C0906R.id.aq8);
        this.smallLabel = (TextView) findViewById(C0906R.id.cs4);
        this.largeLabel = (TextView) findViewById(C0906R.id.b7b);
        ViewCompat.setImportantForAccessibility(this.smallLabel, 2);
        ViewCompat.setImportantForAccessibility(this.largeLabel, 2);
        setFocusable(true);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    private void setViewValues(@NonNull View view, float f2, float f3, int i) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i);
    }
}
