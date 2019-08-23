package com.ss.android.ugc.aweme.app.services;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.report.a;
import com.ss.android.ugc.aweme.story.api.e;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J?\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/ReportService;", "Lcom/ss/android/ugc/aweme/story/api/IReportService;", "()V", "report", "", "activity", "Landroid/app/Activity;", "reportType", "", "itemId", "uid", "isSpam", "", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class z implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34303a;

    public final void a(@Nullable Activity activity, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{activity, str, str2, str3, bool}, this, f34303a, false, 23666, new Class[]{Activity.class, String.class, String.class, String.class, Boolean.class}, Void.TYPE)) {
            Object[] objArr = {activity, str, str2, str3, bool};
            PatchProxy.accessDispatch(objArr, this, f34303a, false, 23666, new Class[]{Activity.class, String.class, String.class, String.class, Boolean.class}, Void.TYPE);
            return;
        }
        if (bool != null) {
            z = bool.booleanValue();
        }
        a.a(activity, str, str2, str3, "", z, null);
    }
}
