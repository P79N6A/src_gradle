package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.a.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/adaption/FollowVideoAnimStrategy;", "Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy;", "viewWidth", "", "viewHeight", "tranX", "tranY", "(IIII)V", "onAdaption", "Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy$AdaptionVideoParams;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements com.ss.android.ugc.aweme.sticker.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69847a;

    /* renamed from: b  reason: collision with root package name */
    private final int f69848b;

    /* renamed from: c  reason: collision with root package name */
    private final int f69849c;

    /* renamed from: d  reason: collision with root package name */
    private final int f69850d;

    /* renamed from: e  reason: collision with root package name */
    private final int f69851e;

    @NotNull
    public final b.a a() {
        if (PatchProxy.isSupport(new Object[0], this, f69847a, false, 79499, new Class[0], b.a.class)) {
            return (b.a) PatchProxy.accessDispatch(new Object[0], this, f69847a, false, 79499, new Class[0], b.a.class);
        }
        b.a aVar = new b.a(this.f69848b, this.f69849c);
        aVar.f71623c = this.f69850d;
        aVar.f71624d = this.f69851e;
        return aVar;
    }

    public b(int i, int i2, int i3, int i4) {
        this.f69848b = i;
        this.f69849c = i2;
        this.f69850d = i3;
        this.f69851e = i4;
    }
}
