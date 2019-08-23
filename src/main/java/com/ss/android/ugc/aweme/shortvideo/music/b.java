package com.ss.android.ugc.aweme.shortvideo.music;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.property.a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"ABMusicPanelType", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68428a;

    public static final int a() {
        if (PatchProxy.isSupport(new Object[0], null, f68428a, true, 77778, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f68428a, true, 77778, new Class[0], Integer.TYPE)).intValue();
        }
        if (a.a()) {
            return 1;
        }
        return com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.EditPageMusicPanelOptimization);
    }
}
