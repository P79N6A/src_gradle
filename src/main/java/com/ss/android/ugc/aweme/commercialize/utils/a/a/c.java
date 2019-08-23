package com.ss.android.ugc.aweme.commercialize.utils.a.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/router/web/GPWebPage;", "", "()V", "GOOGLE_PLAY_MARKET_H5_URL", "", "open", "", "context", "Landroid/content/Context;", "packageName", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39651a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f39652b = new c();

    private c() {
    }

    @JvmStatic
    public static final boolean a(@Nullable Context context, @Nullable String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f39651a, true, 32715, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f39651a, true, 32715, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (str2 == null) {
            return false;
        } else {
            Intent intent = new Intent(context2, CrossPlatformActivity.class);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + str2));
            intent.putExtra("hide_nav_bar", true);
            intent.putExtra("hide_status_bar", true);
            return g.a(context2, intent);
        }
    }
}
