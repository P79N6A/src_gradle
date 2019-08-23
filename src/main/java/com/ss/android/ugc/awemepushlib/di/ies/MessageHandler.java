package com.ss.android.ugc.awemepushlib.di.ies;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.message.MessageReceiverService;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;

public class MessageHandler extends MessageReceiverService {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f4321b;

    public final void a(Context context, int i, String str, int i2, String str2) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), str, Integer.valueOf(i2), str2}, this, f4321b, false, 90194, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {context, Integer.valueOf(i), str, Integer.valueOf(i2), str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f4321b, false, 90194, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        MessageShowHandler.inst().handle3rdMessage(context, i, str, i2, str2, false);
    }
}
