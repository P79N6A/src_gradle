package com.bytedance.ies.uikit.base;

public abstract class AbsTabFragment extends AbsFragment implements ITabFragment {
    public String getTabName() {
        return null;
    }

    public void onTabSelected() {
    }

    public void onTabUnSelected() {
    }
}
