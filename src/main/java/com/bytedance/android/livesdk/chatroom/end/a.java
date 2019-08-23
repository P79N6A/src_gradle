package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdk.chatroom.model.a.p;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.functions.Function;
import java.util.HashMap;

public final /* synthetic */ class a implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10095a;

    /* renamed from: b  reason: collision with root package name */
    static final Function f10096b = new a();

    private a() {
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10095a, false, 4202, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f10095a, false, 4202, new Class[]{Object.class}, Object.class);
        }
        String str = (String) obj;
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(str)) {
            p pVar = (p) com.bytedance.android.live.a.a().fromJson(str, p.class);
            if (pVar != null) {
                if (pVar.f11072c == null || pVar.f11072c.f11029b == 0) {
                    hashMap.put("channel_id", String.valueOf(pVar.f11070a));
                    hashMap.put("connection_type", "anchor");
                } else {
                    hashMap.put("channel_id", String.valueOf(pVar.f11070a));
                    hashMap.put("pk_id", String.valueOf(pVar.f11072c.f11032e));
                    hashMap.put("connection_type", PushConstants.URI_PACKAGE_NAME);
                    hashMap.put("theme", pVar.f11072c.f11030c);
                    hashMap.put("pk_time", String.valueOf(pVar.f11072c.f11029b));
                }
            }
        }
        return hashMap;
    }
}
