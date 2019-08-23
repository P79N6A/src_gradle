package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/decorator/internal/Delegate;", "Lcom/bytedance/jedi/ext/adapter/decorator/internal/IDelegate;", "()V", "fullSpan", "", "getFullSpan", "()Z", "setFullSpan", "(Z)V", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "getHolder", "()Landroid/support/v7/widget/RecyclerView$ViewHolder;", "setHolder", "(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public abstract class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f21452a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private View f21453b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView.ViewHolder f21454c;

    @Nullable
    public final View b() {
        return this.f21453b;
    }

    @Nullable
    public final RecyclerView.ViewHolder c() {
        return this.f21454c;
    }

    public final boolean a() {
        return this.f21452a;
    }

    public boolean d() {
        if (b() != null) {
            return true;
        }
        return false;
    }

    public int e() {
        if (d()) {
            return 1;
        }
        return 0;
    }

    public final void a(@Nullable RecyclerView.ViewHolder viewHolder) {
        this.f21454c = viewHolder;
    }

    public final void a(boolean z) {
        this.f21452a = true;
    }
}
