package com.ss.android.ugc.aweme.utils;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.profile.model.User;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75963a;

    @Nullable
    public static UrlModel a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75963a, true, 87996, new Class[]{User.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{user}, null, f75963a, true, 87996, new Class[]{User.class}, UrlModel.class);
        } else if (user == null) {
            return null;
        } else {
            if (user.getAvatarThumb() != null) {
                return user.getAvatarThumb();
            }
            if (user.getAvatarMedium() != null) {
                return user.getAvatarMedium();
            }
            if (user.getAvatarLarger() == null) {
                return null;
            }
            a.a((Exception) new IllegalStateException("Your avatar image is too large !"));
            return user.getAvatarLarger();
        }
    }

    @Nullable
    public static UrlModel b(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75963a, true, 87997, new Class[]{User.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{user}, null, f75963a, true, 87997, new Class[]{User.class}, UrlModel.class);
        } else if (user == null) {
            return null;
        } else {
            if (user.getAvatarMedium() != null) {
                return user.getAvatarMedium();
            }
            if (user.getAvatarThumb() != null) {
                return user.getAvatarThumb();
            }
            if (user.getAvatarLarger() != null) {
                return user.getAvatarLarger();
            }
            return null;
        }
    }
}
