package com.ss.android.ugc.aweme.rocket;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.rocket.android.api.FusionFuelSdk;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings;
import com.ss.android.ugc.aweme.global.config.settings.pojo.a;
import com.ss.android.ugc.aweme.profile.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0007J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/rocket/FlipChatEventManager;", "", "()V", "onEvent", "", "event", "Lcom/ss/android/ugc/aweme/rocket/FlipChatAppLogEvent;", "Lcom/ss/android/ugc/aweme/rocket/FlipChatSettingEvent;", "registerFlipChatEvent", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3846a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f3847b = new e();

    private e() {
    }

    @Subscribe
    public final void onEvent(@Nullable b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f3846a, false, 70883, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f3846a, false, 70883, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (bVar != null && q.a()) {
            FusionFuelSdk.onApplogUpdate();
        }
    }

    @Subscribe
    public final void onEvent(@Nullable h hVar) {
        a aVar;
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f3846a, false, 70884, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, f3846a, false, 70884, new Class[]{h.class}, Void.TYPE);
            return;
        }
        if (hVar2 != null) {
            aVar = hVar2.f63661b;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            try {
                FlipChatSettings av = hVar2.f63661b.av();
                if (av != null) {
                    l.a();
                    Boolean showMsgCell = av.getShowMsgCell();
                    Intrinsics.checkExpressionValueIsNotNull(showMsgCell, "flipchatSettings.showMsgCell");
                    if (showMsgCell.booleanValue()) {
                        Boolean mainSwitch = av.getMainSwitch();
                        Intrinsics.checkExpressionValueIsNotNull(mainSwitch, "flipchatSettings.mainSwitch");
                        if (mainSwitch.booleanValue()) {
                            a.f63644b.onLastMsgUpdate(FusionFuelSdk.getLastMsg());
                        }
                    }
                }
            } catch (com.bytedance.ies.a unused) {
            }
        }
    }
}
