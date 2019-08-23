package com.ss.android.ugc.aweme.story.feed.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.a.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/view/DefaultAdaptionStrategy;", "Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy;", "videoWidth", "", "videoHeight", "(II)V", "onAdaption", "Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy$AdaptionVideoParams;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements com.ss.android.ugc.aweme.sticker.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72747a;

    /* renamed from: b  reason: collision with root package name */
    private final int f72748b;

    /* renamed from: c  reason: collision with root package name */
    private final int f72749c;

    @NotNull
    public final b.a a() {
        if (!PatchProxy.isSupport(new Object[0], this, f72747a, false, 83837, new Class[0], b.a.class)) {
            return new b.a(this.f72748b, this.f72749c);
        }
        return (b.a) PatchProxy.accessDispatch(new Object[0], this, f72747a, false, 83837, new Class[0], b.a.class);
    }

    public b(int i, int i2) {
        this.f72748b = i;
        this.f72749c = i2;
    }
}
