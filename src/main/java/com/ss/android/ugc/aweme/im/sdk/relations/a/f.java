package com.ss.android.ugc.aweme.im.sdk.relations.a;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0007J(\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/uitls/IMUserUtil;", "", "()V", "getSectionIndex", "Lkotlin/Pair;", "", "", "", "users", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "highLightKeyWord", "", "textView", "Landroid/widget/TextView;", "src", "keyword", "startPosition", "setDetailText", "user", "showSignature", "", "setNameText", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52044a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f52045b = new f();

    private f() {
    }

    @NotNull
    public final Pair<List<String>, List<Integer>> a(@NotNull List<? extends IMUser> list) {
        int i;
        List<? extends IMUser> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f52044a, false, 53041, new Class[]{List.class}, Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[]{list2}, this, f52044a, false, 53041, new Class[]{List.class}, Pair.class);
        }
        Intrinsics.checkParameterIsNotNull(list2, "users");
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        String str = null;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            String initialLetter = ((IMUser) list2.get(i3)).getInitialLetter();
            CharSequence charSequence = initialLetter;
            if (!TextUtils.isEmpty(charSequence)) {
                if (str == null || TextUtils.equals(charSequence, str)) {
                    i = i2 + 1;
                } else {
                    arrayList.add(str);
                    arrayList2.add(Integer.valueOf(i2));
                    i = 1;
                }
                if (i3 == list.size() - 1) {
                    Intrinsics.checkExpressionValueIsNotNull(initialLetter, "lastLetter");
                    arrayList.add(initialLetter);
                    arrayList2.add(Integer.valueOf(i));
                }
                i2 = i;
                str = initialLetter;
            }
        }
        return TuplesKt.to(arrayList, arrayList2);
    }

    public final void a(@NotNull TextView textView, @NotNull IMUser iMUser, @NotNull String str) {
        boolean z;
        TextView textView2 = textView;
        IMUser iMUser2 = iMUser;
        String str2 = str;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{textView2, iMUser2, str2}, this, f52044a, false, 53039, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, iMUser2, str2}, this, f52044a, false, 53039, new Class[]{TextView.class, IMUser.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(textView2, "textView");
        Intrinsics.checkParameterIsNotNull(iMUser2, AllStoryActivity.f73306b);
        Intrinsics.checkParameterIsNotNull(str2, "keyword");
        CharSequence charSequence = str2;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            textView2.setText(iMUser.getDisplayName());
            return;
        }
        if (m.a()) {
            CharSequence nickName = iMUser.getNickName();
            if (!(nickName == null || nickName.length() == 0)) {
                z2 = false;
            }
            if (!z2) {
                String nickName2 = iMUser.getNickName();
                Intrinsics.checkExpressionValueIsNotNull(nickName2, "user.nickName");
                if (!StringsKt.contains$default((CharSequence) nickName2, charSequence, false, 2, (Object) null)) {
                    str2 = str.toLowerCase();
                    Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).toLowerCase()");
                    String nickName3 = iMUser.getNickName();
                    Intrinsics.checkExpressionValueIsNotNull(nickName3, "user.nickName");
                    if (nickName3 != null) {
                        String lowerCase = nickName3.toLowerCase();
                        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                        int indexOf$default = StringsKt.indexOf$default((CharSequence) lowerCase, str2, 0, false, 6, (Object) null);
                        if (indexOf$default != -1) {
                            int min = Math.min(str2.length() + indexOf$default, iMUser.getNickName().length());
                            String nickName4 = iMUser.getNickName();
                            Intrinsics.checkExpressionValueIsNotNull(nickName4, "user.nickName");
                            if (nickName4 != null) {
                                str2 = nickName4.substring(indexOf$default, min);
                                Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        } else if (iMUser.getSearchType() == 5) {
            str2 = a.a(iMUser.getRemarkName(), iMUser.getRemarkPinyin(), iMUser.getRemarkInitial(), str2);
            Intrinsics.checkExpressionValueIsNotNull(str2, "CharacterUtil.convertPin…nitial, highLightKeyword)");
        } else if (iMUser.getSearchType() == 3) {
            str2 = a.a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str2);
            Intrinsics.checkExpressionValueIsNotNull(str2, "CharacterUtil.convertPin…nitial, highLightKeyword)");
        }
        String displayName = iMUser.getDisplayName();
        Intrinsics.checkExpressionValueIsNotNull(displayName, "user.displayName");
        a(textView2, displayName, str2, 0);
    }

    /* access modifiers changed from: private */
    public void a(@NotNull TextView textView, @NotNull IMUser iMUser, @NotNull String str, boolean z) {
        boolean z2;
        boolean z3;
        TextView textView2 = textView;
        IMUser iMUser2 = iMUser;
        String str2 = str;
        boolean z4 = true;
        if (PatchProxy.isSupport(new Object[]{textView2, iMUser2, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52044a, false, 53040, new Class[]{TextView.class, IMUser.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, iMUser2, str2, Byte.valueOf(z)}, this, f52044a, false, 53040, new Class[]{TextView.class, IMUser.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(textView2, "textView");
        Intrinsics.checkParameterIsNotNull(iMUser2, AllStoryActivity.f73306b);
        Intrinsics.checkParameterIsNotNull(str2, "keyword");
        if (str2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                CharSequence signature = iMUser.getSignature();
                if (!(signature == null || signature.length() == 0)) {
                    z4 = false;
                }
                if (!z4) {
                    textView2.setText(iMUser.getSignature());
                    textView2.setVisibility(0);
                    return;
                }
            }
            textView2.setVisibility(8);
        } else if (iMUser.getSearchType() == 5) {
            if (z) {
                CharSequence signature2 = iMUser.getSignature();
                if (!(signature2 == null || signature2.length() == 0)) {
                    z4 = false;
                }
                if (!z4) {
                    textView2.setText(iMUser.getSignature());
                    textView2.setVisibility(0);
                    return;
                }
            }
            textView2.setVisibility(8);
        } else if (iMUser.getSearchType() == 3) {
            CharSequence remarkName = iMUser.getRemarkName();
            if (remarkName == null || remarkName.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (z) {
                    CharSequence signature3 = iMUser.getSignature();
                    if (!(signature3 == null || signature3.length() == 0)) {
                        z4 = false;
                    }
                    if (!z4) {
                        textView2.setText(iMUser.getSignature());
                        textView2.setVisibility(0);
                        return;
                    }
                }
                textView2.setVisibility(8);
                return;
            }
            Context context = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
            String string = context.getResources().getString(C0906R.string.avn, new Object[]{iMUser.getNickName()});
            String a2 = a.a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str2);
            Intrinsics.checkExpressionValueIsNotNull(a2, "CharacterUtil.convertPin…nitial, highLightKeyword)");
            Intrinsics.checkExpressionValueIsNotNull(string, "str");
            a(textView2, string, a2, 3);
            textView2.setVisibility(0);
        } else if (iMUser.getSearchType() == 1) {
            String displayId = iMUser.getDisplayId();
            String c2 = a.c(displayId);
            Intrinsics.checkExpressionValueIsNotNull(c2, "CharacterUtil.hanziToPinyin(id)");
            if (c2 != null) {
                String lowerCase = c2.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                String a3 = a.a(displayId, lowerCase, a.b(displayId), str2);
                Intrinsics.checkExpressionValueIsNotNull(a3, "CharacterUtil.convertPin…al(id), highLightKeyword)");
                StringBuilder sb = new StringBuilder();
                Context context2 = GlobalContext.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "GlobalContext.getContext()");
                sb.append(context2.getResources().getString(C0906R.string.ao6));
                sb.append(displayId);
                a(textView2, sb.toString(), a3, 4);
                textView2.setVisibility(0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else if (iMUser.getSearchType() == 2) {
            Context context3 = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "GlobalContext.getContext()");
            String string2 = context3.getResources().getString(C0906R.string.aqe, new Object[]{iMUser.getContactName()});
            String a4 = a.a(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str2);
            Intrinsics.checkExpressionValueIsNotNull(a4, "CharacterUtil.convertPin…tactNameInitial, keyword)");
            Intrinsics.checkExpressionValueIsNotNull(string2, "str");
            a(textView2, string2, a4, 6);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }

    public final void a(@NotNull TextView textView, @NotNull String str, @NotNull String str2, int i) {
        TextView textView2 = textView;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{textView2, str3, str4, Integer.valueOf(i)}, this, f52044a, false, 53042, new Class[]{TextView.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, str3, str4, Integer.valueOf(i)}, this, f52044a, false, 53042, new Class[]{TextView.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(textView2, "textView");
        Intrinsics.checkParameterIsNotNull(str3, "src");
        Intrinsics.checkParameterIsNotNull(str4, "keyword");
        textView2.setText(d.a(ContextCompat.getColor(textView.getContext(), C0906R.color.qo), str3, str4, i));
    }
}
