package com.ss.android.ugc.aweme.app;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class LogListActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33663a;

    /* renamed from: b  reason: collision with root package name */
    private LogListActivity f33664b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f33663a, false, 22559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33663a, false, 22559, new Class[0], Void.TYPE);
            return;
        }
        LogListActivity logListActivity = this.f33664b;
        if (logListActivity != null) {
            this.f33664b = null;
            logListActivity.listView = null;
            logListActivity.clearBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public LogListActivity_ViewBinding(LogListActivity logListActivity, View view) {
        this.f33664b = logListActivity;
        logListActivity.listView = (ListView) Utils.findRequiredViewAsType(view, C0906R.id.bd0, "field 'listView'", ListView.class);
        logListActivity.clearBtn = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.t3, "field 'clearBtn'", TextView.class);
    }
}
