/*
 * Copyright (c) 2012, NTT Multimedia Communications Laboratories, Inc. and Koushik Sen
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package tests;

/**
 * @author Jacob Burnim <jburnim@cs.berkeley.edu>
 */
public class ExceptionTest1 {

    public static int count;

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    public static int A(Integer x, int y) {
        int dividend = x.intValue();
        int divisor = y;
        return divide(dividend, divisor);
    }

    public static int B(int flag, Integer y, int z) {
        Object obj = null;

        if (flag == 1) {
            try {
                A(y, z);
            } catch (ArithmeticException ex) {
                obj = ex;
            } finally {
                count++;
            }

        } else {
            try {
                A(y, z);
            } catch (NullPointerException ex) {
                obj = ex;
            } finally {
                count++;
            }
        }

        return 42;
    }

    public static void main(String args[]) {
        // No exceptions.
        B(1, new Integer(10), 5);
        B(1, new Integer(19), 0);
        B(0, null, 0);

        try {
            // Throws NullPointerException.
            B(1, null, 0);
        } catch (Exception e) {
            // Pass.
        }

        // Throws ArithmeticException.
        B(0, new Integer(1337), 0);
    }
}
