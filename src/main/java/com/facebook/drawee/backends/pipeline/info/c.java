package com.facebook.drawee.backends.pipeline.info;

import com.facebook.imagepipeline.listener.a;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import javax.annotation.Nullable;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public String f23660a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final b f23661b;

    public c(String str, @Nullable b bVar) {
        this.f23661b = bVar;
        this.f23660a = str;
    }

    public final void onUltimateProducerReached(String str, String str2, boolean z) {
        if (this.f23661b != null) {
            b bVar = this.f23661b;
            String str3 = this.f23660a;
            char c2 = 65535;
            int i = 6;
            switch (str2.hashCode()) {
                case -1914072202:
                    if (str2.equals("BitmapMemoryCacheGetProducer")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1683996557:
                    if (str2.equals("LocalResourceFetchProducer")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -1579985851:
                    if (str2.equals("LocalFileFetchProducer")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -1307634203:
                    if (str2.equals("EncodedMemoryCacheProducer")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1224383234:
                    if (str2.equals("NetworkFetchProducer")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 656304759:
                    if (str2.equals("DiskCacheProducer")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 957714404:
                    if (str2.equals("BitmapMemoryCacheProducer")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1019542023:
                    if (str2.equals("LocalAssetFetchProducer")) {
                        c2 = 8;
                        break;
                    }
                    break;
                case 1721672898:
                    if (str2.equals("DataFetchProducer")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1793127518:
                    if (str2.equals("LocalContentUriThumbnailFetchProducer")) {
                        c2 = 10;
                        break;
                    }
                    break;
                case 2113652014:
                    if (str2.equals("LocalContentUriFetchProducer")) {
                        c2 = 9;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                    i = 5;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 2;
                    break;
                case 5:
                case 6:
                case e.l /*?: ONE_ARG  (7 int)*/:
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    i = 1;
                    break;
            }
            bVar.a(str3, i, z);
        }
    }
}
