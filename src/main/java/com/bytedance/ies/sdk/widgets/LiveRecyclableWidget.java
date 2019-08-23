package com.bytedance.ies.sdk.widgets;

import android.support.annotation.Nullable;
import android.util.Log;
import com.bytedance.android.live.core.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class LiveRecyclableWidget extends LiveWidget implements IRecyclableWidget {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean alive;
    private Object[] args;
    private boolean clearAfterDestroyed;
    private boolean initialized;

    public void onClear() {
    }

    public abstract void onInit(@Nullable Object[] objArr);

    public abstract void onLoad(@Nullable Object[] objArr);

    public abstract void onUnload();

    public boolean startWithMergeTag() {
        return false;
    }

    public final boolean isAlive() {
        return this.alive;
    }

    public final boolean isInitialized() {
        return this.initialized;
    }

    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15174, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15174, new Class[0], Void.TYPE);
            return;
        }
        this.alive = true;
        super.onCreate();
        if (!this.initialized) {
            onInit(this.args);
            this.initialized = true;
        }
        onLoad(this.args);
    }

    public final void setClearAfterDestroyed() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15176, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15176, new Class[0], Void.TYPE);
        } else if (this.alive) {
            this.clearAfterDestroyed = true;
        } else {
            if (this.isDestroyed) {
                onClear();
            }
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 15175, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 15175, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.contentView == null || this.containerView == null)) {
            this.containerView.removeView(this.contentView);
        }
        try {
            onUnload();
        } catch (Exception e2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("stacktrace", Log.getStackTraceString(e2));
                e.a("widget_unload_data_center_null", -3, jSONObject);
            } catch (Exception e3) {
                try {
                    jSONObject.put("stacktrace", Log.getStackTraceString(e3));
                } catch (JSONException unused) {
                }
                e.a("widget_unload_data_center_null", -4, jSONObject);
            }
        }
        super.onDestroy();
        this.containerView = null;
        this.dataCenter = null;
        setWidgetCallback(null);
        this.args = null;
        this.context = null;
        this.containerView = null;
        this.alive = false;
        if (this.clearAfterDestroyed) {
            onClear();
        }
    }

    public final void setArgs(Object[] objArr) {
        this.args = objArr;
    }
}
