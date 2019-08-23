package com.ss.android.ugc.aweme.miniapp.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.tt.miniapphost.process.bridge.ProcessCallControlBridge;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/miniapp/hostbridge/AVCutVideoABValueHandler;", "Lcom/tt/miniapphost/process/handler/ISyncHostDataHandler;", "()V", "action", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "callData", "getType", "", "Companion", "miniapp_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements ISyncHostDataHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55599a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0638a f55600b = new C0638a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/miniapp/hostbridge/AVCutVideoABValueHandler$Companion;", "", "()V", "TYPE", "", "isVECutVideoEnable", "", "miniapp_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.miniapp.c.a$a  reason: collision with other inner class name */
    public static final class C0638a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55601a;

        private C0638a() {
        }

        public final boolean a() {
            if (!PatchProxy.isSupport(new Object[0], this, f55601a, false, 59347, new Class[0], Boolean.TYPE)) {
                return Intrinsics.areEqual((Object) String.valueOf(ProcessCallControlBridge.callHostProcessSync("AVCutVideoABValueHandler", null)), (Object) PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f55601a, false, 59347, new Class[0], Boolean.TYPE)).booleanValue();
        }

        public /* synthetic */ C0638a(byte b2) {
            this();
        }
    }

    @NotNull
    public final String getType() {
        return "AVCutVideoABValueHandler";
    }

    @NotNull
    public final CrossProcessDataEntity action(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
        if (!PatchProxy.isSupport(new Object[]{crossProcessDataEntity}, this, f55599a, false, 59346, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class)) {
            return new CrossProcessDataEntity(String.valueOf(((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableVECutVideo() ? 1 : 0));
        }
        return (CrossProcessDataEntity) PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity}, this, f55599a, false, 59346, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class);
    }
}
