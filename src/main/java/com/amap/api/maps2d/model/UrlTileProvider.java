package com.amap.api.maps2d.model;

import com.amap.api.mapcore2d.ck;
import com.amap.api.mapcore2d.cm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public abstract class UrlTileProvider implements TileProvider {

    /* renamed from: a  reason: collision with root package name */
    private final int f6415a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6416b;

    public abstract URL getTileUrl(int i, int i2, int i3);

    public int getTileHeight() {
        return this.f6416b;
    }

    public int getTileWidth() {
        return this.f6415a;
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public UrlTileProvider(int i, int i2) {
        this.f6415a = i;
        this.f6416b = i2;
    }

    private static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public final Tile getTile(int i, int i2, int i3) {
        Tile tile;
        URL tileUrl = getTileUrl(i, i2, i3);
        if (tileUrl == null) {
            return NO_TILE;
        }
        ck.a("UrlTileProvider", "url: " + tileUrl.toString(), 111);
        try {
            tile = new Tile(this.f6415a, this.f6416b, a(tileUrl.openStream()));
        } catch (IOException e2) {
            cm.a(e2, "UrlTileProvider", "getTile");
            tile = NO_TILE;
        }
        return tile;
    }
}
