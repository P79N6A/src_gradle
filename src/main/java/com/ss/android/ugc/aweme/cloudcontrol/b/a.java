package com.ss.android.ugc.aweme.cloudcontrol.b;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import java.lang.reflect.Field;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36226a;

    /* renamed from: b  reason: collision with root package name */
    public static SharedPreferences f36227b;

    /* renamed from: c  reason: collision with root package name */
    private static a f36228c;

    public a() {
        f36227b = c.a(k.a(), "aweme-abtest-hooker", 0);
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f36226a, true, 27048, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f36226a, true, 27048, new Class[0], a.class);
        }
        if (f36228c == null) {
            synchronized (a.class) {
                if (f36228c == null) {
                    f36228c = new a();
                }
            }
        }
        return f36228c;
    }

    public final AbTestModel a(AbTestModel abTestModel) {
        AbTestModel abTestModel2 = abTestModel;
        if (PatchProxy.isSupport(new Object[]{abTestModel2}, this, f36226a, false, 27050, new Class[]{AbTestModel.class}, AbTestModel.class)) {
            return (AbTestModel) PatchProxy.accessDispatch(new Object[]{abTestModel2}, this, f36226a, false, 27050, new Class[]{AbTestModel.class}, AbTestModel.class);
        }
        try {
            Class<AbTestModel> cls = AbTestModel.class;
            for (Map.Entry next : f36227b.getAll().entrySet()) {
                Object value = next.getValue();
                Field declaredField = cls.getDeclaredField((String) next.getKey());
                declaredField.setAccessible(true);
                declaredField.set(abTestModel2, value);
            }
        } catch (Exception unused) {
        }
        return abTestModel2;
    }
}
