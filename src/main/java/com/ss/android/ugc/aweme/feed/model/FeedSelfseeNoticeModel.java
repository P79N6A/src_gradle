package com.ss.android.ugc.aweme.feed.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.feed.api.FeedSelfseeNoticeApi;
import java.util.concurrent.Callable;

public class FeedSelfseeNoticeModel extends a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public boolean sendRequest(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 41455, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 41455, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            final String str = objArr[0];
            m.a().a(this.mHandler, new Callable() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public Object call() throws Exception {
                    if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41456, new Class[0], Object.class)) {
                        return FeedSelfseeNoticeApi.a(str);
                    }
                    return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41456, new Class[0], Object.class);
                }
            }, 0);
            return true;
        }
    }
}
