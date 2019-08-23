package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\"\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a*\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001\u001a\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u001a\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u001a\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0006\u001a\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u001a\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u001a\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u001a\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u001c\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001¨\u0006\u001e"}, d2 = {"getCurStickerLocation", "", "Lcom/ss/android/ugc/aweme/sticker/data/NormalTrackTimeStamp;", "curPts", "", "interactStickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "listData", "getPoiStickerLocation", "getRealAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "aweme", "getStickerAttr", "Lcom/ss/android/ugc/aweme/sticker/data/StickerAttrStruct;", "getStickerLocation", "getTrackTimeStamps", "Lcom/ss/android/ugc/aweme/sticker/data/BaseTrackTimeStamp;", "struct", "getUrlEnterMethod", "", "url", "getVideoAid", "getVideoAuthor", "Lcom/ss/android/ugc/aweme/profile/model/User;", "isDebugOepn", "", "context", "Landroid/content/Context;", "setTrackTimeStamps", "", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69842a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/InteractStickerUtilsKt$getCurStickerLocation$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/ss/android/ugc/aweme/sticker/data/NormalTrackTimeStamp;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a$a  reason: collision with other inner class name */
    public static final class C0733a extends TypeToken<List<? extends NormalTrackTimeStamp>> {
        C0733a() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/InteractStickerUtilsKt$getPoiStickerLocation$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/ss/android/ugc/aweme/sticker/data/NormalTrackTimeStamp;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends TypeToken<List<? extends NormalTrackTimeStamp>> {
        b() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/InteractStickerUtilsKt$getStickerLocation$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/ss/android/ugc/aweme/sticker/data/NormalTrackTimeStamp;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends TypeToken<List<? extends NormalTrackTimeStamp>> {
        c() {
        }
    }

    @Nullable
    public static final String a(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f69842a, true, 79484, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f69842a, true, 79484, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            if (aweme.getAwemeType() != 13 || aweme.getForwardItem() == null) {
                return aweme.getAid();
            }
            Aweme forwardItem = aweme.getForwardItem();
            Intrinsics.checkExpressionValueIsNotNull(forwardItem, "aweme.forwardItem");
            return forwardItem.getAid();
        }
    }

    @Nullable
    public static final User b(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f69842a, true, 79485, new Class[]{Aweme.class}, User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[]{aweme}, null, f69842a, true, 79485, new Class[]{Aweme.class}, User.class);
        } else if (aweme == null) {
            return null;
        } else {
            if (aweme.getAwemeType() != 13 || aweme.getForwardItem() == null) {
                return aweme.getAuthor();
            }
            Aweme forwardItem = aweme.getForwardItem();
            Intrinsics.checkExpressionValueIsNotNull(forwardItem, "aweme.forwardItem");
            return forwardItem.getAuthor();
        }
    }

    @Nullable
    public static final Aweme c(@Nullable Aweme aweme) {
        Aweme aweme2;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f69842a, true, 79486, new Class[]{Aweme.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{aweme}, null, f69842a, true, 79486, new Class[]{Aweme.class}, Aweme.class);
        } else if (aweme == null) {
            return null;
        } else {
            if (aweme.getAwemeType() == 13) {
                aweme2 = aweme.getForwardItem();
            } else {
                aweme2 = aweme;
            }
            return aweme2;
        }
    }

    @NotNull
    public static final String a(@Nullable String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, null, f69842a, true, 79483, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f69842a, true, 79483, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                str2 = parse.getHost();
            } else {
                str2 = null;
            }
            if (TextUtils.equals(str2, f.f34167a)) {
                return "web_url";
            }
            return f.f34168b;
        }
    }

    @Nullable
    public static final NormalTrackTimeStamp b(@Nullable InteractStickerStruct interactStickerStruct) {
        List list;
        String str;
        if (PatchProxy.isSupport(new Object[]{interactStickerStruct}, null, f69842a, true, 79478, new Class[]{InteractStickerStruct.class}, NormalTrackTimeStamp.class)) {
            return (NormalTrackTimeStamp) PatchProxy.accessDispatch(new Object[]{interactStickerStruct}, null, f69842a, true, 79478, new Class[]{InteractStickerStruct.class}, NormalTrackTimeStamp.class);
        } else if (interactStickerStruct != null && !interactStickerStruct.isPoiSticker()) {
            return null;
        } else {
            try {
                Gson d2 = m.d();
                if (interactStickerStruct != null) {
                    str = interactStickerStruct.getTrackList();
                } else {
                    str = null;
                }
                list = (List) d2.fromJson(str, new b().getType());
            } catch (JsonSyntaxException unused) {
                list = null;
            }
            if (CollectionUtils.isEmpty(list)) {
                return null;
            }
            if (list == null) {
                Intrinsics.throwNpe();
            }
            NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) list.get(0);
            if (!normalTrackTimeStamp.isFullTrack()) {
                return null;
            }
            return normalTrackTimeStamp;
        }
    }

    @Nullable
    public static final StickerAttrStruct c(@Nullable InteractStickerStruct interactStickerStruct) {
        StickerAttrStruct stickerAttrStruct;
        if (PatchProxy.isSupport(new Object[]{interactStickerStruct}, null, f69842a, true, 79482, new Class[]{InteractStickerStruct.class}, StickerAttrStruct.class)) {
            return (StickerAttrStruct) PatchProxy.accessDispatch(new Object[]{interactStickerStruct}, null, f69842a, true, 79482, new Class[]{InteractStickerStruct.class}, StickerAttrStruct.class);
        } else if (interactStickerStruct == null) {
            return null;
        } else {
            try {
                stickerAttrStruct = (StickerAttrStruct) m.d().fromJson(interactStickerStruct.getAttr(), StickerAttrStruct.class);
            } catch (JsonSyntaxException unused) {
                stickerAttrStruct = null;
            }
            return stickerAttrStruct;
        }
    }

    @Nullable
    public static final List<NormalTrackTimeStamp> a(@Nullable InteractStickerStruct interactStickerStruct) {
        List<NormalTrackTimeStamp> list;
        String str;
        if (PatchProxy.isSupport(new Object[]{interactStickerStruct}, null, f69842a, true, 79475, new Class[]{InteractStickerStruct.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{interactStickerStruct}, null, f69842a, true, 79475, new Class[]{InteractStickerStruct.class}, List.class);
        }
        try {
            Gson d2 = m.d();
            if (interactStickerStruct != null) {
                str = interactStickerStruct.getTrackList();
            } else {
                str = null;
            }
            list = (List) d2.fromJson(str, new c().getType());
        } catch (JsonSyntaxException unused) {
            list = null;
        }
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list;
    }

    public static final boolean a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f69842a, true, 79481, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f69842a, true, 79481, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return com.ss.android.ugc.aweme.q.c.a(context2, "test_data", 0).getBoolean("sp_interact_stickers_test", false);
    }

    @Nullable
    public static final List<NormalTrackTimeStamp> a(long j, @Nullable InteractStickerStruct interactStickerStruct) {
        List list;
        long j2;
        boolean z;
        String str;
        long j3 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), interactStickerStruct}, null, f69842a, true, 79476, new Class[]{Long.TYPE, InteractStickerStruct.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{new Long(j3), interactStickerStruct}, null, f69842a, true, 79476, new Class[]{Long.TYPE, InteractStickerStruct.class}, List.class);
        }
        List<NormalTrackTimeStamp> list2 = null;
        try {
            Gson d2 = m.d();
            if (interactStickerStruct != null) {
                str = interactStickerStruct.getTrackList();
            } else {
                str = null;
            }
            list = (List) d2.fromJson(str, new C0733a().getType());
        } catch (JsonSyntaxException unused) {
            list = null;
        }
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) next;
                if (normalTrackTimeStamp != null) {
                    j2 = (long) normalTrackTimeStamp.getPts();
                } else {
                    j2 = 0;
                }
                long j4 = j3 - j2;
                if (-160 <= j4 && 160 >= j4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            list2 = (List) arrayList;
        }
        return list2;
    }
}
