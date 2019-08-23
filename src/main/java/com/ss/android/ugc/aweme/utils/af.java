package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.c;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"assertIsAVChallengeOrNull", "", "challenge", "Ljava/io/Serializable;", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class af {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75492a;

    public static final void a(@Nullable Serializable serializable) {
        Serializable serializable2 = serializable;
        if (PatchProxy.isSupport(new Object[]{serializable2}, null, f75492a, true, 88058, new Class[]{Serializable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{serializable2}, null, f75492a, true, 88058, new Class[]{Serializable.class}, Void.TYPE);
        } else if (serializable2 != null && !(serializable2 instanceof c) && !(serializable2 instanceof String) && !(serializable2 instanceof List)) {
            throw new AssertionError("challenge type must be above types or null");
        }
    }
}
