package org.apache.commons.net;

import java.net.DatagramSocket;
import java.nio.charset.Charset;

public abstract class DatagramSocketClient {
    private static final DatagramSocketFactory __DEFAULT_SOCKET_FACTORY = new DefaultDatagramSocketFactory();
    protected boolean _isOpen_ = false;
    protected DatagramSocketFactory _socketFactory_ = __DEFAULT_SOCKET_FACTORY;
    protected DatagramSocket _socket_ = null;
    protected int _timeout_ = 0;
    private Charset charset = Charset.defaultCharset();

    public void setDefaultTimeout(int i) {
        this._timeout_ = i;
    }
}
