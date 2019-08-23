package com.ss.android.ugc.aweme.friends.adapter;

import android.support.annotation.ColorInt;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.base.BaseViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.bg;
import com.taobao.android.dexposed.ClassUtils;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsSearchAdapter;", "Lcom/ss/android/ugc/aweme/common/adapter/LoadMoreRecyclerViewAdapter;", "()V", "friends", "", "Lcom/ss/android/ugc/aweme/friends/model/SummonFriendItem;", "getFriends", "()Ljava/util/List;", "setFriends", "(Ljava/util/List;)V", "imUsers", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "getImUsers", "setImUsers", "searchKeyWord", "", "getSearchKeyWord", "()Ljava/lang/String;", "setSearchKeyWord", "(Ljava/lang/String;)V", "getBasicItemCount", "", "onBindBasicViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "position", "onCreateBasicViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AtViewHolder", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AtFriendsSearchAdapter extends LoadMoreRecyclerViewAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48686a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f48687e = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<? extends IMUser> f48688b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public List<? extends SummonFriendItem> f48689c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public String f48690d = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0016\u00109\u001a\u0002062\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u001fJ\u0016\u0010=\u001a\u0002062\u0006\u00107\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u001fJ*\u0010>\u001a\u00020?2\b\b\u0001\u0010@\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u001fH\u0002J\b\u0010D\u001a\u000206H\u0014J \u0010E\u001a\u00020?2\u0006\u0010F\u001a\u00020?2\u0006\u0010G\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020\u001fH\u0002J \u0010I\u001a\u0002062\u0006\u0010J\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u0019H\u0002J \u0010K\u001a\u0002062\u0006\u0010J\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u0019H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b$\u0010\u001bR\u001a\u0010&\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0017R\u001a\u0010)\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001a\u0010,\u001a\u00020-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010\u0017¨\u0006L"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsSearchAdapter$AtViewHolder;", "Lcom/bytedance/ies/dmt/ui/base/BaseViewHolder;", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "container", "Landroid/view/View;", "adapter", "Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsSearchAdapter;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsSearchAdapter;)V", "getAdapter", "()Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsSearchAdapter;", "avatar", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "getAvatar", "()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "setAvatar", "(Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;)V", "getContainer", "()Landroid/view/View;", "desc", "Landroid/widget/TextView;", "getDesc", "()Landroid/widget/TextView;", "setDesc", "(Landroid/widget/TextView;)V", "douyinNickNamePrefix", "", "getDouyinNickNamePrefix", "()Ljava/lang/String;", "douyinNickNamePrefix$delegate", "Lkotlin/Lazy;", "highlightColor", "", "getHighlightColor", "()I", "highlightColor$delegate", "idPrefix", "getIdPrefix", "idPrefix$delegate", "indexLabel", "getIndexLabel", "setIndexLabel", "name", "getName", "setName", "relation", "Landroid/widget/ImageView;", "getRelation", "()Landroid/widget/ImageView;", "setRelation", "(Landroid/widget/ImageView;)V", "sectionLabel", "getSectionLabel", "setSectionLabel", "bindCommon", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "bindFriend", "data", "Lcom/ss/android/ugc/aweme/friends/model/SummonFriendItem;", "position", "bindIMUser", "getHighLightKeyWord", "Landroid/text/SpannableString;", "color", "text", "keyword", "startPos", "initListeners", "matchSearch", "ss", "start", "end", "setDetailText", "textView", "setNameText", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class AtViewHolder extends BaseViewHolder<IMUser> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48691a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ KProperty[] f48692b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AtViewHolder.class), "highlightColor", "getHighlightColor()I")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AtViewHolder.class), "douyinNickNamePrefix", "getDouyinNickNamePrefix()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AtViewHolder.class), "idPrefix", "getIdPrefix()Ljava/lang/String;"))};
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public TextView f48693c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        public TextView f48694d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public AvatarImageWithVerify f48695e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        public TextView f48696f;
        @NotNull
        public TextView g;
        @NotNull
        public ImageView h;
        @NotNull
        public final View i;
        @NotNull
        public final AtFriendsSearchAdapter j;
        @NotNull
        private final Lazy k = LazyKt.lazy(new c(this));
        private final Lazy l = LazyKt.lazy(new b(this));
        private final Lazy m = LazyKt.lazy(new d(this));

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48697a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AtViewHolder f48698b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ User f48699c;

            a(AtViewHolder atViewHolder, User user) {
                this.f48698b = atViewHolder;
                this.f48699c = user;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f48697a, false, 46250, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f48697a, false, 46250, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                if (!TextUtils.equals(a2.getCurUserId(), this.f48699c.getUid())) {
                    r.onEvent(MobClick.obtain().setEventName("at_friend").setLabelName("friend_list").setValue(this.f48699c.getUid()));
                    bg.a(new com.ss.android.ugc.aweme.friends.a.b(this.f48699c));
                    return;
                }
                View view2 = this.f48698b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                com.bytedance.ies.dmt.ui.d.a.b(view2.getContext(), (int) C0906R.string.bh5).a();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class b extends Lambda implements Function0<String> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ AtViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(AtViewHolder atViewHolder) {
                super(0);
                this.this$0 = atViewHolder;
            }

            public final String invoke() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46251, new Class[0], String.class)) {
                    return this.this$0.i.getResources().getString(C0906R.string.agn);
                }
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46251, new Class[0], String.class);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class c extends Lambda implements Function0<Integer> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ AtViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(AtViewHolder atViewHolder) {
                super(0);
                this.this$0 = atViewHolder;
            }

            public final int invoke() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46252, new Class[0], Integer.TYPE)) {
                    return this.this$0.i.getResources().getColor(C0906R.color.zl);
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46252, new Class[0], Integer.TYPE)).intValue();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class d extends Lambda implements Function0<String> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ AtViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(AtViewHolder atViewHolder) {
                super(0);
                this.this$0 = atViewHolder;
            }

            public final String invoke() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46253, new Class[0], String.class)) {
                    return this.this$0.i.getResources().getString(C0906R.string.ao6);
                }
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46253, new Class[0], String.class);
            }
        }

        public final void b() {
        }

        public final int c() {
            if (!PatchProxy.isSupport(new Object[0], this, f48691a, false, 46239, new Class[0], Integer.TYPE)) {
                return ((Number) this.k.getValue()).intValue();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48691a, false, 46239, new Class[0], Integer.TYPE)).intValue();
        }

        /* access modifiers changed from: package-private */
        public final String d() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f48691a, false, 46240, new Class[0], String.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f48691a, false, 46240, new Class[0], String.class);
            } else {
                value = this.l.getValue();
            }
            return (String) value;
        }

        /* access modifiers changed from: package-private */
        public final String e() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f48691a, false, 46241, new Class[0], String.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f48691a, false, 46241, new Class[0], String.class);
            } else {
                value = this.m.getValue();
            }
            return (String) value;
        }

        /* access modifiers changed from: package-private */
        public final void a(User user) {
            if (PatchProxy.isSupport(new Object[]{user}, this, f48691a, false, 46242, new Class[]{User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user}, this, f48691a, false, 46242, new Class[]{User.class}, Void.TYPE);
                return;
            }
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            view.setBackground(com.bytedance.ies.dmt.ui.common.c.e(view2.getContext()));
            this.f48695e.setData(user);
            if (user.getFollowStatus() == 2) {
                this.h.setVisibility(0);
                this.h.setImageResource(2130838743);
            } else {
                this.h.setVisibility(8);
            }
            this.f48694d.setVisibility(8);
            this.i.setOnClickListener(new a(this, user));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AtViewHolder(@NotNull View view, @NotNull AtFriendsSearchAdapter atFriendsSearchAdapter) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "container");
            Intrinsics.checkParameterIsNotNull(atFriendsSearchAdapter, "adapter");
            this.i = view;
            this.j = atFriendsSearchAdapter;
            View findViewById = this.i.findViewById(C0906R.id.cmg);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "container.findViewById(R.id.sectionLabel)");
            this.f48693c = (TextView) findViewById;
            View findViewById2 = this.i.findViewById(C0906R.id.au0);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "container.findViewById(R.id.indexLabel)");
            this.f48694d = (TextView) findViewById2;
            View findViewById3 = this.i.findViewById(C0906R.id.hk);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "container.findViewById(R.id.avatar)");
            this.f48695e = (AvatarImageWithVerify) findViewById3;
            View findViewById4 = this.i.findViewById(C0906R.id.bpn);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "container.findViewById(R.id.name)");
            this.f48696f = (TextView) findViewById4;
            View findViewById5 = this.i.findViewById(C0906R.id.a3m);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "container.findViewById(R.id.desc)");
            this.g = (TextView) findViewById5;
            View findViewById6 = this.i.findViewById(C0906R.id.ccz);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "container.findViewById(R.id.relation)");
            this.h = (ImageView) findViewById6;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: android.text.SpannableString} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0138  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x01f0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.friends.model.SummonFriendItem r18, int r19) {
            /*
                r17 = this;
                r7 = r17
                r8 = r18
                r9 = 2
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
                r11 = 1
                r0[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f48691a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.friends.model.SummonFriendItem> r1 = com.ss.android.ugc.aweme.friends.model.SummonFriendItem.class
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 46244(0xb4a4, float:6.4802E-41)
                r1 = r17
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x004d
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
                r0[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f48691a
                r3 = 0
                r4 = 46244(0xb4a4, float:6.4802E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<com.ss.android.ugc.aweme.friends.model.SummonFriendItem> r1 = com.ss.android.ugc.aweme.friends.model.SummonFriendItem.class
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x004d:
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
                com.ss.android.ugc.aweme.profile.model.User r12 = r8.mUser
                com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter r0 = r7.j
                java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r0.f48688b
                if (r0 == 0) goto L_0x005f
                int r0 = r0.size()
                goto L_0x0060
            L_0x005f:
                r0 = 0
            L_0x0060:
                r1 = 8
                r2 = r19
                if (r2 != r0) goto L_0x0074
                android.widget.TextView r0 = r7.f48693c
                r0.setVisibility(r10)
                android.widget.TextView r0 = r7.f48693c
                r2 = 2131558688(0x7f0d0120, float:1.8742699E38)
                r0.setText(r2)
                goto L_0x0079
            L_0x0074:
                android.widget.TextView r0 = r7.f48693c
                r0.setVisibility(r1)
            L_0x0079:
                android.widget.TextView r0 = r7.g
                r0.setVisibility(r10)
                com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                java.lang.String r2 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                int r0 = r0.m()
                r2 = 4
                if (r0 == r2) goto L_0x00e2
                com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                java.lang.String r2 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                int r0 = r0.m()
                r2 = 5
                if (r0 != r2) goto L_0x009f
                goto L_0x00e2
            L_0x009f:
                boolean r0 = com.ss.android.g.a.b()
                if (r0 == 0) goto L_0x00bf
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "@"
                r0.<init>(r1)
                java.lang.String r1 = com.ss.android.ugc.aweme.utils.ex.b((com.ss.android.ugc.aweme.profile.model.User) r12)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.widget.TextView r1 = r7.g
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1.setText(r0)
                goto L_0x0124
            L_0x00bf:
                java.lang.String r0 = "user"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r0)
                java.lang.String r0 = r12.getSignature()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x00d6
                android.widget.TextView r0 = r7.g
                r0.setVisibility(r1)
                goto L_0x0124
            L_0x00d6:
                android.widget.TextView r0 = r7.g
                java.lang.String r1 = r12.getSignature()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                goto L_0x0124
            L_0x00e2:
                boolean r0 = com.ss.android.g.a.a()
                if (r0 == 0) goto L_0x0102
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "@"
                r0.<init>(r1)
                java.lang.String r1 = com.ss.android.ugc.aweme.utils.ex.b((com.ss.android.ugc.aweme.profile.model.User) r12)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.widget.TextView r1 = r7.g
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1.setText(r0)
                goto L_0x0124
            L_0x0102:
                java.lang.String r0 = "user"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r0)
                java.lang.String r0 = r12.getSignature()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0119
                android.widget.TextView r0 = r7.g
                r0.setVisibility(r1)
                goto L_0x0124
            L_0x0119:
                android.widget.TextView r0 = r7.g
                java.lang.String r1 = r12.getSignature()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
            L_0x0124:
                android.text.SpannableString r0 = new android.text.SpannableString
                java.lang.String r1 = "user"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r1)
                java.lang.String r1 = r12.getNickname()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.<init>(r1)
                java.util.List<com.ss.android.ugc.aweme.challenge.model.Segment> r1 = r8.segments
                if (r1 == 0) goto L_0x01f0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r8 = r1.iterator()
                r13 = r0
            L_0x013f:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x01f1
                java.lang.Object r0 = r8.next()
                com.ss.android.ugc.aweme.challenge.model.Segment r0 = (com.ss.android.ugc.aweme.challenge.model.Segment) r0
                java.lang.String r1 = "seg"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                int r14 = r0.begin
                int r0 = r0.end
                int r15 = r0 + 1
                r6 = 3
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r0[r10] = r13
                java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
                r0[r11] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
                r0[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f48691a
                r3 = 0
                r4 = 46248(0xb4a8, float:6.4807E-41)
                java.lang.Class[] r5 = new java.lang.Class[r6]
                java.lang.Class<android.text.SpannableString> r1 = android.text.SpannableString.class
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r9] = r1
                java.lang.Class<android.text.SpannableString> r16 = android.text.SpannableString.class
                r1 = r17
                r9 = 3
                r6 = r16
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x01ba
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r13
                java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
                r0[r11] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
                r16 = 2
                r0[r16] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f48691a
                r3 = 0
                r4 = 46248(0xb4a8, float:6.4807E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<android.text.SpannableString> r1 = android.text.SpannableString.class
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r16] = r1
                java.lang.Class<android.text.SpannableString> r6 = android.text.SpannableString.class
                r1 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                r13 = r0
                android.text.SpannableString r13 = (android.text.SpannableString) r13
                goto L_0x01ed
            L_0x01ba:
                r16 = 2
                r0 = r13
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto L_0x01c6
                goto L_0x01ed
            L_0x01c6:
                int r1 = java.lang.Math.max(r10, r14)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x01ed
                if (r1 > r15) goto L_0x01ed
                int r0 = r13.length()
                if (r1 >= r0) goto L_0x01ed
                int r0 = r13.length()
                if (r15 <= r0) goto L_0x01df
                goto L_0x01ed
            L_0x01df:
                android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
                int r2 = r17.c()
                r0.<init>(r2)
                r2 = 17
                com.ss.android.ugc.aweme.friends.adapter.a.a(r13, r0, r1, r15, r2)
            L_0x01ed:
                r9 = 2
                goto L_0x013f
            L_0x01f0:
                r13 = r0
            L_0x01f1:
                android.widget.TextView r0 = r7.f48696f
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                r0.setText(r13)
                r7.a(r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter.AtViewHolder.a(com.ss.android.ugc.aweme.friends.model.SummonFriendItem, int):void");
        }

        /* access modifiers changed from: package-private */
        public final SpannableString a(@ColorInt int i2, String str, String str2, int i3) {
            String str3;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, str2, Integer.valueOf(i3)}, this, f48691a, false, 46247, new Class[]{Integer.TYPE, String.class, String.class, Integer.TYPE}, SpannableString.class)) {
                return (SpannableString) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str, str2, Integer.valueOf(i3)}, this, f48691a, false, 46247, new Class[]{Integer.TYPE, String.class, String.class, Integer.TYPE}, SpannableString.class);
            }
            if (StringsKt.contains$default((CharSequence) str2, '.', false, 2, (Object) null)) {
                str3 = StringsKt.replace$default(str2, ClassUtils.PACKAGE_SEPARATOR, "\\.", false, 4, (Object) null);
            } else {
                str3 = str2;
            }
            SpannableString spannableString = new SpannableString(str);
            try {
                Pattern compile = Pattern.compile(str3);
                if (compile == null) {
                    Intrinsics.throwNpe();
                }
                Matcher matcher = compile.matcher(spannableString);
                if (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    if (start >= i3) {
                        a.a(spannableString, new ForegroundColorSpan(i2), start, end, 33);
                    }
                }
                return spannableString;
            } catch (PatternSyntaxException unused) {
                return spannableString;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/adapter/AtFriendsSearchAdapter$Companion;", "", "()V", "hanziToPinyin", "", "str", "hanziToPinyinInitial", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48700a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
            if (r0 == null) goto L_0x0071;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(@org.jetbrains.annotations.Nullable java.lang.String r18) {
            /*
                r17 = this;
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r4 = f48700a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r7[r9] = r3
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r5 = 0
                r6 = 46254(0xb4ae, float:6.4816E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0037
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r12 = f48700a
                r13 = 0
                r14 = 46254(0xb4ae, float:6.4816E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r15[r9] = r0
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L_0x0037:
                if (r18 == 0) goto L_0x0071
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                if (r18 == 0) goto L_0x0069
                r0 = r18
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.CharSequence r0 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r0)
                java.lang.String r0 = r0.toString()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            L_0x004e:
                int r2 = r0.length()
                if (r9 >= r2) goto L_0x0062
                char r2 = r0.charAt(r9)
                java.lang.String r2 = com.github.a.a.a.a(r2)
                r1.append(r2)
                int r9 = r9 + 1
                goto L_0x004e
            L_0x0062:
                java.lang.String r0 = r1.toString()
                if (r0 != 0) goto L_0x0073
                goto L_0x0071
            L_0x0069:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                r0.<init>(r1)
                throw r0
            L_0x0071:
                java.lang.String r0 = ""
            L_0x0073:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter.a.a(java.lang.String):java.lang.String");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x006b, code lost:
            if (r0 == null) goto L_0x0076;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String b(@org.jetbrains.annotations.Nullable java.lang.String r18) {
            /*
                r17 = this;
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r4 = f48700a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r7[r9] = r3
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r5 = 0
                r6 = 46255(0xb4af, float:6.4817E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0037
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r12 = f48700a
                r13 = 0
                r14 = 46255(0xb4af, float:6.4817E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r15[r9] = r0
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L_0x0037:
                if (r18 == 0) goto L_0x0076
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                if (r18 == 0) goto L_0x006e
                r0 = r18
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.CharSequence r0 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r0)
                java.lang.String r0 = r0.toString()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r2 = 0
            L_0x004f:
                int r3 = r0.length()
                if (r2 >= r3) goto L_0x0067
                char r3 = r0.charAt(r2)
                java.lang.String r3 = com.github.a.a.a.a(r3)
                char r3 = r3.charAt(r9)
                r1.append(r3)
                int r2 = r2 + 1
                goto L_0x004f
            L_0x0067:
                java.lang.String r0 = r1.toString()
                if (r0 != 0) goto L_0x0078
                goto L_0x0076
            L_0x006e:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                r0.<init>(r1)
                throw r0
            L_0x0076:
                java.lang.String r0 = ""
            L_0x0078:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter.a.b(java.lang.String):java.lang.String");
        }
    }

    public final int getBasicItemCount() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f48686a, false, 46232, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48686a, false, 46232, new Class[0], Integer.TYPE)).intValue();
        }
        List<? extends IMUser> list = this.f48688b;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        List<? extends SummonFriendItem> list2 = this.f48689c;
        if (list2 != null) {
            i2 = list2.size();
        }
        return i + i2;
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(@NotNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48686a, false, 46230, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48686a, false, 46230, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sc, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…at_friend, parent, false)");
        return new AtViewHolder(inflate, this);
    }

    public final void onBindBasicViewHolder(@Nullable RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        String str;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f48686a, false, 46231, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f48686a, false, 46231, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        List<? extends IMUser> list = this.f48688b;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i3 < i2) {
            List<? extends IMUser> list2 = this.f48688b;
            if (list2 != null) {
                if (viewHolder != null) {
                    AtViewHolder atViewHolder = (AtViewHolder) viewHolder;
                    IMUser iMUser = (IMUser) list2.get(i3);
                    if (PatchProxy.isSupport(new Object[]{iMUser, Integer.valueOf(i)}, atViewHolder, AtViewHolder.f48691a, false, 46243, new Class[]{IMUser.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{iMUser, Integer.valueOf(i)}, atViewHolder, AtViewHolder.f48691a, false, 46243, new Class[]{IMUser.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(iMUser, AllStoryActivity.f73306b);
                        atViewHolder.f48696f.setText(iMUser.getNickName());
                        if (i3 == 0) {
                            atViewHolder.f48693c.setVisibility(0);
                            atViewHolder.f48693c.setText(C0906R.string.g9);
                        } else {
                            atViewHolder.f48693c.setVisibility(8);
                        }
                        TextView textView = atViewHolder.f48696f;
                        String str2 = atViewHolder.j.f48690d;
                        if (PatchProxy.isSupport(new Object[]{textView, iMUser, str2}, atViewHolder, AtViewHolder.f48691a, false, 46245, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{textView, iMUser, str2}, atViewHolder, AtViewHolder.f48691a, false, 46245, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE);
                        } else {
                            if (!com.ss.android.g.a.a()) {
                                if (iMUser.getSearchType() == 5) {
                                    str2 = b.a().convertSearchKeyword(iMUser.getRemarkName(), iMUser.getRemarkPinyin(), iMUser.getRemarkInitial(), str2);
                                    Intrinsics.checkExpressionValueIsNotNull(str2, "IM.get().convertSearchKe…r.remarkInitial, keyword)");
                                } else if (iMUser.getSearchType() == 3) {
                                    str2 = b.a().convertSearchKeyword(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str2);
                                    Intrinsics.checkExpressionValueIsNotNull(str2, "IM.get().convertSearchKe…nickNameInitial, keyword)");
                                }
                            } else if (str2 != null) {
                                str2 = str2.toLowerCase();
                                Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).toLowerCase()");
                                String nickName = iMUser.getNickName();
                                if (!TextUtils.isEmpty(nickName)) {
                                    Intrinsics.checkExpressionValueIsNotNull(nickName, "name");
                                    if (nickName != null) {
                                        String lowerCase = nickName.toLowerCase();
                                        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                                        int indexOf$default = StringsKt.indexOf$default((CharSequence) lowerCase, str2, 0, false, 6, (Object) null);
                                        if (indexOf$default != -1 && indexOf$default < nickName.length() && str2.length() + indexOf$default <= nickName.length()) {
                                            str2 = nickName.substring(indexOf$default, str2.length() + indexOf$default);
                                            Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                        }
                                    } else {
                                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                    }
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                            int c2 = atViewHolder.c();
                            String displayName = iMUser.getDisplayName();
                            Intrinsics.checkExpressionValueIsNotNull(displayName, "user.displayName");
                            textView.setText(atViewHolder.a(c2, displayName, str2, 0));
                        }
                        TextView textView2 = atViewHolder.g;
                        String str3 = atViewHolder.j.f48690d;
                        if (PatchProxy.isSupport(new Object[]{textView2, iMUser, str3}, atViewHolder, AtViewHolder.f48691a, false, 46246, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{textView2, iMUser, str3}, atViewHolder, AtViewHolder.f48691a, false, 46246, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE);
                        } else {
                            textView2.setVisibility(0);
                            if (iMUser.getSearchType() == 5) {
                                textView2.setText(iMUser.getSignature());
                            } else if (iMUser.getSearchType() == 3) {
                                if (TextUtils.isEmpty(iMUser.getRemarkName())) {
                                    AbTestManager a2 = AbTestManager.a();
                                    Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
                                    if (a2.m() != 4) {
                                        AbTestManager a3 = AbTestManager.a();
                                        Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
                                        if (a3.m() != 5) {
                                            if (com.ss.android.g.a.b()) {
                                                textView2.setText("@" + iMUser.getDisplayId());
                                            } else {
                                                textView2.setText(iMUser.getSignature());
                                            }
                                        }
                                    }
                                    if (com.ss.android.g.a.a()) {
                                        textView2.setText("@" + iMUser.getDisplayId());
                                    } else {
                                        textView2.setText(iMUser.getSignature());
                                    }
                                } else {
                                    String convertSearchKeyword = b.a().convertSearchKeyword(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str3);
                                    Intrinsics.checkExpressionValueIsNotNull(convertSearchKeyword, "IM.get().convertSearchKe…nickNameInitial, keyword)");
                                    textView2.setText(atViewHolder.a(atViewHolder.c(), atViewHolder.d() + iMUser.getNickName(), convertSearchKeyword, atViewHolder.d().length()));
                                }
                            } else if (iMUser.getSearchType() == 1) {
                                AbTestManager a4 = AbTestManager.a();
                                Intrinsics.checkExpressionValueIsNotNull(a4, "AbTestManager.getInstance()");
                                if (a4.m() != 4) {
                                    AbTestManager a5 = AbTestManager.a();
                                    Intrinsics.checkExpressionValueIsNotNull(a5, "AbTestManager.getInstance()");
                                    if (a5.m() != 5) {
                                        if (com.ss.android.g.a.b()) {
                                            str = "@";
                                        } else {
                                            str = atViewHolder.e();
                                        }
                                        String displayId = iMUser.getDisplayId();
                                        String convertSearchKeyword2 = b.a().convertSearchKeyword(displayId, f48687e.a(displayId), f48687e.b(displayId), str3);
                                        Intrinsics.checkExpressionValueIsNotNull(convertSearchKeyword2, "IM.get().convertSearchKe…nyinInitial(id), keyword)");
                                        textView2.setText(atViewHolder.a(atViewHolder.c(), str + displayId, convertSearchKeyword2, str.length()));
                                    }
                                }
                                if (com.ss.android.g.a.a()) {
                                    str = "@";
                                } else {
                                    str = atViewHolder.e();
                                }
                                String displayId2 = iMUser.getDisplayId();
                                String convertSearchKeyword22 = b.a().convertSearchKeyword(displayId2, f48687e.a(displayId2), f48687e.b(displayId2), str3);
                                Intrinsics.checkExpressionValueIsNotNull(convertSearchKeyword22, "IM.get().convertSearchKe…nyinInitial(id), keyword)");
                                textView2.setText(atViewHolder.a(atViewHolder.c(), str + displayId2, convertSearchKeyword22, str.length()));
                            } else if (iMUser.getSearchType() == 2) {
                                int c3 = atViewHolder.c();
                                String string = atViewHolder.i.getResources().getString(C0906R.string.aqe, new Object[]{iMUser.getContactName()});
                                Intrinsics.checkExpressionValueIsNotNull(string, "container.resources.getS…t_name, user.contactName)");
                                String convertSearchKeyword3 = b.a().convertSearchKeyword(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str3);
                                Intrinsics.checkExpressionValueIsNotNull(convertSearchKeyword3, "IM.get().convertSearchKe…tactNameInitial, keyword)");
                                textView2.setText(atViewHolder.a(c3, string, convertSearchKeyword3, 6));
                            } else {
                                textView2.setVisibility(8);
                            }
                            if (TextUtils.isEmpty(textView2.getText())) {
                                textView2.setVisibility(8);
                            }
                        }
                        atViewHolder.a(AtFriendsAdapter.f48672d.a(iMUser));
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter.AtViewHolder");
                }
            }
            return;
        }
        List<? extends SummonFriendItem> list3 = this.f48689c;
        if (list3 != null) {
            if (viewHolder != null) {
                ((AtViewHolder) viewHolder).a((SummonFriendItem) list3.get(i3 - i2), i3);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter.AtViewHolder");
        }
    }
}
