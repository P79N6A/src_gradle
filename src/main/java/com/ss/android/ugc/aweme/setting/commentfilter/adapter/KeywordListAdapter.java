package com.ss.android.ugc.aweme.setting.commentfilter.adapter;

import android.content.Context;
import android.os.IBinder;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.setting.commentfilter.viewholder.AddKeywordViewHolder;
import com.ss.android.ugc.aweme.setting.commentfilter.viewholder.KeywordViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010$\u001a\u00020\u001bH\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001bH\u0016J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u001bH\u0016J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001bH\u0016J\u0006\u0010.\u001a\u00020(R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010#¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/commentfilter/adapter/KeywordListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "mContext", "Landroid/content/Context;", "container", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "mAdding", "", "getMContext", "()Landroid/content/Context;", "mData", "", "", "getMData", "()Ljava/util/List;", "setMData", "(Ljava/util/List;)V", "mShowing", "getMShowing", "()Z", "setMShowing", "(Z)V", "mShowingPosition", "", "getMShowingPosition", "()I", "setMShowingPosition", "(I)V", "mShowingView", "getMShowingView", "setMShowingView", "(Landroid/view/View;)V", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "reset", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class KeywordListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63887a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public List<String> f63888b = CollectionsKt.mutableListOf("");

    /* renamed from: c  reason: collision with root package name */
    public boolean f63889c;

    /* renamed from: d  reason: collision with root package name */
    public int f63890d = -1;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public View f63891e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f63892f;
    @NotNull
    public final Context g;
    @NotNull
    public final View h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/ugc/aweme/setting/commentfilter/adapter/KeywordListAdapter$onCreateViewHolder$1", "Lcom/ss/android/ugc/aweme/setting/commentfilter/viewholder/Listener;", "cancelShowing", "", "isShowing", "", "position", "", "onClick", "setShowing", "view", "Landroid/view/View;", "update", "word", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements com.ss.android.ugc.aweme.setting.commentfilter.viewholder.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63893a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KeywordListAdapter f63894b;

        public final void a() {
            this.f63894b.f63889c = false;
            this.f63894b.f63890d = -1;
        }

        a(KeywordListAdapter keywordListAdapter) {
            this.f63894b = keywordListAdapter;
        }

        public final void b(int i) {
            IBinder iBinder;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f63893a, false, 72184, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f63893a, false, 72184, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            View view = this.f63894b.f63891e;
            if (view != null) {
                view.clearFocus();
            }
            this.f63894b.f63889c = false;
            Object systemService = this.f63894b.g.getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View view2 = this.f63894b.f63891e;
                if (view2 != null) {
                    iBinder = view2.getWindowToken();
                } else {
                    iBinder = null;
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                this.f63894b.f63888b.remove(i);
                this.f63894b.notifyItemRemoved(i);
                KeywordListAdapter keywordListAdapter = this.f63894b;
                keywordListAdapter.notifyItemRangeChanged(i, keywordListAdapter.getItemCount() - i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }

        public final boolean a(int i) {
            IBinder iBinder;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f63893a, false, 72182, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f63893a, false, 72182, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (!this.f63894b.f63889c && (this.f63894b.f63890d == -1 || this.f63894b.f63890d == i)) {
                return false;
            } else {
                View view = this.f63894b.f63891e;
                if (view != null) {
                    view.clearFocus();
                }
                Object systemService = this.f63894b.g.getSystemService("input_method");
                if (systemService != null) {
                    InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                    View view2 = this.f63894b.f63891e;
                    if (view2 != null) {
                        iBinder = view2.getWindowToken();
                    } else {
                        iBinder = null;
                    }
                    inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                    return true;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        }

        public final void a(int i, @NotNull View view) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view}, this, f63893a, false, 72181, new Class[]{Integer.TYPE, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view}, this, f63893a, false, 72181, new Class[]{Integer.TYPE, View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f63894b.f63891e = view;
            this.f63894b.f63889c = true;
            this.f63894b.f63890d = i;
        }

        public final void a(int i, @NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f63893a, false, 72183, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f63893a, false, 72183, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "word");
            this.f63894b.f63888b.set(i, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63895a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KeywordListAdapter f63896b;

        b(KeywordListAdapter keywordListAdapter) {
            this.f63896b = keywordListAdapter;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f63895a, false, 72185, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63895a, false, 72185, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f63896b.f63888b.size() == 51) {
                Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                com.bytedance.ies.dmt.ui.d.a.c(view.getContext(), (int) C0906R.string.v9, 1).a();
                return;
            }
            this.f63896b.f63888b.add(1, "");
            this.f63896b.notifyItemInserted(1);
            this.f63896b.notifyItemRangeChanged(1, this.f63896b.getItemCount() - 1);
            this.f63896b.f63892f = true;
            this.f63896b.f63889c = false;
            this.f63896b.f63890d = -1;
        }
    }

    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63887a, false, 72180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63887a, false, 72180, new Class[0], Void.TYPE);
            return;
        }
        this.f63888b = CollectionsKt.mutableListOf("");
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f63887a, false, 72178, new Class[0], Integer.TYPE)) {
            return this.f63888b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63887a, false, 72178, new Class[0], Integer.TYPE)).intValue();
    }

    public KeywordListAdapter(@NotNull Context context, @NotNull View view) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "container");
        this.g = context;
        this.h = view;
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f63887a, false, 72177, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f63887a, false, 72177, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.hg, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…ords_edit, parent, false)");
            return new KeywordViewHolder(inflate, new a(this));
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.hf, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(pare…words_add, parent, false)");
        return new AddKeywordViewHolder(inflate2, new b(this));
    }

    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f63887a, false, 72179, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f63887a, false, 72179, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        if (viewHolder2 instanceof KeywordViewHolder) {
            KeywordViewHolder keywordViewHolder = (KeywordViewHolder) viewHolder2;
            String str = this.f63888b.get(i2);
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, keywordViewHolder, KeywordViewHolder.f63916a, false, 72202, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                KeywordViewHolder keywordViewHolder2 = keywordViewHolder;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, keywordViewHolder2, KeywordViewHolder.f63916a, false, 72202, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(str, NotifyType.SOUND);
                keywordViewHolder.f63921f = i2;
                CharSequence charSequence = str;
                keywordViewHolder.f63920e.setText(charSequence);
                if (Intrinsics.areEqual((Object) StringsKt.trimStart(charSequence).toString(), (Object) "")) {
                    TextView textView = keywordViewHolder.f63920e;
                    Context context = keywordViewHolder.f63920e.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "textView.context");
                    textView.setTextColor(context.getResources().getColor(C0906R.color.k));
                    keywordViewHolder.f63920e.setText(keywordViewHolder.f63920e.getContext().getString(C0906R.string.du4));
                } else {
                    TextView textView2 = keywordViewHolder.f63920e;
                    Context context2 = keywordViewHolder.f63920e.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "textView.context");
                    textView2.setTextColor(context2.getResources().getColor(C0906R.color.a6k));
                }
                keywordViewHolder.f63919d.setText(charSequence);
            }
            if (this.f63892f && i2 == 1) {
                keywordViewHolder.a();
                this.f63892f = false;
            }
        }
    }
}
