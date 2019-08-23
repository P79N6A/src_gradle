package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.support.v4.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000e\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0003R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioPreprocessCache;", "", "cacheLimit", "", "(I)V", "cache", "Landroid/support/v4/util/LruCache;", "", "", "get", "key", "put", "", "preprocessCache", "remove", "removeAll", "trimToSize", "target", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67075a;

    /* renamed from: b  reason: collision with root package name */
    public LruCache<String, byte[]> f67076b;

    public f() {
        this(0, 1);
    }

    private f(int i) {
        int min = Math.min((int) (Runtime.getRuntime().maxMemory() / 8), i);
        this.f67076b = new AudioPreprocessCache$1(min, min);
    }

    public /* synthetic */ f(int i, int i2) {
        this(1048576);
    }
}
