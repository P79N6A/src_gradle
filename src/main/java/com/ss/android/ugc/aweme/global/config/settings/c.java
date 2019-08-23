package com.ss.android.ugc.aweme.global.config.settings;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public final class c implements com.bytedance.ies.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49533a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f49534b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f49535c = false;

    c() {
    }

    @Nullable
    public final <T> T a(String str, Class<T> cls, T t) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, cls, t}, this, f49533a, false, 47553, new Class[]{String.class, Class.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str2, cls, t}, this, f49533a, false, 47553, new Class[]{String.class, Class.class, Object.class}, Object.class);
        } else if (!this.f49534b.containsKey(str) || this.f49534b.get(str) == null) {
            return null;
        } else {
            return this.f49534b.get(str);
        }
    }

    @Nullable
    public final <T> List<T> a(String str, Class<T> cls, List<T> list) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, cls, list}, this, f49533a, false, 47554, new Class[]{String.class, Class.class, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2, cls, list}, this, f49533a, false, 47554, new Class[]{String.class, Class.class, List.class}, List.class);
        } else if (!this.f49534b.containsKey(str) || this.f49534b.get(str) == null) {
            return null;
        } else {
            return (List) this.f49534b.get(str);
        }
    }
}
