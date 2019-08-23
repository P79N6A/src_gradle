package com.ss.android.ugc.aweme.commercialize.link;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.link.LinkAuthConstants;
import com.ss.android.ugc.aweme.common.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0014\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\b\u001a\u00020\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\n\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/link/LinkAuthLog;", "", "()V", "logClickLinkAssistant", "", "logClickLinkEntrance", "location", "", "logEnterLinkPlanPage", "pageName", "logShowLinkEntrance", "logShowLinkToast", "logSubmitLinkAuthorize", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38966a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f38967b = new c();

    private c() {
    }

    @JvmStatic
    public static final void a() {
        if (PatchProxy.isSupport(new Object[0], null, f38966a, true, 30871, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f38966a, true, 30871, new Class[0], Void.TYPE);
        } else {
            r.a("show_link_toast", (Map) new LinkedHashMap());
        }
    }

    @JvmStatic
    public static final void a(@LinkAuthConstants.EntranceLocation @Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f38966a, true, 30869, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f38966a, true, 30869, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a("show_link_entrance", MapsKt.mutableMapOf(TuplesKt.to("entrance_location", str2)));
    }

    @JvmStatic
    public static final void b(@LinkAuthConstants.EntranceLocation @Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f38966a, true, 30870, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f38966a, true, 30870, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a("click_link_entrance", MapsKt.mutableMapOf(TuplesKt.to("entrance_location", str2)));
    }
}
