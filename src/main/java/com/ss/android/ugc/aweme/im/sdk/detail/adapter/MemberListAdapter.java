package com.ss.android.ugc.aweme.im.sdk.detail.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.im.core.d.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.BaseViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.b.a.b;
import com.ss.android.ugc.aweme.im.sdk.d.d;
import com.ss.android.ugc.aweme.im.sdk.detail.a.g;
import com.ss.android.ugc.aweme.im.sdk.relations.a.f;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u001b\u001cB\u0015\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u001e\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0016\u0010\u0017\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0018\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0019\u001a\u00020\u00112\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005J \u0010\u0019\u001a\u00020\u00112\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bR\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/adapter/MemberListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/im/sdk/BaseViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMemberItem;", "dataList", "", "(Ljava/util/List;)V", "mDataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mSearchKeyword", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "updateList", "searchKeyword", "Companion", "HorizontalAvatarViewHolder", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MemberListAdapter extends RecyclerView.Adapter<BaseViewHolder<b>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51414a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f51415c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public String f51416b;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<b> f51417d = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0014R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/adapter/MemberListAdapter$HorizontalAvatarViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/detail/adapter/AvatarViewHolder;", "parent", "Landroid/view/ViewGroup;", "layoutId", "", "(Lcom/ss/android/ugc/aweme/im/sdk/detail/adapter/MemberListAdapter;Landroid/view/ViewGroup;I)V", "mDetailView", "Landroid/widget/TextView;", "bind", "", "imMember", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMemberItem;", "position", "initEvents", "initViewRefs", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class HorizontalAvatarViewHolder extends AvatarViewHolder {
        public static ChangeQuickRedirect g;
        final /* synthetic */ MemberListAdapter h;
        private TextView i;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51418a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ HorizontalAvatarViewHolder f51419b;

            a(HorizontalAvatarViewHolder horizontalAvatarViewHolder) {
                this.f51419b = horizontalAvatarViewHolder;
            }

            public final void onClick(View view) {
                IMUser iMUser;
                if (PatchProxy.isSupport(new Object[]{view}, this, f51418a, false, 52047, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f51418a, false, 52047, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar = this.f51419b.f3378f;
                IMUser iMUser2 = null;
                if (aVar != null) {
                    iMUser = aVar.getUser();
                } else {
                    iMUser = null;
                }
                if (iMUser != null) {
                    View view2 = this.f51419b.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    Context context = view2.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
                    com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar2 = this.f51419b.f3378f;
                    if (aVar2 != null) {
                        iMUser2 = aVar2.getUser();
                    }
                    if (iMUser2 == null) {
                        Intrinsics.throwNpe();
                    }
                    d.a(context, (IMContact) iMUser2, "group_setting");
                }
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, g, false, 52044, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 52044, new Class[0], Void.TYPE);
                return;
            }
            super.b();
            View findViewById = this.itemView.findViewById(C0906R.id.dej);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_member_detail)");
            this.i = (TextView) findViewById;
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            view.setBackground(c.e(view2.getContext()));
        }

        public final void a(@Nullable b bVar, int i2) {
            boolean z;
            String str;
            boolean z2;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            boolean z3;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            boolean z4;
            String str20;
            String str21;
            String str22;
            String str23;
            String str24;
            boolean z5;
            String str25;
            boolean z6;
            String str26;
            String str27;
            b bVar2 = bVar;
            boolean z7 = true;
            if (PatchProxy.isSupport(new Object[]{bVar2, Integer.valueOf(i2)}, this, g, false, 52045, new Class[]{b.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2, Integer.valueOf(i2)}, this, g, false, 52045, new Class[]{b.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.a(bVar, i2);
            if (bVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) {
                com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar = (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) bVar2;
                if (aVar.getUser() != null) {
                    CharSequence charSequence = this.h.f51416b;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        com.ss.android.ugc.aweme.im.sdk.detail.b.a aVar2 = com.ss.android.ugc.aweme.im.sdk.detail.b.a.f51427b;
                        TextView textView = this.i;
                        if (textView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mDetailView");
                        }
                        String str28 = this.h.f51416b;
                        if (str28 == null) {
                            Intrinsics.throwNpe();
                        }
                        if (PatchProxy.isSupport(new Object[]{textView, aVar, str28}, aVar2, com.ss.android.ugc.aweme.im.sdk.detail.b.a.f51426a, false, 52055, new Class[]{TextView.class, com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class, String.class}, Void.TYPE)) {
                            str = null;
                            PatchProxy.accessDispatch(new Object[]{textView, aVar, str28}, aVar2, com.ss.android.ugc.aweme.im.sdk.detail.b.a.f51426a, false, 52055, new Class[]{TextView.class, com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class, String.class}, Void.TYPE);
                        } else {
                            str = null;
                            Intrinsics.checkParameterIsNotNull(textView, "textView");
                            Intrinsics.checkParameterIsNotNull(aVar, "imMember");
                            Intrinsics.checkParameterIsNotNull(str28, "keyword");
                            if (str28.length() == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                aVar2.a(textView, aVar);
                            } else {
                                IMUser user = aVar.getUser();
                                if (user == null || user.getSearchType() != 5) {
                                    IMUser user2 = aVar.getUser();
                                    if (user2 == null || user2.getSearchType() != 4) {
                                        IMUser user3 = aVar.getUser();
                                        if (user3 == null || user3.getSearchType() != 3) {
                                            IMUser user4 = aVar.getUser();
                                            if (user4 == null || user4.getSearchType() != 1) {
                                                IMUser user5 = aVar.getUser();
                                                if (user5 == null || user5.getSearchType() != 2) {
                                                    textView.setVisibility(8);
                                                } else {
                                                    Context context = GlobalContext.getContext();
                                                    Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
                                                    Resources resources = context.getResources();
                                                    Object[] objArr = new Object[1];
                                                    IMUser user6 = aVar.getUser();
                                                    if (user6 != null) {
                                                        str14 = user6.getContactName();
                                                    } else {
                                                        str14 = null;
                                                    }
                                                    objArr[0] = str14;
                                                    String string = resources.getString(C0906R.string.aqe, objArr);
                                                    IMUser user7 = aVar.getUser();
                                                    if (user7 != null) {
                                                        str15 = user7.getContactName();
                                                    } else {
                                                        str15 = null;
                                                    }
                                                    IMUser user8 = aVar.getUser();
                                                    if (user8 != null) {
                                                        str16 = user8.getContactNamePinyin();
                                                    } else {
                                                        str16 = null;
                                                    }
                                                    IMUser user9 = aVar.getUser();
                                                    if (user9 != null) {
                                                        str17 = user9.getContactNameInitial();
                                                    } else {
                                                        str17 = null;
                                                    }
                                                    String a2 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(str15, str16, str17, str28);
                                                    Intrinsics.checkExpressionValueIsNotNull(a2, "CharacterUtil.convertPin…tactNameInitial, keyword)");
                                                    f fVar = f.f52045b;
                                                    Intrinsics.checkExpressionValueIsNotNull(string, "str");
                                                    fVar.a(textView, string, a2, 6);
                                                    textView.setVisibility(0);
                                                }
                                            } else {
                                                IMUser user10 = aVar.getUser();
                                                if (user10 != null) {
                                                    str18 = user10.getDisplayId();
                                                } else {
                                                    str18 = null;
                                                }
                                                String c2 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.c(str18);
                                                Intrinsics.checkExpressionValueIsNotNull(c2, "CharacterUtil.hanziToPinyin(id)");
                                                if (c2 != null) {
                                                    String lowerCase = c2.toLowerCase();
                                                    Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                                                    String a3 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(str18, lowerCase, com.ss.android.ugc.aweme.im.sdk.relations.a.a.b(str18), str28);
                                                    Intrinsics.checkExpressionValueIsNotNull(a3, "CharacterUtil.convertPin…al(id), highLightKeyword)");
                                                    StringBuilder sb = new StringBuilder();
                                                    Context context2 = GlobalContext.getContext();
                                                    Intrinsics.checkExpressionValueIsNotNull(context2, "GlobalContext.getContext()");
                                                    sb.append(context2.getResources().getString(C0906R.string.ao6));
                                                    sb.append(str18);
                                                    f.f52045b.a(textView, sb.toString(), a3, 4);
                                                    textView.setVisibility(0);
                                                } else {
                                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                                }
                                            }
                                        } else {
                                            IMUser user11 = aVar.getUser();
                                            if (user11 != null) {
                                                str19 = user11.getRemarkName();
                                            } else {
                                                str19 = null;
                                            }
                                            CharSequence charSequence2 = str19;
                                            if (charSequence2 == null || charSequence2.length() == 0) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            if (z4) {
                                                m member = aVar.getMember();
                                                if (member != null) {
                                                    str24 = member.getAlias();
                                                } else {
                                                    str24 = null;
                                                }
                                                CharSequence charSequence3 = str24;
                                                if (charSequence3 == null || charSequence3.length() == 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z5) {
                                                    aVar2.a(textView, aVar);
                                                }
                                            }
                                            Context context3 = GlobalContext.getContext();
                                            Intrinsics.checkExpressionValueIsNotNull(context3, "GlobalContext.getContext()");
                                            Resources resources2 = context3.getResources();
                                            Object[] objArr2 = new Object[1];
                                            IMUser user12 = aVar.getUser();
                                            if (user12 != null) {
                                                str20 = user12.getNickName();
                                            } else {
                                                str20 = null;
                                            }
                                            objArr2[0] = str20;
                                            String string2 = resources2.getString(C0906R.string.avn, objArr2);
                                            IMUser user13 = aVar.getUser();
                                            if (user13 != null) {
                                                str21 = user13.getNickName();
                                            } else {
                                                str21 = null;
                                            }
                                            IMUser user14 = aVar.getUser();
                                            if (user14 != null) {
                                                str22 = user14.getNickNamePinyin();
                                            } else {
                                                str22 = null;
                                            }
                                            IMUser user15 = aVar.getUser();
                                            if (user15 != null) {
                                                str23 = user15.getNickNameInitial();
                                            } else {
                                                str23 = null;
                                            }
                                            String a4 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(str21, str22, str23, str28);
                                            Intrinsics.checkExpressionValueIsNotNull(a4, "CharacterUtil.convertPin…nitial, highLightKeyword)");
                                            f fVar2 = f.f52045b;
                                            Intrinsics.checkExpressionValueIsNotNull(string2, "str");
                                            fVar2.a(textView, string2, a4, 3);
                                            textView.setVisibility(0);
                                        }
                                    } else {
                                        IMUser user16 = aVar.getUser();
                                        if (user16 != null) {
                                            str25 = user16.getRemarkName();
                                        } else {
                                            str25 = null;
                                        }
                                        CharSequence charSequence4 = str25;
                                        if (charSequence4 == null || charSequence4.length() == 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (z6) {
                                            aVar2.a(textView, aVar);
                                        } else {
                                            Context context4 = GlobalContext.getContext();
                                            Intrinsics.checkExpressionValueIsNotNull(context4, "GlobalContext.getContext()");
                                            Resources resources3 = context4.getResources();
                                            Object[] objArr3 = new Object[1];
                                            m member2 = aVar.getMember();
                                            if (member2 != null) {
                                                str26 = member2.getAlias();
                                            } else {
                                                str26 = null;
                                            }
                                            objArr3[0] = str26;
                                            String string3 = resources3.getString(C0906R.string.at1, objArr3);
                                            m member3 = aVar.getMember();
                                            if (member3 != null) {
                                                str27 = member3.getAlias();
                                            } else {
                                                str27 = null;
                                            }
                                            String a5 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(str27, aVar.getAliasPinyin(), aVar.getAliasInitial(), str28);
                                            Intrinsics.checkExpressionValueIsNotNull(a5, "CharacterUtil.convertPin…nitial, highLightKeyword)");
                                            f fVar3 = f.f52045b;
                                            Intrinsics.checkExpressionValueIsNotNull(string3, "str");
                                            fVar3.a(textView, string3, a5, 4);
                                            textView.setVisibility(0);
                                        }
                                    }
                                } else {
                                    aVar2.a(textView, aVar);
                                }
                            }
                        }
                        com.ss.android.ugc.aweme.im.sdk.detail.b.a aVar3 = com.ss.android.ugc.aweme.im.sdk.detail.b.a.f51427b;
                        TextView d2 = d();
                        String str29 = this.h.f51416b;
                        if (str29 == null) {
                            Intrinsics.throwNpe();
                        }
                        if (PatchProxy.isSupport(new Object[]{d2, aVar, str29}, aVar3, com.ss.android.ugc.aweme.im.sdk.detail.b.a.f51426a, false, 52054, new Class[]{TextView.class, com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{d2, aVar, str29}, aVar3, com.ss.android.ugc.aweme.im.sdk.detail.b.a.f51426a, false, 52054, new Class[]{TextView.class, com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class, String.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(d2, "textView");
                            Intrinsics.checkParameterIsNotNull(aVar, "imMember");
                            Intrinsics.checkParameterIsNotNull(str29, "keyword");
                            CharSequence charSequence5 = str29;
                            if (charSequence5.length() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                d2.setText(aVar.getMemberDisplayName());
                            } else {
                                if (!com.ss.android.ugc.aweme.im.sdk.utils.m.a()) {
                                    IMUser user17 = aVar.getUser();
                                    if (user17 == null || user17.getSearchType() != 5) {
                                        IMUser user18 = aVar.getUser();
                                        if (user18 == null || user18.getSearchType() != 4) {
                                            IMUser user19 = aVar.getUser();
                                            if (user19 != null && user19.getSearchType() == 3) {
                                                IMUser user20 = aVar.getUser();
                                                if (user20 != null) {
                                                    str7 = user20.getNickName();
                                                } else {
                                                    str7 = str;
                                                }
                                                IMUser user21 = aVar.getUser();
                                                if (user21 != null) {
                                                    str8 = user21.getNickNamePinyin();
                                                } else {
                                                    str8 = str;
                                                }
                                                IMUser user22 = aVar.getUser();
                                                if (user22 != null) {
                                                    str9 = user22.getNickNameInitial();
                                                } else {
                                                    str9 = str;
                                                }
                                                str29 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(str7, str8, str9, str29);
                                                Intrinsics.checkExpressionValueIsNotNull(str29, "CharacterUtil.convertPin…nitial, highLightKeyword)");
                                            }
                                        } else {
                                            m member4 = aVar.getMember();
                                            if (member4 != null) {
                                                str10 = member4.getAlias();
                                            } else {
                                                str10 = str;
                                            }
                                            str29 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(str10, aVar.getAliasPinyin(), aVar.getAliasInitial(), str29);
                                            Intrinsics.checkExpressionValueIsNotNull(str29, "CharacterUtil.convertPin…nitial, highLightKeyword)");
                                        }
                                    } else {
                                        IMUser user23 = aVar.getUser();
                                        if (user23 != null) {
                                            str11 = user23.getRemarkName();
                                        } else {
                                            str11 = str;
                                        }
                                        IMUser user24 = aVar.getUser();
                                        if (user24 != null) {
                                            str12 = user24.getRemarkPinyin();
                                        } else {
                                            str12 = str;
                                        }
                                        IMUser user25 = aVar.getUser();
                                        if (user25 != null) {
                                            str13 = user25.getRemarkInitial();
                                        } else {
                                            str13 = str;
                                        }
                                        str29 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(str11, str12, str13, str29);
                                        Intrinsics.checkExpressionValueIsNotNull(str29, "CharacterUtil.convertPin…nitial, highLightKeyword)");
                                    }
                                } else {
                                    IMUser user26 = aVar.getUser();
                                    if (user26 != null) {
                                        str2 = user26.getNickName();
                                    } else {
                                        str2 = str;
                                    }
                                    CharSequence charSequence6 = str2;
                                    if (!(charSequence6 == null || charSequence6.length() == 0)) {
                                        z7 = false;
                                    }
                                    if (!z7) {
                                        IMUser user27 = aVar.getUser();
                                        if (user27 != null) {
                                            str3 = user27.getNickName();
                                        } else {
                                            str3 = str;
                                        }
                                        if (str3 == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        if (!StringsKt.contains$default((CharSequence) str3, charSequence5, false, 2, (Object) str)) {
                                            String lowerCase2 = str29.toLowerCase();
                                            Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase()");
                                            IMUser user28 = aVar.getUser();
                                            if (user28 != null) {
                                                str4 = user28.getNickName();
                                            } else {
                                                str4 = str;
                                            }
                                            if (str4 == null) {
                                                Intrinsics.throwNpe();
                                            }
                                            if (str4 != null) {
                                                String lowerCase3 = str4.toLowerCase();
                                                Intrinsics.checkExpressionValueIsNotNull(lowerCase3, "(this as java.lang.String).toLowerCase()");
                                                int indexOf$default = StringsKt.indexOf$default((CharSequence) lowerCase3, lowerCase2, 0, false, 6, (Object) null);
                                                if (indexOf$default != -1) {
                                                    int length = lowerCase2.length() + indexOf$default;
                                                    IMUser user29 = aVar.getUser();
                                                    if (user29 != null) {
                                                        str5 = user29.getNickName();
                                                    } else {
                                                        str5 = str;
                                                    }
                                                    if (str5 == null) {
                                                        Intrinsics.throwNpe();
                                                    }
                                                    int min = Math.min(length, str5.length());
                                                    IMUser user30 = aVar.getUser();
                                                    if (user30 != null) {
                                                        str6 = user30.getNickName();
                                                    } else {
                                                        str6 = str;
                                                    }
                                                    if (str6 == null) {
                                                        Intrinsics.throwNpe();
                                                    }
                                                    if (str6 != null) {
                                                        str29 = str6.substring(indexOf$default, min);
                                                        Intrinsics.checkExpressionValueIsNotNull(str29, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                                    } else {
                                                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                                    }
                                                } else {
                                                    str29 = lowerCase2;
                                                }
                                            } else {
                                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                            }
                                        }
                                    }
                                }
                                f fVar4 = f.f52045b;
                                String memberDisplayName = aVar.getMemberDisplayName();
                                if (memberDisplayName == null) {
                                    memberDisplayName = "";
                                }
                                fVar4.a(d2, memberDisplayName, str29, 0);
                            }
                        }
                        if (PatchProxy.isSupport(new Object[0], this, g, false, 52046, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, g, false, 52046, new Class[0], Void.TYPE);
                            return;
                        }
                        this.itemView.setOnClickListener(new a(this));
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HorizontalAvatarViewHolder(MemberListAdapter memberListAdapter, @NotNull ViewGroup viewGroup, int i2) {
            super(viewGroup, C0906R.layout.a01);
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.h = memberListAdapter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/adapter/MemberListAdapter$Companion;", "", "()V", "TYPE_ADD", "", "TYPE_AVATAR", "TYPE_AVATAR_HORIZONTAL", "TYPE_REMOVE", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f51414a, false, 52041, new Class[0], Integer.TYPE)) {
            return this.f51417d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f51414a, false, 52041, new Class[0], Integer.TYPE)).intValue();
    }

    public MemberListAdapter(@Nullable List<? extends b> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f51417d.addAll(collection);
        }
    }

    public final void a(@Nullable List<? extends b> list) {
        List<? extends b> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f51414a, false, 52036, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f51414a, false, 52036, new Class[]{List.class}, Void.TYPE);
            return;
        }
        a(list2, null);
    }

    public final int getItemViewType(int i) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51414a, false, 52040, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51414a, false, 52040, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        b bVar = this.f51417d.get(i);
        if (bVar instanceof g) {
            return 1;
        }
        if (bVar instanceof com.ss.android.ugc.aweme.im.sdk.detail.a.a) {
            return 0;
        }
        CharSequence charSequence = this.f51416b;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (!z) {
            return 3;
        }
        return 2;
    }

    public final /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{baseViewHolder}, this, f51414a, false, 52042, new Class[]{BaseViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseViewHolder}, this, f51414a, false, 52042, new Class[]{BaseViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseViewHolder, "holder");
        super.onViewAttachedToWindow(baseViewHolder);
        if (baseViewHolder instanceof AvatarViewHolder) {
            AvatarViewHolder avatarViewHolder = (AvatarViewHolder) baseViewHolder;
            if (PatchProxy.isSupport(new Object[0], avatarViewHolder, AvatarViewHolder.f3375c, false, 52031, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], avatarViewHolder, AvatarViewHolder.f3375c, false, 52031, new Class[0], Void.TYPE);
            } else if (!TextUtils.isEmpty(avatarViewHolder.f3377e) && !org.greenrobot.eventbus.c.a().b((Object) avatarViewHolder)) {
                org.greenrobot.eventbus.c.a().a((Object) avatarViewHolder);
            }
        }
    }

    public final /* synthetic */ void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{baseViewHolder}, this, f51414a, false, 52043, new Class[]{BaseViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseViewHolder}, this, f51414a, false, 52043, new Class[]{BaseViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseViewHolder, "holder");
        super.onViewDetachedFromWindow(baseViewHolder);
        if (baseViewHolder instanceof AvatarViewHolder) {
            AvatarViewHolder avatarViewHolder = (AvatarViewHolder) baseViewHolder;
            if (PatchProxy.isSupport(new Object[0], avatarViewHolder, AvatarViewHolder.f3375c, false, 52032, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], avatarViewHolder, AvatarViewHolder.f3375c, false, 52032, new Class[0], Void.TYPE);
            } else if (org.greenrobot.eventbus.c.a().b((Object) avatarViewHolder)) {
                org.greenrobot.eventbus.c.a().c(avatarViewHolder);
            }
        }
    }

    public final void a(@Nullable List<? extends b> list, @Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{list, str}, this, f51414a, false, 52037, new Class[]{List.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, str}, this, f51414a, false, 52037, new Class[]{List.class, String.class}, Void.TYPE);
        } else if (list != null) {
            this.f51416b = str;
            this.f51417d.clear();
            this.f51417d.addAll(list);
            notifyDataSetChanged();
        }
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        BaseViewHolder baseViewHolder = (BaseViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{baseViewHolder, Integer.valueOf(i)}, this, f51414a, false, 52039, new Class[]{BaseViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseViewHolder, Integer.valueOf(i)}, this, f51414a, false, 52039, new Class[]{BaseViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseViewHolder, "holder");
        baseViewHolder.a(this.f51417d.get(i2), i2);
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        BaseViewHolder baseViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f51414a, false, 52038, new Class[]{ViewGroup.class, Integer.TYPE}, BaseViewHolder.class)) {
            baseViewHolder = (BaseViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f51414a, false, 52038, new Class[]{ViewGroup.class, Integer.TYPE}, BaseViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            if (i2 != 3) {
                switch (i2) {
                    case 0:
                        baseViewHolder = new AddViewHolder(viewGroup2, C0906R.layout.vr);
                        break;
                    case 1:
                        baseViewHolder = new RemoveViewHolder(viewGroup2, C0906R.layout.vr);
                        break;
                    default:
                        baseViewHolder = new AvatarViewHolder(viewGroup2, C0906R.layout.vs);
                        break;
                }
            } else {
                baseViewHolder = new HorizontalAvatarViewHolder(this, viewGroup2, C0906R.layout.a01);
                return baseViewHolder;
            }
        }
        return baseViewHolder;
    }
}
