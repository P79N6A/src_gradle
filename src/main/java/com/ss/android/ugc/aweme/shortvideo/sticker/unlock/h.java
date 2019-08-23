package com.ss.android.ugc.aweme.shortvideo.sticker.unlock;

import android.content.Context;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70205a = null;

    /* renamed from: b  reason: collision with root package name */
    private static String f70206b = "";

    public static String a() {
        return f70206b;
    }

    public static void a(String str) {
        f70206b = str;
    }

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f70205a, true, 79854, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f70205a, true, 79854, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.b(context2, (int) C0906R.string.cac, 1).a();
    }

    public static void a(Context context, String str, Effect effect) {
        String str2;
        Context context2 = context;
        String str3 = str;
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{context2, str3, effect2}, null, f70205a, true, 79855, new Class[]{Context.class, String.class, Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, effect2}, null, f70205a, true, 79855, new Class[]{Context.class, String.class, Effect.class}, Void.TYPE);
            return;
        }
        IStickerUtilsService stickerUtilsService = ((IAVService) ServiceManager.get().getService(IAVService.class)).getStickerUtilsService();
        LockStickerTextBean textBeanForActivity = ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().getTextBeanForActivity(effect2);
        if (textBeanForActivity == null || textBeanForActivity.bubbleHint == null) {
            a.b(context2, (int) C0906R.string.ce1, 1).a();
        } else {
            a.b(context2, textBeanForActivity.bubbleHint, 1).a();
        }
        d a2 = d.a().a("enter_method", str3).a("prop_id", effect2.effect_id);
        if (stickerUtilsService.isStickerPreviewable(effect2)) {
            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        r.a("sticker_unlocked_toast_show", (Map) a2.a("is_visible", str2).f34114b);
    }
}
