package com.ss.android.ugc.aweme.shortvideo.music;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a.k;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.aweme.tools.music.b.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/MusicLibViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onItemClickListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;)V", "itemImageView", "Lcom/ss/android/ugc/aweme/themechange/base/AVDmtImageTextView;", "getOnItemClickListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "Companion", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MusicLibViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68400b = new a((byte) 0);
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final k f68401a;

    /* renamed from: c  reason: collision with root package name */
    private AVDmtImageTextView f68402c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/MusicLibViewHolder$Companion;", "", "()V", "createView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68409a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicLibViewHolder(@NotNull final View view, @Nullable k kVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f68401a = kVar;
        this.f68402c = (AVDmtImageTextView) view.findViewById(C0906R.id.ay5);
        if (b.a() == 0) {
            AVDmtImageTextView aVDmtImageTextView = this.f68402c;
            if (aVDmtImageTextView != null) {
                aVDmtImageTextView.setOnClickListener(new View.OnClickListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f68403a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ MusicLibViewHolder f68404b;

                    {
                        this.f68404b = r1;
                    }

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f68403a, false, 77747, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f68403a, false, 77747, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        k kVar = this.f68404b.f68401a;
                        if (kVar != null) {
                            kVar.a(view, this.f68404b.getAdapterPosition());
                        }
                    }
                });
            }
        } else {
            AVDmtImageTextView aVDmtImageTextView2 = this.f68402c;
            if (aVDmtImageTextView2 != null) {
                aVDmtImageTextView2.setOnClickListener(new View.OnClickListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f68406a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ MusicLibViewHolder f68407b;

                    {
                        this.f68407b = r1;
                    }

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f68406a, false, 77748, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f68406a, false, 77748, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        k kVar = this.f68407b.f68401a;
                        if (kVar != null) {
                            kVar.a(view, this.f68407b.getAdapterPosition());
                        }
                    }
                });
            }
        }
    }
}
