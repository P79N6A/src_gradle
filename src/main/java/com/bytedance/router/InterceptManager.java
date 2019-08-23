package com.bytedance.router;

import android.content.Context;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.LinkedList;
import java.util.List;

public class InterceptManager {
    private List<IInterceptor> mInterceptors;

    public void addInterceptor(IInterceptor iInterceptor) {
        if (iInterceptor != null) {
            if (this.mInterceptors == null) {
                this.mInterceptors = new LinkedList();
            }
            this.mInterceptors.add(iInterceptor);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean processRouteIntent(Context context, RouteIntent routeIntent) {
        if (routeIntent == null) {
            return true;
        }
        if (this.mInterceptors == null || this.mInterceptors.size() == 0) {
            return false;
        }
        for (IInterceptor next : this.mInterceptors) {
            if (next.matchInterceptRules(routeIntent) && next.onInterceptRoute(context, routeIntent)) {
                return true;
            }
        }
        return false;
    }
}
