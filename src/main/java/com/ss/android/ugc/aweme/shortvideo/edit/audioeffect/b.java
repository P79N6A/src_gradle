package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.content.Context;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.medialib.f.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectHelper;", "", "()V", "FAST_CLICK_TIME_THRESHOLD", "", "clickTimeMap", "Landroid/util/SparseArray;", "", "copyInternalAudioResources", "", "generateUrlModel", "Lcom/ss/android/ugc/effectmanager/common/model/UrlModel;", "resId", "getLocalAudioEffects", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryPageModel;", "isFastDoubleClick", "", "target", "Landroid/view/View;", "prepare", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67055a;

    /* renamed from: b  reason: collision with root package name */
    static final SparseArray<Long> f67056b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public static final b f67057c = new b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 15})
    public static final class a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67058a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f67059b = new a();

        a() {
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f67058a, false, 76598, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f67058a, false, 76598, new Class[0], String.class);
            }
            Context context = GlobalContext.getContext();
            new e().a(context, (int) C0906R.raw.baritone, ff.t);
            return new e().a(context, (int) C0906R.raw.chipmunk, ff.t);
        }
    }

    private b() {
    }

    @NotNull
    public final CategoryPageModel a() {
        UrlModel urlModel;
        if (PatchProxy.isSupport(new Object[0], this, f67055a, false, 76596, new Class[0], CategoryPageModel.class)) {
            return (CategoryPageModel) PatchProxy.accessDispatch(new Object[0], this, f67055a, false, 76596, new Class[0], CategoryPageModel.class);
        }
        List listOf = CollectionsKt.listOf("chipmunk", "baritone");
        List listOf2 = CollectionsKt.listOf(2130837688, 2130837687);
        Context context = GlobalContext.getContext();
        List listOf3 = CollectionsKt.listOf(context.getString(C0906R.string.jb), context.getString(C0906R.string.ja));
        List listOf4 = CollectionsKt.listOf("default_1", "default_2");
        Iterable iterable = listOf2;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        int i = 0;
        int i2 = -1;
        for (Object next : iterable) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int intValue = ((Number) next).intValue();
            Effect effect = new Effect();
            int i4 = i2 - 1;
            effect.effect_id = String.valueOf(i2);
            effect.name = (String) listOf3.get(i);
            b bVar = f67057c;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue)}, bVar, f67055a, false, 76597, new Class[]{Integer.TYPE}, UrlModel.class)) {
                urlModel = (UrlModel) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue)}, bVar, f67055a, false, 76597, new Class[]{Integer.TYPE}, UrlModel.class);
            } else {
                urlModel = new UrlModel();
                urlModel.url_list = CollectionsKt.listOf(String.valueOf(intValue));
            }
            effect.icon_url = urlModel;
            effect.unzipPath = ff.t + ((String) listOf.get(i));
            effect.tags = CollectionsKt.listOf(listOf4.get(i));
            arrayList.add(effect);
            i = i3;
            i2 = i4;
        }
        CategoryPageModel categoryPageModel = new CategoryPageModel();
        CategoryEffectModel categoryEffectModel = new CategoryEffectModel();
        categoryEffectModel.effects = (List) arrayList;
        categoryPageModel.category_effects = categoryEffectModel;
        return categoryPageModel;
    }
}
