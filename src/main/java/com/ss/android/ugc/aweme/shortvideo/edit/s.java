package com.ss.android.ugc.aweme.shortvideo.edit;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u00017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u001dH\u0007J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\rH\u0007J\b\u0010,\u001a\u00020(H\u0007J\u0018\u0010-\u001a\u00020(2\u0006\u0010)\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0004H\u0007J\u0018\u0010/\u001a\u00020(2\u0006\u0010)\u001a\u00020\r2\u0006\u00100\u001a\u000201H\u0002J \u00102\u001a\u00020(2\u0006\u00100\u001a\u0002012\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u000104H\u0007J\u0016\u00105\u001a\u00020(2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\r04H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u001aj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004`\u001bX\u0004¢\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0$8BX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00068"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/PromptManager;", "", "()V", "PRIORITY_AUTO_ENHANCE", "", "PRIORITY_EFFECT", "PRIORITY_INVALID", "PRIORITY_MUSIC", "PRIORITY_STICKER", "PRIORITY_STICKER_SERVER", "PRIORITY_TEXT_SERVER", "PRIORITY_VOICE", "SHOWN", "", "TAG", "TAG_AUTO_ENHANCE", "TAG_EFFECT", "TAG_MUSIC", "TAG_STICKER", "TAG_STICKER_SERVER", "TAG_TEXT_SERVER", "TAG_VOICE", "sPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "sPriorityMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "shouldShowPrompt", "", "shouldShowPrompt$annotations", "getShouldShowPrompt", "()Z", "setShouldShowPrompt", "(Z)V", "shownTagSet", "", "getShownTagSet", "()Ljava/util/Set;", "editPromptShown", "", "tag", "show", "hasPromptShown", "migrateOldSp", "setPriority", "priority", "showPrompt", "listener", "Lcom/ss/android/ugc/aweme/shortvideo/edit/PromptManager$IShowPrompt;", "tryShowPrompt", "filterTagSet", "", "updateShownSP", "tagSet", "IShowPrompt", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67486a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final s f67487b = new s();

    /* renamed from: c  reason: collision with root package name */
    private static final String f67488c = f67488c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, Integer> f67489d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private static SharedPreferences f67490e = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "av_settings.xml", 0);

    /* renamed from: f  reason: collision with root package name */
    private static boolean f67491f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/PromptManager$IShowPrompt;", "", "tryShowAutoEnhanceGuide", "", "tryShowMusicGuide", "tryShowPropGuide", "tryShowStickerGuide", "tryShowVoiceGuide", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void f();

        void q();

        void r();

        void s();

        void t();
    }

    private s() {
    }

    /* access modifiers changed from: package-private */
    public final Set<String> a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f67486a, false, 76299, new Class[0], Set.class)) {
            return (Set) PatchProxy.accessDispatch(new Object[0], this, f67486a, false, 76299, new Class[0], Set.class);
        }
        String string = f67490e.getString("prompt_shown", "");
        Set<String> hashSet = new HashSet<>();
        if (string != null) {
            if (string.length() > 0) {
                z = true;
            }
            if (z) {
                Object fromJson = com.ss.android.ugc.aweme.port.in.a.f61120c.fromJson(string, Set.class);
                if (fromJson != null) {
                    hashSet = TypeIntrinsics.asMutableSet(fromJson);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
                }
            }
        }
        return hashSet;
    }

    public static final void a(boolean z) {
        f67491f = z;
    }

    @JvmStatic
    private static void a(@NotNull Set<String> set) {
        Set<String> set2 = set;
        if (PatchProxy.isSupport(new Object[]{set2}, null, f67486a, true, 76300, new Class[]{Set.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{set2}, null, f67486a, true, 76300, new Class[]{Set.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(set2, "tagSet");
        if (!set.isEmpty()) {
            Set linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(f67487b.a());
            linkedHashSet.addAll(set2);
            f67490e.edit().putString("prompt_shown", com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) linkedHashSet)).commit();
        }
    }

    @JvmStatic
    public static final void a(@NotNull String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f67486a, true, 76298, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f67486a, true, 76298, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "tag");
        f67489d.put(str2, Integer.valueOf(i));
    }

    @JvmStatic
    public static final void a(@NotNull String str, boolean z) {
        boolean z2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f67486a, true, 76303, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, f67486a, true, 76303, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "tag");
        if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EditPagePrompt)) {
            Set<String> a2 = f67487b.a();
            if (z) {
                z2 = a2.add(str2);
            } else {
                z2 = a2.remove(str2);
            }
            if (z2) {
                a(a2);
            }
        }
    }

    @JvmStatic
    public static final void a(@NotNull a aVar, @Nullable Set<String> set) {
        boolean z;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, null}, null, f67486a, true, 76296, new Class[]{a.class, Set.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, null}, null, f67486a, true, 76296, new Class[]{a.class, Set.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "listener");
        if (PatchProxy.isSupport(new Object[0], null, f67486a, true, 76301, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f67486a, true, 76301, new Class[0], Void.TYPE);
        } else {
            HashSet hashSet = new HashSet();
            SharedPreferences a2 = c.a(com.ss.android.ugc.aweme.port.in.a.f61119b, "ai_music", 0);
            if (a2.getBoolean("ai_music_guide_show", false) || f67490e.getBoolean("show_combine_shoot_mode_tip", false)) {
                hashSet.add("music");
                hashSet.add("effect");
                hashSet.add("sticker");
                hashSet.add("voice");
            }
            SharedPreferences.Editor edit = a2.edit();
            Intrinsics.checkExpressionValueIsNotNull(edit, "preferences.edit()");
            edit.remove("ai_music_guide_show").apply();
            SharedPreferences.Editor edit2 = f67490e.edit();
            Intrinsics.checkExpressionValueIsNotNull(edit2, "sPreferences.edit()");
            edit2.remove("show_combine_shoot_mode_tip").apply();
            a((Set<String>) hashSet);
        }
        if (f67491f) {
            f67491f = false;
            Set<String> a3 = f67487b.a();
            if (!a3.isEmpty()) {
                Iterator<Map.Entry<String, Integer>> it2 = f67489d.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, Integer> next = it2.next();
                    Intrinsics.checkExpressionValueIsNotNull(next, "it.next()");
                    if (a3.contains(next.getKey())) {
                        it2.remove();
                    }
                }
            }
            int i = Integer.MAX_VALUE;
            String str = "";
            for (String next2 : f67489d.keySet()) {
                Integer num = f67489d.get(next2);
                if (num == null) {
                    Intrinsics.throwNpe();
                }
                Integer num2 = num;
                if (num2 == null || num2.intValue() != -1) {
                    Integer num3 = f67489d.get(next2);
                    if (num3 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (Intrinsics.compare(num3.intValue(), i) < 0) {
                        Integer num4 = f67489d.get(next2);
                        if (num4 == null) {
                            Intrinsics.throwNpe();
                        }
                        i = num4.intValue();
                        Intrinsics.checkExpressionValueIsNotNull(next2, "key");
                        str = next2;
                    }
                }
            }
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                s sVar = f67487b;
                if (!PatchProxy.isSupport(new Object[]{str, aVar2}, sVar, f67486a, false, 76297, new Class[]{String.class, a.class}, Void.TYPE)) {
                    switch (str.hashCode()) {
                        case -1917275003:
                            if (str.equals("sticker_server")) {
                                return;
                            }
                            break;
                        case -1890252483:
                            if (str.equals("sticker")) {
                                aVar.r();
                                return;
                            }
                            break;
                        case -1306084975:
                            if (str.equals("effect")) {
                                aVar.q();
                                return;
                            }
                            break;
                        case -701945195:
                            if (str.equals("text_server")) {
                                return;
                            }
                            break;
                        case 104263205:
                            if (str.equals("music")) {
                                aVar.f();
                                return;
                            }
                            break;
                        case 112386354:
                            if (str.equals("voice")) {
                                aVar.s();
                                return;
                            }
                            break;
                        case 516565022:
                            if (str.equals("auto_enhance")) {
                                aVar.t();
                                break;
                            }
                            break;
                    }
                } else {
                    s sVar2 = sVar;
                    PatchProxy.accessDispatch(new Object[]{str, aVar2}, sVar2, f67486a, false, 76297, new Class[]{String.class, a.class}, Void.TYPE);
                }
            }
        }
    }
}
