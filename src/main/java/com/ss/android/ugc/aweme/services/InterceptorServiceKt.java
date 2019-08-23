package com.ss.android.ugc.aweme.services;

import com.ss.android.ugc.aweme.g.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"DEBUG", "", "PASSPORT_PATH", "", "TAG", "TWO_STEP_AUTH_ERROR_CODES", "", "", "awemeaccount_douyinCnRelease"}, k = 2, mv = {1, 1, 13})
public final class InterceptorServiceKt {
    public static final boolean DEBUG = a.a();
    public static final List<Integer> TWO_STEP_AUTH_ERROR_CODES = CollectionsKt.listOf(2020, 2022, 2025);
}
