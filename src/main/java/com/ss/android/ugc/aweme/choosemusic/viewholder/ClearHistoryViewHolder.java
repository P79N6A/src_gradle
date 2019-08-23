package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.choosemusic.c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/choosemusic/viewholder/ClearHistoryViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "clearView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getClearView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "setClearView", "(Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;)V", "bind", "", "history", "Lcom/ss/android/ugc/aweme/music/model/MusicSearchHistory;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ClearHistoryViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36059a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public DmtTextView f36060b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36061a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f36062b = new a();

        a() {
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36061a, false, 26870, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36061a, false, 26870, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            c.c().a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClearHistoryViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(C0906R.id.d_i);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_clear_all)");
        this.f36060b = (DmtTextView) findViewById;
    }
}
