package com.bytedance.android.livesdk.gift.effect.entry.b;

import com.bytedance.android.live.base.model.ImageModel;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.executors.h;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.request.ImageRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/bytedance/android/livesdk/gift/effect/entry/asset/LocalImageProvider;", "", "()V", "Companion", "PrefetchTask", "PreparationCallback", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0105a f14816a = new C0105a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/android/livesdk/gift/effect/entry/asset/LocalImageProvider$Companion;", "", "()V", "TAG", "", "isCached", "", "url", "prepare", "", "imageModel", "Lcom/bytedance/android/live/base/model/ImageModel;", "callback", "Lcom/bytedance/android/livesdk/gift/effect/entry/asset/LocalImageProvider$PreparationCallback;", "provide", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.android.livesdk.gift.effect.entry.b.a$a  reason: collision with other inner class name */
    public static final class C0105a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14817a;

        private C0105a() {
        }

        public /* synthetic */ C0105a(byte b2) {
            this();
        }

        private final boolean a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f14817a, false, 9437, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f14817a, false, 9437, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            CacheKey encodedCacheKey = DefaultCacheKeyFactory.getInstance().getEncodedCacheKey(ImageRequest.fromUri(str), null);
            ImagePipelineFactory instance = ImagePipelineFactory.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "ImagePipelineFactory.getInstance()");
            return instance.getMainFileCache().hasKey(encodedCacheKey);
        }

        @Nullable
        public final String a(@NotNull ImageModel imageModel) {
            Object obj;
            ImageModel imageModel2 = imageModel;
            if (PatchProxy.isSupport(new Object[]{imageModel2}, this, f14817a, false, 9435, new Class[]{ImageModel.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{imageModel2}, this, f14817a, false, 9435, new Class[]{ImageModel.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(imageModel2, "imageModel");
            List<String> urls = imageModel.getUrls();
            Intrinsics.checkExpressionValueIsNotNull(urls, "imageModel.urls");
            Iterator it2 = urls.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                String str = (String) obj;
                C0105a aVar = a.f14816a;
                Intrinsics.checkExpressionValueIsNotNull(str, AdvanceSetting.NETWORK_TYPE);
                if (aVar.a(str)) {
                    break;
                }
            }
            return (String) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0014J\u0018\u0010\u0013\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0014J\u0006\u0010\u0014\u001a\u00020\u0010R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/bytedance/android/livesdk/gift/effect/entry/asset/LocalImageProvider$PrefetchTask;", "Lcom/facebook/datasource/BaseDataSubscriber;", "Ljava/lang/Void;", "imageModel", "Lcom/bytedance/android/live/base/model/ImageModel;", "callback", "Lcom/bytedance/android/livesdk/gift/effect/entry/asset/LocalImageProvider$PreparationCallback;", "(Lcom/bytedance/android/live/base/model/ImageModel;Lcom/bytedance/android/livesdk/gift/effect/entry/asset/LocalImageProvider$PreparationCallback;)V", "alternatives", "", "", "getCallback", "()Lcom/bytedance/android/livesdk/gift/effect/entry/asset/LocalImageProvider$PreparationCallback;", "getImageModel", "()Lcom/bytedance/android/live/base/model/ImageModel;", "onFailureImpl", "", "dataSource", "Lcom/facebook/datasource/DataSource;", "onNewResultImpl", "startNext", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class b extends BaseDataSubscriber<Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14818a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final ImageModel f14819b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final c f14820c;

        /* renamed from: d  reason: collision with root package name */
        private final List<String> f14821d;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f14818a, false, 9438, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14818a, false, 9438, new Class[0], Void.TYPE);
            } else if (this.f14821d.isEmpty()) {
                com.bytedance.android.live.core.c.a.c("LocalImageProvider", "Failed to fetch resource " + this.f14819b.getUri());
            } else {
                String remove = this.f14821d.remove(0);
                com.bytedance.android.live.core.c.a.b("LocalImageProvider", "Trying alternative " + remove + " of resource " + this.f14819b.getUri());
                Fresco.getImagePipeline().prefetchToDiskCache(ImageRequest.fromUri(remove), null).subscribe(this, h.a());
            }
        }

        public final void onNewResultImpl(@Nullable DataSource<Void> dataSource) {
            if (PatchProxy.isSupport(new Object[]{dataSource}, this, f14818a, false, 9440, new Class[]{DataSource.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dataSource}, this, f14818a, false, 9440, new Class[]{DataSource.class}, Void.TYPE);
                return;
            }
            if (dataSource == null) {
                Intrinsics.throwNpe();
            }
            if (dataSource.isFinished()) {
                com.bytedance.android.live.core.c.a.b("LocalImageProvider", "Resource " + this.f14819b.getUri() + " fetched from network");
                this.f14820c.a(this.f14819b);
            }
        }

        public final void onFailureImpl(@Nullable DataSource<Void> dataSource) {
            if (PatchProxy.isSupport(new Object[]{dataSource}, this, f14818a, false, 9439, new Class[]{DataSource.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dataSource}, this, f14818a, false, 9439, new Class[]{DataSource.class}, Void.TYPE);
                return;
            }
            if (dataSource == null || dataSource.getFailureCause() == null) {
                if (PatchProxy.isSupport(new Object[]{"LocalImageProvider", "Alternative failed"}, null, com.bytedance.android.live.core.c.a.f7834a, true, 269, new Class[]{String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{"LocalImageProvider", "Alternative failed"}, null, com.bytedance.android.live.core.c.a.f7834a, true, 269, new Class[]{String.class, String.class}, Void.TYPE);
                } else {
                    com.bytedance.android.live.core.c.a.a(5, "LocalImageProvider", "Alternative failed");
                }
            } else {
                Throwable failureCause = dataSource.getFailureCause();
                if (PatchProxy.isSupport(new Object[]{"LocalImageProvider", "Alternative failed", failureCause}, null, com.bytedance.android.live.core.c.a.f7834a, true, 273, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{"LocalImageProvider", "Alternative failed", failureCause}, null, com.bytedance.android.live.core.c.a.f7834a, true, 273, new Class[]{String.class, String.class, Throwable.class}, Void.TYPE);
                } else {
                    com.bytedance.android.live.core.c.a.a(5, "LocalImageProvider", "Alternative failed", failureCause);
                }
            }
            a();
        }

        public b(@NotNull ImageModel imageModel, @NotNull c cVar) {
            Intrinsics.checkParameterIsNotNull(imageModel, "imageModel");
            Intrinsics.checkParameterIsNotNull(cVar, "callback");
            this.f14819b = imageModel;
            this.f14820c = cVar;
            List<String> urls = this.f14819b.getUrls();
            Intrinsics.checkExpressionValueIsNotNull(urls, "imageModel.urls");
            this.f14821d = CollectionsKt.toMutableList((Collection<? extends T>) urls);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/android/livesdk/gift/effect/entry/asset/LocalImageProvider$PreparationCallback;", "", "onFailure", "", "imageModel", "Lcom/bytedance/android/live/base/model/ImageModel;", "onSuccess", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public interface c {
        void a(@NotNull ImageModel imageModel);
    }
}
