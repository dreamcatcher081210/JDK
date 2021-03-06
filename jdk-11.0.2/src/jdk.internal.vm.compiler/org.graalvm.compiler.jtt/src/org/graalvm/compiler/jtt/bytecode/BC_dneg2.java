/*
 * Copyright (c) 2011, 2012, Oracle and/or its affiliates. All rights reserved.
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
 */


package org.graalvm.compiler.jtt.bytecode;

import org.junit.Test;

import org.graalvm.compiler.jtt.JTTTest;

/*
 */
public class BC_dneg2 extends JTTTest {

    public static double test(double a) {
        return 1 / (-a);
    }

    @Test
    public void run0() throws Throwable {
        runTest("test", -0.0d);
    }

    @Test
    public void run1() throws Throwable {
        runTest("test", 0.0d);
    }

}
