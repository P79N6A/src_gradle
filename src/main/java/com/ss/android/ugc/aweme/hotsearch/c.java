package com.ss.android.ugc.aweme.hotsearch;

import a.g;
import a.i;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49710a;

    /* renamed from: b  reason: collision with root package name */
    private final List f49711b;

    /* renamed from: c  reason: collision with root package name */
    private final LruCache f49712c;

    c(List list, LruCache lruCache) {
        this.f49711b = list;
        this.f49712c = lruCache;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f49710a, false, 49538, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f49710a, false, 49538, new Class[]{i.class}, Object.class);
        }
        List list = this.f49711b;
        LruCache lruCache = this.f49712c;
        if (iVar.e() == null) {
            return null;
        }
        int intValue = ((Integer) iVar.e()).intValue();
        for (int i = 0; i < intValue; i++) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) list.get(i);
            viewHolder.itemView.setDrawingCacheEnabled(false);
            viewHolder.itemView.setDrawingCacheEnabled(true);
            Bitmap drawingCache = viewHolder.itemView.getDrawingCache();
            if (drawingCache != null) {
                lruCache.put(String.valueOf(i), drawingCache);
            }
        }
        return Integer.valueOf(intValue);
    }
}
