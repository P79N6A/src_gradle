package com.ss.android.ugc.aweme.profile.api;

import android.os.Handler;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import java.util.concurrent.Callable;

public final class BlockApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61304a;

    /* renamed from: b  reason: collision with root package name */
    private static final BlockService f61305b = ((BlockService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(BlockService.class));

    public interface BlockService {
        @GET("/aweme/v1/user/block/")
        Call<BlockStruct> block(@Query(a = "user_id") String str, @Query(a = "block_type") int i, @Query(a = "source") int i2);
    }

    public static BlockStruct a(String str, int i, int i2) throws Exception {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f61304a, true, 67436, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, BlockStruct.class)) {
            return (BlockStruct) f61305b.block(str2, i, i2).execute().body();
        }
        return (BlockStruct) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f61304a, true, 67436, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, BlockStruct.class);
    }

    public static void a(Handler handler, String str, int i) {
        Handler handler2 = handler;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2, Integer.valueOf(i)}, null, f61304a, true, 67437, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2, Integer.valueOf(i)}, null, f61304a, true, 67437, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        final int i2 = i;
        m.a().a(handler2, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61306a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f61306a, false, 67439, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f61306a, false, 67439, new Class[0], Object.class);
                }
                String str = str2;
                int i = i2;
                if (!PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, null, BlockApi.f61304a, true, 67435, new Class[]{String.class, Integer.TYPE}, BlockStruct.class)) {
                    return BlockApi.a(str, i, 0);
                }
                return (BlockStruct) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, null, BlockApi.f61304a, true, 67435, new Class[]{String.class, Integer.TYPE}, BlockStruct.class);
            }
        }, 30);
    }

    public static void a(Handler handler, String str, int i, int i2) {
        int i3;
        Handler handler2 = handler;
        final String str2 = str;
        final int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{handler2, str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f61304a, true, 67438, new Class[]{Handler.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f61304a, true, 67438, new Class[]{Handler.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        m a2 = m.a();
        final int i5 = i;
        AnonymousClass2 r4 = new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61309a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f61309a, false, 67440, new Class[0], Object.class)) {
                    return BlockApi.a(str2, i5, i4);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f61309a, false, 67440, new Class[0], Object.class);
            }
        };
        if (i4 == 1) {
            i3 = 32;
        } else {
            i3 = 31;
        }
        a2.a(handler2, r4, i3);
    }
}
