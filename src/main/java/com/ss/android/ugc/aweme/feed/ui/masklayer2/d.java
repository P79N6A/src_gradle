package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.u.aa;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeReasonItemLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mReasonView", "Landroid/widget/TextView;", "update", "", "vo", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeReasonVO;", "dislikeReasonAction", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeReasonAction;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46762a;

    /* renamed from: b  reason: collision with root package name */
    TextView f46763b = ((TextView) findViewById(C0906R.id.cao));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46764a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f46765b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f46766c;

        a(c cVar, g gVar) {
            this.f46765b = cVar;
            this.f46766c = gVar;
        }

        public final void onClick(View view) {
            String str;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f46764a, false, 43445, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f46764a, false, 43445, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            c cVar = this.f46765b;
            if (cVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
                g gVar = this.f46766c;
                if (PatchProxy.isSupport(new Object[]{view2, gVar}, cVar, c.f46760a, false, 43437, new Class[]{View.class, g.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2, gVar}, cVar, c.f46760a, false, 43437, new Class[]{View.class, g.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(view2, NotifyType.VIBRATE);
                    Intrinsics.checkParameterIsNotNull(gVar, "dislikeReasonVO");
                    if (PatchProxy.isSupport(new Object[]{gVar}, cVar, c.f46760a, false, 43438, new Class[]{g.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{gVar}, cVar, c.f46760a, false, 43438, new Class[]{g.class}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.app.d.d a2 = new com.ss.android.ugc.aweme.app.d.d().a("enter_from", cVar.f46761b.f46753d);
                        Aweme aweme = cVar.f46761b.f46752c;
                        String str2 = null;
                        if (aweme != null) {
                            str = aweme.getAid();
                        } else {
                            str = null;
                        }
                        com.ss.android.ugc.aweme.app.d.d a3 = a2.a("group_id", str);
                        Aweme aweme2 = cVar.f46761b.f46752c;
                        if (aweme2 != null) {
                            str2 = aweme2.getAuthorUid();
                        }
                        r.a("block_videos", (Map) a3.a("author_id", str2).a("log_pb", ai.a().a(aa.c(cVar.f46761b.f46752c))).a("reason_id", gVar.f46772b).a("reason_text", gVar.f46773c).a("music_id", aa.k(cVar.f46761b.f46752c)).a("enter_method", "long_press").f34114b);
                    }
                    f fVar = new f();
                    fVar.a(new e());
                    fVar.a(cVar);
                    fVar.a(cVar.f46761b.f46752c, gVar.f46772b);
                    cVar.f46761b.b();
                }
            }
        }
    }

    public d(@Nullable Context context) {
        super(context);
        View.inflate(getContext(), C0906R.layout.wh, this);
        int dip2Px = (int) UIUtils.dip2Px(getContext(), 16.0f);
        setPadding(dip2Px, 0, dip2Px, 0);
        setOrientation(1);
        setBackgroundResource(2130838077);
    }
}
