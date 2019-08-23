package com.ss.android.ugc.common.component.fragment;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.AbsFragment;

public abstract class ComponentFragment extends AbsFragment {
    private SparseArray<b> mComponents;

    @NonNull
    public abstract SparseArray<b> registerComponents();

    public SparseArray<b> getComponents() {
        return this.mComponents;
    }

    public void onDestroy() {
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).as();
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).l();
        }
    }

    public void onResume() {
        super.onResume();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).k();
        }
    }

    public void onStart() {
        super.onStart();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i);
        }
    }

    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).ay();
        }
    }

    public void onDetach() {
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).aw();
        }
        if (this.mComponents != null) {
            this.mComponents.clear();
            this.mComponents = null;
        }
        super.onDetach();
    }

    public b getComponent(int i) {
        return this.mComponents.get(i);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).a(bundle);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i);
        }
    }

    public void onViewStateRestored(@Nullable Bundle bundle) {
        super.onViewStateRestored(bundle);
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i);
        }
    }

    public void onAttach(Activity activity) {
        this.mComponents = registerComponents();
        for (int i = 0; i < this.mComponents.size(); i++) {
            this.mComponents.valueAt(i).a(activity, this);
        }
        super.onAttach(activity);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
