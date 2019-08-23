package com.ss.android.ugc.aweme.newfollow.ui;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.download.api.b.c;
import com.ss.android.download.api.b.d;
import com.ss.android.download.api.c.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u0001:\u0001,B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ/\u0010\u0018\u001a\u00020\u00192$\u0010\u001a\u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00190\u001bH\bJ\u001a\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010#\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010$\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u0019H\u0016J\u0012\u0010+\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/ui/VideoFollowFeedDetailActivityDownloadListener;", "Lcom/ss/android/download/api/download/DownloadStatusChangeListener;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "activity", "Lcom/ss/android/ugc/aweme/newfollow/ui/VideoFollowFeedDetailActivity;", "downloadPercent", "Landroid/widget/TextView;", "downloadSize", "downloadDetail", "Landroid/widget/ImageView;", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/newfollow/ui/VideoFollowFeedDetailActivity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;)V", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "wpActivity", "Ljava/lang/ref/WeakReference;", "getWpActivity", "()Ljava/lang/ref/WeakReference;", "wpDownloadDetail", "getWpDownloadDetail", "wpDownloadPercent", "getWpDownloadPercent", "wpDownloadSize", "getWpDownloadSize", "execute", "", "f", "Lkotlin/Function4;", "Landroid/app/Activity;", "onDownloadActive", "shortInfo", "Lcom/ss/android/download/api/model/DownloadShortInfo;", "percent", "", "onDownloadFailed", "onDownloadFinished", "onDownloadPaused", "onDownloadStart", "downloadModel", "Lcom/ss/android/download/api/download/DownloadModel;", "downloadController", "Lcom/ss/android/download/api/download/DownloadController;", "onIdle", "onInstalled", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class s implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57331a;
    public static final a g = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<VideoFollowFeedDetailActivity> f57332b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<TextView> f57333c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference<TextView> f57334d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference<ImageView> f57335e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final Aweme f57336f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u0002H\b\u0018\u00010\u0007\"\u0004\b\u0000\u0010\b*\u0002H\bH\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/ui/VideoFollowFeedDetailActivityDownloadListener$Companion;", "", "()V", "asM", "", "value", "asWp", "Ljava/lang/ref/WeakReference;", "T", "(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57337a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final long a(long j) {
            long j2 = j;
            if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f57337a, false, 61748, new Class[]{Long.TYPE}, Long.TYPE)) {
                return Math.max(j2 >> 20, 0);
            }
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f57337a, false, 61748, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
        }

        public final <T> WeakReference<T> a(T t) {
            T t2 = t;
            if (PatchProxy.isSupport(new Object[]{t2}, this, f57337a, false, 61747, new Class[]{Object.class}, WeakReference.class)) {
                return (WeakReference) PatchProxy.accessDispatch(new Object[]{t2}, this, f57337a, false, 61747, new Class[]{Object.class}, WeakReference.class);
            } else if (t2 == null) {
                return null;
            } else {
                return new WeakReference<>(t2);
            }
        }
    }

    public final void a(@NotNull c cVar, @Nullable com.ss.android.download.api.b.a aVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, aVar}, this, f57331a, false, 61740, new Class[]{c.class, com.ss.android.download.api.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, aVar}, this, f57331a, false, 61740, new Class[]{c.class, com.ss.android.download.api.b.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "downloadModel");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57331a, false, 61739, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57331a, false, 61739, new Class[0], Void.TYPE);
            return;
        }
        WeakReference<VideoFollowFeedDetailActivity> weakReference = this.f57332b;
        if (weakReference != null) {
            VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = (VideoFollowFeedDetailActivity) weakReference.get();
            if (videoFollowFeedDetailActivity != null) {
                Intrinsics.checkExpressionValueIsNotNull(videoFollowFeedDetailActivity, "wpActivity?.get() ?: return");
                WeakReference<TextView> weakReference2 = this.f57333c;
                if (weakReference2 != null) {
                    TextView textView = (TextView) weakReference2.get();
                    if (textView != null) {
                        Intrinsics.checkExpressionValueIsNotNull(textView, "wpDownloadPercent?.get() ?: return");
                        WeakReference<TextView> weakReference3 = this.f57334d;
                        if (weakReference3 != null) {
                            TextView textView2 = (TextView) weakReference3.get();
                            if (textView2 != null) {
                                Intrinsics.checkExpressionValueIsNotNull(textView2, "wpDownloadSize?.get() ?: return");
                                WeakReference<ImageView> weakReference4 = this.f57335e;
                                if (weakReference4 != null) {
                                    ImageView imageView = (ImageView) weakReference4.get();
                                    if (imageView != null) {
                                        Intrinsics.checkExpressionValueIsNotNull(imageView, "wpDownloadDetail?.get() ?: return");
                                        textView.setTextColor(ContextCompat.getColor(videoFollowFeedDetailActivity, C0906R.color.ao4));
                                        textView.setText(com.ss.android.ugc.aweme.commercialize.utils.c.D(this.f57336f));
                                        textView2.setVisibility(8);
                                        imageView.setVisibility(0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b(@Nullable e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f57331a, false, 61745, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f57331a, false, 61745, new Class[]{e.class}, Void.TYPE);
            return;
        }
        WeakReference<VideoFollowFeedDetailActivity> weakReference = this.f57332b;
        if (weakReference != null) {
            VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = (VideoFollowFeedDetailActivity) weakReference.get();
            if (videoFollowFeedDetailActivity != null) {
                Intrinsics.checkExpressionValueIsNotNull(videoFollowFeedDetailActivity, "wpActivity?.get() ?: return");
                WeakReference<TextView> weakReference2 = this.f57333c;
                if (weakReference2 != null) {
                    TextView textView = (TextView) weakReference2.get();
                    if (textView != null) {
                        Intrinsics.checkExpressionValueIsNotNull(textView, "wpDownloadPercent?.get() ?: return");
                        WeakReference<TextView> weakReference3 = this.f57334d;
                        if (weakReference3 != null) {
                            TextView textView2 = (TextView) weakReference3.get();
                            if (textView2 != null) {
                                Intrinsics.checkExpressionValueIsNotNull(textView2, "wpDownloadSize?.get() ?: return");
                                WeakReference<ImageView> weakReference4 = this.f57335e;
                                if (weakReference4 != null) {
                                    ImageView imageView = (ImageView) weakReference4.get();
                                    if (imageView != null) {
                                        Intrinsics.checkExpressionValueIsNotNull(imageView, "wpDownloadDetail?.get() ?: return");
                                        textView.setVisibility(0);
                                        textView.setText(C0906R.string.bkb);
                                        textView.setTextColor(ContextCompat.getColor(videoFollowFeedDetailActivity, C0906R.color.ao4));
                                        textView2.setVisibility(8);
                                        imageView.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void c(@Nullable e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f57331a, false, 61744, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f57331a, false, 61744, new Class[]{e.class}, Void.TYPE);
            return;
        }
        WeakReference<VideoFollowFeedDetailActivity> weakReference = this.f57332b;
        if (weakReference != null) {
            VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = (VideoFollowFeedDetailActivity) weakReference.get();
            if (videoFollowFeedDetailActivity != null) {
                Intrinsics.checkExpressionValueIsNotNull(videoFollowFeedDetailActivity, "wpActivity?.get() ?: return");
                WeakReference<TextView> weakReference2 = this.f57333c;
                if (weakReference2 != null) {
                    TextView textView = (TextView) weakReference2.get();
                    if (textView != null) {
                        Intrinsics.checkExpressionValueIsNotNull(textView, "wpDownloadPercent?.get() ?: return");
                        WeakReference<TextView> weakReference3 = this.f57334d;
                        if (weakReference3 != null) {
                            TextView textView2 = (TextView) weakReference3.get();
                            if (textView2 != null) {
                                Intrinsics.checkExpressionValueIsNotNull(textView2, "wpDownloadSize?.get() ?: return");
                                WeakReference<ImageView> weakReference4 = this.f57335e;
                                if (weakReference4 != null) {
                                    ImageView imageView = (ImageView) weakReference4.get();
                                    if (imageView != null) {
                                        Intrinsics.checkExpressionValueIsNotNull(imageView, "wpDownloadDetail?.get() ?: return");
                                        textView.setVisibility(0);
                                        textView.setText(C0906R.string.tr);
                                        textView.setTextColor(ContextCompat.getColor(videoFollowFeedDetailActivity, C0906R.color.ao4));
                                        textView2.setVisibility(8);
                                        imageView.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(@Nullable e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f57331a, false, 61742, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f57331a, false, 61742, new Class[]{e.class}, Void.TYPE);
            return;
        }
        WeakReference<VideoFollowFeedDetailActivity> weakReference = this.f57332b;
        if (weakReference != null) {
            VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = (VideoFollowFeedDetailActivity) weakReference.get();
            if (videoFollowFeedDetailActivity != null) {
                Intrinsics.checkExpressionValueIsNotNull(videoFollowFeedDetailActivity, "wpActivity?.get() ?: return");
                WeakReference<TextView> weakReference2 = this.f57333c;
                if (weakReference2 != null) {
                    TextView textView = (TextView) weakReference2.get();
                    if (textView != null) {
                        Intrinsics.checkExpressionValueIsNotNull(textView, "wpDownloadPercent?.get() ?: return");
                        WeakReference<TextView> weakReference3 = this.f57334d;
                        if (weakReference3 != null) {
                            TextView textView2 = (TextView) weakReference3.get();
                            if (textView2 != null) {
                                Intrinsics.checkExpressionValueIsNotNull(textView2, "wpDownloadSize?.get() ?: return");
                                WeakReference<ImageView> weakReference4 = this.f57335e;
                                if (weakReference4 != null) {
                                    ImageView imageView = (ImageView) weakReference4.get();
                                    if (imageView != null) {
                                        Intrinsics.checkExpressionValueIsNotNull(imageView, "wpDownloadDetail?.get() ?: return");
                                        String string = videoFollowFeedDetailActivity.getString(C0906R.string.bvd);
                                        textView.setVisibility(0);
                                        textView.setText("0%");
                                        textView2.setVisibility(0);
                                        textView2.setText(string);
                                        imageView.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b(@Nullable e eVar, int i) {
        if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f57331a, false, 61741, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f57331a, false, 61741, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        WeakReference<VideoFollowFeedDetailActivity> weakReference = this.f57332b;
        if (weakReference != null) {
            VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = (VideoFollowFeedDetailActivity) weakReference.get();
            if (videoFollowFeedDetailActivity != null) {
                Intrinsics.checkExpressionValueIsNotNull(videoFollowFeedDetailActivity, "wpActivity?.get() ?: return");
                WeakReference<TextView> weakReference2 = this.f57333c;
                if (weakReference2 != null) {
                    TextView textView = (TextView) weakReference2.get();
                    if (textView != null) {
                        Intrinsics.checkExpressionValueIsNotNull(textView, "wpDownloadPercent?.get() ?: return");
                        WeakReference<TextView> weakReference3 = this.f57334d;
                        if (weakReference3 != null) {
                            TextView textView2 = (TextView) weakReference3.get();
                            if (textView2 != null) {
                                Intrinsics.checkExpressionValueIsNotNull(textView2, "wpDownloadSize?.get() ?: return");
                                WeakReference<ImageView> weakReference4 = this.f57335e;
                                if (weakReference4 != null) {
                                    ImageView imageView = (ImageView) weakReference4.get();
                                    if (imageView != null) {
                                        Intrinsics.checkExpressionValueIsNotNull(imageView, "wpDownloadDetail?.get() ?: return");
                                        Activity activity = videoFollowFeedDetailActivity;
                                        textView.setVisibility(0);
                                        textView.setText(activity.getString(C0906R.string.a1u));
                                        textView.setTextColor(ContextCompat.getColor(activity, C0906R.color.a0b));
                                        textView2.setVisibility(8);
                                        imageView.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(@Nullable e eVar, int i) {
        if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f57331a, false, 61743, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f57331a, false, 61743, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
        } else if (eVar != null) {
            WeakReference<VideoFollowFeedDetailActivity> weakReference = this.f57332b;
            if (weakReference != null) {
                VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = (VideoFollowFeedDetailActivity) weakReference.get();
                if (videoFollowFeedDetailActivity != null) {
                    Intrinsics.checkExpressionValueIsNotNull(videoFollowFeedDetailActivity, "wpActivity?.get() ?: return");
                    WeakReference<TextView> weakReference2 = this.f57333c;
                    if (weakReference2 != null) {
                        TextView textView = (TextView) weakReference2.get();
                        if (textView != null) {
                            Intrinsics.checkExpressionValueIsNotNull(textView, "wpDownloadPercent?.get() ?: return");
                            WeakReference<TextView> weakReference3 = this.f57334d;
                            if (weakReference3 != null) {
                                TextView textView2 = (TextView) weakReference3.get();
                                if (textView2 != null) {
                                    Intrinsics.checkExpressionValueIsNotNull(textView2, "wpDownloadSize?.get() ?: return");
                                    WeakReference<ImageView> weakReference4 = this.f57335e;
                                    if (weakReference4 != null) {
                                        ImageView imageView = (ImageView) weakReference4.get();
                                        if (imageView != null) {
                                            Intrinsics.checkExpressionValueIsNotNull(imageView, "wpDownloadDetail?.get() ?: return");
                                            textView.setVisibility(0);
                                            textView.setText(videoFollowFeedDetailActivity.getString(C0906R.string.a7w) + i + '%');
                                            Context context = videoFollowFeedDetailActivity;
                                            textView.setTextColor(ContextCompat.getColor(context, C0906R.color.a0b));
                                            textView2.setVisibility(0);
                                            textView2.setText(g.a(eVar.f28494d) + "M/" + g.a(eVar.f28493c) + 'M');
                                            textView2.setTextColor(ContextCompat.getColor(context, C0906R.color.a0b));
                                            imageView.setVisibility(8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public s(@NotNull Aweme aweme, @Nullable VideoFollowFeedDetailActivity videoFollowFeedDetailActivity, @Nullable TextView textView, @Nullable TextView textView2, @Nullable ImageView imageView) {
        WeakReference<TextView> weakReference;
        WeakReference<TextView> weakReference2;
        Intrinsics.checkParameterIsNotNull(aweme, "aweme");
        this.f57336f = aweme;
        this.f57332b = g.a(videoFollowFeedDetailActivity);
        WeakReference<ImageView> weakReference3 = null;
        if (textView != null) {
            weakReference = g.a(textView);
        } else {
            weakReference = null;
        }
        this.f57333c = weakReference;
        if (textView2 != null) {
            weakReference2 = g.a(textView2);
        } else {
            weakReference2 = null;
        }
        this.f57334d = weakReference2;
        this.f57335e = imageView != null ? g.a(imageView) : weakReference3;
    }
}
