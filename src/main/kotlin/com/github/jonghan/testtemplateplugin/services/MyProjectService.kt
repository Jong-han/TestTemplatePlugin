package com.github.jonghan.testtemplateplugin.services

import com.intellij.openapi.project.Project
import com.github.jonghan.testtemplateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
