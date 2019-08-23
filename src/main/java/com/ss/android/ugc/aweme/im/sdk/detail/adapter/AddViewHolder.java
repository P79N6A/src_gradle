package com.ss.android.ugc.aweme.im.sdk.detail.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.BaseViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.b.a.b;
import com.ss.android.ugc.aweme.im.sdk.utils.au;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\rH\u0014R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/adapter/AddViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/BaseViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMemberItem;", "parent", "Landroid/view/ViewGroup;", "layoutId", "", "(Landroid/view/ViewGroup;I)V", "mAddMemberView", "Landroid/widget/ImageView;", "mAlphaAnimTouchHandle", "Lcom/ss/android/ugc/aweme/im/sdk/utils/TouchAnimationUtils$AlphaAnimTouchHandle;", "bind", "", "memberItem", "position", "initListeners", "initViewRefs", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AddViewHolder extends BaseViewHolder<b> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f51407c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f51408d;

    /* renamed from: e  reason: collision with root package name */
    private au.a f51409e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51410a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f51411b;

        a(b bVar) {
            this.f51411b = bVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f51410a, false, 52024, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51410a, false, 52024, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            a.a(4, ((com.ss.android.ugc.aweme.im.sdk.detail.a.a) this.f51411b).f51405a, 220);
            z.a().c(((com.ss.android.ugc.aweme.im.sdk.detail.a.a) this.f51411b).f51405a, "group_add_click");
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51407c, false, 52021, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51407c, false, 52021, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        View findViewById = this.itemView.findViewById(C0906R.id.b39);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.iv_member_action)");
        this.f51408d = (ImageView) findViewById;
        ImageView imageView = this.f51408d;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddMemberView");
        }
        imageView.setImageResource(2130838994);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f51407c, false, 52022, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51407c, false, 52022, new Class[0], Void.TYPE);
            return;
        }
        au.a h = au.a.h();
        Intrinsics.checkExpressionValueIsNotNull(h, "TouchAnimationUtils.AlphaAnimTouchHandle.obtain()");
        this.f51409e = h;
        au.a aVar = this.f51409e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAlphaAnimTouchHandle");
        }
        View[] viewArr = new View[1];
        ImageView imageView = this.f51408d;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddMemberView");
        }
        viewArr[0] = imageView;
        aVar.a(viewArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddViewHolder(@NotNull ViewGroup viewGroup, int i) {
        super(viewGroup, (int) C0906R.layout.vr);
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
    }

    public final /* synthetic */ void a(Object obj, int i) {
        b bVar = (b) obj;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i)}, this, f51407c, false, 52023, new Class[]{b.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i)}, this, f51407c, false, 52023, new Class[]{b.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(bVar, i);
        if (bVar instanceof com.ss.android.ugc.aweme.im.sdk.detail.a.a) {
            CharSequence charSequence = ((com.ss.android.ugc.aweme.im.sdk.detail.a.a) bVar).f51405a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (!z) {
                ImageView imageView = this.f51408d;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAddMemberView");
                }
                imageView.setOnClickListener(new a(bVar));
            }
        }
    }
}
