package com.ss.android.ugc.aweme.j.a;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.bizactivity.BizActivityViewModel;
import com.ss.android.ugc.aweme.bizactivity.g;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.commercialize.utils.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.an;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52925a;

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f52925a, true, 39052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f52925a, true, 39052, new Class[0], Void.TYPE);
        } else {
            r.a("launch_log", (Map) d.a().a("launch_method", "click_join_mission").f34114b);
        }
    }

    public static boolean b(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f52925a, true, 39047, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f52925a, true, 39047, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getXiGuaTask() == null || !aweme.getXiGuaTask().isXiGuaTask() || !aweme.getXiGuaTask().isShowInRedPacket() || c.t(aweme) || com.ss.android.g.a.a()) {
            return false;
        } else {
            return true;
        }
    }

    @Nullable
    public static UrlModel c(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f52925a, true, 39049, new Class[]{Aweme.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{aweme}, null, f52925a, true, 39049, new Class[]{Aweme.class}, UrlModel.class);
        } else if (aweme == null || aweme.getXiGuaTask() == null || !aweme.getXiGuaTask().isXiGuaTask()) {
            return null;
        } else {
            UrlModel urlModel = new UrlModel();
            ArrayList arrayList = new ArrayList();
            arrayList.add(aweme.getXiGuaTask().getIconUrl());
            urlModel.setUri(aweme.getXiGuaTask().getIconUrl());
            urlModel.setUrlList(arrayList);
            return urlModel;
        }
    }

    public static boolean a(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f52925a, true, 39046, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f52925a, true, 39046, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getPoiStruct() != null || c.t(aweme) || com.ss.android.g.a.a() || aweme.getXiGuaTask() == null || !aweme.getXiGuaTask().isXiGuaTask() || !aweme.getXiGuaTask().isShowInPoi()) {
            return false;
        } else {
            return true;
        }
    }

    public static void a(@NonNull Context context, @NonNull Aweme aweme) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, aweme}, null, f52925a, true, 39051, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme}, null, f52925a, true, 39051, new Class[]{Context.class, Aweme.class}, Void.TYPE);
        } else if (context2 != null && aweme != null && aweme.getXiGuaTask() != null) {
            Intent intent = new Intent(context2, CrossPlatformActivity.class);
            intent.setData(Uri.parse(aweme.getXiGuaTask().getJumpUrl()));
            intent.putExtra("bundle_user_webview_title", true);
            context2.startActivity(intent);
        }
    }

    public static void a(Aweme aweme, RemoteImageView remoteImageView, String str, Context context) {
        boolean z;
        UrlModel urlModel;
        String str2;
        boolean z2;
        RemoteImageView remoteImageView2 = remoteImageView;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{aweme, remoteImageView2, str3, context}, null, f52925a, true, 39053, new Class[]{Aweme.class, RemoteImageView.class, String.class, Context.class}, Void.TYPE)) {
            Object[] objArr = {aweme, remoteImageView2, str3, context};
            PatchProxy.accessDispatch(objArr, null, f52925a, true, 39053, new Class[]{Aweme.class, RemoteImageView.class, String.class, Context.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{aweme, context}, null, f52925a, true, 39048, new Class[]{Aweme.class, Context.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme, context}, null, f52925a, true, 39048, new Class[]{Aweme.class, Context.class}, Boolean.TYPE)).booleanValue();
        } else {
            if (aweme == null || aweme.getXiGuaTask() == null || !aweme.getXiGuaTask().isXiGuaTask() || !aweme.getXiGuaTask().isShowInEvening() || c.t(aweme) || com.ss.android.g.a.a()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (PatchProxy.isSupport(new Object[]{context}, null, an.f46500a, true, 42856, new Class[]{Context.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, an.f46500a, true, 42856, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                } else if (!com.ss.android.g.a.a()) {
                    BizActivityViewModel bizActivityViewModel = (BizActivityViewModel) ViewModelProviders.of((FragmentActivity) context).get(BizActivityViewModel.class);
                    if (bizActivityViewModel.a() == null || bizActivityViewModel.a().getValue() == null || ((g) bizActivityViewModel.a().getValue()).f35231b == null || ((g) bizActivityViewModel.a().getValue()).f35231b.i) {
                        z = true;
                    }
                }
            }
            z = false;
        }
        if (z) {
            if (PatchProxy.isSupport(new Object[]{aweme}, null, f52925a, true, 39050, new Class[]{Aweme.class}, UrlModel.class)) {
                urlModel = (UrlModel) PatchProxy.accessDispatch(new Object[]{aweme}, null, f52925a, true, 39050, new Class[]{Aweme.class}, UrlModel.class);
            } else if (aweme == null || aweme.getXiGuaTask() == null || !aweme.getXiGuaTask().isXiGuaTask()) {
                urlModel = null;
            } else {
                urlModel = new UrlModel();
                ArrayList arrayList = new ArrayList();
                arrayList.add(aweme.getXiGuaTask().getEntranceUrl());
                urlModel.setUri(aweme.getXiGuaTask().getEntranceUrl());
                urlModel.setUrlList(arrayList);
            }
            if (urlModel != null) {
                e.a(remoteImageView2, urlModel);
                remoteImageView2.setVisibility(0);
                User author = aweme.getAuthor();
                d a2 = d.a().a("enter_from", str3).a("group_id", aweme.getAid());
                if (author != null) {
                    str2 = author.getUid();
                } else {
                    str2 = "";
                }
                r.a("show_mission_icon", (Map) a2.a("author_id", str2).a("entrance_location", "activity_entrance").f34114b);
                return;
            }
            return;
        }
        remoteImageView2.setVisibility(8);
    }
}
