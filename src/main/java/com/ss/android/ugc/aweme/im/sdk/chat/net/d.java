package com.ss.android.ugc.aweme.im.sdk.chat.net;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.okhttp.OkHttpClient;

public class d {
    public static ChangeQuickRedirect g;
    protected WeakHandler h;
    protected OkHttpClient i = new OkHttpClient();

    public void d() {
    }

    public d() {
        WeakHandler.IHandler iHandler;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 51233, new Class[0], WeakHandler.IHandler.class)) {
            iHandler = (WeakHandler.IHandler) PatchProxy.accessDispatch(new Object[0], this, g, false, 51233, new Class[0], WeakHandler.IHandler.class);
        } else {
            iHandler = new WeakHandler.IHandler() {
                public final void handleMsg(Message message) {
                }
            };
        }
        this.h = new WeakHandler(iHandler);
    }
}
