import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiReference;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.searches.ReferencesSearch;
import com.intellij.util.Query;

import java.util.Calendar;

public class ClickAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
//        Editor editor = e.getData(PlatformDataKeys.EDITOR);
//        Project project = e.getProject();
//        if (editor == null || project == null) {
//            return;
//        }
//        Document document = editor.getDocument();
//
//        CaretModel caretModel = editor.getCaretModel();
//        int offset = caretModel.getOffset();
//
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                document.insertString(offset, getContent());
//            }
//        };
//
//        //加入任务，由IDEA调度执行这个任务
//        WriteCommandAction.runWriteCommandAction(project, runnable);
        // 获取当前编辑的文件, 通过PsiFile可获得PsiClass, PsiField等对象
        PsiFile psiFile = e.getData(LangDataKeys.PSI_FILE);

// 获取当前的project对象
        Project project = e.getProject();

// 获取数据上下文
        DataContext dataContext = e.getDataContext();

    }

    /**
     *  获取添加的文本
     * @return
     */
    private String getContent() {
        return "?ver=" + Calendar.getInstance().getTimeInMillis();
    }
}
