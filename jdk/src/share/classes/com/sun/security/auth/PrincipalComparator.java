/*
 * Copyright 1999-2000 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package com.sun.security.auth;

/**
 * An object that implements the <code>java.security.Principal</code>
 * interface typically also implements this interface to provide
 * a means for comparing that object to a specified <code>Subject</code>.
 *
 * <p> The comparison is achieved via the <code>implies</code> method.
 * The implementation of the <code>implies</code> method determines
 * whether this object "implies" the specified <code>Subject</code>.
 * One example application of this method may be for
 * a "group" object to imply a particular <code>Subject</code>
 * if that <code>Subject</code> belongs to the group.
 * Another example application of this method would be for
 * "role" object to imply a particular <code>Subject</code>
 * if that <code>Subject</code> is currently acting in that role.
 *
 * <p> Although classes that implement this interface typically
 * also implement the <code>java.security.Principal</code> interface,
 * it is not required.  In other words, classes may implement the
 * <code>java.security.Principal</code> interface by itself,
 * the <code>PrincipalComparator</code> interface by itself,
 * or both at the same time.
 *
 * @see java.security.Principal
 * @see javax.security.auth.Subject
 */
public interface PrincipalComparator {
    /**
     * Check if the specified <code>Subject</code> is implied by
     * this object.
     *
     * <p>
     *
     * @return true if the specified <code>Subject</code> is implied by
     *          this object, or false otherwise.
     */
    boolean implies(javax.security.auth.Subject subject);
}
