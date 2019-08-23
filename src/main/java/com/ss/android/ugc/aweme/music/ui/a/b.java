package com.ss.android.ugc.aweme.music.ui.a;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCoverInfo;
import com.ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;
import com.ss.android.ugc.aweme.music.util.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010J\u0016\u0010\u0018\u001a\u00020\u000e2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010J\u0016\u0010\u001a\u001a\u00020\u000e2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010J\u0016\u0010\u001b\u001a\u00020\u000e2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/music/ui/helper/PartnerMusicHelper;", "", "()V", "SETTING_THIRD_PARTY_MUSIC_COVER", "", "sThirdMusicCover", "Lcom/ss/android/ugc/aweme/music/model/ThirdMusicCoverItem;", "attachPartnerTag", "", "textView", "Landroid/widget/TextView;", "music", "Lcom/ss/android/ugc/aweme/music/model/Music;", "whiteMode", "", "getMusicCoverUrl", "", "partnerName", "getMusicPlayResourseId", "", "getThirdMusicCover", "getValidExternalMusicInfo", "Lcom/ss/android/ugc/aweme/music/model/ExternalMusicInfo;", "externalMusicInfoList", "isApple", "externalMusicInfos", "isAwa", "isNetEase", "monitorJsonErrorEvent", "jsonContent", "parseThirdPartyMusicSetting", "data", "Lorg/json/JSONObject;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56656a;

    /* renamed from: b  reason: collision with root package name */
    public static ThirdMusicCoverItem f56657b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f56658c = new b();

    private b() {
    }

    private final ThirdMusicCoverItem a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f56656a, false, 60566, new Class[0], ThirdMusicCoverItem.class)) {
            return (ThirdMusicCoverItem) PatchProxy.accessDispatch(new Object[0], this, f56656a, false, 60566, new Class[0], ThirdMusicCoverItem.class);
        }
        if (f56657b == null) {
            a.C0647a aVar = a.f56791b;
            if (PatchProxy.isSupport(new Object[]{"third_music_cover_info", "", "music_sp"}, aVar, a.C0647a.f56792a, false, 60585, new Class[]{String.class, String.class, String.class}, String.class)) {
                a.C0647a aVar2 = aVar;
                str = (String) PatchProxy.accessDispatch(new Object[]{"third_music_cover_info", "", "music_sp"}, aVar2, a.C0647a.f56792a, false, 60585, new Class[]{String.class, String.class, String.class}, String.class);
            } else {
                Intrinsics.checkParameterIsNotNull("third_music_cover_info", "key");
                Intrinsics.checkParameterIsNotNull("music_sp", "repo");
                str = Keva.getRepoFromSp(k.a(), "music_sp", 0).getString("third_music_cover_info", "");
                Intrinsics.checkExpressionValueIsNotNull(str, "keva.getString(key, default?:\"\")");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    f56657b = (ThirdMusicCoverItem) new Gson().fromJson(str, ThirdMusicCoverItem.class);
                } catch (Throwable unused) {
                    b(str);
                }
            }
        }
        return f56657b;
    }

    private boolean b(@Nullable List<ExternalMusicInfo> list) {
        ExternalMusicInfo externalMusicInfo;
        List<ExternalMusicInfo> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f56656a, false, 60560, new Class[]{List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list2}, this, f56656a, false, 60560, new Class[]{List.class}, Boolean.TYPE)).booleanValue();
        } else if (CollectionUtils.isEmpty(list2)) {
            return false;
        } else {
            String str = null;
            if (list2 != null) {
                externalMusicInfo = list2.get(0);
            } else {
                externalMusicInfo = null;
            }
            if (externalMusicInfo != null) {
                str = externalMusicInfo.getPartnerName();
            }
            return TextUtils.equals(str, "awa");
        }
    }

    @Nullable
    public final List<String> a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f56656a, false, 60565, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str}, this, f56656a, false, 60565, new Class[]{String.class}, List.class);
        }
        ThirdMusicCoverItem a2 = a();
        if (a2 != null) {
            List<MusicCoverInfo> list = a2.musicCoverInfoList;
            if (!CollectionUtils.isEmpty(list)) {
                for (MusicCoverInfo next : list) {
                    if (next != null && TextUtils.equals(next.partnerName, str)) {
                        return next.coverUrlList;
                    }
                }
            }
        }
        return null;
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f56656a, false, 60568, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f56656a, false, 60568, new Class[]{String.class}, Void.TYPE);
            return;
        }
        MonitorUtils.monitorCommonLog("third_music_json_parse_error", c.a().a("message", str2).b());
    }

    @NotNull
    public final List<ExternalMusicInfo> a(@NotNull List<ExternalMusicInfo> list) {
        List<ExternalMusicInfo> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f56656a, false, 60567, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2}, this, f56656a, false, 60567, new Class[]{List.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(list2, "externalMusicInfoList");
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(list2)) {
            for (ExternalMusicInfo next : list) {
                if (!TextUtils.isEmpty(next.getJumpUrl()) && !TextUtils.isEmpty(next.getPartnerName())) {
                    if (!CollectionUtils.isEmpty(a(next.getPartnerName()))) {
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void a(@Nullable TextView textView, @Nullable Music music, boolean z) {
        List<ExternalMusicInfo> list;
        int i;
        int i2;
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2, music, Byte.valueOf(z ? (byte) 1 : 0)}, this, f56656a, false, 60563, new Class[]{TextView.class, Music.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, music, Byte.valueOf(z)}, this, f56656a, false, 60563, new Class[]{TextView.class, Music.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        b bVar = f56658c;
        if (music != null) {
            list = music.getExternalMusicInfos();
        } else {
            list = null;
        }
        if (!bVar.b(list)) {
            i = 0;
        } else if (z) {
            i = 2130840595;
        } else {
            i = 2130840596;
        }
        if (textView2 != null) {
            if (i > 0) {
                i2 = u.a(5.0d);
            } else {
                i2 = 0;
            }
            textView2.setCompoundDrawablePadding(i2);
        }
        if (textView2 != null) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        }
    }
}
