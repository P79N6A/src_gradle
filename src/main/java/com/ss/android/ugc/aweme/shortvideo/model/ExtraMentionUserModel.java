package com.ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fRB\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/model/ExtraMentionUserModel;", "Ljava/io/Serializable;", "()V", "<set-?>", "", "Lkotlin/Pair;", "", "userList", "getUserList", "()Ljava/util/List;", "addMentionUser", "", "uid", "name", "transform", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ExtraMentionUserModel implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private List<Pair<String, String>> userList = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/model/ExtraMentionUserModel$Companion;", "", "()V", "newInstance", "Lcom/ss/android/ugc/aweme/shortvideo/model/ExtraMentionUserModel;", "uid", "", "nickname", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ExtraMentionUserModel newInstance(@NotNull String str, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, changeQuickRedirect, false, 77623, new Class[]{String.class, String.class}, ExtraMentionUserModel.class)) {
                return (ExtraMentionUserModel) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, changeQuickRedirect, false, 77623, new Class[]{String.class, String.class}, ExtraMentionUserModel.class);
            }
            Intrinsics.checkParameterIsNotNull(str3, "uid");
            Intrinsics.checkParameterIsNotNull(str4, "nickname");
            ExtraMentionUserModel extraMentionUserModel = new ExtraMentionUserModel();
            extraMentionUserModel.addMentionUser(str3, str4);
            return extraMentionUserModel;
        }
    }

    @NotNull
    public final List<Pair<String, String>> getUserList() {
        return this.userList;
    }

    @Nullable
    public final List<User> transform() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77622, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77622, new Class[0], List.class);
        }
        List<Pair<String, String>> list = this.userList;
        if (!(!this.userList.isEmpty())) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        Iterable<Pair> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Pair pair : iterable) {
            User user = new User();
            user.setUid((String) pair.getFirst());
            user.setNickname((String) pair.getSecond());
            arrayList.add(user);
        }
        return (List) arrayList;
    }

    public final void addMentionUser(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, changeQuickRedirect, false, 77621, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, changeQuickRedirect, false, 77621, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "uid");
        Intrinsics.checkParameterIsNotNull(str4, "name");
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            this.userList.add(new Pair(str3, str4));
        }
    }
}
