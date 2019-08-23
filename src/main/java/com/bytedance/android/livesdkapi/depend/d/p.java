package com.bytedance.android.livesdkapi.depend.d;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18632a;

    @Nullable
    public static Bundle a(Context context, Room room, String str, Bundle bundle) {
        String str2 = str;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context, room, str2, bundle2}, null, f18632a, true, 14939, new Class[]{Context.class, Room.class, String.class, Bundle.class}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{context, room, str2, bundle2}, null, f18632a, true, 14939, new Class[]{Context.class, Room.class, String.class, Bundle.class}, Bundle.class);
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("live.intent.extra.ENTER_LIVE_SOURCE", str2);
        bundle3.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle2);
        bundle3.putBundle("live.intent.extra.EXTRA_ROOM_ARGS", a.a(room));
        return bundle3;
    }

    @Nullable
    public static Bundle a(Context context, int i, String str, @Nullable String str2, int i2, boolean z, Bundle bundle) {
        String str3 = str;
        String str4 = str2;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), str3, str4, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), bundle2}, null, f18632a, true, 14941, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Integer.TYPE, Boolean.TYPE, Bundle.class}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), str3, str4, Integer.valueOf(i2), Byte.valueOf(z), bundle2}, null, f18632a, true, 14941, new Class[]{Context.class, Integer.TYPE, String.class, String.class, Integer.TYPE, Boolean.TYPE, Bundle.class}, Bundle.class);
        }
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("live.intent.extra.IS_MULTI", true);
        bundle3.putInt("live.intent.extra.POSITION", i);
        bundle3.putString("live.intent.extra.ENTER_LIVE_SOURCE", str3);
        bundle3.putString("live.intent.extra.EXTRA_ENTER_FEED_STYLE", str4);
        bundle3.putInt("live.intent.extra.SWIPE_SWITCH_MASK", i2);
        bundle3.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle2);
        bundle3.putBoolean("live.intent.extra.DISLIKE_ENABLED", z);
        return bundle3;
    }
}
