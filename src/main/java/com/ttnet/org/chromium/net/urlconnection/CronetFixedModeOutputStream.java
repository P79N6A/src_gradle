package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.base.VisibleForTesting;
import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UploadDataSink;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

public final class CronetFixedModeOutputStream extends CronetOutputStream {
    @VisibleForTesting
    private static int sDefaultBufferLength = 16384;
    public final ByteBuffer mBuffer;
    private long mBytesWritten;
    private final CronetHttpURLConnection mConnection;
    public final long mContentLength;
    private ByteArrayOutputStream mDefaultContent;
    public boolean mIsRewinding;
    public final MessageLoop mMessageLoop;
    public boolean mSupportRewind;
    private final UploadDataProvider mUploadDataProvider = new UploadDataProviderImpl();

    class UploadDataProviderImpl extends UploadDataProvider {
        public long getLength() {
            return CronetFixedModeOutputStream.this.mContentLength;
        }

        private UploadDataProviderImpl() {
        }

        public void rewind(UploadDataSink uploadDataSink) {
            if (CronetFixedModeOutputStream.this.mSupportRewind) {
                CronetFixedModeOutputStream.this.mIsRewinding = true;
                CronetFixedModeOutputStream.this.mBuffer.rewind();
                uploadDataSink.onRewindSucceeded();
                return;
            }
            uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
        }

        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= CronetFixedModeOutputStream.this.mBuffer.remaining()) {
                byteBuffer.put(CronetFixedModeOutputStream.this.mBuffer);
                CronetFixedModeOutputStream.this.mBuffer.clear();
                uploadDataSink.onReadSucceeded(false);
                if (!CronetFixedModeOutputStream.this.mIsRewinding) {
                    CronetFixedModeOutputStream.this.mMessageLoop.quit();
                }
            } else {
                int limit = CronetFixedModeOutputStream.this.mBuffer.limit();
                CronetFixedModeOutputStream.this.mBuffer.limit(CronetFixedModeOutputStream.this.mBuffer.position() + byteBuffer.remaining());
                byteBuffer.put(CronetFixedModeOutputStream.this.mBuffer);
                CronetFixedModeOutputStream.this.mBuffer.limit(limit);
                uploadDataSink.onReadSucceeded(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setConnected() throws IOException {
    }

    /* access modifiers changed from: package-private */
    public final UploadDataProvider getUploadDataProvider() {
        return this.mUploadDataProvider;
    }

    private void ensureBufferHasRemaining() throws IOException {
        if (!this.mBuffer.hasRemaining()) {
            this.mSupportRewind = false;
            uploadBufferInternal();
        }
    }

    private void uploadIfComplete() throws IOException {
        if (this.mBytesWritten == this.mContentLength) {
            uploadBufferInternal();
        }
    }

    private void uploadBufferInternal() throws IOException {
        checkNotClosed();
        this.mBuffer.flip();
        cronet_loop(this.mConnection.getReadTimeout());
        checkNoException();
    }

    /* access modifiers changed from: package-private */
    public final void checkReceivedEnoughContent() throws IOException {
        if (this.mBytesWritten < this.mContentLength) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    @VisibleForTesting
    static void setDefaultBufferLengthForTesting(int i) {
        sDefaultBufferLength = i;
    }

    public final void write(int i) throws IOException {
        checkNotClosed();
        checkNotExceedContentLength(1);
        ensureBufferHasRemaining();
        this.mBuffer.put((byte) i);
        this.mBytesWritten++;
        uploadIfComplete();
    }

    private void checkNotExceedContentLength(int i) throws ProtocolException {
        if (this.mBytesWritten + ((long) i) > this.mContentLength) {
            throw new ProtocolException("expected " + (this.mContentLength - this.mBytesWritten) + " bytes but received " + i);
        }
    }

    private void cronet_loop(int i) throws IOException {
        try {
            this.mMessageLoop.loop(i);
        } catch (SocketTimeoutException unused) {
            if (this.mConnection != null) {
                this.mConnection.onUploadTimeout();
                this.mMessageLoop.reset();
                this.mMessageLoop.loop(i / 2);
            }
        } catch (Exception e2) {
            if (this.mConnection != null) {
                CronetHttpURLConnection cronetHttpURLConnection = this.mConnection;
                cronetHttpURLConnection.setException(new IOException("Unexpected request usage, caught in CronetFixedModeOutputStream, caused by " + e2));
                this.mMessageLoop.reset();
                this.mMessageLoop.loop(i / 2);
            }
        }
    }

    CronetFixedModeOutputStream(CronetHttpURLConnection cronetHttpURLConnection, long j, MessageLoop messageLoop) {
        if (cronetHttpURLConnection == null) {
            throw new NullPointerException();
        } else if (j >= 0) {
            if (j == 0) {
                try {
                    this.mDefaultContent = new ByteArrayOutputStream();
                    this.mDefaultContent.write("body".getBytes("UTF-8"));
                    this.mDefaultContent.write(61);
                    this.mDefaultContent.write("null".getBytes("UTF-8"));
                    j = (long) this.mDefaultContent.size();
                } catch (Throwable unused) {
                }
            }
            this.mContentLength = j;
            this.mBuffer = ByteBuffer.allocate((int) Math.min(this.mContentLength, (long) sDefaultBufferLength));
            this.mConnection = cronetHttpURLConnection;
            this.mMessageLoop = messageLoop;
            this.mBytesWritten = 0;
            this.mSupportRewind = true;
            this.mIsRewinding = false;
        } else {
            throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.mDefaultContent != null && this.mDefaultContent.size() > 0) {
            bArr = this.mDefaultContent.toByteArray();
            i = 0;
            i2 = bArr.length;
            try {
                if (this.mDefaultContent != null) {
                    this.mDefaultContent.close();
                }
                this.mDefaultContent = null;
            } catch (Throwable unused) {
            }
        }
        checkNotClosed();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        checkNotExceedContentLength(i2);
        int i3 = i2;
        while (i3 > 0) {
            ensureBufferHasRemaining();
            int min = Math.min(i3, this.mBuffer.remaining());
            this.mBuffer.put(bArr, (i + i2) - i3, min);
            i3 -= min;
        }
        this.mBytesWritten += (long) i2;
        uploadIfComplete();
    }
}
