package com.bytedance.jedi.ext.adapter.decorator;

import android.support.annotation.IdRes;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J!\u0010\u0012\u001a\u0002H\u0013\"\b\b\u0000\u0010\u0013*\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0015H\u0016R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/decorator/DefaultLoadingView;", "Lcom/bytedance/jedi/ext/adapter/decorator/LoadingView;", "parent", "Landroid/view/ViewGroup;", "onErrorRetry", "Lkotlin/Function0;", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "content", "Landroid/view/View;", "getContent", "()Landroid/view/View;", "content$delegate", "Lkotlin/Lazy;", "itemViewMap", "Landroid/util/SparseArray;", "view", "getView", "findView", "T", "id", "", "(I)Landroid/view/View;", "showLoadingStatus", "status", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f21447a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), PushConstants.CONTENT, "getContent()Landroid/view/View;"))};

    /* renamed from: b  reason: collision with root package name */
    public final Function0<Unit> f21448b;

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f21449c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<View> f21450d = new SparseArray<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.jedi.ext.adapter.decorator.a$a  reason: collision with other inner class name */
    static final class C0200a extends Lambda implements Function0<View> {
        final /* synthetic */ ViewGroup $parent;
        final /* synthetic */ a this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.ext.adapter.decorator.a$a$a  reason: collision with other inner class name */
        static final class C0201a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Function0 f21451a;

            C0201a(Function0 function0) {
                this.f21451a = function0;
            }

            public final void onClick(View view) {
                this.f21451a.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0200a(a aVar, ViewGroup viewGroup) {
            super(0);
            this.this$0 = aVar;
            this.$parent = viewGroup;
        }

        public final View invoke() {
            View inflate = LayoutInflater.from(this.$parent.getContext()).inflate(C0906R.layout.i2, this.$parent, false);
            Function0<Unit> function0 = this.this$0.f21448b;
            if (function0 != null) {
                inflate.findViewById(C0906R.id.d8g).setOnClickListener(new C0201a(function0));
            }
            return inflate;
        }
    }

    private final View b() {
        return (View) this.f21449c.getValue();
    }

    @NotNull
    public final View a() {
        return b();
    }

    private final <T extends View> T b(@IdRes int i) {
        T t = this.f21450d.get(i);
        if (!(t instanceof View)) {
            t = null;
        }
        T t2 = (View) t;
        if (t2 != null) {
            return t2;
        }
        T findViewById = b().findViewById(i);
        this.f21450d.put(i, findViewById);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "content.findViewById<T>(…Map.put(id, it)\n        }");
        return findViewById;
    }

    public final void a(int i) {
        switch (i) {
            case 241:
                b(C0906R.id.d8g).setVisibility(8);
                b(C0906R.id.d8i).setVisibility(8);
                b(C0906R.id.c7k).setVisibility(8);
                return;
            case 242:
                b(C0906R.id.d8g).setVisibility(8);
                b(C0906R.id.d8i).setVisibility(8);
                b(C0906R.id.c7k).setVisibility(0);
                return;
            case 243:
                b(C0906R.id.d8g).setVisibility(8);
                b(C0906R.id.d8i).setVisibility(0);
                b(C0906R.id.c7k).setVisibility(8);
                break;
            case 244:
                b(C0906R.id.d8g).setVisibility(0);
                b(C0906R.id.d8i).setVisibility(8);
                b(C0906R.id.c7k).setVisibility(8);
                return;
        }
    }

    public a(@NotNull ViewGroup viewGroup, @Nullable Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        this.f21448b = function0;
        this.f21449c = LazyKt.lazy(new C0200a(this, viewGroup));
    }
}
