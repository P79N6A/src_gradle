package com.ss.android.ugc.aweme.im.sdk.relations;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity;
import com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\"\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00112\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0011H\u0016J\u0016\u0010$\u001a\u00020\u00112\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005J\b\u0010&\u001a\u00020\u0011H\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/RelationMemberSelectFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;", "()V", "mCallBack", "Lcom/ss/android/ugc/aweme/base/Callback;", "", "mInitSelectMode", "", "mInitSelectedMember", "Ljava/util/LinkedHashSet;", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "mInitShareContent", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "mInitShareStruct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "addGroupHeaderView", "", "createViewModel", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "getLayoutResId", "getTitle", "", "initParams", "initViewModel", "initViews", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onMemberSelected", "selectList", "", "onTitlebarRightClick", "setCallBack", "callback", "updateTitleBar", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RelationMemberSelectFragment extends BaseSelectFragment<RelationMemberListViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51992a;

    /* renamed from: b  reason: collision with root package name */
    public IShareService.ShareStruct f51993b;

    /* renamed from: c  reason: collision with root package name */
    public BaseContent f51994c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.base.a<Boolean> f51995d;

    /* renamed from: e  reason: collision with root package name */
    private int f51996e = -1;
    private LinkedHashSet<IMContact> m;
    private HashMap n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51997a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RelationMemberSelectFragment f51998b;

        a(RelationMemberSelectFragment relationMemberSelectFragment) {
            this.f51998b = relationMemberSelectFragment;
        }

        public final void onClick(View view) {
            int i;
            boolean z;
            if (PatchProxy.isSupport(new Object[]{view}, this, f51997a, false, 52688, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f51997a, false, 52688, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f51998b.getActivity();
            if (activity != null) {
                if (((RelationMemberListViewModel) this.f51998b.o()).b()) {
                    i = 3;
                } else {
                    i = 2;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("key_select_mode", i);
                bundle.putSerializable("share_struct", this.f51998b.f51993b);
                bundle.putSerializable("share_content", this.f51998b.f51994c);
                Collection arrayList = new ArrayList();
                for (Object next : ((RelationMemberListViewModel) this.f51998b.o()).d()) {
                    IMContact iMContact = (IMContact) next;
                    if (!(iMContact instanceof IMConversation) || ((IMConversation) iMContact).getConversationType() != d.a.f20887b) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                List list = (List) arrayList;
                if (((RelationMemberListViewModel) this.f51998b.o()).e() > list.size()) {
                    bundle.putInt("key_number_limit", 10 - (((RelationMemberListViewModel) this.f51998b.o()).e() - list.size()));
                }
                bundle.putSerializable("key_selected_contact", new LinkedHashSet(list));
                GroupListActivity.a aVar = GroupListActivity.f51478c;
                Intrinsics.checkExpressionValueIsNotNull(activity, "this");
                aVar.a(activity, 3, bundle, this.f51998b.f51995d, 224);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<RelationMemberListViewModel, RelationMemberListViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RelationMemberSelectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RelationMemberSelectFragment relationMemberSelectFragment) {
            super(1);
            this.this$0 = relationMemberSelectFragment;
        }

        @NotNull
        public final RelationMemberListViewModel invoke(@NotNull RelationMemberListViewModel relationMemberListViewModel) {
            if (PatchProxy.isSupport(new Object[]{relationMemberListViewModel}, this, changeQuickRedirect, false, 52689, new Class[]{RelationMemberListViewModel.class}, RelationMemberListViewModel.class)) {
                return (RelationMemberListViewModel) PatchProxy.accessDispatch(new Object[]{relationMemberListViewModel}, this, changeQuickRedirect, false, 52689, new Class[]{RelationMemberListViewModel.class}, RelationMemberListViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(relationMemberListViewModel, "$receiver");
            relationMemberListViewModel.i = this.this$0.k;
            relationMemberListViewModel.f52171d = this.this$0.f51993b;
            relationMemberListViewModel.f52172e = this.this$0.f51994c;
            return relationMemberListViewModel;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "onShare", "", "kotlin.jvm.PlatformType", "run", "(Ljava/lang/Boolean;)V", "com/ss/android/ugc/aweme/im/sdk/relations/RelationMemberSelectFragment$onMemberSelected$1$1$1", "com/ss/android/ugc/aweme/im/sdk/relations/RelationMemberSelectFragment$$special$$inlined$forEach$lambda$1"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements com.ss.android.ugc.aweme.base.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RelationMemberSelectFragment f52000b;

        c(RelationMemberSelectFragment relationMemberSelectFragment) {
            this.f52000b = relationMemberSelectFragment;
        }

        public final /* synthetic */ void run(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f51999a, false, 52690, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f51999a, false, 52690, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.base.a<Boolean> aVar = this.f52000b.f51995d;
            if (aVar != null) {
                aVar.run(bool);
            }
            Intrinsics.checkExpressionValueIsNotNull(bool, "onShare");
            if (bool.booleanValue()) {
                FragmentActivity activity = this.f52000b.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "run", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements com.ss.android.ugc.aweme.base.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RelationMemberSelectFragment f52002b;

        d(RelationMemberSelectFragment relationMemberSelectFragment) {
            this.f52002b = relationMemberSelectFragment;
        }

        public final /* synthetic */ void run(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f52001a, false, 52691, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f52001a, false, 52691, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.base.a<Boolean> aVar = this.f52002b.f51995d;
            if (aVar != null) {
                aVar.run(bool);
            }
            Intrinsics.checkExpressionValueIsNotNull(bool, AdvanceSetting.NETWORK_TYPE);
            if (bool.booleanValue()) {
                FragmentActivity activity = this.f52002b.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51992a, false, 52686, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51992a, false, 52686, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.n.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f51992a, false, 52687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51992a, false, 52687, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.clear();
        }
    }

    public final int g() {
        return C0906R.layout.pw;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51992a, false, 52679, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51992a, false, 52679, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (this.f51996e != -1) {
            ((RelationMemberListViewModel) o()).a(this.f51996e);
        }
        LinkedHashSet<IMContact> linkedHashSet = this.m;
        if (linkedHashSet != null) {
            ((RelationMemberListViewModel) o()).b(CollectionsKt.toList(linkedHashSet));
        }
    }

    @NotNull
    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f51992a, false, 52680, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51992a, false, 52680, new Class[0], String.class);
        } else if (!((RelationMemberListViewModel) o()).b()) {
            Context context = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
            String string = context.getResources().getString(C0906R.string.axb);
            Intrinsics.checkExpressionValueIsNotNull(string, "GlobalContext.getContext…m_select_single_relation)");
            return string;
        } else {
            Context context2 = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "GlobalContext.getContext()");
            String string2 = context2.getResources().getString(C0906R.string.ax_);
            Intrinsics.checkExpressionValueIsNotNull(string2, "GlobalContext.getContext…select_multiple_relation)");
            return string2;
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f51992a, false, 52678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51992a, false, 52678, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        if (PatchProxy.isSupport(new Object[0], this, f51992a, false, 52683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51992a, false, 52683, new Class[0], Void.TYPE);
            return;
        }
        View inflate = View.inflate(getContext(), C0906R.layout.vc, null);
        inflate.setOnClickListener(new a(this));
        Intrinsics.checkExpressionValueIsNotNull(inflate, "headerView");
        inflate.setBackground(com.bytedance.ies.dmt.ui.common.c.e(getContext()));
        a(inflate);
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f51992a, false, 52681, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51992a, false, 52681, new Class[0], Void.TYPE);
            return;
        }
        super.j();
        if (((RelationMemberListViewModel) o()).b()) {
            com.ss.android.ugc.aweme.im.sdk.share.b.a(getContext(), ((RelationMemberListViewModel) o()).d(), ((RelationMemberListViewModel) o()).f52171d, ((RelationMemberListViewModel) o()).f52172e, (com.ss.android.ugc.aweme.base.a<Boolean>) new d<Boolean>(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0070, code lost:
        if (r0 == null) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f51992a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 52677(0xcdc5, float:7.3816E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f51992a
            r5 = 0
            r6 = 52677(0xcdc5, float:7.3816E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            super.a()
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto L_0x0072
            java.lang.String r1 = "key_select_mode"
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r9.f51996e = r1
            java.lang.String r1 = "key_selected_contact"
            java.io.Serializable r1 = r0.getSerializable(r1)
            boolean r2 = r1 instanceof java.util.LinkedHashSet
            r3 = 0
            if (r2 != 0) goto L_0x0043
            r1 = r3
        L_0x0043:
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            r9.m = r1
            java.lang.String r1 = "share_struct"
            java.io.Serializable r1 = r0.getSerializable(r1)
            boolean r2 = r1 instanceof com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct
            if (r2 != 0) goto L_0x0052
            r1 = r3
        L_0x0052:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = (com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct) r1
            r9.f51993b = r1
            java.lang.String r1 = "share_content"
            java.io.Serializable r1 = r0.getSerializable(r1)
            boolean r2 = r1 instanceof com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent
            if (r2 != 0) goto L_0x0061
            r1 = r3
        L_0x0061:
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = (com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent) r1
            r9.f51994c = r1
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r1 = r9.f51994c
            java.lang.String r2 = "forward_origin_msgid"
            long r2 = r0.getLong(r2)
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent.wrapForward(r1, r2)
            if (r0 != 0) goto L_0x007e
        L_0x0072:
            r0 = r9
            com.ss.android.ugc.aweme.im.sdk.relations.RelationMemberSelectFragment r0 = (com.ss.android.ugc.aweme.im.sdk.relations.RelationMemberSelectFragment) r0
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x007e
            r0.finish()
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.RelationMemberSelectFragment.a():void");
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f51992a, false, 52682, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51992a, false, 52682, new Class[0], Void.TYPE);
            return;
        }
        super.i();
        if (((RelationMemberListViewModel) o()).b()) {
            if (((RelationMemberListViewModel) o()).e() != 0) {
                Context context = GlobalContext.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
                ((ImTextTitleBar) a((int) C0906R.id.d3m)).setRightText(context.getResources().getString(C0906R.string.axe, new Object[]{Integer.valueOf(((RelationMemberListViewModel) o()).e())}));
                ImTextTitleBar imTextTitleBar = (ImTextTitleBar) a((int) C0906R.id.d3m);
                Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar, "title_bar");
                View rightView = imTextTitleBar.getRightView();
                Intrinsics.checkExpressionValueIsNotNull(rightView, "title_bar.rightView");
                rightView.setEnabled(true);
                ImTextTitleBar imTextTitleBar2 = (ImTextTitleBar) a((int) C0906R.id.d3m);
                Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar2, "title_bar");
                DmtTextView rightTexView = imTextTitleBar2.getRightTexView();
                Intrinsics.checkExpressionValueIsNotNull(rightTexView, "title_bar.rightTexView");
                TextPaint paint = rightTexView.getPaint();
                Intrinsics.checkExpressionValueIsNotNull(paint, "title_bar.rightTexView.paint");
                paint.setFakeBoldText(true);
                Context context2 = GlobalContext.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "GlobalContext.getContext()");
                ((ImTextTitleBar) a((int) C0906R.id.d3m)).setRightTextColor(context2.getResources().getColor(C0906R.color.a1z));
            } else {
                Context context3 = GlobalContext.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "GlobalContext.getContext()");
                ((ImTextTitleBar) a((int) C0906R.id.d3m)).setRightText(context3.getResources().getString(C0906R.string.axc));
                ImTextTitleBar imTextTitleBar3 = (ImTextTitleBar) a((int) C0906R.id.d3m);
                Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar3, "title_bar");
                View rightView2 = imTextTitleBar3.getRightView();
                Intrinsics.checkExpressionValueIsNotNull(rightView2, "title_bar.rightView");
                rightView2.setEnabled(false);
                ImTextTitleBar imTextTitleBar4 = (ImTextTitleBar) a((int) C0906R.id.d3m);
                Intrinsics.checkExpressionValueIsNotNull(imTextTitleBar4, "title_bar");
                DmtTextView rightTexView2 = imTextTitleBar4.getRightTexView();
                Intrinsics.checkExpressionValueIsNotNull(rightTexView2, "title_bar.rightTexView");
                TextPaint paint2 = rightTexView2.getPaint();
                Intrinsics.checkExpressionValueIsNotNull(paint2, "title_bar.rightTexView.paint");
                paint2.setFakeBoldText(false);
                Context context4 = GlobalContext.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "GlobalContext.getContext()");
                ((ImTextTitleBar) a((int) C0906R.id.d3m)).setRightTextColor(context4.getResources().getColor(C0906R.color.a21));
            }
        }
    }

    public final /* synthetic */ BaseMemberListViewModel a(LifecycleOwner lifecycleOwner) {
        RelationMemberListViewModel relationMemberListViewModel;
        ViewModel viewModel;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2}, this, f51992a, false, 52676, new Class[]{LifecycleOwner.class}, RelationMemberListViewModel.class)) {
            relationMemberListViewModel = (RelationMemberListViewModel) PatchProxy.accessDispatch(new Object[]{lifecycleOwner2}, this, f51992a, false, 52676, new Class[]{LifecycleOwner.class}, RelationMemberListViewModel.class);
        } else {
            Intrinsics.checkParameterIsNotNull(lifecycleOwner2, "lifecycleOwner");
            Function1 bVar = new b(this);
            Class cls = RelationMemberListViewModel.class;
            if (lifecycleOwner2 instanceof Fragment) {
                ViewModelProvider of = ViewModelProviders.of((Fragment) lifecycleOwner2, (ViewModelProvider.Factory) n());
                String name = cls.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
                viewModel = of.get(name, cls);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "this");
                bVar.invoke(viewModel);
            } else if (lifecycleOwner2 instanceof FragmentActivity) {
                ViewModelProvider of2 = ViewModelProviders.of((FragmentActivity) lifecycleOwner2, (ViewModelProvider.Factory) n());
                String name2 = cls.getName();
                Intrinsics.checkExpressionValueIsNotNull(name2, "viewModelClass.java.name");
                viewModel = of2.get(name2, cls);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "this");
                bVar.invoke(viewModel);
            } else {
                throw new IllegalAccessException("owner must be either FragmentActivity or Fragment");
            }
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "when (lifecycleOwner) {\n…)\n            }\n        }");
            relationMemberListViewModel = (RelationMemberListViewModel) viewModel;
        }
        return relationMemberListViewModel;
    }

    public final void a(@Nullable List<? extends IMContact> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f51992a, false, 52684, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f51992a, false, 52684, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (((RelationMemberListViewModel) o()).b()) {
            super.a(list);
        } else if (list != null) {
            for (IMContact iMContact : list) {
                com.ss.android.ugc.aweme.im.sdk.share.b.a(getContext(), iMContact, ((RelationMemberListViewModel) o()).f52171d, ((RelationMemberListViewModel) o()).f52172e, (com.ss.android.ugc.aweme.base.a<Boolean>) new c<Boolean>(this));
                BaseContent baseContent = ((RelationMemberListViewModel) o()).f52172e;
                if (baseContent != null) {
                    String a2 = ad.a(baseContent.generateShareStruct().itemType);
                    if (!TextUtils.isEmpty(a2)) {
                        if (iMContact instanceof IMUser) {
                            IMUser iMUser = (IMUser) iMContact;
                            String uid = iMUser.getUid();
                            Intrinsics.checkExpressionValueIsNotNull(uid, "it.uid");
                            z.a().a(a2, e.a(Long.parseLong(uid)), iMUser.getUid(), baseContent);
                        } else if (iMContact instanceof IMConversation) {
                            z.a().a(a2, ((IMConversation) iMContact).getConversationId(), "", baseContent);
                        }
                    }
                }
            }
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f51992a, false, 52685, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f51992a, false, 52685, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 224 && intent2 != null) {
            Serializable serializableExtra = intent2.getSerializableExtra("key_selected_contact");
            if (serializableExtra == null) {
                return;
            }
            if (serializableExtra != null) {
                ((RelationMemberListViewModel) o()).c(CollectionsKt.toList((LinkedHashSet) serializableExtra));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact>");
            }
        }
    }
}
