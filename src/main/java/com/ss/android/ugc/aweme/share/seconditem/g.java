package com.ss.android.ugc.aweme.share.seconditem;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/share/seconditem/InsightsItemView;", "Lcom/ss/android/ugc/aweme/share/seconditem/AnimItemView;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "mShareDialog", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$SharePage;", "displayInsightsItemAnimation", "", "jumpToInsightsPage", "awemeInsightUrl", "", "onClick", "v", "Landroid/view/View;", "setDialog", "shareDialog", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g extends a implements View.OnClickListener {
    public static ChangeQuickRedirect g;
    public static final a h = new a((byte) 0);
    private IShareService.SharePage i;
    @Nullable
    private Aweme j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/share/seconditem/InsightsItemView$Companion;", "", "()V", "buildInsightsItemView", "Lcom/ss/android/ugc/aweme/share/seconditem/InsightsItemView;", "context", "Landroid/content/Context;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "shareDialog", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$SharePage;", "enterFrom", "", "canShowInsights", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65284a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Nullable
    public final Aweme getAweme() {
        return this.j;
    }

    public final void setAweme(@Nullable Aweme aweme) {
        this.j = aweme;
    }

    public final void setDialog(@NotNull IShareService.SharePage sharePage) {
        IShareService.SharePage sharePage2 = sharePage;
        if (PatchProxy.isSupport(new Object[]{sharePage2}, this, g, false, 73712, new Class[]{IShareService.SharePage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sharePage2}, this, g, false, 73712, new Class[]{IShareService.SharePage.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(sharePage2, "shareDialog");
        this.i = sharePage2;
    }

    public final void onClick(@Nullable View view) {
        String str;
        boolean z;
        if (PatchProxy.isSupport(new Object[]{view}, this, g, false, 73713, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, g, false, 73713, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Aweme aweme = this.j;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (com.ss.android.g.a.b()) {
                String str3 = h.f65285a;
                Object[] objArr = new Object[1];
                Aweme aweme2 = this.j;
                if (aweme2 == null) {
                    Intrinsics.throwNpe();
                }
                objArr[0] = aweme2.getAid();
                str2 = String.format(str3, Arrays.copyOf(objArr, 1));
                Intrinsics.checkExpressionValueIsNotNull(str2, "java.lang.String.format(format, *args)");
            } else if (com.ss.android.g.a.c()) {
                String str4 = h.f65286b;
                Object[] objArr2 = new Object[1];
                Aweme aweme3 = this.j;
                if (aweme3 == null) {
                    Intrinsics.throwNpe();
                }
                objArr2[0] = aweme3.getAid();
                str2 = String.format(str4, Arrays.copyOf(objArr2, 1));
                Intrinsics.checkExpressionValueIsNotNull(str2, "java.lang.String.format(format, *args)");
            }
            String str5 = str2;
            if (!TextUtils.isEmpty(str5)) {
                r.a("click_insight", (Map) d.a().a("enter_from", "video_more").f34114b);
                r.a("enter_insight_detail", (Map) d.a().a("enter_from", "video_more").f34114b);
                if (str5 == null) {
                    Intrinsics.throwNpe();
                }
                if (PatchProxy.isSupport(new Object[]{str5}, this, g, false, 73714, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str5}, this, g, false, 73714, new Class[]{String.class}, Void.TYPE);
                } else {
                    Intent intent = new Intent(getContext(), CrossPlatformActivity.class);
                    intent.setData(Uri.parse(str5));
                    intent.putExtra("bundle_user_webview_title", true);
                    intent.putExtra("hide_nav_bar", true);
                    IShareService.SharePage sharePage = this.i;
                    if (sharePage == null) {
                        Intrinsics.throwNpe();
                    }
                    sharePage.getContext().startActivity(intent);
                }
                IShareService.SharePage sharePage2 = this.i;
                if (sharePage2 == null) {
                    Intrinsics.throwNpe();
                }
                sharePage2.dismiss();
            }
        }
    }
}
