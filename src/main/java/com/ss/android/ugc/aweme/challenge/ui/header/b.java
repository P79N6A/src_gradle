package com.ss.android.ugc.aweme.challenge.ui.header;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"isNotNullOrEmpty", "", "", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35628a;

    public static final boolean a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f35628a, true, 26338, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f35628a, true, 26338, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str == null || str.length() <= 0) {
            return false;
        } else {
            return true;
        }
    }
}
