package android.support.v7.view.menu;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ExpandedMenuView extends ListView implements MenuBuilder.ItemInvoker, MenuView, AdapterView.OnItemClickListener {
    private static final int[] TINT_ATTRS = {16842964, 16843049};
    private int mAnimations;
    private MenuBuilder mMenu;

    public final int getWindowAnimations() {
        return this.mAnimations;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    public final boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setDivider(obtainStyledAttributes.getDrawable(1));
        }
        obtainStyledAttributes.recycle();
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        invokeItem((MenuItemImpl) getAdapter().getItem(i));
    }
}
