package com.ss.android.ugc.aweme.im.sdk.group.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0015j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\u00162\u0006\u0010\u0017\u001a\u00020\u0004J>\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0015j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/group/model/GroupBizExtConfig;", "", "()V", "AGREEMENT_SIGNAL", "", "INVITATION", "KEY_CREATE", "", "KEY_INVITATION", "KEY_INVITEE", "KEY_INVITOR", "KEY_SOURCE_APP_ID", "KEY_SOURCE_TYPE", "KEY_TIKET", "KEY_USER_ID", "NOT_USED", "PASSWORD", "PURE", "QR_CODE", "SIGNAL", "buildCreateBizExt", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "sourceType", "buildInviteBizExt", "fromUserId", "", "ticket", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51534a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f51535b = new a();

    private a() {
    }

    @NotNull
    public final HashMap<String, String> a(long j, int i, @Nullable String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), str2}, this, f51534a, false, 52244, new Class[]{Long.TYPE, Integer.TYPE, String.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), str2}, this, f51534a, false, 52244, new Class[]{Long.TYPE, Integer.TYPE, String.class}, HashMap.class);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("source_app_id", AppLog.getAppId());
        jSONObject3.put("im_user_id", j2);
        jSONObject.put("invitee", jSONObject2);
        jSONObject.put("invitor", jSONObject3);
        jSONObject.put("source_type", i);
        Map map = hashMap;
        String jSONObject4 = jSONObject.toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONObject4, "params.toString()");
        map.put("invitation", jSONObject4);
        if (str2 != null) {
            map.put("ticket", str2);
        }
        return hashMap;
    }
}
