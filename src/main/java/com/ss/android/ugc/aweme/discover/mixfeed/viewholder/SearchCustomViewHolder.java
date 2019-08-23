package com.ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchCustomViewHolder;", "Lcom/ss/android/ugc/aweme/discover/adapter/AbsSearchViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mTitle", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "bind", "", "title", "", "getView", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchCustomViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f42585c;

    /* renamed from: e  reason: collision with root package name */
    public static final a f42586e = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public DmtTextView f42587d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchCustomViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchCustomViewHolder;", "parent", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42588a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @NotNull
    public final View a() {
        if (PatchProxy.isSupport(new Object[0], this, f42585c, false, 36891, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f42585c, false, 36891, new Class[0], View.class);
        }
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchCustomViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f42587d = (DmtTextView) view.findViewById(C0906R.id.cll);
        View findViewById = view.findViewById(C0906R.id.clq);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById<Vi….search_mix_view_all_txt)");
        findViewById.setVisibility(8);
        View findViewById2 = view.findViewById(C0906R.id.b4k);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById<View>(R.id.iv_right_icon)");
        findViewById2.setVisibility(8);
    }
}
