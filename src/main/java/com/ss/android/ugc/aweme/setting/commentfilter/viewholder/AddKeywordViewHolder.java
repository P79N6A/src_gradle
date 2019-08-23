package com.ss.android.ugc.aweme.setting.commentfilter.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.ui.ai;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/commentfilter/viewholder/AddKeywordViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "listener", "Landroid/view/View$OnClickListener;", "(Landroid/view/View;Landroid/view/View$OnClickListener;)V", "div", "getDiv", "()Landroid/view/View;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "getListener", "()Landroid/view/View$OnClickListener;", "mLastItemClickTime", "", "getMLastItemClickTime", "()J", "setMLastItemClickTime", "(J)V", "getView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AddKeywordViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public long f63909a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final View f63910b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f63911c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final View f63912d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final View.OnClickListener f63913e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddKeywordViewHolder(@NotNull View view, @NotNull View.OnClickListener onClickListener) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        this.f63912d = view;
        this.f63913e = onClickListener;
        View findViewById = this.f63912d.findViewById(C0906R.id.a5q);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.div)");
        this.f63910b = findViewById;
        View findViewById2 = this.f63912d.findViewById(C0906R.id.aq8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.icon)");
        this.f63911c = (ImageView) findViewById2;
        if (a.b()) {
            View view2 = this.f63910b;
            Context context = this.f63912d.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            view2.setBackgroundColor(context.getResources().getColor(C0906R.color.hi));
            this.f63911c.setImageResource(2130839580);
        }
        this.f63912d.setOnTouchListener(new ai(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63914a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AddKeywordViewHolder f63915b;

            {
                this.f63915b = r1;
            }

            public final void b(@NotNull View view, @NotNull MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f63914a, false, 72200, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f63914a, false, 72200, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(motionEvent, "event");
                if (System.currentTimeMillis() - this.f63915b.f63909a >= 500) {
                    this.f63915b.f63909a = System.currentTimeMillis();
                    view.requestFocus();
                    this.f63915b.f63913e.onClick(view);
                }
            }
        });
    }
}
