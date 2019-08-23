package com.bytedance.ies.uikit.base;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.collection.WeakContainer;
import java.util.Iterator;

public abstract class AbsFragment extends Fragment implements IComponent {
    private WeakContainer<LifeCycleMonitor> mMonitors = new WeakContainer<>();
    protected boolean mStatusActive;
    protected boolean mStatusDestroyed;
    protected boolean mStatusViewValid;
    protected boolean mUserVisibleHintCompat = true;

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public boolean isActive() {
        return this.mStatusActive;
    }

    public boolean isDestroyed() {
        return this.mStatusDestroyed;
    }

    public boolean isViewValid() {
        return this.mStatusViewValid;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.mStatusViewValid = false;
    }

    public boolean getUserVisibleHintCompat() {
        if (Build.VERSION.SDK_INT < 15) {
            return this.mUserVisibleHintCompat;
        }
        return getUserVisibleHint();
    }

    public void onDestroy() {
        super.onDestroy();
        this.mStatusViewValid = false;
        this.mStatusDestroyed = true;
        if (!this.mMonitors.isEmpty()) {
            Iterator it2 = this.mMonitors.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onDestroy();
                }
            }
            this.mMonitors.clear();
        }
    }

    public void onPause() {
        FragmentInstrumentation.onPause(this);
        super.onPause();
        if (!this.mMonitors.isEmpty()) {
            Iterator it2 = this.mMonitors.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onPause();
                }
            }
        }
    }

    public void onResume() {
        FragmentInstrumentation.onResume(this);
        super.onResume();
        this.mStatusActive = true;
        if (!this.mMonitors.isEmpty()) {
            Iterator it2 = this.mMonitors.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onResume();
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        this.mStatusActive = false;
        if (!this.mMonitors.isEmpty()) {
            Iterator it2 = this.mMonitors.iterator();
            while (it2.hasNext()) {
                LifeCycleMonitor lifeCycleMonitor = (LifeCycleMonitor) it2.next();
                if (lifeCycleMonitor != null) {
                    lifeCycleMonitor.onStop();
                }
            }
        }
    }

    public void registerLifeCycleMonitor(LifeCycleMonitor lifeCycleMonitor) {
        this.mMonitors.add(lifeCycleMonitor);
    }

    public void unregisterLifeCycleMonitor(LifeCycleMonitor lifeCycleMonitor) {
        this.mMonitors.remove(lifeCycleMonitor);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mStatusActive = false;
        this.mStatusViewValid = false;
        this.mStatusDestroyed = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    public void setUserVisibleHintCompat(boolean z) {
        if (Build.VERSION.SDK_INT < 15) {
            this.mUserVisibleHintCompat = z;
        } else {
            setUserVisibleHint(z);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mStatusViewValid = true;
    }
}
