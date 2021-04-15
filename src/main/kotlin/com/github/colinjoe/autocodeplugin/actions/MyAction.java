package com.github.colinjoe.autocodeplugin.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * @author colinjoe
 */
public class MyAction extends AnAction {
    /**
     * 如果通过Java代码来注册，这个构造函数会被调用，传给父类的字符串会被作为菜单项的名称
     * 如果你通过plugin.xml来注册，可以忽略这个构造函数
     */
    public MyAction() {
        // 设置菜单项名称
        super("AutoCode");
        // 还可以设置菜单项名称，描述，图标wz
        // 还可以设置菜单项名称，描述，图标
//        super("AutoCode","Item description", IconLoader.getIcon("/Mypackage/icon.png"));
    }

    @Override
    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        String txt= Messages.showInputDialog(project, "What is your name?", "Input Your Name", Messages.getQuestionIcon());
        Messages.showMessageDialog(project, "Hello, " + txt + "!\n I am glad to see you.", "Information", Messages.getInformationIcon());
    }
}
