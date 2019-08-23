package com.ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import android.widget.AdapterView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71722a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerPropDetailFragment f71723b;

    c(StickerPropDetailFragment stickerPropDetailFragment) {
        this.f71723b = stickerPropDetailFragment;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{adapterView, view, Integer.valueOf(i), new Long(j2)}, this, f71722a, false, 82045, new Class[]{AdapterView.class, View.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f71722a, false, 82045, new Class[]{AdapterView.class, View.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        this.f71723b.a(i);
    }
}
