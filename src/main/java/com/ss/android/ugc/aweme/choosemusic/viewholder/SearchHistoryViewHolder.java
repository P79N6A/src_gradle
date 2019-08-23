package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.choosemusic.c.c;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/choosemusic/viewholder/SearchHistoryViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "clearView", "Landroid/widget/ImageView;", "getClearView", "()Landroid/widget/ImageView;", "setClearView", "(Landroid/widget/ImageView;)V", "historyTextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getHistoryTextView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "setHistoryTextView", "(Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;)V", "bind", "", "history", "Lcom/ss/android/ugc/aweme/music/model/MusicSearchHistory;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchHistoryViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36152a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public DmtTextView f36153b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public ImageView f36154c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36155a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicSearchHistory f36156b;

        public a(MusicSearchHistory musicSearchHistory) {
            this.f36156b = musicSearchHistory;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36155a, false, 26966, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36155a, false, 26966, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            c.c().a(this.f36156b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36157a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicSearchHistory f36158b;

        public b(MusicSearchHistory musicSearchHistory) {
            this.f36158b = musicSearchHistory;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36157a, false, 26967, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36157a, false, 26967, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.choosemusic.a.c cVar = new com.ss.android.ugc.aweme.choosemusic.a.c();
            cVar.f35746a = this.f36158b.keyword;
            bg.a(cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchHistoryViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(C0906R.id.dct);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_history)");
        this.f36153b = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.azu);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.iv_clear)");
        this.f36154c = (ImageView) findViewById2;
    }
}
