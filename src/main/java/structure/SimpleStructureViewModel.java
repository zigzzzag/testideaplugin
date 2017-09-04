package structure;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import psi.SimpleFile;

public class SimpleStructureViewModel extends StructureViewModelBase
        implements StructureViewModel.ElementInfoProvider {

    public SimpleStructureViewModel(@NotNull PsiFile psiFile) {
        super(psiFile, new SimpleStructureViewElement(psiFile));
    }

    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return element instanceof SimpleFile;
    }
}
