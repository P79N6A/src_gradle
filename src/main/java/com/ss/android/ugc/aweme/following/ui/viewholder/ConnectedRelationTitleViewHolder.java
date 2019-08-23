package com.ss.android.ugc.aweme.following.ui.viewholder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.ext.adapter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.following.ui.adapter.ConnectedRelationAdapter;
import com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationTitleViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.TitleState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.e;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0016R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewholder/ConnectedRelationTitleViewHolder;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseViewHolder;", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/RelationTitle;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "mTitleViewModel", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationTitleViewModel;", "getMTitleViewModel", "()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationTitleViewModel;", "mTxtTitle", "Landroid/widget/TextView;", "mViewPrivacyReminder", "Landroid/view/View;", "bind", "", "relationTitle", "onCreate", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ConnectedRelationTitleViewHolder extends JediBaseViewHolder<ConnectedRelationTitleViewHolder, e> {
    public static ChangeQuickRedirect g;
    final TextView h;
    public final View i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ConnectedRelationTitleViewHolder f48168b;

        a(ConnectedRelationTitleViewHolder connectedRelationTitleViewHolder) {
            this.f48168b = connectedRelationTitleViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f48167a, false, 45165, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f48167a, false, 45165, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Map hashMap = new HashMap();
            hashMap.put("enter_from", "find_friends");
            r.a("click_privacy_tips", hashMap);
            SharePrefCache inst = SharePrefCache.inst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
            an<String> privacyReminderH5Url = inst.getPrivacyReminderH5Url();
            Intrinsics.checkExpressionValueIsNotNull(privacyReminderH5Url, "SharePrefCache.inst().privacyReminderH5Url");
            String str = (String) privacyReminderH5Url.c();
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent(this.f48168b.i.getContext(), CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", false);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(str));
                this.f48168b.i.getContext().startActivity(intent);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/TitleState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<TitleState, TitleState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ConnectedRelationTitleViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ConnectedRelationTitleViewHolder connectedRelationTitleViewHolder) {
            super(1);
            this.this$0 = connectedRelationTitleViewHolder;
        }

        @NotNull
        public final TitleState invoke(@NotNull TitleState titleState) {
            TitleState titleState2 = titleState;
            if (PatchProxy.isSupport(new Object[]{titleState2}, this, changeQuickRedirect, false, 45166, new Class[]{TitleState.class}, TitleState.class)) {
                return (TitleState) PatchProxy.accessDispatch(new Object[]{titleState2}, this, changeQuickRedirect, false, 45166, new Class[]{TitleState.class}, TitleState.class);
            }
            Intrinsics.checkParameterIsNotNull(titleState2, "$receiver");
            return titleState2.copy((e) this.this$0.e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/following/ui/viewholder/ConnectedRelationTitleViewHolder;", "it", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/RelationTitle;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function2<ConnectedRelationTitleViewHolder, e, Unit> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ConnectedRelationTitleViewHolder) obj, (e) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull ConnectedRelationTitleViewHolder connectedRelationTitleViewHolder, @NotNull e eVar) {
            ConnectedRelationTitleViewHolder connectedRelationTitleViewHolder2 = connectedRelationTitleViewHolder;
            e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{connectedRelationTitleViewHolder2, eVar2}, this, changeQuickRedirect, false, 45169, new Class[]{ConnectedRelationTitleViewHolder.class, e.class}, Void.TYPE)) {
                Object[] objArr = {connectedRelationTitleViewHolder2, eVar2};
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 45169, new Class[]{ConnectedRelationTitleViewHolder.class, e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(connectedRelationTitleViewHolder2, "$receiver");
            Intrinsics.checkParameterIsNotNull(eVar2, AdvanceSetting.NETWORK_TYPE);
            if (PatchProxy.isSupport(new Object[]{eVar2}, connectedRelationTitleViewHolder, ConnectedRelationTitleViewHolder.g, false, 45164, new Class[]{e.class}, Void.TYPE)) {
                ConnectedRelationTitleViewHolder connectedRelationTitleViewHolder3 = connectedRelationTitleViewHolder;
                PatchProxy.accessDispatch(new Object[]{eVar2}, connectedRelationTitleViewHolder3, ConnectedRelationTitleViewHolder.g, false, 45164, new Class[]{e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar2, "relationTitle");
            connectedRelationTitleViewHolder2.h.setText(eVar2.f48214c);
            AbTestManager a2 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
            if (!a2.bA() || ((e) connectedRelationTitleViewHolder.e()).f48213b != ConnectedRelationAdapter.a.a()) {
                connectedRelationTitleViewHolder2.i.setVisibility(8);
                return;
            }
            connectedRelationTitleViewHolder2.i.setVisibility(0);
            connectedRelationTitleViewHolder2.i.setOnClickListener(new a(connectedRelationTitleViewHolder2));
        }
    }

    public final void j() {
        ConnectedRelationTitleViewModel connectedRelationTitleViewModel;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 45163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 45163, new Class[0], Void.TYPE);
            return;
        }
        super.j();
        if (PatchProxy.isSupport(new Object[0], this, g, false, 45162, new Class[0], ConnectedRelationTitleViewModel.class)) {
            connectedRelationTitleViewModel = (ConnectedRelationTitleViewModel) PatchProxy.accessDispatch(new Object[0], this, g, false, 45162, new Class[0], ConnectedRelationTitleViewModel.class);
        } else {
            Function1 bVar = new b(this);
            Class<ConnectedRelationTitleViewModel> cls = ConnectedRelationTitleViewModel.class;
            com.bytedance.jedi.ext.adapter.b g2 = g();
            if (g2 != null) {
                g a2 = g.a.a(r_(), g2.b());
                JediViewModel jediViewModel = (JediViewModel) a2.a(getClass().getName() + '_' + cls.getName(), cls);
                n a3 = jediViewModel.f2282c.a(ConnectedRelationTitleViewModel.class);
                if (a3 != null) {
                    a3.binding(jediViewModel);
                }
                jediViewModel.a(bVar);
                connectedRelationTitleViewModel = (ConnectedRelationTitleViewModel) jediViewModel;
            } else {
                throw new IllegalStateException("proxy not bound to viewHolder yet");
            }
        }
        Disposable unused = a(connectedRelationTitleViewModel, a.INSTANCE, c(), false, c.INSTANCE);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConnectedRelationTitleViewHolder(@org.jetbrains.annotations.NotNull android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690217(0x7f0f02e9, float:1.9009471E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "LayoutInflater.from(pare…itle_item, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            r3.<init>(r4)
            android.view.View r4 = r3.itemView
            r0 = 2131171193(0x7f071779, float:1.7956766E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.txt_tips)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.h = r4
            android.view.View r4 = r3.itemView
            r0 = 2131169147(0x7f070f7b, float:1.7952616E38)
            android.view.View r4 = r4.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.privacy_reminder_image)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            r3.i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationTitleViewHolder.<init>(android.view.ViewGroup):void");
    }
}
