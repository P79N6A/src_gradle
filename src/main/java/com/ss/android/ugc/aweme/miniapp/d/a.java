package com.ss.android.ugc.aweme.miniapp.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.option.scene.AbstractHostOptionSceneDepend;
import java.util.HashMap;
import java.util.Map;

public final class a extends AbstractHostOptionSceneDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55669a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f55670b;

    public final String getScene(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f55669a, false, 59377, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f55669a, false, 59377, new Class[]{String.class}, String.class);
        }
        if (this.f55670b == null) {
            this.f55670b = new HashMap();
            this.f55670b.put("in_mp", "021009");
            this.f55670b.put("back_mp", "021010");
        }
        return this.f55670b.get(str);
    }
}
