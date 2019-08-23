package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.support.v4.util.LongSparseArray;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.message.a;
import com.bytedance.android.livesdk.message.c.c;
import com.bytedance.android.livesdk.message.c.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.MessageManagerFactory;
import com.ss.ugc.live.sdk.message.data.Configuration;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17561a;

    /* renamed from: b  reason: collision with root package name */
    private static LongSparseArray<IMessageManager> f17562b = new LongSparseArray<>(2);

    /* renamed from: c  reason: collision with root package name */
    private static long f17563c;

    /* renamed from: d  reason: collision with root package name */
    private static a f17564d;

    @Deprecated
    public static IMessageManager a() {
        return (IMessageManager) f17562b.get(f17563c);
    }

    public static void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f17561a, true, 13712, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f17561a, true, 13712, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        IMessageManager iMessageManager = (IMessageManager) f17562b.get(j2);
        if (iMessageManager != null) {
            iMessageManager.release();
            if (f17564d != null) {
                f17564d.a();
            }
            f17562b.remove(j2);
        }
    }

    public static IMessageManager a(long j, boolean z, Context context) {
        long j2 = j;
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2), Byte.valueOf(z ? (byte) 1 : 0), context2}, null, f17561a, true, 13710, new Class[]{Long.TYPE, Boolean.TYPE, Context.class}, IMessageManager.class)) {
            return a(j2, z, context2, false);
        }
        return (IMessageManager) PatchProxy.accessDispatch(new Object[]{new Long(j2), Byte.valueOf(z), context2}, null, f17561a, true, 13710, new Class[]{Long.TYPE, Boolean.TYPE, Context.class}, IMessageManager.class);
    }

    private static IMessageManager a(long j, boolean z, Context context, boolean z2) {
        long j2 = j;
        boolean z3 = z;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Byte.valueOf(z ? (byte) 1 : 0), context2, (byte) 0}, null, f17561a, true, 13711, new Class[]{Long.TYPE, Boolean.TYPE, Context.class, Boolean.TYPE}, IMessageManager.class)) {
            Object[] objArr = {new Long(j2), Byte.valueOf(z), context2, (byte) 0};
            return (IMessageManager) PatchProxy.accessDispatch(objArr, null, f17561a, true, 13711, new Class[]{Long.TYPE, Boolean.TYPE, Context.class, Boolean.TYPE}, IMessageManager.class);
        } else if (j2 == f17563c && a() != null) {
            return a();
        } else {
            a(f17563c);
            f17563c = j2;
            com.bytedance.android.livesdk.message.b.a aVar = new com.bytedance.android.livesdk.message.b.a(z3);
            aVar.a(j2, context2);
            a giftInterceptor = ((IGiftService) b.a(IGiftService.class)).getGiftInterceptor(j2, z3);
            f17564d = ((IGiftService) b.a(IGiftService.class)).getAssetsInterceptor(z3);
            IMessageManager iMessageManager = MessageManagerFactory.get(new Configuration().setHttpClient(aVar).setMessageConverter(new com.bytedance.android.livesdk.message.b.b()).addInterceptor(new c(j2)).addInterceptor(giftInterceptor).addInterceptor(f17564d).addInterceptor(new com.bytedance.android.livesdk.message.c.b()).addInterceptor(new e()).setAnchor(z3).setEnablePriority(false).setEnableSmoothlyDispatch(true));
            f17562b.put(j2, iMessageManager);
            giftInterceptor.a(iMessageManager);
            f17564d.a(iMessageManager);
            return iMessageManager;
        }
    }
}
