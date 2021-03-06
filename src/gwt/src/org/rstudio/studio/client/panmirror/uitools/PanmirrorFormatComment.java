/*
 * PanmirrorFormatComment.java
 *
 * Copyright (C) 2009-20 by RStudio, PBC
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */

package org.rstudio.studio.client.panmirror.uitools;

import org.rstudio.core.client.StringUtil;

import jsinterop.annotations.JsType;

@JsType
public class PanmirrorFormatComment
{
   public String mode;
   public String extensions;
   public double fillColumn;
   public String[] doctypes;
   
   public static boolean areEqual(PanmirrorFormatComment a, PanmirrorFormatComment b)
   {
      String aDoctypes = a.doctypes != null ? String.join(",", a.doctypes) : "";
      String bDoctypes = b.doctypes != null ? String.join(",", b.doctypes) : "";
      
      return StringUtil.equals(a.mode, b.mode) &&
             StringUtil.equals(a.extensions, b.extensions) &&
             a.fillColumn == b.fillColumn &&
             aDoctypes == bDoctypes;         
   }
}

