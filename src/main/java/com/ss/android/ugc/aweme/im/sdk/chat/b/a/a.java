package com.ss.android.ugc.aweme.im.sdk.chat.b.a;

import com.bytedance.im.core.d.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMMember;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMemberItem;", "Ljava/io/Serializable;", "()V", "aliasInitial", "", "getAliasInitial", "()Ljava/lang/String;", "setAliasInitial", "(Ljava/lang/String;)V", "aliasPinyin", "getAliasPinyin", "setAliasPinyin", "member", "Lcom/bytedance/im/core/model/Member;", "user", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "getUser", "()Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "setUser", "(Lcom/ss/android/ugc/aweme/im/service/model/IMUser;)V", "getMember", "getMemberDisplayName", "setMember", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements b, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String aliasInitial;
    @Nullable
    private String aliasPinyin;
    private m member;
    @Nullable
    private IMUser user;

    @Nullable
    public final String getAliasInitial() {
        return this.aliasInitial;
    }

    @Nullable
    public final String getAliasPinyin() {
        return this.aliasPinyin;
    }

    @Nullable
    public final m getMember() {
        return this.member;
    }

    @Nullable
    public final IMUser getUser() {
        return this.user;
    }

    @Nullable
    public final String getMemberDisplayName() {
        String str;
        boolean z;
        String str2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 50517, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 50517, new Class[0], String.class);
        }
        IMUser iMUser = this.user;
        if (iMUser != null) {
            str = iMUser.getRemarkName();
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            IMUser iMUser2 = this.user;
            if (iMUser2 != null) {
                return iMUser2.getRemarkName();
            }
            return null;
        }
        m mVar = this.member;
        if (mVar != null) {
            str2 = mVar.getAlias();
        } else {
            str2 = null;
        }
        CharSequence charSequence2 = str2;
        if (charSequence2 == null || charSequence2.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            m mVar2 = this.member;
            if (mVar2 != null) {
                return mVar2.getAlias();
            }
            return null;
        }
        IMUser iMUser3 = this.user;
        if (iMUser3 != null) {
            return iMUser3.getNickName();
        }
        return null;
    }

    public final void setAliasInitial(@Nullable String str) {
        this.aliasInitial = str;
    }

    public final void setAliasPinyin(@Nullable String str) {
        this.aliasPinyin = str;
    }

    public final void setUser(@Nullable IMUser iMUser) {
        this.user = iMUser;
    }

    public final void setMember(@Nullable m mVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{mVar}, this, changeQuickRedirect, false, 50518, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar}, this, changeQuickRedirect, false, 50518, new Class[]{m.class}, Void.TYPE);
            return;
        }
        this.member = mVar;
        String str2 = null;
        if (mVar != null) {
            str = mVar.getAlias();
        } else {
            str = null;
        }
        String c2 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.c(str);
        Intrinsics.checkExpressionValueIsNotNull(c2, "CharacterUtil.hanziToPinyin(member?.alias)");
        if (c2 != null) {
            String lowerCase = c2.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            this.aliasPinyin = lowerCase;
            if (mVar != null) {
                str2 = mVar.getAlias();
            }
            String b2 = com.ss.android.ugc.aweme.im.sdk.relations.a.a.b(str2);
            Intrinsics.checkExpressionValueIsNotNull(b2, "CharacterUtil.hanziToPinyinInitial(member?.alias)");
            if (b2 != null) {
                String lowerCase2 = b2.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase()");
                this.aliasInitial = lowerCase2;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
