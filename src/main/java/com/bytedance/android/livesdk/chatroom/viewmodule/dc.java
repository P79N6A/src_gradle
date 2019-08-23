package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.bl.c;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dc implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13146a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveShareWidget f13147b;

    dc(LiveShareWidget liveShareWidget) {
        this.f13147b = liveShareWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13146a, false, 7250, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13146a, false, 7250, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveShareWidget liveShareWidget = this.f13147b;
        ShareReportResult shareReportResult = (ShareReportResult) ((d) obj).f7871b;
        if (PatchProxy.isSupport(new Object[]{shareReportResult}, liveShareWidget, LiveShareWidget.f12657a, false, 7245, new Class[]{ShareReportResult.class}, Void.TYPE)) {
            LiveShareWidget liveShareWidget2 = liveShareWidget;
            PatchProxy.accessDispatch(new Object[]{shareReportResult}, liveShareWidget2, LiveShareWidget.f12657a, false, 7245, new Class[]{ShareReportResult.class}, Void.TYPE);
            return;
        }
        if (!(shareReportResult == null || shareReportResult.getDeltaIntimacy() <= 0 || liveShareWidget.f12659c == null)) {
            ((IMessageManager) liveShareWidget.dataCenter.get("data_message_manager")).insertMessage(c.a(liveShareWidget.f12659c.getId(), shareReportResult.getDisplayText(), liveShareWidget.f12660d), true);
        }
    }
}
