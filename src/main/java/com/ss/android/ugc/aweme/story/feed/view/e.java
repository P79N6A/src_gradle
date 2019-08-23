package com.ss.android.ugc.aweme.story.feed.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.a.b;
import com.ss.android.ugc.aweme.story.feed.c.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/view/StoryVideoAdaptionStrategy;", "Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy;", "videoWidth", "", "videoHeight", "screenWidth", "screenHeight", "(IIII)V", "onAdaption", "Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy$AdaptionVideoParams;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72754a;

    /* renamed from: b  reason: collision with root package name */
    private final int f72755b;

    /* renamed from: c  reason: collision with root package name */
    private final int f72756c;

    /* renamed from: d  reason: collision with root package name */
    private final int f72757d;

    /* renamed from: e  reason: collision with root package name */
    private final int f72758e;

    @NotNull
    public final b.a a() {
        if (PatchProxy.isSupport(new Object[0], this, f72754a, false, 83892, new Class[0], b.a.class)) {
            return (b.a) PatchProxy.accessDispatch(new Object[0], this, f72754a, false, 83892, new Class[0], b.a.class);
        }
        b.a aVar = new b.a(this.f72755b, this.f72756c);
        d.a(this.f72755b, this.f72756c, this.f72757d, this.f72758e, aVar);
        return aVar;
    }

    public e(int i, int i2, int i3, int i4) {
        this.f72755b = i;
        this.f72756c = i2;
        this.f72757d = i3;
        this.f72758e = i4;
    }
}
