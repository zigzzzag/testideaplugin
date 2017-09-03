package psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class SimpleProperty extends ASTWrapperPsiElement {

    public SimpleProperty(@NotNull ASTNode node) {
        super(node);
    }
}
