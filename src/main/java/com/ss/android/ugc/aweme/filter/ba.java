package com.ss.android.ugc.aweme.filter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b.a;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/TTNetDownloadManager;", "", "()V", "download", "", "url", "", "filePath", "listener", "Lcom/ss/android/ugc/aweme/common/http/DownloadManager$OnDownloadListener;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ba {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47552a;

    /* renamed from: b  reason: collision with root package name */
    public static final ba f47553b = new ba();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/ugc/aweme/filter/TTNetDownloadManager$download$1$1$1", "com/ss/android/ugc/aweme/filter/TTNetDownloadManager$$special$$inlined$use$lambda$1"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ byte[] $bytes$inlined;
        final /* synthetic */ InputStream $input$inlined;
        final /* synthetic */ long $length$inlined;
        final /* synthetic */ a.C0521a $listener$inlined;
        final /* synthetic */ FileOutputStream $outputStream$inlined;
        final /* synthetic */ Ref.IntRef $read$inlined;
        final /* synthetic */ String $url$inlined;
        final /* synthetic */ Ref.IntRef $writeLength$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(InputStream inputStream, FileOutputStream fileOutputStream, Ref.IntRef intRef, byte[] bArr, Ref.IntRef intRef2, a.C0521a aVar, String str, long j) {
            super(0);
            this.$input$inlined = inputStream;
            this.$outputStream$inlined = fileOutputStream;
            this.$read$inlined = intRef;
            this.$bytes$inlined = bArr;
            this.$writeLength$inlined = intRef2;
            this.$listener$inlined = aVar;
            this.$url$inlined = str;
            this.$length$inlined = j;
        }

        public final int invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44435, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44435, new Class[0], Integer.TYPE)).intValue();
            }
            this.$read$inlined.element = this.$input$inlined.read(this.$bytes$inlined);
            return this.$read$inlined.element;
        }
    }

    private ba() {
    }
}
