package com.github.colinjoe.autocodeplugin.services

import com.github.colinjoe.autocodeplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
