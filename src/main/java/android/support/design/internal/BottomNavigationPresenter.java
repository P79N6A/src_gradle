package android.support.design.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuView;
import android.support.v7.view.menu.SubMenuBuilder;
import android.view.ViewGroup;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationPresenter implements MenuPresenter {
    private int id;
    private MenuBuilder menu;
    private BottomNavigationMenuView menuView;
    private boolean updateSuspended;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        int selectedItemId;

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.selectedItemId = parcel.readInt();
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
        }
    }

    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void setCallback(MenuPresenter.Callback callback) {
    }

    public int getId() {
        return this.id;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        return savedState;
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        return this.menuView;
    }

    public void setBottomNavigationMenuView(BottomNavigationMenuView bottomNavigationMenuView) {
        this.menuView = bottomNavigationMenuView;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setUpdateSuspended(boolean z) {
        this.updateSuspended = z;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.menuView.tryRestoreSelectedItemId(((SavedState) parcelable).selectedItemId);
        }
    }

    public void updateMenuView(boolean z) {
        if (!this.updateSuspended) {
            if (z) {
                this.menuView.buildMenuView();
            } else {
                this.menuView.updateMenuView();
            }
        }
    }

    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.menu = menuBuilder;
        this.menuView.initialize(this.menu);
    }
}