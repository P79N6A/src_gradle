package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.internal.view.SupportSubMenu;
import android.support.v4.util.ArrayMap;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

public abstract class BaseMenuWrapper<T> extends BaseWrapper<T> {
    final Context mContext;
    private Map<SupportMenuItem, MenuItem> mMenuItems;
    private Map<SupportSubMenu, SubMenu> mSubMenus;

    /* access modifiers changed from: package-private */
    public final void internalClear() {
        if (this.mMenuItems != null) {
            this.mMenuItems.clear();
        }
        if (this.mSubMenus != null) {
            this.mSubMenus.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final MenuItem getMenuItemWrapper(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.mMenuItems == null) {
            this.mMenuItems = new ArrayMap();
        }
        MenuItem menuItem2 = this.mMenuItems.get(menuItem);
        if (menuItem2 == null) {
            menuItem2 = MenuWrapperFactory.wrapSupportMenuItem(this.mContext, supportMenuItem);
            this.mMenuItems.put(supportMenuItem, menuItem2);
        }
        return menuItem2;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu getSubMenuWrapper(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.mSubMenus == null) {
            this.mSubMenus = new ArrayMap();
        }
        SubMenu subMenu2 = this.mSubMenus.get(supportSubMenu);
        if (subMenu2 == null) {
            subMenu2 = MenuWrapperFactory.wrapSupportSubMenu(this.mContext, supportSubMenu);
            this.mSubMenus.put(supportSubMenu, subMenu2);
        }
        return subMenu2;
    }

    /* access modifiers changed from: package-private */
    public final void internalRemoveGroup(int i) {
        if (this.mMenuItems != null) {
            Iterator<SupportMenuItem> it2 = this.mMenuItems.keySet().iterator();
            while (it2.hasNext()) {
                if (i == it2.next().getGroupId()) {
                    it2.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void internalRemoveItem(int i) {
        if (this.mMenuItems != null) {
            Iterator<SupportMenuItem> it2 = this.mMenuItems.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (i == it2.next().getItemId()) {
                        it2.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    BaseMenuWrapper(Context context, T t) {
        super(t);
        this.mContext = context;
    }
}
