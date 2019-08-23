package com.ss.android.ugc.aweme.poi.e;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.e.r;
import java.util.List;

public final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59793a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f59794b;

    /* renamed from: c  reason: collision with root package name */
    private final List f59795c;

    /* renamed from: d  reason: collision with root package name */
    private final double[] f59796d;

    public i(Context context, List list, double[] dArr) {
        this.f59794b = context;
        this.f59795c = list;
        this.f59796d = dArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f59793a, false, 66852, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f59793a, false, 66852, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Context context = this.f59794b;
        List list = this.f59795c;
        double[] dArr = this.f59796d;
        r.a(context, (r.a) list.get(i), dArr[0], dArr[1]);
    }
}
