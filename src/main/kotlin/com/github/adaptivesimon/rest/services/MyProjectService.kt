package com.github.adaptivesimon.rest.services

import com.github.adaptivesimon.rest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
