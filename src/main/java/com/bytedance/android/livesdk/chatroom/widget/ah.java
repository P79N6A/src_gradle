package com.bytedance.android.livesdk.chatroom.widget;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.View;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.browser.c.c;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.b.b;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Locale;

public final /* synthetic */ class ah implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13440a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f13441b;

    ah(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f13441b = liveRoomUserInfoWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13440a, false, 7993, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13440a, false, 7993, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f13441b;
        Locale locale = Locale.US;
        String str = LiveRoomUserInfoWidget.f13404c;
        int i = 8;
        Object[] objArr = new Object[8];
        objArr[0] = Long.valueOf(liveRoomUserInfoWidget.f13406e.getId());
        objArr[1] = Long.valueOf(liveRoomUserInfoWidget.f13406e.getOwner().getId());
        objArr[2] = Long.valueOf(TTLiveSDKContext.getHostService().k().b());
        objArr[3] = liveRoomUserInfoWidget.g;
        objArr[4] = "";
        objArr[5] = "top";
        objArr[6] = liveRoomUserInfoWidget.w ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY;
        objArr[7] = Integer.valueOf(b.a(TTLiveSDKContext.getHostService().k().a()));
        String format = String.format(locale, str, objArr);
        boolean booleanValue = ((Boolean) liveRoomUserInfoWidget.dataCenter.get("data_is_portrait")).booleanValue();
        DisplayMetrics displayMetrics = liveRoomUserInfoWidget.context.getResources().getDisplayMetrics();
        int i2 = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
        int i3 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (booleanValue) {
            i3 = 440;
        } else {
            i2 = UIUtils.px2dip(liveRoomUserInfoWidget.getContext(), (float) ak.a(liveRoomUserInfoWidget.getContext()));
        }
        if (liveRoomUserInfoWidget.x != null) {
            liveRoomUserInfoWidget.x.dismissAllowingStateLoss();
            liveRoomUserInfoWidget.x = null;
        }
        com.bytedance.android.livesdk.browser.c.b f2 = j.q().f();
        b.C0073b b2 = c.a(format).a(i2).b(i3).a(8, 8, booleanValue ? 0 : 8, booleanValue ? 0 : 8).b(!booleanValue);
        if (booleanValue) {
            i = 0;
        }
        liveRoomUserInfoWidget.x = f2.a(b2.c(i).e(booleanValue ? 80 : 8388613));
        if (liveRoomUserInfoWidget.x != null) {
            BaseDialogFragment.a((FragmentActivity) liveRoomUserInfoWidget.context, (DialogFragment) liveRoomUserInfoWidget.x);
            a.a().a("livesdk_fans_club_audience_open", new Object[0]);
        }
    }
}
