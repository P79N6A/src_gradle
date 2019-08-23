package com.bytedance.android.livesdk.rank;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.event.l;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class BackToPreRoomWidget extends LiveRecyclableWidget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16871a;

    /* renamed from: b  reason: collision with root package name */
    private LiveBackRoomView f16872b;

    public int getLayoutId() {
        return C0906R.layout.aes;
    }

    public void onInit(@Nullable Object[] objArr) {
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f16871a, false, 12921, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16871a, false, 12921, new Class[0], Void.TYPE);
            return;
        }
        if (this.f16872b != null) {
            LiveBackRoomView liveBackRoomView = this.f16872b;
            if (PatchProxy.isSupport(new Object[0], liveBackRoomView, LiveBackRoomView.f16892a, false, 12969, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], liveBackRoomView, LiveBackRoomView.f16892a, false, 12969, new Class[0], Void.TYPE);
                return;
            }
            liveBackRoomView.f16893b.removeCallbacksAndMessages(null);
        }
    }

    public void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f16871a, false, 12920, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f16871a, false, 12920, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        if (this.contentView instanceof LiveBackRoomView) {
            this.f16872b = (LiveBackRoomView) this.contentView;
            LiveBackRoomView liveBackRoomView = this.f16872b;
            DataCenter dataCenter = this.dataCenter;
            if (PatchProxy.isSupport(new Object[]{dataCenter}, liveBackRoomView, LiveBackRoomView.f16892a, false, 12967, new Class[]{DataCenter.class}, Void.TYPE)) {
                LiveBackRoomView liveBackRoomView2 = liveBackRoomView;
                PatchProxy.accessDispatch(new Object[]{dataCenter}, liveBackRoomView2, LiveBackRoomView.f16892a, false, 12967, new Class[]{DataCenter.class}, Void.TYPE);
            } else {
                if (dataCenter != null) {
                    Bundle bundle = (Bundle) dataCenter.get("data_room_back");
                    liveBackRoomView.f16894c = bundle;
                    if (bundle != null) {
                        liveBackRoomView.setPreHostAvatar(liveBackRoomView.f16894c.getParcelable("pre_room_user_avatar"));
                        UIUtils.setViewVisibility(liveBackRoomView, 0);
                        liveBackRoomView.setOnClickListener(new View.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f16898a;

                            /* renamed from: c  reason: collision with root package name */
                            private static final /* synthetic */ a.C0900a f16899c;

                            static {
                                if (PatchProxy.isSupport(new Object[0], null, f16898a, true, 12971, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], null, f16898a, true, 12971, new Class[0], Void.TYPE);
                                    return;
                                }
                                b bVar = new b("LiveBackRoomView.java", AnonymousClass1.class);
                                f16899c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.rank.LiveBackRoomView$1", "android.view.View", "view", "", "void"), 84);
                            }

                            public void onClick(View view) {
                                Bundle bundle;
                                View view2 = view;
                                if (PatchProxy.isSupport(new Object[]{view2}, this, f16898a, false, 12970, new Class[]{View.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{view2}, this, f16898a, false, 12970, new Class[]{View.class}, Void.TYPE);
                                    return;
                                }
                                com.bytedance.android.livesdk.a.b.a().a(b.a(f16899c, this, this, view2));
                                if (LiveBackRoomView.this.f16894c != null) {
                                    long j = LiveBackRoomView.this.f16894c.getLong("live.intent.extra.ROOM_ID", 0);
                                    com.bytedance.android.livesdk.u.a a2 = com.bytedance.android.livesdk.u.a.a();
                                    Bundle bundle2 = LiveBackRoomView.this.f16894c;
                                    if (PatchProxy.isSupport(new Object[]{bundle2}, null, a.f16915a, true, 12928, new Class[]{Bundle.class}, Bundle.class)) {
                                        bundle = (Bundle) PatchProxy.accessDispatch(new Object[]{bundle2}, null, a.f16915a, true, 12928, new Class[]{Bundle.class}, Bundle.class);
                                    } else if (!a.f16916b) {
                                        bundle = new Bundle();
                                    } else if (bundle2 == null) {
                                        bundle = new Bundle();
                                    } else {
                                        Bundle bundle3 = bundle2.getBundle("log_extra");
                                        if (bundle3 == null) {
                                            bundle3 = new Bundle();
                                        }
                                        Logger.debug();
                                        bundle3.putInt("orientation", bundle2.getInt("orientation", 0));
                                        Bundle bundle4 = bundle2.getBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA");
                                        if (bundle4 != null) {
                                            bundle3.putBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA", bundle4);
                                        }
                                        bundle3.putLong("anchor_id", bundle2.getLong("anchor_id", 0));
                                        bundle = bundle3;
                                    }
                                    a2.a((Object) new l(j, bundle));
                                }
                            }
                        });
                        liveBackRoomView.f16893b.sendEmptyMessageDelayed(1100, 300000);
                        long longValue = ((Long) dataCenter.get("data_room_id", 0L)).longValue();
                        if (liveBackRoomView.f16895d != longValue) {
                            ai.a(liveBackRoomView.getContext(), (int) C0906R.string.cqa);
                        }
                        liveBackRoomView.f16895d = longValue;
                        return;
                    }
                }
                liveBackRoomView.setVisibility(8);
            }
        } else {
            UIUtils.setViewVisibility(this.containerView, 8);
        }
    }
}
