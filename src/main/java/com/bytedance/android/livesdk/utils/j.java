package com.bytedance.android.livesdk.utils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.bytedance.android.live.base.model.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17613a;

    public static a a(DataCenter dataCenter) {
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{dataCenter2}, null, f17613a, true, 13641, new Class[]{DataCenter.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{dataCenter2}, null, f17613a, true, 13641, new Class[]{DataCenter.class}, a.class);
        } else if (dataCenter2 == null) {
            return a.defaultOne();
        } else {
            return (a) dataCenter2.get("data_dou_plus_promote_entry", a.defaultOne());
        }
    }

    public static boolean b(@Nullable DataCenter dataCenter) {
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{dataCenter2}, null, f17613a, true, 13642, new Class[]{DataCenter.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dataCenter2}, null, f17613a, true, 13642, new Class[]{DataCenter.class}, Boolean.TYPE)).booleanValue();
        } else if (dataCenter2 == null || !((Boolean) dataCenter2.get("enter_from_dou_plus", Boolean.FALSE)).booleanValue()) {
            return false;
        } else {
            return true;
        }
    }

    public static Map<String, String> c(DataCenter dataCenter) {
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{dataCenter2}, null, f17613a, true, 13644, new Class[]{DataCenter.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{dataCenter2}, null, f17613a, true, 13644, new Class[]{DataCenter.class}, Map.class);
        } else if (dataCenter2 == null) {
            return new HashMap();
        } else {
            return (Map) dataCenter2.get("live_douplus_log_extra", new HashMap());
        }
    }

    public static void a(DataCenter dataCenter, Bundle bundle) {
        DataCenter dataCenter2 = dataCenter;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{dataCenter2, bundle2}, null, f17613a, true, 13643, new Class[]{DataCenter.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter2, bundle2}, null, f17613a, true, 13643, new Class[]{DataCenter.class, Bundle.class}, Void.TYPE);
        } else if (dataCenter2 != null && bundle2 != null) {
            dataCenter2.lambda$put$1$DataCenter("enter_from_dou_plus", Boolean.valueOf(bundle2.getBoolean("enter_from_dou_plus", false)));
            dataCenter2.lambda$put$1$DataCenter("live_douplus_log_extra", bundle2.getSerializable("live_douplus_log_extra"));
        }
    }

    public static void a(@Nullable a aVar, @Nullable Room room, @Nullable DataCenter dataCenter) {
        a aVar2;
        Room room2 = room;
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{aVar, room2, dataCenter2}, null, f17613a, true, 13639, new Class[]{a.class, Room.class, DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, room2, dataCenter2}, null, f17613a, true, 13639, new Class[]{a.class, Room.class, DataCenter.class}, Void.TYPE);
            return;
        }
        if (aVar == null) {
            aVar2 = a.defaultOne();
        } else {
            aVar2 = aVar;
        }
        if (room2 != null) {
            room2.isDouPlusPromotion = aVar2.hasDouPlusEntry;
        }
        if (dataCenter2 != null) {
            dataCenter2.lambda$put$1$DataCenter("data_dou_plus_promote_entry", aVar2);
        }
    }
}
