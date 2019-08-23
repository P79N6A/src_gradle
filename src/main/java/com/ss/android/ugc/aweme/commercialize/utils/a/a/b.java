package com.ss.android.ugc.aweme.commercialize.utils.a.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.commercialize.utils.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/router/web/FormPage;", "", "()V", "open", "", "context", "Landroid/content/Context;", "formUrl", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "clickFrom", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39649a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f39650b = new b();

    private b() {
    }

    @JvmStatic
    public static final boolean a(@Nullable Context context, @Nullable String str, @Nullable Aweme aweme, int i) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, aweme, Integer.valueOf(i)}, null, f39649a, true, 32714, new Class[]{Context.class, String.class, Aweme.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2, aweme, Integer.valueOf(i)}, null, f39649a, true, 32714, new Class[]{Context.class, String.class, Aweme.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null || aweme == null || !aweme.isAd() || TextUtils.isEmpty(str2)) {
            return false;
        } else {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                return false;
            }
            Intrinsics.checkExpressionValueIsNotNull(awemeRawAd, "aweme.awemeRawAd ?: return false");
            Intent a2 = p.a(context);
            a2.putExtra(PushConstants.WEB_URL, str2);
            Long creativeId = awemeRawAd.getCreativeId();
            Intrinsics.checkExpressionValueIsNotNull(creativeId, "ad.creativeId");
            a2.putExtra("ad_id", creativeId.longValue());
            a2.putExtra("ad_type", awemeRawAd.getType());
            a2.putExtra("ad_system_origin", awemeRawAd.getSystemOrigin());
            Long creativeId2 = awemeRawAd.getCreativeId();
            Intrinsics.checkExpressionValueIsNotNull(creativeId2, "ad.creativeId");
            a2.putExtra("ad_id", creativeId2.longValue());
            a2.putExtra("bundle_download_app_log_extra", awemeRawAd.getLogExtra());
            a2.putExtra("aweme_id", aweme.getAid());
            a2.putExtra("click_from", i);
            return g.a(context2, a2);
        }
    }
}
