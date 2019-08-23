package com.ss.android.ugc.aweme.discover.mob;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.discover.ui.aw;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mob/SearchPageIndexUtil;", "", "()V", "getSugSearchPosition", "", "index", "", "getTabSource", "getTabSourceForScreenshot", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42666a;

    /* renamed from: b  reason: collision with root package name */
    public static final i f42667b = new i();

    private i() {
    }

    @JvmStatic
    @Nullable
    public static final String a(int i) {
        if (i == aw.f43134b) {
            return "general";
        }
        if (i == aw.f43135c) {
            return "aweme_video";
        }
        if (i == aw.f43136d) {
            return "discover";
        }
        if (i == aw.f43138f) {
            return "music";
        }
        if (i == aw.g) {
            return "challenge";
        }
        if (i == aw.f43137e) {
            return "poi";
        }
        return null;
    }
}
