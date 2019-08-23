package com.ss.android.ugc.aweme.im.sdk.chat.c;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/utils/LocalPictureHelper;", "", "()V", "ERROR_PICTURE_PATH", "", "PREFIX_FILE", "getPictureUrlModelFromLocal", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "urlModel", "localPicturePath", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50298a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f50299b = new a();

    private a() {
    }

    @JvmStatic
    @NotNull
    public static final UrlModel a(@Nullable UrlModel urlModel, @Nullable String str) {
        UrlModel urlModel2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{urlModel, str2}, null, f50298a, true, 51372, new Class[]{UrlModel.class, String.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{urlModel, str2}, null, f50298a, true, 51372, new Class[]{UrlModel.class, String.class}, UrlModel.class);
        }
        if (urlModel == null) {
            urlModel2 = new UrlModel();
        } else {
            urlModel2 = urlModel;
        }
        if (urlModel2.getUrlList() == null) {
            urlModel2.setUrlList(new ArrayList());
        }
        if (!TextUtils.isEmpty(str2) && new File(str2).exists()) {
            List<String> urlList = urlModel2.getUrlList();
            urlList.add(0, "file://" + str2);
        }
        if (urlModel2.getUrlList().isEmpty()) {
            urlModel2.getUrlList().add("error_picture_path");
        }
        return urlModel2;
    }
}
