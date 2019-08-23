package com.ss.android.ugc.aweme.im.sdk.relations;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.SearchHeadListAdapter;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bJ\u0006\u0010\u001d\u001a\u00020\u0018J\u0010\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/SearchHeadListView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleRes", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAdapter", "Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/SearchHeadListAdapter;", "mClearBtn", "Landroid/widget/ImageView;", "mMaxWidth", "mMemberListViewModel", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "mRootView", "Landroid/view/View;", "mSearchEt", "Landroid/widget/EditText;", "mSearchIcon", "clearText", "", "refresh", "userList", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "reset", "setListViewModel", "viewModel", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchHeadListView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52014a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f52015b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f52016c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f52017d;

    /* renamed from: e  reason: collision with root package name */
    public final SearchHeadListAdapter f52018e;

    /* renamed from: f  reason: collision with root package name */
    public BaseMemberListViewModel f52019f;
    private final View g;
    private final EditText h;
    private final int i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<IMContact, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchHeadListView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SearchHeadListView searchHeadListView) {
            super(1);
            this.this$0 = searchHeadListView;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IMContact) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull IMContact iMContact) {
            if (PatchProxy.isSupport(new Object[]{iMContact}, this, changeQuickRedirect, false, 52796, new Class[]{IMContact.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iMContact}, this, changeQuickRedirect, false, 52796, new Class[]{IMContact.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(iMContact, AdvanceSetting.NETWORK_TYPE);
            BaseMemberListViewModel baseMemberListViewModel = this.this$0.f52019f;
            if (baseMemberListViewModel != null) {
                baseMemberListViewModel.a(iMContact);
            }
            this.this$0.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchHeadListView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(SearchHeadListView searchHeadListView) {
            super(0);
            this.this$0 = searchHeadListView;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52797, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52797, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.f52015b.scrollToPosition(0);
        }
    }

    @JvmOverloads
    public SearchHeadListView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SearchHeadListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52014a, false, 52787, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52014a, false, 52787, new Class[0], Void.TYPE);
            return;
        }
        this.h.setText("");
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f52014a, false, 52788, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52014a, false, 52788, new Class[0], Void.TYPE);
            return;
        }
        this.h.clearFocus();
        Context context = getContext();
        if (context != null) {
            com.ss.android.ugc.aweme.common.ui.b.a((Activity) context, (View) this.h);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    public final void setListViewModel(@Nullable BaseMemberListViewModel baseMemberListViewModel) {
        this.f52019f = baseMemberListViewModel;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchHeadListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        View inflate = View.inflate(context, C0906R.layout.a84, this);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "View.inflate(context, R.…t_search_head_list, this)");
        this.g = inflate;
        View findViewById = this.g.findViewById(C0906R.id.an7);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R.id.head_list)");
        this.f52015b = (RecyclerView) findViewById;
        View findViewById2 = this.g.findViewById(C0906R.id.b4s);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.findViewById(R.id.iv_search)");
        this.f52016c = (ImageView) findViewById2;
        View findViewById3 = this.g.findViewById(C0906R.id.cla);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.findViewById(R.id.search_et)");
        this.h = (EditText) findViewById3;
        View findViewById4 = this.g.findViewById(C0906R.id.ns);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mRootView.findViewById(R.id.btn_clear)");
        this.f52017d = (ImageView) findViewById4;
        this.f52018e = new SearchHeadListAdapter((LifecycleOwner) context, new a(this));
        this.i = UIUtils.getScreenWidth(context) - ((int) UIUtils.dip2Px(context, 95.0f));
        RecyclerView recyclerView = this.f52015b;
        FixedSizeLinearLayoutManager fixedSizeLinearLayoutManager = new FixedSizeLinearLayoutManager(context, 0, true);
        fixedSizeLinearLayoutManager.f51973b = this.i;
        recyclerView.setLayoutManager(fixedSizeLinearLayoutManager);
        recyclerView.setAdapter(this.f52018e);
        recyclerView.setHorizontalScrollBarEnabled(true);
        recyclerView.setScrollBarStyle(33554432);
        this.h.setOnKeyListener(new View.OnKeyListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52020a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SearchHeadListView f52021b;

            {
                this.f52021b = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                String str;
                boolean z;
                KeyEvent keyEvent2 = keyEvent;
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), keyEvent2}, this, f52020a, false, 52791, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), keyEvent2}, this, f52020a, false, 52791, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                }
                switch (i) {
                    case 66:
                        this.f52021b.b();
                        return true;
                    case 67:
                        Intrinsics.checkExpressionValueIsNotNull(keyEvent2, "event");
                        if (keyEvent.getAction() == 1) {
                            BaseMemberListViewModel baseMemberListViewModel = this.f52021b.f52019f;
                            if (baseMemberListViewModel != null) {
                                str = baseMemberListViewModel.f();
                            } else {
                                str = null;
                            }
                            CharSequence charSequence = str;
                            if (charSequence == null || charSequence.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                BaseMemberListViewModel baseMemberListViewModel2 = this.f52021b.f52019f;
                                if (baseMemberListViewModel2 != null) {
                                    baseMemberListViewModel2.g();
                                }
                                return true;
                            }
                        }
                        return false;
                    default:
                        return false;
                }
            }
        });
        this.h.addTextChangedListener(new TextWatcher(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52022a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SearchHeadListView f52023b;

            public final void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
                CharSequence charSequence2 = charSequence;
                if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f52022a, false, 52793, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f52022a, false, 52793, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(charSequence2, NotifyType.SOUND);
            }

            {
                this.f52023b = r1;
            }

            public final void afterTextChanged(@Nullable Editable editable) {
                String str;
                boolean z;
                if (PatchProxy.isSupport(new Object[]{editable}, this, f52022a, false, 52792, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f52022a, false, 52792, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                if (editable != null) {
                    str = editable.toString();
                } else {
                    str = null;
                }
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    BaseMemberListViewModel baseMemberListViewModel = this.f52023b.f52019f;
                    if (baseMemberListViewModel != null) {
                        baseMemberListViewModel.b(0);
                    }
                    BaseMemberListViewModel baseMemberListViewModel2 = this.f52023b.f52019f;
                    if (baseMemberListViewModel2 != null) {
                        baseMemberListViewModel2.a();
                    }
                } else {
                    BaseMemberListViewModel baseMemberListViewModel3 = this.f52023b.f52019f;
                    if (baseMemberListViewModel3 != null) {
                        baseMemberListViewModel3.b(1);
                    }
                    BaseMemberListViewModel baseMemberListViewModel4 = this.f52023b.f52019f;
                    if (baseMemberListViewModel4 != null) {
                        baseMemberListViewModel4.a(str);
                    }
                }
            }

            public final void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
                CharSequence charSequence2 = charSequence;
                if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f52022a, false, 52794, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f52022a, false, 52794, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(charSequence, NotifyType.SOUND);
                if (TextUtils.isEmpty(charSequence) || this.f52023b.f52017d.getVisibility() != 8) {
                    if (TextUtils.isEmpty(charSequence) && this.f52023b.f52017d.getVisibility() == 0) {
                        this.f52023b.f52017d.setVisibility(8);
                    }
                    return;
                }
                this.f52023b.f52017d.setVisibility(0);
            }
        });
        this.f52017d.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52024a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SearchHeadListView f52025b;

            {
                this.f52025b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f52024a, false, 52795, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f52024a, false, 52795, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                this.f52025b.a();
            }
        });
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchHeadListView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
