package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.a.e;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J6\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010!\u001a\u0004\u0018\u00010\u0017H\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/discover/widget/SearchCorrectHeadView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "strongContainer", "Landroid/view/ViewGroup;", "tvCorrectStrong", "Lcom/ss/android/ugc/aweme/discover/widget/SearchCorrectTextView;", "tvCorrectWeak", "tvSearchResult", "weakContainer", "bindData", "", "info", "Lcom/ss/android/ugc/aweme/discover/model/QueryCorrectInfo;", "originalKeyWord", "", "getSpannableString", "", "fullString", "highLightString", "init", "mobEvent", "actionType", "correctLevel", "correctKeyWord", "requestId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43322a;

    /* renamed from: b  reason: collision with root package name */
    private SearchCorrectTextView f43323b;

    /* renamed from: c  reason: collision with root package name */
    private SearchCorrectTextView f43324c;

    /* renamed from: d  reason: collision with root package name */
    private SearchCorrectTextView f43325d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f43326e;

    /* renamed from: f  reason: collision with root package name */
    private ViewGroup f43327f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43328a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f43329b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f43330c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ QueryCorrectInfo f43331d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f43332e;

        a(b bVar, String str, QueryCorrectInfo queryCorrectInfo, String str2) {
            this.f43329b = bVar;
            this.f43330c = str;
            this.f43331d = queryCorrectInfo;
            this.f43332e = str2;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f43328a, false, 38277, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f43328a, false, 38277, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            bg.a(new e(this.f43330c, this.f43331d.getCorrectedLevel()));
            this.f43329b.a("click", this.f43331d.getCorrectedLevel(), this.f43331d.getCorrectedKeyword(), this.f43332e, this.f43331d.getRequestId());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private b(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void a(@NotNull QueryCorrectInfo queryCorrectInfo, @NotNull String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{queryCorrectInfo, str}, this, f43322a, false, 38272, new Class[]{QueryCorrectInfo.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{queryCorrectInfo, str}, this, f43322a, false, 38272, new Class[]{QueryCorrectInfo.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(queryCorrectInfo, "info");
        Intrinsics.checkParameterIsNotNull(str, "originalKeyWord");
        if (queryCorrectInfo.getCorrectedLevel() == 2) {
            ViewGroup viewGroup = this.f43326e;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("strongContainer");
            }
            viewGroup.setVisibility(0);
            ViewGroup viewGroup2 = this.f43327f;
            if (viewGroup2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("weakContainer");
            }
            viewGroup2.setVisibility(8);
            SearchCorrectTextView searchCorrectTextView = this.f43323b;
            if (searchCorrectTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvSearchResult");
            }
            searchCorrectTextView.a(C0906R.string.c28, queryCorrectInfo.getCorrectedKeyword());
            SearchCorrectTextView searchCorrectTextView2 = this.f43324c;
            if (searchCorrectTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvCorrectStrong");
            }
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            searchCorrectTextView2.a(C0906R.string.c27, str, context.getResources().getColor(C0906R.color.hs));
            str2 = str;
        } else {
            ViewGroup viewGroup3 = this.f43326e;
            if (viewGroup3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("strongContainer");
            }
            viewGroup3.setVisibility(8);
            ViewGroup viewGroup4 = this.f43327f;
            if (viewGroup4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("weakContainer");
            }
            viewGroup4.setVisibility(0);
            SearchCorrectTextView searchCorrectTextView3 = this.f43325d;
            if (searchCorrectTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvCorrectWeak");
            }
            String correctedKeyword = queryCorrectInfo.getCorrectedKeyword();
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            searchCorrectTextView3.a(C0906R.string.c29, correctedKeyword, context2.getResources().getColor(C0906R.color.hs));
            String correctedKeyword2 = queryCorrectInfo.getCorrectedKeyword();
            Intrinsics.checkExpressionValueIsNotNull(correctedKeyword2, "info.correctedKeyword");
            str2 = correctedKeyword2;
        }
        a("show", queryCorrectInfo.getCorrectedLevel(), queryCorrectInfo.getCorrectedKeyword(), str, queryCorrectInfo.getRequestId());
        setOnClickListener(new a(this, str2, queryCorrectInfo, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[0], this, f43322a, false, 38271, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43322a, false, 38271, new Class[0], Void.TYPE);
            return;
        }
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LayoutInflater.from(getContext()).inflate(C0906R.layout.aqi, this, true);
        View findViewById = findViewById(C0906R.id.di8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.tv_search_result)");
        this.f43323b = (SearchCorrectTextView) findViewById;
        View findViewById2 = findViewById(C0906R.id.da8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.tv_correct_strong)");
        this.f43324c = (SearchCorrectTextView) findViewById2;
        View findViewById3 = findViewById(C0906R.id.da9);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.tv_correct_weak)");
        this.f43325d = (SearchCorrectTextView) findViewById3;
        View findViewById4 = findViewById(C0906R.id.cwb);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.strong_container)");
        this.f43326e = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(C0906R.id.dwv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.weak_container)");
        this.f43327f = (ViewGroup) findViewById5;
    }

    public final void a(String str, int i, String str2, String str3, String str4) {
        String str5;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        if (PatchProxy.isSupport(new Object[]{str6, Integer.valueOf(i), str7, str8, str9}, this, f43322a, false, 38273, new Class[]{String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str6, Integer.valueOf(i), str7, str8, str9};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f43322a, false, 38273, new Class[]{String.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (i == 2) {
            str5 = "strong";
        } else {
            str5 = "weak";
        }
        r.a("search_correction", (Map) d.a().a("action_type", str6).a("correction_type", str5).a("corrected_keyword", str7).a("original_keyword", str8).a("log_pb", str9).f34114b);
    }
}
