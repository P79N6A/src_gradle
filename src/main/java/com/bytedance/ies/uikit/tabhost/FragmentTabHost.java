package com.bytedance.ies.uikit.tabhost;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;

public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    private boolean mAttached;
    private int mContainerId;
    private Context mContext;
    private FragmentManager mFragmentManager;
    private boolean mHideWhenTabChanged = false;
    private TabInfo mLastTab;
    private boolean mOnTabChangeCalled = false;
    private TabHost.OnTabChangeListener mOnTabChangeListener;
    private FrameLayout mRealTabContent;
    private OnTabSwitchListener mTabSwitchListener;
    private final ArrayList<TabInfo> mTabs = new ArrayList<>();
    private boolean mToAll;

    static class DummyTabFactory implements TabHost.TabContentFactory {
        private final Context mContext;

        public DummyTabFactory(Context context) {
            this.mContext = context;
        }

        public View createTabContent(String str) {
            View view = new View(this.mContext);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    public interface OnTabSwitchListener {
        void onTabSwitched(String str, Fragment fragment, Fragment fragment2);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        String curTab;

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.curTab + "}";
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.curTab = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.curTab);
        }
    }

    static final class TabInfo {
        public final Bundle args;
        public final Class<?> clss;
        public Fragment fragment;
        public final String tag;

        TabInfo(String str, Class<?> cls, Bundle bundle) {
            this.tag = str;
            this.clss = cls;
            this.args = bundle;
        }
    }

    public class _lancet {
        private _lancet() {
        }

        @Insert
        @TargetClass
        static void com_ss_android_ugc_aweme_lancet_FixFragmentTabHostLancet_onAttachedToWindow(FragmentTabHost fragmentTabHost) {
            try {
                fragmentTabHost.onAttachedToWindow$___twin___();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        _lancet.com_ss_android_ugc_aweme_lancet_FixFragmentTabHostLancet_onAttachedToWindow(this);
    }

    public boolean getDispatchWindowFocusChangedToAllTab() {
        return this.mToAll;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAttached = false;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public Fragment getCurrentFragment() {
        if (this.mLastTab != null) {
            return this.mLastTab.fragment;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.curTab = getCurrentTabTag();
        return savedState;
    }

    private void ensureContent() {
        if (this.mRealTabContent == null) {
            this.mRealTabContent = (FrameLayout) findViewById(this.mContainerId);
            if (this.mRealTabContent == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.mContainerId);
            }
        }
    }

    public void onAttachedToWindow$___twin___() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        FragmentTransaction fragmentTransaction = null;
        for (int i = 0; i < this.mTabs.size(); i++) {
            TabInfo tabInfo = this.mTabs.get(i);
            tabInfo.fragment = this.mFragmentManager.findFragmentByTag(tabInfo.tag);
            if (tabInfo.fragment != null && !tabInfo.fragment.isDetached()) {
                if (tabInfo.tag.equals(currentTabTag)) {
                    this.mLastTab = tabInfo;
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.mFragmentManager.beginTransaction();
                    }
                    fragmentTransaction.detach(tabInfo.fragment);
                }
            }
        }
        this.mAttached = true;
        FragmentTransaction doTabChanged = doTabChanged(currentTabTag, fragmentTransaction);
        if (doTabChanged != null) {
            doTabChanged.commitAllowingStateLoss();
            this.mFragmentManager.executePendingTransactions();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        if (context != null && findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.mRealTabContent = frameLayout2;
            this.mRealTabContent.setId(this.mContainerId);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    public void setDispatchWindowFocusChangedToAllTab(boolean z) {
        this.mToAll = z;
    }

    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.mOnTabChangeListener = onTabChangeListener;
    }

    public void setOnTabSwitchListener(OnTabSwitchListener onTabSwitchListener) {
        this.mTabSwitchListener = onTabSwitchListener;
    }

    public void setSuperOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        super.setOnTabChangedListener(onTabChangeListener);
    }

    public void setHideWhenTabChanged(boolean z) {
        if (!this.mOnTabChangeCalled) {
            this.mHideWhenTabChanged = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.curTab);
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        initFragmentTabHost(context, null);
    }

    public void dispatchWindowFocusChanged(boolean z) {
        if (this.mToAll) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchWindowFocusChanged(z);
            }
            return;
        }
        super.dispatchWindowFocusChanged(z);
    }

    public void onTabChanged(String str) {
        Fragment fragment;
        Fragment fragment2 = null;
        if (this.mAttached) {
            if (this.mLastTab != null) {
                fragment = this.mLastTab.fragment;
            } else {
                fragment = null;
            }
            FragmentTransaction doTabChanged = doTabChanged(str, null);
            if (doTabChanged != null) {
                doTabChanged.commitAllowingStateLoss();
            }
        } else {
            fragment = null;
        }
        if (this.mOnTabChangeListener != null) {
            this.mOnTabChangeListener.onTabChanged(str);
        }
        if (this.mTabSwitchListener != null) {
            if (this.mLastTab != null) {
                fragment2 = this.mLastTab.fragment;
            }
            if (fragment2 != fragment) {
                this.mTabSwitchListener.onTabSwitched(str, fragment2, fragment);
            }
        }
    }

    public void setup(Context context, FragmentManager fragmentManager) {
        super.setup();
        this.mContext = context;
        this.mFragmentManager = fragmentManager;
        ensureContent();
    }

    private void initFragmentTabHost(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.mContainerId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initFragmentTabHost(context, attributeSet);
    }

    private FragmentTransaction doTabChanged(String str, FragmentTransaction fragmentTransaction) {
        this.mOnTabChangeCalled = true;
        TabInfo tabInfo = null;
        for (int i = 0; i < this.mTabs.size(); i++) {
            TabInfo tabInfo2 = this.mTabs.get(i);
            if (tabInfo2.tag.equals(str)) {
                tabInfo = tabInfo2;
            }
        }
        if (tabInfo == null) {
            return null;
        }
        if (this.mLastTab != tabInfo) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.mFragmentManager.beginTransaction();
            }
            if (!(this.mLastTab == null || this.mLastTab.fragment == null)) {
                if (this.mHideWhenTabChanged) {
                    fragmentTransaction.hide(this.mLastTab.fragment);
                } else {
                    fragmentTransaction.detach(this.mLastTab.fragment);
                }
            }
            if (tabInfo != null) {
                if (tabInfo.fragment == null) {
                    tabInfo.fragment = Fragment.instantiate(this.mContext, tabInfo.clss.getName(), tabInfo.args);
                    fragmentTransaction.add(this.mContainerId, tabInfo.fragment, tabInfo.tag);
                } else if (this.mHideWhenTabChanged) {
                    if (tabInfo.fragment.isDetached()) {
                        fragmentTransaction.attach(tabInfo.fragment);
                    }
                    if (tabInfo.fragment.isHidden()) {
                        fragmentTransaction.show(tabInfo.fragment);
                    }
                } else {
                    fragmentTransaction.attach(tabInfo.fragment);
                }
            }
            this.mLastTab = tabInfo;
        }
        return fragmentTransaction;
    }

    public void setup(Context context, FragmentManager fragmentManager, int i) {
        super.setup();
        this.mContext = context;
        this.mFragmentManager = fragmentManager;
        this.mContainerId = i;
        ensureContent();
        this.mRealTabContent.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    public void addTab(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        tabSpec.setContent(new DummyTabFactory(this.mContext));
        String tag = tabSpec.getTag();
        TabInfo tabInfo = new TabInfo(tag, cls, bundle);
        if (this.mAttached) {
            tabInfo.fragment = this.mFragmentManager.findFragmentByTag(tag);
            if (tabInfo.fragment != null && !tabInfo.fragment.isDetached()) {
                FragmentTransaction beginTransaction = this.mFragmentManager.beginTransaction();
                beginTransaction.detach(tabInfo.fragment);
                beginTransaction.commitAllowingStateLoss();
            }
        }
        this.mTabs.add(tabInfo);
        addTab(tabSpec);
    }
}
