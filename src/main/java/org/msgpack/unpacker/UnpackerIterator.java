package org.msgpack.unpacker;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.msgpack.packer.Unconverter;
import org.msgpack.type.Value;

public class UnpackerIterator implements Iterator<Value> {
    public IOException exception;
    private final AbstractUnpacker u;
    private final Unconverter uc;

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        if (this.uc.result != null) {
            return true;
        }
        try {
            this.u.readValue(this.uc);
            if (this.uc.result != null) {
                return true;
            }
            return false;
        } catch (EOFException unused) {
            return false;
        } catch (IOException e2) {
            this.exception = e2;
            return false;
        }
    }

    public Value next() {
        if (hasNext()) {
            Value value = this.uc.result;
            this.uc.resetResult();
            return value;
        }
        throw new NoSuchElementException();
    }

    public UnpackerIterator(AbstractUnpacker abstractUnpacker) {
        this.u = abstractUnpacker;
        this.uc = new Unconverter(abstractUnpacker.msgpack);
    }
}
