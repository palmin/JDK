/*
 * Copyright (c) 1995, 2001, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package org.omg.CORBA;

import org.omg.CORBA.portable.Streamable;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;


/**
 * The Holder for {@code Float}. For more information on
 * Holder files, see <a href="doc-files/generatedfiles.html#holder">
 * "Generated Files: Holder Files"</a>.<P>
 * A Holder class for a {@code float}
 * that is used to store "out" and "inout" parameters in IDL methods.
 * If an IDL method signature has an IDL {@code float} as an "out"
 * or "inout" parameter, the programmer must pass an instance of
 * {@code FloatHolder} as the corresponding
 * parameter in the method invocation; for "inout" parameters, the programmer
 * must also fill the "in" value to be sent to the server.
 * Before the method invocation returns, the ORB will fill in the
 * value corresponding to the "out" value returned from the server.
 * <P>
 * If {@code myFloatHolder} is an instance of {@code FloatHolder},
 * the value stored in its {@code value} field can be accessed with
 * {@code myFloatHolder.value}.
 *
 * @since       JDK1.2
 */
public final class FloatHolder implements Streamable {
    /**
     * The {@code float} value held by this {@code FloatHolder}
     * object.
     */
    public float value;

    /**
     * Constructs a new {@code FloatHolder} object with its
     * {@code value} field initialized to 0.0.
     */
    public FloatHolder() {
    }

    /**
     * Constructs a new {@code FloatHolder} object for the given
     * {@code float}.
     * @param initial the {@code float} with which to initialize
     *                the {@code value} field of the new
     *                {@code FloatHolder} object
     */
    public FloatHolder(float initial) {
        value = initial;
    }

    /**
     * Read a float from an input stream and initialize the value
     * member with the float value.
     *
     * @param input the {@code InputStream} to read from.
     */
    public void _read(InputStream input) {
        value = input.read_float();
    }

    /**
     * Write the float value into an output stream.
     *
     * @param output the {@code OutputStream} to write into.
     */
    public void _write(OutputStream output) {
        output.write_float(value);
    }

    /**
     * Return the {@code TypeCode} of this Streamable.
     *
     * @return the {@code TypeCode} object.
     */
    public org.omg.CORBA.TypeCode _type() {
        return ORB.init().get_primitive_tc(TCKind.tk_float);
    }
}
