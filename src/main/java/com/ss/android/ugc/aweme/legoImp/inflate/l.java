package com.ss.android.ugc.aweme.legoImp.inflate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.framework.a.a;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53107a;

    public static View a(String str, View view, Context context, int i) {
        String str2 = str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str2, view, context, Integer.valueOf(i)}, null, f53107a, true, 55200, new Class[]{String.class, View.class, Context.class, Integer.TYPE}, View.class)) {
            Object[] objArr = {str2, view, context, Integer.valueOf(i)};
            return (View) PatchProxy.accessDispatch(objArr, null, f53107a, true, 55200, new Class[]{String.class, View.class, Context.class, Integer.TYPE}, View.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2 + "type=" + view.getClass().getName() + "\n");
        sb.append(str2 + "id=" + view.getId() + "\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("childCount=");
        sb2.append(((ViewGroup) view).getChildCount());
        sb.append(sb2.toString());
        sb.append(str2 + "isX2COpen=" + SharePrefCache.inst().getX2cSwitch().c());
        a.a(sb.toString());
        n.a("x2c_error", "", c.a().a("x2c_error", sb.toString()).b());
        if (i2 != 0) {
            return LayoutInflater.from(context).inflate(i2, null);
        }
        return null;
    }
}
