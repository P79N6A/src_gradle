package com.bytedance.android.livesdk.chatroom.f;

import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.b.a.c;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10212a;

    public static c a(AssetsModel assetsModel) {
        AssetsModel assetsModel2 = assetsModel;
        if (!PatchProxy.isSupport(new Object[]{assetsModel2}, null, f10212a, true, 6463, new Class[]{AssetsModel.class}, c.class)) {
            return a(assetsModel2, 0);
        }
        return (c) PatchProxy.accessDispatch(new Object[]{assetsModel2}, null, f10212a, true, 6463, new Class[]{AssetsModel.class}, c.class);
    }

    private static boolean b(AssetsModel assetsModel) {
        if (PatchProxy.isSupport(new Object[]{assetsModel}, null, f10212a, true, 6465, new Class[]{AssetsModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{assetsModel}, null, f10212a, true, 6465, new Class[]{AssetsModel.class}, Boolean.TYPE)).booleanValue();
        } else if (assetsModel == null || TextUtils.isEmpty(assetsModel.getMD5())) {
            return false;
        } else {
            i resourceModel = assetsModel.getResourceModel();
            if (resourceModel == null) {
                return false;
            }
            List<String> list = resourceModel.f14743a;
            if (list == null || list.isEmpty()) {
                return false;
            }
            return true;
        }
    }

    public static c a(AssetsModel assetsModel, int i) {
        if (PatchProxy.isSupport(new Object[]{assetsModel, Integer.valueOf(i)}, null, f10212a, true, 6464, new Class[]{AssetsModel.class, Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{assetsModel, Integer.valueOf(i)}, null, f10212a, true, 6464, new Class[]{AssetsModel.class, Integer.TYPE}, c.class);
        } else if (!b(assetsModel)) {
            return null;
        } else {
            i resourceModel = assetsModel.getResourceModel();
            String[] strArr = new String[resourceModel.f14743a.size()];
            resourceModel.f14743a.toArray(strArr);
            c cVar = new c(assetsModel.getId(), strArr, assetsModel.getMD5(), (long) i, true);
            return cVar;
        }
    }
}
