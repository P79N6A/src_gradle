package com.ss.android.ugc.aweme.commercialize.utils.a;

import android.content.Context;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.f.ah;
import com.ss.android.ugc.aweme.feed.f.aj;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/router/ProfilePage;", "", "()V", "logUserProfileEvent", "", "uri", "Landroid/net/Uri;", "open", "context", "Landroid/content/Context;", "tryLogUserProfileEvent", "url", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39662a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f39663b = new d();

    private d() {
    }

    @JvmStatic
    private static final void a(Uri uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, null, f39662a, true, 32702, new Class[]{Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri}, null, f39662a, true, 32702, new Class[]{Uri.class}, Void.TYPE);
            return;
        }
        r.a("enter_personal_detail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("scene_id", "1048").a("enter_from", "advertisement").a("to_user_id", uri.getLastPathSegment()).f34114b);
    }

    @JvmStatic
    public static final void a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f39662a, true, 32700, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f39662a, true, 32700, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        bg.a(new aj(context.hashCode()));
        bg.a(new ah("homepage_hot", context2 instanceof MainActivity));
        SharePrefCache inst = SharePrefCache.inst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
        an<Integer> scrollToProfileGuideState = inst.getScrollToProfileGuideState();
        Intrinsics.checkExpressionValueIsNotNull(scrollToProfileGuideState, "SharePrefCache.inst().scrollToProfileGuideState");
        Integer num = (Integer) scrollToProfileGuideState.c();
        if (num != null && num.intValue() == 0) {
            SharePrefCache inst2 = SharePrefCache.inst();
            Intrinsics.checkExpressionValueIsNotNull(inst2, "SharePrefCache.inst()");
            an<Integer> scrollToProfileGuideState2 = inst2.getScrollToProfileGuideState();
            Intrinsics.checkExpressionValueIsNotNull(scrollToProfileGuideState2, "SharePrefCache.inst().scrollToProfileGuideState");
            scrollToProfileGuideState2.a(1);
        }
    }

    @JvmStatic
    public static final void a(@NotNull String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f39662a, true, 32701, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f39662a, true, 32701, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        Uri parse = Uri.parse(str);
        Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
        String host = parse.getHost();
        String path = parse.getPath();
        CharSequence charSequence = host;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (!z && host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -309425751) {
                if (hashCode == 3599307 && host.equals(AllStoryActivity.f73306b) && path != null && StringsKt.startsWith$default(path, "/profile", false, 2, null)) {
                    a(parse);
                }
            } else if (host.equals("profile")) {
                a(parse);
            }
        }
    }
}
