package com.tt.miniapphost;

import android.app.Activity;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ActivityContainer {
    private List<WeakReference<MiniappHostBase>> activitys;

    static class Holder {
        static ActivityContainer sInst = new ActivityContainer();

        Holder() {
        }
    }

    public static ActivityContainer getInst() {
        return Holder.sInst;
    }

    @MiniAppProcess
    public List<WeakReference<MiniappHostBase>> getActivitys() {
        return this.activitys;
    }

    private ActivityContainer() {
        this.activitys = new ArrayList();
    }

    @MiniAppProcess
    public void addActivity(MiniappHostBase miniappHostBase) {
        if (miniappHostBase != null) {
            boolean z = false;
            Iterator<WeakReference<MiniappHostBase>> it2 = this.activitys.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Activity activity = (Activity) it2.next().get();
                if (activity != null && activity == miniappHostBase) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                this.activitys.add(new WeakReference(miniappHostBase));
            }
        }
    }

    @MiniAppProcess
    public void removeActivity(MiniappHostBase miniappHostBase) {
        if (miniappHostBase != null) {
            WeakReference weakReference = null;
            Iterator<WeakReference<MiniappHostBase>> it2 = this.activitys.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                WeakReference next = it2.next();
                Activity activity = (Activity) next.get();
                if (activity != null && activity == miniappHostBase) {
                    weakReference = next;
                    break;
                }
            }
            if (weakReference != null) {
                this.activitys.remove(weakReference);
            }
        }
    }
}
