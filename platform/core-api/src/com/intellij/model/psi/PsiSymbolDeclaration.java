// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.model.psi;

import com.intellij.model.SymbolDeclaration;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface PsiSymbolDeclaration extends SymbolDeclaration {

  /**
   * @return underlying (declaring) element
   */
  @NotNull
  PsiElement getDeclaringElement();

  /**
   * @return range relative to {@link #getDeclaringElement() element} range,
   * which is considered a declaration, e.g. range of identifier in Java class
   */
  @NotNull
  TextRange getDeclarationRange();
}
