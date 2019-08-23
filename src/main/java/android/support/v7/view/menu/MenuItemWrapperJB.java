package android.support.v7.view.menu;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v7.view.menu.MenuItemWrapperICS;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

@RequiresApi(16)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MenuItemWrapperJB extends MenuItemWrapperICS {

    class ActionProviderWrapperJB extends MenuItemWrapperICS.ActionProviderWrapper implements ActionProvider.VisibilityListener {
        ActionProvider.VisibilityListener mListener;

        public boolean isVisible() {
            return this.mInner.isVisible();
        }

        public boolean overridesItemVisibility() {
            return this.mInner.overridesItemVisibility();
        }

        public void refreshVisibility() {
            this.mInner.refreshVisibility();
        }

        public View onCreateActionView(MenuItem menuItem) {
            return this.mInner.onCreateActionView(menuItem);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.mListener != null) {
                this.mListener.onActionProviderVisibilityChanged(z);
            }
        }

        public void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
            ActionProviderWrapperJB actionProviderWrapperJB;
            this.mListener = visibilityListener;
            android.view.ActionProvider actionProvider = this.mInner;
            if (visibilityListener != null) {
                actionProviderWrapperJB = this;
            } else {
                actionProviderWrapperJB = null;
            }
            actionProvider.setVisibilityListener(actionProviderWrapperJB);
        }

        public ActionProviderWrapperJB(Context context, android.view.ActionProvider actionProvider) {
            super(context, actionProvider);
        }
    }

    /* access modifiers changed from: package-private */
    public MenuItemWrapperICS.ActionProviderWrapper createActionProviderWrapper(android.view.ActionProvider actionProvider) {
        return new ActionProviderWrapperJB(this.mContext, actionProvider);
    }

    MenuItemWrapperJB(Context context, SupportMenuItem supportMenuItem) {
        super(context, supportMenuItem);
    }
}
