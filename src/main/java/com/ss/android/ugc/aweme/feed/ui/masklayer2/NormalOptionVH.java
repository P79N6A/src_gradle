package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/NormalOptionVH;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mDescLayout", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionDescItemLayout;", "mOptionAction", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionAction;", "update", "", "item", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/NormalItem;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class NormalOptionVH extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46738a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f46739d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    OptionDescItemLayout f46740b;

    /* renamed from: c  reason: collision with root package name */
    public o f46741c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/NormalOptionVH$Companion;", "", "()V", "newInstance", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/NormalOptionVH;", "parent", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46744a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NormalOptionVH(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(C0906R.id.a3q);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.desc_layout)");
        this.f46740b = (OptionDescItemLayout) findViewById;
        view.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46742a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ NormalOptionVH f46743b;

            {
                this.f46743b = r1;
            }

            public final void onClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f46742a, false, 43464, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f46742a, false, 43464, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                o oVar = this.f46743b.f46741c;
                if (oVar != null) {
                    Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
                    if (PatchProxy.isSupport(new Object[]{view2}, oVar, o.f46786d, false, 43469, new Class[]{View.class}, Void.TYPE)) {
                        o oVar2 = oVar;
                        PatchProxy.accessDispatch(new Object[]{view2}, oVar2, o.f46786d, false, 43469, new Class[]{View.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(view2, NotifyType.VIBRATE);
                        oVar.a(view2);
                        oVar.f46787e.b();
                    }
                }
            }
        });
    }
}
