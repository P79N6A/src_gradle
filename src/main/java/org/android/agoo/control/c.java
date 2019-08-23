package org.android.agoo.control;

import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.Iterator;
import org.android.agoo.common.MsgDO;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AgooFactory f84006a;

    public void run() {
        ArrayList<MsgDO> b2 = AgooFactory.access$100(this.f84006a).b();
        if (b2 != null && b2.size() > 0) {
            ALog.e("AgooFactory", "reportCacheMsg", "size", Integer.valueOf(b2.size()));
            Iterator<MsgDO> it2 = b2.iterator();
            while (it2.hasNext()) {
                MsgDO next = it2.next();
                if (next != null) {
                    next.isFromCache = true;
                    this.f84006a.notifyManager.report(next, null);
                }
            }
        }
    }

    c(AgooFactory agooFactory) {
        this.f84006a = agooFactory;
    }
}
