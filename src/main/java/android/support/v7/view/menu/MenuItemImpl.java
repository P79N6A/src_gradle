package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.menu.MenuView;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.C0906R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MenuItemImpl implements SupportMenuItem {
    private ActionProvider mActionProvider;
    private View mActionView;
    private final int mCategoryOrder;
    private MenuItem.OnMenuItemClickListener mClickListener;
    private CharSequence mContentDescription;
    private int mFlags = 16;
    private final int mGroup;
    private boolean mHasIconTint;
    private boolean mHasIconTintMode;
    private Drawable mIconDrawable;
    private int mIconResId;
    private ColorStateList mIconTintList;
    private PorterDuff.Mode mIconTintMode;
    private final int mId;
    private Intent mIntent;
    private boolean mIsActionViewExpanded;
    private Runnable mItemCallback;
    MenuBuilder mMenu;
    private ContextMenu.ContextMenuInfo mMenuInfo;
    private boolean mNeedToApplyIconTint;
    private MenuItem.OnActionExpandListener mOnActionExpandListener;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private int mShortcutAlphabeticModifiers = 4096;
    private char mShortcutNumericChar;
    private int mShortcutNumericModifiers = 4096;
    private int mShowAsAction;
    private SubMenuBuilder mSubMenu;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;
    private CharSequence mTooltipText;

    public final int getAlphabeticModifiers() {
        return this.mShortcutAlphabeticModifiers;
    }

    public final char getAlphabeticShortcut() {
        return this.mShortcutAlphabeticChar;
    }

    /* access modifiers changed from: package-private */
    public final Runnable getCallback() {
        return this.mItemCallback;
    }

    public final CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    public final int getGroupId() {
        return this.mGroup;
    }

    public final ColorStateList getIconTintList() {
        return this.mIconTintList;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.mIconTintMode;
    }

    public final Intent getIntent() {
        return this.mIntent;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.mId;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.mMenuInfo;
    }

    public final int getNumericModifiers() {
        return this.mShortcutNumericModifiers;
    }

    public final char getNumericShortcut() {
        return this.mShortcutNumericChar;
    }

    public final int getOrder() {
        return this.mCategoryOrder;
    }

    public final int getOrdering() {
        return this.mOrdering;
    }

    public final SubMenu getSubMenu() {
        return this.mSubMenu;
    }

    public final ActionProvider getSupportActionProvider() {
        return this.mActionProvider;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.mTitle;
    }

    public final CharSequence getTooltipText() {
        return this.mTooltipText;
    }

    public final boolean isActionViewExpanded() {
        return this.mIsActionViewExpanded;
    }

    public final void actionFormatChanged() {
        this.mMenu.onItemActionRequestChanged(this);
    }

    public final android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final boolean hasSubMenu() {
        if (this.mSubMenu != null) {
            return true;
        }
        return false;
    }

    public final boolean shouldShowIcon() {
        return this.mMenu.getOptionalIconsVisible();
    }

    /* access modifiers changed from: package-private */
    public final char getShortcut() {
        if (this.mMenu.isQwertyMode()) {
            return this.mShortcutAlphabeticChar;
        }
        return this.mShortcutNumericChar;
    }

    public final boolean isActionButton() {
        if ((this.mFlags & 32) == 32) {
            return true;
        }
        return false;
    }

    public final boolean isCheckable() {
        if ((this.mFlags & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.mFlags & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.mFlags & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isExclusiveCheckable() {
        if ((this.mFlags & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean requestsActionButton() {
        if ((this.mShowAsAction & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean requiresActionButton() {
        if ((this.mShowAsAction & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean showsTextAsAction() {
        if ((this.mShowAsAction & 4) == 4) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (this.mTitle != null) {
            return this.mTitle.toString();
        }
        return null;
    }

    public final boolean expandActionView() {
        if (!hasCollapsibleActionView()) {
            return false;
        }
        if (this.mOnActionExpandListener == null || this.mOnActionExpandListener.onMenuItemActionExpand(this)) {
            return this.mMenu.expandItemActionView(this);
        }
        return false;
    }

    public final View getActionView() {
        if (this.mActionView != null) {
            return this.mActionView;
        }
        if (this.mActionProvider == null) {
            return null;
        }
        this.mActionView = this.mActionProvider.onCreateActionView(this);
        return this.mActionView;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence;
        if (this.mTitleCondensed != null) {
            charSequence = this.mTitleCondensed;
        } else {
            charSequence = this.mTitle;
        }
        if (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) {
            return charSequence;
        }
        return charSequence.toString();
    }

    public final boolean hasCollapsibleActionView() {
        if ((this.mShowAsAction & 8) == 0) {
            return false;
        }
        if (this.mActionView == null && this.mActionProvider != null) {
            this.mActionView = this.mActionProvider.onCreateActionView(this);
        }
        if (this.mActionView != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean shouldShowShortcut() {
        if (!this.mMenu.isShortcutsVisible() || getShortcut() == 0) {
            return false;
        }
        return true;
    }

    public final boolean collapseActionView() {
        if ((this.mShowAsAction & 8) == 0) {
            return false;
        }
        if (this.mActionView == null) {
            return true;
        }
        if (this.mOnActionExpandListener == null || this.mOnActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.mMenu.collapseItemActionView(this);
        }
        return false;
    }

    public final Drawable getIcon() {
        if (this.mIconDrawable != null) {
            return applyIconTintIfNecessary(this.mIconDrawable);
        }
        if (this.mIconResId == 0) {
            return null;
        }
        Drawable drawable = AppCompatResources.getDrawable(this.mMenu.getContext(), this.mIconResId);
        this.mIconResId = 0;
        this.mIconDrawable = drawable;
        return applyIconTintIfNecessary(drawable);
    }

    public final boolean isVisible() {
        if (this.mActionProvider == null || !this.mActionProvider.overridesItemVisibility()) {
            if ((this.mFlags & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.mFlags & 8) != 0 || !this.mActionProvider.isVisible()) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean invoke() {
        if ((this.mClickListener != null && this.mClickListener.onMenuItemClick(this)) || this.mMenu.dispatchMenuItemSelected(this.mMenu, this)) {
            return true;
        }
        if (this.mItemCallback != null) {
            this.mItemCallback.run();
            return true;
        }
        if (this.mIntent != null) {
            try {
                this.mMenu.getContext().startActivity(this.mIntent);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        if (this.mActionProvider == null || !this.mActionProvider.onPerformDefaultAction()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final String getShortcutLabel() {
        int i;
        char shortcut = getShortcut();
        if (shortcut == 0) {
            return "";
        }
        Resources resources = this.mMenu.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.mMenu.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0906R.string.ay));
        }
        if (this.mMenu.isQwertyMode()) {
            i = this.mShortcutAlphabeticModifiers;
        } else {
            i = this.mShortcutNumericModifiers;
        }
        appendModifier(sb, i, 65536, resources.getString(C0906R.string.au));
        appendModifier(sb, i, 4096, resources.getString(C0906R.string.ap));
        appendModifier(sb, i, 2, resources.getString(C0906R.string.ao));
        appendModifier(sb, i, 1, resources.getString(C0906R.string.av));
        appendModifier(sb, i, 4, resources.getString(C0906R.string.ax));
        appendModifier(sb, i, 8, resources.getString(C0906R.string.as));
        if (shortcut == 8) {
            sb.append(resources.getString(C0906R.string.aq));
        } else if (shortcut == 10) {
            sb.append(resources.getString(C0906R.string.ar));
        } else if (shortcut != ' ') {
            sb.append(shortcut);
        } else {
            sb.append(resources.getString(C0906R.string.aw));
        }
        return sb.toString();
    }

    public final MenuItem setCallback(Runnable runnable) {
        this.mItemCallback = runnable;
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.mIntent = intent;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void setMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mMenuInfo = contextMenuInfo;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.mOnActionExpandListener = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mClickListener = onMenuItemClickListener;
        return this;
    }

    public final SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final void setActionViewExpanded(boolean z) {
        this.mIsActionViewExpanded = z;
        this.mMenu.onItemsChanged(false);
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.mFlags & 4) != 0) {
            this.mMenu.setExclusiveItemChecked(this);
        } else {
            setCheckedInt(z);
        }
        return this;
    }

    public final SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.mContentDescription = charSequence;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final void setExclusiveCheckable(boolean z) {
        int i;
        int i2 = this.mFlags & -5;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.mFlags = i | i2;
    }

    public final MenuItem setIcon(int i) {
        this.mIconDrawable = null;
        this.mIconResId = i;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.mIconTintList = colorStateList;
        this.mHasIconTint = true;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.mIconTintMode = mode;
        this.mHasIconTintMode = true;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final void setIsActionButton(boolean z) {
        if (z) {
            this.mFlags |= 32;
        } else {
            this.mFlags &= -33;
        }
    }

    public final MenuItem setNumericShortcut(char c2) {
        if (this.mShortcutNumericChar == c2) {
            return this;
        }
        this.mShortcutNumericChar = c2;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final void setSubMenu(SubMenuBuilder subMenuBuilder) {
        this.mSubMenu = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    public final MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.mMenu.getContext().getString(i));
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.mTitleCondensed = charSequence;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.mTooltipText = charSequence;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        if (setVisibleInt(z)) {
            this.mMenu.onItemVisibleChanged(this);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence getTitleForItemView(MenuView.ItemView itemView) {
        if (itemView == null || !itemView.prefersCondensedTitle()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public final SupportMenuItem setActionView(int i) {
        Context context = this.mMenu.getContext();
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.mShortcutAlphabeticChar == c2) {
            return this;
        }
        this.mShortcutAlphabeticChar = Character.toLowerCase(c2);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.mFlags;
        this.mFlags = z | (this.mFlags & true) ? 1 : 0;
        if (i != this.mFlags) {
            this.mMenu.onItemsChanged(false);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void setCheckedInt(boolean z) {
        int i;
        int i2 = this.mFlags;
        int i3 = this.mFlags & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.mFlags = i | i3;
        if (i2 != this.mFlags) {
            this.mMenu.onItemsChanged(false);
        }
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.mFlags |= 16;
        } else {
            this.mFlags &= -17;
        }
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.mIconResId = 0;
        this.mIconDrawable = drawable;
        this.mNeedToApplyIconTint = true;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.mShowAsAction = i;
                this.mMenu.onItemActionRequestChanged(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        this.mMenu.onItemsChanged(false);
        if (this.mSubMenu != null) {
            this.mSubMenu.setHeaderTitle(charSequence);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final boolean setVisibleInt(boolean z) {
        int i;
        int i2 = this.mFlags;
        int i3 = this.mFlags & -9;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.mFlags = i | i3;
        if (i2 != this.mFlags) {
            return true;
        }
        return false;
    }

    private Drawable applyIconTintIfNecessary(Drawable drawable) {
        if (drawable != null && this.mNeedToApplyIconTint && (this.mHasIconTint || this.mHasIconTintMode)) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (this.mHasIconTint) {
                DrawableCompat.setTintList(drawable, this.mIconTintList);
            }
            if (this.mHasIconTintMode) {
                DrawableCompat.setTintMode(drawable, this.mIconTintMode);
            }
            this.mNeedToApplyIconTint = false;
        }
        return drawable;
    }

    public final SupportMenuItem setActionView(View view) {
        this.mActionView = view;
        this.mActionProvider = null;
        if (view != null && view.getId() == -1 && this.mId > 0) {
            view.setId(this.mId);
        }
        this.mMenu.onItemActionRequestChanged(this);
        return this;
    }

    public final SupportMenuItem setSupportActionProvider(ActionProvider actionProvider) {
        if (this.mActionProvider != null) {
            this.mActionProvider.reset();
        }
        this.mActionView = null;
        this.mActionProvider = actionProvider;
        this.mMenu.onItemsChanged(true);
        if (this.mActionProvider != null) {
            this.mActionProvider.setVisibilityListener(new ActionProvider.VisibilityListener() {
                public void onActionProviderVisibilityChanged(boolean z) {
                    MenuItemImpl.this.mMenu.onItemVisibleChanged(MenuItemImpl.this);
                }
            });
        }
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.mShortcutNumericChar = c2;
        this.mShortcutAlphabeticChar = Character.toLowerCase(c3);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.mShortcutNumericChar == c2 && this.mShortcutNumericModifiers == i) {
            return this;
        }
        this.mShortcutNumericChar = c2;
        this.mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.mShortcutAlphabeticChar == c2 && this.mShortcutAlphabeticModifiers == i) {
            return this;
        }
        this.mShortcutAlphabeticChar = Character.toLowerCase(c2);
        this.mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(i);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    private static void appendModifier(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.mShortcutNumericChar = c2;
        this.mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i);
        this.mShortcutAlphabeticChar = Character.toLowerCase(c3);
        this.mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(i2);
        this.mMenu.onItemsChanged(false);
        return this;
    }

    MenuItemImpl(MenuBuilder menuBuilder, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.mMenu = menuBuilder;
        this.mId = i2;
        this.mGroup = i;
        this.mCategoryOrder = i3;
        this.mOrdering = i4;
        this.mTitle = charSequence;
        this.mShowAsAction = i5;
    }
}
